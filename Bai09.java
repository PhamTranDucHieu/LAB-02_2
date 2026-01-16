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
public class Bai09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhap so phan tu
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();

        int[] a = new int[n];

        // Nhap mang
        for (int i = 0; i < n; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        // Sap xep tang dan (doi cho truc tiep)
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }

        // In mang sau khi sap xep
        System.out.println("Mang sau khi sap xep tang dan:");
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
    
}
