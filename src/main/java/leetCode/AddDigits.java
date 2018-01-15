package leetCode;

/**
 *
 Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

 For example:

 Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.

 Follow up:
 Could you do it without any loop/recursion in O(1) runtime?
 * @author yangszz
 * @since 20180115
 */
public class AddDigits {
	
	public int addDigits(int num) {
		while (num / 10 != 0) {
			char[] nums = Integer.toString(num).toCharArray();
			num = 0;
			for (int i = 0; i < nums.length; i++) {
				num += Integer.parseInt(String.valueOf(nums[i]));
			}
		}
		return num;
	}
	
	public int addDigits_2(int num) {

        return num==0?0:(num%9==0?9:(num%9));

    }
	
	public static void main(String[] args) {
		
		// System.out.println(new AddDigits().addDigits(555));
		 System.out.println(new AddDigits().addDigits_2(555));
	}
}
