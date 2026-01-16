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
public class Bai17 {

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

        int demChan = 0, demLe = 0;
        for (int x : a) {
            if (x % 2 == 0) demChan++;
            else demLe++;
        }

        int[] chan = new int[demChan];
        int[] le = new int[demLe];

        int idxChan = 0, idxLe = 0;
        for (int x : a) {
            if (x % 2 == 0) chan[idxChan++] = x;
            else le[idxLe++] = x;
        }

        System.out.print("Mang so chan: ");
        for (int x : chan) System.out.print(x + " ");
        System.out.println();

        System.out.print("Mang so le: ");
        for (int x : le) System.out.print(x + " ");
        System.out.println();
    }
    
}
