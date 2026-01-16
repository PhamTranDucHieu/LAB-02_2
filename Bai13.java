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
public class Bai13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String s = sc.nextLine().trim(); // xóa khoảng trắng đầu cuối

        // Thay nhiều khoảng trắng thành 1 khoảng trắng
        while (s.contains("  ")) {
            s = s.replace("  ", " ");
        }

        String[] tu = s.split(" ");
        StringBuilder ketQua = new StringBuilder();

        for (String t : tu) {
            if (!t.isEmpty()) {
                String tuDauHoa = Character.toUpperCase(t.charAt(0)) + t.substring(1).toLowerCase();
                ketQua.append(tuDauHoa).append(" ");
            }
        }

        System.out.println("Chuoi sau khi chuan hoa: " + ketQua.toString().trim());
    }
    
}
