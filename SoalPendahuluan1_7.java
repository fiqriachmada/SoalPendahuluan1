class lingkaran{
  //pembuatan atribute
  double diameter;
  double pi=3.14;
  public lingkaran(double dm){
  this.diameter=dm;
  }
  void keliling(){
    double kll=diameter*pi;
    System.out.print("keliling lingkaran adalah"+kll);
    }
    double luas(){
    double luas=diameter/2*pi*pi;
    return luas;
    }
    }
    public class NPM07066SoalPendahuluan1_7 {
    public static void main(String[]args){
    double diameter=10;
    //pembuatan object lingkaran
    lingkaran bulet=new lingkaran(diameter);
    bulet.keliling();
    double LUAS=bulet.luas();
    System.out.println("luas lingkaran adalah"+LUAS);
   }
}
