import java.util.Scanner;

public class JavaScannerEndOfFile {
/*
  read n number of input lines and print them with line numbers
  Example
  Input :  this is a java program

  Output:
1 this
2 is
3 a
4 java
5 program

 */
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int lineNum = 1;
    while(scanner.hasNext()){
        System.out.println(lineNum + " " +scanner.next());
        lineNum ++;
    }
}

}
