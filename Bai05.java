/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2.pkg2;

/**
 *
 * @author ADMIN
 */
import java.util.Scanner;


public class Bai05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String dao = new StringBuilder(s).reverse().toString();

        if (s.equals(dao))
            System.out.println("Chuoi la Palindrome");
        else
            System.out.println("Chuoi khong phai Palindrome");
    }
    
}
