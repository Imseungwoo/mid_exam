package kr.ac.jejunu;

import java.sql.*;

public class ProductDao {
    private final ConnectionMaker connectionMaker = new JejuConnectionMaker();
}
    public Product get(Long id) throws ClassNotFoundException, SQLException {
        Connection connection = connectionMaker.getConnection();
        PreparedStatement preparedStatement = connection.prepareStatement("select * from product where id = ?");
        preparedStatement.setLong(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        resultSet.next();
        Product product = new Product();
        product.setId(resultSet.getLong("id"));
        product.setTitle(resultSet.getString("title"));
        product.setPrice(resultSet.getInt("price"));
        resultSet.close();
        preparedStatement.close();
        connection.close();
        return product;
    }

    public Product insert() throws ClassNotFoundException, SQLException {
        Connection connection = connectionMaker.getConnection();

        PreparedStatement preparedStatement = getConnection().prepareStatement("insert into product (id, title, price) values ?, ?, ?");
        preparedStatementsetLong(1, id);
        preparedStatementsetString(2, title);
        preparedStatementsetInt(3, price);

        preparedStatement.executeQuery();

        preparedStatement.close();
        connection.close();
    }

    private  Connection getConnection() throws  ClassNotFoundException, SQLException{
//        Class.forName("com.mysql.jdbc.Driver");
//        return DriverManager.getConnection("jdbc:mysql//127.0.0.1/portal?characterEncoding=utf-8","root","1111");
//    }
}
