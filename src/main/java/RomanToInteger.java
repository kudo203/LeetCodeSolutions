import java.util.HashMap;

public class RomanToInteger {

    public static int romanToInt(String s) {
        HashMap<String,Integer> romanMap = new HashMap<String,Integer>();
        romanMap.put("I",1);
        romanMap.put("IV",4);
        romanMap.put("V",5);
        romanMap.put("IX",9);
        romanMap.put("X",10);
        romanMap.put("XL",40);
        romanMap.put("L",50);
        romanMap.put("XC",90);
        romanMap.put("C",100);
        romanMap.put("CD",400);
        romanMap.put("D",500);
        romanMap.put("CM",900);
        romanMap.put("M",1000);

        int counter = 0;
        int finalNumber = 0;

        while(counter<s.length()){
            String numMappVal = "";
            numMappVal += s.charAt(counter);
            if(s.charAt(counter)=='I'){
                if(counter+1<s.length() && (s.charAt(counter+1)=='V'|| s.charAt(counter+1)=='X')){
                    counter++;
                    numMappVal+=s.charAt(counter);
                }
            }
            else if(s.charAt(counter)=='X'){
                if(counter+1<s.length() && (s.charAt(counter+1)=='L'|| s.charAt(counter+1)=='C')){
                    counter++;
                    numMappVal+=s.charAt(counter);
                }
            }
            else if(s.charAt(counter)=='C'){
                if(counter+1<s.length() && (s.charAt(counter+1)=='D'|| s.charAt(counter+1)=='M')){
                    counter++;
                    numMappVal+=s.charAt(counter);
                }
            }
            counter++;
            finalNumber += romanMap.get(numMappVal);
        }
        return finalNumber;
    }
}
