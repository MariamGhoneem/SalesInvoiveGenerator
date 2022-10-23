/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.HeaderController;
import controller.LineController;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import model.InvoiceHeader;

/**
 *
 * @author hp
 */
public class InvoiceFrame extends javax.swing.JFrame {

    /**
     * Creates new form InvoiceFrame
     */
    public InvoiceFrame() {
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

        invTblL = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        invTable = new javax.swing.JTable();
        invNumL = new javax.swing.JLabel();
        invDateL = new javax.swing.JLabel();
        custNameL = new javax.swing.JLabel();
        invTotL = new javax.swing.JLabel();
        invItemsL = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        invItmTable = new javax.swing.JTable();
        createInvBtn = new javax.swing.JButton();
        createInvBtn.addActionListener(headerController);
        dltInvBtn = new javax.swing.JButton();
        dltInvBtn.addActionListener(headerController);
        saveBtn = new javax.swing.JButton();
        saveBtn.addActionListener(lineController);
        cancelBtn = new javax.swing.JButton();
        cancelBtn.addActionListener(lineController);
        numLbl = new javax.swing.JLabel();
        dateLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        totalLbl = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        loadItm = new javax.swing.JMenuItem();
        loadItm.addActionListener(headerController);
        saveItm = new javax.swing.JMenuItem();
        saveItm.addActionListener(headerController);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invTblL.setText("Invoices Table");

        invTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(invTable);

        invNumL.setText("Invoice Number");

        invDateL.setText("Invoice Date");

        custNameL.setText("Customer Name");

        invTotL.setText("Invoice Total");

        invItemsL.setText("Invoice Items");

        invItmTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(invItmTable);

        createInvBtn.setLabel("Create New Invoice");

        dltInvBtn.setLabel("Delete Invoive");

        saveBtn.setText("New");

        cancelBtn.setText("Delete");

        numLbl.setText(".");

        dateLbl.setText(".");

        nameLbl.setText(".");

        totalLbl.setText(".");

        jMenu1.setText("File");

        loadItm.setLabel("Load File");
        jMenu1.add(loadItm);

        saveItm.setLabel("Save File");
        jMenu1.add(saveItm);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(createInvBtn)
                .addGap(28, 28, 28)
                .addComponent(dltInvBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(saveBtn)
                .addGap(59, 59, 59)
                .addComponent(cancelBtn)
                .addGap(75, 75, 75))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(invTblL)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(custNameL)
                                    .addComponent(invTotL)
                                    .addComponent(invDateL))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(totalLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(invNumL)
                                .addGap(49, 49, 49)
                                .addComponent(numLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(invItemsL)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(invTblL)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invNumL)
                            .addComponent(numLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dateLbl)
                                .addGap(18, 18, 18)
                                .addComponent(nameLbl)
                                .addGap(18, 18, 18)
                                .addComponent(totalLbl))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(invDateL, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(custNameL)
                                .addGap(18, 18, 18)
                                .addComponent(invTotL)))
                        .addGap(53, 53, 53)
                        .addComponent(invItemsL)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createInvBtn)
                    .addComponent(dltInvBtn)
                    .addComponent(saveBtn)
                    .addComponent(cancelBtn))
                .addContainerGap())
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
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InvoiceFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new InvoiceFrame().setVisible(true);
                InvoiceFrame f = new InvoiceFrame();
                f.headerController.loadFile("InvoiceHeader.csv", "InvoiceLine.csv");
                f.setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelBtn;
    private javax.swing.JButton createInvBtn;
    private javax.swing.JLabel custNameL;
    private javax.swing.JLabel dateLbl;
    private javax.swing.JButton dltInvBtn;
    private javax.swing.JLabel invDateL;
    private javax.swing.JLabel invItemsL;
    private javax.swing.JTable invItmTable;
    private javax.swing.JLabel invNumL;
    private javax.swing.JTable invTable;
    private javax.swing.JLabel invTblL;
    private javax.swing.JLabel invTotL;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem loadItm;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JLabel numLbl;
    private javax.swing.JButton saveBtn;
    private javax.swing.JMenuItem saveItm;
    private javax.swing.JLabel totalLbl;
    // End of variables declaration//GEN-END:variables
    
    private HeaderController headerController = new HeaderController(this);
    private LineController lineController = new LineController(this);
    public static SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
    private ArrayList<InvoiceHeader> invoices;
    
    public HeaderController getHController() {
        return headerController;
    }
    
    public LineController getLController() {
        return lineController;
    }

    public ArrayList<InvoiceHeader> getInvoices() {
        if (invoices == null) {
            invoices = new ArrayList<>();
        }
        return invoices;
    }
}
