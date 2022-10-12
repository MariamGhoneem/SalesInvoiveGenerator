package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LineController implements ActionListener {

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            
            case "Save":
                save();
                break;
                
            case "Cancel":
                cancel();
                break;
                
        }
   
    }

    private void save() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void cancel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
