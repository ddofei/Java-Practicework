public class FindAllFactors {
    public static void main(String[] args) {
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);


    }
    private static void printFactors(int number){
        if (number<1) {
            System.out.println("negative numbers not allowed");
        }else{
            System.out.println("the factors of " + number + " are ");
            for (int i=1; i<=number; i++){
                if (number%i==0){
                    System.out.println(i);
                }
            }

        }

    }
}
