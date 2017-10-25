public class MovingZeroes {
    public static void main(String[] args){
        int[] nums = {0,1,0,0,3,12};
        moveZeroes(nums);
        for(int i = 0; i < nums.length; i++){
            System.out.println(nums[i]);
        }
    }

    public static void moveZeroes(int[] nums) {
        int firstIndex = -1;
        for(int i = 0; i < nums.length; i++){
            if(nums[i]!=0){
                if(firstIndex==-1){
                    firstIndex=i+1;
                }
                else{
                    swap(nums,firstIndex,i);
                    firstIndex++;
                }
            }
            else{
                if(i==0 && firstIndex==-1)
                    firstIndex++;
            }
        }
    }

    public static void swap(int[] nums,int index1,int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }
}
