import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        String mk = "";
        Scanner arzk = new Scanner(System.in);
       System.out.print("Masukkan Nama : ");
       String nama = arzk.next();
       System.out.print("Masukkan NIM : ");
       String nim = arzk.next();
       System.out.print("Masukkan Nilai Uas : ");
       double uas = arzk.nextDouble();
       System.out.print("Masukkan Nilai Uts : ");
       double uts = arzk.nextDouble();
       System.out.print("Masukkan Matakuliah ");
       System.out.print(
           "1. pbo\n"+
           "2. pcd\n"+
           "3. mobile\n"+
           "4. pd\n"+
           "5. alin\n"+
           "6. strukdat\n"+
           "7. tb\n"+
           "8. rti\n");
           System.out.print("input : ");
       switch(arzk.nextInt()){
           case 1 :mk = "Pemrograman Berorientasi Objek";break;
           case 2 :mk = "Pemrosesan Citra Digital";break;
           case 3 :mk = "Pemrograman Mobile";break;
           case 4 :mk = "Persamaan Differensial";break;
           case 5 :mk = "Aljabar Linear";break;
           case 6 :mk = "Struktur Data";break;
           case 7 :mk = "Teori Bilangan";break;
           case 8 :mk = "Riset Teknologi Informasi";break;
           default: break;
       } 
        Mahasiswa  m = new Mahasiswa(uas, uts, mk, nama, nim);
        System.out.println("------------------");
        System.out.println("sistem akademik");
        System.out.println("------------------");
        System.out.println(
            "Nama : "+m.getNama()+
            "\nNim : "+m.getNim()+
            "\nMata Kuliah : "+m.getMatkul()+
            "\nsks : "+m.getSks()+
            "\nDosen : "+m.getDosen()+
            "\nNilai Uts : "+m.getUts()+
            "\nNilai Uas : "+m.getUas()+
            "\nNilai Akhir : "+m.getnAkhir()+
            "\nNilai Mutu : "+m.getnMutu()
        );
    }
}
