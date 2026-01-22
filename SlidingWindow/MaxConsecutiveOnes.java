package SlidingWindow;

public class MaxConsecutiveOnes {

	public static int maxConsecutive(int[] nums) {
		int count = 0; 
		int maxCount = 0;
		for(int n : nums) {
			if(n == 1) {
				count++;
			}else {
				count = 0;
			}
		}
		
		maxCount = Math.max(maxCount, count);
		
		return maxCount;
	}
	public static void main(String[] args) {
		int[] arr = {1,1,0,1,1,1};
		System.out.println(maxConsecutive(arr));
	}
}
