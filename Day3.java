import java.util.*;
public class Day3 {
    public static void main(String[] args) {
        int[] candies = { 2, 3, 5, 1, 3 };
        int extraCandies = 3;
        int max = 0;
        for(int i = 0;i<candies.length;i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        System.out.println("Maximum candies: " + max);
        for(int i = 0;i<candies.length;i++){
            if(candies[i]+extraCandies>=max){
                System.out.println("true");
            }else{
                System.out.println("false");
            }
        }
        System.out.println();

    }
}