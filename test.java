import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("请输入一个整数,输入'q'退出");
            if (input.hasNextInt()) {
                if ((input.nextInt()) % 2 == 0) {
                    System.out.println("是偶数");
                } else {
                    System.out.println("不是偶数");
                }
            } else if ("q".equals(input.next())){
                System.out.println("end");
                break;}
            else {
                System.out.println("请输入整数");
            }
        }
    }
}