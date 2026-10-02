class Solution {
    public void generate(List<String>a,int n,String s,int opc,int cpc)
    {
        if(s.length()/2==n)
        {
            a.add(s);
            return ;
        }
        if(opc<n)
          generate(a,n,s+'(',opc+1,cpc);
        if(cpc<opc)
          generate(a,n,s+')',opc,cpc+1);

    }
    public List<String> generateParenthesis(int n) {
        List<String>a=new ArrayList<>();
        generate(a,n,"",0,0);
        return a;
    }
}