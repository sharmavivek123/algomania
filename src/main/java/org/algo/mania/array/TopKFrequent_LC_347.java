package org.algo.mania.array;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class TopKFrequent_LC_347 {
    public static void main(String[] args) {
        TopKFrequent_LC_347 topKFrequentLc3474=new TopKFrequent_LC_347();

        int nums[]={1,1,1,2,2,3};
        int k=2;

        int[] ints = topKFrequentLc3474.topKFrequent(nums, k);

        for (int p : ints){
            System.out.print(p + " ");
        }

    }

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer,Integer> map=new HashMap<>();

        for (int p: nums){
            map.put(p,map.getOrDefault(p,0)+1);
        }

        Queue<Pair123001> queue=new PriorityQueue<>((o1,o2)->o2.val-o1.val);

        for (Map.Entry<Integer,Integer> e: map.entrySet()){
            queue.add(new Pair123001(e.getKey(),e.getValue()));
        }

        int ans[]=new int[k];

        for (int i=0;i<k;i++){
            ans[i]=queue.poll().key;
        }

       return ans;
    }


    class Pair123001{
        int key;
        int val;

        public Pair123001(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }

}
