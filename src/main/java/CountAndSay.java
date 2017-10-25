public class CountAndSay {

    public static String countAndSay(int n) {
        if(n==1)
            return String.valueOf(1);

        String prevVal = countAndSay(n-1);
        String newString = "";
        int index = 0;
        while(index<prevVal.length()){
            char curr = prevVal.charAt(index);
            int number = Integer.parseInt(curr+"");
            int count = 0;
            while(index<prevVal.length() && prevVal.charAt(index)==curr){
                count+=1;
                index+=1;
            }
            newString += count + "" + number;
        }

        return newString;
    }
}
