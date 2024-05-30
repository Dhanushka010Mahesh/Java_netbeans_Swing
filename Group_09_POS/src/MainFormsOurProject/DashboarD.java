package MainFormsOurProject;

import DatabaseConnection.ConnectionDB;


import java.sql.*;
import static DatabaseConnection.ConnectionDB.closeConnection;
import static DatabaseConnection.ConnectionDB.conn;
import static DatabaseConnection.ConnectionDB.openConnection;
import java.awt.Color;
import ExternalJavaFile.TableGradientCell;
import OOP.ProductClass;
import OOP.StockClass;
import static OOP.UserClass.userIdAccess;
import static OOP.UserClass.userNameAccess;
import java.awt.Image;
import java.awt.Panel;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.util.Vector;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

public class DashboarD extends javax.swing.JFrame {

    public DashboarD() {
        initComponents(); 
        tableDesign();
    }

    public String colorDark = "43,122,120";
    public String colorLittle = "58,175,169";
    public String fontColorHed = "43,122,120";
    public String fontColorNormal = "58,175,169";

    
    
    private void tableDesign(){
        testData(tblSalesDetails);
        tblSalesDetails.setDefaultRenderer(Object.class, new TableGradientCell());  
        tblSalesProductCount.setDefaultRenderer(Object.class, new TableGradientCell());
        tblStockProductQuantity.setDefaultRenderer(Object.class, new TableGradientCell());
        tblOrderList.setDefaultRenderer(Object.class, new TableGradientCell());
        tblProductList.setDefaultRenderer(Object.class, new TableGradientCell());
        tblEmpList.setDefaultRenderer(Object.class, new TableGradientCell());
        
        /*
        spnlSalesDetails.putClientProperty(FlatClientProperties.STYLE, ""
                + "border:3,0,3,0,$Table.background,10,10");
        spnlSalesDetails.getVerticalScrollBar().putClientProperty(FlatClientProperties.STYLE, ""
                + "hoverTrackColor:null");
        */
        DesignClorTable(tblSalesDetails);
        DesignClorTable(tblSalesProductCount);
        DesignClorTable(tblStockProductQuantity);
        DesignClorTable(tblOrderList);
        DesignClorTable(tblProductList);
        DesignClorTable(tblEmpList);
        
    }
    
    private void DesignClorTable(JTable table){
        table.setGridColor(Color.decode("#2b7a78"));
        JTableHeader header=table.getTableHeader();
        header.setBackground(Color.decode("#2b7a78"));
        header.setForeground(Color.WHITE);
        table.setRowHeight(25);
    }
    
    private void testData(JTable table){
        DefaultTableModel model=(DefaultTableModel)table.getModel();
        
        model.addRow(new Object[]{1, "Cocolate", 500.00, 1000,9.00, 1});
        model.addRow(new Object[]{2, "Vanila", 800, 1000, 10.00,2});
        model.addRow(new Object[]{3, "Mix",120.90, 200,11.00, 3});
        model.addRow(new Object[]{4, "Frut & Nut", 607.0, 1000,1.00, 4});
        model.addRow(new Object[]{5, "Strobary", 320, 500,2.00,5});
        model.addRow(new Object[]{6,"Orange", 58, 100, 6.00,9});
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMainBackground = new java.awt.Panel();
        pnlSideMenu = new java.awt.Panel();
        pnlSideAccountDetails = new java.awt.Panel();
        lblPerfilePic = new javax.swing.JLabel();
        lblHed1 = new javax.swing.JLabel();
        lblHed2 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblUserId = new javax.swing.JLabel();
        lblHed3 = new javax.swing.JLabel();
        lblHed4 = new javax.swing.JLabel();
        pnlCardDashborad = new java.awt.Panel();
        lblMenuDashboard = new javax.swing.JLabel();
        pnlCardReport = new java.awt.Panel();
        lblMenuReport = new javax.swing.JLabel();
        pnlCardProduct = new java.awt.Panel();
        lblMenuProduct = new javax.swing.JLabel();
        pnlCardSettings = new java.awt.Panel();
        lblMenuSettings = new javax.swing.JLabel();
        pnlLogOut = new java.awt.Panel();
        lblLogOut1 = new javax.swing.JLabel();
        pnlCardOrder = new java.awt.Panel();
        lblMenuOrder = new javax.swing.JLabel();
        pnlCardEmployee = new java.awt.Panel();
        lblEmployeeAdd = new javax.swing.JLabel();
        pnlCardDash = new java.awt.Panel();
        subPnlDashboard = new java.awt.Panel();
        pnlMainDash = new ExternalJavaFile.Panel();
        pnlSalesTable = new ExternalJavaFile.Panel();
        lblSales = new javax.swing.JLabel();
        lblSales1 = new javax.swing.JLabel();
        spnlSalesProductCount = new javax.swing.JScrollPane();
        tblSalesProductCount = new javax.swing.JTable();
        pnlStockTable = new ExternalJavaFile.Panel();
        lblStock = new javax.swing.JLabel();
        lblStock1 = new javax.swing.JLabel();
        spnlStockProductQuantity = new javax.swing.JScrollPane();
        tblStockProductQuantity = new javax.swing.JTable();
        pnlStockAdding = new java.awt.Panel();
        lblStock2 = new javax.swing.JLabel();
        lblStock3 = new javax.swing.JLabel();
        comProductName = new javax.swing.JComboBox<>();
        lblStock4 = new javax.swing.JLabel();
        txtStockKg = new javax.swing.JTextField();
        lblStock5 = new javax.swing.JLabel();
        txtStockG = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        lblStock6 = new javax.swing.JLabel();
        lblStock7 = new javax.swing.JLabel();
        lblStock8 = new javax.swing.JLabel();
        lblStock9 = new javax.swing.JLabel();
        lblStock10 = new javax.swing.JLabel();
        lblTotalStock = new javax.swing.JLabel();
        subPnlReport = new java.awt.Panel();
        spnlSalesDetails = new javax.swing.JScrollPane();
        tblSalesDetails = new javax.swing.JTable();
        lblRep1 = new javax.swing.JLabel();
        jComboBox13 = new javax.swing.JComboBox<>();
        lblRep2 = new javax.swing.JLabel();
        jComboBox14 = new javax.swing.JComboBox<>();
        lblRep3 = new javax.swing.JLabel();
        lblRep4 = new javax.swing.JLabel();
        subPnlProduct = new java.awt.Panel();
        spnlProductList = new javax.swing.JScrollPane();
        tblProductList = new javax.swing.JTable();
        lblPro1 = new javax.swing.JLabel();
        pnlProductSideBar = new java.awt.Panel();
        lblPro3 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        lblPro5 = new javax.swing.JLabel();
        txtPicProduct = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextField8 = new javax.swing.JTextField();
        lblPro6 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        lblPro2 = new javax.swing.JLabel();
        subPnlSettings = new java.awt.Panel();
        lblSet1 = new javax.swing.JLabel();
        lblSet2 = new javax.swing.JLabel();
        lblDark3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        btnDarkColor = new javax.swing.JButton();
        lblDarkColor = new javax.swing.JLabel();
        lblDark1 = new javax.swing.JLabel();
        lblDark2 = new javax.swing.JLabel();
        lbldark4 = new javax.swing.JLabel();
        lbldark5 = new javax.swing.JLabel();
        lblLittleColor = new javax.swing.JLabel();
        btnLittleColor = new javax.swing.JButton();
        lblFontLittleColor = new javax.swing.JLabel();
        btnHedColor = new javax.swing.JButton();
        lblNorColor = new javax.swing.JLabel();
        btnNorColor = new javax.swing.JButton();
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
        comItems3 = new javax.swing.JComboBox<>();
        lblIt34 = new javax.swing.JLabel();
        txtItems3 = new javax.swing.JTextField();
        lblId9 = new javax.swing.JLabel();
        pnlItems4 = new java.awt.Panel();
        lblIt4 = new javax.swing.JLabel();
        lblIt41 = new javax.swing.JLabel();
        lblIt42 = new javax.swing.JLabel();
        lblIt43 = new javax.swing.JLabel();
        comItems4 = new javax.swing.JComboBox<>();
        lblIt44 = new javax.swing.JLabel();
        txtItems4 = new javax.swing.JTextField();
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
        comItems9 = new javax.swing.JComboBox<>();
        lblIt94 = new javax.swing.JLabel();
        txtItems9 = new javax.swing.JTextField();
        lblId3 = new javax.swing.JLabel();
        pnlItems10 = new java.awt.Panel();
        lblIt10 = new javax.swing.JLabel();
        lblIt101 = new javax.swing.JLabel();
        lblIt102 = new javax.swing.JLabel();
        lblIt103 = new javax.swing.JLabel();
        comItems10 = new javax.swing.JComboBox<>();
        lblIt104 = new javax.swing.JLabel();
        txtItems10 = new javax.swing.JTextField();
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
        subPnlEmployee = new java.awt.Panel();
        pnlDetailsEmp = new ExternalJavaFile.Panel();
        pnlEmpAccUserDetails = new java.awt.Panel();
        lblEmp1 = new javax.swing.JLabel();
        txtEmpName = new javax.swing.JTextField();
        lblErrName = new javax.swing.JLabel();
        lblEmp2 = new javax.swing.JLabel();
        txtEmpNic = new javax.swing.JTextField();
        lblErrNic = new javax.swing.JLabel();
        lblEmp3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtEmpAddress = new javax.swing.JTextArea();
        lblErrAddress = new javax.swing.JLabel();
        lblEmp4 = new javax.swing.JLabel();
        comEmpGender = new javax.swing.JComboBox<>();
        lblErrGender = new javax.swing.JLabel();
        lblEmp5 = new javax.swing.JLabel();
        txtEmpEmail = new javax.swing.JTextField();
        lblErrEmail = new javax.swing.JLabel();
        lblEmp7 = new javax.swing.JLabel();
        txtEmpTp = new javax.swing.JTextField();
        lblErrTp = new javax.swing.JLabel();
        lblEmp6 = new javax.swing.JLabel();
        comEmpAccType = new javax.swing.JComboBox<>();
        lblErrAccType = new javax.swing.JLabel();
        pnlEmpAccount = new javax.swing.JPanel();
        lblEmp8 = new javax.swing.JLabel();
        txtEmpUserName = new javax.swing.JTextField();
        lblEmp9 = new javax.swing.JLabel();
        lblEmp10 = new javax.swing.JLabel();
        txtEmpPassword = new javax.swing.JPasswordField();
        txtEmpComfirmPassword = new javax.swing.JPasswordField();
        lblErrUserName = new javax.swing.JLabel();
        lblErrPassword = new javax.swing.JLabel();
        spnlEmployeeList = new javax.swing.JScrollPane();
        tblEmpList = new javax.swing.JTable();
        jButton9 = new javax.swing.JButton();
        btnClean = new javax.swing.JButton();
        lblEmp11 = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlMainBackground.setBackground(new java.awt.Color(58, 175, 169));

        pnlSideMenu.setBackground(new java.awt.Color(43, 122, 120));
        pnlSideMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        pnlSideAccountDetails.setBackground(new java.awt.Color(43, 122, 120));

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
                            .addComponent(lblHed3, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE))
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

        pnlCardDashborad.setBackground(new java.awt.Color(43, 122, 120));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCardDashboradLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenuDashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlCardDashboradLayout.setVerticalGroup(
            pnlCardDashboradLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMenuDashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        pnlCardReport.setBackground(new java.awt.Color(43, 122, 120));
        pnlCardReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblMenuReport.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        lblMenuReport.setForeground(new java.awt.Color(254, 255, 255));
        lblMenuReport.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMenuReport.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic_&_Icons/pie-chart.png"))); // NOI18N
        lblMenuReport.setText("  Report Sales");
        lblMenuReport.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 4, 1, 0, new java.awt.Color(0, 0, 0)));
        lblMenuReport.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuReportMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlCardReportLayout = new javax.swing.GroupLayout(pnlCardReport);
        pnlCardReport.setLayout(pnlCardReportLayout);
        pnlCardReportLayout.setHorizontalGroup(
            pnlCardReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCardReportLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenuReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlCardReportLayout.setVerticalGroup(
            pnlCardReportLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMenuReport, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        pnlCardProduct.setBackground(new java.awt.Color(43, 122, 120));

        lblMenuProduct.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        lblMenuProduct.setForeground(new java.awt.Color(254, 255, 255));
        lblMenuProduct.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMenuProduct.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic_&_Icons/add-product.png"))); // NOI18N
        lblMenuProduct.setText("  Products");
        lblMenuProduct.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 4, 1, 0, new java.awt.Color(0, 0, 0)));
        lblMenuProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuProductMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlCardProductLayout = new javax.swing.GroupLayout(pnlCardProduct);
        pnlCardProduct.setLayout(pnlCardProductLayout);
        pnlCardProductLayout.setHorizontalGroup(
            pnlCardProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCardProductLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenuProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlCardProductLayout.setVerticalGroup(
            pnlCardProductLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMenuProduct, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
        );

        pnlCardSettings.setBackground(new java.awt.Color(43, 122, 120));

        lblMenuSettings.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        lblMenuSettings.setForeground(new java.awt.Color(254, 255, 255));
        lblMenuSettings.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMenuSettings.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic_&_Icons/settings.png"))); // NOI18N
        lblMenuSettings.setText("  System Settings");
        lblMenuSettings.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 4, 1, 0, new java.awt.Color(0, 0, 0)));
        lblMenuSettings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuSettingsMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlCardSettingsLayout = new javax.swing.GroupLayout(pnlCardSettings);
        pnlCardSettings.setLayout(pnlCardSettingsLayout);
        pnlCardSettingsLayout.setHorizontalGroup(
            pnlCardSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCardSettingsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenuSettings, javax.swing.GroupLayout.DEFAULT_SIZE, 273, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlCardSettingsLayout.setVerticalGroup(
            pnlCardSettingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMenuSettings, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
        );

        pnlLogOut.setBackground(new java.awt.Color(43, 122, 120));
        pnlLogOut.setName(""); // NOI18N
        pnlLogOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlLogOutMouseClicked(evt);
            }
        });

        lblLogOut1.setFont(new java.awt.Font("Nirmala UI", 1, 14)); // NOI18N
        lblLogOut1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLogOut1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic_&_Icons/LogoutDash.png"))); // NOI18N
        lblLogOut1.setText("LogOut");
        lblLogOut1.setToolTipText("");
        lblLogOut1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogOut1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlLogOutLayout = new javax.swing.GroupLayout(pnlLogOut);
        pnlLogOut.setLayout(pnlLogOutLayout);
        pnlLogOutLayout.setHorizontalGroup(
            pnlLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogOutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogOut1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );
        pnlLogOutLayout.setVerticalGroup(
            pnlLogOutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLogOutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLogOut1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCardOrder.setBackground(new java.awt.Color(43, 122, 120));

        lblMenuOrder.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        lblMenuOrder.setForeground(new java.awt.Color(254, 255, 255));
        lblMenuOrder.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblMenuOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic_&_Icons/check-out.png"))); // NOI18N
        lblMenuOrder.setText("  Ordering");
        lblMenuOrder.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 4, 1, 0, new java.awt.Color(0, 0, 0)));
        lblMenuOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblMenuOrderMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlCardOrderLayout = new javax.swing.GroupLayout(pnlCardOrder);
        pnlCardOrder.setLayout(pnlCardOrderLayout);
        pnlCardOrderLayout.setHorizontalGroup(
            pnlCardOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCardOrderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMenuOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlCardOrderLayout.setVerticalGroup(
            pnlCardOrderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblMenuOrder, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        pnlCardEmployee.setBackground(new java.awt.Color(43, 122, 120));
        pnlCardEmployee.setName(""); // NOI18N

        lblEmployeeAdd.setFont(new java.awt.Font("NSimSun", 1, 18)); // NOI18N
        lblEmployeeAdd.setForeground(new java.awt.Color(254, 255, 255));
        lblEmployeeAdd.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblEmployeeAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic_&_Icons/group.png"))); // NOI18N
        lblEmployeeAdd.setText("  Employee");
        lblEmployeeAdd.setToolTipText("");
        lblEmployeeAdd.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 4, 1, 0, new java.awt.Color(0, 0, 0)));
        lblEmployeeAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblEmployeeAddMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlCardEmployeeLayout = new javax.swing.GroupLayout(pnlCardEmployee);
        pnlCardEmployee.setLayout(pnlCardEmployeeLayout);
        pnlCardEmployeeLayout.setHorizontalGroup(
            pnlCardEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCardEmployeeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblEmployeeAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlCardEmployeeLayout.setVerticalGroup(
            pnlCardEmployeeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblEmployeeAdd, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlSideMenuLayout = new javax.swing.GroupLayout(pnlSideMenu);
        pnlSideMenu.setLayout(pnlSideMenuLayout);
        pnlSideMenuLayout.setHorizontalGroup(
            pnlSideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSideAccountDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSideMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlSideMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlSideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlCardDashborad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCardOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCardSettings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCardProduct, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCardReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlCardEmployee, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlSideMenuLayout.setVerticalGroup(
            pnlSideMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSideMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSideAccountDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(pnlCardDashborad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCardReport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCardProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCardSettings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCardOrder, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCardEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlLogOut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );

        pnlCardDash.setBackground(new java.awt.Color(58, 175, 169));
        pnlCardDash.setName(""); // NOI18N
        pnlCardDash.setLayout(new java.awt.CardLayout());

        subPnlDashboard.setBackground(new java.awt.Color(43, 122, 120));
        subPnlDashboard.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlMainDash.setBackground(new java.awt.Color(43, 122, 120));
        pnlMainDash.setForeground(new java.awt.Color(0, 204, 204));
        pnlMainDash.setToolTipText("");
        pnlMainDash.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlSalesTable.setBackground(new java.awt.Color(0, 102, 102));
        pnlSalesTable.setForeground(new java.awt.Color(0, 102, 102));
        pnlSalesTable.setToolTipText("");

        lblSales.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        lblSales.setForeground(new java.awt.Color(255, 255, 255));
        lblSales.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSales.setText("Sales");

        lblSales1.setText("Count");

        tblSalesProductCount.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        spnlSalesProductCount.setViewportView(tblSalesProductCount);

        javax.swing.GroupLayout pnlSalesTableLayout = new javax.swing.GroupLayout(pnlSalesTable);
        pnlSalesTable.setLayout(pnlSalesTableLayout);
        pnlSalesTableLayout.setHorizontalGroup(
            pnlSalesTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalesTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSales1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlSalesTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlSalesTableLayout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(lblSales, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(481, Short.MAX_VALUE))
                    .addGroup(pnlSalesTableLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(spnlSalesProductCount)
                        .addContainerGap())))
        );
        pnlSalesTableLayout.setVerticalGroup(
            pnlSalesTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalesTableLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlSalesTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblSales1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlSalesTableLayout.createSequentialGroup()
                        .addComponent(lblSales, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnlSalesProductCount, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pnlMainDash.add(pnlSalesTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 670, 130));

        pnlStockTable.setBackground(new java.awt.Color(0, 102, 102));
        pnlStockTable.setForeground(new java.awt.Color(0, 102, 102));
        pnlStockTable.setToolTipText("");

        lblStock.setFont(new java.awt.Font("Perpetua Titling MT", 1, 14)); // NOI18N
        lblStock.setForeground(new java.awt.Color(255, 255, 255));
        lblStock.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblStock.setText("Stock");

        lblStock1.setText("Count");

        tblStockProductQuantity.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        spnlStockProductQuantity.setViewportView(tblStockProductQuantity);

        javax.swing.GroupLayout pnlStockTableLayout = new javax.swing.GroupLayout(pnlStockTable);
        pnlStockTable.setLayout(pnlStockTableLayout);
        pnlStockTableLayout.setHorizontalGroup(
            pnlStockTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStockTableLayout.createSequentialGroup()
                .addGroup(pnlStockTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlStockTableLayout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(lblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pnlStockTableLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lblStock1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(spnlStockProductQuantity, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE)))
                .addContainerGap())
        );
        pnlStockTableLayout.setVerticalGroup(
            pnlStockTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStockTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStock, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(pnlStockTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlStockTableLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                        .addComponent(lblStock1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlStockTableLayout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(spnlStockProductQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(24, 24, 24))
        );

        pnlMainDash.add(pnlStockTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 670, 130));

        pnlStockAdding.setBackground(new java.awt.Color(43, 122, 120));

        lblStock2.setFont(new java.awt.Font("Perpetua Titling MT", 1, 12)); // NOI18N
        lblStock2.setForeground(new java.awt.Color(255, 255, 255));
        lblStock2.setText("Stock Add");

        lblStock3.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        lblStock3.setForeground(new java.awt.Color(255, 255, 255));
        lblStock3.setText("Product Name");

        lblStock4.setFont(new java.awt.Font("NSimSun", 0, 14)); // NOI18N
        lblStock4.setForeground(new java.awt.Color(255, 255, 255));
        lblStock4.setText("Quantity");

        txtStockKg.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtStockKgFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtStockKgFocusLost(evt);
            }
        });

        lblStock5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        lblStock5.setText("Kg");

        txtStockG.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtStockGFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtStockGFocusLost(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel10.setText("g");

        jButton6.setText("ADD");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        jButton8.setText("Clear");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        lblStock6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStock6.setText("Estimated Number Of Cone :");

        lblStock7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblStock7.setText("0");

        lblStock8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStock8.setText("Value Of Stock :");

        lblStock9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblStock9.setText("RS:0.00");

        lblStock10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStock10.setText("Total Stock :");

        lblTotalStock.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTotalStock.setText("0.00");

        javax.swing.GroupLayout pnlStockAddingLayout = new javax.swing.GroupLayout(pnlStockAdding);
        pnlStockAdding.setLayout(pnlStockAddingLayout);
        pnlStockAddingLayout.setHorizontalGroup(
            pnlStockAddingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStockAddingLayout.createSequentialGroup()
                .addGroup(pnlStockAddingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlStockAddingLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(lblStock2, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlStockAddingLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(pnlStockAddingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 653, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlStockAddingLayout.createSequentialGroup()
                                .addComponent(lblStock3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlStockAddingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlStockAddingLayout.createSequentialGroup()
                                        .addGap(109, 109, 109)
                                        .addGroup(pnlStockAddingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblStock10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblStock8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblStock6, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(pnlStockAddingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblStock7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblStock9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblTotalStock, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(pnlStockAddingLayout.createSequentialGroup()
                                        .addComponent(comProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(77, 77, 77)
                                        .addComponent(lblStock4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtStockKg, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblStock5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtStockG, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlStockAddingLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton8)
                .addGap(109, 109, 109))
        );
        pnlStockAddingLayout.setVerticalGroup(
            pnlStockAddingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlStockAddingLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblStock2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlStockAddingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlStockAddingLayout.createSequentialGroup()
                        .addGroup(pnlStockAddingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtStockKg, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblStock3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlStockAddingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(comProductName)
                                .addComponent(lblStock4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(49, 67, Short.MAX_VALUE)
                        .addGroup(pnlStockAddingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStock10)
                            .addComponent(lblTotalStock))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlStockAddingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStock6)
                            .addComponent(lblStock7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlStockAddingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblStock8)
                            .addComponent(lblStock9))
                        .addGap(30, 30, 30))
                    .addGroup(pnlStockAddingLayout.createSequentialGroup()
                        .addGroup(pnlStockAddingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlStockAddingLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(lblStock5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtStockG, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(163, 163, 163)))
                .addGroup(pnlStockAddingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton8))
                .addContainerGap())
        );

        pnlMainDash.add(pnlStockAdding, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 670, 280));

        subPnlDashboard.add(pnlMainDash, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 690, 570));

        pnlCardDash.add(subPnlDashboard, "card2");

        subPnlReport.setBackground(new java.awt.Color(43, 122, 120));
        subPnlReport.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblSalesDetails.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Salse_No", "Salse_Products", "Total", "Change", "Time", "Date"
            }
        ));
        spnlSalesDetails.setViewportView(tblSalesDetails);

        subPnlReport.add(spnlSalesDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 680, 450));

        lblRep1.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        lblRep1.setForeground(new java.awt.Color(255, 255, 255));
        lblRep1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRep1.setText("Date : ");
        subPnlReport.add(lblRep1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 70, 30));

        jComboBox13.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Today", "Yesterday", "EvenDay" }));
        subPnlReport.add(jComboBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 100, 30));

        lblRep2.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        lblRep2.setForeground(new java.awt.Color(255, 255, 255));
        lblRep2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRep2.setText("Product : ");
        subPnlReport.add(lblRep2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 80, 30));

        jComboBox14.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "All Product", "Cocolate", "Vanila", "Strobary" }));
        subPnlReport.add(jComboBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 110, 30));

        lblRep3.setForeground(new java.awt.Color(255, 255, 255));
        lblRep3.setText("Row Count :");
        subPnlReport.add(lblRep3, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, -1, 30));

        lblRep4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblRep4.setText("0");
        subPnlReport.add(lblRep4, new org.netbeans.lib.awtextra.AbsoluteConstraints(635, 66, 60, 20));

        pnlCardDash.add(subPnlReport, "card3");

        subPnlProduct.setBackground(new java.awt.Color(43, 122, 120));
        subPnlProduct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblProductList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product_Id", "Name", "Price", "Availability"
            }
        ));
        spnlProductList.setViewportView(tblProductList);

        subPnlProduct.add(spnlProductList, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 290, 500));

        lblPro1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblPro1.setForeground(new java.awt.Color(254, 255, 255));
        lblPro1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPro1.setText("Product Details");
        subPnlProduct.add(lblPro1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        pnlProductSideBar.setBackground(new java.awt.Color(43, 122, 120));

        lblPro3.setFont(new java.awt.Font("Rockwell Condensed", 1, 15)); // NOI18N
        lblPro3.setText("Name");

        jTextField7.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N

        lblPro5.setFont(new java.awt.Font("Rockwell Condensed", 1, 15)); // NOI18N
        lblPro5.setText("Picture");

        txtPicProduct.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N

        jButton1.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N
        jButton1.setText("Browser");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField8.setFont(new java.awt.Font("Rockwell Condensed", 1, 14)); // NOI18N

        lblPro6.setFont(new java.awt.Font("Rockwell Condensed", 1, 15)); // NOI18N
        lblPro6.setText("Price");

        jLabel47.setBorder(new javax.swing.border.MatteBorder(null));

        jButton2.setText("ADD");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton5.setText("DELETE");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlProductSideBarLayout = new javax.swing.GroupLayout(pnlProductSideBar);
        pnlProductSideBar.setLayout(pnlProductSideBarLayout);
        pnlProductSideBarLayout.setHorizontalGroup(
            pnlProductSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductSideBarLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(pnlProductSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(59, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlProductSideBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlProductSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPro5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblPro3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlProductSideBarLayout.createSequentialGroup()
                        .addComponent(lblPro6, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 24, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addGroup(pnlProductSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlProductSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jTextField8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(pnlProductSideBarLayout.createSequentialGroup()
                            .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtPicProduct)
                    .addComponent(jTextField7))
                .addContainerGap())
        );
        pnlProductSideBarLayout.setVerticalGroup(
            pnlProductSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlProductSideBarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnlProductSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPro3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlProductSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPicProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPro5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnlProductSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel47, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlProductSideBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPro6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton5)
                .addGap(58, 58, 58))
        );

        subPnlProduct.add(pnlProductSideBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 80, 350, 470));

        lblPro2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        lblPro2.setForeground(new java.awt.Color(255, 255, 255));
        lblPro2.setText("Edit Product Details");
        subPnlProduct.add(lblPro2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));

        pnlCardDash.add(subPnlProduct, "card4");

        subPnlSettings.setBackground(new java.awt.Color(43, 122, 120));
        subPnlSettings.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblSet1.setFont(new java.awt.Font("NSimSun", 1, 16)); // NOI18N
        lblSet1.setText("Background Color :");
        subPnlSettings.add(lblSet1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 177, 28));

        lblSet2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblSet2.setText("Font Color Change :");
        subPnlSettings.add(lblSet2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 149, 26));

        lblDark3.setFont(new java.awt.Font("High Tower Text", 1, 18)); // NOI18N
        lblDark3.setForeground(new java.awt.Color(255, 255, 255));
        lblDark3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDark3.setText("Settings");
        subPnlSettings.add(lblDark3, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 17, 186, 33));
        subPnlSettings.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 56, 646, -1));

        btnDarkColor.setBackground(new java.awt.Color(43, 122, 120));
        btnDarkColor.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        btnDarkColor.setText("Set Color");
        btnDarkColor.setToolTipText("");
        btnDarkColor.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(255, 255, 255)));
        btnDarkColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDarkColorMouseClicked(evt);
            }
        });
        btnDarkColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarkColorActionPerformed(evt);
            }
        });
        subPnlSettings.add(btnDarkColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 150, 80, -1));
        subPnlSettings.add(lblDarkColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 160, 200, 20));

        lblDark1.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        lblDark1.setForeground(new java.awt.Color(255, 255, 255));
        lblDark1.setText("Dark Color");
        subPnlSettings.add(lblDark1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 160, 20));

        lblDark2.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        lblDark2.setForeground(new java.awt.Color(255, 255, 255));
        lblDark2.setText("Little Color");
        subPnlSettings.add(lblDark2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 160, -1));

        lbldark4.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        lbldark4.setForeground(new java.awt.Color(255, 255, 255));
        lbldark4.setText("Font Heading Color");
        subPnlSettings.add(lbldark4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, 150, -1));

        lbldark5.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        lbldark5.setForeground(new java.awt.Color(255, 255, 255));
        lbldark5.setText("Font Normal Color");
        subPnlSettings.add(lbldark5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 140, -1));
        subPnlSettings.add(lblLittleColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 190, 200, 20));

        btnLittleColor.setBackground(new java.awt.Color(43, 122, 120));
        btnLittleColor.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        btnLittleColor.setText("Set Color");
        btnLittleColor.setToolTipText("");
        btnLittleColor.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(255, 255, 255)));
        btnLittleColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLittleColorMouseClicked(evt);
            }
        });
        subPnlSettings.add(btnLittleColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 180, 80, -1));
        subPnlSettings.add(lblFontLittleColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 290, 200, 20));

        btnHedColor.setBackground(new java.awt.Color(43, 122, 120));
        btnHedColor.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        btnHedColor.setText("Set Color");
        btnHedColor.setToolTipText("");
        btnHedColor.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(255, 255, 255)));
        btnHedColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnHedColorMouseClicked(evt);
            }
        });
        subPnlSettings.add(btnHedColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 290, 80, -1));
        subPnlSettings.add(lblNorColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, 200, 20));

        btnNorColor.setBackground(new java.awt.Color(43, 122, 120));
        btnNorColor.setFont(new java.awt.Font("Segoe Script", 1, 14)); // NOI18N
        btnNorColor.setText("Set Color");
        btnNorColor.setToolTipText("");
        btnNorColor.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 2, 1, new java.awt.Color(255, 255, 255)));
        btnNorColor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNorColorMouseClicked(evt);
            }
        });
        subPnlSettings.add(btnNorColor, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 320, 80, -1));

        pnlCardDash.add(subPnlSettings, "card5");

        subPnlOrdering.setBackground(new java.awt.Color(43, 122, 120));
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
                "Product_ID", "Name", "Quantity", "Total_price"
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
        subPnlOrdering.add(btnOrderRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 490, 90, 33));

        pnlMainItems.setBackground(new java.awt.Color(43, 122, 120));
        pnlMainItems.setLayout(new java.awt.CardLayout());

        cardSide01.setBackground(new java.awt.Color(43, 122, 120));
        cardSide01.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cardSide01MouseExited(evt);
            }
        });
        cardSide01.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlItems1.setBackground(new java.awt.Color(43, 122, 120));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlItems1Layout.createSequentialGroup()
                .addGroup(pnlItems1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblIt1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlItems1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnlItems1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblId12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlItems1Layout.createSequentialGroup()
                                .addComponent(lblIt13, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(comItems6, 0, 81, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlItems1Layout.createSequentialGroup()
                                .addComponent(lblIt11, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lblIt12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlItems1Layout.createSequentialGroup()
                                .addComponent(lblIt14, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtItems6)))))
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
                .addComponent(lblId12, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
        );

        cardSide01.add(pnlItems1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 340, 170, 160));

        pnlItems2.setBackground(new java.awt.Color(43, 122, 120));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlItems2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlItems2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblId11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlItems2Layout.createSequentialGroup()
                        .addComponent(lblIt21, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblIt22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblIt2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlItems2Layout.createSequentialGroup()
                        .addGroup(pnlItems2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblIt24, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(lblIt23, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlItems2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comItems5, 0, 79, Short.MAX_VALUE)
                            .addComponent(txtItems5))))
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
                .addComponent(lblId11, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
        );

        cardSide01.add(pnlItems2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 340, 170, 160));

        pnlItems3.setBackground(new java.awt.Color(43, 122, 120));
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

        comItems3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        comItems3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comItems3ActionPerformed(evt);
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
                            .addComponent(comItems3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtItems3)))))
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
                    .addComponent(comItems3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlItems3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt34)
                    .addComponent(txtItems3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblId9, javax.swing.GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE)
                .addContainerGap())
        );

        cardSide01.add(pnlItems3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 170, 160));

        pnlItems4.setBackground(new java.awt.Color(43, 122, 120));
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

        comItems4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        comItems4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comItems4ActionPerformed(evt);
            }
        });

        lblIt44.setText("Purchase");

        lblId10.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        lblId10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout pnlItems4Layout = new javax.swing.GroupLayout(pnlItems4);
        pnlItems4.setLayout(pnlItems4Layout);
        pnlItems4Layout.setHorizontalGroup(
            pnlItems4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlItems4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlItems4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblId10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlItems4Layout.createSequentialGroup()
                        .addComponent(lblIt41, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblIt42, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblIt4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlItems4Layout.createSequentialGroup()
                        .addGroup(pnlItems4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblIt44, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                            .addComponent(lblIt43, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlItems4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comItems4, 0, 82, Short.MAX_VALUE)
                            .addComponent(txtItems4))))
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
                    .addComponent(comItems4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlItems4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt44)
                    .addComponent(txtItems4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblId10, javax.swing.GroupLayout.DEFAULT_SIZE, 12, Short.MAX_VALUE)
                .addContainerGap())
        );

        cardSide01.add(pnlItems4, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 170, 160));

        pnlItems5.setBackground(new java.awt.Color(43, 122, 120));
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
                    .addComponent(lblId8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(lblId8, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE)
                .addContainerGap())
        );

        cardSide01.add(pnlItems5, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 170, 160));

        pnlItems6.setBackground(new java.awt.Color(43, 122, 120));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlItems6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlItems6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblId7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIt6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlItems6Layout.createSequentialGroup()
                        .addGroup(pnlItems6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIt61, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIt63, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIt64, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlItems6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtItems1)
                            .addComponent(comItems1, 0, 78, Short.MAX_VALUE)
                            .addComponent(lblIt62, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addComponent(lblId7, javax.swing.GroupLayout.DEFAULT_SIZE, 16, Short.MAX_VALUE)
                .addContainerGap())
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

        cardSide02.setBackground(new java.awt.Color(43, 122, 120));
        cardSide02.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cardSide02MouseExited(evt);
            }
        });
        cardSide02.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlItems7.setBackground(new java.awt.Color(43, 122, 120));
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblId6, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
        );

        cardSide02.add(pnlItems7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 170, 160));

        pnlItems8.setBackground(new java.awt.Color(43, 122, 120));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlItems8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlItems8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblId5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlItems8Layout.createSequentialGroup()
                        .addComponent(lblIt81, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblIt82, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblIt8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlItems8Layout.createSequentialGroup()
                        .addGroup(pnlItems8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblIt84, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
                            .addComponent(lblIt83, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlItems8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comItems11, 0, 79, Short.MAX_VALUE)
                            .addComponent(txtItems11))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblId5, javax.swing.GroupLayout.DEFAULT_SIZE, 19, Short.MAX_VALUE))
        );

        cardSide02.add(pnlItems8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 170, 160));

        pnlItems9.setBackground(new java.awt.Color(43, 122, 120));
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

        comItems9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        comItems9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comItems9ActionPerformed(evt);
            }
        });

        lblIt94.setText("Purchase");

        lblId3.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        lblId3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout pnlItems9Layout = new javax.swing.GroupLayout(pnlItems9);
        pnlItems9.setLayout(pnlItems9Layout);
        pnlItems9Layout.setHorizontalGroup(
            pnlItems9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlItems9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlItems9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlItems9Layout.createSequentialGroup()
                        .addComponent(lblId3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
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
                            .addComponent(comItems9, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtItems9)))))
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
                    .addComponent(comItems9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlItems9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt94)
                    .addComponent(txtItems9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblId3, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE))
        );

        cardSide02.add(pnlItems9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 170, 160));

        pnlItems10.setBackground(new java.awt.Color(43, 122, 120));
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

        comItems10.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        comItems10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comItems10ActionPerformed(evt);
            }
        });

        lblIt104.setText("Purchase");

        lblId4.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        lblId4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout pnlItems10Layout = new javax.swing.GroupLayout(pnlItems10);
        pnlItems10.setLayout(pnlItems10Layout);
        pnlItems10Layout.setHorizontalGroup(
            pnlItems10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlItems10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlItems10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblId4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlItems10Layout.createSequentialGroup()
                        .addComponent(lblIt101, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblIt102, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblIt10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlItems10Layout.createSequentialGroup()
                        .addGroup(pnlItems10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblIt104, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                            .addComponent(lblIt103, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlItems10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comItems10, 0, 82, Short.MAX_VALUE)
                            .addComponent(txtItems10))))
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
                    .addComponent(comItems10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlItems10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblIt104)
                    .addComponent(txtItems10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblId4, javax.swing.GroupLayout.DEFAULT_SIZE, 18, Short.MAX_VALUE))
        );

        cardSide02.add(pnlItems10, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 170, 160));

        pnlItems11.setBackground(new java.awt.Color(43, 122, 120));
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
                            .addComponent(lblIt112, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comItems8, 0, 80, Short.MAX_VALUE)
                            .addComponent(txtItems8)))
                    .addComponent(lblId2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblId2, javax.swing.GroupLayout.DEFAULT_SIZE, 14, Short.MAX_VALUE))
        );

        cardSide02.add(pnlItems11, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 170, 150));

        pnlItems12.setBackground(new java.awt.Color(43, 122, 120));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlItems12Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlItems12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblId1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblIt12H, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlItems12Layout.createSequentialGroup()
                        .addGroup(pnlItems12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblIt121, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIt123, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblIt124, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(pnlItems12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtItems7)
                            .addComponent(comItems7, 0, 78, Short.MAX_VALUE)
                            .addComponent(lblIt122, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblId1, javax.swing.GroupLayout.DEFAULT_SIZE, 12, Short.MAX_VALUE))
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

        pnlCardDash.add(subPnlOrdering, "card6");

        subPnlEmployee.setBackground(new java.awt.Color(43, 122, 120));
        subPnlEmployee.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlDetailsEmp.setBackground(new java.awt.Color(43, 122, 120));
        pnlDetailsEmp.setForeground(new java.awt.Color(43, 122, 120));
        pnlDetailsEmp.setToolTipText("");
        pnlDetailsEmp.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlEmpAccUserDetails.setBackground(new java.awt.Color(43, 122, 120));
        pnlEmpAccUserDetails.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        lblEmp1.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        lblEmp1.setForeground(new java.awt.Color(255, 255, 255));
        lblEmp1.setText("Name");
        lblEmp1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 1, 0, new java.awt.Color(0, 0, 0)));

        txtEmpName.setBackground(new java.awt.Color(204, 255, 255));
        txtEmpName.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N

        lblErrName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic_&_Icons/error.gif"))); // NOI18N

        lblEmp2.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        lblEmp2.setForeground(new java.awt.Color(255, 255, 255));
        lblEmp2.setText("NIC Number");
        lblEmp2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 1, 0, new java.awt.Color(0, 0, 0)));

        txtEmpNic.setBackground(new java.awt.Color(204, 255, 255));
        txtEmpNic.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txtEmpNic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpNicActionPerformed(evt);
            }
        });

        lblErrNic.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrNic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic_&_Icons/error.gif"))); // NOI18N

        lblEmp3.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        lblEmp3.setForeground(new java.awt.Color(255, 255, 255));
        lblEmp3.setText("Address");
        lblEmp3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 1, 0, new java.awt.Color(0, 0, 0)));

        txtEmpAddress.setBackground(new java.awt.Color(204, 255, 255));
        txtEmpAddress.setColumns(20);
        txtEmpAddress.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txtEmpAddress.setRows(5);
        jScrollPane2.setViewportView(txtEmpAddress);

        lblErrAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrAddress.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic_&_Icons/error.gif"))); // NOI18N

        lblEmp4.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        lblEmp4.setForeground(new java.awt.Color(255, 255, 255));
        lblEmp4.setText("Gender");
        lblEmp4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 1, 0, new java.awt.Color(0, 0, 0)));

        comEmpGender.setBackground(new java.awt.Color(204, 255, 255));
        comEmpGender.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        comEmpGender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Gender", "Male", "Female" }));

        lblErrGender.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrGender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic_&_Icons/error.gif"))); // NOI18N

        lblEmp5.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        lblEmp5.setForeground(new java.awt.Color(255, 255, 255));
        lblEmp5.setText("Email Address");
        lblEmp5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 1, 0, new java.awt.Color(0, 0, 0)));

        txtEmpEmail.setBackground(new java.awt.Color(204, 255, 255));
        txtEmpEmail.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        txtEmpEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmpEmailActionPerformed(evt);
            }
        });

        lblErrEmail.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrEmail.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic_&_Icons/error.gif"))); // NOI18N

        lblEmp7.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        lblEmp7.setForeground(new java.awt.Color(255, 255, 255));
        lblEmp7.setText("Phone Number");
        lblEmp7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 1, 0, new java.awt.Color(0, 0, 0)));

        txtEmpTp.setBackground(new java.awt.Color(204, 255, 255));
        txtEmpTp.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N

        lblErrTp.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrTp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic_&_Icons/error.gif"))); // NOI18N

        lblEmp6.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        lblEmp6.setForeground(new java.awt.Color(255, 255, 255));
        lblEmp6.setText("Account Type");
        lblEmp6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 4, 1, 0, new java.awt.Color(0, 0, 0)));

        comEmpAccType.setBackground(new java.awt.Color(204, 255, 255));
        comEmpAccType.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        comEmpAccType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Account Type", "User_Account", "Admin_Account", "Cashier_Account" }));
        comEmpAccType.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comEmpAccTypeItemStateChanged(evt);
            }
        });
        comEmpAccType.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                comEmpAccTypeMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                comEmpAccTypeMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                comEmpAccTypeMouseReleased(evt);
            }
        });
        comEmpAccType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comEmpAccTypeActionPerformed(evt);
            }
        });

        lblErrAccType.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrAccType.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic_&_Icons/error.gif"))); // NOI18N

        javax.swing.GroupLayout pnlEmpAccUserDetailsLayout = new javax.swing.GroupLayout(pnlEmpAccUserDetails);
        pnlEmpAccUserDetails.setLayout(pnlEmpAccUserDetailsLayout);
        pnlEmpAccUserDetailsLayout.setHorizontalGroup(
            pnlEmpAccUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmpAccUserDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlEmpAccUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEmpAccUserDetailsLayout.createSequentialGroup()
                        .addGroup(pnlEmpAccUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEmpAccUserDetailsLayout.createSequentialGroup()
                                .addGroup(pnlEmpAccUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblEmp4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblEmp3, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE))
                                .addGap(5, 5, 5)
                                .addGroup(pnlEmpAccUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(comEmpGender, 0, 190, Short.MAX_VALUE)))
                            .addGroup(pnlEmpAccUserDetailsLayout.createSequentialGroup()
                                .addGroup(pnlEmpAccUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(lblEmp1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lblEmp2, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE))
                                .addGap(10, 10, 10)
                                .addGroup(pnlEmpAccUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmpNic, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmpName, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlEmpAccUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEmpAccUserDetailsLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lblErrName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblErrGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblErrAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(pnlEmpAccUserDetailsLayout.createSequentialGroup()
                                .addComponent(lblErrNic, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(pnlEmpAccUserDetailsLayout.createSequentialGroup()
                        .addGroup(pnlEmpAccUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlEmpAccUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(pnlEmpAccUserDetailsLayout.createSequentialGroup()
                                    .addComponent(lblEmp6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(comEmpAccType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlEmpAccUserDetailsLayout.createSequentialGroup()
                                    .addComponent(lblEmp7, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtEmpTp, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnlEmpAccUserDetailsLayout.createSequentialGroup()
                                .addComponent(lblEmp5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEmpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(4, 4, 4)
                        .addGroup(pnlEmpAccUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblErrEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblErrTp, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblErrAccType, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(12, 12, 12))
        );
        pnlEmpAccUserDetailsLayout.setVerticalGroup(
            pnlEmpAccUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmpAccUserDetailsLayout.createSequentialGroup()
                .addGroup(pnlEmpAccUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEmp1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEmpAccUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlEmpAccUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEmp2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtEmpNic, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblErrNic, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(pnlEmpAccUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblErrAddress, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(lblEmp3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEmpAccUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEmpAccUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEmp4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comEmpGender, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblErrGender, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEmpAccUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEmpAccUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtEmpEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblEmp5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblErrEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEmpAccUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlEmpAccUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtEmpTp, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                        .addComponent(lblEmp7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(lblErrTp, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlEmpAccUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlEmpAccUserDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblEmp6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(comEmpAccType, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblErrAccType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68))
        );

        pnlDetailsEmp.add(pnlEmpAccUserDetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 330, 340));

        pnlEmpAccount.setBackground(new java.awt.Color(43, 122, 120));

        lblEmp8.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        lblEmp8.setForeground(new java.awt.Color(255, 255, 255));
        lblEmp8.setText("User Name");
        lblEmp8.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 4, 0, 0, new java.awt.Color(0, 0, 0)));

        txtEmpUserName.setBackground(new java.awt.Color(204, 255, 255));
        txtEmpUserName.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N

        lblEmp9.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        lblEmp9.setForeground(new java.awt.Color(255, 255, 255));
        lblEmp9.setText("Password");
        lblEmp9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 4, 0, 0, new java.awt.Color(0, 0, 0)));

        lblEmp10.setFont(new java.awt.Font("Segoe UI Black", 0, 10)); // NOI18N
        lblEmp10.setForeground(new java.awt.Color(255, 255, 255));
        lblEmp10.setText("Comfirm Password");
        lblEmp10.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 4, 0, 0, new java.awt.Color(0, 0, 0)));

        txtEmpPassword.setBackground(new java.awt.Color(204, 255, 255));
        txtEmpPassword.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N

        txtEmpComfirmPassword.setBackground(new java.awt.Color(204, 255, 255));
        txtEmpComfirmPassword.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N

        lblErrUserName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrUserName.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic_&_Icons/error.gif"))); // NOI18N

        lblErrPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblErrPassword.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic_&_Icons/error.gif"))); // NOI18N

        javax.swing.GroupLayout pnlEmpAccountLayout = new javax.swing.GroupLayout(pnlEmpAccount);
        pnlEmpAccount.setLayout(pnlEmpAccountLayout);
        pnlEmpAccountLayout.setHorizontalGroup(
            pnlEmpAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEmpAccountLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnlEmpAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblEmp10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmp9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblEmp8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(172, 181, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlEmpAccountLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(pnlEmpAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtEmpUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEmpComfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlEmpAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblErrPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );
        pnlEmpAccountLayout.setVerticalGroup(
            pnlEmpAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEmpAccountLayout.createSequentialGroup()
                .addComponent(lblEmp8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlEmpAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmpUserName)
                    .addGroup(pnlEmpAccountLayout.createSequentialGroup()
                        .addGap(0, 5, Short.MAX_VALUE)
                        .addComponent(lblErrUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addComponent(lblEmp9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlEmpAccountLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtEmpPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblErrPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblEmp10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtEmpComfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12))
        );

        pnlDetailsEmp.add(pnlEmpAccount, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 60, 310, 240));

        tblEmpList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        spnlEmployeeList.setViewportView(tblEmpList);

        pnlDetailsEmp.add(spnlEmployeeList, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 670, 90));

        jButton9.setBackground(new java.awt.Color(43, 122, 120));
        jButton9.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        jButton9.setForeground(new java.awt.Color(255, 255, 255));
        jButton9.setText("ADD");
        jButton9.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 1, new java.awt.Color(0, 0, 0)));
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });
        pnlDetailsEmp.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, 110, 30));

        btnClean.setBackground(new java.awt.Color(43, 122, 120));
        btnClean.setFont(new java.awt.Font("NSimSun", 1, 14)); // NOI18N
        btnClean.setForeground(new java.awt.Color(255, 255, 255));
        btnClean.setText("CLEAN");
        btnClean.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 3, 1, new java.awt.Color(0, 0, 0)));
        btnClean.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCleanMouseClicked(evt);
            }
        });
        pnlDetailsEmp.add(btnClean, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 410, 120, 30));

        lblEmp11.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        lblEmp11.setForeground(new java.awt.Color(255, 255, 255));
        lblEmp11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblEmp11.setText("Employee");
        pnlDetailsEmp.add(lblEmp11, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 180, 30));

        subPnlEmployee.add(pnlDetailsEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 680, 550));

        pnlCardDash.add(subPnlEmployee, "card7");

        lblExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pic_&_Icons/ExitDash.png"))); // NOI18N
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlMainBackgroundLayout = new javax.swing.GroupLayout(pnlMainBackground);
        pnlMainBackground.setLayout(pnlMainBackgroundLayout);
        pnlMainBackgroundLayout.setHorizontalGroup(
            pnlMainBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainBackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnlSideMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMainBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainBackgroundLayout.createSequentialGroup()
                        .addComponent(pnlCardDash, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMainBackgroundLayout.createSequentialGroup()
                        .addGap(669, 669, 669)
                        .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        pnlMainBackgroundLayout.setVerticalGroup(
            pnlMainBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainBackgroundLayout.createSequentialGroup()
                .addGroup(pnlMainBackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainBackgroundLayout.createSequentialGroup()
                        .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(pnlCardDash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlMainBackgroundLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnlSideMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainBackground, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMainBackground, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        this.dispose();
    }//GEN-LAST:event_lblExitMouseClicked

    private void pnlLogOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlLogOutMouseClicked
        this.dispose();
    }//GEN-LAST:event_pnlLogOutMouseClicked

    private void lblLogOut1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogOut1MouseClicked
        LoginForm log=new LoginForm();
        log.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogOut1MouseClicked

    private void lblMenuDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuDashboardMouseClicked
        selectButton(pnlCardDashborad,subPnlDashboard);
        notSelectButton(pnlCardProduct,subPnlProduct);
        notSelectButton(pnlCardSettings,subPnlSettings);
        notSelectButton(pnlCardReport,subPnlReport);
        notSelectButton(pnlCardOrder,subPnlOrdering);
        notSelectButton(pnlCardEmployee,subPnlEmployee);

        /*subPnlDashboard.setVisible(true);
        subPnlReport.setVisible(false);
        subPnlProduct.setVisible(false);
        subPnlSettings.setVisible(false);
        subPnlOrdering.setVisible(false);*/
    }//GEN-LAST:event_lblMenuDashboardMouseClicked

    private void lblMenuReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuReportMouseClicked
         selectButton(pnlCardReport,subPnlReport);
        notSelectButton(pnlCardProduct,subPnlProduct);
        notSelectButton(pnlCardSettings,subPnlSettings);
        notSelectButton(pnlCardOrder,subPnlOrdering);
        notSelectButton(pnlCardDashborad,subPnlDashboard);
        notSelectButton(pnlCardEmployee,subPnlEmployee);

        /*subPnlDashboard.setVisible(false);
        subPnlReport.setVisible(true);
        subPnlProduct.setVisible(false);
        subPnlSettings.setVisible(false);
        subPnlOrdering.setVisible(false);*/
    }//GEN-LAST:event_lblMenuReportMouseClicked

    private void lblMenuProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuProductMouseClicked
        selectButton(pnlCardProduct,subPnlProduct);
        notSelectButton(pnlCardOrder,subPnlOrdering);
        notSelectButton(pnlCardSettings,subPnlSettings);
        notSelectButton(pnlCardReport,subPnlReport);
        notSelectButton(pnlCardDashborad,subPnlDashboard);
        notSelectButton(pnlCardEmployee,subPnlEmployee);
        /*subPnlDashboard.setVisible(false);
        subPnlReport.setVisible(false);
        subPnlProduct.setVisible(true);
        subPnlSettings.setVisible(false);
        subPnlOrdering.setVisible(false);*/
    }//GEN-LAST:event_lblMenuProductMouseClicked

    private void lblMenuSettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuSettingsMouseClicked
        selectButton(pnlCardSettings,subPnlSettings);
        notSelectButton(pnlCardProduct,subPnlProduct);
        notSelectButton(pnlCardOrder,subPnlOrdering);
        notSelectButton(pnlCardReport,subPnlReport);
        notSelectButton(pnlCardDashborad,subPnlDashboard);
        notSelectButton(pnlCardEmployee,subPnlEmployee);
        /*subPnlDashboard.setVisible(false);
        subPnlReport.setVisible(false);
        subPnlProduct.setVisible(false);
        subPnlSettings.setVisible(true);
        subPnlOrdering.setVisible(false);*/
    }//GEN-LAST:event_lblMenuSettingsMouseClicked

    private void lblMenuOrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblMenuOrderMouseClicked
        selectButton(pnlCardOrder,subPnlOrdering);
        notSelectButton(pnlCardProduct,subPnlProduct);
        notSelectButton(pnlCardSettings,subPnlSettings);
        notSelectButton(pnlCardReport,subPnlReport);
        notSelectButton(pnlCardDashborad,subPnlDashboard);
        notSelectButton(pnlCardEmployee,subPnlEmployee);
        /*subPnlDashboard.setVisible(false);
        subPnlReport.setVisible(false);
        subPnlProduct.setVisible(false);
        subPnlSettings.setVisible(false);
        subPnlOrdering.setVisible(true);*/

    }//GEN-LAST:event_lblMenuOrderMouseClicked

     private void selectButton(Panel lbl,Panel pnl) {
        lbl.setBackground(new Color(58,175,169));
        
        pnl.setVisible(true);
        
    }

    private void notSelectButton(Panel lbl,Panel pnl) {
        lbl.setBackground(new Color(43,122,120));
        pnl.setVisible(false);
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

     StockClass sk=new StockClass();
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        /* JOptionPane.showMessageDialog(null, "open");
        selectButton(pnlCardDashborad,subPnlDashboard);
         */
        sk.coneWeightGet();
        setVisiblePanel();
        lblUserId.setText(""+userIdAccess);
        lblUserName.setText(userNameAccess);
        pnlEmpAccount.setVisible(false);
        clearLogErr();
        txtEmpName.hasFocus();
        employeeDataShowTable();
        stockDataShowTable();
        getProductName();
    }//GEN-LAST:event_formWindowOpened

    
    
    
    private void lblNextMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblNextMouseClicked
        cardSide02.setVisible(true);
        cardSide01.setVisible(false);
    }//GEN-LAST:event_lblNextMouseClicked

    private void lblBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblBackMouseClicked
        cardSide02.setVisible(false);
        cardSide01.setVisible(true);
    }//GEN-LAST:event_lblBackMouseClicked

    private void txtEmpNicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpNicActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpNicActionPerformed

    private void comEmpAccTypeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comEmpAccTypeItemStateChanged
        
    }//GEN-LAST:event_comEmpAccTypeItemStateChanged

    private void comEmpAccTypeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comEmpAccTypeMouseExited

    }//GEN-LAST:event_comEmpAccTypeMouseExited

    private void comEmpAccTypeMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comEmpAccTypeMousePressed

    }//GEN-LAST:event_comEmpAccTypeMousePressed

    private void comEmpAccTypeMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comEmpAccTypeMouseReleased

    }//GEN-LAST:event_comEmpAccTypeMouseReleased

    private void lblEmployeeAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblEmployeeAddMouseClicked
        selectButton(pnlCardEmployee,subPnlEmployee);
        notSelectButton(pnlCardProduct,subPnlProduct);
        notSelectButton(pnlCardSettings,subPnlSettings);
        notSelectButton(pnlCardReport,subPnlReport);
        notSelectButton(pnlCardProduct,subPnlProduct);
        notSelectButton(pnlCardOrder,subPnlOrdering);
    }//GEN-LAST:event_lblEmployeeAddMouseClicked

    private void txtEmpEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmpEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmpEmailActionPerformed

    public void setLogErr() {
        lblErrName.setVisible(true);
        lblErrNic.setVisible(true);
        lblErrAddress.setVisible(true);
        lblErrGender.setVisible(true);
        lblErrEmail.setVisible(true);
        lblErrTp.setVisible(true);
        lblErrAccType.setVisible(true);
        lblErrUserName.setVisible(true);
        lblErrPassword.setVisible(true);

    }
    public void clearLogErr() {
        lblErrName.setVisible(false);
        lblErrNic.setVisible(false);
        lblErrAddress.setVisible(false);
        lblErrGender.setVisible(false);
        lblErrEmail.setVisible(false);
        lblErrTp.setVisible(false);
        lblErrAccType.setVisible(false);
        lblErrUserName.setVisible(false);
        lblErrPassword.setVisible(false);

    }
    
    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        String Ename = txtEmpName.getText();
        String Enic = txtEmpNic.getText();
        String EaccType = (String) comEmpAccType.getSelectedItem();
        String Eaddress = txtEmpAddress.getText();
        Object Egender = comEmpGender.getSelectedItem();
        String Etp = txtEmpTp.getText();
        String Eemail = txtEmpEmail.getText();
        String EuserName = txtEmpUserName.getText();
        String Epass = txtEmpPassword.getText();
        String EpassCom = txtEmpComfirmPassword.getText();

        if (Ename.equals("") || Enic.equals("") || EaccType.equals("Select Account Type") || Eaddress.equals("") || Egender.toString().equals("Select Gender") || Etp.equals("") || Eemail.equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Values");
            setLogErr();

        } else if (!(Ename.matches("^(?=.{1,45}$)[a-zA-Z\\s]+$"))) {
            JOptionPane.showMessageDialog(null, "Invalid name");
            clearLogErr();
            lblErrName.setVisible(true);
        } else if (!(Enic.matches("^(?:19|20)?\\d{2}[0-9]{10}|[0-9]{9}[x|X|v|V]$"))) {
            JOptionPane.showMessageDialog(null, "Invalid NIC");
            clearLogErr();
            lblErrNic.setVisible(true);
        } else if (!(Eaddress.matches("^[#.0-9a-zA-Z\\s,-]+$"))) {
            JOptionPane.showMessageDialog(null, "Invalid Address");
            clearLogErr();
            lblErrAddress.setVisible(true);
        } else if (!(Eemail.matches("\\b[a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}\\b"))) {
            JOptionPane.showMessageDialog(null, "Invalid email address");
            clearLogErr();
            lblErrEmail.setVisible(true);
        } else if (!Etp.matches("^[0]?(\\d{9})$")) {
            JOptionPane.showMessageDialog(null, "Invalid Phone number");
            clearLogErr();
            lblErrTp.setVisible(true);
        } else if (EaccType.equals("Cashier_Account") || EaccType.equals("Admin_Account")) {

            clearLogErr();
            if (EuserName.equals("") || Epass.equals("") || EpassCom.equals("")) {
                JOptionPane.showMessageDialog(null, "Enter account Details");
                lblErrUserName.setVisible(true);
                lblErrPassword.setVisible(true);
            } else if (!(EuserName.matches("^[a-zA-Z0-9._-]{3,18}$"))) {
                JOptionPane.showMessageDialog(null, "invalid user name");
                lblErrUserName.setVisible(true);
                lblErrPassword.setVisible(false);
            } else if (!(EpassCom.matches("^.*(?=.{8,18})(?=..*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=]).*$"))) {
                JOptionPane.showMessageDialog(null, "Password must contain A-Z a-z 0-9 and special charactor");
                lblErrUserName.setVisible(false);
                lblErrPassword.setVisible(true);
            } else if (!(Epass.equals(EpassCom))) {
                JOptionPane.showMessageDialog(null, "Password Not Match");
                lblErrUserName.setVisible(false);
                lblErrPassword.setVisible(true);
            } /*else if (Epass.length() <= 8 || Epass.length() >= 18) {
                JOptionPane.showMessageDialog(null, "password length Must have between 8 and 18 ");
                lblErrUserName.setVisible(false);
                lblErrPassword.setVisible(true);
            } */ else {
    
                clearLogErr();
                try {
                    openConnection();

                    //Qry Begin
                    String sqlQryM = "insert into userTable(uName,nic,accType,address,gender,tp,email,accUserName,accPassword) values('" + Ename + "','" + Enic + "','" + EaccType + "','" + Eaddress + "','" + Egender + "','" + Etp + "','" + Eemail + "','" + EuserName + "','" + Epass + "')";
                    Statement sta = conn.createStatement();
                    sta.executeUpdate(sqlQryM);
                    JOptionPane.showMessageDialog(null, "Account Create Succssusfully");
                    clearData();
                    //Cls Qry
                } catch (Exception ee) {
                    System.out.println("Err add new employee : " + ee);
                } finally {
                    closeConnection();
                    employeeDataShowTable();
                    System.out.println("Colose Connection Emp");
                }
    
            }

        } else {
            clearLogErr();
            try {
                openConnection();

                //Qry Begin
                String sqlQryN = "insert into userTable(uName,nic,accType,address,gender,tp,email)values('" + Ename + "','" + Enic + "','" + EaccType + "','" + Eaddress + "','" + Egender + "','" + Etp + "','" + Eemail + "')";
                Statement sta = conn.createStatement();
                sta.executeUpdate(sqlQryN);
                JOptionPane.showMessageDialog(null, "New Employee Adding Succusfully");
                clearData();
                //Cls Qry
            } catch (Exception ee) {
                System.out.println("Err add new employee : " + ee);
            } finally {
                closeConnection();
                employeeDataShowTable();
                System.out.println("Colose Connection Emp");
            }
    
        }//ShowDatabaseDataTable();


    }//GEN-LAST:event_jButton9MouseClicked

    public void employeeDataShowTable(){
        openConnection();
        try{
            
            
            Statement st=conn.createStatement();
            String qraryShowData="select uName,nic,gender,tp,address from usertable where liveAccount !=0";
            ResultSet rs=st.executeQuery(qraryShowData);
            ResultSetMetaData rsmd=rs.getMetaData();
            
            DefaultTableModel EmpTblData=(DefaultTableModel)tblEmpList.getModel();
            
            int col=rsmd.getColumnCount();
            String [] colName=new String[col];
            for(int a=0;a<col;a++){
                colName[a]=rsmd.getColumnName(a+1);
                EmpTblData.setColumnIdentifiers(colName);
            }
            String name,nic,gender,tp,address;
            while(rs.next()){
                name=rs.getString("uName");
                nic=rs.getString("nic");
                gender=rs.getString("gender");
                tp=rs.getString("tp");
                address=rs.getString("address");
                
                String [] rowArr={name,nic,gender,tp,address};
                EmpTblData.addRow(rowArr);
            }
            st.close();
            
        }catch(Exception e){
            System.out.println("employee data show table err");
        }finally{
            closeConnection();
        }
        
        
    }
    
    public void stockDataShowTable(){
        openConnection();
        try{
            
            
            Statement st=conn.createStatement();
            String qraryShowData="select stock.StockID,product.PName,stock.ProductID,stock.QuantityStock from stock INNER JOIN product on stock.ProductID=product.ProductID where liveStock !=0";
            ResultSet rs=st.executeQuery(qraryShowData);
            ResultSetMetaData rsmd=rs.getMetaData();
            
            DefaultTableModel stockTableData=(DefaultTableModel)tblStockProductQuantity.getModel();
            
            int col=rsmd.getColumnCount();
            String [] colName=new String[col];
            for(int a=0;a<col;a++){
                colName[a]=rsmd.getColumnName(a+1);
                stockTableData.setColumnIdentifiers(colName);
            }
            String productName;
            int stockId,ProductId;
            double Quantity;
            while(rs.next()){
                stockId=rs.getInt("StockID");
                 productName=rs.getString("PName");
                ProductId=rs.getInt("ProductID");
                Quantity=rs.getDouble("QuantityStock");
                
                //double [] rowArr={stockId,ProductId,Quantity};
                Vector ve=new Vector();
                ve.add(stockId);
                ve.add(productName);
                ve.add(ProductId);
                ve.add(Quantity);
                stockTableData.addRow(ve);
            }
            st.close();
        }catch(Exception e){
            System.out.println("employee data show table err");
        }finally{
            closeConnection();
        }
        
        
    }
    
    
    private void btnDarkColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarkColorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDarkColorActionPerformed

    
    
    private void btnDarkColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDarkColorMouseClicked
        Color selectedColor = JColorChooser.showDialog(this, "Choose a color", lblDarkColor.getBackground());
        if (selectedColor != null) {
            lblDarkColor.setForeground(selectedColor);
            // Extract RGB values
            int red = selectedColor.getRed();
            int green = selectedColor.getGreen();
            int blue = selectedColor.getBlue();
            
            // Store RGB values in variables
            int[] rgbValues = {red, green, blue};

            // Print RGB values for demonstration purposes
            //System.out.println("Selected RGB Color: " + rgbValues[0] + ", " + rgbValues[1] + ", " + rgbValues[2]);
            lblDarkColor.setText((rgbValues[0] + ", " + rgbValues[1] + ", " + rgbValues[2]).toString());
            
            Color darkColor = new Color(rgbValues[0], rgbValues[1], rgbValues[2]);
            subPnlEmployee.setBackground(darkColor);
        pnlDetailsEmp.setBackground(darkColor);
        pnlEmpAccUserDetails.setBackground(darkColor);
        pnlEmpAccount.setBackground(darkColor);
        pnlSideMenu.setBackground(darkColor);
        pnlSideAccountDetails.setBackground(darkColor);

        pnlCardDashborad.setBackground(darkColor);
        pnlCardReport.setBackground(darkColor);
        pnlCardProduct.setBackground(darkColor);
        pnlCardOrder.setBackground(darkColor);
        pnlCardSettings.setBackground(darkColor);
        pnlLogOut.setBackground(darkColor);

        subPnlDashboard.setBackground(darkColor);
        subPnlReport.setBackground(darkColor);
        subPnlProduct.setBackground(darkColor);
        subPnlSettings.setBackground(darkColor);
        subPnlOrdering.setBackground(darkColor);
        

        pnlProductSideBar.setBackground(darkColor);
        cardSide01.setBackground(darkColor);
        cardSide02.setBackground(darkColor);
        pnlItems1.setBackground(darkColor);
        pnlItems2.setBackground(darkColor);
        pnlItems3.setBackground(darkColor);
        pnlItems4.setBackground(darkColor);
        pnlItems5.setBackground(darkColor);
        pnlItems6.setBackground(darkColor);

        pnlItems7.setBackground(darkColor);
        pnlItems8.setBackground(darkColor);
        pnlItems9.setBackground(darkColor);
        pnlItems10.setBackground(darkColor);
        pnlItems11.setBackground(darkColor);
        pnlItems12.setBackground(darkColor);

        subPnlSettings.setBackground(darkColor);
        
        pnlSalesTable.setBackground(darkColor);
        pnlStockTable.setBackground(darkColor);
        pnlStockAdding.setBackground(darkColor);
        pnlSalesTable.setForeground(darkColor);
        pnlStockTable.setForeground(darkColor); 
        pnlDetailsEmp.setForeground(darkColor);
        }
    }//GEN-LAST:event_btnDarkColorMouseClicked

    private void btnLittleColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLittleColorMouseClicked
        Color selectedColor = JColorChooser.showDialog(this, "Choose a color", lblLittleColor.getBackground());
        if (selectedColor != null) {
            lblLittleColor.setForeground(selectedColor);
            // Extract RGB values
            int red = selectedColor.getRed();
            int green = selectedColor.getGreen();
            int blue = selectedColor.getBlue();
            
            // Store RGB values in variables
            int[] rgbValues = {red, green, blue};

            // Print RGB values for demonstration purposes
            //System.out.println("Selected RGB Color: " + rgbValues[0] + ", " + rgbValues[1] + ", " + rgbValues[2]);
            lblLittleColor.setText((rgbValues[0] + ", " + rgbValues[1] + ", " + rgbValues[2]).toString());
            
            Color littleColor = new Color(rgbValues[0], rgbValues[1], rgbValues[2]);

        pnlMainBackground.setBackground(littleColor);
        pnlMainDash.setBackground(littleColor);
        }
        
        
        /*String EaccType = (String) comSetColorFont.getSelectedItem();

        if (EaccType.equals("Black_and_White")) {
            fontColorHed = "1,1,1";
            fontColorNormal = "255,255,255";
        } else if (EaccType.equals("White_and_Black")) {
            fontColorHed = "255,255,255";
            fontColorNormal = "1,1,1";
        } else if (EaccType.equals("Green_and_Red")) {
            fontColorHed = "1,150,1";
            fontColorNormal = "150,1,1";
        } else {
            fontColorHed = "150,1,1";
            fontColorNormal = "1,150,1";
        }

        String[] fontColorDarkArr = fontColorHed.split(",");
        int color1 = Integer.parseInt(fontColorDarkArr[0]);
        int color2 = Integer.parseInt(fontColorDarkArr[1]);
        int color3 = Integer.parseInt(fontColorDarkArr[2]);
        
        Color fontdarkColor = new Color(color1, color2, color3);
        

        String[] fontColorLittleArr = fontColorNormal.split(",");
        */
    }//GEN-LAST:event_btnLittleColorMouseClicked

    private void btnHedColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHedColorMouseClicked
        Color selectedColor = JColorChooser.showDialog(this, "Choose a color", lblFontLittleColor.getBackground());
        if (selectedColor != null) {
            lblFontLittleColor.setForeground(selectedColor);
            // Extract RGB values
            int red = selectedColor.getRed();
            int green = selectedColor.getGreen();
            int blue = selectedColor.getBlue();
            
            // Store RGB values in variables
            int[] rgbValues = {red, green, blue};

            // Print RGB values for demonstration purposes
            //System.out.println("Selected RGB Color: " + rgbValues[0] + ", " + rgbValues[1] + ", " + rgbValues[2]);
            lblFontLittleColor.setText((rgbValues[0] + ", " + rgbValues[1] + ", " + rgbValues[2]).toString());
            
            
        Color fontlittleColor = new Color(rgbValues[0], rgbValues[1], rgbValues[2]);
        lblId1.setForeground(fontlittleColor); lblId2.setForeground(fontlittleColor);
        lblId3.setForeground(fontlittleColor); lblId4.setForeground(fontlittleColor);
        lblId5.setForeground(fontlittleColor); lblId6.setForeground(fontlittleColor);
        lblId7.setForeground(fontlittleColor); lblId8.setForeground(fontlittleColor);
        lblId9.setForeground(fontlittleColor); lblId10.setForeground(fontlittleColor);
        lblId11.setForeground(fontlittleColor); lblId12.setForeground(fontlittleColor);
        lblDark3.setForeground(fontlittleColor);
        lblEmp1.setForeground(fontlittleColor); lblEmp2.setForeground(fontlittleColor);
        lblEmp3.setForeground(fontlittleColor); lblEmp4.setForeground(fontlittleColor);
        lblEmp5.setForeground(fontlittleColor); lblEmp7.setForeground(fontlittleColor);
        lblEmp6.setForeground(fontlittleColor); lblEmp8.setForeground(fontlittleColor);
        lblEmp9.setForeground(fontlittleColor); lblEmp10.setForeground(fontlittleColor);
        lblEmp11.setForeground(fontlittleColor); lblSales.setForeground(fontlittleColor);
        lblStock.setForeground(fontlittleColor); lblStock2.setForeground(fontlittleColor);
        lblStock3.setForeground(fontlittleColor); lblStock4.setForeground(fontlittleColor);
                
        lblHed1.setForeground(fontlittleColor); lblHed2.setForeground(fontlittleColor);
        lblUserName.setForeground(fontlittleColor); lblUserId.setForeground(fontlittleColor);
        lblMenuDashboard.setForeground(fontlittleColor); lblMenuReport.setForeground(fontlittleColor);
        lblMenuProduct.setForeground(fontlittleColor); lblMenuSettings.setForeground(fontlittleColor);
        lblMenuOrder.setForeground(fontlittleColor); lblEmployeeAdd.setForeground(fontlittleColor);
        lblRep1.setForeground(fontlittleColor); lblRep2.setForeground(fontlittleColor);
        lblRep3.setForeground(fontlittleColor); lblPro1.setForeground(fontlittleColor);
        lblPro2.setForeground(fontlittleColor); lblSet1.setForeground(fontlittleColor);
        lblSet2.setForeground(fontlittleColor); lblIt1.setForeground(fontlittleColor);
        lblIt2.setForeground(fontlittleColor); lblIt3.setForeground(fontlittleColor);
        lblIt4.setForeground(fontlittleColor); lblIt5.setForeground(fontlittleColor);
        lblIt6.setForeground(fontlittleColor);
        lblIt7.setForeground(fontlittleColor); lblIt8.setForeground(fontlittleColor);
        lblIt9.setForeground(fontlittleColor); lblIt10.setForeground(fontlittleColor);
        lblIt11H.setForeground(fontlittleColor); lblIt12H.setForeground(fontlittleColor);
        }
    }//GEN-LAST:event_btnHedColorMouseClicked

    
    public void getProductName() {

        try {

            openConnection();

            Statement str = conn.createStatement();
            ResultSet rs = str.executeQuery("select PName from product");

            comProductName.addItem("Select_One");
            while (rs.next()) {
                String ProName = rs.getString("PName");
                comProductName.addItem(ProName);
            }

        } catch (Exception xx) {
            System.out.println("get Product details");
        } finally {
            closeConnection();
        }

    }
    
    private void btnNorColorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNorColorMouseClicked
        Color selectedColor = JColorChooser.showDialog(this, "Choose a color", lblNorColor.getBackground());
        if (selectedColor != null) {
            lblNorColor.setForeground(selectedColor);
            // Extract RGB values
            int red = selectedColor.getRed();
            int green = selectedColor.getGreen();
            int blue = selectedColor.getBlue();
            
            // Store RGB values in variables
            int[] rgbValues = {red, green, blue};

            // Print RGB values for demonstration purposes
            //System.out.println("Selected RGB Color: " + rgbValues[0] + ", " + rgbValues[1] + ", " + rgbValues[2]);
            lblNorColor.setText((rgbValues[0] + ", " + rgbValues[1] + ", " + rgbValues[2]).toString());
            
            Color fontdarkColor = new Color(rgbValues[0], rgbValues[1], rgbValues[2]);

        lblLogOut1.setForeground(fontdarkColor);
        lbldark4.setForeground(fontdarkColor); lbldark5.setForeground(fontdarkColor);
        lblDark1.setForeground(fontdarkColor); lblDark2.setForeground(fontdarkColor);
        lblSales1.setForeground(fontdarkColor); lblStock1.setForeground(fontdarkColor);
        lblStock5.setForeground(fontdarkColor); lblStock6.setForeground(fontdarkColor);
        lblStock7.setForeground(fontdarkColor); lblStock8.setForeground(fontdarkColor);
        lblStock9.setForeground(fontdarkColor); lblStock10.setForeground(fontdarkColor);
        lblTotalStock.setForeground(fontdarkColor);
        lblHed3.setForeground(fontdarkColor); lblHed4.setForeground(fontdarkColor);
        lblRep4.setForeground(fontdarkColor); lblPro3.setForeground(fontdarkColor);
        lblPro5.setForeground(fontdarkColor); lblPro6.setForeground(fontdarkColor);
        lblOrd1.setForeground(fontdarkColor); lblOrd2.setForeground(fontdarkColor);
        lblOrd3.setForeground(fontdarkColor); lblOrderTotal.setForeground(fontdarkColor);
        lblOrderChange.setForeground(fontdarkColor); 
        lblIt11.setForeground(fontdarkColor); lblIt12.setForeground(fontdarkColor);
        lblIt13.setForeground(fontdarkColor); lblIt14.setForeground(fontdarkColor);
        lblIt21.setForeground(fontdarkColor); lblIt22.setForeground(fontdarkColor);
        lblIt23.setForeground(fontdarkColor); lblIt24.setForeground(fontdarkColor); 
        lblIt31.setForeground(fontdarkColor); lblIt32.setForeground(fontdarkColor);
        lblIt33.setForeground(fontdarkColor); lblIt34.setForeground(fontdarkColor);
        lblIt41.setForeground(fontdarkColor); lblIt42.setForeground(fontdarkColor);
        lblIt43.setForeground(fontdarkColor); lblIt44.setForeground(fontdarkColor);
        lblIt51.setForeground(fontdarkColor); lblIt52.setForeground(fontdarkColor);
        lblIt53.setForeground(fontdarkColor); lblIt54.setForeground(fontdarkColor);
        lblIt61.setForeground(fontdarkColor); lblIt62.setForeground(fontdarkColor);
        lblIt63.setForeground(fontdarkColor); lblIt64.setForeground(fontdarkColor);
        lblIt71.setForeground(fontdarkColor); lblIt72.setForeground(fontdarkColor);
        lblIt73.setForeground(fontdarkColor); lblIt74.setForeground(fontdarkColor);
        lblIt81.setForeground(fontdarkColor); lblIt82.setForeground(fontdarkColor);
        lblIt83.setForeground(fontdarkColor); lblIt84.setForeground(fontdarkColor); 
        lblIt91.setForeground(fontdarkColor); lblIt92.setForeground(fontdarkColor);
        lblIt93.setForeground(fontdarkColor); lblIt94.setForeground(fontdarkColor);
        lblIt101.setForeground(fontdarkColor); lblIt102.setForeground(fontdarkColor);
        lblIt103.setForeground(fontdarkColor); lblIt104.setForeground(fontdarkColor);
        lblIt111.setForeground(fontdarkColor); lblIt112.setForeground(fontdarkColor);
        lblIt113.setForeground(fontdarkColor); lblIt114.setForeground(fontdarkColor);
        lblIt121.setForeground(fontdarkColor); lblIt122.setForeground(fontdarkColor);
        lblIt123.setForeground(fontdarkColor); lblIt124.setForeground(fontdarkColor);
        }
    }//GEN-LAST:event_btnNorColorMouseClicked
    
    ProductClass prrr=new ProductClass();
    private void comItems1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comItems1ActionPerformed
        prrr.getProduct(lblIt6,lblId7,lblIt62,comItems1,txtItems1 ,tblOrderList );
    }//GEN-LAST:event_comItems1ActionPerformed

    private void comItems6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comItems6ActionPerformed
        prrr.getProduct(lblIt1,lblId12,lblIt12,comItems6,txtItems6 ,tblOrderList );
    }//GEN-LAST:event_comItems6ActionPerformed

    private void comItems12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comItems12ActionPerformed
        prrr.getProduct(lblIt7,lblId6,lblIt72,comItems12,txtItems12 ,tblOrderList );
    }//GEN-LAST:event_comItems12ActionPerformed

    private void comItems11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comItems11ActionPerformed
        prrr.getProduct(lblIt8,lblId5,lblIt82,comItems11,txtItems11 ,tblOrderList );
    }//GEN-LAST:event_comItems11ActionPerformed

    private void comItems9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comItems9ActionPerformed
        prrr.getProduct(lblIt10,lblId3,lblIt102,comItems10,txtItems10 ,tblOrderList );
    }//GEN-LAST:event_comItems9ActionPerformed

    private void comItems10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comItems10ActionPerformed
        prrr.getProduct(lblIt9,lblId4,lblIt92,comItems11,txtItems11 ,tblOrderList );
    }//GEN-LAST:event_comItems10ActionPerformed

    private void comItems8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comItems8ActionPerformed
        prrr.getProduct(lblIt11H,lblId2,lblIt112,comItems8,txtItems8 ,tblOrderList );
    }//GEN-LAST:event_comItems8ActionPerformed

    private void comItems7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comItems7ActionPerformed
        prrr.getProduct(lblIt12H,lblId1,lblIt122,comItems7,txtItems7 ,tblOrderList );
    }//GEN-LAST:event_comItems7ActionPerformed

    private void comItems5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comItems5ActionPerformed
        prrr.getProduct(lblIt2,lblId11,lblIt22,comItems5,txtItems5 ,tblOrderList );
    }//GEN-LAST:event_comItems5ActionPerformed

    private void comItems3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comItems3ActionPerformed
        prrr.getProduct(lblIt3,lblId9,lblIt32,comItems3,txtItems3 ,tblOrderList );
    }//GEN-LAST:event_comItems3ActionPerformed

    private void comItems4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comItems4ActionPerformed
        prrr.getProduct(lblIt4,lblId10,lblIt42,comItems4,txtItems4 ,tblOrderList );
    }//GEN-LAST:event_comItems4ActionPerformed

    private void comItems2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comItems2ActionPerformed
        prrr.getProduct(lblIt5,lblId8,lblIt52,comItems2,txtItems2 ,tblOrderList );
    }//GEN-LAST:event_comItems2ActionPerformed

    private void cardSide01MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardSide01MouseExited
        prrr.calTotalOrder(lblOrderTotal,tblOrderList);
    }//GEN-LAST:event_cardSide01MouseExited

    private void cardSide02MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cardSide02MouseExited
        prrr.calTotalOrder(lblOrderTotal,tblOrderList);
    }//GEN-LAST:event_cardSide02MouseExited

    //StockClass stro=new StockClass();
    private void btnOrderRemoveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderRemoveMouseClicked
      clearOrderData();        
prrr.loadSalesTotal();
        
        //stro.decreasesOldStock(lblId7,600.00);
    }//GEN-LAST:event_btnOrderRemoveMouseClicked

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
     
    
    
    
    private void btnOrderPayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderPayMouseClicked
        prrr.payOrder(tblOrderList,lblOrderTotal,txtOrderAmount,lblOrderChange);
    }//GEN-LAST:event_btnOrderPayMouseClicked

    private void comEmpAccTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comEmpAccTypeActionPerformed
        String EaccType = (String) comEmpAccType.getSelectedItem();
        if (EaccType.equals("Cashier_Account") || EaccType.equals("Admin_Account")) {

            pnlEmpAccount.setVisible(true);

        } else {
            pnlEmpAccount.setVisible(false);

        }
    }//GEN-LAST:event_comEmpAccTypeActionPerformed

    private void btnCleanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCleanMouseClicked
        clearData();
        clearLogErr();
    }//GEN-LAST:event_btnCleanMouseClicked

    
    public double ProductPrise(String name){
        double proCoun=0.00;
        try {

            openConnection();

            PreparedStatement ps = conn.prepareStatement("select PPrice from product where PName='"+name+"'");
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                
                proCoun=Double.parseDouble(rs.getString("PPrice"));
            }

        } catch (Exception xx) {
            System.out.println("get Product details err");
        } finally {
            closeConnection();
        }
       
        return proCoun;
    }
    
    
    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        String StockItemName = (String) comProductName.getSelectedItem();
        String StockKG = txtStockKg.getText();
        String StockG = txtStockG.getText();
        DecimalFormat df=new DecimalFormat("#.");

        if (StockItemName.equals("Select_One")  || ((StockKG.equals("0") && StockG.equals("0")) == true)) {
            JOptionPane.showMessageDialog(null, "Enter All");
        } else if ((!(StockKG.matches("^-?\\d+(\\.\\d+)?$"))) || (!(StockG.matches("^-?\\d+(\\.\\d+)?$")))) {
            JOptionPane.showMessageDialog(null, "invalid prise");
        } else {
            double totalGrams = Double.parseDouble(StockG) + (Double.parseDouble(StockKG) * 1000);
            double EslimatedConeCount=totalGrams/StockClass.coneWeight;
            String esCounCon=df.format(EslimatedConeCount);
            
            double produPrise=ProductPrise((String)StockItemName);
            double stockPrise=produPrise*(Double.parseDouble(esCounCon));
            lblTotalStock.setText(totalGrams+"g");
            lblStock7.setText(""+esCounCon);
            lblStock9.setText("RS:+"+stockPrise);
            
            
            try {
                String sqlQry="update stock set QuantityStock = QuantityStock+'"+totalGrams+"' where ProductID=(select ProductId from product where PName='"+(String)StockItemName+"')";    
            
                openConnection();
                
                Statement sta = conn.createStatement();
                sta.executeUpdate(sqlQry);
                

            } catch (Exception ee) {
                System.out.println("Stock adding err");
            } finally {
                closeConnection();
            }
        }


        
    }//GEN-LAST:event_jButton6MouseClicked

    private void txtStockKgFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStockKgFocusLost
        if(txtStockKg.getText().trim().isEmpty()){
           txtStockKg.setText("0");
        }
    }//GEN-LAST:event_txtStockKgFocusLost

    private void txtStockKgFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStockKgFocusGained
        txtStockKg.setText("");
    }//GEN-LAST:event_txtStockKgFocusGained

    private void txtStockGFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStockGFocusGained
        txtStockG.setText("");
    }//GEN-LAST:event_txtStockGFocusGained

    private void txtStockGFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtStockGFocusLost
        if(txtStockG.getText().trim().isEmpty()){
           txtStockG.setText("0");
       }
    }//GEN-LAST:event_txtStockGFocusLost
    String path2;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         JFileChooser chooser = new JFileChooser(); //show dialogbox
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        String path = f.getAbsolutePath();
        txtPicProduct.setText(path.toString());                                

        try {
            BufferedImage bi = ImageIO.read(new File(path));
            Image img = bi.getScaledInstance(295, 268, Image.SCALE_SMOOTH); //SET FILE AND SET SIZE[313, 276]

            ImageIcon icon = new ImageIcon(img);
            jLabel47.setIcon(icon);//set icon image
            path2 = path;

        } catch (Exception e) {
            System.out.println("err img get" + e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        String FlavourName = jTextField7.getText();
        String ProPrice = jTextField8.getText();

        if (FlavourName.equals("") || txtPicProduct.equals("") || ProPrice.equals("")) {
            JOptionPane.showMessageDialog(null, "Enter values");
            
        } else if (!(FlavourName.matches("^(?=.{1,45}$)[a-zA-Z\\s]+$"))) {
            
            JOptionPane.showMessageDialog(null, "invalid name");
            
        } else if (!(ProPrice.matches("^-?\\d+(\\.\\d+)?$"))) {
          
            JOptionPane.showMessageDialog(null, "invalid prise");
            
        }else {
            
            double DprisePro = Double.parseDouble(ProPrice);
            try {
                openConnection();
                InputStream is = new FileInputStream(new File(path2));
                String QryPro = "insert into product(PName,PPrice,Pimgage) values('" + FlavourName + "','" + DprisePro + "','" + is + "')";

                Statement sta = conn.createStatement();
                sta.executeUpdate(QryPro);
                JOptionPane.showMessageDialog(null, "Product added");
                // PreparedStatement pst=conn.prepareStatement(QryPro);
                //pst.setString()

               ProductDataShowTable();
               jTextField7.setText("");
               txtPicProduct.setText("");
               jTextField8.setText("");
               jLabel47.setIcon(null);
               
            } catch (Exception d) {
                //JOptionPane.showMessageDialog(null, "err");
                System.out.println("product add err " + d);
            } finally {
                closeConnection();
                
            }
        }
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        txtStockKg.setText("");
        txtStockG.setText("");
    }//GEN-LAST:event_jButton8MouseClicked

    
    public void ProductDataShowTable(){
        openConnection();
        try{
            
            
            Statement st=conn.createStatement();
            String qraryShowData="select PName,PPrice from product where liveProduct=1";
            ResultSet rs=st.executeQuery(qraryShowData);
            ResultSetMetaData rsmd=rs.getMetaData();
            
            DefaultTableModel EmpTblData=(DefaultTableModel)tblProductList.getModel();
            
            int col=rsmd.getColumnCount();
            String [] colName=new String[col];
            for(int a=0;a<col;a++){
                colName[a]=rsmd.getColumnName(a+1);
                EmpTblData.setColumnIdentifiers(colName);
            }
            String name,prise;
            while(rs.next()){
                name=rs.getString("PName");
                prise=rs.getString("PPrice");
                
                
                String [] rowArr={name,prise};
                EmpTblData.addRow(rowArr);
            }
            st.close();
        }catch(Exception e){
            System.out.println("employee data show table err");
        }finally{
            closeConnection();
        }
        
        
    }
    
    public void clearData() {
        txtEmpName.setText("");
        txtEmpNic.setText("");
        comEmpAccType.setSelectedItem("Select Account Type");
        txtEmpAddress.setText("");
        comEmpGender.setSelectedItem("Select Gender");
        txtEmpTp.setText("");
        txtEmpEmail.setText("");
        txtEmpUserName.setText("");
        txtEmpPassword.setText("");
        txtEmpComfirmPassword.setText("");
        txtEmpName.hasFocus();
    }
    /*
    public void clearOrderData(){
        
        double x=StockClass.coneWeight;
        String items1 = (String) comItems1.getSelectedItem();
        String items2 = (String) comItems2.getSelectedItem();
        String items3 = (String) comItems3.getSelectedItem();
        String items4 = (String) comItems4.getSelectedItem();
        String items5 = (String) comItems5.getSelectedItem();
        String items6 = (String) comItems6.getSelectedItem();
        String items7 = (String) comItems7.getSelectedItem();
        String items8 = (String) comItems8.getSelectedItem();
        String items9 = (String) comItems9.getSelectedItem();
        String items10 = (String) comItems10.getSelectedItem();
        String items11 = (String) comItems11.getSelectedItem();
        String items12 = (String) comItems12.getSelectedItem();
        
        if(items1 !="0"){
            
            sk.decreasesOldStock(lblId7, x*(Double.parseDouble(items1)));
            comItems1.setSelectedItem("0");
            txtItems1.setText("");
        }else if(items2 !="0"){
            
            sk.decreasesOldStock(lblId8, x*(Double.parseDouble(items2)));
            comItems2.setSelectedItem("0");
            txtItems2.setText("");
        }else if(items3!="0"){
            
            sk.decreasesOldStock(lblId9, x*(Double.parseDouble(items3)));
            comItems3.setSelectedItem("0");
            txtItems3.setText("");
        }else if(items4!="0"){
            
            sk.decreasesOldStock(lblId10, x*(Double.parseDouble(items4)));
            comItems4.setSelectedItem("0");
            txtItems4.setText("");
        }else if(items5!="0"){
            
            sk.decreasesOldStock(lblId11, x*(Double.parseDouble(items5)));
            comItems5.setSelectedItem("0");
            txtItems5.setText("");
        }else if(items6!="0"){
            
            sk.decreasesOldStock(lblId12, x*(Double.parseDouble(items6)));
            comItems6.setSelectedItem("0");
            txtItems6.setText("");
        }else if(items7!="0"){
            
            sk.decreasesOldStock(lblId1, x*(Double.parseDouble(items7)));
            comItems7.setSelectedItem("0");
            txtItems7.setText("");
        }else if(items8!="0"){
            
            sk.decreasesOldStock(lblId2, x*(Double.parseDouble(items8)));
            comItems8.setSelectedItem("0");
            txtItems8.setText("");
        }else if(items9!="0"){
            
            sk.decreasesOldStock(lblId3, x*(Double.parseDouble(items10)));
            comItems9.setSelectedItem("0");
            txtItems9.setText("");
        }else if(items10!="0"){
            
            sk.decreasesOldStock(lblId4, x*(Double.parseDouble(items9)));
            comItems10.setSelectedItem("0");
            txtItems10.setText("");
        }else if(items11!="0"){
            
            sk.decreasesOldStock(lblId5, x*(Double.parseDouble(items11)));
            comItems11.setSelectedItem("0");
            txtItems11.setText("");
        }else if(items12!="0"){
            
            sk.decreasesOldStock(lblId6, x*(Double.parseDouble(items12)));
            comItems12.setSelectedItem("0");
            txtItems12.setText("");
        }
     
    }
    */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new DashboarD().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClean;
    private javax.swing.JButton btnDarkColor;
    private javax.swing.JButton btnHedColor;
    private javax.swing.JButton btnLittleColor;
    private javax.swing.JButton btnNorColor;
    private javax.swing.JButton btnOrderPay;
    private javax.swing.JButton btnOrderRemove;
    private java.awt.Panel cardSide01;
    private java.awt.Panel cardSide02;
    private javax.swing.JComboBox<String> comEmpAccType;
    private javax.swing.JComboBox<String> comEmpGender;
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
    private javax.swing.JComboBox<String> comProductName;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox13;
    private javax.swing.JComboBox<String> jComboBox14;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JLabel lblBack;
    private javax.swing.JLabel lblDark1;
    private javax.swing.JLabel lblDark2;
    private javax.swing.JLabel lblDark3;
    private javax.swing.JLabel lblDarkColor;
    private javax.swing.JLabel lblEmp1;
    private javax.swing.JLabel lblEmp10;
    private javax.swing.JLabel lblEmp11;
    private javax.swing.JLabel lblEmp2;
    private javax.swing.JLabel lblEmp3;
    private javax.swing.JLabel lblEmp4;
    private javax.swing.JLabel lblEmp5;
    private javax.swing.JLabel lblEmp6;
    private javax.swing.JLabel lblEmp7;
    private javax.swing.JLabel lblEmp8;
    private javax.swing.JLabel lblEmp9;
    private javax.swing.JLabel lblEmployeeAdd;
    private javax.swing.JLabel lblErrAccType;
    private javax.swing.JLabel lblErrAddress;
    private javax.swing.JLabel lblErrEmail;
    private javax.swing.JLabel lblErrGender;
    private javax.swing.JLabel lblErrName;
    private javax.swing.JLabel lblErrNic;
    private javax.swing.JLabel lblErrPassword;
    private javax.swing.JLabel lblErrTp;
    private javax.swing.JLabel lblErrUserName;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblFontLittleColor;
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
    private javax.swing.JLabel lblLittleColor;
    private javax.swing.JLabel lblLogOut1;
    private javax.swing.JLabel lblMenuDashboard;
    private javax.swing.JLabel lblMenuOrder;
    private javax.swing.JLabel lblMenuProduct;
    private javax.swing.JLabel lblMenuReport;
    private javax.swing.JLabel lblMenuSettings;
    private javax.swing.JLabel lblNext;
    private javax.swing.JLabel lblNorColor;
    private javax.swing.JLabel lblOrd1;
    private javax.swing.JLabel lblOrd2;
    private javax.swing.JLabel lblOrd3;
    private javax.swing.JLabel lblOrderChange;
    private javax.swing.JLabel lblOrderTotal;
    private javax.swing.JLabel lblPerfilePic;
    private javax.swing.JLabel lblPro1;
    private javax.swing.JLabel lblPro2;
    private javax.swing.JLabel lblPro3;
    private javax.swing.JLabel lblPro5;
    private javax.swing.JLabel lblPro6;
    private javax.swing.JLabel lblRep1;
    private javax.swing.JLabel lblRep2;
    private javax.swing.JLabel lblRep3;
    private javax.swing.JLabel lblRep4;
    private javax.swing.JLabel lblSales;
    private javax.swing.JLabel lblSales1;
    private javax.swing.JLabel lblSet1;
    private javax.swing.JLabel lblSet2;
    private javax.swing.JLabel lblStock;
    private javax.swing.JLabel lblStock1;
    private javax.swing.JLabel lblStock10;
    private javax.swing.JLabel lblStock2;
    private javax.swing.JLabel lblStock3;
    private javax.swing.JLabel lblStock4;
    private javax.swing.JLabel lblStock5;
    private javax.swing.JLabel lblStock6;
    private javax.swing.JLabel lblStock7;
    private javax.swing.JLabel lblStock8;
    private javax.swing.JLabel lblStock9;
    private javax.swing.JLabel lblTotalStock;
    private javax.swing.JLabel lblUserId;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JLabel lbldark4;
    private javax.swing.JLabel lbldark5;
    private java.awt.Panel pnlCardDash;
    public java.awt.Panel pnlCardDashborad;
    private java.awt.Panel pnlCardEmployee;
    private java.awt.Panel pnlCardOrder;
    private java.awt.Panel pnlCardProduct;
    public java.awt.Panel pnlCardReport;
    private java.awt.Panel pnlCardSettings;
    private ExternalJavaFile.Panel pnlDetailsEmp;
    private java.awt.Panel pnlEmpAccUserDetails;
    private javax.swing.JPanel pnlEmpAccount;
    private java.awt.Panel pnlItems1;
    private java.awt.Panel pnlItems10;
    private java.awt.Panel pnlItems11;
    private java.awt.Panel pnlItems12;
    private java.awt.Panel pnlItems2;
    private java.awt.Panel pnlItems3;
    private java.awt.Panel pnlItems4;
    private java.awt.Panel pnlItems5;
    private java.awt.Panel pnlItems6;
    private java.awt.Panel pnlItems7;
    private java.awt.Panel pnlItems8;
    private java.awt.Panel pnlItems9;
    private java.awt.Panel pnlLogOut;
    private java.awt.Panel pnlMainBackground;
    private ExternalJavaFile.Panel pnlMainDash;
    private java.awt.Panel pnlMainItems;
    private java.awt.Panel pnlProductSideBar;
    private ExternalJavaFile.Panel pnlSalesTable;
    private java.awt.Panel pnlSideAccountDetails;
    private java.awt.Panel pnlSideMenu;
    private java.awt.Panel pnlStockAdding;
    private ExternalJavaFile.Panel pnlStockTable;
    private javax.swing.JScrollPane spnlEmployeeList;
    private javax.swing.JScrollPane spnlOrderBackground;
    private javax.swing.JScrollPane spnlProductList;
    private javax.swing.JScrollPane spnlSalesDetails;
    private javax.swing.JScrollPane spnlSalesProductCount;
    private javax.swing.JScrollPane spnlStockProductQuantity;
    public java.awt.Panel subPnlDashboard;
    private java.awt.Panel subPnlEmployee;
    private java.awt.Panel subPnlOrdering;
    private java.awt.Panel subPnlProduct;
    public java.awt.Panel subPnlReport;
    private java.awt.Panel subPnlSettings;
    private javax.swing.JTable tblEmpList;
    private javax.swing.JTable tblOrderList;
    private javax.swing.JTable tblProductList;
    private javax.swing.JTable tblSalesDetails;
    private javax.swing.JTable tblSalesProductCount;
    private javax.swing.JTable tblStockProductQuantity;
    private javax.swing.JTextArea txtEmpAddress;
    private javax.swing.JPasswordField txtEmpComfirmPassword;
    private javax.swing.JTextField txtEmpEmail;
    private javax.swing.JTextField txtEmpName;
    private javax.swing.JTextField txtEmpNic;
    private javax.swing.JPasswordField txtEmpPassword;
    private javax.swing.JTextField txtEmpTp;
    private javax.swing.JTextField txtEmpUserName;
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
    private javax.swing.JTextField txtPicProduct;
    private javax.swing.JTextField txtStockG;
    private javax.swing.JTextField txtStockKg;
    // End of variables declaration//GEN-END:variables
}
