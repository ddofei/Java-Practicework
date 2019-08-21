public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(reverse(123));
        System.out.println(reverse(145));
        System.out.println(reverse(823));


    }

    public static int reverse(int number){
        int reversedNumber = 0;
        while (number != 0){// number = 123   12   1
            int lastDigit = number % 10; // lastDigit = 3  2  1
            reversedNumber *= 10; // reversedNumber = 0 30  320
            reversedNumber += lastDigit; // reversedNumber = 3 32  321
            number /= 10; // number = 12  0
        }
        return reversedNumber;
    }


}
