package org.algo.mania.array;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutive_LC_128 {
    public static void main(String[] args) {
        LongestConsecutive_LC_128 b1=new LongestConsecutive_LC_128();
//        int nums[]={0,3,7,2,5,8,4,6,0,1};

        int nums[]={100,1,2,3,200,4};

        int i = b1.longestConsecutive(nums);
        System.out.println(i);
    }

    public int longestConsecutive(int[] nums) {

        Set<Integer> set=new HashSet<>();

        for (int p1: nums){
            set.add(p1);
        }
        int count=0,ans=0;

        for (int p: nums){

            count=0;

            if(!set.contains(p-1)){
                count++;

                while (set.contains(p+1)){
                    p++;
                    count++;
                }

                ans=Math.max(ans,count);
            }

            if(ans>nums.length/2){
                break;
            }

        }

        return ans;
    }

}
