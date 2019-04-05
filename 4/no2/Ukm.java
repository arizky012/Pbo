class Ukm{
    private String ketua;
    Ukm(String ket){
        ketua = ket; 
    }
    public String getKetua() {
        return ketua;
    }
}
class PengurusInti extends Ukm{
    private String wakil,bendahara,sekretaris;
    PengurusInti(String ket,String wak, String ben, String sek){
        super(ket);
        wakil = wak;
        bendahara = ben;
        sekretaris = sek;
    }
    public String getBendahara() {
        return bendahara;
    }
    public String getSekretaris() {
        return sekretaris;
    }
    public String getWakil() {
        return wakil;
    }
}
class Koordinator extends Ukm{
    private String name,anggota,ketKoor;
    Koordinator(String ket, String name, String angg, String ketKoor) {
        super(ket);
        this.name = name;
        anggota = angg;
        this.ketKoor = ketKoor;
    }
    public String getAnggota() {
        return anggota;
    }
    public String getKetKoor() {
        return ketKoor;
    }
    public String getName() {
        return name;
    }

}
