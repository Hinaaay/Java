package practice;

import java.util.*;

public class CSAOne {
	
	
	public static void main(String[] args) {
		System.out.println("1、B 2、B 3、D 4、B 5、D \n");
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("请输入想要打印的等腰三角形的行数：");
		int s1 = in.nextInt();
		showTriangle(s1);
		
		System.out.println("请输入一个正整数：");
		String s2 = in.next();
		reverseSUM(s2);
		
		System.out.println("判断回文数，请输入一个正整数：");
		int s3 = in.nextInt();
		isPalindrome(s3);
		
		ShuiXianHua();
		
		arraysDemo();
		
		System.out.println("思考：函数有返回值只需更改void为具体返回值类型即可");
		System.out.println("思考：由于方法如果去掉static关键字后就变成了非静态方法，\n"
				+ "    而非静态方法是需要通过创建实例对象来调用的，所以去掉static关键字后就无法直接调用");
		in.close();
	}
	
	public static void showTriangle(int n) {
		for(int i=1;i<=n;i++) {
			for(int k=n-i;k>=0;k--) {
				System.out.print(" ");
			}
			for(int j=1;j<i*2;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void reverseSUM(String s) {
		int x = s.length();
		System.out.println("您输入的正整数的位数是：" + x);
		char[] chars = new char[x];
		for(int i=0;i < x;i++) {
			chars[i] = s.charAt(x-i-1);
		}
		String s1 = String.valueOf(chars); //字符数组转字符串
		System.out.println("您输入的正整数的逆序是：" + s1);
		System.out.println();
	}
	
	public static String reverseStr(String s) {
		int x = s.length();
		char[] chars = new char[x];
		for(int i=0;i < x;i++) {
			chars[i] = s.charAt(x-i-1);
		}
		String s1 = String.valueOf(chars);
		return s1;
	}
	
	public static void isPalindrome(int n) {
		String s = String.valueOf(n);
		int x = s.length();
		String left,right;
		if(x % 2 == 0) {
			left = s.substring(0,x/2);
			right = reverseStr(s.substring(x/2,x));
			if(left.equals(right)) System.out.println("是的");
			else System.out.println("不是");
		}
		else {
			left = s.substring(0,x/2);
			right = reverseStr(s.substring(x/2 + 1,x));
			if(left.equals(right)) System.out.println("是的");
			else System.out.println("不是");
		}
		System.out.println();
	}

	public static void ShuiXianHua() {
		for(int i=100;i < 1000;i++) {
			int n = i;
			int sum = 0;
			
			while(n > 0) {
				int x = n % 10;
				sum += Math.pow(x, 3);
				n /= 10;
			}
			if(sum == i) System.out.printf("%d ",sum);
		}
		System.out.println();
	}
	
	public static void arraysDemo() {
		int[] nums = {21, 11, 43, 23, 56, 9, 65, 78, 66, 38};
		int min = nums[0];
		int max = nums[0];
		for(int i = 0;i < nums.length;i++) {
			if(min > nums[i]) min = nums[i];
			else if (max < nums[i]) max = nums[i];
		}
		System.out.println("打印两个最值 "+min+","+max);
		System.out.println("打印最值之和 "+(min+max));
		System.out.println();
	}
	
}
