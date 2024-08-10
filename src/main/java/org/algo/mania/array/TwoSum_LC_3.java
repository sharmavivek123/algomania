package org.algo.mania.array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum_LC_3 {
    public static void main(String[] args) {

        TwoSum_LC_3 b1=new TwoSum_LC_3();

        int nums[]={2,7,11,15};
        int target=9;

        int[] ints = b1.twoSumV2(nums, target);

        for (int p: ints){
            System.out.print(p + " ");
        }


    }

    private int[] twoSumV2(int[] nums, int target) {
        Map<Integer,Integer> map=new HashMap<>();

        for (int i=0;i<nums.length;i++){

            int s2=target-nums[i];

            if(map.containsKey(s2)){
                return new int[]{i,map.get(s2)};
            }

            map.put(nums[i], i);
        }


        return new int[]{-1,-1};

    }

    public int[] twoSum(int[] nums, int target) {

        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}



















