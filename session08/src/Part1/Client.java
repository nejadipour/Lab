package Part1;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * client tasks are handled here
 * @author Alireza Nejadipour
 * @version 3.6
 */

public class Client
{
    /**
     * create a new client and connect it to the server
     */
    public void connect()
    {
        Scanner scanner = new Scanner(System.in);
        try (Socket client = new Socket("127.0.0.1", 8080))
        {
            System.out.println("Connected to server.");

            OutputStream out = client.getOutputStream();
            InputStream in = client.getInputStream();
            byte[] buffer = new byte[5000];

            String message;
            String response;

            while (true)
            {
                do
                {
                    message = scanner.nextLine();
                    out.write(message.getBytes());
                    int read = in.read(buffer);
                    System.out.println("SENT : " + message);

                    response = new String(buffer, 0, read);

                    System.out.println("RECV : " + response);

                    if (response.equals("finished"))
                    {
                        System.out.println("All messages sent!\nClosing...");

                        in.close();
                        out.close();
                        client.close();
                        System.exit(0);

                    }

                } while (client.getInputStream().available() > 0);

            }

        }
        catch (IOException ex)
        {
            System.err.println(ex.toString());
        }

    }

    public static void main(String[] args)
    {
        Client client = new Client();
        client.connect();

    }

}
