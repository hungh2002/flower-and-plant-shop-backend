package com.hungh2002.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * DBConnection
 */
public class DBConnection {

    protected Connection connection = null;


    public DBConnection() {
        String databaseUrl = "jdbc:" + GlobalVariable.RDBMS + "://" + GlobalVariable.HOST + ":"
                + GlobalVariable.PORT_OF_HOST + "/" + GlobalVariable.DATABASE_NAME;
        try {
            connection = DriverManager.getConnection(databaseUrl, GlobalVariable.USERNAME,
                    GlobalVariable.PASSWORD);
        } catch (Exception e) {
            System.out.println("Database connection error: " + e);
        }

    }

    public void close() {
        try {
            connection.close();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("ERROR: DBConnection -> Close: " + e);
        }
    }

}
