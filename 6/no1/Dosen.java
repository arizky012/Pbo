class Dosen extends Pegawai{
    private int sks;
    Dosen(String n, int s){
        super(n);
        sks = s;
    }public void setSks(int sks) {
        this.sks = sks;
    }public int getSks() {
        return sks;
    }
    @Override
    public int getGaji() {
        return super.getGaji()+(sks*120000);
    }
}
