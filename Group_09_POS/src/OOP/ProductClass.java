package OOP;

import DatabaseConnection.ConnectionDB;
import static DatabaseConnection.ConnectionDB.closeConnection;
import static DatabaseConnection.ConnectionDB.conn;
import static DatabaseConnection.ConnectionDB.openConnection;
import java.sql.*;
import MainFormsOurProject.CashierForm;
import java.awt.Label;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class ProductClass {

   
    public ProductClass(){
        
    }
    
    public String id;
    public String name;
    public double prise;
    public int count;
    

    public String getName(int count){
        ConnectionDB.openConnection();
        try{
                                                                       
            PreparedStatement ps = ConnectionDB.conn.prepareStatement("select PName from product where liveProduct=1 order by ProductId asc Limit ? offset ? ");
            ps.setInt(1, count);
            ps.setInt(2, count-1);
            ResultSet result = ps.executeQuery();
            if(result.next()){
                this.name=result.getString(1);
                
            }
            
            
            ps.close();
            result.close();
        }catch(Exception e){
            System.out.println("name get err");
        }
        finally{
            ConnectionDB.closeConnection();
        }
        
        
        return this.name;
    }
    public double getPrise(int count){
        ConnectionDB.openConnection();
        try{
            
            PreparedStatement ps = ConnectionDB.conn.prepareStatement("select PPrice from product where liveProduct=1 order by ProductId asc Limit ? offset ? ");
            ps.setInt(1, count);
            ps.setInt(2, count-1);
            ResultSet result = ps.executeQuery();
            if(result.next()){
                this.prise=result.getInt(1);
                
            }
            
            
            result.close();
            ps.close();
        }catch(SQLException e){
            System.out.println("price get err");
        }
        finally{
            ConnectionDB.closeConnection();
        }
        
        
        return this.prise;
    }
    public String getId(int count){
        ConnectionDB.openConnection();
        try{
            
            PreparedStatement ps = ConnectionDB.conn.prepareStatement("select ProductId from product where liveProduct=1 order by ProductId asc Limit ? offset ? ");
            ps.setInt(1, count);
            ps.setInt(2, (count-1));
            ResultSet result = ps.executeQuery();
            
            if(result.next()){
                this.id=result.getString(1);
                
            }
            
            
            result.close();
            ps.close();
        }catch(SQLException e){
            System.out.println("productid get err");
        }
        finally{
            ConnectionDB.closeConnection();
        }
        return this.id;
    }
    
    
    public void getCountProductTable() {
        ConnectionDB.openConnection();
        try {
            
            
            PreparedStatement ps = ConnectionDB.conn.prepareStatement("select count(ProductId) as count from product where liveProduct=1");
            ResultSet result = ps.executeQuery();
            if(result.next()){
                this.count=result.getInt(1);
            }
            
            result.close();
            ps.close();
        } catch (SQLException e) {
            System.out.println("Get Value Err");
        }finally{
            ConnectionDB.closeConnection();
        }
    }
    
    public void getProduct(JLabel name,JLabel id,JLabel price,JComboBox quantity,JTextField Purchase ,JTable orderList ){
        try{
        String iName=name.getText();
        String iId=id.getText().replace("No.", "");
        double iPrice = Double.parseDouble(price.getText().replace("RS: ", ""));
        int iQuantity=Integer.parseInt((String)quantity.getSelectedItem());
        double iTotal=iPrice*iQuantity;
        Purchase.setText(String.valueOf(iTotal));
        DefaultTableModel dt = (DefaultTableModel) orderList.getModel();
        
        
        
        //int z=Integer.parseInt(com);
        //double total=(y*z);
        //txtItems1.setText(""+total);
             
        
            for (int i = 0; i < dt.getRowCount(); i++) {
                if(iName.equals(dt.getValueAt(i,1))){
                    dt.removeRow(i);
//dt.removeRow(orderList.convertRowIndexToModel(i));
                }
            }
            
        
        if (iQuantity != 0) {
            Vector<Object> v = new Vector<>();
            v.add(iId);
            v.add(iName);
            v.add(iQuantity);
            v.add(iTotal);
            dt.addRow(v);
            
            
        }
        
       }catch(NumberFormatException e){
           System.out.println("Items add err");
       }
    }
    
    public void calTotalOrder(JLabel totalDisplay,JTable orderList){
        int tableRow=orderList.getRowCount();
        double total=0.00;
        
        for(int i=0;i<tableRow;i++){
            double value=Double.parseDouble(orderList.getValueAt(i,3 ).toString());
            //double quantity=Double.valueOf(orderList.getValueAt(i,1 ).toString());
            total += value;
        }
        
        DecimalFormat dt=new DecimalFormat("#.00");
        
        totalDisplay.setText("RS : "+dt.format(total));
    }
    
    public void payOrder(JTable orderList,JLabel total,JTextField amount,JLabel blanece){
        String oAmount=amount.getText();
        double oTotal = Double.parseDouble(total.getText().replace("RS : ", ""));
        
        
        if(oAmount.equals("RS:0.00") || oAmount.isEmpty()){
        
            JOptionPane.showMessageDialog(null, "Please Enter Valid payment amount.");
            return;
            
        } double amountPay=0.00;
            try{
                amountPay=Double.parseDouble(oAmount);
            }catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null, "Invalid Payment amount");
            }
            
            
        if(amountPay < 0){
            JOptionPane.showMessageDialog(null, "Payment cannot be negative");
            return;
 
        }if(oTotal>amountPay){
            JOptionPane.showMessageDialog(null, "Low amount balance");
            return;
        }
        
        double balancee=amountPay-oTotal;
        blanece.setText("RS: "+(amountPay-oTotal));
        
        DefaultTableModel dt = (DefaultTableModel) orderList.getModel();
                
        insertEmtry();
                for(int i=0;i<dt.getRowCount();i++){
                    
                    String orId=dt.getValueAt(i,0).toString();
                    int orQuantity=Integer.parseInt(dt.getValueAt(i,2).toString());
                    double orPrice=Double.parseDouble(dt.getValueAt(i,3).toString());
                    
                    insertOrderDetails(orId,orQuantity,orPrice);
                }
                
                
                    
    }
    
    private void insertEmtry(){
        try{
            
            openConnection();
            
            PreparedStatement ps1 = ConnectionDB.conn.prepareStatement("insert into salesOrder(OrderDate) values(current_date())");
            ps1.executeUpdate();
            ps1.close();
        }catch(Exception e){
            System.out.println("Emtry order err");
        }finally{
            closeConnection();
        }
    }
    
    private void insertOrderDetails(String productId,int quantity,double price){
                    
                    try {
                        openConnection();

                        //Qry Begin
                        
                        PreparedStatement ps2 = ConnectionDB.conn.prepareStatement("select OrderId from salesOrder order by orderId desc limit 1");
                        
                        
                        ResultSet result = ps2.executeQuery();
                        String orderId="";
                        if(result.next()){
                            orderId=result.getString(1);
                        }
                        PreparedStatement ps3 = ConnectionDB.conn.prepareStatement("insert into orderdetails values('"+orderId+"','"+productId+"','"+quantity+"','"+price+"')");
                        ps3.executeUpdate();
                        
                        
                        
                        
                        ps2.close();
                        ps3.close();
                        result.close();
                        } catch (Exception ee) {
                                System.out.println("sales add err : ");
                        } finally {
                                closeConnection();
                                System.out.println("Colose Connection Emp");
                        }
                    
    } 
    public void loadSalesTotal(){
            openConnection();
            String qry2=" UPDATE salesOrder SO JOIN ( SELECT order_Id, SUM(sub_Total) AS totalAmount FROM orderDetails GROUP BY order_Id ) OD ON SO.OrderId = OD.order_Id SET SO.totalAmount = OD.totalAmount; ";
            String qry3=" set sql_safe_updates=1";
            String qry1="set sql_safe_updates=0; ";
        try{
          
            PreparedStatement ps4 = ConnectionDB.conn.prepareStatement(qry1);
            ps4.executeUpdate();
            PreparedStatement ps5 = ConnectionDB.conn.prepareStatement(qry2);
            ps5.executeUpdate();
            PreparedStatement ps6 = ConnectionDB.conn.prepareStatement(qry3);
            ps4.executeUpdate();
            ps4.close();
            ps5.close();
            ps6.close();
        }catch(Exception e){
            System.out.println("load orders err");
        }finally{
            closeConnection();
        }
    }
}
