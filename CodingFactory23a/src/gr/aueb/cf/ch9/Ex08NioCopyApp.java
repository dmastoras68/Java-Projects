package gr.aueb.cf.ch9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ex08NioCopyApp {
    public static void main(String[] args) {
        byte[] videoBytes;
        Path sourcePath = Paths.get("C:/tmp/me.png");
        Path targetpath = Paths.get("C:/tmp/me2.png");

        try{
            videoBytes = Files.readAllBytes(sourcePath);
            Files.write(targetpath, videoBytes);
        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
