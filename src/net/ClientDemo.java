package net;

import java.io.IOException;
import java.net.*;

public class ClientDemo {
  public static void main(String[] args) throws IOException {
    DatagramSocket socket = new DatagramSocket();

    String s = "你好";
    byte[] bytes = s.getBytes();
    InetAddress address = InetAddress.getByName("127.0.0.1"); // 当地址是255.255.255.255是广播
    int port = 10000;
    DatagramPacket packet = new DatagramPacket(bytes, bytes.length, address, port);

    socket.send(packet);

    socket.close();
  }
}
