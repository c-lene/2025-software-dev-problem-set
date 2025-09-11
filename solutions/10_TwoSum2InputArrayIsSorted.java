class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        // Placeholder for the indices of the 2 numbers
        int[] indices = new int[2];

        Map<Integer, Integer> numsMap = new HashMap<>();

        // Loops through 'numbers' array to add numbers
        for (int i = 0; i < numbers.length; i++) {

            int num = target - numbers[i];

            // Checks 'numsMap' to see if 'num' already exist
            if (numsMap.containsKey(num)) {
                
                // If found, assigns the value as the index for return
                indices[0] = numsMap.get(num);
                indices[1] = i + 1;

            } else {

                // Adds current number & index to numsMap
                numsMap.put(numbers[i], i + 1);
            }
        }


        // CHECKPOINT: 
        System.out.println(numsMap);


        return indices;
    }
}
