class Solution {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        int mid=0;
        while(low<=high){
            mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }else if(target>nums[mid]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }

        if (target>nums[mid]){
           return mid+1;}
           else if (target<nums[mid] && target>0 && nums.length>1 || mid==nums.length-1){
            return mid;
           }else if(target<nums[mid] && target>0 && nums.length>1 && mid!=nums.length-1){
            return mid-1;
           }else if(target<=0){
             return mid;
           }
           else{
            return 0;
           }
    }
}