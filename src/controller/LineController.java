package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.InvoiceHeader;
import view.InvoiceFrame;

public class LineController implements ActionListener {
    private InvoiceFrame frame;
    
    public LineController(InvoiceFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            
            case "Save":
                newItm();
                break;
                
            case "Cancel":
                delete();
                break;
                
        }
   
    }

    private void newItm() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void delete() {
        //unfinished
        int selectedInvoice = frame.getInvoicesTable().getSelectedRow();
        int selectedLine = frame.getLinesTable().getSelectedRow();
        if(selectedInvoice != -1 && selectedLine != -1){
            InvoiceHeader invoice = frame.getInvoices().get(selectedInvoice);
            invoice.getLines().remove(selectedLine);
            frame.getLineTableModel().fireTableDataChanged();
            frame.getHeaderTableModel().fireTableDataChanged();
        }
    }
    
}
