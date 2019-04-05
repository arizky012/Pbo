class Player{
    private String name;
    private int hp, atk, def, crit;

    public Player (String name, int def, int atk,int crit){
        this.name = name;
        this.def = def;
        this.atk = atk;
        this.crit = crit;
        hp = 100;
    }
    public void takeDamage(Player enemy){
        hp -=(enemy.getAttackPower()- def);
    }
    public void status(){
        System.out.println(name + " status");
        System.out.println("Hp = " + hp);
        System.out.println("Defence = "+ def);
        System.out.println("Attack = " +atk );
        System.out.println("Critical = " +crit+"%");
    }
    public int getAttackPower(){
        int power = atk+((atk*crit)/100);
        return power;
    }
}
