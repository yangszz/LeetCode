package leetCode;

import java.util.HashMap;
import java.util.Map;

public class FindAnagramMappings {


    public int[] anagramMappings(int[] A ,int[] B){
        int[] p = new int[A.length];
        Map<Integer,Integer> temp = new HashMap();
        for (int i = 0; i < B.length; i++) {
            temp.put(B[i],i);
        }
        for (int i = 0; i < A.length; i++) {
            p[i] = temp.get(A[i]);
        }
        return p;
    }

    public static void main(String[] args) {
        int[] a = {12, 28, 46, 32, 50};
        int[] b = {50, 12, 32, 46, 28};

        System.out.println(new FindAnagramMappings().anagramMappings(a, b));
    }
}
