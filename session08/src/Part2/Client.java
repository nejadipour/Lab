package Part2;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.rmi.ConnectException;
import java.util.Scanner;

/**
 * client class that connects client to server
 * @author Alireza Nejadipour
 * @version 2
 */

public class Client
{
    /**
     * starts client to connect server
     * @param ip_addr ip address
     * @param port port to connect
     */
    public void startClient(String ip_addr, int port)
    {
        try (Socket connection = new Socket (ip_addr, port);
             DataInputStream in = new DataInputStream (connection.getInputStream ());
             DataOutputStream out = new DataOutputStream (connection.getOutputStream ())) {

            Scanner scanner = new Scanner (System.in);
            System.out.println ("connected to Server");
            while (true)
            {
                System.out.print ("enter anything : ");
                String input = scanner.nextLine ().toLowerCase ().trim ();

                out.writeUTF (input);

                System.out.println (in.readUTF ());

                if (input.equals ("finished"))
                {
                    break;
                }
            }

        } catch (IllegalArgumentException e) {
            System.err.println ("client couldn't start");
        } catch (ConnectException e) {
            System.err.println ("Couldn't connect to Server");
        } catch (SocketException e) {
            System.err.println ("Server Not Responding");
        } catch (IOException e) {
            System.err.println ("there was a problem related to I/O");
        }
    }


    public static void main(String[] args)
    {
        Client client = new Client();
        client.startClient("127.0.0.1", 8080);
    }

}
