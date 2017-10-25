public class ConvertToTitle {

    public static String convertToTitle(int n){
        char[] array = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        int copy = n;
        StringBuilder ans = new StringBuilder();
        while(copy!=0){

            ans.append(array[((copy-1)%26)]);
            if(copy%26==0){
                copy = copy/26 -1;
            }
            else{
                copy = copy/26;
            }
        }
        return ans.reverse().toString();
    }
}
