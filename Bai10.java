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
public class Bai10 {

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

        if (n < 2) {
            System.out.println("Mang khong du 2 phan tu de tim so lon thu hai");
            return;
        }

        int lonNhat = Integer.MIN_VALUE;
        int lonThuHai = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (a[i] > lonNhat) {
                lonThuHai = lonNhat;
                lonNhat = a[i];
            } else if (a[i] > lonThuHai && a[i] != lonNhat) {
                lonThuHai = a[i];
            }
        }

        if (lonThuHai == Integer.MIN_VALUE) {
            System.out.println("Khong ton tai so lon thu hai (tat ca phan tu bang nhau)");
        } else {
            System.out.println("So lon thu hai la: " + lonThuHai);
        }
    }
    
}
