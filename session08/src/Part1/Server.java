package Part1;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * tasks related to the server are handled here
 * @author Alireza Nejadipour
 * @version 4.4
 */

public class Server
{
    /**
     * create a new server that will accept clients
     * @throws IOException if exception happens
     */
    public void start() throws IOException {
        try(ServerSocket welcomingSocket = new ServerSocket(8080))
        {
            System.out.println("Server started.\nWaiting for a client...");
            try(Socket connectionSocket = welcomingSocket.accept())
            {
                System.out.println("Client accepted.");
                OutputStream out = connectionSocket.getOutputStream();
                InputStream in = connectionSocket.getInputStream();

                StringBuilder received = new StringBuilder();
                String msg;
                String send;

                byte[] buffer = new byte[5000];


                while (true)
                {
                    while (in.available() > 0)
                    {
                        int read = in.read(buffer);
                        msg = new String(buffer, 0, read);
                        received.append(msg).append("\n");
                        System.out.println("RECV : " + msg);
                        if (!msg.equals("over"))
                        {
                            send = "Received\n" + received.toString();
                            out.write(send.getBytes());

                        }
                        else
                        {
                            send = "finished\n";
                            out.write(send.getBytes());
                            in.close();
                            out.close();
                            connectionSocket.close();
                            System.exit(0);

                        }

                    }

                }

            }
            catch (IOException ex)
            {
                System.err.println(ex.toString());
            }
            System.out.println("done.\nClosing Server...");

        }

    }

    public static void main(String[] args) throws IOException {
        Server server = new Server();
        server.start();
    }

}
