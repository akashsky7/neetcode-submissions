class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;

        while(start<end){
            while(start<end && !Character.isLetterOrDigit(s.charAt(start))){
                start++;
            }
            while(start<end && !Character.isLetterOrDigit(s.charAt(end))){
                end--;
            }
            char a = s.charAt(start);
            char b = s.charAt(end);
            if(Character.toLowerCase(a)!=Character.toLowerCase(b)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
