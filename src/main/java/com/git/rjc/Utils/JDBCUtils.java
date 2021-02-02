package com.git.rjc.Utils;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtils {
    private static final ThreadLocal<Connection> threadLocal = new ThreadLocal<>();
    public static Connection getConnection(){
        Connection connection=threadLocal.get();
        if(connection==null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                connection= DriverManager.getConnection("","","");
                threadLocal.set(connection);
            }catch (Exception e){
                return null;
            }
        }
        return connection;
    }
}
