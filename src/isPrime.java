public class isPrime {
    public static void main(String[] args) {
        System.out.println(checkPrime(21));
        System.out.println(checkPrime(17));
        System.out.println(checkPrime(-1));
        System.out.println(checkPrime(5));
        System.out.println(checkPrime(10));


    }
    private static boolean checkPrime(int number){
        int count =0;
        if (number<=1) {
            return false;
        }else{
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
