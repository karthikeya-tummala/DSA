class Solution {
    public int lastRemaining(int n) {
        if (n == 0 || n == 1) return n;
        boolean leftToRight = true;
        int head = 1;
        long diff = 1;
        while(n > 1) {
            if (leftToRight) {
                head += diff;
            }
            else {
                if (n % 2 != 0) {
                    head += diff;
                }
            }
            diff *= 2;
            n /= 2;
            leftToRight = !leftToRight;
        }
        return head;
    }
}