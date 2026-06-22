class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m=nums1.length;
        int n=nums2.length;
          int[] marr=new int[m+n];
        for (int i=0;i<m;i++){
          marr[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
            marr[m+i]=nums2[i];
        }
        Arrays.sort(marr);
        if (marr.length%2==0){
            int t=n+m-2;
            int a = marr[t/2];
            int b= marr[(t/2)+1];
            return (double)(a+b)/2.0;
        } else{
            return  (double)marr[((n+m)/2)];
        }
        
    }
}