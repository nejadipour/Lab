import java.util.ArrayList;
import java.util.Iterator;

/**
 * A class to hold details of audio files.
 *
 * @author Alireza Nejadipour
 * @version 2021.Mar.13
 */

public class MusicCollection
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<Music> files;
    // A player for the music files.
    private MusicPlayer player;

    /**
     * Create a MusicCollection
     */
    public MusicCollection()
    {


    }

    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(Music filename)
    {

    }

    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }

    /**
     * List a file from the collection.
     * @param genre The index of the file to be listed.
     */
    public void listFile(String genre)
    {
        int index = 0;

        while (index < files.size())
        {
            String currentGenre = files.get(index).getGenre();

            if (currentGenre.contains(genre))
            {
                files.get(index).print();
                break;
            }
            else
            {
                index++;
            }

        }

    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFiles()
    {
        for(Music file : files)
        {
            file.print();
            System.out.println("__________________________");
        }

    }

    /**
     * Remove a file from the collection.
     * @param name The index of the file to be removed.
     */
    public void removeFile(String name)
    {
        Iterator<Music> it = files.iterator();
        while(it.hasNext())
        {
            Music music = it.next();
            if(name.contains(music.getName()))
            {
                it.remove();
            }
        }

    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {

    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {

    }


    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
//    private boolean validIndex(int index)
//    {
//        // The return value.
//        // Set according to whether the index is valid or not.
//
//    }
}
