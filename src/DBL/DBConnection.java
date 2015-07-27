/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author hp
 */
public class DBConnection {

    private static DBConnection DBInstance = new DBConnection();

    private DBConnection() {
    } //

    public static DBConnection getInstance() {

        if (DBInstance == null) {
            DBInstance = new DBConnection();

        }

        return DBInstance;
    }

    private Connection getConnection() {

        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/iti";
            String username = "root";
            String password = "";
            Class.forName(driver);

            return DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

    public boolean isConnected() {

        if (getConnection() != null) {
            System.out.println("Connected");
            return true;
        } else {
            System.err.println("Not connected");
            return false;
        }
    }

    public ResultSet getValues(String query) throws SQLException {

        Connection connection = getConnection();
        Statement statement = connection.prepareStatement(query);
        ResultSet resultSet = statement.executeQuery(query);

        resultSet.next();

        return resultSet;

    }

    public void insertValues(String query) throws SQLException {

        Connection connection = getConnection();
        Statement statement = connection.createStatement();
        statement.executeUpdate(query);
        connection.close();

    }

}
