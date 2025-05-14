/*
Given an array of integers nums and an integer target, return *indices of the two numbers such that they add up to target.
You may assume that each input would have **exactly* one solution, and you may not use the same element twice.
You can return the answer in any order.
 
Example 1:**

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 
Constraints:
* 2 <= nums.length <= 104
* -109 <= nums[i] <= 109
* -109 <= target <= 109
* Only one valid answer exists.
*/

import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Create a hash map to store the value and its index
        Map<Integer, Integer> numMap = new HashMap<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            // Check if the complement exists in the hash map
            if (numMap.containsKey(complement)) {
                // If found, return the indices of the current number and its complement
                return new int[] {numMap.get(complement), i};
            }
            
            // Add the current number and its index to the hash map
            numMap.put(nums[i], i);
        }
        
        // If no solution is found, return an empty array
        // This should not happen based on the problem constraints
        return new int[0];
    }
    
    // Test the solution with the examples
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example 1: nums = [2,7,11,15], target = 9
        int[] result1 = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        System.out.println("Example 1: " + Arrays.toString(result1));
        
        // Example 2: nums = [3,2,4], target = 6
        int[] result2 = solution.twoSum(new int[]{3, 2, 4}, 6);
        System.out.println("Example 2: " + Arrays.toString(result2));
        
        // Example 3: nums = [3,3], target = 6
        int[] result3 = solution.twoSum(new int[]{3, 3}, 6);
        System.out.println("Example 3: " + Arrays.toString(result3));
    }
}