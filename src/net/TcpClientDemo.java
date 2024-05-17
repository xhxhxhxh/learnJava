package net;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TcpClientDemo {
  public static void main(String[] args) throws IOException {
    Socket socket = new Socket("127.0.0.1", 10000);

    OutputStream outputStream = socket.getOutputStream();
    outputStream.write("hello".getBytes());

    socket.shutdownOutput(); // 仅关闭输出流，并写入接收标记

    outputStream.close(); // 关流
    socket.close(); // 四次挥手
  }
}
