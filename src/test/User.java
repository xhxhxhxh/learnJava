package test;

import java.io.Serializable;

public class User implements Serializable {
  private String username;
  private transient String password; // 使用transient不让该变量序列到本地
  private static final long serialVersionUID = 666L; // 声明一个序列号

  public User(String username, String password) {
    this.username = username;
    this.password = password;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  @Override
  public String toString() {
    return "User{" +
        "username='" + username + '\'' +
        ", password='" + password + '\'' +
        '}';
  }
}
