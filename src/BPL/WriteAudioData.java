/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BPL;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author hp
 */
public class WriteAudioData {
    
    
    
    SoundRecorder recorder = new SoundRecorder();
    
    byte data[] = new byte[recorder.line.getBufferSize()];
//    String filename = getTempFilename();
//    FileOutputStream os = null;
//
//    
//        try {
//                os = new FileOutputStream(filename);
//    }
//    catch (FileNotFoundException e) {
//                // TODO Auto-generated catch block
//                e.printStackTrace();
//    }
//
//    int read = 0;
//    if(null != os){
//                while (isRecording) {
//            read = recorder.read(data, 0, bufferSize);
//            if (read > 0) {
//                absNormalizedSignal = calculateFFT(data); // --> HERE ^__^
//            }
//
//            if (AudioRecord.ERROR_INVALID_OPERATION != read) {
//                try {
//                    os.write(data);
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//
//        try {
//            os.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

}
