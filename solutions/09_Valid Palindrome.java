class Solution {
    public boolean isPalindrome(String s) {
        
        // Remove all non-alphanumberic & convert to Lowercase
        String regrex = "[^a-zA-Z0-9]";
       
        String newString = s.toLowerCase().replaceAll(regrex,"");
    
        
        // Use StringBuilder to reverse the string
        StringBuilder sbString = new StringBuilder(newString);
        
        String reverseString = sbString.reverse().toString();
        

        // Checks if both string matches
        if (newString.equals(reverseString)) {
            return true;
        }


        // CHECKPOINT:
        System.out.println(s.toLowerCase());
        System.out.println(newString);
        System.out.println(reverseString);
        

        return false;
    }
}
