package Array;

import java.util.Arrays;

// simple java code for return an array contains product of all other elements except self element
public class ProductOfNeighborElement {

	public static int[] product(int[] nums) {
		if(nums == null || nums.length <= 0)
			return new int[] {0};
		
		int n = nums.length;
		int[] result = new int[n];
		result[0] = 1;
		for(int i=1; i<n; i++) {
			result[i] = result[i-1] * nums[i-1];
		}
		
		int product = 1;
		for(int i=n-1; i>=0; i--) {
			result[i] = result[i] * product;
			product = product * nums[i];
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		System.out.println(Arrays.toString(product(arr)));
	}
}
