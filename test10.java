import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test10 {
    public static void main(String[] args) {
        int[] mylist = new int[3];
        System.out.println("请输入三角形第一条变长，范围1-100");
        mylist[0] = scope();
        System.out.println("请输入三角形第二条变长，范围1-100");
        mylist[1] = scope();
        System.out.println("请输入三角形第三条变长，范围1-100");
        mylist[2] = scope();
        int[] newlist = sort(mylist);
        int one = newlist[0];
        int two = newlist[1];
        int three = newlist[2];
        if (one > two + three || two > one + three || three > one + two){
            System.out.println("三角形变长错误");
        }else if (one == two & one == three){
            System.out.println("等边三角形");
        }else if (one == two || one == three || two == three){
            System.out.println("等腰三角形");
        }else if (one * one + two * two == three * three){
            System.out.println("直角三角形");
        }else {
            System.out.println("普通三角形");
        }
    }
    private static int scope(){
        Scanner input = new Scanner(System.in);
        int num = 0;
        if (input.hasNextInt()){
            num = input.nextInt();
            if (num > 100 || num < 1){
                System.out.println("输入超出范围,请出入合法数字");
                scope();
            }
        }
        return num;
    }
    private static int[] sort(int[] args){
        int length = args.length;
        for (int i = 0;i < length;i ++){
            for (int j = i; j < length; j++){
                if (args[i] > args[j]){
                    int z = args[i];
                    args[i] = args[j];
                    args[j] = z;
                }
            }
        }
        return args;
    }
}
