class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int ans[]=new int[nums1.length+nums2.length];
        int g=0,h=0;
        for(int i=0;i<ans.length;i++){
            if(g <nums1.length && h<nums2.length){
                if(nums1[g]>nums2[h]){
                    ans[i]=nums2[h];
                    h++;
                }
                else{
                    ans[i]=nums1[g];
                    g++;
                }
            }
            else if(g==nums1.length){
                ans[i]=nums2[h];
                h++;
            }
            else{
                ans[i]=nums1[g];
                g++;
            }
            
        }
        
        
        double median=0.0000;
        if(ans.length % 2 == 1){
            median=(double)ans[ans.length/2];
        }
        else{
            median=(((double)ans[ans.length/2])+((double)ans[(ans.length/2)-1]))/2;
        }
        return median;
    }
}