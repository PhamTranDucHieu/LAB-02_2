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
public class Bai14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine().trim();

        if (s.isEmpty()) {
            System.out.println("So tu: 0");
            return;
        }

        // Thay nhiều khoảng trắng thành 1
        while (s.contains("  ")) {
            s = s.replace("  ", " ");
        }

        String[] tu = s.split(" ");
        System.out.println("So tu trong chuoi: " + tu.length);
    }
    
}
