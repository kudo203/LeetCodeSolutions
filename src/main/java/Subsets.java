import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        List<List<Integer>> ans = subsets(nums);
    }

    public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = recurse(nums,nums.length-1);
        return ans;
    }

    public static List<List<Integer>> recurse(int[] nums,int end){
        if(end<0){
            ArrayList<Integer> ans = new ArrayList<Integer>();
            List<List<Integer>> ans1 = new ArrayList<List<Integer>>();
            ans1.add(ans);
            return ans1;
        }
        List<List<Integer>> ans1 = recurse(nums,end-1);
        int currSize = ans1.size();
        for(int i = 0; i < currSize; i++){
            ArrayList<Integer> new1 = new ArrayList<Integer>();
            new1.addAll(ans1.get(i));
            new1.add(nums[end]);
            ans1.add(new1);
        }
        return ans1;
    }
}
