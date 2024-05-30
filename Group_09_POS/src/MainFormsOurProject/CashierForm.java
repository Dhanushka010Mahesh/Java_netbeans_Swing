package MainFormsOurProject;


import ExternalJavaFile.TableGradientCell;
import OOP.ProductClass;
import OOP.StockClass;
import static OOP.UserClass.userIdAccess;
import static OOP.UserClass.userNameAccess;
import java.awt.Color;
import java.awt.Image;
import java.awt.Panel;
import java.awt.image.BufferedImage;
import java.io.File;
import java.sql.*;
import java.text.DecimalFormat;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import javax.swing.table.JTableHeader;

public class CashierForm extends javax.swing.JFrame{

    public CashierForm() {
        initComponents();
       tableDesign();
    }
    
    public void setValueItems(){
        
    }
    
    
    public void setVisiblePanel(){
        ProductClass product1=new ProductClass();
        ProductClass product2=new ProductClass();
        ProductClass product3=new ProductClass();
        ProductClass product4=new ProductClass();
        ProductClass product5=new ProductClass();
        ProductClass product6=new ProductClass();
        ProductClass product7=new ProductClass();
        ProductClass product8=new ProductClass();
        ProductClass product9=new ProductClass();
        ProductClass product10=new ProductClass();
        ProductClass product11=new ProductClass();
        ProductClass product12=new ProductClass();
        product1.getCountProductTable();
        try{
        switch (product1.count) {
                case 1:
                    pnlItems1.setVisible(false);
                    pnlItems2.setVisible(false);
                    pnlItems3.setVisible(false);
                    pnlItems4.setVisible(false);
                    pnlItems5.setVisible(false);
                    pnlItems6.setVisible(true);
                    pnlItems7.setVisible(false);
                    pnlItems8.setVisible(false);
                    pnlItems9.setVisible(false);
                    pnlItems10.setVisible(false);
                    pnlItems11.setVisible(false);
                    pnlItems12.setVisible(false);
                    lblId7.setText("No."+product1.getId(1));
                    lblIt6.setText(product1.getName(1));
                    lblIt62.setText("RS: "+product1.getPrise(1));
                    
                    
                    break;
                case 2:
                    pnlItems1.setVisible(false);
                    pnlItems2.setVisible(false);
                    pnlItems3.setVisible(false);
                    pnlItems4.setVisible(false);
                    pnlItems5.setVisible(true);
                    pnlItems6.setVisible(true);
                    pnlItems7.setVisible(false);
                    pnlItems8.setVisible(false);
                    pnlItems9.setVisible(false);
                    pnlItems10.setVisible(false);
                    pnlItems11.setVisible(false);
                    pnlItems12.setVisible(false);
                    lblId7.setText("No."+product1.getId(1));
                    lblIt6.setText(product1.getName(1));
                    lblIt62.setText("RS: "+product1.getPrise(1));
                    lblId8.setText("No."+product2.getId(2));
                    lblIt5.setText(product2.getName(2));
                    lblIt52.setText("RS: "+product2.getPrise(2));
                    break;
                case 3:
                    pnlItems1.setVisible(false);
                    pnlItems2.setVisible(false);
                    pnlItems3.setVisible(true);
                    pnlItems4.setVisible(false);
                    pnlItems5.setVisible(true);
                    pnlItems6.setVisible(true);
                    pnlItems7.setVisible(false);
                    pnlItems8.setVisible(false);
                    pnlItems9.setVisible(false);
                    pnlItems10.setVisible(false);
                    pnlItems11.setVisible(false);
                    pnlItems12.setVisible(false);
                    lblId7.setText("No."+product1.getId(1));
                    lblIt6.setText(product1.getName(1));
                    lblIt62.setText("RS: "+product1.getPrise(1));
                    lblId8.setText("No."+product2.getId(2));
                    lblIt5.setText(product2.getName(2));
                    lblIt52.setText("RS: "+product2.getPrise(2));
                    lblId10.setText("No."+product3.getId(3));
                    lblIt4.setText(product3.getName(3));
                    lblIt42.setText("RS: "+product3.getPrise(3));
                    break;
                case 4:
                    pnlItems1.setVisible(false);
                    pnlItems2.setVisible(false);
                    pnlItems3.setVisible(true);
                    pnlItems4.setVisible(true);
                    pnlItems5.setVisible(true);
                    pnlItems6.setVisible(true);
                    pnlItems7.setVisible(false);
                    pnlItems8.setVisible(false);
                    pnlItems9.setVisible(false);
                    pnlItems10.setVisible(false);
                    pnlItems11.setVisible(false);
                    pnlItems12.setVisible(false);
                    lblId7.setText("No."+product1.getId(1));
                    lblIt6.setText(product1.getName(1));
                    lblIt62.setText("RS: "+product1.getPrise(1));
                    lblId8.setText("No."+product2.getId(2));
                    lblIt5.setText(product2.getName(2));
                    lblIt52.setText("RS: "+product2.getPrise(2));
                    lblId10.setText("No."+product3.getId(3));
                    lblIt4.setText(product3.getName(3));
                    lblIt42.setText("RS: "+product3.getPrise(3));
                    lblId9.setText("No."+product4.getId(4));
                    lblIt3.setText(product4.getName(4));
                    lblIt32.setText("RS: "+product4.getPrise(4));
                    break;
                case 5:
                    pnlItems1.setVisible(false);
                    pnlItems2.setVisible(true);
                    pnlItems3.setVisible(true);
                    pnlItems4.setVisible(true);
                    pnlItems5.setVisible(true);
                    pnlItems6.setVisible(true);
                    pnlItems7.setVisible(false);
                    pnlItems8.setVisible(false);
                    pnlItems9.setVisible(false);
                    pnlItems10.setVisible(false);
                    pnlItems11.setVisible(false);
                    pnlItems12.setVisible(false);
                    lblId7.setText("No."+product1.getId(1));
                    lblIt6.setText(product1.getName(1));
                    lblIt62.setText("RS: "+product1.getPrise(1));
                    lblId8.setText("No."+product2.getId(2));
                    lblIt5.setText(product2.getName(2));
                    lblIt52.setText("RS: "+product2.getPrise(2));
                    lblId10.setText("No."+product3.getId(3));
                    lblIt4.setText(product3.getName(3));
                    lblIt42.setText("RS: "+product3.getPrise(3));
                    lblId9.setText("No."+product4.getId(4));
                    lblIt3.setText(product4.getName(4));
                    lblIt32.setText("RS: "+product4.getPrise(4));
                    lblId11.setText("No."+product5.getId(5));
                    lblIt2.setText(product5.getName(5));
                    lblIt22.setText("RS: "+product5.getPrise(5));
                    break;
                case 6:
                    pnlItems1.setVisible(true);
                    pnlItems2.setVisible(true);
                    pnlItems3.setVisible(true);
                    pnlItems4.setVisible(true);
                    pnlItems5.setVisible(true);
                    pnlItems6.setVisible(true);
                    pnlItems7.setVisible(false);
                    pnlItems8.setVisible(false);
                    pnlItems9.setVisible(false);
                    pnlItems10.setVisible(false);
                    pnlItems11.setVisible(false);
                    pnlItems12.setVisible(false);
                    lblId7.setText("No."+product1.getId(1));
                    lblIt6.setText(product1.getName(1));
                    lblIt62.setText("RS: "+product1.getPrise(1));
                    lblId8.setText("No."+product2.getId(2));
                    lblIt5.setText(product2.getName(2));
                    lblIt52.setText("RS: "+product2.getPrise(2));
                    lblId10.setText("No."+product3.getId(3));
                    lblIt4.setText(product3.getName(3));
                    lblIt42.setText("RS: "+product3.getPrise(3));
                    lblId9.setText("No."+product4.getId(4));
                    lblIt3.setText(product4.getName(4));
                    lblIt32.setText("RS: "+product4.getPrise(4));
                    lblId11.setText("No."+product5.getId(5));
                    lblIt2.setText(product5.getName(5));
                    lblIt22.setText("RS: "+product5.getPrise(5));
                    lblId12.setText("No."+product6.getId(6));
                    lblIt1.setText(product6.getName(6));
                    lblIt12.setText("RS: "+product6.getPrise(6));
                    break;
                case 7:
                    pnlItems1.setVisible(true);
                    pnlItems2.setVisible(true);
                    pnlItems3.setVisible(true);
                    pnlItems4.setVisible(true);
                    pnlItems5.setVisible(true);
                    pnlItems6.setVisible(true);
                    pnlItems7.setVisible(false);
                    pnlItems8.setVisible(false);
                    pnlItems9.setVisible(false);
                    pnlItems10.setVisible(false);
                    pnlItems11.setVisible(false);
                    pnlItems12.setVisible(true);
                    lblId7.setText("No."+product1.getId(1));
                    lblIt6.setText(product1.getName(1));
                    lblIt62.setText("RS: "+product1.getPrise(1));
                    lblId8.setText("No."+product2.getId(2));
                    lblIt5.setText(product2.getName(2));
                    lblIt52.setText("RS: "+product2.getPrise(2));
                    lblId10.setText("No."+product3.getId(3));
                    lblIt4.setText(product3.getName(3));
                    lblIt42.setText("RS: "+product3.getPrise(3));
                    lblId9.setText("No."+product4.getId(4));
                    lblIt3.setText(product4.getName(4));
                    lblIt32.setText("RS: "+product4.getPrise(4));
                    lblId11.setText("No."+product5.getId(5));
                    lblIt2.setText(product5.getName(5));
                    lblIt22.setText("RS: "+product5.getPrise(5));
                    lblId12.setText("No."+product6.getId(6));
                    lblIt1.setText(product6.getName(6));
                    lblIt12.setText("RS: "+product6.getPrise(6));
                    lblId6.setText("No."+product7.getId(7));
                    lblIt7.setText(product7.getName(7));
                    lblIt72.setText("RS: "+product7.getPrise(7));
                    break;
                case 8:
                    pnlItems1.setVisible(true);
                    pnlItems2.setVisible(true);
                    pnlItems3.setVisible(true);
                    pnlItems4.setVisible(true);
                    pnlItems5.setVisible(true);
                    pnlItems6.setVisible(true);
                    pnlItems7.setVisible(false);
                    pnlItems8.setVisible(false);
                    pnlItems9.setVisible(false);
                    pnlItems10.setVisible(false);
                    pnlItems11.setVisible(true);
                    pnlItems12.setVisible(true);
                    lblId7.setText("No."+product1.getId(1));
                    lblIt6.setText(product1.getName(1));
                    lblIt62.setText("RS: "+product1.getPrise(1));
                    lblId8.setText("No."+product2.getId(2));
                    lblIt5.setText(product2.getName(2));
                    lblIt52.setText("RS: "+product2.getPrise(2));
                    lblId10.setText("No."+product3.getId(3));
                    lblIt4.setText(product3.getName(3));
                    lblIt42.setText("RS: "+product3.getPrise(3));
                    lblId9.setText("No."+product4.getId(4));
                    lblIt3.setText(product4.getName(4));
                    lblIt32.setText("RS: "+product4.getPrise(4));
                    lblId11.setText("No."+product5.getId(5));
                    lblIt2.setText(product5.getName(5));
                    lblIt22.setText("RS: "+product5.getPrise(5));
                    lblId12.setText("No."+product6.getId(6));
                    lblIt1.setText(product6.getName(6));
                    lblIt12.setText("RS: "+product6.getPrise(6));
                    lblId6.setText("No."+product7.getId(7));
                    lblIt7.setText(product7.getName(7));
                    lblIt72.setText("RS: "+product7.getPrise(7));
                    lblId5.setText("No."+product8.getId(8));
                    lblIt8.setText(product8.getName(8));
                    lblIt82.setText("RS: "+product8.getPrise(8));
                    break;
                case 9:
                    pnlItems1.setVisible(true);
                    pnlItems2.setVisible(true);
                    pnlItems3.setVisible(true);
                    pnlItems4.setVisible(true);
                    pnlItems5.setVisible(true);
                    pnlItems6.setVisible(true);
                    pnlItems7.setVisible(false);
                    pnlItems8.setVisible(false);
                    pnlItems9.setVisible(false);
                    pnlItems10.setVisible(true);
                    pnlItems11.setVisible(true);
                    pnlItems12.setVisible(true);
                    lblId7.setText("No."+product1.getId(1));
                    lblIt6.setText(product1.getName(1));
                    lblIt62.setText("RS: "+product1.getPrise(1));
                    lblId8.setText("No."+product2.getId(2));
                    lblIt5.setText(product2.getName(2));
                    lblIt52.setText("RS: "+product2.getPrise(2));
                    lblId10.setText("No."+product3.getId(3));
                    lblIt4.setText(product3.getName(3));
                    lblIt42.setText("RS: "+product3.getPrise(3));
                    lblId9.setText("No."+product4.getId(4));
                    lblIt3.setText(product4.getName(4));
                    lblIt32.setText("RS: "+product4.getPrise(4));
                    lblId11.setText("No."+product5.getId(5));
                    lblIt2.setText(product5.getName(5));
                    lblIt22.setText("RS: "+product5.getPrise(5));
                    lblId12.setText("No."+product6.getId(6));
                    lblIt1.setText(product6.getName(6));
                    lblIt12.setText("RS: "+product6.getPrise(6));
                    lblId6.setText("No."+product7.getId(7));
                    lblIt7.setText(product7.getName(7));
                    lblIt72.setText("RS: "+product7.getPrise(7));
                    lblId5.setText("No."+product8.getId(8));
                    lblIt8.setText(product8.getName(8));
                    lblIt82.setText("RS: "+product8.getPrise(8));
                    lblId3.setText("No."+product9.getId(9));
                    lblIt9.setText(product9.getName(9));
                    lblIt92.setText("RS: "+product9.getPrise(9));
                    break;
                case 10:
                    pnlItems1.setVisible(true);
                    pnlItems2.setVisible(true);
                    pnlItems3.setVisible(true);
                    pnlItems4.setVisible(true);
                    pnlItems5.setVisible(true);
                    pnlItems6.setVisible(true);
                    pnlItems7.setVisible(false);
                    pnlItems8.setVisible(false);
                    pnlItems9.setVisible(true);
                    pnlItems10.setVisible(true);
                    pnlItems11.setVisible(true);
                    pnlItems12.setVisible(true);
                    lblId7.setText("No."+product1.getId(1));
                    lblIt6.setText(product1.getName(1));
                    lblIt62.setText("RS: "+product1.getPrise(1));
                    lblId8.setText("No."+product2.getId(2));
                    lblIt5.setText(product2.getName(2));
                    lblIt52.setText("RS: "+product2.getPrise(2));
                    lblId10.setText("No."+product3.getId(3));
                    lblIt4.setText(product3.getName(3));
                    lblIt42.setText("RS: "+product3.getPrise(3));
                    lblId9.setText("No."+product4.getId(4));
                    lblIt3.setText(product4.getName(4));
                    lblIt32.setText("RS: "+product4.getPrise(4));
                    lblId11.setText("No."+product5.getId(5));
                    lblIt2.setText(product5.getName(5));
                    lblIt22.setText("RS: "+product5.getPrise(5));
                    lblId12.setText("No."+product6.getId(6));
                    lblIt1.setText(product6.getName(6));
                    lblIt12.setText("RS: "+product6.getPrise(6));
                    lblId6.setText("No."+product7.getId(7));
                    lblIt7.setText(product7.getName(7));
                    lblIt72.setText("RS: "+product7.getPrise(7));
                    lblId5.setText("No."+product8.getId(8));
                    lblIt8.setText(product8.getName(8));
                    lblIt82.setText("RS: "+product8.getPrise(8));
                    lblId3.setText("No."+product9.getId(9));
                    lblIt9.setText(product9.getName(9));
                    lblIt92.setText("RS: "+product9.getPrise(9));
                    lblId4.setText("No."+product10.getId(10));
                    lblIt10.setText(product10.getName(10));
                    lblIt102.setText("RS: "+product10.getPrise(10));
                    break;
                case 11:
                    pnlItems1.setVisible(true);
                    pnlItems2.setVisible(true);
                    pnlItems3.setVisible(true);
                    pnlItems4.setVisible(true);
                    pnlItems5.setVisible(true);
                    pnlItems6.setVisible(true);
                    pnlItems7.setVisible(false);
                    pnlItems8.setVisible(true);
                    pnlItems9.setVisible(true);
                    pnlItems10.setVisible(true);
                    pnlItems11.setVisible(true);
                    pnlItems12.setVisible(true);
                    lblId7.setText("No."+product1.getId(1));
                    lblIt6.setText(product1.getName(1));
                    lblIt62.setText("RS: "+product1.getPrise(1));
                    lblId8.setText("No."+product2.getId(2));
                    lblIt5.setText(product2.getName(2));
                    lblIt52.setText("RS: "+product2.getPrise(2));
                    lblId10.setText("No."+product3.getId(3));
                    lblIt4.setText(product3.getName(3));
                    lblIt42.setText("RS: "+product3.getPrise(3));
                    lblId9.setText("No."+product4.getId(4));
                    lblIt3.setText(product4.getName(4));
                    lblIt32.setText("RS: "+product4.getPrise(4));
                    lblId11.setText("No."+product5.getId(5));
                    lblIt2.setText(product5.getName(5));
                    lblIt22.setText("RS: "+product5.getPrise(5));
                    lblId12.setText("No."+product6.getId(6));
                    lblIt1.setText(product6.getName(6));
                    lblIt12.setText("RS: "+product6.getPrise(6));
                    lblId6.setText("No."+product7.getId(7));
                    lblIt7.setText(product7.getName(7));
                    lblIt72.setText("RS: "+product7.getPrise(7));
                    lblId5.setText("No."+product8.getId(8));
                    lblIt8.setText(product8.getName(8));
                    lblIt82.setText("RS: "+product8.getPrise(8));
                    lblId3.setText("No."+product9.getId(9));
                    lblIt9.setText(product9.getName(9));
                    lblIt92.setText("RS: "+product9.getPrise(9));
                    lblId4.setText("No."+product10.getId(10));
                    lblIt10.setText(product10.getName(10));
                    lblIt102.setText("RS: "+product10.getPrise(10));
                    lblId2.setText("No."+product11.getId(11));
                    lblIt11.setText(product11.getName(11));
                    lblIt112.setText("RS: "+product11.getPrise(11));
                    break;
                default:
                    pnlItems1.setVisible(true);
                    pnlItems2.setVisible(true);
                    pnlItems3.setVisible(true);
                    pnlItems4.setVisible(true);
                    pnlItems5.setVisible(true);
                    pnlItems6.setVisible(true);
                    pnlItems7.setVisible(true);
                    pnlItems8.setVisible(true);
                    pnlItems9.setVisible(true);
                    pnlItems10.setVisible(true);
                    pnlItems11.setVisible(true);
                    pnlItems12.setVisible(true);
                    lblId7.setText("No."+product1.getId(1));
                    lblIt6.setText(product1.getName(1));
                    lblIt62.setText("RS: "+product1.getPrise(1));
                    lblId8.setText("No."+product2.getId(2));
                    lblIt5.setText(product2.getName(2));
                    lblIt52.setText("RS: "+product2.getPrise(2));
                    lblId10.setText("No."+product3.getId(3));
                    lblIt4.setText(product3.getName(3));
                    lblIt42.setText("RS: "+product3.getPrise(3));
                    lblId9.setText("No."+product4.getId(4));
                    lblIt3.setText(product4.getName(4));
                    lblIt32.setText("RS: "+product4.getPrise(4));
                    lblId11.setText("No."+product5.getId(5));
                    lblIt2.setText(product5.getName(5));
                    lblIt22.setText("RS: "+product5.getPrise(5));
                    lblId12.setText("No."+product6.getId(6));
                    lblIt1.setText(product6.getName(6));
                    lblIt12.setText("RS: "+product6.getPrise(6));
                    lblId6.setText("No."+product7.getId(7));
                    lblIt7.setText(product7.getName(7));
                    lblIt72.setText("RS: "+product7.getPrise(7));
                    lblId5.setText("No."+product8.getId(8));
                    lblIt8.setText(product8.getName(8));
                    lblIt82.setText("RS: "+product8.getPrise(8));
                    lblId3.setText("No."+product9.getId(9));
                    lblIt9.setText(product9.getName(9));
                    lblIt92.setText("RS: "+product9.getPrise(9));
                    lblId4.setText("No."+product10.getId(10));
                    lblIt10.setText(product10.getName(10));
                    lblIt102.setText("RS: "+product10.getPrise(10));
                    lblId2.setText("No."+product11.getId(11));
                    lblIt11.setText(product11.getName(11));
                    lblIt112.setText("RS: "+product11.getPrise(11));
                    lblId1.setText("No."+product12.getId(12));
                    lblIt12.setText(product12.getName(12));
                    lblIt122.setText("RS: "+product12.getPrise(12));
            }
        }catch(Exception e){
            System.out.println("visible err");
        }
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new ExternalJavaFile.Panel();
        panel2 = new ExternalJavaFile.Panel();
        pnlCardDashborad = new java.awt.Panel();
        lblMenuDashboard = new javax.swing.JLabel();
        pnlCardOrdering = new java.awt.Panel();
        lblMenuOrdering = new javax.swing.JLabel();
        pnlCardLogout = new java.awt.Panel();
        lblMenuLogout = new javax.swing.JLabel();
        pnlSideAccountDetails = new java.awt.Panel();
        lblPerfilePic = new javax.swing.JLabel();
        lblHed1 = new javax.swing.JLabel();
        lblHed2 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblUserId = new javax.swing.JLabel();
        lblHed3 = new javax.swing.JLabel();
        lblHed4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panel3 = new java.awt.Panel();
        subPnlDashborad = new java.awt.Panel();
        jLabel2 = new javax.swing.JLabel();
        subPnlOrdering = new java.awt.Panel();
        spnlOrderBackground = new javax.swing.JScrollPane();
        tblOrderList = new javax.swing.JTable();
        lblOrd1 = new javax.swing.JLabel();
        lblOrd2 = new javax.swing.JLabel();
        lblOrd3 = new javax.swing.JLabel();
        lblOrderTotal = new javax.swing.JLabel();
        txtOrderAmount = new javax.swing.JTextField();
        lblOrderChange = new javax.swing.JLabel();
        btnOrderPay = new javax.swing.JButton();
        btnOrderRemove = new javax.swing.JButton();
        pnlMainItems = new java.awt.Panel();
        cardSide01 = new java.awt.Panel();
        pnlItems1 = new java.awt.Panel();
        lblIt1 = new javax.swing.JLabel();
        lblIt11 = new javax.swing.JLabel();
        lblIt12 = new javax.swing.JLabel();
        lblIt13 = new javax.swing.JLabel();
        comItems6 = new javax.swing.JComboBox<>();
        lblIt14 = new javax.swing.JLabel();
        txtItems6 = new javax.swing.JTextField();
        lblId12 = new javax.swing.JLabel();
        pnlItems2 = new java.awt.Panel();
        lblIt2 = new javax.swing.JLabel();
        lblIt21 = new javax.swing.JLabel();
        lblIt22 = new javax.swing.JLabel();
        lblIt23 = new javax.swing.JLabel();
        comItems5 = new javax.swing.JComboBox<>();
        lblIt24 = new javax.swing.JLabel();
        txtItems5 = new javax.swing.JTextField();
        lblId11 = new javax.swing.JLabel();
        pnlItems3 = new java.awt.Panel();
        lblIt3 = new javax.swing.JLabel();
        lblIt31 = new javax.swing.JLabel();
        lblIt32 = new javax.swing.JLabel();
        lblIt33 = new javax.swing.JLabel();
        comItems4 = new javax.swing.JComboBox<>();
        lblIt34 = new javax.swing.JLabel();
        txtItems4 = new javax.swing.JTextField();
        lblId9 = new javax.swing.JLabel();
        pnlItems4 = new java.awt.Panel();
        lblIt4 = new javax.swing.JLabel();
        lblIt41 = new javax.swing.JLabel();
        lblIt42 = new javax.swing.JLabel();
        lblIt43 = new javax.swing.JLabel();
        comItems3 = new javax.swing.JComboBox<>();
        lblIt44 = new javax.swing.JLabel();
        txtItems3 = new javax.swing.JTextField();
        lblId10 = new javax.swing.JLabel();
        pnlItems5 = new java.awt.Panel();
        lblIt5 = new javax.swing.JLabel();
        lblIt51 = new javax.swing.JLabel();
        lblIt52 = new javax.swing.JLabel();
        lblIt53 = new javax.swing.JLabel();
        comItems2 = new javax.swing.JComboBox<>();
        lblIt54 = new javax.swing.JLabel();
        txtItems2 = new javax.swing.JTextField();
        lblId8 = new javax.swing.JLabel();
        pnlItems6 = new java.awt.Panel();
        lblIt6 = new javax.swing.JLabel();
        lblIt61 = new javax.swing.JLabel();
        lblIt62 = new javax.swing.JLabel();
        lblIt63 = new javax.swing.JLabel();
        comItems1 = new javax.swing.JComboBox<>();
        lblIt64 = new javax.swing.JLabel();
        txtItems1 = new javax.swing.JTextField();
        lblId7 = new javax.swing.JLabel();
        lblNext = new javax.swing.JLabel();
        cardSide02 = new java.awt.Panel();
        pnlItems7 = new java.awt.Panel();
        lblIt7 = new javax.swing.JLabel();
        lblIt71 = new javax.swing.JLabel();
        lblIt72 = new javax.swing.JLabel();
        lblIt73 = new javax.swing.JLabel();
        comItems12 = new javax.swing.JComboBox<>();
        lblIt74 = new javax.swing.JLabel();
        txtItems12 = new javax.swing.JTextField();
        lblId6 = new javax.swing.JLabel();
        pnlItems8 = new java.awt.Panel();
        lblIt8 = new javax.swing.JLabel();
        lblIt81 = new javax.swing.JLabel();
        lblIt82 = new javax.swing.JLabel();
        lblIt83 = new javax.swing.JLabel();
        comItems11 = new javax.swing.JComboBox<>();
        lblIt84 = new javax.swing.JLabel();
        txtItems11 = new javax.swing.JTextField();
        lblId5 = new javax.swing.JLabel();
        pnlItems9 = new java.awt.Panel();
        lblIt9 = new javax.swing.JLabel();
        lblIt91 = new javax.swing.JLabel();
        lblIt92 = new javax.swing.JLabel();
        lblIt93 = new javax.swing.JLabel();
        comItems10 = new javax.swing.JComboBox<>();
        lblIt94 = new javax.swing.JLabel();
        txtItems10 = new javax.swing.JTextField();
        lblId3 = new javax.swing.JLabel();
        pnlItems10 = new java.awt.Panel();
        lblIt10 = new javax.swing.JLabel();
        lblIt101 = new javax.swing.JLabel();
        lblIt102 = new javax.swing.JLabel();
        lblIt103 = new javax.swing.JLabel();
        comItems9 = new javax.swing.JComboBox<>();
        lblIt104 = new javax.swing.JLabel();
        txtItems9 = new javax.swing.JTextField();
        lblId4 = new javax.swing.JLabel();
        pnlItems11 = new java.awt.Panel();
        lblIt11H = new javax.swing.JLabel();
        lblIt111 = new javax.swing.JLabel();
        lblIt112 = new javax.swing.JLabel();
        lblIt113 = new javax.swing.JLabel();
        comItems8 = new javax.swing.JComboBox<>();
        lblIt114 = new javax.swing.JLabel();
        txtItems8 = new javax.swing.JTextField();
        lblId2 = new javax.swing.JLabel();
        pnlItems12 = new java.awt.Panel();
        lblIt12H = new javax.swing.JLabel();
        lblIt121 = new javax.swing.JLabel();
        lblIt122 = new javax.swing.JLabel();
        lblIt123 = new javax.swing.JLabel();
        comItems7 = new javax.swing.JComboBox<>();
        lblIt124 = new javax.swing.JLabel();
        txtItems7 = new javax.swing.JTextField();
        lblId1 = new javax.swing.JLabel();
        lblBack = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        panel1.setBackground(new java.awt.Color(0, 51, 51));
        panel1.setForeground(new java.awt.Color(43, 122, 120));
        panel1.setToolTipText("");

        panel2.setBackground(new java.awt.Color(58, 175, 169));
        panel2.setForeground(new java.awt.Color(58, 175, 169));
        panel2.setToolTipText("");

        pnlCardDashborad.setBackground(new java.awt.Color(58, 175, 169));

        lblMenuDashboard.setBackground(new java.awt.Color(43, 122, 120));
        lblMenuDashboard.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        lblMenuDashboard.setForeground(new java.awt.Color(254, 255, 255));
        lblMenuDashboard.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMenuDashboard.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic_&_Icons/dashboard1.png"))); // NOI18N
        lblMenuDashboard.setText("   Dashboard");
        lblMenuDashboard.setToolTipText("");
        lblMenuDashboard.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 4, 1, 0, new java.awt.Color(0, 0, 0)));
        lblMenuDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuDashboardMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlCardDashboradLayout = new javax.swing.GroupLayout(pnlCardDashborad);
        pnlCardDashborad.setLayout(pnlCardDashboradLayout);
        pnlCardDashboradLayout.setHorizontalGroup(
            pnlCardDashboradLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCardDashboradLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenuDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlCardDashboradLayout.setVerticalGroup(
            pnlCardDashboradLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMenuDashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        pnlCardOrdering.setBackground(new java.awt.Color(58, 175, 169));

        lblMenuOrdering.setBackground(new java.awt.Color(43, 122, 120));
        lblMenuOrdering.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        lblMenuOrdering.setForeground(new java.awt.Color(254, 255, 255));
        lblMenuOrdering.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMenuOrdering.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic_&_Icons/dashboard1.png"))); // NOI18N
        lblMenuOrdering.setText("   Ordering");
        lblMenuOrdering.setToolTipText("");
        lblMenuOrdering.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 4, 1, 0, new java.awt.Color(0, 0, 0)));
        lblMenuOrdering.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuOrderingMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlCardOrderingLayout = new javax.swing.GroupLayout(pnlCardOrdering);
        pnlCardOrdering.setLayout(pnlCardOrderingLayout);
        pnlCardOrderingLayout.setHorizontalGroup(
            pnlCardOrderingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCardOrderingLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenuOrdering, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlCardOrderingLayout.setVerticalGroup(
            pnlCardOrderingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMenuOrdering, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );

        pnlCardLogout.setBackground(new java.awt.Color(58, 175, 169));

        lblMenuLogout.setBackground(new java.awt.Color(43, 122, 120));
        lblMenuLogout.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        lblMenuLogout.setForeground(new java.awt.Color(254, 255, 255));
        lblMenuLogout.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMenuLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic_&_Icons/LogoutDash.png"))); // NOI18N
        lblMenuLogout.setText("   LogOut");
        lblMenuLogout.setToolTipText("");
        lblMenuLogout.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 4, 1, 0, new java.awt.Color(0, 0, 0)));
        lblMenuLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuLogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlCardLogoutLayout = new javax.swing.GroupLayout(pnlCardLogout);
        pnlCardLogout.setLayout(pnlCardLogoutLayout);
        pnlCardLogoutLayout.setHorizontalGroup(
            pnlCardLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCardLogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenuLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlCardLogoutLayout.setVerticalGroup(
            pnlCardLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMenuLogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pnlSideAccountDetails.setBackground(new java.awt.Color(58, 175, 169));

        lblPerfilePic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPerfilePic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic_&_Icons/peopleDash.png"))); // NOI18N

        lblHed1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblHed1.setForeground(new java.awt.Color(254, 255, 255));
        lblHed1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHed1.setText("Name :");
        lblHed1.setToolTipText("");

        lblHed2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblHed2.setForeground(new java.awt.Color(254, 255, 255));
        lblHed2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHed2.setText("USER ID :");

        lblUserName.setBackground(new java.awt.Color(222, 242, 241));
        lblUserName.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(222, 242, 241));
        lblUserName.setText("Mahesh");
        lblUserName.setToolTipText("");

        lblUserId.setFont(new java.awt.Font("Segoe Print", 1, 12)); // NOI18N
        lblUserId.setForeground(new java.awt.Color(222, 242, 241));
        lblUserId.setText("1000");
        lblUserId.setToolTipText("");

        lblHed3.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        lblHed3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHed3.setText("Welcome To Orio Ice Cream");

        lblHed4.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        lblHed4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHed4.setText("Point Of Sales Software");

        javax.swing.GroupLayout pnlSideAccountDetailsLayout = new javax.swing.GroupLayout(pnlSideAccountDetails);
        pnlSideAccountDetails.setLayout(pnlSideAccountDetailsLayout);
        pnlSideAccountDetailsLayout.setHorizontalGroup(
            pnlSideAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideAccountDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSideAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSideAccountDetailsLayout.createSequentialGroup()
                        .addComponent(lblPerfilePic, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlSideAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblHed2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHed1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlSideAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUserId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSideAccountDetailsLayout.createSequentialGroup()
                        .addGroup(pnlSideAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHed4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHed3, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        pnlSideAccountDetailsLayout.setVerticalGroup(
            pnlSideAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideAccountDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSideAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPerfilePic, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSideAccountDetailsLayout.createSequentialGroup()
                        .addGroup(pnlSideAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHed1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlSideAccountDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblHed2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblHed3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblHed4)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlCardOrdering, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlCardDashborad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlSideAccountDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(panel2Layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addComponent(pnlCardLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSideAccountDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(pnlCardDashborad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(pnlCardOrdering, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlCardLogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic_&_Icons/ExitDash.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        panel3.setBackground(new java.awt.Color(58, 175, 169));
        panel3.setLayout(new java.awt.CardLayout());

        subPnlDashborad.setBackground(new java.awt.Color(0, 153, 153));
        subPnlDashborad.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        subPnlDashborad.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 650, 520));

        panel3.add(subPnlDashborad, "card3");

        subPnlOrdering.setBackground(new java.awt.Color(58, 175, 169));
        subPnlOrdering.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        spnlOrderBackground.setBackground(new java.awt.Color(255, 255, 255));
        spnlOrderBackground.setForeground(new java.awt.Color(255, 255, 255));
        spnlOrderBackground.setToolTipText("");

        tblOrderList.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(43, 122, 120)));
        tblOrderList.setFont(new java.awt.Font("Sitka Text", 1, 13)); // NOI18N
        tblOrderList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product_ID", "Name", "Quantity", "Total_Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblOrderList.setName(""); // NOI18N
        spnlOrderBackground.setViewportView(tblOrderList);

        subPnlOrdering.add(spnlOrderBackground, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 6, 297, 285));

        lblOrd1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblOrd1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOrd1.setText("Total :");
        subPnlOrdering.add(lblOrd1, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 318, 118, 35));

        lblOrd2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblOrd2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOrd2.setText("Amount :");
        subPnlOrdering.add(lblOrd2, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 360, 118, 33));

        lblOrd3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblOrd3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblOrd3.setText("Change :");
        subPnlOrdering.add(lblOrd3, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 400, 118, 31));

        lblOrderTotal.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        lblOrderTotal.setText("RS:0.00");
        subPnlOrdering.add(lblOrderTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 317, 118, 35));

        txtOrderAmount.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        subPnlOrdering.add(txtOrderAmount, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 359, 118, 33));

        lblOrderChange.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        lblOrderChange.setText("RS:0.00");
        subPnlOrdering.add(lblOrderChange, new org.netbeans.lib.awtextra.AbsoluteConstraints(523, 399, 118, 31));

        btnOrderPay.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        btnOrderPay.setText("PAY");
        btnOrderPay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnOrderPay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrderPayMouseClicked(evt);
            }
        });
        subPnlOrdering.add(btnOrderPay, new org.netbeans.lib.awtextra.AbsoluteConstraints(393, 449, 297, 32));

        btnOrderRemove.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        btnOrderRemove.setText("Remove");
        btnOrderRemove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrderRemoveMouseClicked(evt);
            }
        });
        subPnlOrdering.add(btnOrderRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 500, 90, 33));

        pnlMainItems.setBackground(new java.awt.Color(43, 122, 120));
        pnlMainItems.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlMainItemsMouseExited(evt);
            }
        });
        pnlMainItems.setLayout(new java.awt.CardLayout());

        cardSide01.setBackground(new java.awt.Color(58, 175, 169));
        cardSide01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cardSide01MouseExited(evt);
            }
        });
        cardSide01.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlItems1.setBackground(new java.awt.Color(58, 175, 169));
        pnlItems1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblIt1.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        lblIt1.setForeground(new java.awt.Color(254, 255, 255));
        lblIt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIt1.setText("Name");
        lblIt1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));

        lblIt11.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        lblIt11.setText("Price");

        lblIt12.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblIt12.setText("RS:0.00");

        lblIt13.setText("Quantity");

        comItems6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        comItems6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comItems6ActionPerformed(evt);
            }
        });

        lblIt14.setText("Purchase");

        lblId12.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        lblId12.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout pnlItems1Layout = new javax.swing.GroupLayout(pnlItems1);
        pnlItems1.setLayout(pnlItems1Layout);
        pnlItems1Layout.setHorizontalGroup(
            pnlItems1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItems1Layout.createSequentialGroup()
                .addGroup(pnlItems1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIt1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlItems1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlItems1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlItems1Layout.createSequentialGroup()
                                .addComponent(lblIt13, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comItems6, 0, 81, Short.MAX_VALUE))
                            .addGroup(pnlItems1Layout.createSequentialGroup()
                                .addComponent(lblIt11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblIt12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlItems1Layout.createSequentialGroup()
                                .addComponent(lblIt14, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtItems6))))
                    .addComponent(lblId12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlItems1Layout.setVerticalGroup(
            pnlItems1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItems1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIt1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlItems1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIt12, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlItems1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt13)
                    .addComponent(comItems6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlItems1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt14)
                    .addComponent(txtItems6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblId12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        cardSide01.add(pnlItems1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 170, 160));

        pnlItems2.setBackground(new java.awt.Color(58, 175, 169));
        pnlItems2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblIt2.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        lblIt2.setForeground(new java.awt.Color(254, 255, 255));
        lblIt2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIt2.setText("Name");
        lblIt2.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));

        lblIt21.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        lblIt21.setText("Price");

        lblIt22.setText("RS:0.00");

        lblIt23.setText("Quantity");

        comItems5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        comItems5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comItems5ActionPerformed(evt);
            }
        });

        lblIt24.setText("Purchase");

        lblId11.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        lblId11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout pnlItems2Layout = new javax.swing.GroupLayout(pnlItems2);
        pnlItems2.setLayout(pnlItems2Layout);
        pnlItems2Layout.setHorizontalGroup(
            pnlItems2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItems2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlItems2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlItems2Layout.createSequentialGroup()
                        .addComponent(lblIt21, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblIt22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblIt2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlItems2Layout.createSequentialGroup()
                        .addGroup(pnlItems2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblIt24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(lblIt23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlItems2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comItems5, 0, 79, Short.MAX_VALUE)
                            .addComponent(txtItems5)))
                    .addComponent(lblId11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlItems2Layout.setVerticalGroup(
            pnlItems2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItems2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIt2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlItems2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt21, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIt22, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlItems2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt23)
                    .addComponent(comItems5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlItems2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt24)
                    .addComponent(txtItems5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblId11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(9, Short.MAX_VALUE))
        );

        cardSide01.add(pnlItems2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 170, 160));

        pnlItems3.setBackground(new java.awt.Color(58, 175, 169));
        pnlItems3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblIt3.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        lblIt3.setForeground(new java.awt.Color(254, 255, 255));
        lblIt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIt3.setText("Name");
        lblIt3.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));

        lblIt31.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        lblIt31.setText("Price");

        lblIt32.setText("RS:0.00");

        lblIt33.setText("Quantity");

        comItems4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        comItems4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comItems4ActionPerformed(evt);
            }
        });

        lblIt34.setText("Purchase");

        lblId9.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        lblId9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout pnlItems3Layout = new javax.swing.GroupLayout(pnlItems3);
        pnlItems3.setLayout(pnlItems3Layout);
        pnlItems3Layout.setHorizontalGroup(
            pnlItems3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItems3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlItems3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlItems3Layout.createSequentialGroup()
                        .addComponent(lblId9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlItems3Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblIt31, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblIt32, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblIt3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlItems3Layout.createSequentialGroup()
                        .addGroup(pnlItems3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblIt34, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(lblIt33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlItems3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comItems4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtItems4)))))
        );
        pnlItems3Layout.setVerticalGroup(
            pnlItems3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItems3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIt3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlItems3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt31, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIt32, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlItems3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt33)
                    .addComponent(comItems4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlItems3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt34)
                    .addComponent(txtItems4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblId9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        cardSide01.add(pnlItems3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 170, 160));

        pnlItems4.setBackground(new java.awt.Color(58, 175, 169));
        pnlItems4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblIt4.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        lblIt4.setForeground(new java.awt.Color(254, 255, 255));
        lblIt4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIt4.setText("Name");
        lblIt4.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));

        lblIt41.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        lblIt41.setText("Price");

        lblIt42.setText("RS:0.00");

        lblIt43.setText("Quantity");

        comItems3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        comItems3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comItems3ActionPerformed(evt);
            }
        });

        lblIt44.setText("Purchase");

        lblId10.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        lblId10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout pnlItems4Layout = new javax.swing.GroupLayout(pnlItems4);
        pnlItems4.setLayout(pnlItems4Layout);
        pnlItems4Layout.setHorizontalGroup(
            pnlItems4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItems4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlItems4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlItems4Layout.createSequentialGroup()
                        .addComponent(lblIt41, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblIt42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblIt4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlItems4Layout.createSequentialGroup()
                        .addGroup(pnlItems4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblIt44, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                            .addComponent(lblIt43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlItems4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comItems3, 0, 82, Short.MAX_VALUE)
                            .addComponent(txtItems3)))
                    .addComponent(lblId10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlItems4Layout.setVerticalGroup(
            pnlItems4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItems4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIt4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlItems4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt41, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIt42, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlItems4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt43)
                    .addComponent(comItems3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlItems4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt44)
                    .addComponent(txtItems3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblId10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        cardSide01.add(pnlItems4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 170, 160));

        pnlItems5.setBackground(new java.awt.Color(58, 175, 169));
        pnlItems5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblIt5.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        lblIt5.setForeground(new java.awt.Color(254, 255, 255));
        lblIt5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIt5.setText("Vanila");
        lblIt5.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));

        lblIt51.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        lblIt51.setText("Price");

        lblIt52.setText("RS:0.00");

        lblIt53.setText("Quantity");

        comItems2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        comItems2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comItems2ActionPerformed(evt);
            }
        });

        lblIt54.setText("Purchase");

        lblId8.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        lblId8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout pnlItems5Layout = new javax.swing.GroupLayout(pnlItems5);
        pnlItems5.setLayout(pnlItems5Layout);
        pnlItems5Layout.setHorizontalGroup(
            pnlItems5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItems5Layout.createSequentialGroup()
                .addGroup(pnlItems5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIt5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlItems5Layout.createSequentialGroup()
                        .addGroup(pnlItems5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblIt54, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(lblIt51, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIt53, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(pnlItems5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblIt52, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comItems2, 0, 80, Short.MAX_VALUE)
                            .addComponent(txtItems2)))
                    .addComponent(lblId8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlItems5Layout.setVerticalGroup(
            pnlItems5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItems5Layout.createSequentialGroup()
                .addComponent(lblIt5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlItems5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt51, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIt52, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlItems5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt53)
                    .addComponent(comItems2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlItems5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt54)
                    .addComponent(txtItems2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblId8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 14, Short.MAX_VALUE))
        );

        cardSide01.add(pnlItems5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 170, 160));

        pnlItems6.setBackground(new java.awt.Color(58, 175, 169));
        pnlItems6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblIt6.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        lblIt6.setForeground(new java.awt.Color(254, 255, 255));
        lblIt6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIt6.setText("Cocolate");
        lblIt6.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));

        lblIt61.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        lblIt61.setText("Price");

        lblIt62.setText("RS:0.00");

        lblIt63.setText("Quantity");

        comItems1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        comItems1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comItems1ItemStateChanged(evt);
            }
        });
        comItems1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comItems1FocusLost(evt);
            }
        });
        comItems1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comItems1ActionPerformed(evt);
            }
        });

        lblIt64.setText("Purchase");

        lblId7.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        lblId7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout pnlItems6Layout = new javax.swing.GroupLayout(pnlItems6);
        pnlItems6.setLayout(pnlItems6Layout);
        pnlItems6Layout.setHorizontalGroup(
            pnlItems6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItems6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlItems6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIt6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlItems6Layout.createSequentialGroup()
                        .addGroup(pnlItems6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIt61, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIt63, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIt64, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlItems6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtItems1)
                            .addComponent(comItems1, 0, 78, Short.MAX_VALUE)
                            .addComponent(lblIt62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblId7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlItems6Layout.setVerticalGroup(
            pnlItems6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItems6Layout.createSequentialGroup()
                .addComponent(lblIt6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlItems6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt61, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIt62, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlItems6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt63, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comItems1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlItems6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt64)
                    .addComponent(txtItems1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblId7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        cardSide01.add(pnlItems6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 160));

        lblNext.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblNext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic_&_Icons/next.png"))); // NOI18N
        lblNext.setText("Next");
        lblNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblNextMouseClicked(evt);
            }
        });
        cardSide01.add(lblNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(275, 516, 90, 30));

        pnlMainItems.add(cardSide01, "card2");

        cardSide02.setBackground(new java.awt.Color(58, 175, 169));
        cardSide02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cardSide02MouseExited(evt);
            }
        });
        cardSide02.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlItems7.setBackground(new java.awt.Color(58, 175, 169));
        pnlItems7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblIt7.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        lblIt7.setForeground(new java.awt.Color(254, 255, 255));
        lblIt7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIt7.setText("Name");
        lblIt7.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));

        lblIt71.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        lblIt71.setText("Price");

        lblIt72.setFont(new java.awt.Font("Segoe UI Semibold", 1, 12)); // NOI18N
        lblIt72.setText("RS:0.00");

        lblIt73.setText("Quantity");

        comItems12.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        comItems12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comItems12ActionPerformed(evt);
            }
        });

        lblIt74.setText("Purchase");

        lblId6.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        lblId6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout pnlItems7Layout = new javax.swing.GroupLayout(pnlItems7);
        pnlItems7.setLayout(pnlItems7Layout);
        pnlItems7Layout.setHorizontalGroup(
            pnlItems7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlItems7Layout.createSequentialGroup()
                .addGroup(pnlItems7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIt7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlItems7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlItems7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblId6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlItems7Layout.createSequentialGroup()
                                .addComponent(lblIt73, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comItems12, 0, 81, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlItems7Layout.createSequentialGroup()
                                .addComponent(lblIt71, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblIt72, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlItems7Layout.createSequentialGroup()
                                .addComponent(lblIt74, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtItems12)))))
                .addContainerGap())
        );
        pnlItems7Layout.setVerticalGroup(
            pnlItems7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItems7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIt7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlItems7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt71, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIt72, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlItems7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt73)
                    .addComponent(comItems12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlItems7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt74)
                    .addComponent(txtItems12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblId6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        cardSide02.add(pnlItems7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 170, 150));

        pnlItems8.setBackground(new java.awt.Color(58, 175, 169));
        pnlItems8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblIt8.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        lblIt8.setForeground(new java.awt.Color(254, 255, 255));
        lblIt8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIt8.setText("Name");
        lblIt8.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));

        lblIt81.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        lblIt81.setText("Price");

        lblIt82.setText("RS:0.00");

        lblIt83.setText("Quantity");

        comItems11.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        comItems11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comItems11ActionPerformed(evt);
            }
        });

        lblIt84.setText("Purchase");

        lblId5.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        lblId5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout pnlItems8Layout = new javax.swing.GroupLayout(pnlItems8);
        pnlItems8.setLayout(pnlItems8Layout);
        pnlItems8Layout.setHorizontalGroup(
            pnlItems8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItems8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlItems8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlItems8Layout.createSequentialGroup()
                        .addComponent(lblIt81, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblIt82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblIt8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlItems8Layout.createSequentialGroup()
                        .addGroup(pnlItems8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblIt84, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(lblIt83, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlItems8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comItems11, 0, 79, Short.MAX_VALUE)
                            .addComponent(txtItems11)))
                    .addComponent(lblId5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlItems8Layout.setVerticalGroup(
            pnlItems8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItems8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIt8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlItems8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt81, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIt82, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlItems8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt83)
                    .addComponent(comItems11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlItems8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt84)
                    .addComponent(txtItems11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblId5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        cardSide02.add(pnlItems8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 170, 150));

        pnlItems9.setBackground(new java.awt.Color(58, 175, 169));
        pnlItems9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblIt9.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        lblIt9.setForeground(new java.awt.Color(254, 255, 255));
        lblIt9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIt9.setText("Name");
        lblIt9.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));

        lblIt91.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        lblIt91.setText("Price");

        lblIt92.setText("RS:0.00");

        lblIt93.setText("Quantity");

        comItems10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        comItems10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comItems10ActionPerformed(evt);
            }
        });

        lblIt94.setText("Purchase");

        txtItems10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtItems10ActionPerformed(evt);
            }
        });

        lblId3.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        lblId3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout pnlItems9Layout = new javax.swing.GroupLayout(pnlItems9);
        pnlItems9.setLayout(pnlItems9Layout);
        pnlItems9Layout.setHorizontalGroup(
            pnlItems9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItems9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlItems9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlItems9Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblIt91, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblIt92, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblIt9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlItems9Layout.createSequentialGroup()
                        .addGroup(pnlItems9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblIt94, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(lblIt93, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlItems9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comItems10, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtItems10)))
                    .addComponent(lblId3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlItems9Layout.setVerticalGroup(
            pnlItems9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItems9Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIt9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlItems9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt91, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIt92, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlItems9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt93)
                    .addComponent(comItems10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlItems9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt94)
                    .addComponent(txtItems10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblId3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        cardSide02.add(pnlItems9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 170, 160));

        pnlItems10.setBackground(new java.awt.Color(58, 175, 169));
        pnlItems10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblIt10.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        lblIt10.setForeground(new java.awt.Color(254, 255, 255));
        lblIt10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIt10.setText("Name");
        lblIt10.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));

        lblIt101.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        lblIt101.setText("Price");

        lblIt102.setText("RS:0.00");

        lblIt103.setText("Quantity");

        comItems9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        comItems9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comItems9ActionPerformed(evt);
            }
        });

        lblIt104.setText("Purchase");

        lblId4.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        lblId4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout pnlItems10Layout = new javax.swing.GroupLayout(pnlItems10);
        pnlItems10.setLayout(pnlItems10Layout);
        pnlItems10Layout.setHorizontalGroup(
            pnlItems10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItems10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlItems10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlItems10Layout.createSequentialGroup()
                        .addComponent(lblIt101, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblIt102, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblIt10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlItems10Layout.createSequentialGroup()
                        .addGroup(pnlItems10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblIt104, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                            .addComponent(lblIt103, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlItems10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comItems9, 0, 82, Short.MAX_VALUE)
                            .addComponent(txtItems9)))
                    .addComponent(lblId4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlItems10Layout.setVerticalGroup(
            pnlItems10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItems10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblIt10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlItems10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt101, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIt102, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlItems10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt103)
                    .addComponent(comItems9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlItems10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt104)
                    .addComponent(txtItems9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblId4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        cardSide02.add(pnlItems10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 170, 160));

        pnlItems11.setBackground(new java.awt.Color(58, 175, 169));
        pnlItems11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblIt11H.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        lblIt11H.setForeground(new java.awt.Color(254, 255, 255));
        lblIt11H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIt11H.setText("Vanila");
        lblIt11H.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));

        lblIt111.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        lblIt111.setText("Price");

        lblIt112.setText("RS:0.00");

        lblIt113.setText("Quantity");

        comItems8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        comItems8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comItems8ActionPerformed(evt);
            }
        });

        lblIt114.setText("Purchase");

        lblId2.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        lblId2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout pnlItems11Layout = new javax.swing.GroupLayout(pnlItems11);
        pnlItems11.setLayout(pnlItems11Layout);
        pnlItems11Layout.setHorizontalGroup(
            pnlItems11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItems11Layout.createSequentialGroup()
                .addGroup(pnlItems11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIt11H, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlItems11Layout.createSequentialGroup()
                        .addGroup(pnlItems11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblIt114, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                            .addComponent(lblIt111, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblIt113, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(pnlItems11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(comItems8, 0, 80, Short.MAX_VALUE)
                            .addComponent(txtItems8)
                            .addComponent(lblIt112, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblId2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlItems11Layout.setVerticalGroup(
            pnlItems11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItems11Layout.createSequentialGroup()
                .addComponent(lblIt11H, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlItems11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt111, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIt112, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlItems11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt113)
                    .addComponent(comItems8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlItems11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt114)
                    .addComponent(txtItems8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblId2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cardSide02.add(pnlItems11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 170, 150));

        pnlItems12.setBackground(new java.awt.Color(58, 175, 169));
        pnlItems12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblIt12H.setFont(new java.awt.Font("OCR A Extended", 1, 14)); // NOI18N
        lblIt12H.setForeground(new java.awt.Color(254, 255, 255));
        lblIt12H.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIt12H.setText("Strobary");
        lblIt12H.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 0, 2, new java.awt.Color(0, 0, 0)));

        lblIt121.setFont(new java.awt.Font("Segoe UI Black", 0, 13)); // NOI18N
        lblIt121.setText("Price");

        lblIt122.setText("RS:0.00");

        lblIt123.setText("Quantity");

        comItems7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        comItems7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comItems7ActionPerformed(evt);
            }
        });

        lblIt124.setText("Purchase");

        lblId1.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        lblId1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout pnlItems12Layout = new javax.swing.GroupLayout(pnlItems12);
        pnlItems12.setLayout(pnlItems12Layout);
        pnlItems12Layout.setHorizontalGroup(
            pnlItems12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItems12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlItems12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblIt12H, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlItems12Layout.createSequentialGroup()
                        .addGroup(pnlItems12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIt121, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIt123, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIt124, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlItems12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtItems7)
                            .addComponent(comItems7, 0, 78, Short.MAX_VALUE)
                            .addComponent(lblIt122, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblId1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnlItems12Layout.setVerticalGroup(
            pnlItems12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItems12Layout.createSequentialGroup()
                .addComponent(lblIt12H, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlItems12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt121, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIt122, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlItems12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt123, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comItems7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlItems12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt124)
                    .addComponent(txtItems7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblId1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cardSide02.add(pnlItems12, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 150));

        lblBack.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic_&_Icons/back.png"))); // NOI18N
        lblBack.setText("Back");
        lblBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblBackMouseClicked(evt);
            }
        });
        cardSide02.add(lblBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 100, 30));

        pnlMainItems.add(cardSide02, "card3");

        subPnlOrdering.add(pnlMainItems, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 370, 550));

        panel3.add(subPnlOrdering, "card6");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblMenuDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuDashboardMouseClicked
        selectButton(pnlCardDashborad,subPnlDashborad);
        notSelectButton(pnlCardOrdering,subPnlOrdering);
        

        /*subPnlDashboard.setVisible(true);
        subPnlReport.setVisible(false);
        subPnlProduct.setVisible(false);
        subPnlSettings.setVisible(false);
        subPnlOrdering.setVisible(false);*/
    }//GEN-LAST:event_lblMenuDashboardMouseClicked

    private void selectButton(Panel lbl,Panel pnl) {
        lbl.setBackground(new Color(43,122,120));
        
        pnl.setVisible(true);
        
    }

    private void notSelectButton(Panel lbl,Panel pnl) {
        lbl.setBackground(new Color(58,175,169));
        pnl.setVisible(false);
    }
    
    private void lblMenuOrderingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuOrderingMouseClicked
        selectButton(pnlCardOrdering,subPnlOrdering);
        notSelectButton(pnlCardDashborad,subPnlDashborad);
        
        
        
        
        
    }//GEN-LAST:event_lblMenuOrderingMouseClicked

    private void lblMenuLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuLogoutMouseClicked
        LoginForm log=new LoginForm();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblMenuLogoutMouseClicked

    private void lblNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextMouseClicked
        cardSide02.setVisible(true);
        cardSide01.setVisible(false);
    }//GEN-LAST:event_lblNextMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        cardSide02.setVisible(false);
        cardSide01.setVisible(true);
    }//GEN-LAST:event_lblBackMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
    }//GEN-LAST:event_jLabel1MouseClicked
    StockClass sk=new StockClass();
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        setVisiblePanel();
        sk.coneWeightGet();
        lblUserId.setText(""+userIdAccess);
        lblUserName.setText(userNameAccess);
        
        
        try{
        
        BufferedImage bi = ImageIO.read(new File("D:/Orio_IceCream_POS/Group_09_POS/src/Pic_&_Icons/c6cb0ae6-714a-49e2-9bf9-6e4bbb4963d8.jpg"));
            Image img = bi.getScaledInstance(700, 800, Image.SCALE_SMOOTH); //SET FILE AND SET SIZE[313, 276]

            ImageIcon icon = new ImageIcon(img);
            jLabel2.setIcon(icon);
            
        }catch(Exception e){
            System.out.println("err icons");
        }
    }//GEN-LAST:event_formWindowOpened

    private void comItems1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comItems1ItemStateChanged
        
        
    }//GEN-LAST:event_comItems1ItemStateChanged

    private void comItems1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comItems1FocusLost
        
    }//GEN-LAST:event_comItems1FocusLost
    ProductClass prrr=new ProductClass();
    private void comItems1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comItems1ActionPerformed
        
        prrr.getProduct(lblIt6,lblId7,lblIt62,comItems1,txtItems1 ,tblOrderList );
        
        
    }//GEN-LAST:event_comItems1ActionPerformed

    private void comItems2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comItems2ActionPerformed
        
        prrr.getProduct(lblIt5,lblId8,lblIt52,comItems2,txtItems2 ,tblOrderList);
        
    }//GEN-LAST:event_comItems2ActionPerformed

    private void comItems3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comItems3ActionPerformed
        
        prrr.getProduct(lblIt4,lblId10,lblIt42,comItems3,txtItems3 ,tblOrderList );
        
    }//GEN-LAST:event_comItems3ActionPerformed

    private void comItems4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comItems4ActionPerformed
        prrr.getProduct(lblIt3,lblId9,lblIt32,comItems4,txtItems4 ,tblOrderList );
        
    }//GEN-LAST:event_comItems4ActionPerformed

    private void comItems5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comItems5ActionPerformed
        prrr.getProduct(lblIt2,lblId11,lblIt22,comItems5,txtItems5 ,tblOrderList );
        
    }//GEN-LAST:event_comItems5ActionPerformed

    private void comItems6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comItems6ActionPerformed
        prrr.getProduct(lblIt1,lblId12,lblIt12,comItems6,txtItems6 ,tblOrderList );
        
    }//GEN-LAST:event_comItems6ActionPerformed

    private void comItems7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comItems7ActionPerformed
        prrr.getProduct(lblIt12H,lblId1,lblIt122,comItems7,txtItems7 ,tblOrderList );
        
    }//GEN-LAST:event_comItems7ActionPerformed

    private void comItems8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comItems8ActionPerformed
        prrr.getProduct(lblIt11H,lblId2,lblIt112,comItems8,txtItems8 ,tblOrderList );
        
    }//GEN-LAST:event_comItems8ActionPerformed

    private void comItems9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comItems9ActionPerformed
        prrr.getProduct(lblIt10,lblId4,lblIt102,comItems9,txtItems9 ,tblOrderList );
        
    }//GEN-LAST:event_comItems9ActionPerformed

    private void txtItems10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtItems10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtItems10ActionPerformed

    private void comItems10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comItems10ActionPerformed
        prrr.getProduct(lblIt9,lblId3,lblIt92,comItems10,txtItems10 ,tblOrderList );
        
    }//GEN-LAST:event_comItems10ActionPerformed

    private void comItems11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comItems11ActionPerformed
        prrr.getProduct(lblIt8,lblId5,lblIt82,comItems11,txtItems11 ,tblOrderList );
        
    }//GEN-LAST:event_comItems11ActionPerformed

    private void comItems12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comItems12ActionPerformed
        prrr.getProduct(lblIt7,lblId6,lblIt72,comItems12,txtItems12 ,tblOrderList );
        
    }//GEN-LAST:event_comItems12ActionPerformed

    private void pnlMainItemsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMainItemsMouseExited
        
    }//GEN-LAST:event_pnlMainItemsMouseExited

    private void cardSide01MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardSide01MouseExited
        prrr.calTotalOrder(lblOrderTotal,tblOrderList);
    }//GEN-LAST:event_cardSide01MouseExited

    private void cardSide02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardSide02MouseExited
        prrr.calTotalOrder(lblOrderTotal,tblOrderList);
    }//GEN-LAST:event_cardSide02MouseExited

    private void btnOrderPayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderPayMouseClicked
        prrr.payOrder(tblOrderList,lblOrderTotal,txtOrderAmount,lblOrderChange);
        
        
    }//GEN-LAST:event_btnOrderPayMouseClicked

    private void btnOrderRemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderRemoveMouseClicked
clearOrderData();       
prrr.loadSalesTotal();
    }//GEN-LAST:event_btnOrderRemoveMouseClicked

    private void DesignClorTable(JTable table){
        table.setGridColor(Color.decode("#2b7a78"));
        JTableHeader header=table.getTableHeader();
        header.setBackground(Color.decode("#2b7a78"));
        header.setForeground(Color.WHITE);
        table.setRowHeight(25);
    }
    private void tableDesign(){
        tblOrderList.setDefaultRenderer(Object.class, new TableGradientCell());
        
        DesignClorTable(tblOrderList);
        
    }

    

    public void clearOrderData(){
        
            comItems1.setSelectedItem("0");
            txtItems1.setText("");
        
            comItems2.setSelectedItem("0");
            txtItems2.setText("");
        
            comItems3.setSelectedItem("0");
            txtItems3.setText("");
        
            comItems4.setSelectedItem("0");
            txtItems4.setText("");
        
            comItems5.setSelectedItem("0");
            txtItems5.setText("");
        
            comItems6.setSelectedItem("0");
            txtItems6.setText("");
        
            comItems7.setSelectedItem("0");
            txtItems7.setText("");
        
            comItems8.setSelectedItem("0");
            txtItems8.setText("");
        
            comItems9.setSelectedItem("0");
            txtItems9.setText("");
       
           
            comItems10.setSelectedItem("0");
            txtItems10.setText("");
       
            comItems11.setSelectedItem("0");
            txtItems11.setText("");
        
            comItems12.setSelectedItem("0");
            txtItems12.setText("");
            DefaultTableModel dt = (DefaultTableModel) tblOrderList.getModel();
            try{
           while(dt.getRowCount() >=0) {
                
                    dt.removeRow(0);
            }
            }catch(Exception e){
                System.out.println("come err clear orders");
            }
        }
     
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CashierForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOrderPay;
    private javax.swing.JButton btnOrderRemove;
    private java.awt.Panel cardSide01;
    private java.awt.Panel cardSide02;
    private javax.swing.JComboBox<String> comItems1;
    private javax.swing.JComboBox<String> comItems10;
    private javax.swing.JComboBox<String> comItems11;
    private javax.swing.JComboBox<String> comItems12;
    private javax.swing.JComboBox<String> comItems2;
    private javax.swing.JComboBox<String> comItems3;
    private javax.swing.JComboBox<String> comItems4;
    private javax.swing.JComboBox<String> comItems5;
    private javax.swing.JComboBox<String> comItems6;
    private javax.swing.JComboBox<String> comItems7;
    private javax.swing.JComboBox<String> comItems8;
    private javax.swing.JComboBox<String> comItems9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    public javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblHed1;
    private javax.swing.JLabel lblHed2;
    private javax.swing.JLabel lblHed3;
    private javax.swing.JLabel lblHed4;
    private javax.swing.JLabel lblId1;
    private javax.swing.JLabel lblId10;
    private javax.swing.JLabel lblId11;
    private javax.swing.JLabel lblId12;
    private javax.swing.JLabel lblId2;
    private javax.swing.JLabel lblId3;
    private javax.swing.JLabel lblId4;
    private javax.swing.JLabel lblId5;
    private javax.swing.JLabel lblId6;
    private javax.swing.JLabel lblId7;
    private javax.swing.JLabel lblId8;
    private javax.swing.JLabel lblId9;
    private javax.swing.JLabel lblIt1;
    private javax.swing.JLabel lblIt10;
    private javax.swing.JLabel lblIt101;
    private javax.swing.JLabel lblIt102;
    private javax.swing.JLabel lblIt103;
    private javax.swing.JLabel lblIt104;
    private javax.swing.JLabel lblIt11;
    private javax.swing.JLabel lblIt111;
    private javax.swing.JLabel lblIt112;
    private javax.swing.JLabel lblIt113;
    private javax.swing.JLabel lblIt114;
    private javax.swing.JLabel lblIt11H;
    private javax.swing.JLabel lblIt12;
    private javax.swing.JLabel lblIt121;
    private javax.swing.JLabel lblIt122;
    private javax.swing.JLabel lblIt123;
    private javax.swing.JLabel lblIt124;
    private javax.swing.JLabel lblIt12H;
    private javax.swing.JLabel lblIt13;
    private javax.swing.JLabel lblIt14;
    private javax.swing.JLabel lblIt2;
    private javax.swing.JLabel lblIt21;
    private javax.swing.JLabel lblIt22;
    private javax.swing.JLabel lblIt23;
    private javax.swing.JLabel lblIt24;
    private javax.swing.JLabel lblIt3;
    private javax.swing.JLabel lblIt31;
    private javax.swing.JLabel lblIt32;
    private javax.swing.JLabel lblIt33;
    private javax.swing.JLabel lblIt34;
    private javax.swing.JLabel lblIt4;
    private javax.swing.JLabel lblIt41;
    private javax.swing.JLabel lblIt42;
    private javax.swing.JLabel lblIt43;
    private javax.swing.JLabel lblIt44;
    private javax.swing.JLabel lblIt5;
    private javax.swing.JLabel lblIt51;
    private javax.swing.JLabel lblIt52;
    private javax.swing.JLabel lblIt53;
    private javax.swing.JLabel lblIt54;
    private javax.swing.JLabel lblIt6;
    private javax.swing.JLabel lblIt61;
    private javax.swing.JLabel lblIt62;
    private javax.swing.JLabel lblIt63;
    private javax.swing.JLabel lblIt64;
    private javax.swing.JLabel lblIt7;
    private javax.swing.JLabel lblIt71;
    private javax.swing.JLabel lblIt72;
    private javax.swing.JLabel lblIt73;
    private javax.swing.JLabel lblIt74;
    private javax.swing.JLabel lblIt8;
    private javax.swing.JLabel lblIt81;
    private javax.swing.JLabel lblIt82;
    private javax.swing.JLabel lblIt83;
    private javax.swing.JLabel lblIt84;
    private javax.swing.JLabel lblIt9;
    private javax.swing.JLabel lblIt91;
    private javax.swing.JLabel lblIt92;
    private javax.swing.JLabel lblIt93;
    private javax.swing.JLabel lblIt94;
    private javax.swing.JLabel lblMenuDashboard;
    private javax.swing.JLabel lblMenuLogout;
    private javax.swing.JLabel lblMenuOrdering;
    public javax.swing.JLabel lblNext;
    private javax.swing.JLabel lblOrd1;
    private javax.swing.JLabel lblOrd2;
    private javax.swing.JLabel lblOrd3;
    private javax.swing.JLabel lblOrderChange;
    private javax.swing.JLabel lblOrderTotal;
    private javax.swing.JLabel lblPerfilePic;
    private javax.swing.JLabel lblUserId;
    private javax.swing.JLabel lblUserName;
    private ExternalJavaFile.Panel panel1;
    private ExternalJavaFile.Panel panel2;
    private java.awt.Panel panel3;
    public java.awt.Panel pnlCardDashborad;
    public java.awt.Panel pnlCardLogout;
    public java.awt.Panel pnlCardOrdering;
    public java.awt.Panel pnlItems1;
    public java.awt.Panel pnlItems10;
    public java.awt.Panel pnlItems11;
    public java.awt.Panel pnlItems12;
    public java.awt.Panel pnlItems2;
    public java.awt.Panel pnlItems3;
    public java.awt.Panel pnlItems4;
    public java.awt.Panel pnlItems5;
    public java.awt.Panel pnlItems6;
    public java.awt.Panel pnlItems7;
    public java.awt.Panel pnlItems8;
    public java.awt.Panel pnlItems9;
    private java.awt.Panel pnlMainItems;
    private java.awt.Panel pnlSideAccountDetails;
    private javax.swing.JScrollPane spnlOrderBackground;
    private java.awt.Panel subPnlDashborad;
    private java.awt.Panel subPnlOrdering;
    private javax.swing.JTable tblOrderList;
    private javax.swing.JTextField txtItems1;
    private javax.swing.JTextField txtItems10;
    private javax.swing.JTextField txtItems11;
    private javax.swing.JTextField txtItems12;
    private javax.swing.JTextField txtItems2;
    private javax.swing.JTextField txtItems3;
    private javax.swing.JTextField txtItems4;
    private javax.swing.JTextField txtItems5;
    private javax.swing.JTextField txtItems6;
    private javax.swing.JTextField txtItems7;
    private javax.swing.JTextField txtItems8;
    private javax.swing.JTextField txtItems9;
    private javax.swing.JTextField txtOrderAmount;
    // End of variables declaration//GEN-END:variables

}
