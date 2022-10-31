package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.JOptionPane;
import model.InvoiceHeader;
import model.InvoiceLine;
import view.InvoiceFrame;
import view.InvoiceLineDialog;

public class LineController implements ActionListener {
    private InvoiceFrame frame;
    private InvoiceLineDialog lineDialog;

    
    public LineController(InvoiceFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            
            case "New":
                newItm();
                break;
                
            case "Delete":
                delete();
                break;
            
            case "newLineOK":
                newLineOK();
                break;

            case "newLineCancel":
                newLineCancel();
                break;
                
        }
   
    }

    private void newItm() {
        int selectedInvoice = frame.getInvoicesTable().getSelectedRow();
        if (selectedInvoice == -1) {
            JOptionPane.showMessageDialog(frame, "First, select Invoice to add item to it", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            lineDialog = new InvoiceLineDialog(frame);
            lineDialog.setVisible(true);
        }
    }

    private void delete() {
        //unfinished      
        int selectedInvoice = frame.getInvoicesTable().getSelectedRow();
        int selectedItem = frame.getLinesTable().getSelectedRow();
        if (selectedInvoice != -1 && selectedItem != -1) {
            InvoiceHeader invoice = frame.getInvoices().get(selectedInvoice);
            invoice.getLines().remove(selectedItem);
            frame.getLineTableModel().fireTableDataChanged();
            frame.getHeaderTableModel().fireTableDataChanged();
            frame.getInvoicesTable().setRowSelectionInterval(selectedInvoice, selectedInvoice);
        }
    }
    
    private void newLineOK() {
//        try{
        String name = lineDialog.getItemNameField().getText();
        int count = Integer.parseInt(lineDialog.getItemCountField().getText());
        int price = Integer.parseInt(lineDialog.getItemPriceField().getText());
        int selectedInvIndex = frame.getInvoicesTable().getSelectedRow();
        InvoiceHeader inv = frame.getInvoices().get(selectedInvIndex);
        
        new InvoiceLine(inv, name, price, count);
        frame.getHeaderTableModel().fireTableDataChanged();
        frame.getInvoicesTable().setRowSelectionInterval(selectedInvIndex, selectedInvIndex);
        newLineCancel();
//        } catch(ParseException ex) {
//            JOptionPane.showMessageDialog(frame, "Error in Date format", "Error", JOptionPane.ERROR_MESSAGE);
//        }
    }

    private void newLineCancel() {
        lineDialog.setVisible(false);
        lineDialog.dispose();
        lineDialog = null;
    }
}
