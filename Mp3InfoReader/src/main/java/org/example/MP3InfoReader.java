package org.example;
import com.mpatric.mp3agic.*;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MP3InfoReader
{
    public static String getArtist(Path path){
        try {
            Mp3File mp3File = new Mp3File(path);
            ID3v2 id3v2Tag = mp3File.getId3v2Tag();
            return id3v2Tag !=null ? id3v2Tag.getAlbumArtist() : null;
        } catch (IOException | UnsupportedTagException | InvalidDataException e){
            return null;
        }
    }
    public static void main( String[] args )
    {
        System.out.println( "Album Artist: " + getArtist(Paths.get("./test.mp3")));

    }
}
