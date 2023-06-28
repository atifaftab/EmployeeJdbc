package com.amk.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBaseConnection {

    private static final String url = "jdbc:mysql://localhost:3306/employee_db";
    private static final String username = "root";
    private static final String password = "root";


    public static Connection dbConnection() throws ClassNotFoundException {

        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url,username, password);


        }
        catch (Exception e){
            e.printStackTrace();
        }

        return con;
    }

}
