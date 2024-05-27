package jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.util.Properties;

public class ConnectionPool {
  public static void main(String[] args) throws Exception {
    // 获取druid配置
    Properties properties = new Properties();
    properties.load(new FileInputStream("src/jdbc/druid.properties"));

    // 载入配置
    DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

    // 获取连接
    Connection connection = dataSource.getConnection();
    System.out.println(connection);

  }
}
