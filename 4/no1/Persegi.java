class Persegi{
    private double sisi;
    Persegi(double s){
        sisi = s;
    }
    public double getSisi() {
        return sisi;
    }
    public double getLuas(){
        return sisi*sisi;
    }
    public double getKeliling(){
        return 4*sisi;
    }
}
class Kubus extends Persegi{
    Kubus(double s){
        super(s);
    }
    public double getLuasPermukaan(){
        return 6*getSisi();
    }
    public double getVolume(){
        return getSisi()*getSisi()*getSisi();
    }
}
class PersegiPanjang{
    private double panjang,lebar;
    PersegiPanjang(double p, double l){
        panjang = p;
        lebar  = l;
    }
    public double getpanjang() {
        return panjang;
    }
    public double getLebar() {
        return lebar;
    }
    public double getLuas(){
        return panjang*lebar;
    }
    public double getKeliling(){
        return 2*(panjang*lebar);
    }
}
class Balok extends PersegiPanjang{
    private double tinggi;
    Balok(double p, double l, double t){
        super(p,l);
        tinggi = t;
    }
    public double getTinggi() {
        return tinggi;
    }
    public double getLuasPermukaan(){
        return  2*((getpanjang()*getLebar())+(getpanjang()*getTinggi())+(getLebar()*getTinggi())) ;
    }
    public double getVolume(){
        return getLuas()*getTinggi();
    }
}
class Lingkaran{
    private double jariJari;
    Lingkaran(Double r){
        jariJari = r;
    }
    public double getJariJari() {
        return jariJari;
    }
    public double getLuas(){
        return (22*jariJari*jariJari)/7;
    }
    public double getKeliling(){
        return (22*(jariJari*2))/7;
    }
}
class Tabung extends Lingkaran{
    private double tinggi;
    Tabung(double r, double ti){
        super(r);
        tinggi = ti;
    }
    public double getTinggi() {
        return tinggi;
    }
    public double getLuasPermukaan(){
        return (getKeliling()*getTinggi())/(getKeliling()*getKeliling());
    }
    public double getVolume(){
        return getLuas()*getTinggi();
    }
}
class Segitiga{
    private double alas,tinggi;
    Segitiga(double a, double ts){
        alas  = a;
        tinggi = ts;
    }public double getAlas() {
        return alas;
    }public double getTinggi() {
        return tinggi;
    }
    public double getLuas(){
        return 0.5*getAlas()*getTinggi();
    }
    public double getKeliling(){
        double sisimiring = Math.sqrt( ( (getAlas()/2)*(getAlas()/2) )+( getTinggi()+getTinggi() ) ); 
        return sisimiring*2+getAlas();
    }
}
class PrismaSegitiga extends Segitiga{
    private double tinggiPrisma;
    PrismaSegitiga(double a, double ts, double tp){
        super(a,ts);
        tinggiPrisma = tp;
    }
    public double getTinggiPrisma() {
        return tinggiPrisma;
    }
    public double getLuasPermukaan(){
        return getKeliling()*getTinggiPrisma();
    }
    public double getVolume(){
        return getLuas()*getTinggiPrisma();
    }
}
class Bola extends Lingkaran{
    Bola(double rb){
        super(rb);
    }
    public double getLuasPermukaan(){
        return 4*getLuas();
    }
    public double getVolume(){
        return (4*getLuas()*getJariJari())/3;
    }
}
class Trapesium{
    private double sisiAtas, sisiBawah, tinggiTrap;
    Trapesium(double sA, double sB, double tTr){
        sisiAtas = sA;
        sisiBawah = sB;
        tinggiTrap = tTr;
    }
    public double getSisiAtas() {
        return sisiAtas;
    }
    public double getSisiBawah() {
        return sisiBawah;
    }public double getTinggiTrap() {
        return tinggiTrap;
    }
    public double getLuas(){
        return 0.5*((getSisiAtas()+getSisiBawah())*getTinggiTrap());
    }
    private double getsisiSisa(){
        return (getSisiBawah()-getSisiAtas())/2;
    }
    public double getKeliling(){
        double sisiMiring = Math.sqrt( (getsisiSisa()*getsisiSisa())+(getTinggiTrap()*getTinggiTrap()) );
        return getSisiAtas()+getSisiBawah()+2*(sisiMiring);
    }

}
