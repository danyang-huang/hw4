/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbHelpers;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Lipsticks;

public class ReadRecord {
    private Connection conn;
    private ResultSet results;
    
    private Lipsticks lipstick = new Lipsticks();
    private int narsID;
    
    public ReadRecord (int narsID) {
    Properties props =new Properties();
    InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    String driver = props.getProperty("driver.name");
    String url = props.getProperty("server.name");
    String username = props.getProperty("user.name");
    String passwd = props.getProperty("user.password");
    
    
    this.narsID = narsID;
    
    
    
    
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(ReadQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
}
    
    public void doRead(){
        try {
            //set up a string to hold our query
            
            String query = "SELECT * FROM lipsticks WHERE narsID = ?";
            
            
            //create a preparedstatement using out query string
            PreparedStatement ps = conn.prepareStatement(query);
            
            //fill in the preparedstatement
            ps.setInt(1,narsID);
            //execute the query
            
            this.results = ps.executeQuery();
            this.results.next();
            
            
            lipstick.setNarsID(this.results.getInt("narsID"));
            lipstick.setShade(this.results.getString("shade"));
            lipstick.setSeries(this.results.getString("series"));
            lipstick.setPrice(this.results.getInt("price"));
            lipstick.setRate(this.results.getInt("rate"));
        } catch (SQLException ex) {
            Logger.getLogger(ReadRecord.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    public Lipsticks getLipstick(){
        return this.lipstick;
    }
}

