class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        if (nums.length == 1)
            return nums[0];
        int flag=0,max=0;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                flag++;
            }
            
            if(flag >= ((nums.length)/2) && flag > max){
                max = nums[i];
            }
            if(nums[i] !=nums[i+1]){
                flag=0;
            }
        }
        return max;
    }
}