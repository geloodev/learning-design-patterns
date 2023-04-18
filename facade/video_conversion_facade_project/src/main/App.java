package main;

import java.io.File;
import main.facade.*;

public class App {
    public static void main(String[] args) throws Exception {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        mp4Video.getName();
    }
}
