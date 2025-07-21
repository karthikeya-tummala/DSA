class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a,b) -> b[1] - a[1]);
        int total = 0;
        for (int i = 0; i < boxTypes.length; i++) {
            int boxes = boxTypes[i][0];
            int unitsPerBox = boxTypes[i][1];
            if (truckSize > 0) {
                int take = Math.min(truckSize, boxes);
                total += take * unitsPerBox;
                truckSize -= take;
            }
            else {
                break;
            }
        }
        return total;
    }
}