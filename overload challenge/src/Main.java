public class Main {
    public static void main(String[] args) {
double centimeters=convertToCentimeters(68);
System.out.println("68in = " + centimeters +"cm");
double centimeter=convertToCentimeters(5,8);
System.out.println("5ft, 8in = " +centimeter + "cm");
    }
    public static double convertToCentimeters(int inches){
        double centimeters;
        centimeters=inches*2.54;
        return centimeters;
    }
    public static double convertToCentimeters(int foot,int inches){
//double centimeter;
//centimeter= ((foot*12)+inches)*2.54;
return convertToCentimeters((foot*12)+inches);
    }
}