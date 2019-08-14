public class DetermineCatPlayTime {
    public static boolean isCatPlaying(boolean summer, int temperature){
        boolean a = temperature>=25 && temperature<=35;
        boolean b = temperature>=25 && temperature<=45;

        if (summer && b) {
            return true;
        }else if (!summer && a) {
            return true;
        }else{
            return false;
        }

    }
}
