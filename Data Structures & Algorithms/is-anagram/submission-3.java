class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }
     char [] sis= s.toCharArray();
     char[] tis = t.toCharArray();

     int []arrS = new int[26];
     int []arrT = new int[26];

     for (int i =0;i<sis.length;i++)
     {
        arrS[sis[i] - 'a']++;
        arrT[tis[i] - 'a']++;
     }
     for (int i = 0; i < 26; i++) {
            if (arrS[i] != arrT[i]) {
                return false; // Found a mismatch, not an anagram
            }
        }

        return true; 
}
}
