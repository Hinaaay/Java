import java.util.Random;


public class Week7 {
    static Random random=new Random();
    public static void test(){
        System.out.println("第一题：\n-----------------------------------");
        System.out.println(task1("abbc","dog cat cat fish"));
        System.out.println("第二题：\n-----------------------------------");
        System.out.println(task2(new int[]{1,2,2,3,0}));
        System.out.println("第三题：\n-----------------------------------");
        for(int i=0;i<5;i++){
            int target = random.nextInt(15) - 3;
            System.out.println("target:"+target+"\tresult"+task3(new int[]
                    {0,4,5,6,8},target));
        }
    }
    public static void main(String[] args) {
        test();
    }
    public static boolean task1(String pattern, String str) {
//第一题代码
        boolean res=true;
        String[] san = str.split(" ");
        char[] pat = new char[san.length];
        int k = -1;
        for(int i = 0;i < san.length;i++){
            String mod = san[i];
            boolean flat = true;
            for(int j=0;j<i;j++){
                if(mod.equals(san[j])) {
                    flat = false;
                    break;
                }
            }
            if(flat) k+=1;
            pat[i] = (char)('a' + k);
        }
        String pat2 = String.valueOf(pat);
        System.out.println(pat2);
        if(!pattern.equals(pat2)) res = false;

        return res;
    }
    public static int task2(int[] nums) {
//第二题代码
        int res;
        for (int i=0;i<nums.length;i++) {
            for (int j=i+1;j<nums.length;j++) {
                if (nums[i] == nums[j]) {
                    res = nums[i];
                    return res;
                }
            }
        }

        return 0;
    }
    public static int task3(int []nums,int target){
//第三题代码
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -(left + 1);
    }
}