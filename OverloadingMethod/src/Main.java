public class Main {
    public static void main(String[] args) {
System.out.println("New score is"+Overload("Tim",500));
        System.out.println("New score is"+Overload(10));
    }

    public static int Overload(String playerName, int score) {
        System.out.println(" Player " + playerName + " scored " + score + " points ");
        return score * 1000;
    }

    public static int Overload(int score) {

        return Overload("Anonymous",score);

    }
    public static int Overload(){
        System.out.println("No player name, no player score");
        return 0;
    }
}