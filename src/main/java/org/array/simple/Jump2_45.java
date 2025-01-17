package org.array.simple;

public class Jump2_45 {
    public static int jump(int[] nums) {
        int position=nums.length-1;
        int steps=0;
        while (position > 0) {
            for (int i = 0; i < position; i++) {
                if (i + nums[i] >= position) {
                    position=i;
                    steps++;
                    break;
                }
            }
        }
        return steps;

    }
    public static int jump1(int[] nums) {
        int length = nums.length;
        int end = 0;
        int maxPosition = 0;
        int steps = 0;
        for (int i = 0; i < length - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                steps++;
            }
        }
        return steps;
    }

    public static void main(String[] args) {

    }
}
