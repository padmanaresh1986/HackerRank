public class SubstringComparisions {
    /**
     * Lexicographical order also known as alphabetic dictionary order
     * A<B<C...X<Y<Y<a<b...x<y<z
     * Eg: ball<cat , dog<dorm, Happy<happy ,Zoo<ball
     * given a string s and length of substring k findout lexicographically samllest and largest substrings
     *
     */

    public static void main(String[] args) {
        String s = "welcometojava";
        int k = 3;
        String currentSubstring = s.substring(0,k);
        String smallest = currentSubstring;
        String largest = currentSubstring;

        for (int i = 0; i <= s.length() -k ; i++) {
            currentSubstring = s.substring(i,i+k);
            if(currentSubstring.compareTo(smallest) < 0){
                smallest = currentSubstring;
            }
            if(currentSubstring.compareTo(largest) > 0){
                largest = currentSubstring;
            }

        }
        System.out.println(smallest);
        System.out.println(largest);

    }
}
