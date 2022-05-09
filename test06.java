import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test06 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个数作为交换");
        int a = sc.nextInt();
        int b = sc.nextInt();
          // 第一种
//        int z = 0;
//        z = a;a = b; b = z;
//        System.out.printf("两个数分别是%d和%d",a,b);

        //第二种
        List<Integer> num = new ArrayList<>();
        num.add(0,a);
        num.add(1,b);
        System.out.printf("两个数分别是%d和%d", num.get(1),num.get(0));
    }
}
