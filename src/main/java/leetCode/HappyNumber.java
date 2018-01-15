package leetCode;

import java.util.HashSet;
import java.util.Set;

/**
 *
 Write an algorithm to determine if a number is "happy".

 A happy number is a number defined by the following process: Starting with any positive integer,
 replace the number by the sum of the squares of its digits,
 and repeat the process until the number equals 1 (where it will stay),
 or it loops endlessly in a cycle which does not include 1.
 Those numbers for which this process ends in 1 are happy numbers.

 Example: 19 is a happy number

 1^2 + 9^2 = 82
 8^2 + 2^2 = 68
 6^2 + 8^2 = 100
 1^2 + 0^2 + 0^2 = 1
 * @author yangszz
 * @since 20180115
 */
public class HappyNumber {

	public boolean isHappy(int num) {
		Set<Integer> isWhile = new HashSet<Integer>();
		while (num != 1 && isWhile.add(num)) {
			char[] nums = Integer.valueOf(num).toString().toCharArray();

			num = 0;
			for (char c : nums) {
				num += Integer.parseInt(String.valueOf(c)) * Integer.parseInt(String.valueOf(c));
			}
		}

		return num == 1;
	}

	public boolean isHappy_2(int num) {
		Set<Integer> isWhile = new HashSet<Integer>();
		while(isWhile.add(num)) {
			num = sumOfSquares(num);
			if(num == 1) {
				return true;
			}
		}
		return false;
	}
	
    static int sumOfSquares(int n) {
        int sum = 0;
        
        while(n > 0) {
            int digit = n % 10;
			sum += digit * digit;
            n /= 10;
        }
        
        return sum;
    }

    public static void main (String args[]){
		HappyNumber happyNumber = new HappyNumber();
		System.out.println(happyNumber.isHappy(4));
		happyNumber.isHappy_2(55);
	}
}
