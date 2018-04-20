package kr.ac.jejunu;

import java.sql.*;

public class ProductDao {
    public Product get(Long id) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1/portal", "root", "1111");
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

    public Product insert() throws SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql//127.0.0.1/portal","root","1111");

        Product product = new Product();

        PreparedStatement preparedStatement = getConnection().prepareStatement("insert into product (id, title, price) values ?, ?, ?");
        preparedStatementsetLong(1, id);
        preparedStatementsetString(2, title);
        preparedStatementsetInt(3, price);

        preparedStatement.executeQuery();

        preparedStatement.close();
        connection.close();
    }
}
