package com.sdajava.crud.dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public enum DBConnection {
    INSTANCE;

    public static final String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
    public static final String DB_URL
            = "jdbc:mysql://localhost/ksiegarnia?" +
            "useSSL=false&useJDBCCompliantTimezoneShift=" +
            "true&useLegacyDatetimeCode=false&serverTimezone=UTC";
    public final static String USER="root";
    public final static String PASS="kkeczap";

    public static Connection setJdbcConnection () {
        Connection connection = null;

        try {
            Class.forName(JDBC_DRIVER);
            System.out.println("Lacze z BD...");
            connection =
                    DriverManager.getConnection(
                            DB_URL,USER,PASS);

        } catch (Exception ex){
            ex.printStackTrace();
        }
        return connection;
    }

    private DBConnection(){}

    /**
     * Method used by unit test - to test sigleton objects
     * @return INSTANCE of class
     */
    public static DBConnection getInstance(){
        return INSTANCE;
    }

}
