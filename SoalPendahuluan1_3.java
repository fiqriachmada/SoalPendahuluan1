import java.util.Scanner;
public class NIP07067soalPendahuluan1_3 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai diamater =");
        int diameter=input.nextInt();
        System.out.println("masukan nilai tinggi = ");
        int tinggi=input.nextInt();
        double pi=3.14;
        double volume= (diameter/2*pi*pi)*tinggi;
        System.out.println("volume tabung = "+volume);

    }
}
