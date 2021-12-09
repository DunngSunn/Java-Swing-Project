/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Form;

import CustomView.T_View;
import java.awt.FlowLayout;
import java.awt.GridLayout;

/**
 *
 * @author ngdun
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        MenuPanel = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Menu = new javax.swing.JPanel();
        btHome = new javax.swing.JButton();
        Separator1 = new javax.swing.JSeparator();
        lbTheLoai = new javax.swing.JLabel();
        Separator2 = new javax.swing.JSeparator();
        btTrinhtham = new javax.swing.JButton();
        btKinhdi = new javax.swing.JButton();
        btLangman = new javax.swing.JButton();
        btVientuong = new javax.swing.JButton();
        btVanhoc = new javax.swing.JButton();
        TopPanel = new javax.swing.JPanel();
        btTimkiem = new javax.swing.JButton();
        tbTimkiem = new javax.swing.JTextField();
        btLogin = new javax.swing.JButton();
        btLibrary = new javax.swing.JButton();
        StoryPanel = new javax.swing.JPanel();
        TitlePanel = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        StoryScroll = new javax.swing.JScrollPane();
        ViewPort = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("App đọc truyện DVALT");
        setMaximumSize(new java.awt.Dimension(1144, 630));
        setMinimumSize(new java.awt.Dimension(1144, 630));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        MainPanel.setBackground(new java.awt.Color(252, 254, 252));

        MenuPanel.setBackground(new java.awt.Color(252, 254, 252));

        Logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo.png"))); // NOI18N

        Menu.setBackground(new java.awt.Color(255, 251, 199));

        btHome.setBackground(new java.awt.Color(92, 68, 45));
        btHome.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btHome.setForeground(new java.awt.Color(255, 255, 255));
        btHome.setText("TRANG CHỦ");
        btHome.setBorderPainted(false);
        btHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btHomeActionPerformed(evt);
            }
        });

        Separator1.setBackground(new java.awt.Color(166, 124, 82));
        Separator1.setForeground(new java.awt.Color(166, 124, 82));
        Separator1.setToolTipText("");
        Separator1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Separator1.setMinimumSize(new java.awt.Dimension(50, 3));

        lbTheLoai.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbTheLoai.setForeground(new java.awt.Color(166, 124, 82));
        lbTheLoai.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTheLoai.setText("THỂ LOẠI");
        lbTheLoai.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        Separator2.setBackground(new java.awt.Color(166, 124, 82));
        Separator2.setForeground(new java.awt.Color(166, 124, 82));
        Separator2.setToolTipText("");
        Separator2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Separator2.setMinimumSize(new java.awt.Dimension(50, 3));

        btTrinhtham.setBackground(new java.awt.Color(255, 251, 199));
        btTrinhtham.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btTrinhtham.setForeground(new java.awt.Color(166, 124, 82));
        btTrinhtham.setText("Trinh thám");
        btTrinhtham.setToolTipText("");
        btTrinhtham.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(166, 124, 82), 2, true));
        btTrinhtham.setBorderPainted(false);
        btTrinhtham.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btTrinhthamActionPerformed(evt);
            }
        });

        btKinhdi.setBackground(new java.awt.Color(255, 251, 199));
        btKinhdi.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btKinhdi.setForeground(new java.awt.Color(166, 124, 82));
        btKinhdi.setText("Kinh dị");
        btKinhdi.setToolTipText("");
        btKinhdi.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(166, 124, 82), 2, true));
        btKinhdi.setBorderPainted(false);
        btKinhdi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btKinhdiActionPerformed(evt);
            }
        });

        btLangman.setBackground(new java.awt.Color(255, 251, 199));
        btLangman.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btLangman.setForeground(new java.awt.Color(166, 124, 82));
        btLangman.setText("Lãng mạn");
        btLangman.setToolTipText("");
        btLangman.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(166, 124, 82), 2, true));
        btLangman.setBorderPainted(false);
        btLangman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLangmanActionPerformed(evt);
            }
        });

        btVientuong.setBackground(new java.awt.Color(255, 251, 199));
        btVientuong.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btVientuong.setForeground(new java.awt.Color(166, 124, 82));
        btVientuong.setText("Viễn tưởng");
        btVientuong.setToolTipText("");
        btVientuong.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(166, 124, 82), 2, true));
        btVientuong.setBorderPainted(false);
        btVientuong.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVientuongActionPerformed(evt);
            }
        });

        btVanhoc.setBackground(new java.awt.Color(255, 251, 199));
        btVanhoc.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btVanhoc.setForeground(new java.awt.Color(166, 124, 82));
        btVanhoc.setText("Văn học");
        btVanhoc.setToolTipText("");
        btVanhoc.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(166, 124, 82), 2, true));
        btVanhoc.setBorderPainted(false);
        btVanhoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVanhocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout MenuLayout = new javax.swing.GroupLayout(Menu);
        Menu.setLayout(MenuLayout);
        MenuLayout.setHorizontalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Separator1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbTheLoai, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Separator2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btTrinhtham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btKinhdi, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btLangman, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btVientuong, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btVanhoc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MenuLayout.setVerticalGroup(
            MenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btHome, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbTheLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Separator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btTrinhtham, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btKinhdi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btLangman, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btVientuong, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btVanhoc, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MenuPanelLayout = new javax.swing.GroupLayout(MenuPanel);
        MenuPanel.setLayout(MenuPanelLayout);
        MenuPanelLayout.setHorizontalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                    .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MenuPanelLayout.setVerticalGroup(
            MenuPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MenuPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TopPanel.setBackground(new java.awt.Color(252, 254, 252));
        TopPanel.setPreferredSize(new java.awt.Dimension(823, 65));

        btTimkiem.setBackground(new java.awt.Color(0, 102, 0));
        btTimkiem.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btTimkiem.setForeground(new java.awt.Color(255, 255, 255));
        btTimkiem.setText("TÌM KIẾM");
        btTimkiem.setToolTipText("");
        btTimkiem.setBorderPainted(false);

        tbTimkiem.setBackground(new java.awt.Color(196, 223, 155));
        tbTimkiem.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tbTimkiem.setForeground(new java.awt.Color(51, 51, 51));
        tbTimkiem.setToolTipText("");
        tbTimkiem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tbTimkiemActionPerformed(evt);
            }
        });

        btLogin.setBackground(new java.awt.Color(255, 251, 199));
        btLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/login.png"))); // NOI18N
        btLogin.setBorderPainted(false);
        btLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btLoginActionPerformed(evt);
            }
        });

        btLibrary.setBackground(new java.awt.Color(255, 251, 199));
        btLibrary.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/library.png"))); // NOI18N
        btLibrary.setBorderPainted(false);
        btLibrary.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout TopPanelLayout = new javax.swing.GroupLayout(TopPanel);
        TopPanel.setLayout(TopPanelLayout);
        TopPanelLayout.setHorizontalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tbTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(btLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btLibrary, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        TopPanelLayout.setVerticalGroup(
            TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(TopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tbTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btTimkiem, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btLogin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btLibrary, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        StoryPanel.setBackground(new java.awt.Color(252, 254, 252));

        TitlePanel.setBackground(new java.awt.Color(255, 251, 199));

        Title.setBackground(new java.awt.Color(255, 251, 199));
        Title.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("TOP TRUYỆN HOT");
        Title.setToolTipText("");
        Title.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout TitlePanelLayout = new javax.swing.GroupLayout(TitlePanel);
        TitlePanel.setLayout(TitlePanelLayout);
        TitlePanelLayout.setHorizontalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        TitlePanelLayout.setVerticalGroup(
            TitlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        StoryScroll.setMaximumSize(new java.awt.Dimension(823, 484));
        StoryScroll.setMinimumSize(new java.awt.Dimension(823, 484));
        StoryScroll.setPreferredSize(new java.awt.Dimension(823, 484));
        StoryScroll.setViewportView(null);

        ViewPort.setMaximumSize(new java.awt.Dimension(821, 482));
        ViewPort.setMinimumSize(new java.awt.Dimension(821, 482));
        ViewPort.setRequestFocusEnabled(false);

        javax.swing.GroupLayout ViewPortLayout = new javax.swing.GroupLayout(ViewPort);
        ViewPort.setLayout(ViewPortLayout);
        ViewPortLayout.setHorizontalGroup(
            ViewPortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 821, Short.MAX_VALUE)
        );
        ViewPortLayout.setVerticalGroup(
            ViewPortLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 495, Short.MAX_VALUE)
        );

        StoryScroll.setViewportView(ViewPort);

        javax.swing.GroupLayout StoryPanelLayout = new javax.swing.GroupLayout(StoryPanel);
        StoryPanel.setLayout(StoryPanelLayout);
        StoryPanelLayout.setHorizontalGroup(
            StoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TitlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(StoryScroll, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        StoryPanelLayout.setVerticalGroup(
            StoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StoryPanelLayout.createSequentialGroup()
                .addComponent(TitlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StoryScroll, javax.swing.GroupLayout.DEFAULT_SIZE, 497, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MenuPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(StoryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MenuPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addComponent(TopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(StoryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btHomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btHomeActionPerformed

    private void btTrinhthamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btTrinhthamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btTrinhthamActionPerformed

    private void btKinhdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btKinhdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btKinhdiActionPerformed

    private void btLangmanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLangmanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btLangmanActionPerformed

    private void btVientuongActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVientuongActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btVientuongActionPerformed

    private void btVanhocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVanhocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btVanhocActionPerformed

    private void tbTimkiemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tbTimkiemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tbTimkiemActionPerformed

    private void btLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btLoginActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
        T_View t1 = new T_View();
        T_View t2 = new T_View();
        T_View t3 = new T_View();
        T_View t4 = new T_View();
        T_View t5 = new T_View();
        T_View t6 = new T_View();
        T_View t7 = new T_View();
        T_View t8 = new T_View();
        T_View t9 = new T_View();
        T_View t10 = new T_View();
        
        int total = 10;
        int column = 4;
        int row = total / column;
        if (total % column != 0) {
            row++;
        }
        
        ViewPort.setLayout(new GridLayout(row, column, 10, 10));
        
        ViewPort.add(t1);
        ViewPort.add(t2);
        ViewPort.add(t3);
        ViewPort.add(t4);
        ViewPort.add(t5);
        ViewPort.add(t6);
        ViewPort.add(t7);
        ViewPort.add(t8);
        ViewPort.add(t9);
        ViewPort.add(t10);
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Logo;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JSeparator Separator1;
    private javax.swing.JSeparator Separator2;
    private javax.swing.JPanel StoryPanel;
    private javax.swing.JScrollPane StoryScroll;
    private javax.swing.JLabel Title;
    private javax.swing.JPanel TitlePanel;
    private javax.swing.JPanel TopPanel;
    private javax.swing.JPanel ViewPort;
    private javax.swing.JButton btHome;
    private javax.swing.JButton btKinhdi;
    private javax.swing.JButton btLangman;
    private javax.swing.JButton btLibrary;
    private javax.swing.JButton btLogin;
    private javax.swing.JButton btTimkiem;
    private javax.swing.JButton btTrinhtham;
    private javax.swing.JButton btVanhoc;
    private javax.swing.JButton btVientuong;
    private javax.swing.JLabel lbTheLoai;
    private javax.swing.JTextField tbTimkiem;
    // End of variables declaration//GEN-END:variables
}