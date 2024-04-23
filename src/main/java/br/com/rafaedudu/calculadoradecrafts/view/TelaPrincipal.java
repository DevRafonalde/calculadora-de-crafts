/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.com.rafaedudu.calculadoradecrafts.view;

import java.awt.Component;
import java.awt.event.MouseListener;
import java.io.File;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListCellRenderer;

/**
 *
 * @author rafae
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        jTextArea_itensFaltantes.setEditable(false);
        jTextArea_totalItens.setEditable(false);
        
        for (MouseListener mouseListener : jTextArea_totalItens.getListeners(MouseListener.class)) {
            jTextArea_totalItens.removeMouseListener(mouseListener);
        }
        
        for (MouseListener mouseListener : jTextArea_itensFaltantes.getListeners(MouseListener.class)) {
            jTextArea_itensFaltantes.removeMouseListener(mouseListener);
        }
        
        SelecaoItem teste = new SelecaoItem(new File("src/main/resources/img/Spruce_Fence_JE3 (1).png"), "Cerca de Pinheiro");
        jComboBox_itens.setRenderer(new JPanelComboBoxRenderer());
        jComboBox_itens.addItem(teste);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel_geral = new javax.swing.JPanel();
        jPanel_titulo = new javax.swing.JPanel();
        jLabel_titulo = new javax.swing.JLabel();
        jPanel_central = new javax.swing.JPanel();
        jPanel_insercao = new javax.swing.JPanel();
        jPanel_campos1 = new javax.swing.JPanel();
        jPanel_selecaoItens = new javax.swing.JPanel();
        jComboBox_itens = new javax.swing.JComboBox<>();
        jPanel_campos2 = new javax.swing.JPanel();
        jPanel_selecaoItens1 = new javax.swing.JPanel();
        jTextField_qntdJaPossuida = new javax.swing.JTextField();
        jPanel_resultado = new javax.swing.JPanel();
        jPanel_imagem = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel_quantidades = new javax.swing.JPanel();
        jPanel_total = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_totalItens = new javax.swing.JTextArea();
        jPanel_buscar = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_itensFaltantes = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel_titulo.setBackground(new java.awt.Color(0, 153, 51));
        jPanel_titulo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 5, true));

        jLabel_titulo.setFont(new java.awt.Font("josephsophia", 0, 70)); // NOI18N
        jLabel_titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_titulo.setText("Calculadora de Crafts");

        javax.swing.GroupLayout jPanel_tituloLayout = new javax.swing.GroupLayout(jPanel_titulo);
        jPanel_titulo.setLayout(jPanel_tituloLayout);
        jPanel_tituloLayout.setHorizontalGroup(
            jPanel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_tituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_tituloLayout.setVerticalGroup(
            jPanel_tituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_tituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel_central.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel_central.setLayout(new java.awt.GridLayout(1, 2));

        jPanel_insercao.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Base de Cálculo", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 20))); // NOI18N
        jPanel_insercao.setLayout(new java.awt.GridLayout(1, 2));

        jPanel_selecaoItens.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Item a ser fabricado", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        javax.swing.GroupLayout jPanel_selecaoItensLayout = new javax.swing.GroupLayout(jPanel_selecaoItens);
        jPanel_selecaoItens.setLayout(jPanel_selecaoItensLayout);
        jPanel_selecaoItensLayout.setHorizontalGroup(
            jPanel_selecaoItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_selecaoItensLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox_itens, 0, 330, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_selecaoItensLayout.setVerticalGroup(
            jPanel_selecaoItensLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_selecaoItensLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox_itens, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel_campos1Layout = new javax.swing.GroupLayout(jPanel_campos1);
        jPanel_campos1.setLayout(jPanel_campos1Layout);
        jPanel_campos1Layout.setHorizontalGroup(
            jPanel_campos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_campos1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_selecaoItens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_campos1Layout.setVerticalGroup(
            jPanel_campos1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_campos1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_selecaoItens, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(493, Short.MAX_VALUE))
        );

        jPanel_insercao.add(jPanel_campos1);

        jPanel_selecaoItens1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Quantidade já possuída", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 14))); // NOI18N

        jTextField_qntdJaPossuida.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel_selecaoItens1Layout = new javax.swing.GroupLayout(jPanel_selecaoItens1);
        jPanel_selecaoItens1.setLayout(jPanel_selecaoItens1Layout);
        jPanel_selecaoItens1Layout.setHorizontalGroup(
            jPanel_selecaoItens1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_selecaoItens1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_qntdJaPossuida)
                .addContainerGap())
        );
        jPanel_selecaoItens1Layout.setVerticalGroup(
            jPanel_selecaoItens1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_selecaoItens1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField_qntdJaPossuida, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        // TODO Adicionar conferência de que foram inseridos apenas números.

        javax.swing.GroupLayout jPanel_campos2Layout = new javax.swing.GroupLayout(jPanel_campos2);
        jPanel_campos2.setLayout(jPanel_campos2Layout);
        jPanel_campos2Layout.setHorizontalGroup(
            jPanel_campos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_selecaoItens1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_campos2Layout.setVerticalGroup(
            jPanel_campos2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_campos2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel_selecaoItens1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(493, Short.MAX_VALUE))
        );

        jPanel_insercao.add(jPanel_campos2);

        jPanel_central.add(jPanel_insercao);

        jPanel_resultado.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel_resultado.setLayout(new java.awt.GridLayout(2, 1));

        jPanel_imagem.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Craft", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 20))); // NOI18N

        javax.swing.GroupLayout jPanel_imagemLayout = new javax.swing.GroupLayout(jPanel_imagem);
        jPanel_imagem.setLayout(jPanel_imagemLayout);
        jPanel_imagemLayout.setHorizontalGroup(
            jPanel_imagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_imagemLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 716, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_imagemLayout.setVerticalGroup(
            jPanel_imagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_imagemLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel_resultado.add(jPanel_imagem);

        jPanel_quantidades.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel_quantidades.setLayout(new java.awt.GridLayout(1, 2));

        jPanel_total.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Total de Itens", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 20))); // NOI18N

        jTextArea_totalItens.setColumns(20);
        jTextArea_totalItens.setRows(5);
        jScrollPane1.setViewportView(jTextArea_totalItens);

        javax.swing.GroupLayout jPanel_totalLayout = new javax.swing.GroupLayout(jPanel_total);
        jPanel_total.setLayout(jPanel_totalLayout);
        jPanel_totalLayout.setHorizontalGroup(
            jPanel_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_totalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_totalLayout.setVerticalGroup(
            jPanel_totalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_totalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel_quantidades.add(jPanel_total);

        jPanel_buscar.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), "Itens Faltantes", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 20))); // NOI18N

        jTextArea_itensFaltantes.setColumns(20);
        jTextArea_itensFaltantes.setRows(5);
        jScrollPane2.setViewportView(jTextArea_itensFaltantes);

        javax.swing.GroupLayout jPanel_buscarLayout = new javax.swing.GroupLayout(jPanel_buscar);
        jPanel_buscar.setLayout(jPanel_buscarLayout);
        jPanel_buscarLayout.setHorizontalGroup(
            jPanel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_buscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 344, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel_buscarLayout.setVerticalGroup(
            jPanel_buscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_buscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel_quantidades.add(jPanel_buscar);

        jPanel_resultado.add(jPanel_quantidades);

        jPanel_central.add(jPanel_resultado);

        javax.swing.GroupLayout jPanel_geralLayout = new javax.swing.GroupLayout(jPanel_geral);
        jPanel_geral.setLayout(jPanel_geralLayout);
        jPanel_geralLayout.setHorizontalGroup(
            jPanel_geralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_titulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel_central, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel_geralLayout.setVerticalGroup(
            jPanel_geralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel_geralLayout.createSequentialGroup()
                .addComponent(jPanel_titulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel_central, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_geral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel_geral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<SelecaoItem> jComboBox_itens;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel_titulo;
    private javax.swing.JPanel jPanel_buscar;
    private javax.swing.JPanel jPanel_campos1;
    private javax.swing.JPanel jPanel_campos2;
    private javax.swing.JPanel jPanel_central;
    private javax.swing.JPanel jPanel_geral;
    private javax.swing.JPanel jPanel_imagem;
    private javax.swing.JPanel jPanel_insercao;
    private javax.swing.JPanel jPanel_quantidades;
    private javax.swing.JPanel jPanel_resultado;
    private javax.swing.JPanel jPanel_selecaoItens;
    private javax.swing.JPanel jPanel_selecaoItens1;
    private javax.swing.JPanel jPanel_titulo;
    private javax.swing.JPanel jPanel_total;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea_itensFaltantes;
    private javax.swing.JTextArea jTextArea_totalItens;
    private javax.swing.JTextField jTextField_qntdJaPossuida;
    // End of variables declaration//GEN-END:variables
}

class JPanelComboBoxRenderer implements ListCellRenderer<JPanel> {
    @Override
    public Component getListCellRendererComponent(JList<? extends JPanel> list, JPanel value, int index, boolean isSelected, boolean cellHasFocus) {
        return value;
    }
}