public class FlourPackProblem {
    public static void main(String[] args) {
        System.out.println(canPack(1,0,4));
        System.out.println(canPack(1,0,5));//canPack(1,0,5);
        System.out.println(canPack(0,5,4));
        System.out.println(canPack(2,2,11));
        System.out.println(canPack(-3,2,12));




    }
    public static boolean canPack(int bigCount, int smallCount, int goal) {

        int total = (bigCount * 5) + smallCount;



        if (total >= goal && goal > 0) {

            if ((total >= goal) && (goal % 5 <= smallCount)) {

                return true;

            } else {

                return false;

            }

        } else {

            return false;

        }

    }




}
