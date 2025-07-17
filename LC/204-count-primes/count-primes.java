class Solution {
    public int countPrimes(int n) {
        if (n <= 2) return 0;
        boolean[] sieve = new boolean[n];
        Arrays.fill(sieve, true);
        sieve[0] = false;
        sieve[1] = false;
        
        for (int p = 2; p * p < n; p++) {
            if (sieve[p]) {
                for (int i = p * p; i < n; i += p) {
                    sieve[i] = false; 
                }
            }
        }
        int count = 0; 
        for (int i = 2; i < n; i++) {
            if(sieve[i]) count++;
        }
        return count;
    }
}