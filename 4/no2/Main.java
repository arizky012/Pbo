import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.err.println("ketua : ");
        String ket = in.next();
        System.err.println("wakil : ");
        String wak = in.next();
        System.err.println("bendahara : ");
        String ben = in.next();
        System.err.println("sekretaris : ");
        String sek = in.next();
        System.err.println("divisi  : ");
        String name = in.next();
        System.out.println("ketua divisi");
        String ketKoor = in.next();
        System.err.println("anggota : ");
        String angg = in.next();
        

        Ukm ukm = new Ukm(ket);
        PengurusInti inti = new PengurusInti(ket, wak, ben, sek);
        Koordinator pubdok = new Koordinator(ket, name, angg, ketKoor);
        System.out.println("=================================");
        
        System.out.printf("Ketua  = %s \n", inti.getKetua());
        System.err.printf("Wakil = %s \n",inti.getWakil());
        System.out.printf("Bendahara  = %s \n", inti.getBendahara());
        System.err.printf("Sekretaris = %s \n",inti.getSekretaris());
        System.out.printf("divisi =  %s \n",pubdok.getName());
        System.err.printf("ketua divisi = %s \n", pubdok.getKetKoor());
        System.err.printf("anggota divisi = %s \n",pubdok.getAnggota());
    }
}
