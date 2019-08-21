public class LargestPrimeNumber {
    public static void main(String[] args) {
        printOutLargestPrime(21);
        printOutLargestPrime(217);
        printOutLargestPrime(0);
        printOutLargestPrime(45);
        printOutLargestPrime(-1);

    }

    private static void printOutLargestPrime(int number){

        if (number<=1) {
            System.out.println("invalid entry");
        }else {
            int currentNum = 0;
            for (int i=2; (i<number); i++){
                if (number%i==0){
                    currentNum = i;
                }
            }
            System.out.println("Largest prime Number is " + currentNum);

        }


    }

}


