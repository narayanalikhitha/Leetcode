class Solution {
    public int sortPermutation(int[] nums) {
       int k=-1;
       int i=0;
      while(i<nums.length)
      {
        if(i!=nums[i])
        {
           k&=nums[i];
            
        }
        i++; 
      }
      return Math.max(k,0);
    }
}