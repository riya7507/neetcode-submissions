class Solution {
    public boolean isAnagram(String s, String t) {
        int[] arrs=new int[26];
        int[] arrt=new int[26];
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int charatnum=ch-'a';
            arrs[charatnum]++;
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);
            int charatnum=ch-'a';
            arrt[charatnum]++;
        }
        for(int i=0;i<26;i++){
            if(arrs[i]!=arrt[i]){
                return false;
            }
        }
        return true;
    }
}
