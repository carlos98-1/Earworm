package org.example;
import java.io.File;

public class Main {

    public static void main(String[] args) throws Exception {
        File file = new File("audio/test.wav");

        System.out.println("Sample rate: " + AudioInfo.getSampleRate(file) + " Hz");
        System.out.println("Channels: " + AudioInfo.getChannels(file));
        System.out.println("Frames: " + AudioInfo.getFrames(file));
//          frames is one measurement across all channels (stereo has two channels, left and right, but still one frame per moment in time
        System.out.println("Length: " + AudioInfo.getLengthInSeconds(file) + (" seconds"));
    }
}
