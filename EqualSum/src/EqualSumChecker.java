public class EqualSumChecker {
    public static void main(String[] args) {
        System.out.println(
        hasEqualSum(10,5,15));
    }
    public static boolean hasEqualSum(int a, int b ,int c){
        if(a+b==c){
            return true;
        }
        return false;
    }
}
