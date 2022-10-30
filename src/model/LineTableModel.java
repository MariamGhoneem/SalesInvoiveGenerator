package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class LineTableModel extends AbstractTableModel{
    private ArrayList<InvoiceLine> invoiceLines;
    private String[] columns = {"Name", "Price", "Count", "Total"};
    
    public LineTableModel(ArrayList<InvoiceLine> invoiceLine) {
        this.invoiceLines = invoiceLine;
    }
    
    public LineTableModel() {
        this(new ArrayList<InvoiceLine>());
    }
    
    @Override
    public int getRowCount() {
        return invoiceLines.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        InvoiceLine lineRow = invoiceLines.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return lineRow.getItemName();
            case 1:
                return lineRow.getItemPrice();
            case 2:
                return lineRow.getCount();
            case 3:
                return lineRow.getTotal();
            default:
                return "";
        }
    }
    
     @Override
    public String getColumnName(int column) {
        return columns[column];
    }
}
