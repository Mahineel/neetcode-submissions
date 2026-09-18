class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int p1=0; p1<nums.length; p1++){
          for (int p2=p1+1 ; p2<nums.length;p2++){
            if(nums[p1] + nums[p2] ==target){
              return new int [] {p1,p2};
            }

          }
        }
        return null;
    }
}
