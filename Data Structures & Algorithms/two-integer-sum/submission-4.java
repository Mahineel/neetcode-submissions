class Solution {
    public int[] twoSum(int[] nums, int target) {
     Map<Integer,Integer> numsMap = new HashMap<>();
     for(int p1=0; p1<nums.length; p1++){
      Integer currentMapValue = numsMap.get(nums[p1]);
      if(currentMapValue != null){
        return new int[] {currentMapValue , p1};
      }else{
        int numberToFind = target - nums[p1];
        numsMap.put(numberToFind, p1);
      }
     }
     return null;   
    }
}
