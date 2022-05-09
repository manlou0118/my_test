import com.sun.deploy.util.StringUtils;

import java.security.DigestInputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class test04 {
    private static DigestInputStream Joiner;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        String num = sc.next();
        String revice = "";
        for(int i=num.length()-1;i>=0;i--) {
            revice += num.charAt(i);
        }
        System.out.println(revice);
    }
}
