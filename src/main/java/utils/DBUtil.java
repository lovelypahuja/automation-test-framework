package utils;

import config.ConfigManager;
import java.sql.*;

public class DBUtil {
    private static Connection connection;

    public static void connect() throws Exception {
        connection = DriverManager.getConnection(
                ConfigManager.get("mysql.url"),
                ConfigManager.get("mysql.user"),
                ConfigManager.get("mysql.password"));
    }

    public static ResultSet query(String sql) throws Exception {
        Statement stmt = connection.createStatement();
        return stmt.executeQuery(sql);
    }

    public static void disconnect() throws Exception {
        connection.close();
    }
}
