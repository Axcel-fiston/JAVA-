public class Main {
    public static void main(String[] args) {
        boolean Car = true;
        int Love =800;
        int hate = 5;
        int high=100;
        int score = Love;

      int highscore=  Calculator(true,100,800,hate);
        System.out.println(" the high score is " +highscore);
System.out.println("the final high score is  " +
        Calculator(true,8,10000,200));
    }
    public static int Calculator( boolean car , int high, int love , int hate){
        int score =love;
        if(car){
            score += (hate* high);
            score +=1000;
        }
return score;
    }
}
