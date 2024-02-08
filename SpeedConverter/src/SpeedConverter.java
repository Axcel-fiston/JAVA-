public class SpeedConverter {
    public static void main(String[] args) {
       SpeedConverter.printConversion(1.5);
       SpeedConverter.printConversion(10.25);
       SpeedConverter.printConversion(-5.6);
       SpeedConverter.printConversion(25.42);
       SpeedConverter.printConversion(75.114);
        }
    public static long toMilesPerHour(double kilometersPerHour){
        return kilometersPerHour < 0 ? -1 : Math.round(kilometersPerHour / 1.609);
    }
    public static void printConversion(double KilometersPerhour){
        long milesPerHour = toMilesPerHour(KilometersPerhour);
        if (KilometersPerhour<0){
            System.out.println("Invalid Value");
       }     else {
           System.out.println(KilometersPerhour +"km/h = " + milesPerHour+ "mi/h");
       }
    }
}

