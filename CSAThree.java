package practice;

import java.util.Scanner;

public class CSAThree {
	public static void main(String[] args) {	
		int n = 10;
		int m = 2;
		
		UseCompute uc = new UseCompute();
		uc.useCom(new Addition(), n, m);
		uc.useCom(new Subtraction(), n, m);
		uc.useCom(new Division(), n, m);
		uc.useCom(new Mutiplication(), n, m);
		
		Score sc = new Score();
		try {
			sc.examine(75);
			sc.examine(156);
		}
		catch(ScoreException e) {
			e.warnMessage();
		}
	
		int sum = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("请输入N的值：");
		int N = in.nextInt();
		try {
			for(int i=0;i<N;i++) {
				System.out.println("请输入整数的值：");
				int x = in.nextInt();
				if(x < 0) throw new MeanException();
				else sum += x;
			}
		}
		catch(MeanException e) {
			e.warnMessage();
			System.out.println("请输入整数的值：");
			int x = in.nextInt();
			sum += x;
		}
		finally {
			System.out.println("N个整数的均值为：" + sum/N);
		}
		in.close();
		
		Employees emp = new Employees();
		System.out.println(emp.toString());
		
		 String S = "abcde";
	     String[] words = {"a", "bb", "acd", "ace"};
	     System.out.println(countSubsequences(S, words));
	}
	
	public static int countSubsequences(String S, String[] words) {
        int count = 0;
        for (String word : words) {
            if (isSubsequence(S, word)) {
                count++;
            }
        }
        return count;
    }

    private static boolean isSubsequence(String s, String word) {
        int i = 0, j = 0;
        while (i < s.length() && j < word.length()) {
            if (s.charAt(i) == word.charAt(j)) {
                j++;
            }
            i++;
        }
        return j == word.length();
    }
	
}

interface Compute{
	public abstract int computer(int n,int m);
}

class Addition implements Compute{
	public int computer(int n,int m) {
		return m+n;
	}
}
	
class Subtraction implements Compute{
	public int computer(int n,int m) {
		return n-m;
	}
}

class Division implements Compute{
	public int computer(int n,int m) {
		return n/m;
	}
}

class Mutiplication implements Compute{
	public int computer(int n,int m) {
		return n*m;
	}
}

class UseCompute{
	public void useCom(Compute com,int one,int two) {
		int result = com.computer(one, two);
		System.out.println("结果是："+result);
	}
}

class ScoreException extends Exception{
	private static final long serialVersionUID = 1L;

	public void warnMessage() {
		System.out.println("分数必须在0~100之间！");;
	}
}

class Score{
	public void examine(float x) throws ScoreException{
		if(0 <= x && x <= 100)System.out.println("成绩为："+x);
		else throw new ScoreException();
	}
}

class MeanException extends Exception{
	private static final long serialVersionUID = 1L;

	public void warnMessage() {
		System.out.println("N 必须是正数或者 0!");
	}
	
}

class MyDate{
	private int year;
    private int month;
    private int day;

    public String toString() {
        return year + "-" + month + "-" + day;
    }
}

abstract class Employee{
	private String name;
	private int number;
	private MyDate birthday;
	
	public abstract double earnings();
	
	public String toString() {
		return "Employee{name=" + name + ", number=" + number +
				", birthday=" + birthday + ", earnings="+this.earnings()+"}";
	}
}

class Employees extends Employee{
	public double earnings() {
		System.out.println("一分钱也没有！");
		return 0;
	}
}