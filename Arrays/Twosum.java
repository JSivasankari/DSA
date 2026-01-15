import java.util.*;
public class Twosum {
    public static int[] Sum(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }
            }
           
        }
        return new int[]{-1,-1};
        
    }
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("enter the target");
        int target=s.nextInt();
        System.out.println("Enter the arrays");
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=s.nextInt();
        }
        int[] result = Sum(nums, target);

        System.out.println(result[0] + " " + result[1]);
        }
}