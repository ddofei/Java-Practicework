public class ConvertMinuteAndSeconds {
    public static void getDurationString(int minutes, int seconds){
        if ((minutes<0) || (seconds<0 && seconds>59) ) {
            System.out.println("invalid number");
        }else{
            int totalHours=minutes/60;
            int totalMinutesLeft=minutes%60;
            System.out.println("This converts to " + totalHours + " Hours "+ totalMinutesLeft + " Minutes "+ seconds + " seconds ");
        }
    }
    //2ND overloaded method with only seconds parameter
    public static void getDurationString(int seconds){
        if (seconds<0) {
            System.out.println("invalid number");
        }else{
            int minute = seconds/60;
            int secondsLeft= seconds%60;
            getDurationString(minute,secondsLeft);
        }
    }
}
