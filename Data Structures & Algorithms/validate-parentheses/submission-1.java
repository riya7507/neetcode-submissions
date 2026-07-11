class Solution {
    public boolean isValid(String s) {
        int n=s.length();
        int top=-1;
        ArrayList<Character> stack=new ArrayList<>();
        int k=0;
       
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
                char ch=s.charAt(i);
                stack.add(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                top=stack.get(stack.size()-1);

                if(top=='(' && s.charAt(i)==')'||top=='{' && s.charAt(i)=='}'||top=='[' && s.charAt(i)==']'){
                    stack.remove(stack.size()-1);
                }else{
                    return false;
                }
            }
            }
        
        return stack.isEmpty();


    }
}
