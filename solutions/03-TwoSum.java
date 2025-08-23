// Solution Method 1
class Solution {
    public int[] twoSum(int[] nums, int target) {

        // Store the indices for the two sum numbers
        int[] indices = new int[2];

        // Loops through the 'nums' Array
        for (int i = 0; i < nums.length; i++) {

            for (int j = i+1; j < nums.length; j++) {

                // Assigns the index to indices array
                if (nums[i] + nums[j] == target) {
                    indices[0] = i;
                    indices[1] = j;

                }
            }
        }
      
        return indices;
    }
}
