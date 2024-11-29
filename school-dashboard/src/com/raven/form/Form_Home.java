package com.raven.form;

import com.raven.dialog.Message;
import com.raven.main.Main;
import com.raven.model.ModelCard;
import com.raven.model.ModelStudent;
import com.raven.swing.icon.GoogleMaterialDesignIcons;
import com.raven.swing.icon.IconFontSwing;
import com.raven.swing.noticeboard.ModelNoticeBoard;
import com.raven.swing.table.EventAction;
import java.awt.Color;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Form_Home extends javax.swing.JPanel {

    public Form_Home() {
        initComponents();
        table1.fixTable(jScrollPane1);
        setOpaque(false);
        initData();
    }

    private void initData() {
        initCardData();
        initNoticeBoard();
        initTableData();
    }

    private void initTableData() {
        EventAction eventAction = new EventAction() {
            @Override
            public void delete(ModelStudent student) {
                if (showMessage("Delete Student : " + student.getName())) {
                    System.out.println("User click OK");
                } else {
                    System.out.println("User click Cancel");
                }
            }

            @Override
            public void update(ModelStudent student) {
                if (showMessage("Update Student : " + student.getName())) {
                    System.out.println("User click OK");
                } else {
                    System.out.println("User click Cancel");
                }
            }
        };
        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/com/raven/icon/profile.jpg")), "Jonh", "Male", "Java", 300).toRowTable(eventAction));
        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/com/raven/icon/profile1.jpg")), "Dara", "Male", "C++", 300).toRowTable(eventAction));
        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/com/raven/icon/profile2.jpg")), "Bora", "Male", "C#", 300).toRowTable(eventAction));
        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/com/raven/icon/profile2.jpg")), "Bora", "Male", "C#", 300).toRowTable(eventAction));
        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/com/raven/icon/profile2.jpg")), "Bora", "Male", "C#", 300).toRowTable(eventAction));
        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/com/raven/icon/profile2.jpg")), "Bora", "Male", "C#", 300).toRowTable(eventAction));
        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/com/raven/icon/profile2.jpg")), "Bora", "Male", "C#", 300).toRowTable(eventAction));
        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/com/raven/icon/profile2.jpg")), "Bora", "Male", "C#", 300).toRowTable(eventAction));
        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/com/raven/icon/profile2.jpg")), "Bora", "Male", "C#", 300).toRowTable(eventAction));
        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/com/raven/icon/profile2.jpg")), "Bora", "Male", "C#", 300).toRowTable(eventAction));
        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/com/raven/icon/profile2.jpg")), "Bora", "Male", "C#", 300).toRowTable(eventAction));
        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/com/raven/icon/profile2.jpg")), "Bora", "Male", "C#", 300).toRowTable(eventAction));
        table1.addRow(new ModelStudent(new ImageIcon(getClass().getResource("/com/raven/icon/profile2.jpg")), "Bora", "Male", "C#", 300).toRowTable(eventAction));
    }

    private void initCardData() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    
    try {
        Date date1 = dateFormat.parse("16/05/2025");
        Date date2 = dateFormat.parse("25/06/2025");
        Date date3 = dateFormat.parse("30/06/2025");
        Date date4 = dateFormat.parse("05/07/2025");
        Icon icon1 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.PERSON, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
        card1.setData(new ModelCard("Eduarda", 1500.53, 20, icon1, date2));
        Icon icon2 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.PERSON, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
        card2.setData(new ModelCard("Pedro", 4050.35, 60, icon2, date1));
        Icon icon3 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.PERSON, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
        card3.setData(new ModelCard("Karina", 2000.65, 80, icon3, date3));
        Icon icon4 = IconFontSwing.buildIcon(GoogleMaterialDesignIcons.PERSON, 60, new Color(255, 255, 255, 100), new Color(255, 255, 255, 15));
        card4.setData(new ModelCard("Jorge", 1534.56, 95, icon4, date4));
        } catch (ParseException e) {
        e.printStackTrace(); // Para lidar com erros de formatação de data
    }
    }

    private void initNoticeBoard() {
        noticeBoard.addDate("04/10/2021");
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(94, 49, 238), "Hidemode", "Now", "Sets the hide mode for the component. If the hide mode has been specified in the This hide mode can be overridden by the component constraint."));
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(218, 49, 238), "Tag", "2h ago", "Tags the component with metadata name that can be used by the layout engine. The tag can be used to explain for the layout manager what the components is showing, such as an OK or Cancel button."));
        noticeBoard.addDate("03/10/2021");
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(32, 171, 43), "Further Reading", "12:30 PM", "There are more information to digest regarding MigLayout. The resources are all available at www.migcomponents.com"));
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(50, 93, 215), "Span", "10:30 AM", "Spans the current cell (merges) over a number of cells. Practically this means that this cell and the count number of cells will be treated as one cell and the component can use the space that all these cells have."));
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(27, 188, 204), "Skip ", "9:00 AM", "Skips a number of cells in the flow. This is used to jump over a number of cells before the next free cell is looked for. The skipping is done before this component is put in a cell and thus this cells is affected by it. \"count\" defaults to 1 if not specified."));
        noticeBoard.addNoticeBoard(new ModelNoticeBoard(new Color(238, 46, 57), "Push", "7:15 AM", "Makes the row and/or column that the component is residing in grow with \"weight\". This can be used instead of having a \"grow\" keyword in the column/row constraints."));
        noticeBoard.scrollToTop();
    }

    private boolean showMessage(String message) {
        Message obj = new Message(Main.getFrames()[0], true);
        obj.showMessage(message);
        return obj.isOk();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        border2 = new com.raven.swing.Border();
        card1 = new com.raven.component.Card();
        card2 = new com.raven.component.Card();
        card3 = new com.raven.component.Card();
        card4 = new com.raven.component.Card();
        jLabel6 = new javax.swing.JLabel();
        border1 = new com.raven.swing.Border();
        borderB1 = new com.raven.swing.BorderB();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table1 = new com.raven.swing.table.Table();
        border3 = new com.raven.swing.Border();
        borderB2 = new com.raven.swing.BorderB();
        jPanel1 = new javax.swing.JPanel();
        noticeBoard = new com.raven.swing.noticeboard.NoticeBoard();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Home");

        card1.setColorGradient(new java.awt.Color(211, 28, 215));

        card2.setBackground(new java.awt.Color(10, 30, 214));
        card2.setColorGradient(new java.awt.Color(72, 111, 252));

        card3.setBackground(new java.awt.Color(194, 85, 1));
        card3.setColorGradient(new java.awt.Color(255, 212, 99));

        card4.setBackground(new java.awt.Color(60, 195, 0));
        card4.setColorGradient(new java.awt.Color(208, 255, 90));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Eventos Pendêntes");

        javax.swing.GroupLayout border2Layout = new javax.swing.GroupLayout(border2);
        border2.setLayout(border2Layout);
        border2Layout.setHorizontalGroup(
            border2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(border2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(border2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(border2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(border2Layout.createSequentialGroup()
                        .addComponent(card1, javax.swing.GroupLayout.DEFAULT_SIZE, 256, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(card2, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(card3, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(card4, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                        .addGap(20, 20, 20))))
        );
        border2Layout.setVerticalGroup(
            border2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, border2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(15, 15, 15)
                .addGroup(border2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(card1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(card4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setOpaque(false);

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(76, 76, 76));
        jLabel5.setText("Data Student");
        jLabel5.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        table1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Gender", "Course", "Fees", "Action"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(table1);
        if (table1.getColumnModel().getColumnCount() > 0) {
            table1.getColumnModel().getColumn(0).setPreferredWidth(150);
        }

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout borderB1Layout = new javax.swing.GroupLayout(borderB1);
        borderB1.setLayout(borderB1Layout);
        borderB1Layout.setHorizontalGroup(
            borderB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 627, Short.MAX_VALUE)
            .addGroup(borderB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(borderB1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        borderB1Layout.setVerticalGroup(
            borderB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
            .addGroup(borderB1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, borderB1Layout.createSequentialGroup()
                    .addContainerGap(14, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout border1Layout = new javax.swing.GroupLayout(border1);
        border1.setLayout(border1Layout);
        border1Layout.setHorizontalGroup(
            border1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(border1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(border1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(borderB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        border1Layout.setVerticalGroup(
            border1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(border1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(border1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(borderB1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setOpaque(false);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(76, 76, 76));
        jLabel2.setText("Notice Board");
        jLabel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(105, 105, 105));
        jLabel3.setText("Simple Miglayout API Doc");
        jLabel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 1));

        jLabel4.setOpaque(true);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(noticeBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 372, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addGap(9, 9, 9)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 1, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(noticeBoard, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout borderB2Layout = new javax.swing.GroupLayout(borderB2);
        borderB2.setLayout(borderB2Layout);
        borderB2Layout.setHorizontalGroup(
            borderB2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderB2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        borderB2Layout.setVerticalGroup(
            borderB2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(borderB2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout border3Layout = new javax.swing.GroupLayout(border3);
        border3.setLayout(border3Layout);
        border3Layout.setHorizontalGroup(
            border3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(border3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(borderB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        border3Layout.setVerticalGroup(
            border3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(border3Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(borderB2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(border2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(border1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(16, 16, 16)
                        .addComponent(border3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jLabel1)
                .addGap(15, 15, 15)
                .addComponent(border2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(border3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(border1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(159, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.Border border1;
    private com.raven.swing.Border border2;
    private com.raven.swing.Border border3;
    private com.raven.swing.BorderB borderB1;
    private com.raven.swing.BorderB borderB2;
    private com.raven.component.Card card1;
    private com.raven.component.Card card2;
    private com.raven.component.Card card3;
    private com.raven.component.Card card4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private com.raven.swing.noticeboard.NoticeBoard noticeBoard;
    private com.raven.swing.table.Table table1;
    // End of variables declaration//GEN-END:variables
}
