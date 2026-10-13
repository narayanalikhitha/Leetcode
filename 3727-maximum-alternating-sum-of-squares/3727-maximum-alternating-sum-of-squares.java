class Solution {
    public long maxAlternatingSum(int[] nums) {
        long sum=0;
        int n=nums.length/2;
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++)
        {
               pq.add(Math.abs(nums[i]));
        }
        long sum1=0;
        long sum2=0;
        if(nums.length%2==0)
        {
        for(int i=0;i<n;i++)
        {  
            int a=pq.poll();
          
            sum1+=(long)a*a;
        }
        }
        else
        {
          for(int i=0;i<=n;i++)
        {  
            int a=pq.poll();
            
            sum1+=(long)a*a;
        }  
        }
        int h=pq.size();
        for(int i=0;i<h;i++)
        {
            int b=pq.poll();
          
            sum2+=(long)b*b;
        }
        sum=Math.abs(sum1-sum2);
        return sum;
    }
}