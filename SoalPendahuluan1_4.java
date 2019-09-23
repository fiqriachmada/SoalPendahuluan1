import java.util.Scanner;
public class NIP07066soalPendahuluan1_4 {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        do {
            System.out.println("masukan umur =");
            int umur = input.nextInt();
            if(umur<5){
                System.out.print("umur BALITA");
            }else if(umur>=50){
                System.out.print("umur TUA BANGKA");
            }else if(umur>=6 && umur<=17){
                System.out.print("umur ANAK-ANAK");
            }else if(umur>=18 && umur<=50){
                System.out.println("umur DEWASA")   ;
            }
            System.out.println("ulangi lagi? (y/n) ");
            String pilih=input.next();
            if(pilih.equals("y")){
                System.out.println("==========");
            }else if(pilih.equals("n")){
                break;
            }
        }while (true);
    }
}
