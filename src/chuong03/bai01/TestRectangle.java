/**
 * @description: This class contains the main method to test the Rectangle class functionality.
 * @author: Bui Nguyen Thanh Phi
 * @version: 1.0
 * @created: 16-Sep-2025 8:45:36 AM
 */

package chuong03.bai01;

import java.util.Scanner;

public class TestRectangle {
    public static Rectangle input() throws Exception {
       Scanner sc = new Scanner(System.in);
       System.out.println("Nhap tu ban phim cho canh HCN: ");
        System.out.print("Enter length: ");
        double l = sc.nextDouble();
        System.out.print("Enter width: ");
        double w = sc.nextDouble();
        Rectangle h = new Rectangle(l, w);
        return h;
    }      
    public static void main(String[] args) throws Exception {
           Rectangle h1 = new Rectangle(); 
           h1.setLength(10); 
           h1.setWidth(3); 
           h1.inTieuDe(); 
           System.out.println(h1); 
           Rectangle h2 = new Rectangle(120, 30); 
           System.out.println(h2); 
           System.out.println(input());
       }
}
