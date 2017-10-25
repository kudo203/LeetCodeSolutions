public class addBinary {

    public static void main(String[] args){
        String bin1 = "1";
        String bin2 = "111";
        System.out.println(addBinary1(bin1,bin2));
    }

    public static String addBinary1(String a, String b){
        StringBuilder ans = new StringBuilder();
        int aCounter = a.length()-1;
        int bCounter = b.length()-1;
        int carryOver = 0;

        while(aCounter>=0 || bCounter>=0){
            int sum = carryOver;
            if(aCounter>=0)
                sum += a.charAt(aCounter--) -'0';
            if(bCounter>=0)
                sum += b.charAt(bCounter--) -'0';
            ans.append(sum%2);
            carryOver = sum/2;
        }
        if(carryOver!=0)
            ans.append('1');

        return ans.reverse().toString();
    }
}
