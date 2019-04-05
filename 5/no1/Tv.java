class Tv implements KontrolTv{
    private String merk;
    private boolean on;
    private String[] saluran = {"RCTI", "SCTV", "INDOSIAR", "TPI", "ANTV", "TRANSTV", "TRANS7"};
    private int volume = 0;
    public Tv(String merk){
        this.merk = merk;
    }
    public void showMerk() {
        System.out.println("====="+merk+"=====");
    }

    public void tvOn(boolean on){
        if(on){
            this.on = true;
            System.out.println("Televisi dihidupkan");
        }
        else{
            this.on = false;
            System.out.println("televisi dimatikan");
        }
    }

    public void moveChannel(int channel){
        if (channel > saluran.length) {
            System.out.println("tidak ditemukan");
        }else {
            System.out.println("berpindah saluran "+saluran[channel-1]);
        }
    }
    public void turnUpSound(int plus){
        System.out.println("volume bertambah "+plus);
    }
    public void turnDownSound(int less){
        System.out.println("volume bertambah "+less);
    }
}
