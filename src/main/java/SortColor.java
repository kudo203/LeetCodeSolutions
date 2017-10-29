public class SortColor {
    public void sortColors(int[] nums) {
        int[] frequency = new int[3];
        for(int i = 0; i < nums.length; i++){
            frequency[nums[i]]+=1;
        }
        int counter = 0;
        int current = 0;
        while(counter<3){
            int freq = frequency[counter];
            while(freq>0){
                nums[current] = counter;
                current +=1;
                freq-=1;
            }
            counter+=1;
        }
    }
}
