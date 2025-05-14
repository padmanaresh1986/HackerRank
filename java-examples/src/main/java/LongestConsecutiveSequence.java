/*Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.
You must write an algorithm that runs in O(n) time.

Example 1:
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.

Example 2:
Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
Example 3:

Input: nums = [1,0,1,2]
Output: 3

Constraints:
0 <= nums.length <= 105
-109 <= nums[i] <= 109 


To solve this problem in O(n) time, we can use a HashSet for constant-time lookups. The key idea is:
For each number, only try to build a sequence starting from that number if it does not have a predecessor (i.e., num - 1 is not in the set). This avoids unnecessary re-checks and ensures each sequence is checked only once.


*/

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num); // O(n)
        }

        int longestStreak = 0;

        for (int num : numSet) {
            // Only start sequence if num - 1 is not in the set
            if (!numSet.contains(num - 1)) {
                int currentNum = num;
                int currentStreak = 1;

                while (numSet.contains(currentNum + 1)) {
                    currentNum++;
                    currentStreak++;
                }

                longestStreak = Math.max(longestStreak, currentStreak);
            }
        }

        return longestStreak;
    }

    public static void main(String[] args) {
        LongestConsecutiveSequence solution = new LongestConsecutiveSequence();
        System.out.println(solution.longestConsecutive(new int[]{100, 4, 200, 1, 3, 2})); // Output: 4
        System.out.println(solution.longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1})); // Output: 9
        System.out.println(solution.longestConsecutive(new int[]{1, 0, 1, 2})); // Output: 3
    }
}
