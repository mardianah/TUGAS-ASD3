
import java.util.ArrayList;
import java.util.Scanner;


public class IntegerArraylist {
     public static void main(String[] args) {
       ArrayList<Integer> INT = new ArrayList<Integer>();
        System.out.println("MASUKKAN  ANGKA  :");
        INT.add(new Scanner(System.in).nextInt());
        INT.add(new Scanner(System.in).nextInt());
        System.out.println("HASIL Integer :");
        System.out.println(INT.toString());
    
}
}
