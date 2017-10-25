public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        int arrayCounter = 0;
        int finalIndexCount = 0;

        while(arrayCounter<nums.length){
            int currNewVal = nums[arrayCounter];
            while(arrayCounter<nums.length && nums[arrayCounter] == currNewVal){
                arrayCounter+=1;
            }
            if(arrayCounter<nums.length){
                finalIndexCount+=1;
                nums[finalIndexCount] = nums[arrayCounter];
            }
        }
        for(int i = 0; i< nums.length; i++){
            System.out.println(nums[i]);
        }
        return finalIndexCount+1;
    }
}
