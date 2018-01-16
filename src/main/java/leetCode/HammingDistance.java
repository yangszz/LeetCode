package leetCode;

public class HammingDistance {

    /**
     * 1.x^y 找到不同的位 也就是需要改变的位数
     * 2.A-1 改变一位 除了2的幂 减一只会改变一位
     * 3.A&(A-1) 清除改变的位
     * 3.A=0 第一步找到的不用的位都改变了一次-> 返回计数
     * (2的幂的情况,2的幂二进制只有一个1其他为一定都是0,也就是说第一步找到不同的位只剩下了1位)
     *
     */
    public static int hammingDistance(int x, int y) {
        int distance = 0;
        int A = x ^ y;

        while (A != 0)
        {
            distance++;
            A &= A - 1;
        }

        return distance;
    }

    /**
     * 取巧办法
     * 1.找到不同的位
     * 2.转为字符串
     * 3.替换掉0,剩余字符串长度则为hammingDistance
     * @param x
     * @param y
     * @return
     */
    public int hammingDistanceStr(int x, int y) {
        int distance = 0;
        int A = x ^ y;
        String distStr = Integer.toString(A,2);

        return distStr.replace("0","").length();
    }

    public static void main(String[] args) {
        System.out.println(new HammingDistance().hammingDistance(113,128));
        //System.out.println(new HammingDistance().hammingDistanceStr(113,128));
    }
}
