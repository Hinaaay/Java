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
		System.out.println("Mysql\n-----------------------------");
        System.out.println("1、cqupt_students\ncreate table cqupt_student ( \n"
        		+ "	studentid VARCHAR (10),\n"
        		+ "	name VARCHAR (20),\n"
        		+ "	sex VARCHAR (2),\n"
        		+ "	age INTEGER, \n"
        		+ "	Fee DECIMAL (10, 2),\n"
        		+ "	address VARCHAR (50),\n"
        		+ "	memo VARCHAR (300)\n"
        		+ ");\n"
        		+ "");
        System.out.println("2、CourseAa\ncreate teble CourseAa ( \n"
        		+ "	Aa1 VARCHAR (20), \n"
        		+ "	Aa2 INTEGER, \n"
        		+ "	Aa3 DECIMAL (10)\n"
        		+ "	 );");
		System.out.println("3、ChooseBb\ncreate teble ChooseBb (\n"
				+ "	Bb1 VARCHAR (30),\n"
				+ "	Bb2 INTEGER,\n"
				+ "Bb3 DECIMAL (6));\n"
				+ "");
        System.out.println("4、alter table ChooseBb add Bb4 VARCHAR (20) NOT NULL DEFAULT '系统测试值';\n"
        		+ "");
        System.out.println("5、alter table ChooseBb add Bb5 VARCHAR (10) PRIMARY KEY;\n"
        		+ "");
        System.out.println("6、create view View_Choosebb as aelect\n"
        		+ "Bb1,\n"
        		+ "Bb4,\n"
        		+ "Bb5 \n"
        		+ "FROM\n"
        		+ "	ChooseBb;\n"
        		+ "");
        System.out.println("7、drop view View_Choosebb;");
        System.out.println("8、create index Index_bb2 on ChooseBb (Bb2);\n"
        		+ "");
        System.out.println("create index Index_bb4 on ChooseBb ( Bb4 );\n"
        		+ "");
        System.out.println("9、drop index Index_bb2 on ChooseBb;\n"
        		+ "");
        System.out.println("10、create table test ( \n"
        		+ "	Name VARCHAR (20), \n"
        		+ "	Age INTEGER, \n"
        		+ "	Score NUMERIC (10, 2), \n"
        		+ "	Address VARCHAR (60)\n"
        		+ " );\n"
        		+ "");
        System.out.println("11、insert into test\n"
        		+ "VALUES\n"
        		+ "	( \"赵一\", \"20\", \"580.00\", \"重邮宿舍 12-3-5\" ),\n"
        		+ "	( \"钱二\", \"19\", \"540.00\", \"南福苑 5-2-9\" ),\n"
        		+ "	( \"孙三\", \"21\", \"555.50\", \"学生新区 21-5-15\" ),\n"
        		+ "	( \"李四\", \"22\", \"505.00\", \"重邮宿舍 8-6-22\" ),\n"
        		+ "	( \"周五\", \"20\", \"495.50\", \"学生新区 23-4-8\" ),\n"
        		+ "	( \"吴六\", \"19\", \"435.00\", \"南福苑 2-5-12\" );\n"
        		+ "");
        System.out.println("12、create table test_temp ( \n"
        		+ "	Name VARCHAR ( 20 ), \n"
        		+ "	Age INTEGER, \n"
        		+ "	Score NUMERIC ( 10, 2 ),\n"
        		+ "	 Address VARCHAR ( 60 )\n"
        		+ " );\n"
        		+ "");
        System.out.println("13、insert into test_temp\n"
        		+ "VALUES\n"
        		+ "	( \"郑七\", \"21\", \"490.50\", \"重邮宿舍 11-2-1\" ),\n"
        		+ "	( \"张八\", \"20\", \"560.00\", \"南福苑 3-3-3\" ),\n"
        		+ "	( \"王九\", \"10\", \"515.00\", \"学生新区 19-7-1\" );\n"
        		+ "");
        System.out.println("14、insert into test ( Name, Age, Score, Address ) select Name\n"
        		+ ",\n"
        		+ "Age,\n"
        		+ "Score,\n"
        		+ "Address \n"
        		+ "from\n"
        		+ "	test_temp;\n"
        		+ "");
        System.out.println("15、update test \n"
        		+ "set Score = Score + 5 \n"
        		+ "where\n"
        		+ "	Age <= 20; ");
        System.out.println("16、update test set Age = Age - 1 where Address like \"南福苑%\"; "
        		+ "");
        System.out.println("17、delete from test where Age >= 21 \n"
        		+ "and Score >= 500;\n"
        		+ "");
        System.out.println("18、delete from test where Score <= 550 \n"
        		+ "	and Address like \"重邮宿舍%\";\n"
        		+ "");
        System.out.println("19、create table Student (\n"
        		+ "	Sno VARCHAR (20), \n"
        		+ "	Name VARCHAR (10), \n"
        		+ "	Age INTEGER,\n"
        		+ "	College VARCHAR (30)\n"
        		+ " );\n"
        		+ "");
        System.out.println("20、create table Course ( \n"
        		+ "	CourseID VARCHAR (15),\n"
        		+ "	 CourseName VARCHAR (30), \n"
        		+ "	CourseBeforeID VARCHAR (15) \n"
        		+ ");");
        System.out.println("21、create table Choose ( \n"
        		+ "	Sno VARCHAR (20),\n"
        		+ "	 CourseID VARCHAR (30), \n"
        		+ "	Score DECIMAL (5, 2)\n"
        		+ " );");
        System.out.println("22、insert into Student\n"
        		+ "VALUES\n"
        		+ "	( 'S00001', '张三', 20, '计算机学院' ),\n"
        		+ "	( 'S00002', '李四', 19, '通信学院' ),\n"
        		+ "	( 'S00003', '王五', 21, '计算机学院' );\n"
        		+ "");
        System.out.println("23、insert into Course\n"
        		+ "VALUES\n"
        		+ "	( 'C1', '计算机引论', NULL ),\n"
        		+ "	( 'C2', 'C语言', 'C1' ),\n"
        		+ "	( 'C3', '数据结构', 'C2' );\n"
        		+ "");
        System.out.println("24、insert into Choose\n"
        		+ "VALUES\n"
        		+ "	( 'S00001', 'C1', 95 ),\n"
        		+ "	( 'S00001', 'C2', 80 ),\n"
        		+ "	( 'S00001', 'C3', 84 ),\n"
        		+ "	( 'S00002', 'C1', 80 ),\n"
        		+ "	( 'S00002', 'C2', 85 ),\n"
        		+ "	( 'S00003', 'C1', 78 ),\n"
        		+ "	( 'S00003', 'C3', 70 );\n"
        		+ "");
        System.out.println("25、select Sno,Name from Student where College = '计算机学院';");
        System.out.println("26、select * from Student where Age between 20 and 23;\n");
        System.out.println("27、select COUNT(*) from Student;");
        System.out.println("28、select max( Score ) from Choose where CourseID = 'C1';\n"
        		+ "select min( Score ) from Choose where CourseID = 'C1';\n"
        		+ "select sum( Score ) from Choose where CourseID = 'C1';\n"
        		+ "select avg( Score ) from Choose where CourseID = 'C1';\n"
        		+ "");
        System.out.println("29、select CourseID,CourseName from Course where CourseBeforeID is NULL;");
        System.out.println("30、select Student.Sno,Name,CourseName,Score from Student,Course,Choose where Student.Sno = Choose.Sno and Choose.CourseID = Course.CourseID;\n"
        		+ "");
        System.out.println("31、select * from Student where College = ( SELECT College from Student where Name = '张三' );\n"
        		+ "");
        System.out.println("32、select Student.Sno,Score from Student,Course,Choose where Choose.Score <(\n"
        		+ "	select Score from Choose where CourseID = 'C1' and Student.`Name` = '张三' and Student.Sno = Choose.Sno \n"
        		+ "	) \n"
        		+ "	and Choose.CourseID = 'C1';\n");
        System.out.println("33、select Sno from Choose where CourseID = 'C1' union\n"
        		+ "select Sno from Choose where CourseID = 'C3';");
        System.out.println("34、select DISTINCT Sno from Student where Sno in ( select Sno from Choose where CourseID = 'C1' ) union\n"
        		+ "select DISTINCT Sno from Student where Sno in (select Sno from Choose where CourseID = 'C3' );");
        
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
