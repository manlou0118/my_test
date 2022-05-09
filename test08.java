import java.util.Scanner;

public class test08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max,min;
        System.out.println("请输入三个整数");
        max = sc.nextInt();
        int num_2 = sc.nextInt();
        if (num_2 > max) {
            min = max;
            max = num_2;
        }
        else {
            min = num_2;
        }
        int num_3 = sc.nextInt();
        if (num_3 > max) {
            max = num_3;
        }
        else if (num_3 < min){
            min = num_3;
        }
        System.out.println("最大值： " + max);
        System.out.println("最小值： " + min);
    }


}
