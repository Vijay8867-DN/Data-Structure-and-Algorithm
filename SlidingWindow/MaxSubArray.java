package SlidingWindow;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxSubArray {

	public static int[] subArray(int[] nums) {
		if(nums == null || nums.length <= 0) {
			return new int[] {0};
		}
		
		int maxSum = nums[0];
		int currentSum = nums[0];
		int start = 0, end = 0, tempStart = 0;
		
		for(int i=1; i<nums.length; i++) {
			if(currentSum + nums[i] > nums[i]) {
				currentSum += nums[i];
			}else {
				currentSum = nums[i];
				tempStart = i;
			}
			
			if(currentSum > maxSum) {
				maxSum = currentSum;
				start = tempStart;
				end = i;
			}
		}
		
		int[] result = new int[end - start + 1];
//		System.arraycopy(nums, start, result, 0, end-start+1);
		int k=0;
		for(int j=start; j<=end; j++) {
			result[k++] = nums[j];
		}
		System.out.println(maxSum);
		return result;
	}
	public static void main(String[] args) {
		int[] arr = {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(Arrays.toString(subArray(arr)));
	}
}
