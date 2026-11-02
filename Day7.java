public class Day7{
    public static void main(String[] args){
        int[] nums = {-2,4,-2,0};
        for(int i = 0;i<nums.length;i++){
            for(int j = i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                   int sum = nums[i]+nums[j]+nums[k];
                   System.out.println(
                        nums[i] + " + " + nums[j] + " + " +
                        nums[k] + " = " + sum
                    );
                    if(sum==0){
                        System.out.println("Valid Triplet");
                    }
                    
                }
            }
        }
    }
}