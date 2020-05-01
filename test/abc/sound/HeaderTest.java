package abc.sound;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.HashMap;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test for Music Header Abstract Data Type
 */
public class HeaderTest {

	private final Header header = 
			new Header(1, "test1", "unknown", 0.125, "4/4", 0.125, 100, "Eb", new ArrayList<>());
	private final Header header2 = 
			new Header(2, "test2", "unknown", 0.125, "4/4", 0.25, 140, "C", 
					new ArrayList<>(Arrays.asList("violin", "piano")));
	
    @Test(expected=AssertionError.class)
    public void testAssertionsEnabled() {
        assert false; // make sure assertions are enabled with VM argument: -ea
    }
    
    // Testing Strategy:
    // Observer methods: one test for getKeySig(), getDefaultDuration(), getBeatsPerMinute()
    //					 getVoices, toString()
    // equals and hashCode: two header are equal / not equals
    // addVoices(): no voice field in header, voice field in header (duplicate)
    // parseHeader: 
    //		header contains only mandatory fields / contains mandatory and optional fields 
    //		check defaults for optional fields (composer, meter, note duration, tempo)
    //		default for note duration: 1/8 for M >= 0.75, 1/16 otherwise
    //		ignore spaces between tokens
    //		long text (with spaces/special characters)
    //		meter: special meter ('C', 'C|'), fraction
    //		voices: 0, n
    //		key signature: major/minor, sharp/flat
    //		catches invalid input: missing or incorrect ordering of mandatory fields
    
    @Test
    public void TestGetKeySig() {
    	Map <String, Integer> keySig = new HashMap<>();
		keySig.put("B", -1);
		keySig.put("E", -1);
		keySig.put("A", -1);
    	assertEquals("return a mapping to notes to its associated sharp or flat", 
    			header.getKeySig(), keySig);
    }
    
    @Test
    public void TestGetDefaultDuration() {
    	assertEquals("default duration", header.getDefaultDuration(), 24);
    }
    
    @Test
    public void TestGetBeatsPerMinute() {
    	assertEquals("beats per minute", header.getBeatsPerMinute(), 100);
    }

    @Test
    public void TestGetTicksPerBeat() {
    	assertEquals("number of ticks per beat", header.getTicksPerBeat(), 24);
    }
    
    @Test
    public void TestGetVoices() {
    	assertTrue("no voice field in header", header.getVoices().isEmpty());
    }
    
    @Test
    public void TestAddVoicesNotSpecifiedInHeader() {
    	List<String> labels = new ArrayList<>(Arrays.asList("violin", "piano"));
    	header.addVoices(labels);
    	assertEquals("voice labels added", header.getVoices(), labels);
    }
    
    @Test
    public void TestAddVoicesSpecifiedInHeader() {
    	List<String> labels = new ArrayList<>(Arrays.asList("violin", "piano"));
    	assertEquals("header contain a list of voices", header2.getVoices(), labels);
    	header2.addVoices(labels);
    	assertEquals("voices does not change", header2.getVoices(), labels);
    }
    
    @Test
    public void TestHeaderToString() {
    	String headerString = "Index: 1\n" + "Title: test1\n" + "Author: unknown\n" + 
    			"Default Note Value: 24 ticks\n" + "Meter: 4/4\n" + 
    			"Tempo: 24 ticks per beat, 100 beats per minute\n" + 
    			"Voices: \n" + "Key Signature: Eb\n";
    	assertEquals("matches header string output", header.toString(), headerString);
    }
    
    @Test
    public void TestHeaderEquality() {
    	assertTrue("different headers", ! header.equals(header2));
    	assertTrue("different hash codes", header.hashCode() != header2.hashCode());
    	Header sameheader = 
    			new Header(1, "test1", "unknown", 0.125, "4/4", 0.125, 100, "Eb", new ArrayList<>());
    	assertTrue("same headers", header.equals(sameheader));
    	assertTrue("same hash codes", header.hashCode() == sameheader.hashCode());
    }
    
    // specifies only mandatory fields
    // default for note length: 1/8
    // ignore spaces b/w tokens
    @Test 
    public void TestParseOnlyMandatoryHeader() {
    	String headerString = "Index: 1\n" + "Title: test\n" + "Author: unknown\n" + 
    			"Default Note Value: 24 ticks\n" + "Meter: 4/4\n" + 
    			"Tempo: 24 ticks per beat, 100 beats per minute\n" + 
    			"Voices: \n" + "Key Signature: C\n";
    	assertEquals(Header.parseHeader("X:  1 \n" + "T:test\n" + "K:C\n").toString(), 
    			headerString);
    }
    
    // specifies mandatory fields and some optional fields
    // meter: fraction
    // default for note length: 1/16
    // key: sharp minor
    // multiple voices: number label
    @Test 
  	public void TestParseMandatoryAndOptionalHeaderMultipleVoices() {
//    	String headerString = "Index: 2020\n" + "Title: test\n" + "Author: anonymous\n" + 	
//    			"Default Note Value: 12 ticks\n" + "Meter: 3/8\n" + 
//    			"Tempo: 48 ticks per beat, 200 beats per minute\n" + 
//    			"Voices: 1, 2\n" + "Key Signature: F#m\n";
//    	assertEquals(Header.parseHeader("X:2020\n" + "T:test\n" + "C:anonymous\n" +
//				 "Q:1/4=200\n" + "M:3/8\n" + "V:1\n" + "V:2\n" + "K:F#m\n").toString(), headerString);
    }
    
    // specifies all mandatory and optional fields
    // long text (spaces, special char)
    // meter: special meter
    @Test 
    public void TestParseMandatoryAndOptionalHeaderLongText() {
    	String headerString = "Index: 1\n" + "Title: Little Night Music Mvt. 1\n" + 
    			"Author: Wolfgang Amadeus Mozart\n" + 
    			"Default Note Value: 24 ticks\n" + "Meter: 2/2\n" + 
    			"Tempo: 48 ticks per beat, 140 beats per minute\n" + 
    			"Voices: \n" + "Key Signature: G\n";
    	assertEquals(Header.parseHeader("X:1\n" + "T:Little Night Music Mvt. 1\n" +
				"C:Wolfgang Amadeus Mozart\n" + "Q:1/4=140\n" + "M:C|\n" + "L:1/8\n" +
    			"K:G\n").toString(), headerString);
    }
    
    @Test (expected=IllegalArgumentException.class)
    public void TestParseIncorrectOrderOfMandatoryFields() {
    	Header.parseHeader("T:test\n" + "X:1\n" + "K:C\n");
    }
    
    @Test (expected=IllegalArgumentException.class)
    public void TestParseLackMandatoryFields() {
    	Header.parseHeader("T:test\n" + "K:C\n");
    }    
    
}
