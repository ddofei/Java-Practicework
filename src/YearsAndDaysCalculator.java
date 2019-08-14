public class YearsAndDaysCalculator {
    public static void printYearsAndDays(long minutes){
        if (minutes<0) {
            System.out.println("invalid value");
        }else{
            long years = minutes/525600;
            long numberOfDays = (minutes%525600)/1440;

            System.out.println(minutes + " minutes converts to " + years + " years "  + numberOfDays + " days ");

        }
    }
}
