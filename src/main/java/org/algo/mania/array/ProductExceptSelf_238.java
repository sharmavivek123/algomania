package org.algo.mania.array;

public class ProductExceptSelf_238 {
    public static void main(String[] args) {
        ProductExceptSelf_238 productExceptSelf2385=new ProductExceptSelf_238();
        int nums[]={1,2,3,4};
        int[] ints = productExceptSelf2385.productExceptSelf(nums);

        for (int p: ints){
            System.out.print(p + " ");
        }

    }

    private int[] productExceptSelf(int[] nums) {

        int n=nums.length;
        int[] pre=new int[n];
        int[] post=new int[n];
        int[] ans=new int[n];

        pre[0]=1;
        post[n-1]=1;

        for (int i=1;i<n;i++){
            pre[i]=pre[i-1]*nums[i-1];
            post[n-i-1]=post[n-i]*nums[n-i];
        }

        for (int i=0;i<n;i++){
            ans[i]=pre[i]*post[i];
        }
        return ans;
    }

}
