public class StringBasics {
    public static void main(String[] args) {
        //2 ways to create string, using literal and new
        String s = "goods";
        String grade = new String("A-Excellent");
        System.out.println(s);
        System.out.println(grade);

        //length of string
        System.out.println(s.length());
        System.out.println("geeks".length());

        //character at ith index
        System.out.println(s.charAt(3));
        System.out.println("geeks".charAt(2));

        //Substringing from an index to the end
        System.out.println(s.substring(2));
        System.out.println("geeks".substring(2));

        //Substringing from an index to another index
        System.out.println(s.substring(1,4));
        System.out.println("geeks".substring(1,3));

        //concatenate a specified string to the end of another string
        String s1 = "Excellent";
        String s2 = " Job";
        System.out.println(s1.concat(s2));

        //finding the index position of a character
        System.out.println(s1.indexOf("e"));
        System.out.println(s1.indexOf("cell"));

        //checking if two strings are the same
        boolean out = s1.equals(s2);
        System.out.println(out);
        //OR
        System.out.println(s1.equals(s2));



    }
}
