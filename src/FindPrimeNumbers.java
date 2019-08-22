public class FindPrimeNumbers {
    public static void main(String[] args) {
        printOutPrime(10);

    }
    private static void printOutPrime(int num){//find prime number factors of the number given
        for (int i=1; i<num; i++){
            if (checkPrime(i)){
                System.out.println(i);
            }

        }

    }

    private static boolean checkPrime(int number){
        int count = 0;
        if (number<=1) {
            return false;
        }else{
            //TODO: recall the discussion on prime that the biggest unconjugated factor is smaller or equal to the square root
            // of the number, please consider revising the implementation logic 
            for (int i=2; (i<=number/2); i++){
                if (number%i ==0){
                    count++;
                    if (count==2){
                        break;
                    }
                    return false;
                }
            }
            return true;

        }

    }


}
