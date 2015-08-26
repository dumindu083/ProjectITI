/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BPL;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioFileFormat;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.TargetDataLine;

import javax.swing.JButton;
import javax.swing.JTextField;
import org.apache.log4j.Logger;


/**
 *
 * @author hp
 */
public class SoundRecorder {
    // record duration, in milliseconds
    static final long RECORD_TIME = 5000;
    
    final static private Logger logger = Logger.getLogger(SoundRecorder.class);

    //Creation of file
    File wavFile = new File("recos/RecordedAudio.wav");

    // format of audio file
    AudioFileFormat.Type fileType = AudioFileFormat.Type.WAVE;

    // the line from which audio data is captured
    TargetDataLine line;

    /**
     * Defines an audio format
     */
    AudioFormat getAudioFormat() {
        float sampleRate = 44100; //keep this limited to 44100Hz as per the need
        int sampleSizeInBits = 8;
        int channels = 1;
        boolean signed = true;
        boolean bigEndian = true;
        AudioFormat format = new AudioFormat(sampleRate, sampleSizeInBits,
                channels, signed, bigEndian);
        return format;

    }

    /**
     *
     * @param textField TextField you need to display the status of recording
     */
    public void start(JTextField textField) {

        try {
            AudioFormat format = getAudioFormat();

            DataLine.Info info = new DataLine.Info(TargetDataLine.class, format);

            // checks if system supports the data line
            if (!AudioSystem.isLineSupported(info)) {
                System.err.println("Line not supported");
                System.exit(0);
            }
            line = (TargetDataLine) AudioSystem.getLine(info); //where the exception jumps up
            line.open(format);
            line.start(); //start capturing
            System.out.println("Start Capturing...");
            
            AudioInputStream ais = new AudioInputStream(line);

//            textField.setText("Recording...");
            System.out.println("Recording...");

//            if (wavFile.exists()) {
//                wavFile.createNewFile();
//                wavFile.renameTo(wavFile);
//                
//            }
            AudioSystem.write(ais, fileType, wavFile);

        } catch (LineUnavailableException | IOException ex) {
            logger.error("Error in Sound capturing or file creation \n"+ex.getMessage(), ex);
        }

    }
    
    /**
     * Closes the target data line to finish capturing and recording
     */
    public void finish(JButton playButton, JButton confirmButton) {
        line.stop();
        line.close();
        playButton.setEnabled(true);
        confirmButton.setEnabled(true);

    }

    /**
     * Entry to run the program
     */
    public static void main(String[] args) {

        final SoundRecorder recorder = new SoundRecorder();

        // creates a new thread that waits for a specified
        // of time before stopping
        Thread stopper = new Thread(new Runnable() {

            @Override
            public void run() {
                try {
                    Thread.sleep(RECORD_TIME);
                } catch (InterruptedException ex) {
                    logger.error("InterruptedException in Recording thread", ex);
                }
//                recorder.finish();
            }
        });

//        stopper.start();

        // start recording
//        recorder.start();

    }
    
    
}
