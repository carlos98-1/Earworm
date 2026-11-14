package org.example;

import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AudioInfoTest {

    @Test
    void sampleRateIs44100() throws Exception {
        File file = new File("audio/test.wav");
        float rate = AudioInfo.getSampleRate(file);
        assertEquals(44100.0f, rate);
    }
    @Test
    void lengthIsAbout20Seconds() throws Exception {
        File file = new File("audio/test.wav");
         double length = AudioInfo.getLengthInSeconds(file);
        assertEquals(20.33, length, 0.01);
    }
}