package server;

import command.CommandHandler;

import java.io.*;
import java.net.*;

/**
 * Created by shafiq on 13/11/15.
 */
public class EchoServer {
    public static void main(String[] args) throws IOException {
        if (args.length != 1) {
            System.err.println("Usage: java EchoServer <port number>");
            System.exit(1);
        }

        int portNumber = Integer.parseInt(args[0]);

        try (
                ServerSocket serverSocket =
                        new ServerSocket(Integer.parseInt(args[0]));
                Socket clientSocket = serverSocket.accept();
                PrintWriter out =
                        new PrintWriter(clientSocket.getOutputStream(), true);
                BufferedReader in = new BufferedReader(
                        new InputStreamReader(clientSocket.getInputStream()));
        ) {
            String inputLine, response = "";
            CommandHandler commandhandler = new CommandHandler();

            while ((inputLine = in.readLine()) != null && response != "EXITOK") {

                response = commandhandler.input(inputLine);
                out.println(response);
            }

            serverSocket.close();

        } catch (IOException e) {
            System.out.println("Exception caught when trying to listen on port "
                    + portNumber + " or listening for a connection");
            System.out.println(e.getMessage());
        }




    }
}
