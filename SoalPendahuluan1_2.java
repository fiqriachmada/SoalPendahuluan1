import java.util.Scanner;
 
public class NPM07066soalPendahuluan1_2 {
    public static void main(String[] rgs){
        Scanner input=new Scanner(System.in);
        System.out.print("Masukkan input diameter lingkaran : ");
        int diameter=input.nextInt();
        double pi=3.14;
        double luas=diameter/2*pi*pi;
        System.out.print("Luas Lingkaran ="+luas);
    }
}
