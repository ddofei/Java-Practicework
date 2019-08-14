public class TeenNumberChecker {
    public static boolean hasTeen(int firstnum, int secondnum, int thirdnum){
        if ((firstnum>=13 && firstnum<=19) || (secondnum>=13 && firstnum<=19 ) || (thirdnum>=13 && firstnum<=19)) {
            return true;
        }else{
            return false;
        }
    }
}
