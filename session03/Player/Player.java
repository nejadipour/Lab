// Java program to play an Audio 
// file using Clip Object 
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Player
{
    // to store current position
    long currentFrame;
    Clip clip;
    private String playerMenu;

    // current status of clip
    String status;

    AudioInputStream audioInputStream;
    private String filePath;

    // constructor to initialize streams and clip
    public Player(String filePath)
            throws UnsupportedAudioFileException,
            IOException, LineUnavailableException
    {
        playerMenu =
                "1.pause\n" +
                "2.resume\n" +
                "3.stop\n";

        this.filePath = filePath;

        // create AudioInputStream object
        audioInputStream =
                AudioSystem.getAudioInputStream(new File(filePath).getAbsoluteFile());

        // create clip reference
        clip = AudioSystem.getClip();

        // open audioInputStream to the clip
        clip.open(audioInputStream);

        clip.loop(Clip.LOOP_CONTINUOUSLY);

    }


    public static void startPlay(String filePath)
    {
        try
        {
            Player audioPlayer = new Player(filePath);

            audioPlayer.play();

            Scanner sc = new Scanner(System.in);

            while (true)
            {
                audioPlayer.printPlayerMenu();

                int c = sc.nextInt();
                audioPlayer.gotoChoice(c);
                if (c == 3)
                    break;
            }
            sc.close();
        }

        catch (Exception ex)
        {
            System.out.println("Error with playing sound.");
            ex.printStackTrace();

        }

    }

    private void printPlayerMenu()
    {
        System.out.println(playerMenu);

    }

    // Work as the user enters his choice

    private void gotoChoice(int c)
            throws IOException, LineUnavailableException, UnsupportedAudioFileException
    {
        switch (c)
        {
            case 1:
                pause();
                break;

            case 2:
                resumeAudio();
                break;

            case 3:
                break;

            default:
            {
                System.out.println("Invalid input.");

            }

        }

    }

    // Method to play the audio
    public void play()
    {
        //start the clip
        clip.start();

        status = "play";
    }

    // Method to pause the audio
    public void pause()
    {
        if (status.equals("paused"))
        {
            System.out.println("audio is already paused");
            return;
        }

        this.currentFrame = clip.getMicrosecondPosition();
        this.clip.setMicrosecondPosition(clip.getMicrosecondPosition());

        clip.stop();
        status = "paused";

    }

    // Method to resume the audio
    public void resumeAudio()
    {
        if (status.equals("play"))
        {
            System.out.println("Audio is already being played");
            return;
        }

        this.play();
    }

}
