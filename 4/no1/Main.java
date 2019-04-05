import java.util.Scanner;

class Main{
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
       Bangun();
    }  
    public static void bangunDatar(){
        System.out.println(
                        "1. Persegi"+"\n"+
                        "2. Persegi Panjang"+"\n"+
                        "3. Lingkaran"+"\n"+
                        "4. Segitiga"+"\n"+
                        "5. Trapesium");
        System.out.println("===============");
        System.out.print("select : ");
        int choose = in.nextInt();
        switch (choose){
            case 1 :
                Persegi();
                break;
            case 2 :
                PersegiPanjang();
                break; 
            case 3 :
                Lingkaran();
                break;
            case 4 :   
                Segitga();
                break;
            case 5 :   
                Trapesium();
                break;
            default :
       }
    }
    public static void bangunRuang(){
        System.out.println(
                    "1. Kubus"+"\n"+
                    "2. Balok"+"\n"+
                    "3. Tabung"+"\n"+
                    "4. Prisma Segitiga"+"\n"+
                    "5. Bola");
        System.out.println("===============");
        System.out.print("select : ");
        int choose = in.nextInt();
        switch (choose){
            case 1 :
                Kubus();
                break;
            case 2 :
                Balok();
                break;
            case 3 : 
                Tabung();
                break;
            case 4 :
                PrismaSegitiga();
                break;
            case 5 : 
                Bola();   
                break;
            default :
       }
    }
    public static void Bangun(){
        System.out.println("1. Bangun Datar"+"\n2. Bangun Ruang");
        System.out.println("===============");
        System.out.print("select : ");
        int choose = in.nextInt();
        System.out.println("===============");
        switch (choose){
            case 1 :
                bangunDatar();
                break;
            case 2 :
                bangunRuang();
                break;
            default :
                System.out.println("Inputan Salah");
                break;
        }   
    }
    public static void Persegi(){
        System.out.print("sisi : "); 
        Double n = in.nextDouble();
        Persegi per = new Persegi(n);     
        System.out.printf("Keliling = %.2f \n",per.getKeliling());
        System.out.printf("Luas = %.2f \n",per.getLuas());
    }
    public static void PersegiPanjang(){
        System.out.print("panjang : "); 
        Double p = in.nextDouble();
        System.out.print("lebar : "); 
        Double l = in.nextDouble();
        PersegiPanjang pp = new PersegiPanjang(p,l);
        System.out.printf("Keliling = %.2f \n",pp.getKeliling());
        System.out.printf("Luas = %.2f \n",+pp.getLuas());
    }
    public static void Lingkaran(){
        System.out.print("jari-jari : "); 
        Double r = in.nextDouble();
        Lingkaran ling = new Lingkaran(r);
        System.out.printf("Keliling = %.2f \n",ling.getKeliling());
        System.out.printf("Luas = %.2f \n",ling.getLuas());
    }
    public static void Segitga(){
        System.out.print("alas : "); 
        Double a = in.nextDouble();
        System.out.print("tinggi : "); 
        Double ts = in.nextDouble();
        Segitiga seg = new Segitiga(a, ts);
        System.out.printf("Keliling = %.2f \n",seg.getKeliling());
        System.out.printf("Luas = %.2f \n",+seg.getLuas());
    }
    public static void Trapesium(){
        System.out.print("sisi atas : "); 
        Double sA = in.nextDouble();
        System.out.print("sisi bawah : "); 
        Double sB = in.nextDouble();
        System.out.print("tinggi : "); 
        Double tTr = in.nextDouble();
        Trapesium trap = new Trapesium(sA, sB, tTr);
        System.out.printf("Keliling = %.2f \n",trap.getKeliling());
        System.out.printf("Luas = %.2f \n",+trap.getLuas());
    }
    public static void Kubus(){
        System.out.print("sisi : "); 
        Double n = in.nextDouble();
        Kubus kub = new Kubus(n);
        System.out.printf("Volume = %.2f \n",kub.getVolume());
        System.out.printf("Luas Permukaan= %.2f \n",kub.getLuasPermukaan());     
    }
    public static void Balok(){
        System.out.print("Panjang : "); 
        double p = in.nextDouble();
        System.out.print("Lebar : "); 
        double l = in.nextDouble();
        System.out.print("Tinggi : "); 
        double t = in.nextDouble();
        Balok bal = new Balok(p,l,t);
        System.out.printf("Volume = %.2f \n",bal.getVolume());
        System.out.printf("Luas Permukaan= %.2f \n",bal.getLuasPermukaan());
    }
    public static void Tabung(){
        System.out.print("Jari-jari : "); 
        double r = in.nextDouble();
        System.out.print("Tinggi : "); 
        double ti = in.nextDouble();
        Tabung tab = new Tabung(r,ti);
        System.out.printf("Volume = %.2f \n",tab.getVolume());
        System.out.printf("Luas Permukaan = %.2f",tab.getLuasPermukaan());
                
    }
    public static void PrismaSegitiga(){
        System.out.print("Alas Segitiga: "); 
        double a = in.nextDouble();
        System.out.print("tinggi Segitga : "); 
        double ts = in.nextDouble();
        System.out.print("Tinggi Prisma : "); 
        double tp = in.nextDouble();
        PrismaSegitiga pris = new PrismaSegitiga(a, ts, tp);
        System.out.printf("Volume = %.2f \n",pris.getVolume());
        System.out.printf("Luas Permukaan= %.2f \n",pris.getLuasPermukaan());
    }
    public static void Bola(){
        System.out.print("jari jari : "); 
        Double rb = in.nextDouble();
        Bola bol = new Bola(rb);
        System.out.printf("Volume = %.2f \n",bol.getVolume());
        System.out.printf("Luas Permukaan= %.2f \n",bol.getLuasPermukaan());
        
    }
}
