public class ValidPalindrome{
    public boolean isPalindrome(String s) {
        char[] arr = new char[s.length()];
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (Character.isLetterOrDigit(ch)) {
                arr[index++] = Character.toLowerCase(ch);
            }
        }
        int st = 0;
        int end = index - 1;
        Boolean isPal = true;
        while (st <= end) {
            if (arr[st] != arr[end]) {
                isPal = false;
                break;
            } else {
                st++;
                end--;
            }
        }
        if (isPal) {
            return true;
        } else {
            return false;
        }
    }
} {
    
}
