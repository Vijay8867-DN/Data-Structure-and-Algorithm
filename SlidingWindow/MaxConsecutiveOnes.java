package SlidingWindow;
/*
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.

 

Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2*/
public class MaxConsecutiveOnes {

	public static int maxConsecutive(int[] nums) {
		int count = 0; 
		int maxCount = 0;
		for(int n : nums) {
			if(n == 1) {
				count++;
				maxCount = Math.max(maxCount, count);
			}else {
				count = 0;
			}
		}
		
		return maxCount;
	}
	public static void main(String[] args) {
		int[] arr = {1,1,0,1,1,1};
		System.out.println(maxConsecutive(arr));
	}
}
