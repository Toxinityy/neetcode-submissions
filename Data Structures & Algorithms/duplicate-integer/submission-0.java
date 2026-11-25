class Solution {
    public boolean hasDuplicate(int[] nums) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        for(int i = 0; i<nums.length; i++){
            if(hashmap.putIfAbsent(nums[i], 1) == null){
                hashmap.put(nums[i], 1);
            } else {
                return true;
            }
        }
        return false;
    }
}