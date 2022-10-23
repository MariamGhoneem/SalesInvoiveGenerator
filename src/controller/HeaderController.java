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
import model.InvoiceHeader;
import view.InvoiceFrame;

public class HeaderController implements ActionListener {
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

    private void newInv() {
    }

    private void deleteInv() {
    }

    public void loadFile(String hPath, String lPath) {
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
                for (String header : hData) {
                    String[] segments = header.split(",");
                    int num = Integer.parseInt(segments[0]);
                    Date date = new Date();
                    try {
                        date = InvoiceFrame.sdf.parse(segments[1]);
                    } catch (ParseException ex) {
                        JOptionPane.showMessageDialog(frame, "Error while parsing date: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                    }
                    String name = segments[2];
                    InvoiceHeader inv = new InvoiceHeader(num, date, name);
                    frame.getInvoices().add(inv);
                }
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(frame, "Error while reading data: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
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
