public class AlternatingCharacters {
/**
 * if you are given a string containing A and B only , then find out the number of deletions require to make that no adjcent matching characters
 * for example
 * AABAAB -> remove A at 0 and 3 will make ABAB with no adjacent  matching characters,
 * we need to do 2 deletions , then the answer is 2
 */

public static void main(String[] args) {
    String str = "AABAABB";
    int numOfDel = 0;
    for (int i=0; i<str.length()-1; i++){
        if(str.charAt(i) == str.charAt(i+1)){
            numOfDel++;
        }
    }
    System.out.println(numOfDel);

}

}
