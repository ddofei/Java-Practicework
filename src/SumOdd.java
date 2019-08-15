public class SumOdd {
    public static void main(String[] args) {
        sumOdd(1,100);
        sumOdd(-1, 100);
        sumOdd(100,100);
        sumOdd(13,13);
        sumOdd(100,-100);
        sumOdd(100,1000);

    }

    public static boolean isOdd(int number) {
        if ((number % 2 == 0) || (number <= 0)) {
            return false;
        } else {
            return true;
        }

    }

    private static void sumOdd(int start, int end) {
        int sum = 0;
        if ((start > 0) && (end > 0) && (start <= end)) {
            for (int i=start; i<=end && i>0; i++){
                if (isOdd(i)){
                    sum+=i;
                }
            }
            System.out.println("the sum is " + sum);



        }else{
            System.out.println("invalid range entered");
        }


    }
}
