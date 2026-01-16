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
public class Bai16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so phan tu mang: ");
        int n = sc.nextInt();
        int[] a = new int[n];
        System.out.println("Nhap mang:");
        for (int i = 0; i < n; i++) a[i] = sc.nextInt();

        System.out.print("Nhap gia tri K: ");
        int k = sc.nextInt();

        System.out.println("Cac cap co tong bang " + k + ":");
        boolean timThay = false;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] + a[j] == k) {
                    System.out.println("(" + a[i] + ", " + a[j] + ")");
                    timThay = true;
                }
            }
        }

        if (!timThay) {
            System.out.println("Khong tim thay cap nao");
        }
    }
    
}
