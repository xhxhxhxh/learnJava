package jdbc;

import java.sql.*;

public class JDBCDemo {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    // 注册驱动可不写
//    Class.forName("com.mysql.jdbc.Driver");

    // 获取链接
    String url = "jdbc:mysql://127.0.0.1:3306/db1?useSSL=false";
    String user = "root";
    String password = "123456";
    Connection connection = DriverManager.getConnection(url, user, password);

    // 定义sql
    String sql = "insert into stu(id, username) values(3, '张三')";

    // 获取sql执行对象
    Statement statement = connection.createStatement();

    // 执行
    try {
      connection.setAutoCommit(false); // 默认为true,false开启手动提交
      int count = statement.executeUpdate(sql); // 返回受影响行数，执行DML、DDL语句
      System.out.println("受影响行数" + count);


      // 进行预编译sql，并防止sql注入
      PreparedStatement preparedStatement = connection.prepareStatement("select * from stu where id = ? and username = ?");
      preparedStatement.setInt(1, 2);
      preparedStatement.setString(2, "张三");
      ResultSet resultSet1 = preparedStatement.executeQuery();

      while (resultSet1.next()) {
        int id = resultSet1.getInt("id");
        String username = resultSet1.getString("username");
        System.out.println("id:" + id + "username:" + username);
      }

      ResultSet resultSet = statement.executeQuery("select * from stu");

      while (resultSet.next()) { // 将光标向下移动一行，判断当前行是否有效行
        int id = resultSet.getInt("id");
        String username = resultSet.getString("username");
        System.out.println("id:" + id + "username:" + username);
      }
      connection.commit(); // 提交事务
    } catch (SQLException e) {
      connection.rollback(); // 回滚事务
    }

    // 释放资源
    statement.close();
    connection.close();

  }
}
