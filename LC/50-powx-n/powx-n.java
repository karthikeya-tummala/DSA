class Solution {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        double res = 1;
        long N = Math.abs((long) n);
        while (N > 0) {
            if (N % 2 != 0) {
                res *= x;
            }
                x *= x;
                N /= 2;
        }
        if (n > 0) return res;
        return 1 / res;    
    }
}