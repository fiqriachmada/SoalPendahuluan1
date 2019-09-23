import java.util.Scanner;

public class NPM07066soalPendahuluan1_4 {
    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        do {
            System.out.print("Masukkan Umur = ");
            int umur = input.nextInt();
            if(umur<=5){
                System.out.println("Umur BALITA");
            }else if(umur>50){
                System.out.println("Umur TUA");
            }else if(umur>=6 && umur<=17){
                System.out.println("Umur ANAK-ANAK");
            }else if(umur>=18 && umur<=50){
                System.out.println("Umur DEWASA")   ;
            }
            System.out.println("Ulangi lagi? (y/n) ");
            String pilih=input.next();
            if(pilih.equals("y")){
                System.out.println("==========");
            }else if(pilih.equals("n")){
                break;
            }
        }while (true);
    }
}
