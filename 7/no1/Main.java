import java.util.Scanner;
class Main extends Thread{
    public void run(){
        System.out.printf("Thread #%s sedang berjalan  = %b \n",getName(),isAlive());
    }
    public static void main(String[] args) {
        Scanner arzk = new Scanner(System.in);
        System.out.println("masukkan jumlah thread = ");
        int n = arzk.nextInt();
        int i = 0;
        arzk.close();
        while(i<n){
            Main [] thread = new Main [n];
            thread[i] = new Main();
            thread[i].setName(Integer.toString(i+1));
            thread[i].start();
           try {
               Thread.sleep(100);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
            i++;
        }
    }

}
