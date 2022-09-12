import java.util.ArrayList;
import java.util.List;

public class NumberOfNegativeSubArrays {
    /*
      sum of an array is sum of its total elements
      given an array [1,-2,4,-5,1], find number of negative sub arrays

[1, -2]
[1, -2, 4, -5]
[1, -2, 4, -5, 1]
[-2]
[-2, 4, -5]
[-2, 4, -5, 1]
[4, -5]
[-5]
[-5, 1]
Total = 9
     */

    public static void main(String[] args) {
        int[] arr = {1,-2,4,-5,1};
        int negative_arrays = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                 int current_sum = 0;
                List<Integer> list = new ArrayList<>();
                 for(int k = i; k<=j; k++){
                     list.add(arr[k]);
                     current_sum += arr[k];
                 }
                 if(current_sum < 0){
                     negative_arrays++;
                     System.out.println(list);
                 }
            }
        }
        System.out.println(negative_arrays);
    }
}
