import java.util.*;
import java.lang.Math;
import java.util.Scanner;

class JavaApplication {
    private static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        String lakilaki, perempuan, gender;
        
        System.out.println("Masukan jenis kelamin anda");
        gender = input.nextLine();
        if (gender.equals("lakilaki")) {
            System.out.println("Anda Laki-Laki");
        } else {
            if (gender.equals("perempuan")) {
                System.out.println("Anda Perempuan");
            } else {
                System.out.println("Gender tidak diketahui");
            }
        }
    }
}
