class Solution {
    public int scoreOfParentheses(String s) {
        int count=0;
        Stack<Character>st=new Stack<>();
        if(s.charAt(0)==')'&&s.length()==1)
           return 0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(ch=='(')
              st.push(ch);
            else 
                 {
                    int k=st.size();
                    st.pop();
                    if(s.charAt(i-1)=='(')
                    count+=Math.pow(2,k-1);
                 }

        }
        return count;
    }
}