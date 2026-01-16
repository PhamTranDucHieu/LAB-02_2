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
public class Bai11 {
public static boolean laSoNguyenTo(int x) {
        if (x < 2) return false;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0) return false;
        }
        return true;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu: ");
        int n = sc.nextInt();
        int[] a = new int[n];

        System.out.println("Nhap mang:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        int dem = 0;
        System.out.print("Cac so nguyen to: ");
        for (int x : a) {
            if (laSoNguyenTo(x)) {
                System.out.print(x + " ");
                dem++;
            }
        }
        System.out.println("\nTong cong co " + dem + " so nguyen to");
    }
    
}
