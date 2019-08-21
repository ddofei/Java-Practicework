public class NumberToWords {
    public static void main(String[] args) {
        numberToWords(123);
        //System.out.println(reverseNumber(123));

    }
    private static int reverseNumber(int number){
        int reverse=0;
        while (number!=0){
            int lastDigit= number%10;
            reverse*=10;
            reverse=reverse+lastDigit;
            number/=10;

        }
        return reverse;

    }



    private static void numberToWords(int number){
        if (number<0) {
            System.out.println("invalid number");
        }else{
            number=reverseNumber(number);
            while (number>0){
                int remainder = number%10;
                number/=10;
                switch (remainder){
                    case 0:
                        System.out.println("zero");
                        break;
                    case 1:
                        System.out.println("one");
                        break;
                    case 2:
                        System.out.println("two");
                        break;
                    case 3:
                        System.out.println("three");
                        break;
                    case 4:
                        System.out.println("four");
                        break;
                    case 5:
                        System.out.println("five");
                        break;
                    case 6:
                        System.out.println("six");
                        break;
                    case 7:
                        System.out.println("seven");
                        break;
                    case 8:
                        System.out.println("eight");
                        break;
                    case 9:
                        System.out.println("nine");
                        break;

                }

        }




        }
    }
}
