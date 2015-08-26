/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BPL;

import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import org.apache.log4j.Logger;



/**
 *
 * @author hp
 */
public class MusicPlayer {
    
    final private Logger logger = Logger.getLogger(MusicPlayer.class);

    public void playRecord() {

        try {
            File filename = new File("recos/RecordedAudio.wav");
            
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(filename.getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
            ex.printStackTrace();
            logger.error("Exception while playing the record...", ex);
        }
    }

}
