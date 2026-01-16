/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2.pkg2;

/**
 *
 * @author Admin
 */
import java.util.Random;
import java.util.Scanner;
public class Bai20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int soBiMat = rand.nextInt(100) + 1;
        int soLanDoan = 0;
        final int MAX_LAN = 7;

        System.out.println("Chao mung ban den tro choi doan so!");
        System.out.println("Toi da chon mot so tu 1 den 100.");
        System.out.println("Ban co " + MAX_LAN + " lan doan. Hay doan nao!");

        while (soLanDoan < MAX_LAN) {
            System.out.print("Lan doan " + (soLanDoan + 1) + ": ");
            int doan = sc.nextInt();
            soLanDoan++;

            if (doan == soBiMat) {
                System.out.println("CHINH XAC! Ban doan dung sau " + soLanDoan + " lan.");
                return;
            } else if (doan < soBiMat) {
                System.out.println("So ban doan NHO hon so bi mat.");
            } else {
                System.out.println("So ban doan LON hon so bi mat.");
            }

            System.out.println("Con " + (MAX_LAN - soLanDoan) + " lan doan nua.");
        }

        System.out.println("Het luot! So bi mat la: " + soBiMat);
    }
    
}
