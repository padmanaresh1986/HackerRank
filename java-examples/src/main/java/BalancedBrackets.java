import java.util.Stack;

public class BalancedBrackets {
    /*
      bracket contains any of (,),{,},[,]
      tow brackets are matched when they have proper open and closed like (), {},[]
      not matched when (],{), {]..etc

      check if given brackets are balance or not

      Balanced Examples
      ({[]})

      not balanced examples
      {[(])}

     */

    public static void main(String[] args) {
        //String s = "{([]})";
        String s = "{[(])}";
        String result = isBalanced(s);
        System.out.println(result);
    }

    private static String isBalanced(String s) {
        Stack<String>  stack = new Stack<>();
        String[] chars = s.split("");
        for (String aChar : chars) {
            if(aChar.matches("[\\(|\\[|\\{]+")){ //push all opening brackets to stack {, (, [
                stack.push(aChar);
            }else{
                String popChar = stack.pop();
                if(aChar.equals(")") && !popChar.equals("(")){
                    return "No";
                }else if(aChar.equals("}") && !popChar.equals("{")){
                    return "No";
                }
                else if(aChar.equals("]") && !popChar.equals("[")){
                    return "No";
                }
            }
        }
        if(stack.isEmpty()){
            return "Yes";
        }else{
            return "No";
        }
    }
}
