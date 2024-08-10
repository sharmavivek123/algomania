package org.algo.mania.array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate_LC_217 {
    public static void main(String[] args) {
        ContainsDuplicate_LC_217 containsDuplicate217=new ContainsDuplicate_LC_217();

        int nums[]={1,1,1,3,3,4,3,2,4,2};

        boolean b = containsDuplicate217.containsDuplicate(nums);
        System.out.println(b);
    }

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set=new HashSet<>();

        for (int p: nums){
            set.add(p);
        }

        return set.size()!=nums.length;

    }
}
