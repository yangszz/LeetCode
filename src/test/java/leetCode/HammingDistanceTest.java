package leetCode;

import org.junit.Test;

import static org.junit.Assert.*;

public class HammingDistanceTest {
    private HammingDistance hammingDistance = new HammingDistance();

    @Test
    public void hammingDistance() {
        System.out.println(hammingDistance.hammingDistance(4, 2));
    }

    @Test
    public void hammingDistanceStr() {
        System.out.println(hammingDistance.hammingDistanceStr(14, 2));
    }
}