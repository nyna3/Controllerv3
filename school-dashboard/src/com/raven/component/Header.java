package com.raven.component;

import java.awt.event.ActionListener;

public class Header extends javax.swing.JPanel {

    public Header() {
        initComponents();
    }

    public void addMenuEvent(ActionListener event) {
        cmdMenu.addActionListener(event);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cmdMenu = new com.raven.swing.Button();
        pic = new com.raven.swing.ImageAvatar();
        lbUserName = new javax.swing.JLabel();
        lbRole = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        buttonBadges1 = new com.raven.swing.ButtonBadges();
        buttonBadges2 = new com.raven.swing.ButtonBadges();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setOpaque(false);

        cmdMenu.setBackground(new java.awt.Color(51, 51, 51));
        cmdMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/menu.png"))); // NOI18N

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/profile.jpg"))); // NOI18N

        lbUserName.setFont(new java.awt.Font("sansserif", 1, 12)); // NOI18N
        lbUserName.setForeground(new java.awt.Color(255, 255, 255));
        lbUserName.setText("User Name");

        lbRole.setForeground(new java.awt.Color(255, 255, 255));
        lbRole.setText("Admin");

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        buttonBadges1.setBackground(new java.awt.Color(51, 51, 51));
        buttonBadges1.setForeground(new java.awt.Color(250, 49, 49));
        buttonBadges1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/notification.png"))); // NOI18N
        buttonBadges1.setBadges(12);

        buttonBadges2.setBackground(new java.awt.Color(51, 51, 51));
        buttonBadges2.setForeground(new java.awt.Color(63, 178, 232));
        buttonBadges2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/message.png"))); // NOI18N
        buttonBadges2.setBadges(5);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/raven/icon/x.png"))); // NOI18N
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(cmdMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 318, Short.MAX_VALUE)
                .addComponent(buttonBadges2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(buttonBadges1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbUserName, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbRole, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(pic, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbUserName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbRole))
                    .addComponent(cmdMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1)
                    .addComponent(buttonBadges1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonBadges2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.raven.swing.ButtonBadges buttonBadges1;
    private com.raven.swing.ButtonBadges buttonBadges2;
    private com.raven.swing.Button cmdMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbRole;
    private javax.swing.JLabel lbUserName;
    private com.raven.swing.ImageAvatar pic;
    // End of variables declaration//GEN-END:variables
}
