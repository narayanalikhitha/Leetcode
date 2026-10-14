class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum>num*9)
          return "";
        
        StringBuilder ans=new StringBuilder();
        int k=sum/9;
        for(int i=0;i<k;i++)
        {
            ans.append("9");
        }
        int rem=sum%9;
        if(rem>0)
        {
            ans.append(rem);
        }
        int d=num-ans.length();
        if(d>0)
        {
            for(int i=0;i<d;i++)
              ans.append("0");
        }
        return ans.toString();
    }
}