import java.util.Arrays;
import java.util.Locale;

public class StringAnagrams {

    /**
     * Two strings a and b called anagrams when they have same characters with same frequencies
     * Anagrams of CAT are
     * CAT, ACT,TAC, TCA,ATC, and CTA
     *
     * considering a and b are case insensitve anagrams , print Anagrams otherwise Not Anagrams
     */

    public static void main(String[] args) {
        String a = "anagram";
        String b = "aganmar";

        //isAnagrams(a,b);
        isAnagrams1(a,b);
    }

    private static void isAnagrams(String a, String b) {
        if(a.length() != b.length()){
            System.out.println("Not Anagram");
            return;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();

        char[] a_arr = a.toCharArray();
        char[] b_arr = b.toCharArray();

        Arrays.sort(a_arr);
        Arrays.sort(b_arr);

        if(Arrays.equals(a_arr,b_arr)){
            System.out.println("Anagrams");
        }else{
            System.out.println("Not Anagrams");
        }
    }

    // this is preferred solutions
    private static void isAnagrams1(String a, String b) {
        if(a.length() != b.length()){
            System.out.println("Not Anagram");
            return;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();

        int[] char_array = new int[26];

        for (int i = 0; i < a.length(); i++) {
            int index = a.charAt(i) - 'a';
            char_array[index]++;
        }

        for (int i = 0; i < b.length(); i++) {
            int index = b.charAt(i) - 'a';
            char_array[index]--;
        }

        for (int i = 0; i < 26; i++) {
            if (char_array[i] != 0) {
                System.out.println("Not Anagrams");
                return;
            }
        }

        System.out.println("Anagrams");
    }
}
