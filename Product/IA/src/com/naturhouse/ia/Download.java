/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.naturhouse.ia;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Damian
 */
public class Download {
    public void DietDownloadCut(int x){ //function to open the url
           try {   //according to the inputed calories, Cut version.
                    if (x < 1800){ //range of calories
                        x = 1;
                    } else if (x > 1800 | x < 2000){
                        x = 2;
                    } else if (x > 2000 | x < 2250){
                        x = 3;
                    } else if (x > 2250 | x < 2500){
                        x = 4;
                    } else if (x > 2500 | x < 2750){
                        x = 5;
                    } else if (x > 2750){
                        x = 6;
                    }
                String CutLink = null;
                PreparedStatement ps;
                ResultSet rs = null;
                String s=String.valueOf(x);
                String query = "SELECT link FROM diets WHERE id = '" + s + "'";
                ps = MyConnection.getConnection().prepareStatement(query);
                if(ps.execute())
                {
                    rs=ps.getResultSet(); //send the query to db
                }
                while(rs.next()){
                    CutLink = rs.getString(1); //receive from db once
                }
                OpenLink(CutLink); //pop the link in browser
            } catch (SQLException ex) {
                Logger.getLogger(Download.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    public void DietDownloadBulk(int x){ //function to open the url
            try {  //according to the inputed calories, Bulk version.
                    if (x < 1800){ //range of calories
                        x = 1;
                    } else if (x > 1800 | x < 2000){
                        x = 2;
                    } else if (x > 2000 | x < 2250){
                        x = 3;
                    } else if (x > 2250 | x < 2500){
                        x = 4;
                    } else if (x > 2500 | x < 2750){
                        x = 5;
                    } else if (x > 2750){
                        x = 6;
                    }
                String BulkLink = null;
                PreparedStatement ps;
                ResultSet rs = null;
                x = x+1;
                String s=String.valueOf(x);
                String query = "SELECT link FROM diets WHERE id = '" + s + "'";
                ps = MyConnection.getConnection().prepareStatement(query);
                if(ps.execute())
                {
                    rs=ps.getResultSet(); //send the query to db
                }
                while(rs.next()){
                    BulkLink = rs.getString(1); //receive from db once
                }
                OpenLink(BulkLink); //pop the link in browser
            } catch (SQLException ex) {
                Logger.getLogger(Download.class.getName()).log(Level.SEVERE, null, ex);
            }
    }
  
    
    public void OpenLink(String link){
    try { //open the link in the OS's default browser
                Desktop.getDesktop().browse(new URL(link).toURI());
                } catch (IOException | URISyntaxException e) {
            }
        }   
}