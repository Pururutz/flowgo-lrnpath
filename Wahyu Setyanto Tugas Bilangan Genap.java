import java.util.*;
import java.lang.Math;

class JavaApplication {
    public static void main(String[] args) {
        int BilGen;
        
        System.out.println("Sebutkan 10 bilangan genap jika 0 tidak dihitung");
        BilGen = 0;
        while (BilGen < 20) {
            BilGen = BilGen + 2;
            System.out.println("10 bilangan genap adalah " + BilGen);
        }
    }
}
