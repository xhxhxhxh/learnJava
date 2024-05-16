package net;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerDemo {
  public static void main(String[] args) throws IOException {
    int port = 10000;
    DatagramSocket socket = new DatagramSocket(port);

    byte[] bytes = new byte[1024];
    DatagramPacket packet = new DatagramPacket(bytes, bytes.length);

    socket.receive(packet); // 会阻塞，等待数据

    // 接收数据
    String message = new String(packet.getData(), 0, packet.getLength());
    System.out.println(message);

    socket.close();


  }
}
