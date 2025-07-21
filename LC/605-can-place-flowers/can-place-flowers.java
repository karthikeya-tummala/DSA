class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length;
        if (n > (len+1)/2) return false;

        if (len >= 1 && flowerbed[0] == 0 && (len == 1 || flowerbed[1] == 0)) {
            flowerbed[0] = 1;
            n--;
            if (n == 0) return true;
        }

        for (int i = 1; i < len - 1; i++) {
            if (flowerbed[i] == 0 &&
            flowerbed[i - 1] == 0 &&
            flowerbed[i + 1] == 0) {
                flowerbed[i] = 1;
                n--;
            }

            if (n == 0) return true;
        }

        if (len >= 2 && flowerbed[len - 1] == 0 && flowerbed[len - 2] == 0) {
            flowerbed[len - 1] = 1;
            n--;
            if (n == 0) return true;
        }

        if (n > 0) return false;
        return true;
    }
}