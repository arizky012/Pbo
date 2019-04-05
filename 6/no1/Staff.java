class Staff extends Pegawai{
    private int absen;
    Staff(String n, int a){
        super(n);
        absen = a;
    }public void setAbsen(int absen) {
        this.absen = absen;
    }public int getAbsen() {
        return absen;
    }
    @Override
    public int getGaji() {
        return super.getGaji()+(absen*50000);
    }
}
