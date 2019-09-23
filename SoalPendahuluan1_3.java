import java.util.Scanner;
public class NPM07066soalPendahuluan1_3 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai diamater =");
        double diameter=input.nextDouble();
        System.out.print("Masukkan nilai tinggi = ");
        double tinggi=input.nextDouble();
        double pi=3.14;
        double vol= (diameter/2*pi*pi)*tinggi;
        System.out.println("Volume tabung = "+vol);
    }
}
