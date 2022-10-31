package model;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import view.InvoiceFrame;

public class InvoiceHeader {
    private int invoiceNum;
    private Date invoiceDate;
    private String customerName;
    private ArrayList<InvoiceLine> lines;

    public InvoiceHeader(int invoiceNum, Date invoiceDate, String customerName) {
        this.invoiceNum = invoiceNum;
        this.invoiceDate = invoiceDate;
        this.customerName = customerName;
    }

    
    public int getInvoiceNum() {
        return invoiceNum;
    }

    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    public Date getInvoiceDate() {
        return invoiceDate;
    }

    public void setInvoiceDate(Date invoiceDate) {
        this.invoiceDate = invoiceDate;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public ArrayList<InvoiceLine> getLines() {
        if(lines == null){
            lines = new ArrayList();
        }
        return lines;
    }
    
    public int getInvTotal(){
        int total = 0;
        for(InvoiceLine line: getLines() ){
            total += line.getTotal();
        }
        return total;
    }
    
    public int getTotal() {
        return getLines().stream().mapToInt(item -> item.getTotal()).sum();
    }
    
    public void addInvLine(InvoiceLine line){
        getLines().add(line);
    }
    
    public String getAsCSV() {
        return invoiceNum+","+InvoiceFrame.sdf.format(invoiceDate)+","+customerName;
    }
}
