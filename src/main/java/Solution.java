import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /*
        Scanner scanner = new Scanner(System.in);
        int aLen = scanner.nextInt();
        int[] array = new int[aLen];
        for(int i = 0; i < aLen; i++){
            array[i] = scanner.nextInt();
        }
        int rotateLen = scanner.nextInt();
        int[] rotate = new int[rotateLen];
        for(int i = 0; i < rotateLen; i++){
            rotate[i] = scanner.nextInt();
        }
        */
        int[] array = {1,2,4,3};
        int[] rotate = {1,3};
        int[] ans = new int[rotate.length];
        int maxIndex = getMax(array);
        for(int i = 0; i < rotate.length; i++){
               ans[i] = getRotateIndex(rotate[i],array,maxIndex);
        }
        int  t= 1;
    }

    public static int getRotateIndex(int val,int[] array,int index){
        int newIndex = index-val;
        int curr = newIndex;
        if(newIndex<0){
            curr = array.length-newIndex;
        }
        return curr;
    }

    public static int getMax(int[] array){
        int maxIndex = 0;
        int max = array[0];
        for(int i = 1; i < array.length; i++){
            if(max < array[i]){
                max = array[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
