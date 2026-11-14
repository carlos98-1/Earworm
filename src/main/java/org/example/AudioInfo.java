package org.example;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import java.io.File;

public class AudioInfo {
    public static float getSampleRate(File file) throws Exception {
        try (AudioInputStream stream = AudioSystem.getAudioInputStream(file)){
            // this opens the file as a stream of audio data, and since it's build into java we dont need to do much
            AudioFormat format = stream.getFormat();
            return format.getSampleRate();
        }
    }
    public static double getLengthInSeconds(File file) throws Exception {
        try (AudioInputStream stream = AudioSystem.getAudioInputStream(file)) {
            AudioFormat format = stream.getFormat();
            float sampleRate = format.getSampleRate();
            float frames = stream.getFrameLength();
            return frames / sampleRate;
        }
    }
    public static int getChannels(File file) throws Exception {
        try(AudioInputStream stream = AudioSystem.getAudioInputStream(file)) {
            AudioFormat format = stream.getFormat();
            return format.getChannels() ;

        }
    }
    public static long getFrames(File file) throws Exception {
        try(AudioInputStream stream = AudioSystem.getAudioInputStream(file)) {
            return stream.getFrameLength();
// getFrames has no format line because the frame count comes straight from the stream, so the format isn't needed
        }
    }
}