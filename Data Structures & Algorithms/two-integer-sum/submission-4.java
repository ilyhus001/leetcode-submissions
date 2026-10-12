class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            int goal = target - nums[i];

            if (seen.containsKey(goal)) {
                return new int[] {seen.get(goal), i};
            }

            seen.put(nums[i], i);
        }

        return null;
    }
}
