import java.util.ArrayList;
import java.util.List;

public class MaxSumPresentInSubArray {
    //Given ANY array find the maximum sum present in a sub-array within the array

        // Some sample test cases
// i)    int[] a = {-10, 2, 3, -2, 0, 5, -15};
// ii)   int[] a = {-10, 12, 3, -2, -100, 112, 0, 5, -15};
// iii)  int[] a = {+10, 12, 34, -2, -100, 10, 0, 20, -15};

// Desired outputs
// i)       max_sum: 8
// ii)     max_sum: 117
// iii)    max_sum: 56

// If time permits, also print the starting and ending position
// i)       max_sum: 8, start: 1, end: 5
// ii)     max_sum: 117, start: 5, end: 7
// iii)    max_sum: 56, start: 0, end: 2

    public static void main(String[] args) {
        List<Integer> nums = List.of(-10, 12, 3, -2, -100, 112, 0, 5, -15);
        System.out.println(solution(nums));
    }

    private static List<Integer> solution(List<Integer> nums) {
        int biggestSumSoFar = Integer.MIN_VALUE;
        List<Integer> biggestSubListSoFar = new ArrayList<>();
        for (int left = 0; left < nums.size(); left++) {
            for (int right = left + 1; right < nums.size(); right++) {
                List<Integer> currentSubList = subListSum(nums, left, right);
                int currentSum = sum(currentSubList);
                if (currentSum > biggestSumSoFar) {
                    biggestSumSoFar = currentSum;
                    biggestSubListSoFar = currentSubList;
                }
            }
        }
        return biggestSubListSoFar;
    }

    private static List<Integer> subListSum(final List<Integer> nums, final int left, final int right)
    {
      /*  final List<Integer> sublist = new ArrayList<>();
        for (int i = left; i < right; i++)
        {
            sublist.add(nums.get(i));
        }
        return sublist;*/
        return nums.subList(left,right);
    }

    private static int sum(List<Integer> arr) {
        int sum = 0;
        for(int a : arr){
            sum += a;
        }
        return sum;
    }


}
