public class DecimalComparator {
    public static void main(String[] args) {
        System.out.println(
areEqualByThreeDecimalPlaces(2.561,3.565));
    }
    public static boolean areEqualByThreeDecimalPlaces(double x ,double y){
        int a= (int) (x * 1000);
        int b= (int) (y*1000);
        if (a-b==0){
            return true;
        }
        return false;
    }
}
