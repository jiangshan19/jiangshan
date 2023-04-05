package com.bean;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCUtil
{
    private static Connection conn;
    private static Statement stmt;
    private static String driverClass;
    private static String url;
    private static String userName;
    private static String password;
    private long lstr = System.currentTimeMillis();

    public void open()
    {
        try
        {
            InputStream in = JDBCUtil.class.getClassLoader().getResourceAsStream("application.properties");
            Properties pro = new Properties();
            pro.load(in);
                driverClass = pro.getProperty("spring.datasource.driver-class-name");
                url = pro.getProperty("spring.datasource.url");
                userName = pro.getProperty("spring.datasource.username");
                password = pro.getProperty("spring.datasource.password");
                Class.forName(driverClass);
                conn = DriverManager.getConnection(url, userName, password);
                stmt = conn.createStatement();
        }
        catch (Exception ex)
        {
            System.err.println(ex.getMessage());
        }
    }

    public void close()
    {
        try
        {
            conn.close();
        }
        catch (SQLException ex)
        {
            System.err.println(ex.getMessage());
        }
    }

    public ResultSet executeQuery(String sql)
            throws SQLException
    {
        ResultSet rs = null;
        rs = stmt.executeQuery(sql);
        return rs;
    }

    public int executeUpdate(String sql)
            throws SQLException
    {
        int ret = 0;
        ret = stmt.executeUpdate(sql);
        return ret;
    }
}
