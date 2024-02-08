public class Challenge {
    public static void main(String[] args) {
        int bonus=Fiston(500);
        Axcel("Tim",bonus);
        bonus=Fiston(1000);
        Axcel("hey",bonus);
         bonus=Fiston(1500);
        Axcel("hello",bonus);
         bonus=Fiston(50);
        Axcel("how",bonus);
         bonus=Fiston(150);
        Axcel("lee",bonus);
         bonus=Fiston(5000);
        Axcel("leo",bonus);

    }
    public static void Axcel(String playerName, int score){
        System.out.println(playerName+" managed to get " + score+ " of the high score list");
    }
    public static  int Fiston( int bonus){
int position =0;
        if(bonus>=1000){
            position= 1;
        } else if (bonus>=500) {
           position=  2;
        } else if (bonus<100) {
            position= 3;
        }
        return position;
    }
}