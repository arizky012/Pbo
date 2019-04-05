class Main{
    public static void main(String[] args) {

       Pegawai p = new Pegawai("arizki");
       System.out.println(p.getNama()+" mendapatkan gaji "+p.getGaji());
       Dosen d = new Dosen("akbar",12);
       System.out.println(d.getNama()+" mendapatkan gaji "+d.getGaji());
       Pegawai s = new Staff("gibs",20);
       System.out.println(s.getNama()+" mendapatkan gaji "+s.getGaji());
    }

}
