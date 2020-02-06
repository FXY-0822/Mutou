package it.jdbc;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/**
 * jdbc工具类：包括注册驱动，连接数据库，释放资源
 *
 */
public class JdbcUtil {
    private static String url=null;
    private static String user=null;
    private static String password=null;
    private static String driver=null;

    /**
     * 注册驱动
     */
    static {
        try {
            ClassLoader classLoader = JdbcUtil.class.getClassLoader();//通过loader类使用getresource
            URL resource = classLoader.getResource("jdbc.properties");//通过getrs调用getpath得到jdbc文件路径
            String path = resource.getPath();
            Properties per=new Properties();
            per.load(new FileReader(path));//通过属性集+文件读入流来获取数据
            url = per.getProperty("url");
            user = per.getProperty("user");
            password = per.getProperty("password");
            driver=per.getProperty("driver");
            Class.forName(driver);
        }catch (IOException e){
            e.printStackTrace();
        }catch (ClassNotFoundException a) {
            a.printStackTrace();
        }

    }

    /**
     * 连接数据库
     */
    public static Connection getconn()throws SQLException{
        return DriverManager.getConnection(url,user,password);
    }

    /**
     * 释放资源
     * 第一种：不带查询executequery语句
     * 第二种：带查询语句
     */
    public static void close(Connection connection,Statement statement){
        if (statement!=null){
            try{
                statement.close();//如果此语句出异常，try方法块后续代码不会执行
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
        if (connection!=null){
            try{
                connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }

    }

    public static void close(ResultSet resultSet,Connection connection,Statement statement){
        if (resultSet!=null){
            try{
                resultSet.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
        if (statement!=null){
            try{
                statement.close();//如果此语句出异常，try方法块后续代码不会执行
            } catch (SQLException e){
                e.printStackTrace();
            }
        }
        if (connection!=null){
            try{
                connection.close();
            }catch (SQLException e){
                e.printStackTrace();
            }
        }
    }
}

