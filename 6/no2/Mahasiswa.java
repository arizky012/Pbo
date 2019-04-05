class Mahasiswa extends MataKuliah{
    private String nama;
    private String nim;
    Mahasiswa(double uas, double uts, String mk,String nama,String nim){
        super(uas, uts, mk);
        this.nama = nama;
        this.nim = nim;
    }public String getNama() {
        return nama;
    }public String getNim() {
        return nim;
    }
}
