package interview;
import java.util.*;

public class Main1 {
    public static void main(String[] args){
        Scanner sc = new Scanner((System.in));
        int count = Integer.parseInt(sc.nextLine());
        while(count >0){
            String[] nums = sc.nextLine().split(" ");
            System.out.println(brokenCalc(Integer.parseInt(nums[0]), Integer.parseInt(nums[1])));
            count--;
        }

    }

    public static int brokenCalc(int X, int Y) {
        int ans = 0;
        while (Y > X) {
            if (Y==X) break;
            if (Y/10<=0){
                return -1;
            }
            if (Y % 2 == 1)
                Y = (Y-1)/10;
            else
                Y /= 2;
            ans++;
        }

        return ans + X - Y;
    }
}
