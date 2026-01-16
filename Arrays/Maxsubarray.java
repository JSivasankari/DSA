import java.util.*;
class Maxsubarray {
    public static int maxSubArray(int[] nums) {
        int res=nums[0];
        int maxending=nums[0];
        for(int i=1;i<nums.length;i++){
            maxending=Math.max(maxending+nums[i],nums[i]);
            res=Math.max(res,maxending);
        }
        return res;
        
    }
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int nums[]=new int[n];
        for(int i=0;i<n;i++){
            nums[i]=s.nextInt();
        }
        System.out.println(maxSubArray(nums));
        

    }
}