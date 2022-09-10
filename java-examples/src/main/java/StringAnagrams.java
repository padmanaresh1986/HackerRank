public class StringAnagrams {
    /**
     * two string are considered anagrams if they contain same characters with same number of frequency
     * dcbac is anagram for bacdc
     * bacdc is not anagram dcbad
     *
     * given  two string a, b may and may not be same length , determine the minimum number of character deletion required
     * to make a and b anagrams
     *
     * for example
     * if a = cde and b = dcf  we can string e from string a and f from string b so that remaining string cd and dc are anagrams
     */

    public static void main(String[] args) {
        String a = "cde";
        String b = "def";
        int minDeletions = 0;

        int[] a_frequencies = new int[26];
        int[] b_frequencies = new int[26];

        for (int i = 0; i < a.length(); i++) {
            char current_char = a.charAt(i);
            int char_to_int =  (int) current_char; // gives position from 97 for small alphabets
            int position = char_to_int - (int)'a'; // this will fit values form 0 to 26
            a_frequencies[position]++;
        }


        for (int i = 0; i < b.length(); i++) {
            char current_char = b.charAt(i);
            int char_to_int =  (int) current_char; // gives position from 97 for small alphabets
            int position = char_to_int - (int)'a'; // this will fit values form 0 to 26
            b_frequencies[position]++;
        }

        for (int i = 0; i < 26; i++) {
            minDeletions += Math.abs(a_frequencies[i] - b_frequencies[i]);
        }
        System.out.println(minDeletions);

    }


}
