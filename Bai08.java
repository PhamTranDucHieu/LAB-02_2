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
public class Bai08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhap mat khau
        System.out.print("Nhap mat khau: ");
        String mk = sc.nextLine();

        boolean coHoa = false;
        boolean coThuong = false;
        boolean coSo = false;
        boolean coDacBiet = false;

        // Kiem tra tung ky tu
        if (mk.length() >= 8) {
            for (int i = 0; i < mk.length(); i++) {
                char c = mk.charAt(i);

                if (Character.isUpperCase(c))
                    coHoa = true;
                else if (Character.isLowerCase(c))
                    coThuong = true;
                else if (Character.isDigit(c))
                    coSo = true;
                else
                    coDacBiet = true;
            }
        }

        // Ket luan
        if (mk.length() >= 8 && coHoa && coThuong && coSo && coDacBiet)
            System.out.println("Mat khau MANH");
        else
            System.out.println("Mat khau YEU");
    }
    
}
