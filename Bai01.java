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
public class Bai01 {
static Scanner sc = new Scanner(System.in);

    static double nhapDiem() {
        return sc.nextDouble();
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       System.out.print("Nhap so sinh vien: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] ma = new String[n];
        String[] ten = new String[n];
        double[] diem = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Sinh vien thu " + (i + 1));
            System.out.print("Ma sinh vien: ");
            ma[i] = sc.nextLine();
            System.out.print("Ten sinh vien: ");
            ten[i] = sc.nextLine();
            System.out.print("Diem: ");
            diem[i] = nhapDiem();
            sc.nextLine();
        }

        double tong = 0;
        for (double d : diem) tong += d;
        double tb = tong / n;

        System.out.println("Diem trung binh: " + tb);

        for (int i = 0; i < n; i++) {
            if (diem[i] >= 5)
                System.out.println(ma[i] + " - " + ten[i] + " : DAT");
            else
                System.out.println(ma[i] + " - " + ten[i] + " : KHONG DAT");
        }
    }
    
}
