package main;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import static java.util.jar.Pack200.Packer.PASS;

public class Main {

    private static final String URL = "jdbc:mysql://localhost:3306/appliences";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static Connection connection = null;

    public static void main(String[] args) throws ClassCastException, SQLException, ClassNotFoundException {

        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
            DBReader reader = new DBReader(connection);
            connection = DriverManager.getConnection(URL,USERNAME,PASSWORD);
            printAllFromDB(reader);

        } catch (SQLException e) {
            System.err.println("Failed");
        }
    }
    private static void printAllFromDB(DBReader reader){
        int rows = reader.getRow();
        System.out.println("Database contains " + rows + " rows:");
        for (int i = 1; i <= rows; i++) {
            Appliences = appliences.readInfo(i);
            System.out.println(appliences.getName() + ": powerConsumption = " + appliences.getPowerConsumption());
        }
    }
}
