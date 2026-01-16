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



public class Bai07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhap mang thu nhat
        System.out.print("Nhap so phan tu mang 1: ");
        int n1 = sc.nextInt();
        int[] a = new int[n1];

        for (int i = 0; i < n1; i++) {
            System.out.print("a[" + i + "] = ");
            a[i] = sc.nextInt();
        }

        // Nhap mang thu hai
        System.out.print("Nhap so phan tu mang 2: ");
        int n2 = sc.nextInt();
        int[] b = new int[n2];

        for (int i = 0; i < n2; i++) {
            System.out.print("b[" + i + "] = ");
            b[i] = sc.nextInt();
        }

        // Mang gop (kich thuoc toi da = n1 + n2)
        int[] c = new int[n1 + n2];
        int k = 0;

        // Dua mang a vao mang c
        for (int i = 0; i < n1; i++) {
            c[k++] = a[i];
        }

        // Dua mang b vao mang c neu chua ton tai
        for (int i = 0; i < n2; i++) {
            boolean trung = false;
            for (int j = 0; j < k; j++) {
                if (b[i] == c[j]) {
                    trung = true;
                    break;
                }
            }
            if (!trung) {
                c[k++] = b[i];
            }
        }

        // In mang sau khi gop va loai trung
        System.out.println("Mang sau khi gop va loai trung:");
        for (int i = 0; i < k; i++) {
            System.out.print(c[i] + " ");
        }
    }
    
}
