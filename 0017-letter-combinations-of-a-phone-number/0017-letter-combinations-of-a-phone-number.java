class Solution {
    public List<String> letterCombinations(String digits) {
        Map<Integer,String>hm=new HashMap<>();
        hm.put(2,"abc");
        hm.put(3,"def");
        hm.put(4,"ghi");
        hm.put(5,"jkl");
        hm.put(6,"mno");
        hm.put(7,"pqrs");
        hm.put(8,"tuv");
        hm.put(9,"wxyz");
        
        List<String>ans=new ArrayList<>();
       if(digits.length()==0)
          return ans;
        
            char ch=digits.charAt(0);
           String s1=hm.get(ch-'0');
            for(int u=0;u<s1.length();u++)
            {
                ans.add(""+s1.charAt(u));
            }
           if(digits.length()==1)
             return ans;
        

        for(int w=1;w<digits.length();w++)
        {
            List<String>temp=new ArrayList<>();
            char ch2=digits.charAt(w);
            String s2=hm.get(ch2-'0');
            for(int y=0;y<ans.size();y++)
            {
                for(int j=0;j<s2.length();j++)
                {
                temp.add(ans.get(y)+s2.charAt(j));
                }
            }

        
        ans=temp;
        }
        
       return ans;
    }
}