public class Main {
    public static void main(String[] args) {
   int x= Integer.MAX_VALUE;
   System.out.println("the max is "+x);
   int y= Integer.MIN_VALUE;
   System.out.println("the min is "+y);

   System.out.println(" the range is " +x + " and "+ y);
   int z = 100;
   int a=200;
   if(z>100){
       System.out.println("you right");
   } else if (z==200) {
       System.out.println("you wrong");
   }

   else{
       System.out.println("cute");
       boolean game= true;
       int score=1000;
       Method(true,10000,200,800);
       z=500;
       a=1000;
       score=10;
       Method(game,z,a,score);
                score = 800;
       int finalScore = score;
               if(game== true){
                   finalScore+=(z*a);
                   System.out.println(" the score is " + finalScore);
               }

               score=1000;
               z=8;
               a=200;
               finalScore=score;
               if(game){
                   finalScore+=(z*a);
                   System.out.println(" the score is " + finalScore);
               }
   }
    }

    public static void Method(boolean game, int z, int a, int score) {
        int finalScore = score;
        if(game== true){
            finalScore+=(z*a);
            System.out.println(" the score is " + finalScore);
        }
    }
}