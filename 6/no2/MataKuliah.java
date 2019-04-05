class MataKuliah{
    private String matkul,nMutu;
    private double uas = 0,uts = 0,nAkhir;
    private int sks = 3;
    private String dosen;

    MataKuliah(double uas, double uts, String mk){
        this.uas = uas;
        this.uts = uts;
        matkul = mk;
    }
    public double getUas() {
        return uas;
    }
    public double getUts() {
        return uts;
    }
    public int getSks() {
        return sks;
    }
    public void setMatkul(String n) {
        matkul = n;
    }
    public String getMatkul() {
        return matkul;
    }
    public String getDosen() {
        if( matkul == "Pemrograman Berorientasi Objek"){
            dosen = "pak Supri - pak armin";
        }else if(matkul == "Pemrosesan Citra Digital"){
            dosen = "pak Hendra - pak diaraya";
        }else if(matkul == "Pemrograman Mobile"){
            dosen = "pak Amil - pak supri";
        }else if(matkul == "Persamaan Differensial"){
            dosen = "pak Galsan - pak syam";
        }else if(matkul == "Aljabar Linear"){
            dosen = "pak Budi - pak loeky";
        }else if(matkul == "Struktur Data"){
            dosen = "pak Supri - pak edi";
        }else if(matkul == "Teori Bilangan"){
            dosen = "ibu Era - pak loeky";
        }else if(matkul == "Riset Teknologi Informasi"){
            dosen = "Dosen Ilkom";
        }else{
            dosen = "tidak ada dosen";
        }
        return dosen;
    }
    public double getnAkhir() {
        nAkhir = (uas+uts)/2;
        return nAkhir;
    }    
    public String getnMutu() {
        if(nAkhir > 85 && nAkhir <= 100 ){
            nMutu = "A";
        }
        else if(nAkhir > 80 && nAkhir <=85){
            nMutu = "A-";
        }
        else if(nAkhir > 75 && nAkhir <=80 ){
            nMutu = "B+";
        }
        else if(nAkhir > 70 && nAkhir <=75){
            nMutu = "B";
        }
        else if(nAkhir > 65 && nAkhir <=70 ){
            nMutu = "B-";
        }
        else if(nAkhir > 60 && nAkhir <=65){
            nMutu = "C+";
        }
        else if(nAkhir > 50 && nAkhir <=60 ){
            nMutu = "C";
        }
        else if(nAkhir >= 45 && nAkhir <=50){
            nMutu = "D";
        }
        else if(nAkhir >100 || nAkhir <0){
            nMutu = "input nilai not valid";
        }
        else{
            nMutu = "Error";
        }
        return nMutu;
    }

}
