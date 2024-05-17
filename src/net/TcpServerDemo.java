package net;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TcpServerDemo {
  public static void main(String[] args) throws IOException {
    ServerSocket serverSocket = new ServerSocket(10000);

    Socket accept = serverSocket.accept(); // 会阻塞

    InputStream inputStream = accept.getInputStream();

    while (true) {
      int res = inputStream.read(); // 会阻塞
      if (res != -1) {
        System.out.print((char)res);
      } else {
        break;
      }
    }

    inputStream.close();
    serverSocket.close();
  }
}
