class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> themap = new HashMap<>();
        int[] ret = new int[2];
        for(int i = 0; i < nums.length; i++){
            int dif = target - nums[i];
            if(themap.get(dif) != null){
                ret[0] = themap.get(dif);
                ret[1] = i;
            }
            themap.put(nums[i], i);
        }
        return ret;
    }
}