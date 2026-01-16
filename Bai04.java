/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2.pkg2;

/**
 *
 * @author ADMIN
 */
public class Bai04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] a = {-2, 1, -3, 4, -1, 2, 1};
        int max = a[0];
        int sum = a[0];

        for (int i = 1; i < a.length; i++) {
            sum = Math.max(a[i], sum + a[i]);
            max = Math.max(max, sum);
        }

        System.out.println("Tong lon nhat cua mang con: " + max);
    }
    
}
