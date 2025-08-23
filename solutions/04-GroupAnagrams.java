class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        // HashMap that stores the sorted word as key & strs word as list of values
        HashMap <String, List<String>> strsHashMap = new HashMap<>();

        for (String word : strs) {

            // Convert word to char[] & add case-insensitive
            char[] wordCharArray = word.toLowerCase().toCharArray();

            // Sort the 'wordCharArray'
            Arrays.sort(wordCharArray);

            // Convert 'wordCharArray' back to a String 'wordSorted'
            String wordSorted = new String(wordCharArray);

            // Check if String 'wordSorted' already key in HashMap -- If yes, add 'word' to value list
            if (strsHashMap.containsKey(wordSorted)) {
                strsHashMap.get(wordSorted).add(word);

            } else {

                // HashMap: Add String 'wordSorted' as key & 'word' to a new value list
                List<String> strsValueList = new ArrayList<>();
                strsValueList.add(word);
                strsHashMap.put(wordSorted, strsValueList);

            }
        }

        // Stores the list of grouped values from 'strsHashMap'
        ArrayList<List<String>> groupAnagramList = new ArrayList<>(strsHashMap.values());

        return groupAnagramList;
    }
}
