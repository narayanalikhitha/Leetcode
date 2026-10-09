class Solution {
    public int minInsertions(String s) {
     int left=0;
     int right=0;
     int ans=0;
     for(int i=0;i<s.length();i++)
     {
        char ch=s.charAt(i);
        if(ch=='(')
        {
          left++;
          if(right%2!=0)
          {
            ans++;
            right--;
          }
          right+=2;
        }
        else 
        {
         right--;
         if(right<0)
         {
            ans++;
            right=1;
         }
        }
     } 
     
     
     return ans+right;
    }
}