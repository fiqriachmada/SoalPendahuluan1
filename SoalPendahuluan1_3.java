import java.util.Scanner;
public class NPM07066soalPendahuluan1_3 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Masukan nilai diamater =");
        double diameter=input.nextInt();
        System.out.println("masukan nilai tinggi = ");
        double tinggi=input.nextInt();
        double pi=3.14;
        double volume= (diameter/2*pi*pi)*tinggi;
        System.out.println("volume tabung = "+volume);
    }
}
