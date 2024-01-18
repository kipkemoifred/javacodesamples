package tutorials.jdbc;

import java.sql.*;

public class JDBCTutorial {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/world";
            String username = "root";
            String password = "root";

            Connection connection = DriverManager.getConnection(url, username, password);
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("SELECT * FROM city");

            while (resultSet.next()) {
                String column1Value = resultSet.getString("Name");
                // Process other columns as needed
                System.out.println("Name: " + column1Value);
            }

            resultSet.close();
            statement.close();
            connection.close();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

}
