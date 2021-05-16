package Object;

import javax.xml.crypto.Data;
import java.io.*;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * simple notes program to store notes
 * add, remove and see your notes
 * @author Alireza Nejadipour
 * @version 1.5
 */

public class Notes
{
    private final ArrayList<Note> notes;
    private final ArrayList<String> titles;
    private final Path dataPath;
    private final Scanner scanner;
    private final String boldStart;
    private final String boldEnd;
    private final String menu;
    private int choice;


    /**
     * create a new program
     */
    public Notes()
    {
        this.notes = new ArrayList<Note>();
        this.titles = new ArrayList<>();
        this.dataPath = Paths.get(".\\src\\Object\\data");
        this.scanner = new Scanner(System.in).useDelimiter("\n");
        this.boldStart = "\033[0;1m";
        this.boldEnd = "\u001B[0m";

        this.menu =
                """
                      1.my notes
                      2.add note
                      3.remove note""";

    }


    /**
     * the method gets command from user
     */
    public void userChoice()
    {
        System.out.print("\nYour choice : ");
        choice = scanner.nextInt();

    }


    /**
     * method is used to add new note
     * @throws IOException for time exception error happens
     */
    public void addNote() throws IOException
    {
        System.out.println("Enter the title : ");
        String title = scanner.next();
        System.out.println("Enter your note : ");
        System.out.println("when it is finished enter \"end\"");
        StringBuilder newNote = new StringBuilder();

        String newLine = scanner.next();

        while (!newLine.equals("end"))
        {
            newNote.append(newLine);
            newNote.append("\n");
            newLine = scanner.next();

        }

        Note note = new Note(title, newNote.toString(), new Date());

        File f = new File(dataPath + "\\" + title + ".txt");
        FileOutputStream fos = new FileOutputStream(f);
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(note);

        oos.close();
        fos.close();

    }


    /**
     * method is used to remove a note
     * @param index the index of the note in list
     */
    public void removeNote(int index)
    {
        String title = titles.get(index);

        File file = new File(dataPath + "\\" + title + ".txt");

        if(file.delete())
        {
            System.out.println("File deleted successfully");
            notes.removeIf(note -> note.getTitle().equals(title));
            titles.remove(title);

        }

        else
            System.out.println("Failed to delete the file");

    }


    /**
     * gets name of the file and prints it
     * @param name the name of the file
     * @throws IOException for time exception error happens
     */
    public void printNote(String name) throws IOException, ClassNotFoundException
    {
        Note note;
        File f = new File(dataPath + "\\" + name + ".txt");

        FileInputStream fis = new FileInputStream(f);
        ObjectInputStream ois = new ObjectInputStream(fis);

        note = (Note) ois.readObject();

        ois.close();
        fis.close();

        System.out.println(note.getDate());
        System.out.println(note.getText());

        System.out.println();

    }


    /**
     * gets all names of files in data folder
     * @throws IOException for time exception error happens
     */
    public void makeList() throws IOException
    {
        DirectoryStream<Path> directoryStream = Files.newDirectoryStream(dataPath);

        String title;

        for (Path p : directoryStream)
        {
            title = p.getFileName().toString().replace(".txt", "");

            if (!titles.contains(title))
                titles.add(title);

        }

    }


    /**
     * prints names of files in the data folder
     * with the first line
     * @return false if folder is empty
     */
    public boolean printList()
    {
        if (titles.isEmpty())
        {
            System.out.println("You don't have any notes yet:(");
            return false;

        }
        else
        {
            for (int noteNum = 0 ; noteNum < titles.size() ; noteNum++)
            {
                System.out.println(boldStart + (noteNum + 1) + ") " + titles.get(noteNum) + boldEnd); // prints the name of note in bold
                System.out.println();

            }

            return true;

        }

    }


    /**
     * for getting user commands
     * @throws IOException for time exception error happens
     */
    public void handle() throws IOException, ClassNotFoundException
    {
        System.out.println(menu);
        userChoice();

        switch (choice)
        {
            case 1 ->
                    {
                        makeList();
                        if (printList())
                        {
                            userChoice();
                            printNote(titles.get(choice - 1));

                        }

                    }
            case 2 -> addNote();
            case 3->
                    {
                        makeList();
                        if (printList())
                        {
                            userChoice();
                            removeNote(choice - 1);

                        }

                    }

            default -> System.out.println("Invalid input.");

        }

        handle();

    }


    public static void main(String[] args) throws IOException, ClassNotFoundException
    {
        Notes notes = new Notes();

        notes.handle();

    }

}
