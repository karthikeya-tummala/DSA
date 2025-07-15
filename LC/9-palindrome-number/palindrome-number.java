class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;
        int rev = 0;
        while (rev < x) {
            int digit = x % 10;
            rev = (rev * 10) + digit;
            x /= 10;
        }
        return x == rev || x == rev / 10;
    }
}