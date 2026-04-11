package String;

public class LongestSubString {

	public static void longestSubstring(String str) {
		int maxCount = 0;
		String longest = "";
		String curString = "";
		
		for(char c : str.toCharArray()) {
			if(curString.indexOf(c) != -1) {
				curString = curString.substring(curString.indexOf(c));
			}
			curString += c;
		    if(curString.length() > longest.length()) {
		    	longest = curString;
		    	maxCount = longest.length();
		    }
		   		
		}
		System.out.println(longest+" "+maxCount);
	}
	
	public static void main(String[] args) {
		longestSubstring("abcabce");
	}
}
