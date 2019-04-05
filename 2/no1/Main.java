import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("width = ");
        double width = input.nextDouble();
        System.out.print("height = ");
        double height = input.nextDouble();
        System.out.print("depth = ");
        double depth = input.nextDouble();
        System.out.print("mass = ");
        double mass = input.nextDouble();
        Box box = new Box(width,height,depth);
        input.close();
        
        box.setMass(mass);
        System.out.println("massa jenis = "+ box.getDensity());
        box.setMass(mass*2);
        System.out.println("massa jenis = "+ box.getDensity());
            
    }
}
