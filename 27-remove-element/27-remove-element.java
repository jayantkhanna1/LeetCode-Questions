class Solution {
    public int removeElement(int[] nums, int val) {
        int k = nums.length;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == val){
                k = k-1;
                nums[i] = Integer. MAX_VALUE;
            }
        }
        Arrays.sort(nums);
        return k;
        
    }
}