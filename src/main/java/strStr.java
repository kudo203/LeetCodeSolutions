public class strStr {
    public static void main(String[] args){
        String haystack = "abcde";
        String needle = "cde";
        System.out.println(strStr(haystack,needle));
    }

    public static int strStr(String haystack, String needle) {
        if(needle.length()==0)
            return 0;
        int windowStart = 0;
        while(windowStart+needle.length()<=haystack.length()){
            if(haystack.substring(windowStart,windowStart+needle.length()).equals(needle))
                return windowStart;
            else
                windowStart+=1;
        }
        return -1;
    }
}
