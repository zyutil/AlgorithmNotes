package com.zy._2020.Dec.TwentyEight;

import java.lang.annotation.Target;
import java.util.HashMap;

/**
 * @author at
 * @Date 2020/12/28
 **/
public class T_1_两数之和 {
    /**
     * 给定 nums = [2, 7, 11, 15], target = 9
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] num = new int[2];
        for (int i = 0; i < nums.length; i++) {
            num[0]=i;
            for (int j = 0; j < nums.length; j++) {
                if (j!=i){
                    num[1] = j;
                    if (nums[num[0]]+nums[num[1]]==target){
                        return num;
                    }
                }
            }
        }
        return null;
    }
    //哈希表 时间复杂度O(n)
    public static int[] twoSum2(int[] nums, int target) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target-nums[i])){
                return new int[]{hashMap.get(target-nums[i]),i};
            }
            hashMap.put(nums[i],i);
        }
        return null;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] ints = twoSum(nums, target);
        System.out.println(ints[0]+" "+ints[1]);
        int[] ints2 = twoSum2(nums, target);
        System.out.println(ints2[0]+" "+ints2[1]);
    }
}
