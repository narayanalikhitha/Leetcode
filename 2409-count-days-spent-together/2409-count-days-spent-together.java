class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        String a=arriveAlice.substring(0,2);
        String b=leaveAlice.substring(0,2);
        String c=arriveBob.substring(0,2);
        String d=leaveBob.substring(0,2);
        int[] prefix={31,28,31,30,31,30,31,31,30,31,30,31};
        int j=Integer.parseInt(a);
        int g=Integer.parseInt(b);
        int k=Integer.parseInt(c);
        int d1=Integer.parseInt(d);
        int startA=0;
        int endA=0;
        int startB=0;
        int endB=0;
        for(int i=0;i<j-1;i++)
        {
            startA+=prefix[i];
        }
         for(int i=0;i<g-1;i++)
        {
            endA+=prefix[i];
        }
         for(int i=0;i<k-1;i++)
        {
            startB+=prefix[i];
        }
         for(int i=0;i<d1-1;i++)
        {
            endB+=prefix[i];
        }
        startA +=Integer.parseInt(arriveAlice.substring(3,5));
        endA +=Integer.parseInt(leaveAlice.substring(3,5));
        startB +=Integer.parseInt(arriveBob.substring(3,5));
        endB +=Integer.parseInt(leaveBob.substring(3,5));

        int max1=Math.max(startA,startB);
        int min1=Math.min(endA,endB);

        return max1>min1?0:min1-max1+1;
    }
}