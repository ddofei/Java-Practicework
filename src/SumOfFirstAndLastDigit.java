public class SumOfFirstAndLastDigit {
    public static void main(String[] args) {
        sumFirstAndLastDigit(252);
        sumFirstAndLastDigit(257);
        sumFirstAndLastDigit(0);
        sumFirstAndLastDigit(5);
        sumFirstAndLastDigit(-10);


    }
    private static void sumFirstAndLastDigit(int number){
        int lastdigit =0;
        int num=0;
        int count =0;
        if (number<0){
            System.out.println("invalid number, enter only positive numbers");
        }
        else if (number<10){
            System.out.println("sum of the first and last digit is " + (number + number));

        }
        else {
            while (number!=0){
                count++;
                int digit = number%10;
                num=number;//keeps the number before the division goes to zero, thats our first number
                number = number/10;
                if (count==1){
                    lastdigit = lastdigit + digit; //keeps the las digit down in memory
                }
            }
            System.out.println("the sum of the first and last digit is " + (lastdigit+num)); //sum of first and last number

        }



    }
}
