public class Nilai{

    private int pbo, rti, mobile;
    private String nilai;

    public Nilai(){
        this.pbo = 0;
        this.rti = 0;
        this.mobile = 0;
        this.nilai = "E";
    }
    public Nilai (int pbo, int rti, int mobile){
        this.pbo = pbo;
        this.rti = rti;
        this.mobile = mobile;
    }
    public void setPbo(int pbo) {
        this.pbo = pbo;
    }
    public void setRti(int rti) {
        this.rti = rti;
    }
    public void setMobile(int mobile) {
        this.mobile = mobile;
    }
    public String getPbo() {
        if(pbo > 85 && pbo <= 100 ){
            nilai = "A";
        }
        else if(pbo > 80 && pbo <=85){
            nilai = "A-";
        }
        else if(pbo > 75 && pbo <=80 ){
            nilai = "B+";
        }
        else if(pbo > 70 && pbo <=75){
            nilai = "B";
        }
        else if(pbo > 65 && pbo <=70 ){
            nilai = "B-";
        }
        else if(pbo > 60 && pbo <=65){
            nilai = "C+";
        }
        else if(pbo > 50 && pbo <=60 ){
            nilai = "C";
        }
        else if(pbo >= 45 && pbo <=50){
            nilai = "D";
        }
        else{
            nilai = "E";
        }
        return nilai;
    }
    public String getMobile() {
        if(mobile > 85 && mobile  <= 100 ){
            nilai = "A";
        }
        else if(mobile  > 80 && mobile <=85){
            nilai = "A-";
        }
        else if(mobile > 75 && mobile  <=80 ){
            nilai = "B+";
        }
        else if(mobile  > 70 && mobile  <=75){
            nilai = "B";
        }
        else if(mobile  > 65 && mobile <=70 ){
            nilai = "B-";
        }
        else if(mobile  > 60 && mobile  <=65){
            nilai = "C+";
        }
        else if(mobile  > 50 && mobile  <=60 ){
            nilai = "C";
        }
        else if(mobile  >= 45 && mobile  <=50){
            nilai = "D";
        }
        else{
            nilai = "E";
        }
        return nilai;
    }
    public String getRti() {
        if(rti > 85 && rti <= 100 ){
            nilai = "A";
        }
        else if(rti > 80 && rti <=85){
            nilai = "A-";
        }
        else if(rti > 75 && rti <=80 ){
            nilai = "B+";
        }
        else if(rti > 70 && rti <=75){
            nilai = "B";
        }
        else if(rti > 65 && rti <=70 ){
            nilai = "B-";
        }
        else if(rti > 60 && rti <=65){
            nilai = "C+";
        }
        else if(rti > 50 && rti <=60 ){
            nilai = "C";
        }
        else if(rti >= 45 && rti <=50){
            nilai = "D";
        }
        else{
            nilai = "E";
        }
        return nilai;
    }

}
