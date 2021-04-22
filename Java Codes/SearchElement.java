class Solution {
    public int searchInsert(int[] nums, int target) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                index=i;
                break;
            }
        }
        if(target>nums[(nums.length)-1]){
            index=nums.length;
        }
        for(int i=0;i<(nums.length)-1;i++){
            if(target>nums[i] && target<nums[i+1]){
                index=i+1;
            }
        }
        return index;
    }
}