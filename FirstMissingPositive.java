/*41. First Missing Positive */

/*Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.

 

Example 1:

Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.
  */

  class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        Set<Integer> pos = new HashSet<>();
        for(int num : nums)
        {
            if(num > 0)
            {
                pos.add(num);
            }
        }
        int i = 1;
        while(true)
        {
            if(!pos.contains(i))
            {
                return i;
            }
            i++;
        }
    }
}