
public class LongestPalindromeInGivenString {
	public static void main(String[] args) {
		LongestPalindromeInGivenString lp = new LongestPalindromeInGivenString();
		System.out.println("Longest Palindrome- " + lp.findLongestPalindrome("12321981189"));
		System.out.println("Longest Palindrome- " + lp.findLongestPalindrome("toppot"));
		System.out.println("Longest Palindrome- " + lp.findLongestPalindrome("101312321"));
		System.out.println("Longest Palindrome- " + lp.findLongestPalindrome("101311321"));
	}
	
	public String findLongestPalindrome(String str) {
		// starting point for comparison with other palindromes
		String longestPalindrome = str.substring(0, 1);
        for (int i = 0; i < str.length(); i = i+1) {  
            // odd length case (center is i)
            String newPalindrome = checkIfEqual(str, i, i);
            if (newPalindrome.length() > longestPalindrome.length()) {
            	longestPalindrome = newPalindrome;
            }
            // even length case (center is i, i+1)
            newPalindrome = checkIfEqual(str, i, i + 1);
            if (newPalindrome.length() > longestPalindrome.length()) {
            	longestPalindrome = newPalindrome;
            }
        }
	    
        return longestPalindrome;
	}
	
    public String checkIfEqual(String str, int begin, int end) {
        while ((begin >= 0 && end <= str.length() - 1) && (str.charAt(begin) == str.charAt(end))) {
            begin--;
            end++;
        }
        return str.substring(begin + 1, end);    
    }
}


