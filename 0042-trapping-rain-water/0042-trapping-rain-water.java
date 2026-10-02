class Solution {
    public int trap(int[] height) {
        int[] lm=new int[height.length];
        int[] rm=new int[height.length];
        lm[0]=height[0];
        for(int i=1;i<height.length;i++)
        {
            lm[i]=Math.max(lm[i-1],height[i]);
        }
        rm[height.length-1]=height[height.length-1];
        int n=height.length;
        for(int j=n-2;j>=0;j--)
        {
            rm[j]=Math.max(rm[j+1],height[j]);
        }
        int ans=0;
        for(int i=0;i<rm.length;i++)
        {
            int val=Math.min(rm[i],lm[i]);
            ans +=Math.abs(height[i]-val);
        }
        return ans;
    }
}