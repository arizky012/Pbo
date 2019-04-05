import java.util.Scanner;
class Main{
    static Scanner arzk = new Scanner(System.in);
    static int input;
    static KontrolTv tv = new Tv("Samsung");
    public static void main(String[]args){
        Boolean power;
        
        System.out.println("Menu \n1. Tv ON\n2. Tv OFF\n");
        input = arzk.nextInt();
        switch(input){
            case 1 : power(true);subMenu();break;
            case 2 : power(false);break;
            default : System.out.println("not valid");
        }
    }
    static void power(boolean p){
        tv.tvOn(p);
        tv.showMerk();
    }
    static void subMenu(){
        System.out.println("MENU");
            System.out.println("1. Move Channeel\n2. Volume Up\n3. Volume Down");
            switch(arzk.nextInt()){
                case 1 : 
                System.out.print("input : ");
                tv.moveChannel(arzk.nextInt());break;
                case 2 : 
                System.out.print("input : ");
                tv.turnUpSound(arzk.nextInt());break;
                case 3 : 
                System.out.print("input : ");
                tv.turnDownSound(arzk.nextInt());break;
                default : System.out.println("not valid");break;
            }
    }
}
