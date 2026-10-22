package org.example;

import javax.sound.sampled.AudioFormat;
// this describes how the audio is stored
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        File file = new File("audio/test.wav");

        try (AudioInputStream stream = AudioSystem.getAudioInputStream(file)) {
//            this opens the file as a stream of audio data, and since it's build into java we dont need to do much
            AudioFormat format = stream.getFormat();

            float sampleRate = format.getSampleRate();
            int channels = format.getChannels();
            long frames = stream.getFrameLength();
            double seconds = frames / sampleRate;

            System.out.println("Sample rate: " + sampleRate + " Hz");
            System.out.println("Channels: " + channels);
            System.out.println("Frames: " + frames);
//          frames is one measurement across all channels (stereo has two channels, left and right, but still one frame per moment in time
            System.out.println("Length: " + seconds + (" seconds"));
        }
    }

}
