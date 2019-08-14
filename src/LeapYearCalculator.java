public class LeapYearCalculator {
    public static boolean isLeapYear(int year){
        boolean a=(year>0 && year<=9999) && ((year%4)==0);
        if (a && ((year%100)!=0) || a && (year%400)==0){
            return true;
        }
        return false;
    }

}


