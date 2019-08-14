public class MegabytesConverter {
    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if (kiloBytes<0) {
            System.out.println("the text is invalid");

        }else{

            int megaByte=kiloBytes/1024;
            int remainderKiloByte= kiloBytes%1024;
            System.out.println(kiloBytes + " KB = " + megaByte + " MB and " + remainderKiloByte + " KB");

        }
    }
}
