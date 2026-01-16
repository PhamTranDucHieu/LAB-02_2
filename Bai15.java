/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2.pkg2;

/**
 *
 * @author Admin
 */
import java.util.Scanner;
public class Bai15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();

        String[] tu = s.split(" ");
        StringBuilder ketQua = new StringBuilder();

        for (String t : tu) {
            StringBuilder dao = new StringBuilder(t);
            ketQua.append(dao.reverse().toString()).append(" ");
        }

        System.out.println("Ket qua: " + ketQua.toString().trim());
    }
    
}
