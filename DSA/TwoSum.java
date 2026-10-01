package DSA;

import java.util.*;

public class TwoSum {

    public static int[] twosum(int[] num, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < num.length; i++) {

            int remain = target - num[i];

            if (map.containsKey(remain)) {
                return new int[]{i, map.get(remain)};
            }

            map.put(num[i], i);
        }

        return null;
    }

    public static void main(String[] args) {

        int[] num = {2, 6, 5, 8, 11};
        int target = 14;

        int[] result = twosum(num, target);

        System.out.println("[" + result[0] + ", " + result[1] + "]");
    }
}
