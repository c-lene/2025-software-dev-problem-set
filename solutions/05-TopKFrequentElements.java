// Solution Method #1
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        // HashMap to store key 'nums' to value frequent elements
        HashMap<Integer, List<Integer>> numsHashMap = new HashMap<>(); 

        // HashMap to store frequency of each nums
        HashMap<Integer, List<Integer>> numsCountHashMap = new HashMap<>();
        
        // Create an int[] to store the most frequent elements
        int[] mostFrequentElements = new int[k];


        // Loops through 'nums' array to add duplicate values to HashMap
        for (int i = 0; i < nums.length; i++) {

            // HashMap: Checks if int 'nums' exist as Key
            if (numsHashMap.containsKey(nums[i])) {
                numsHashMap.get(nums[i]).add(nums[i]);

            } else {

                List<Integer> numsValueList = new ArrayList<>();
                numsValueList.add(nums[i]);
                numsHashMap.put(nums[i], numsValueList);
            }
        }


        // Loops through 'numsHashMap' get frequent numbers to store in 'numsCountHashMap'
        for (Map.Entry<Integer, List<Integer>> numEntry : numsHashMap.entrySet()) {
            
            int key = numEntry.getValue().size();
            int value = numEntry.getKey();

            // Checks if key exist in 'numsCountHashMap'
            if (numsCountHashMap.containsKey(key)) {

                // Adds value list linked to the existing key
                numsCountHashMap.get(key).add(value);

            } else {

                // Creates new list to store values
                List<Integer> valueList = new ArrayList<>();
                valueList.add(value);

                // Add new key/value pair to 'numsCountHashMap'
                numsCountHashMap.put(key, valueList);
            }
        }


        // Create new ArrayList to store the frequent values
        ArrayList<Integer> numsCountList = new ArrayList<>();


        // Loops through 'numsCountHashMap' to get frequent values for 'numsCountList'
        if (nums.length > 1) {

            for (int i = nums.length; i >= 0; i--) {
                for (Map.Entry<Integer, List<Integer>> numEntry : numsCountHashMap.entrySet()) {
                
                    if (i == numEntry.getKey()) {
                        List<Integer> valueList = numEntry.getValue();

                        for (int value : valueList) {
                            numsCountList.add(value);
                        }
                    }
                }
            }


            // Loops through 'numsCountList' list to get the 'mostFrequentElements'
            for (int i = 0; i < mostFrequentElements.length; i++) {
                mostFrequentElements[i] = numsCountList.get(i);
            }
            

        } else {

            // Occurs if size of nums.length equals to 1
            for (Map.Entry<Integer, List<Integer>> numEntry : numsCountHashMap.entrySet()) {

                List<Integer> valueList = numEntry.getValue();

                for (int value : valueList) {
                    numsCountList.add(value);
                }
            }
            
            mostFrequentElements[0] = numsCountList.get(0);
        }

        return mostFrequentElements;
    }
}
