class Solution {
    public String digitSum(String s, int k) {
        while(s.length()>k)
        {
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<s.length();i+=k)
        {
            int ans1=0;
            int end=Math.min(i+k,s.length());
            String s1=s.substring(i,end);
           for(int k1=0;k1<s1.length();k1++)
           {
            ans1+=Character.getNumericValue(s1.charAt(k1));
           }
        ans.append(Integer.toString(ans1));
        }
        s=ans.toString();
        }
        return s;
    }
}