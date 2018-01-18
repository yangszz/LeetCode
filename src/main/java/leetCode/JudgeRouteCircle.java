package leetCode;

@SuppressWarnings("")
public class JudgeRouteCircle {
    /**
     * 1 not clean
     * 自己想到循环, 本题讨论区也都是一样的解法
     * @param moves
     * @return
     */
    public boolean judgeCircle(String moves) {
        int X = 0, Y = 0;
        char[] moveArr = moves.toCharArray();
        for (int i = 0; i < moveArr.length; i++) {
            String move = String.valueOf(moveArr[i]);
            if ("U".equals(move)) {
                Y += 1;
            } else if ("D".equals(move)) {
                Y -= 1;
            } else if ("L".equals(move)) {
                X -= 1;
            } else if ("R".equals(move)) {
                X += 1;
            }
        }
        return X == 0 && Y == 0;
    }

    public static void main(String[] args) {
        System.out.println(new JudgeRouteCircle().judgeCircle("UUUUUDDDDDLLLLLRRRRR"));
    }
}
