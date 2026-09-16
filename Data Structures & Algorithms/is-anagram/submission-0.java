class Solution {
    public boolean isAnagram(String s, String t) {
     char [] sis= s.toCharArray();
     char[] tis = t.toCharArray();

     Arrays.sort(sis);
     Arrays.sort(tis);

     String sortedS = new String(sis);
     String sortedT = new String(tis);      
    
     if(sortedS.equals(sortedT)){
        return true;
     }
     return false;
    }
}
