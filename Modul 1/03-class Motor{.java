class Motor{
    String merk;
    int tahun;
    String noPolisi;
    String warna;

    public Motor(String merk,int tahun,String noPolisi,String warna){
        this.merk=merk;
        this.tahun=tahun;
        this.noPolisi=noPolisi;
        this.warna=warna;
        
        System.out.println("Merk :"+this.merk);
        System.out.println("Tahun :"+this.tahun);
        System.out.println("No Polisi :"+this.noPolisi);
        System.out.println("Warna :"+this.warna);
    }
}


public class App{
    public static void main(String[] args) throws Exception {
    Motor motorku = new Motor("VARIO 150 LEDNEW",2024, "DR 54554 GR","HITAM");
    }
}