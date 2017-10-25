public class HammingDistance {
    public static int hammingDistance(int x, int y) {
        int diff = x^y;
        String convert = Integer.toBinaryString(diff);
        int hammingDistanceCount = 0;
        for(int i = 0; i < convert.length();i++){
            if(convert.charAt(i)=='1')
                hammingDistanceCount++;
        }
        return hammingDistanceCount;
    }
}
