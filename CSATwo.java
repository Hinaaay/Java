package practice;

import java.util.ArrayList;
import java.util.List;

public class CSATwo {
	public static void main(String[] args) {
		
		System.out.println("<-------第一题------->");
		String name = "Java Programming";	
		String writer = "John Smith";
		int year = 2022;
		
		Book book = new Book(name,writer,year);
		book.displayInfo();
		
		System.out.println("<-------第二题------->");
		int carloader = 3;
		int truckloader = 2;
		int payload = 5500;
		Car car = new Car("Car","Bule",80,4,carloader);
		System.out.println("---------------------------------------------");
		Truck truck = new Truck("Truck","Red",65,6,truckloader,payload);
		
		
		System.out.println("<-------第三题------->");
		double a = 3;
		double b = 2;
		Calculator c = new Calculator();
		System.out.println("Addition:" + c.add(a, b));
		System.out.println("Subtraction:" + c.subtract(a, b));
		System.out.println("Multiplication:" + c.multiply(a, b));
		System.out.println("Division:" + c.divide(a, b));
		System.out.println("Getsum:" + getSum("5555","666666"));
		
		System.out.println("<-------第四题------->");
		String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Longest common prefix: " + longesttCommonPrefix(strs1)); 
        
        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Longest common prefix: " + longesttCommonPrefix(strs2));
        
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
	
	public static String getSum(String a,String b){ 
		List<Integer> la = new ArrayList<Integer>(); 
		List<Integer> lb = new ArrayList<Integer>(); 
		String c = ""; 
		for(int i = a.length()-1;i >= 0;--i){ 
			la.add(a.charAt(i)-'0'); 
		} 
		for(int i = b.length()-1;i >= 0;--i){ 
			lb.add(b.charAt(i)-'0'); 
		} 
		int x = 0;
		int y = 0;
		List<Integer> result = new ArrayList<Integer>(); 
		for(int i = 0;i < Math.max(a.length(), b.length());i++) {
			int sum = x;
			if(i < a.length()) sum += la.get(i);
			if(i < b.length()) sum += lb.get(i);
			x = sum/10;
			y = sum%10;
			result.add(y);
		}
		List<String> strresult = new ArrayList<>();
        for (Integer num : result) {
            strresult.add(String.valueOf(num));
        }
		String m = String.join("", strresult); //要求为字符串列表
		c = reverseStr(m);
		return c; 
		}
	
	public static String longesttCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }

        return prefix;
    }
	
}