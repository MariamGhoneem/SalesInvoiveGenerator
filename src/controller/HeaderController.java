package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.HeaderTableModel;
import model.InvoiceHeader;
import model.InvoiceLine;
import model.LineTableModel;
import view.InvoiceFrame;

public class HeaderController implements ActionListener, ListSelectionListener {
    private InvoiceFrame frame;
    
    public HeaderController(InvoiceFrame frame) {
        this.frame = frame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            
            case "Create New Invoice":
                newInv();
                break;
                
            case "Delete Invoive":
                deleteInv();
                break;
                
            case "Load File":
                loadFile(null, null);
                break;
                
            case "Save File":
                saveFile();
                break;
        }
        
    }
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
        int selectedRow = frame.getInvoicesTable().getSelectedRow();
        if (selectedRow == -1) {
            frame.getCustomerNameLbl().setText("");
            frame.getInvDateLbl().setText("");
            frame.getInvNumLbl().setText("");
            frame.getInvTotalLbl().setText("");
            frame.setLineTableModel(new LineTableModel());
        } else {
            InvoiceHeader selectedInv = frame.getInvoices().get(selectedRow);
            frame.getCustomerNameLbl().setText(selectedInv.getCustomerName());
            frame.getInvDateLbl().setText(frame.sdf.format(selectedInv.getInvoiceDate()));
            frame.getInvNumLbl().setText(""+selectedInv.getInvoiceNum());
            frame.getInvTotalLbl().setText(""+selectedInv.getTotal());
            frame.setLineTableModel(new LineTableModel(selectedInv.getLines()));
            
        }
    }

    private void newInv() {
    }

    private void deleteInv() {
        int selectedRow = frame.getInvoicesTable().getSelectedRow();
        if(selectedRow != -1){
            frame.getInvoices().remove(selectedRow);
            frame.getHeaderTableModel().fireTableDataChanged();
        }
    }

    public void loadFile(String hPath, String lPath) {
        System.out.println("Load File");

        File hFile = null;
        File lFile = null;
        if(hPath == null && lPath == null){
            JFileChooser fc = new JFileChooser();
            JOptionPane.showMessageDialog(frame, "Please, select Header file!", "Header", JOptionPane.WARNING_MESSAGE);
            int result = fc.showOpenDialog(frame);
            if(result == JFileChooser.APPROVE_OPTION){
                hFile = fc.getSelectedFile();
                JOptionPane.showMessageDialog(frame, "Please, select Line file!", "Line", JOptionPane.WARNING_MESSAGE);
                result = fc.showOpenDialog(frame);
                if (result == JFileChooser.APPROVE_OPTION) {
                    lFile = fc.getSelectedFile();
                }
            }
        } else {
            hFile = new File(hPath);
            lFile = new File(lPath);
        }
        
        if(hFile != null && lFile != null){
            try{
                List<String> hData = readFile(hFile);
                List<String> lData = readFile(lFile);
                System.out.println("check");
                for (String header : hData) {
                    /*
                        header = "1,12-11-2020,Sameer"
                    */
                    String[] parts = header.split(",");
                    /*
                        parts = ["1", "12-11-2020", "Sameer"]
                    */
                    int num = Integer.parseInt(parts[0]);
                    Date date = new Date();
                    try {
                        date = InvoiceFrame.sdf.parse(parts[1]);
                    } catch (ParseException ex) {}
                    String name = parts[2];
                    InvoiceHeader inv = new InvoiceHeader(num, date, name);
                    frame.getInvoices().add(inv);
                }
                frame.setHeaderTableModel(new HeaderTableModel(frame.getInvoices()));
                for(String line : lData){
                    String[] parts = line.split(",");
                    int num = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    int price = Integer.parseInt(parts[2]);
                    int count = Integer.parseInt(parts[3]);
                    InvoiceHeader invoice = frame.getInvoiceByNum(num);
                    InvoiceLine invline = new InvoiceLine(invoice, name, price, count);
                }
                System.out.println("check");

            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Error while loading files", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
    }

    private void saveFile() {
    }
    
    private List<String> readFile(File f) throws IOException {
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        List<String> lines = new ArrayList<>();
        String line = null;

        while ((line = br.readLine()) != null) {
            lines.add(line);
        }

        return lines;
    }
}
