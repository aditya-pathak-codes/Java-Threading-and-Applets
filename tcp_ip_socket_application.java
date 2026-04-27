Client.java
import java.io.*;
import java.net.*;

class Client {
    public static void main(String args[]) {
        int serverport = 6666;
        String address = "127.0.0.1";

        try {
            InetAddress ip = InetAddress.getByName(address);

            System.out.println("SERVER IP ADDRESS: " + address);
            System.out.println("SERVER PORT: " + serverport);

            Socket socket = new Socket(ip, serverport);

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String line;

            while (true) {
                System.out.print("Enter message (type 'end' to stop): ");
                line = br.readLine();

                out.writeUTF(line);
                out.flush();

                if (line.equalsIgnoreCase("end")) {
                    break;
                }

                String msg = in.readUTF();
                System.out.println("DATA RECEIVED FROM SERVER: " + msg);
            }

            socket.close();

        } catch (IOException e) {
            System.out.println("EXCEPTION OCCURRED: " + e.getMessage());
        }
    }
}

Server.java

import java.io.*;
import java.net.*;

class Server {
    public static void main(String args[]) {
        int port = 6666;

        try {
            ServerSocket ss = new ServerSocket(port);
            System.out.println("WAITING FOR CLIENT...");

            Socket socket = ss.accept();
            System.out.println("GOT A CLIENT");

            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());

            String line;

            while (true) {
                line = in.readUTF();

                if (line.equalsIgnoreCase("end")) {
                    System.out.println("Client disconnected.");
                    break;
                }

                System.out.println("LINE RECEIVED FROM CLIENT: " + line);

                out.writeUTF("Echo: " + line);
                out.flush();
            }

            socket.close();
            ss.close();

        } catch (IOException e) {
            System.out.println("EXCEPTION OCCURRED: " + e.getMessage());
        }
    }
}
