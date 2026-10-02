class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] a=new int[m+n];
        int p1=0;int p2=0;
        int k=0;
        while(p1<m&&p2<n)
        {
            if(nums1[p1]<=nums2[p2])
              a[k++]=nums1[p1++];
              else if(nums2[p2]<nums1[p1])
                a[k++]=nums2[p2++];
        }
        while(p1<m)
        {
            a[k++]=nums1[p1++];
        }
       while(p2<n)
         a[k++]=nums2[p2++];

         for(int u=0;u<nums1.length;u++)
           nums1[u]=a[u];
    }
}