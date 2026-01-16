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
public class Bai12 {
public static int tinhTongChuSo(int x) {
        int tong = 0;
        x = Math.abs(x); // xử lý số âm
        while (x > 0) {
            tong += x % 10;
            x /= 10;
        }
        return tong;
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

        System.out.println("Ket qua:");
        for (int x : a) {
            System.out.println(x + " -> tong chu so = " + tinhTongChuSo(x));
        }
    }
    
}
