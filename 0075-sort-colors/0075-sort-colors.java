class Solution {
    public void sortColors(int[] nums) {
        if(nums.length==1||nums.length==0)
           return;
      int[] count=new int[3];
       for(int i=0;i<nums.length;i++)
       {
       count[nums[i]]++;
       }
     
       int g=0;
       int j=0;
       for(int h=0;h<count.length;h++)
       {
        if(count[h]!=0)
        {
            j=count[h];
        }
        if(count[h]>0)
        {
         for(int i=0;i<j;i++)
           nums[g++]=h;
        }
       }
       
    }
}