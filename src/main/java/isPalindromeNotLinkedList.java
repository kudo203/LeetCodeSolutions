public class isPalindromeNotLinkedList {
    public static boolean isPalindrome(String s) {

        s = s.toLowerCase();
        StringBuilder m = new StringBuilder();
        for(int i = 0; i < s.length(); i++){
            char mchar = s.charAt(i);
            if(((int)mchar>=97 && (int)mchar<=122)||((int)mchar>=48 && (int)mchar<=57))
                m.append(mchar);
        }

        String newString = m.toString();
        for(int i = 0; i <= (newString.length()-1)/2; i++){
            if(newString.charAt(i)!=newString.charAt(newString.length()-1-i)){
                return false;
            }
        }

        return true;
    }
}
