package leetCode;

public class TotalHammingDistance {

    /**
     * TODO 没懂...
     * @param nums
     * @return
     */
    public int totalHammingDistance(int[] nums) {
        int total = 0, n = nums.length;
        for (int j = 0; j < 32; j++) {
            int bitCount = 0;
            for (int i = 0; i < n; i++) {
                bitCount += (nums[i] >> j) & 1;
            }
            total += bitCount * (n - bitCount);
        }
        return total;
    }

    public static void main(String[] args) {
        int[] nums = {4, 14, 2};
        new TotalHammingDistance().totalHammingDistance(nums);
    }
}