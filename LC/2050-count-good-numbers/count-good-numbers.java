class Solution {
    public long power (long base, long exp, long mod) {
        long result = 1;
        base %= mod;

        while (exp > 0) {
            if ((exp & 1) == 1) result = (result * base) % mod;

            base = (base * base) % mod;
            exp >>= 1;
        }
        return result;
    }
    
    public int countGoodNumbers(long n) {
        long oddCount = n / 2;
        long evenCount = (n + 1) / 2;
        long MOD = 1_000_000_007;

        long pow5 = power(5, evenCount, MOD);
        long pow4 = power(4, oddCount, MOD);

        return (int)((pow5 * pow4) % MOD);

    }
}