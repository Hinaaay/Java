package practice;

import java.util.ArrayList;
import java.util.List;

public class CSAFour {

	public static void main(String[] args) {
		System.out.println("1、整数反转----------------");
		int x = -321;
		System.out.println(x+"反转后："+reverse(x));
		
		System.out.println("2、爬楼梯------------------");
		int n = 3;
		System.out.println(n+"阶楼梯共有"+climb(n)+"种方法");
		
		System.out.println("3、求子集------------------");
		int[] nums = {1, 2, 3};
        System.out.println(subsets(nums));
		
	}
	
	public static int reverse(int x) {
		int result = 0;
        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; 
            }
            if (result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; 
            }
            result = result * 10 + digit;
        }
        return result;
	}
	
	public static int climb(int n) {
		if(n <= 2) return n;
		int[] a = new int[n+1];
		a[1] = 1;
		a[2] = 2;
		for(int i=3;i <= n;i++) {
			a[i] = a[i-1] + a[i-2];
		}
		return a[n];
	}
	
	public static List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums, 0);
        return result;
    }
	
	private static void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start) {
        result.add(new ArrayList<>(tempList));
        for (int i = start; i < nums.length; i++) {
            tempList.add(nums[i]);
            backtrack(result, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
	
}
