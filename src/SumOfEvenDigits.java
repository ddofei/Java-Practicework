public class SumOfEvenDigits {
    public static void main(String[] args) {
        getEvenDigitSum(252);
        getEvenDigitSum(123456789);
        getEvenDigitSum(-22);

    }

    private static void getEvenDigitSum(int number){
        int num;
        int sum=0;
        if (number<0){
            System.out.println("invalid number, enter a positive number");
        }else{
            while (number!=0){
                num = number%10; //gets the last number on write
                number = number/10; //dividing to discard last number
                if (num%2==0){
                    sum=sum+ num;
                }
            }
            System.out.println(sum);
        }



    }
}
