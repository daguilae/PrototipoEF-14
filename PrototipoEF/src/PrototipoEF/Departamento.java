/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PrototipoEF;

/**
 *
 * @author Langas
 */
public class Departamento extends javax.swing.JInternalFrame {

    /**
     * Creates new form Departamento
     */
    public Departamento() {
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

        jLabel_NombreD = new javax.swing.JLabel();
        txt_IDD = new javax.swing.JTextField();
        jLabel_IDDepartamento1 = new javax.swing.JLabel();
        txt_NombreD = new javax.swing.JTextField();
        jLabel_EstatusD = new javax.swing.JLabel();
        txt_EstatusD = new javax.swing.JTextField();
        Btn_Ingresar = new javax.swing.JButton();
        Btn_Modificar = new javax.swing.JButton();
        Btn_Eliminar = new javax.swing.JButton();
        lbl_estatus = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel_NombreD.setText("Nombre Departamento");
        getContentPane().add(jLabel_NombreD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));
        getContentPane().add(txt_IDD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 120, -1));

        jLabel_IDDepartamento1.setText("ID Departamento");
        getContentPane().add(jLabel_IDDepartamento1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));
        getContentPane().add(txt_NombreD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 120, -1));

        jLabel_EstatusD.setText("Estatus Departamento");
        getContentPane().add(jLabel_EstatusD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));
        getContentPane().add(txt_EstatusD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 120, -1));

        Btn_Ingresar.setText("Ingresar");
        getContentPane().add(Btn_Ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 120, -1, -1));

        Btn_Modificar.setText("Modificar");
        getContentPane().add(Btn_Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, -1, -1));

        Btn_Eliminar.setText("Eliminar");
        getContentPane().add(Btn_Eliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 170, -1, -1));
        getContentPane().add(lbl_estatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, 220, 60));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btn_Eliminar;
    private javax.swing.JButton Btn_Ingresar;
    private javax.swing.JButton Btn_Modificar;
    private javax.swing.JLabel jLabel_EstatusD;
    private javax.swing.JLabel jLabel_IDDepartamento1;
    private javax.swing.JLabel jLabel_NombreD;
    private javax.swing.JLabel lbl_estatus;
    private javax.swing.JTextField txt_EstatusD;
    private javax.swing.JTextField txt_IDD;
    private javax.swing.JTextField txt_NombreD;
    // End of variables declaration//GEN-END:variables
}