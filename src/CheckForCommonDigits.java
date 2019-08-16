public class CheckForCommonDigits {
    public static void main(String[] args) {
        hasSharedDigit(12,23);
        hasSharedDigit(9,99);
        hasSharedDigit(15,55);

    }

    private static void hasSharedDigit(int firstNum, int secondNum){
        boolean a = firstNum > 10 && firstNum < 99 && secondNum > 10 && secondNum < 99; //just want numbers between 10 and 99)
        if (!a){
            System.out.println("number not in a valid range");


        } else {
            boolean isSharedDigit = false;
            while (firstNum>0){
                int num2=secondNum;
                int num1ForComparison = firstNum%10;
                while (num2>0){
                    int num2ForComparison=num2%10;
                    if (num1ForComparison==num2ForComparison){
                        isSharedDigit=true;

                    }
                    num2/=10;


                }
                firstNum/=10;
            }
            System.out.println(isSharedDigit);
        }



    }


}
