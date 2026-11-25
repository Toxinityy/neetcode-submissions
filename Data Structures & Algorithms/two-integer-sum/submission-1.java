class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums.length == 2) return new int[] {0,1};
        Map<Integer, Integer> hm = new HashMap<>();

        for(int i = 0; i<nums.length; i++){
            int temp = target - nums[i];
            
            if(hm.containsKey(temp)) 
                return new int[] {hm.get(temp), i};

            else {
                if(!hm.containsKey(nums[i])) 
                    hm.put(nums[i], i);
                else 
                    continue;
            }
        }

        return new int[]{0,1};
    }
}
