class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int min=Integer.MAX_VALUE;
        for(int i=0;i<nums.size();i++)
        {
            List<Integer>a=new ArrayList<>();
            
            for(int j=i;j<nums.size();j++)
            {
                a.add(nums.get(j));
                if(a.size()>=l&&a.size()<=r)
                {
                    int sum=0;
                   for(int val:a)
                   {
                      sum+=val;
                   }
                   if(sum>0)
                   min=Math.min(sum,min);
                }
                        
            }
        }
        return min==Integer.MAX_VALUE?-1:min;
    }
}