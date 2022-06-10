class Solution {
	public int[] productExceptSelf(int[] nums) {
		int answer=1,zeroes=0;;
		for(int i=0;i<nums.length;i++)
		{
			if(nums[i]==0) zeroes++;
			else answer*=nums[i];
		}

		if(zeroes==0)
		{
			for(int i=0;i<nums.length;i++)
			{
				nums[i]=answer/nums[i];
			}
		}
		else if(zeroes==1)
		{
			for(int i=0;i<nums.length;i++)
			{
				if(nums[i]==0)nums[i]=answer;
				else nums[i]=0;
			}
		}
		else 
		{
			for(int i=0;i<nums.length;i++)
			{
				nums[i]=0;
			}
		}
		return nums;
	}
}