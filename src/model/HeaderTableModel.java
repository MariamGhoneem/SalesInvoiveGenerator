package model;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import view.InvoiceFrame;

public class HeaderTableModel extends AbstractTableModel {
    
    private List<InvoiceHeader> invList;
    private String[] columns = {"Num", "Name", "Date", "Total"};

    public HeaderTableModel(List<InvoiceHeader> invList) {
        this.invList = invList;
    }

    @Override
    public int getRowCount() {
        return invList.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceHeader invHeaderRow = invList.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return invHeaderRow.getInvoiceNum();
            case 1:
                return invHeaderRow.getCustomerName();
            case 2:
                return InvoiceFrame.sdf.format(invHeaderRow.getInvoiceDate());
            case 3:
                return invHeaderRow.getInvTotal();
            default:
                return "";
        }
    }
    
  
    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
}
