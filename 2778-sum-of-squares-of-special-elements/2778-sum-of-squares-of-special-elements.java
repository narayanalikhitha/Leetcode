class Solution {
    public int sumOfSquares(int[] nums) {
        int ans=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
         int k=i+1;
          if(n%k==0)
            ans+=nums[i]*nums[i];
        }
        return ans;
    }
}