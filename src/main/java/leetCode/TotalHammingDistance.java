package leetCode;

public class TotalHammingDistance {

    /**
     * 参考: http://www.cnblogs.com/grandyang/p/6208062.html
     * 4:     0 1 0 0
     * 14:    1 1 1 0
     * 2:     0 0 1 0
     * 1:     0 0 0 1
     * 我们先看最后一列，有三个0和一个1，那么它们之间相互的汉明距离就是3，即1和其他三个0分别的距离累加，
     * 然后在看第三列，累加汉明距离为4，因为每个1都会跟两个0产生两个汉明距离，同理第二列也是4，第一列是3。
     * 我们仔细观察累计汉明距离和0跟1的个数，我们可以发现其实就是0的个数乘以1的个数，发现了这个重要的规律，
     * 那么整道题就迎刃而解了，只要统计出每一位的1的个数即可，参见代码如下：
     * @param nums
     * @return
     */
    public int totalHammingDistance(int[] nums) {
        int total = 0, n = nums.length;
        for (int j = 0; j < 32; j++) { // 整数32位, 切32次比较
            int bitCount = 0;
            for (int i = 0; i < n; i++) {
                int y = nums[i] >> j; // 相当于整个数组切掉最右边一列 ,从最右边按列计算
                int b = y & 1; // 当前位为1 的则计数
                bitCount += b;
            }
            total += bitCount * (n - bitCount); // 1的个数 * 0的个数, 当前列汉明距离
        }
        return total;
    }

    public static void main(String[] args) {
        int[] nums = {4, 14, 2, 1};
        System.out.println(new TotalHammingDistance().totalHammingDistance(nums));
    }
}
