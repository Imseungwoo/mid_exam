package kr.ac.jejunu;

import java.sql.*;

public class JejuConnectionMaker implements ConnectionMaker{
    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        return DriverManeger.getConnection("jdbc://mysql://localhost/portal?characterEncoding=utf8", "root", "1111");
    }
}