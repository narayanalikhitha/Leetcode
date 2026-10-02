class Solution {
    public boolean bs(int[] nums,int tar,int low,int high)
    {
    while(low<=high)
    {
         int mid=(low+high)/2;
         if(nums[mid]==tar)
            return true;
        else if(nums[mid]<tar)
           low=mid+1;
           else
            high=mid-1;
    }
    return false;
    }
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>>a=new HashSet<>();
         for(int i=0;i<nums.length;i++)
         {
            for(int j=i+1;j<nums.length;j++)
            {
                int sum=nums[i]+nums[j];
                int tar=0-sum;
              boolean seen=bs(nums,tar,j+1,nums.length-1);
              if(seen)
              {
                List<Integer>f=new ArrayList<>();
                f.add(nums[i]);
                f.add(nums[j]);
                f.add(tar);
                a.add(f);
              }
            }
         } 
         return new ArrayList<>(a);
    }
}