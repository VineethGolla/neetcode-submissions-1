class Solution {
    public boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){

            while((i<j) && !((s.charAt(i)>='A' && s.charAt(i)<='Z') ||
                    (s.charAt(i)>='a' && s.charAt(i)<='z') ||
                    (s.charAt(i)>='0' && s.charAt(i)<='9'))) {
                        i++;
                    }
            while((i<j) && !((s.charAt(j)>='A' && s.charAt(j)<='Z') ||
                    (s.charAt(j)>='a' && s.charAt(j)<='z') ||
                    (s.charAt(j)>='0' && s.charAt(j)<='9'))) {
                        j--;
                    }
            char l=s.charAt(i);
            char r=s.charAt(j);
            if(l>='A' && l<='Z'){
                l=(char)(l+32);
            }
            if(r>='A' && r<='Z'){
                r=(char)(r+32);
            }
            if(i<j && l!=r){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
