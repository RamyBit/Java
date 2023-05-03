package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.nio.file.Paths;

/**
 * Unit test for simple App.
 */
public class Mp3InfoReaderTest

{
    @Test
    void getArtist_shouldBe_Test(){
        String artist = MP3InfoReader.getArtist(Paths.get("./test.mp3"));
        Assertions.assertEquals("test", artist);
    }
}
