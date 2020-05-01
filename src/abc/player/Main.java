package abc.player;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.List;
import javax.sound.midi.InvalidMidiDataException;
import javax.sound.midi.MidiUnavailableException;


import abc.sound.Header;
import abc.sound.Music;
import abc.sound.SequencePlayer;

/**
 * Main entry point of your application.
 */
public class Main {

    /**
     * Plays the input file using Java MIDI API and displays
     * header information to the standard output stream.
     * 
     * (Your code should not exit the application abnormally using
     * System.exit().)
     * 
     * @param file the name of input abc file
     */
    public static void play(String file) throws IOException, InvalidMidiDataException, 
    MidiUnavailableException, InterruptedException {
        // YOUR CODE HERE
    	String line;
    	final StringBuilder headerString = new StringBuilder();
    	final StringBuilder musicString = new StringBuilder();
    	boolean switchToMusic = false;
    	try (final BufferedReader in = new BufferedReader(new FileReader(file))) {
        	while ((line = in.readLine()) != null) {
        		if (! switchToMusic) {
        			headerString.append(line + "\n");
        			if (line.startsWith("K:")) switchToMusic = true;
        		} else {
        			musicString.append(line + "\n");
        		}
        	}
    	}
    	final Header header = Header.parseHeader(headerString.toString());
    	final int duration = header.getDefaultDuration();
    	final Map<String, Integer> key = header.getKeySig();
    	final List<String> voices = header.getVoices();
    	final Music music = Music.parseMusic(musicString.toString(), duration, key, voices);
    	final int bpm = header.getBeatsPerMinute();
    	final int ticksPerBeat = header.getTicksPerBeat();
    	SequencePlayer player = new SequencePlayer(bpm, ticksPerBeat);
    	music.play(player, 0);
    	Thread.sleep(10000);
    	System.exit(0);    	
    }

    public static void main(String[] args) {
        // CALL play() HERE USING ARGS
    	try {
    		play("sample_abc/fur_elise.abc");
    	} catch (IOException ioe) {
    		ioe.printStackTrace(); 
    	} catch (InvalidMidiDataException imde) {
    		imde.printStackTrace();
    	} catch(MidiUnavailableException mue) {
    		mue.printStackTrace();
    	} catch (InterruptedException ie) {
    		ie.printStackTrace();
    	}
    }
}
