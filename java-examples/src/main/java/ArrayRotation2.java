import java.util.Arrays;

public class ArrayRotation2 {
/**
 * A left rotation operation on an array shifts the element from left to right
 * for example if two left rotations performed on an array [1,2,3,4,5] then it becomes [3,4,5,1,2]
 *
 * given an array a qith integers n , d is number of rotations , print  the updated array.
 */

public static void main(String[] args) {
    int[] a = {1,2,3,4,5};
    int d = 2;
    rotateLeft(a,d);
    Arrays.stream( a).forEach(System.out::print);
}

    private static void rotateLeft(int[] a, int d) {
        for (int i =0; i<d;i++){
            rotate(a);
        }
    }

    private static void rotate(int[] a) {
        int i,temp;
        temp = a[0];
        for (i=0;i<a.length-1;i++){
           a[i] = a[i+1];
        }
        a[i] = temp;
    }

}
