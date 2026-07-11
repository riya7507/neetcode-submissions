class Solution {
    public boolean validPalindrome(String s) {
        int j=s.length()-1;
        int i=0;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                if(palindrome(s,i+1,j)){
                    return true;
                }
                else if(palindrome(s,i,j-1)){
                    return true;
                }
                return false;

            }
            i++;
            j--;

        }
            return true;

    }
    static boolean palindrome(String s,int i,int j){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;

        }
        return true;
    }
}