public class CheckLastDigit {
    public static void main(String[] args) {
        System.out.println(LastDigitChecker(41,22,71));
        System.out.println(LastDigitChecker(23,32,42));
        System.out.println(LastDigitChecker(9,99,999));

    }
    private static boolean LastDigitChecker(int firstNum, int secondNum, int thirdNum){
        boolean z=(firstNum>=10 && firstNum<=1000 && secondNum>=10 && secondNum<=1000);
        int a =firstNum % 10;
        int b =secondNum % 10;
        int c =thirdNum % 10;

        if (z && ((a==b) || (a==c)|| (b==c))){
            return true;
        }

        return false;
    }

}
