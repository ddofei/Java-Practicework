public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay){
        if (((barking) && (hourOfDay<8) && (hourOfDay>0)) || ((barking) && (hourOfDay>22) && (hourOfDay<=23))){ //adding time constraints to make sure we cant time is from 0-23
            return true;
        }else{
            return false;
        }
    }
}
