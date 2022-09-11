import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoStrings {
    /**
     * given the two strings , determine if they share common substring.
     * a substring may be as small as one character
     * for example "a", "art", "and" common substring is "a"
     * "be",  "cat" does not share a common substring
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first string");
        String s1 = scanner.next();
        System.out.println("Enter the second String");
        String s2 = scanner.next();

        Boolean b = hasCommonSubstring1(s1,s2);
        System.out.println(b);

    }

    private static Boolean hasCommonSubstring(String s1, String s2) {
        Set<String> s1_set = Arrays.<String>stream(s1.split("")).collect(Collectors.toSet());
        Set<String> s2_set = Arrays.<String>stream(s2.split("")).collect(Collectors.toSet());
        Set<String> s3_set = s1_set.stream().filter(s2_set::contains).collect(Collectors.toSet());
        if(s3_set.isEmpty()){
            return false;
        }
        return true;
    }

    private static Boolean hasCommonSubstring1(String s1, String s2) {
        Set<String> s1_set = Arrays.<String>stream(s1.split("")).collect(Collectors.toSet());
        Set<String> s2_set = Arrays.<String>stream(s2.split("")).collect(Collectors.toSet());
       s1_set.retainAll(s2_set);
        if(!s1_set.isEmpty()){
            return true;
        }
        return false;
    }
}
