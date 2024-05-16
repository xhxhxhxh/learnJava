package net;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {
  public static void main(String[] args) throws UnknownHostException {
    InetAddress address = InetAddress.getByName("DESKTOP-OG5FQ2V");

    System.out.println(address.getHostName()); // 主机名
    System.out.println(address.getHostAddress()); // ip地址
  }
}
