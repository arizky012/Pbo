import java.util.Scanner;
class Main implements Runnable{

    static long myTotal = 0;
    static Scanner arzk = new Scanner(System.in);
    static int t = arzk.nextInt();
    
    @Override
    public void run() {
        for(int i=0;i<(t/1000)/2;i++){
            try {
                Thread.sleep(2000);
                myTotal+=1;
            } catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }
    public static void main(String[] args) {
        Main thread = new Main();
        Thread thA = new Thread(thread);
        thA.start();
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i=0;i<t/1000;i++){
            try {
                Thread.sleep(1000);
                System.out.println(myTotal);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
