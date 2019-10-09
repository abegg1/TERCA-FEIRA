/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ftec.chaves.view;

import br.com.ftec.chaves.controller.ColaboradorDAO;
import br.com.ftec.chaves.controller.ReservaDAO;
import br.com.ftec.chaves.controller.SalaDAO;
import br.com.ftec.chaves.model.Colaborador;
import br.com.ftec.chaves.model.Reserva;
import br.com.ftec.chaves.model.Sala;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bernadete.abegg
 */
public class Reservas extends javax.swing.JFrame {
    
    ArrayList<Colaborador> colaborador;
    ArrayList<Sala> sala;

    /**
     * Creates new form tela_4
     */
    public Reservas() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPasswordField1 = new javax.swing.JPasswordField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbReserva = new javax.swing.JTable();
        cbsala = new javax.swing.JComboBox<>();
        cbcolaborador = new javax.swing.JComboBox<>();
        cbturno = new javax.swing.JComboBox<>();
        cbdata = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Sala");

        jLabel2.setText("Responsável");

        jLabel3.setText("Turno");

        jLabel4.setText("Data");

        jButton1.setText("Reservar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPasswordField1.setText("jPasswordField1");

        tbReserva.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(tbReserva);

        cbsala.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbsala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbsalaActionPerformed(evt);
            }
        });

        cbcolaborador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbturno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Manhã", "Tarde", "Noite" }));
        cbturno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbturnoActionPerformed(evt);
            }
        });

        cbdata.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Segunda-feira", "Terça-feira", "Quarta-feira", "Quinta-feira", "Sexta-feira", "Sabado", "Domingo", " " }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbcolaborador, 0, 128, Short.MAX_VALUE)
                                    .addComponent(cbsala, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(91, 91, 91)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(cbturno, 0, 128, Short.MAX_VALUE)
                                    .addComponent(cbdata, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(68, 68, 68)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 494, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(cbsala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbcolaborador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbturno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cbdata, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(104, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
         
        Reserva reserva = new Reserva();
        reserva.setSala(cbsala.);
        reserva.setresponsavel(Integer.valueOf(tfcapac.getText()));
        reserva.setDescricao(tfdescr.getText());
        reserva.setTipo(tftipo.getText());
        String mensagem = "sala:"+sala.getSala( )+
        "\n capacidade:"+sala.getCapacidade()+
        "\n tipo:"+sala.getTipo( )+
        "\n OBS:"+sala.getDescricao()+
        "\n \n Salvo com Sucesso!";
        int confirma = JOptionPane.showConfirmDialog(this,"Deseja Salvar os"+ 
                "dados da seguinte sala \n"+mensagem);
        if(confirma==JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(this,"Salvo com Sucesso");
            SalaDAO salaDAO = new SalaDAO();
            try {
                salaDAO.salvar(sala);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CadastroSala.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(CadastroSala.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else if(confirma == JOptionPane.NO_OPTION){
            JOptionPane.showMessageDialog(this,"Operacao cancelada");
        Principal p = new Principal();
        p.setVisible(true);
                }else{
        }
    }                  
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbsalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbsalaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbsalaActionPerformed

    private void cbturnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbturnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbturnoActionPerformed
  
    
    private void montarComboBoxColaborador() {
        ColaboradorDAO colaboradorDAO= new ColaboradorDAO();
        
        try {
            colaborador = (ArrayList<Colaborador>) colaboradorDAO.listaColaborador();
        } catch (Exception ex) {
            Logger.getLogger(Reservas.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultComboBoxModel boxModel =
                new DefaultComboBoxModel(colaborador.toArray());
        cbcolaborador.setModel(boxModel);
        
    }
   
    private void montarComboBoxSala() {
        SalaDAO saladao= new SalaDAO();
        
        try {
            sala = (ArrayList<Sala>) saladao.listaSalas();
        } catch (Exception ex) {
            Logger.getLogger(Reservas.class.getName()).log(Level.SEVERE, null, ex);
        }
        DefaultComboBoxModel boxModel =
                new DefaultComboBoxModel(sala.toArray());
        cbsala.setModel(boxModel);
        
    }
    private void montaTabela(){
        DefaultTableModel dftm = (DefaultTableModel) tbReserva.getModel();
        dftm.setNumRows(0);
        tbReserva.getColumnModel().getColumn(0).setPreferredWidth(20);
        tbReserva.getColumnModel().getColumn(0).setHeaderValue("Colaborador");
        tbReserva.getColumnModel().getColumn(1).setPreferredWidth(20);
        tbReserva.getColumnModel().getColumn(1).setHeaderValue("Dia");
        tbReserva.getColumnModel().getColumn(2).setPreferredWidth(20);
        tbReserva.getColumnModel().getColumn(2).setHeaderValue("Sala");
        tbReserva.getColumnModel().getColumn(3).setPreferredWidth(20);
        tbReserva.getColumnModel().getColumn(3).setHeaderValue("Turno");
        ReservaDAO dao= new ReservaDAO();
        try {
            for(Reserva r: dao.listaReserva()){
                dftm.addRow(new Object[]
                {
                    r.getColaborador().getId(),
                    r.getDia(),
                    r.getSala().getId(),
                    r.getTurno(),
                }
                );
                
                 
            }   } catch (ClassNotFoundException ex) {
            Logger.getLogger(Reservas.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Reservas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /**
     * @param args the command line arguments
     */    /**
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
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Reservas consultaSala = new Reservas();
                consultaSala.montaTabela(); 
                consultaSala.montarComboBoxColaborador();
                consultaSala.montarComboBoxSala();
                consultaSala.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbcolaborador;
    private javax.swing.JComboBox<String> cbdata;
    private javax.swing.JComboBox<String> cbsala;
    private javax.swing.JComboBox<String> cbturno;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbReserva;
    // End of variables declaration//GEN-END:variables
}