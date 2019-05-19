package src;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class PlayMusic {
    static void playMusic(String file){
        AudioPlayer MAP = AudioPlayer.player;
        AudioStream MAS;
        try{
            InputStream test = new FileInputStream(file);
            MAS = new AudioStream(test);
            AudioPlayer.player.start(MAS);
        }catch (IOException e){

        }
        MAP.start(null);
    }
}
