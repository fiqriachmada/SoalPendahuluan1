class Lingkaran{
double diameter;
double pi=3.14;

void setDiameter(double dm){
this.diameter=dm;
}
void Keliling(){
double kll=diameter*pi;
System.out.print("Keliling lingkaran adalah "+kll);
}
double luas(){
double luas=0.25*pi*diameter*diameter;
return luas;
}
}
public class NPM07066soalPendahuluan1_8 {
    public static void main(String[] args) {
       Lingkaran bulet=new Lingkaran();
       double dm=10;
       bulet.setDiameter(dm);
       bulet.Keliling();
       double LUAS=bulet.luas();
       System.out.println("Luas lingkaran adalah "+LUAS);
    }
    
}
