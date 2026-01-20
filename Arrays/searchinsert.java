import java.util.*;

public class searchinsert {
    
    public static int searchInsert(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= target) {
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = s.nextInt();

        int[] nums = new int[n];
        System.out.println("Enter sorted array elements:");
        for (int i = 0; i < n; i++) {
            nums[i] = s.nextInt();
        }

        System.out.print("Enter target: ");
        int target = s.nextInt();

        int result = searchInsert(nums, target);
        System.out.println("Insert position: " + result);
    }
}
