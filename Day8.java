import java.util.*;

public class Day8 {
    public static void main(String[] args) {
        HashSet<ArrayList<Integer>> set = new HashSet<>();
        int[] nums = { 2, -2, 6, 3, 1 };
        int target = 0;
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    for (int l = k + 1; l < nums.length; l++) {
                        if (nums[i] + nums[j] + nums[k] + nums[l] == target) {
                            ArrayList<Integer> temp = new ArrayList<>();
                            temp.add(nums[i]);
                            temp.add(nums[j]);
                            temp.add(nums[k]);
                            temp.add(nums[l]);
                            Collections.sort(temp);
                        }
                    }
                }
            }
        }
        System.out.println(set);

    }
}