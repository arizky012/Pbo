import java.util.Scanner;
public class Main2{
    public static void main(String[] args) {
        Nilai arizki = new Nilai();
        Scanner in = new Scanner(System.in);
        System.out.print("input Nilai PBO : ");
        arizki.setPbo(in.nextInt());

        System.out.println("input Nilai RTI : ");
        // arizki.setRti(in.nextInt());

        System.out.print("input Nilai Mobile : ");
        arizki.setMobile(in.nextInt());

        System.out.println("Pbo     | "+ arizki.getPbo());
        System.out.println("RTI     | "+ arizki.getRti());
        System.out.println("Mobile  | "+ arizki.getMobile());
    }
}
