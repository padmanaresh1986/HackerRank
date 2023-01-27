import java.util.Arrays;

public class ArrayRotation {
/**
 * A left rotation operation on an array shifts the element from left to right
 * for example if two left rotations performed on an array [1,2,3,4,5] then it becomes [3,4,5,1,2]
 *
 * given an array a qith integers n , d is number of rotations , print  the updated array.
 */

public static void main(String[] args) {
    int[] a = {1,2,3,4,5};
    int d = 2;

    int size = a.length;
    int[] rotated_a = new int[size];
    int i = 0;
    int rotated_index = d;

    while( rotated_index < size){
        rotated_a[i] = a[rotated_index];
        i++;
        rotated_index++;
    }

    rotated_index = 0;
    while(rotated_index < d){
        rotated_a[i] = a[rotated_index];
        i++;
        rotated_index++;
    }

    Arrays.stream(rotated_a).forEach(System.out::print);
}

}
