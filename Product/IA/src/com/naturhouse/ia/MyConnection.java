/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naturhouse.ia;
import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author damian
 */
public class MyConnection {

    private static String servername = "127.0.0.1";
    private static String username = "root";
    private static String dbname  = "ia";
    private static Integer portnumber  = 3306;
    private static String password = "";
    
    public static Connection getConnection() //connects to the MySQL database
    {
        Connection cnx = null;
        
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        datasource.setUseSSL(false); // for secure connection, needs certificate
        
        try {
            cnx = datasource.getConnection();
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return cnx;
    }
    public static String encrypt(String data){ //encrypts string in SHA-256
        StringBuilder sb;                           //for a hashed password
        sb = new StringBuilder();
        try{
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(data.getBytes()); //get the type of encryption
            byte byteData[] = md.digest();
            for (int i = 0; i < byteData.length; i++) {
                //loop through the bytes and converts it to hex
                sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
            }
            } catch(NoSuchAlgorithmException e){
        }
        return sb.toString();
    }
}
