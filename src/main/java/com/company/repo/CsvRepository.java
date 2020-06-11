package com.company.repo;

import com.company.entity.Client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

public class CsvRepository {

    Connection connection;

    public void loadClientsToDataBase(List<Client> clientList) {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:clientDataBase.db");

            for (Client client : clientList) {

                String sql = "INSERT INTO clients (A, B, C, D, E,F,G,H,I,J) VALUES (?, ?, ?, ?, ?, ?, ?, ? ,? ,?)";

                PreparedStatement prepStmt = connection.prepareStatement(sql);

                prepStmt.setString(1, client.getA());
                prepStmt.setString(2, client.getB());
                prepStmt.setString(3, client.getC());
                prepStmt.setString(4, client.getD());
                prepStmt.setString(5, client.getE());
                prepStmt.setString(6, client.getF());
                prepStmt.setString(7, client.getG());
                prepStmt.setString(8, client.getH());
                prepStmt.setString(9, client.getI());
                prepStmt.setString(10, client.getJ());
                prepStmt.executeUpdate();

            }

        } catch (NullPointerException NPE) {
            System.out.println("Records Loded");
        } catch (Exception e) {
            System.err.println(e.getClass().getName() + ": " + e.getMessage());
            e.printStackTrace();
            System.exit(0);

        }
    }


}


/*

    CREATE TABLE IF NOT EXISTS "clients" (
        "A"	TEXT NOT NULL,
        "B"	TEXT NOT NULL,
        "C"	TEXT NOT NULL,
        "D"	TEXT NOT NULL,
        "E"	TEXT NOT NULL,
        "F"	TEXT NOT NULL,
        "G"	TEXT NOT NULL,
        "H"	TEXT NOT NULL,
        "I"	TEXT NOT NULL,
        "J"	TEXT NOT NULL
        );*/
