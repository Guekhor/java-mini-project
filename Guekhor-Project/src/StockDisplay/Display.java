package StockDisplay;

import StockProduct.Product;
import org.nocrala.tools.texttablefmt.BorderStyle;
import org.nocrala.tools.texttablefmt.CellStyle;
import org.nocrala.tools.texttablefmt.ShownBorders;
import org.nocrala.tools.texttablefmt.Table;

import java.util.ArrayList;
import java.util.Scanner;
public class Display {

    public void displayedCaption(){
        System.out.println("\n" +
                " ██████╗███████╗████████╗ █████╗ ██████╗          ██╗ █████╗ ██╗   ██╗ █████╗ \n" +
                "██╔════╝██╔════╝╚══██╔══╝██╔══██╗██╔══██╗         ██║██╔══██╗██║   ██║██╔══██╗\n" +
                "██║     ███████╗   ██║   ███████║██║  ██║         ██║███████║██║   ██║███████║\n" +
                "██║     ╚════██║   ██║   ██╔══██║██║  ██║    ██   ██║██╔══██║╚██╗ ██╔╝██╔══██║\n" +
                "╚██████╗███████║   ██║   ██║  ██║██████╔╝    ╚█████╔╝██║  ██║ ╚████╔╝ ██║  ██║\n" +
                " ╚═════╝╚══════╝   ╚═╝   ╚═╝  ╚═╝╚═════╝      ╚════╝ ╚═╝  ╚═╝  ╚═══╝  ╚═╝  ╚═╝\n" +
                "                                                                              \n");
    }
    public void displayMenu(String ... a){
        String total="";
        CellStyle numberStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        Table table = new Table(1, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE,
                ShownBorders.SURROUND_HEADER_FOOTER_AND_COLUMNS);
        table.setColumnWidth(0, 20, 200);
        for (String b:a){
            total+=b;
        }
        table.addCell(total);
        System.out.println(table.render());
    }
    public char displaySelection(){
        char ch;
        System.out.print("Command-->");
        return new Scanner(System.in).nextLine().charAt(0);
    }
    public void displayRecord(ArrayList<Product> arrayList){
        CellStyle numberStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        Table table = new Table(5, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE,
                ShownBorders.SURROUND_HEADER_FOOTER_AND_COLUMNS);
        table.setColumnWidth(0, 10, 50);
        table.setColumnWidth(1, 20, 50);
        table.setColumnWidth(2, 20, 50);
        table.setColumnWidth(3, 20, 50);
        table.setColumnWidth(4, 20, 50);
        table.addCell("ID",numberStyle);
        table.addCell("Name",numberStyle);
        table.addCell("Unit Price",numberStyle);
        table.addCell("Qty",numberStyle);
        table.addCell("Import Date",numberStyle);


        for (Product product : arrayList){
            table.addCell(String.valueOf(product.getID()),numberStyle);
            table.addCell(String.valueOf(product.getProductName()),numberStyle);
            table.addCell(String.valueOf(product.getProductPrice()),numberStyle);
            table.addCell(String.valueOf(product.getQuantity()),numberStyle);
            table.addCell(String.valueOf(product.getDate()),numberStyle);
        }
        table.addCell("Total Record:"+arrayList.size(),5);
        System.out.println(table.render());
    }

    public void displayAnElement(ArrayList<Product> arrayList , int index){

        CellStyle numberStyle = new CellStyle(CellStyle.HorizontalAlign.center);
        Table table = new Table(2, BorderStyle.UNICODE_BOX_DOUBLE_BORDER_WIDE,
                ShownBorders.SURROUND_HEADER_AND_COLUMNS);
        table.setColumnWidth(0, 10, 50);
        table.setColumnWidth(1, 30, 50);
        table.addCell("ID",numberStyle);
        table.addCell(String.valueOf(String.valueOf(arrayList.get(index).getID())),numberStyle);
        table.addCell("Product's Name",numberStyle);
        table.addCell(String.valueOf(String.valueOf(arrayList.get(index).getProductName())),numberStyle);
        table.addCell("Unit Price",numberStyle);
        table.addCell(String.valueOf(String.valueOf(arrayList.get(index).getProductPrice())),numberStyle);
        table.addCell("Qty",numberStyle);
        table.addCell(String.valueOf(String.valueOf(arrayList.get(index).getQuantity())),numberStyle);
        table.addCell("Date",numberStyle);
        table.addCell(String.valueOf(String.valueOf(arrayList.get(index).getDate())),numberStyle);
        System.out.println(table.render());
    }


}
