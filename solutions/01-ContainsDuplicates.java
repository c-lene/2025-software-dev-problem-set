class Solution {
    public boolean containsDuplicate(int[] nums) {

        // Sorts the 'nums' Array
        Arrays.sort(nums);

        // Loops the 'nums' Array starting at index 1
        for (int i = 1; i < nums.length; i++) {

            // Returns TRUE if there are duplicates when comparing the number before index i
            if (nums[i] == nums[i-1]) {
                return true;
            }
            
        }
        return false;
    }
}
