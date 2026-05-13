class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        int[] charArray = new int[26];
        int s_index = 0;
        int t_index = 0;

        for(int i=0;i<s.length();i++){
            s_index = (int)s.charAt(i) - 97;
            t_index = (int)t.charAt(i) - 97;
            charArray[s_index] = charArray[s_index] +1;
            charArray[t_index] = charArray[t_index] -1;

        }
        for(int ch : charArray)
            if(ch!=0) 
                return false;

        return true;   
    }
}
