public class CheckForGCD {
    public static void main(String[] args) {
        getGreatestCommonDivisor(25,15);
        getGreatestCommonDivisor(12,30);
        getGreatestCommonDivisor(9,18);
        getGreatestCommonDivisor(81,153);

    }

    private static void getGreatestCommonDivisor(int a, int b){
        boolean c = (a>=10) && (b>=10); //want to test numbers between 10 and above
        if(!c) {
            System.out.println("invalid");
        }else{
            int commonFactor=0;
            int maxNum = Math.max(a,b);
            for (int i=1; i<=maxNum; i++){
                if((a%i==0)&&(b%i==0)){
                    commonFactor=i;
                }
            }

            System.out.println("the GCF of " + a + " and " + b + " is " + commonFactor);

        }

    }

}
