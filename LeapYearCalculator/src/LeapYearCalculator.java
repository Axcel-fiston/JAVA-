public class LeapYearCalculator {
    public static void main(String[] args) {
    }
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year >= 9999 && (year % 400 == 0 && year % 100 == 0)) {
            return true;
//        } else if (year % 400 == 0 && year % 100 != 0) {
//            return true;
        } else return year % 100 == 0 && year % 400 == 0;
    }
}
