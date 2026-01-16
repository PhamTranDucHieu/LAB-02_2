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
public class Bai02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine();

        int[] dem = new int[256];

        for (int i = 0; i < s.length(); i++) {
            dem[s.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++) {
            if (dem[i] > 0)
                System.out.println((char) i + " : " + dem[i]);
        }
    }
    
}
