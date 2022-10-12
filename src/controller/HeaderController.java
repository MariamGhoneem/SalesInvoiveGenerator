package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HeaderController implements ActionListener {

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
                loadFile();
                break;
                
            case "Save File":
                saveFile();
                break;
        }
        
    }

    private void newInv() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void deleteInv() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void loadFile() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void saveFile() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
