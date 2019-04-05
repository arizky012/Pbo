class Main{
    public static void main(String[] args) {
        String [] name = {"Mino", "Hilda"};
        int [] def = {15,15};
        int [] atk = {30,35};
        int [] crit = {10,50};

        Player player1 = new Player( name[0],def[0],atk[0],crit[0]);
        Player player2 = new Player( name[1],def[1],atk[1],crit[1]);
        player1.takeDamage(player2);
        player2.takeDamage(player1);
        player1.status();
        player2.status();
    }
}
