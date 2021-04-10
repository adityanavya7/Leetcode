class Solution 
{
    public int[] twoSum(int[] nums, int target) 
    {
        int ind[] = new int[2];
        for(int i = 0; i < nums.length; i++)
        {
            for(int j = 0; j < nums.length; j++)
            {
                if(nums[i] + nums[j] == target)
                {
                    ind[0] = i;
                    ind[1] = j;
                    break;
                }
            }
        }
        return ind;
    }
}