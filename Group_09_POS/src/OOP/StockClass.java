
package OOP;

import DatabaseConnection.ConnectionDB;
import static DatabaseConnection.ConnectionDB.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JLabel;


public class StockClass {
    
    
    
    public static double stockQuantity=0.00;
    public static double coneWeight=0.00;
    
    
    
    public double getStockQuantity(JLabel productId){
        ConnectionDB.openConnection();
        try{
            String lblText = productId.getText().replace("No.", "");
            
            
            PreparedStatement ps = ConnectionDB.conn.prepareStatement("select QuantityStock from stock where ProductID='"+lblText+"'");
            ResultSet result = ps.executeQuery();
            if(result.next()){
                this.stockQuantity=result.getInt(1);
            }
            ps.close();
            result.close();
        }catch(Exception e){
            System.out.println("stock get err");
        }finally{
            ConnectionDB.closeConnection();
        }
        return this.stockQuantity;
    }
    
    
    public void increasingNewStock(JLabel ProductName,double positiveStock){
        try {
                String lblText = ProductName.getText(); 
            
                ConnectionDB.openConnection();
                
                Statement sta = conn.createStatement();
                sta.executeUpdate("update stock set QuantityStock = QuantityStock+'"+positiveStock+"' where ProductID=(select ProductId from product where PName='"+lblText+"')");
                
                sta.close();
                
            } catch (Exception ee) {
                System.out.println("Stock adding + err");
            } finally {
                ConnectionDB.closeConnection();
            }
    }
    
    public void decreasesOldStock(JLabel productId,double negativeStock){
        
        try {
                String lblText = productId.getText().replace("No.", "");
                  
            
                ConnectionDB.openConnection();
                
                Statement sta = conn.createStatement();
                sta.executeUpdate("update stock set QuantityStock = QuantityStock-'"+negativeStock+"' where ProductID='"+lblText+"'");
                
                sta.close();
            } catch (Exception ee) {
                System.out.println("Stock adding - err");
            } finally {
                ConnectionDB.closeConnection();
            }
    }
    
    
    public void coneWeightGet(){
        ConnectionDB.openConnection();
        try {
            
            
            PreparedStatement ps = ConnectionDB.conn.prepareStatement("select ConeWeight from iceconedetails where ConeType='Cone'");
            ResultSet result = ps.executeQuery();
            if(result.next()){
                this.coneWeight=result.getInt(1);
            }
            
            result.close();
             ps.close();
        } catch (SQLException e) {
            System.out.println("Get weight Err");
        }finally{
            ConnectionDB.closeConnection();
        }
        
        
    }
    
}
