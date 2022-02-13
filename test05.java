import java.util.Scanner;

public class test05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入Jack的年龄");
        int jack_age = sc.nextInt();
        System.out.println("请输入Tom的年龄");
        int tom_age = sc.nextInt();
        int diff = jack_age - tom_age;
        if (diff>0) {
            System.out.printf("Jack比Tom大%d岁",diff);
        }
        else if (diff == 0){
            System.out.println("两者同岁");
        }
        else {
            System.out.printf("Tom比Jack大%d岁",diff*-1);
        }
    }
}
