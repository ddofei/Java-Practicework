public class CheckIfPerfectNumber {
    public static void main(String[] args) {
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));

    }
    //factors of 6 not including 6; 1,2,3 if u add them, u get 6 back so perfect number
    private static boolean isPerfectNumber(int number){
        int sum=0;
        if (number<1) {
            return false;
        }else if(number>1){
            for (int i=1; i<number; i++){
                if (number%i==0){
                    sum+=i;
                }
            }
           // if (sum==number) {
               // return true;
           // }else{
              //  return false;
           // }

        }
        return sum==number;

    }
}
