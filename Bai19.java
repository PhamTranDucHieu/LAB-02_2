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
public class Bai19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so hang m: ");
        int m = sc.nextInt();
        System.out.print("Nhap so cot n: ");
        int n = sc.nextInt();

        int[][] mt = new int[m][n];
        System.out.println("Nhap ma tran:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mt[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMa tran goc:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mt[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\nMa tran chuyen vi:");
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                System.out.print(mt[i][j] + "\t");
            }
            System.out.println();
        }
    }
    
}
