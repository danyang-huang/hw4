
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

public class SearchQuery {
    
    private Connection conn;
    private ResultSet results;
    
    
    public SearchQuery(){
        
    Properties props =new Properties();
    InputStream instr = getClass().getResourceAsStream("dbConn.properties");
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    String driver = props.getProperty("driver.name");
    String url = props.getProperty("server.name");
    String username = props.getProperty("user.name");
    String passwd = props.getProperty("user.password");
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url, username, passwd);
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
        
    }
    
    
    public void doSearch (String shade){
        try {
            String query = "SELECT * FROM lipsticks WHERE UPPER(shade) LIKE? ORDER BY shade ASC";
            
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1,"%" + shade.toUpperCase() + "%");
            this.results = ps.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public String getHTMLTable(){
        
        String table = "";
        table += "<table>";
        
        table += "<th>";
        table += "Nars ID";
        table += "</th>";
        
        table += "<th>";
        table += "Shade";
        table += "</th>";
        
        table += "<th>";
        table += "Series";
        table += "</th>";
        
        table += "<th>";
        table += "Price";
        table += "</th>";
        
        table += "<th>";
        table += "Rate";
        table += "</th>";
        
        table += "<th>";
        table += " ";
        table += "</th>";
                
        try {
            while (this.results.next()){
                
                Lipsticks lipstick=new Lipsticks();
                lipstick.setNarsID(this.results.getInt("narsID"));
                lipstick.setShade(this.results.getString("shade"));
                lipstick.setSeries(this.results.getString("series"));
                lipstick.setPrice(this.results.getInt("price"));
                lipstick.setRate(this.results.getInt("rate"));
                
                
                table += "<tr>";
                
                table +="<td>";
                table += lipstick.getNarsID();
                table +="</td>";
            
                        
            
                table +="<td>";
                table += lipstick.getShade();
                table +="</td>";
          
                        
                table +="<td>";
                table += lipstick.getSeries();
                table +="</td>";
                
                table +="<td>";
                table += lipstick.getPrice();
                table +="</td>";
                
                table +="<td>";
                table += lipstick.getRate();
                table +="</td>";
                
 
                
                table += "<td>";
                table += "<a href=update?narsID=" + lipstick.getNarsID() +"> Update </a>" + "<a href=delete?narsID=" + lipstick.getNarsID() +"> Delete </a>";
                table +="</td>";
                
                table += "</tr>";
                
                
                
                
            }   } catch (SQLException ex) {
            Logger.getLogger(SearchQuery.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        table +="</table>";
                
                    return table;
    
    
    
    
    
    }
}
