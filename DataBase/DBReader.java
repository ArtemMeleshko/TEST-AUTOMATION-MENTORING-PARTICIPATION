package main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBReader {
    private Connection connection;
    private PreparedStatement statement = null;
    private ResultSet resultSet = null;

    public DBReader(Connection connection) {
        super();
        this.connection = connection;
    }

    public int getRow() {
        int size = 0;
        try {
            statement = connection.prepareStatement("SELECT * from appliences.appliences;");
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                size++;
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {

                if (resultSet != null)
                    resultSet.close();
            } catch (SQLException e) {
            }
            try {
                if (statement != null)
                    statement.close();
            } catch (SQLException e) {
            }
        }
        return size;
    }

    public Appliences readInfo(int id) {
        Appliences appliences = null;
        try {
            statement = connection.prepareStatement("SELECT * from appliences where id=?;");
            statement.setInt(1, id);

            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                if (resultSet.getInt("id") == id) {
                    appliences = new appliences(resultSet.getString("NAME"), resultSet.getDouble("PowerConsumption"));
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (resultSet != null)
                    resultSet.close();
            } catch (SQLException e) {
            }
            try {
                if (statement != null)
                    statement.close();
            } catch (SQLException e) {
            }
        }
        return appliences;
    }

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
}
