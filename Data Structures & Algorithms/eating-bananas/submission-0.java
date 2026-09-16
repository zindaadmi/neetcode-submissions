class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Arrays.stream(piles).max().getAsInt();
        int ans = right;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (canEatAll(piles, h, mid)) {
                ans = mid;
                right = mid - 1; // try to find smaller k
            } else {
                left = mid + 1; // need faster speed
            }
        }
        return ans;
    }

    private boolean canEatAll(int[] piles, int h, int k) {
        long hours = 0;
        for (int pile : piles) {
            hours += (pile + k - 1) / k; // Ceil without using floating point
        }
        return hours <= h;
    }
}
