public class Main {
    public static void main(String[] args) {
        long miles = SpeedConverter.toMilesPerHour(10.5);
        System.out.println("Miles calculated is " + miles);

        //calling second method
        SpeedConverter.printConversion(10.5);
    }
}
