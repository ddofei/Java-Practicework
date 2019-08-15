public class SumOfDigits {
    public static void main(String[] args) {
        sumDigits(125);
        sumDigits(-125);
        sumDigits(4);
        sumDigits(32123);

    }
    public static void sumDigits(int number){
        if (number<10) {
            System.out.println("not applicable since just one digit or negative");
        }else{
            int sum=0;
            while (number>0){
                int digit= number%10; //extracts last digit
                sum+=digit; //adds the last digit to the sum
                number/=10; //dividing the number by 10 gets rid of the last number and then we start the process again at beginning of while loop for it
                            //we continue until we get 0, that means all possible digits exhausted

            }
            System.out.println("the sum of the digits is " + sum);

        }


    }
}
