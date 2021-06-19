package Part2;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * server with multiple clients
 * @author Alireza Nejadipour
 * #version 1.1
 */

public class Server
{
    ExecutorService pool;

    int count;

    public Server()
    {
        this.pool = Executors.newCachedThreadPool();
        this.count = 0;

    }

    /**
     * server starts responding
     */
    public void startServer()
    {

        try(ServerSocket welcomingSocket = new ServerSocket(8080))
        {
            System.out.println("Server started.\nWaiting for a client...");
            while (true)
            {
                Socket connectionSocket = welcomingSocket.accept();
                count++;
                System.out.println("Client accepted!");
                pool.execute(new ClientHandler(connectionSocket, count));
            }
//            pool.shutdown();
//            System.out.println("done.\nClosing server...");

        } catch (IOException e)
        {
            System.err.println("there was a problem with I/O");
        }

    }

    public static void main(String[] args) {
        Server server = new Server();

        server.startServer();
    }


}


/**
 * for each client new client handler starts working
 */
class ClientHandler implements Runnable {
    private final Socket connectionSocket;
    private final int clientNum;

    /**
     * create new client handler with passed parameters
     * @param connectionSocket connection socket for client
     * @param clientNum number of client to recognize each client
     */
    public ClientHandler(Socket connectionSocket, int clientNum) {
        this.connectionSocket = connectionSocket;
        this.clientNum = clientNum;

    }

    /**
     * starts running the handler
     */
    @Override
    public void run()
    {
        try (DataInputStream in = new DataInputStream(connectionSocket.getInputStream());
             DataOutputStream out = new DataOutputStream(connectionSocket.getOutputStream()))
        {
            StringBuilder received = new StringBuilder();
            received.append("received : \n");
            String msg;

            while (true)
            {
                msg = in.readUTF();

                if (msg.equals("finished"))
                {
                    out.writeUTF("good bye");
                    break;
                }
                else
                {
                    received.append(msg).append("\n");

                    out.writeUTF(received.toString());

                }

            }
            System.out.println("Server closed [Client-" + clientNum + "] connection");

        } catch (SocketException e)
        {
            System.err.println("[Client-" + clientNum + "]" + " connection Terminated");
        } catch (IOException e)
        {
            System.err.println("Some thing went wrong with [Client-" + clientNum + "] in I/O");
        }

    }

}
