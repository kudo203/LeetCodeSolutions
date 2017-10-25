public class BestTimeBuyAndStock {


    public static int[] getDiff(int[] array){
        int[] ans = new int[array.length-1];
        for(int i = 1; i < array.length; i++){
            ans[i-1] = array[i] - array[i-1];
        }
        return ans;
    }

    public static int maximumSubarray(int[] array){
        if(array.length==0)
            return 0;
        else{

            int[] resultant = getDiff(array);
            return divideConquer(resultant,0,resultant.length-1);
        }
    }

    public static int divideConquer(int[] array, int start, int end){
        if(start==end)
            return array[start];
        int mid = (start+end)/2;
        int leftVal = divideConquer(array,start,mid);
        int rightVal = divideConquer(array,mid+1,end);
        int getMid = getMidVal(array,start,end,mid);

        return Math.max(Math.max(leftVal,rightVal),getMid);
    }

    public static int getMidVal(int[] array, int start, int end, int mid){
        int runningSum = 0;
        int leftSum = 0;

        for(int i = mid; i >= start; i--){
            runningSum += array[i];
            if(leftSum<runningSum)
                leftSum = runningSum;
        }

        runningSum = 0;
        int rightSum = 0;

        for(int i = mid+1; i <= end; i++){
            runningSum += array[i];
            if(rightSum<runningSum)
                rightSum = runningSum;
        }

        return leftSum + rightSum;
    }
}
