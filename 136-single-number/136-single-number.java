class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int flag=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i] == nums[i+1]){
                flag++;                
            }
            else{
                if(flag != 2){
                    return nums[i];
                }
                flag=1;
                
            }
                
        }
        return nums[nums.length-1];
    }
}