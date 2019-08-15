public class CheckNumberPalindrome {
    public static void main(String[] args) {
        isPalindrome(125);
        isPalindrome(707);
        isPalindrome(529);
        isPalindrome(-1221);
        isPalindrome(-805);


    }

    private static void isPalindrome(int number){
        int num= number; //just reassigning number  to another variable so that i dont overwrite it since i want to include it as part of my output statement
        int reverse= 0;
        while (num!=0){//if u want just positive numbers let condition be Number>0
            reverse=reverse*10;
            reverse=reverse +num%10;
            num= num/10;
        }
        System.out.println("the reverse of the number " + number +  " is " + reverse);
        if (reverse==number) {
            System.out.println("it is palindrome");
        }else{
            System.out.println("it is not a palindrome");
        }

    }

}
