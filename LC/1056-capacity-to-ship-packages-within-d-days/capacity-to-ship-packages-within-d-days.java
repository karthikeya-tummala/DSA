class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int minWeight = 0, maxWeight = 0;
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] > minWeight) minWeight = weights[i];
            maxWeight += weights[i];
        }

        while (minWeight < maxWeight) {
            int allowedWeight = minWeight + (maxWeight - minWeight) / 2;
            int ans = 1;
            int load = 0;
            
            for (int i = 0; i < weights.length; i++) {
                if (load + weights[i] > allowedWeight) {
                    ans++;
                    load = 0;
                }
                load += weights[i];
            }

            if (ans > days) minWeight = allowedWeight + 1;
            else maxWeight = allowedWeight;
        }
        return minWeight;
    }
}