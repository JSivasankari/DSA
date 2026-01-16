import java.util.*;

class happynumber {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while (n != 1) {
            int temp = 0;
            while (n > 0) {
                temp += (n % 10) * (n % 10);
                n = n / 10;
            }
            if (set.contains(temp)) {
                return false;
            }
            set.add(temp);
            n = temp;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        happynumber obj = new happynumber();      
        boolean result = obj.isHappy(n);    

        System.out.println(result);        
    }
}
