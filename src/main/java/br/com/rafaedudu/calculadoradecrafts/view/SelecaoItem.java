/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package br.com.rafaedudu.calculadoradecrafts.view;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author rafae
 */
public class SelecaoItem extends javax.swing.JPanel {

    /**
     * Creates new form SelecaoItem
     * @param imagem
     * @param nome
     */
    public SelecaoItem(File imagem, String nome) {
        try {
            initComponents();
            jLabel_nome.setText(nome);
            jLabel_imagem.setIcon(new javax.swing.ImageIcon(ImageIO.read(imagem)));
        } catch (IOException ex) {
            Logger.getLogger(SelecaoItem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_imagem = new javax.swing.JLabel();
        jLabel_nome = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(342, 52));
        setMinimumSize(new java.awt.Dimension(342, 52));
        setPreferredSize(new java.awt.Dimension(342, 52));

        jLabel_imagem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/1200px-Apache_NetBeans_Logo.svg.png"))); // NOI18N
        jLabel_imagem.setText("TESTESTESTESTE");
        jLabel_imagem.setMaximumSize(new java.awt.Dimension(40, 40));
        jLabel_imagem.setMinimumSize(new java.awt.Dimension(40, 40));
        jLabel_imagem.setPreferredSize(new java.awt.Dimension(40, 40));

        jLabel_nome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel_nome.setText("jLabel2");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_imagem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel_imagem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_nome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_imagem;
    private javax.swing.JLabel jLabel_nome;
    // End of variables declaration//GEN-END:variables
}