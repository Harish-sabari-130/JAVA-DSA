public class PalindromicSubstr {
    public static void main(String[] args) {
        String str = "amanaman";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 2; j <= str.length(); j++) {
                String sub = str.substring(i, j);
                if (isPalindrome(sub)) {
                    System.out.println(sub);
                }
            }
        }
    }
    
    public static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}