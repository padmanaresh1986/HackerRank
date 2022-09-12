public class StringPalindrome {

    /*
    A palindrome is a string which reads same from forward  nd backward
    Example : madam , eve ,..
   */

    public static void main(String[] args) {
        String s = "mada";
        isPalindrome1(s);
    }

    private static void isPalindrome(String s) {
        String s1 = new StringBuilder(s).reverse().toString();
        if(s.equals(s1)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }

    private static void isPalindrome1(String s) {
        int start = 0;
        int end = s.length()-1;

        while(start <= end){
            if(s.charAt(start) != s.charAt(end)){
                System.out.println("No");
                return;
            }
            start++;
            end--;
        }
        System.out.println("Yes");
    }

}
