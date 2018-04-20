package kr.ac.jejunu;

import org.springframework.beans.factory.annotation.Value;
import java.sql.*;

public class JejuConnectionMaker implements ConnectionMaker{
    @Value("${db.cassname}")
    private String className;
    @Value("${db.url}")
    private String url;
    @Value("${db.username}")
    private String username;
    @Value("${db.password}")
    private String password;

    @Override
    public Connection getConnection() throws ClassNotFoundException, SQLException{
        Class.forName(className);
        return DriverManeger.getConnection(url, username, password);
    }
}