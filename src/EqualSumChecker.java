public class EqualSumChecker {
    public static boolean hasEqualSum(int firstnum, int secondnum, int thirdnum){
        int sumOfFirstTwo = firstnum + secondnum;
        if (sumOfFirstTwo==thirdnum) {
            return true;
        }else{
            return false;
        }
    }
}
