import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test03 {
    public static void main(String[] args) {
        List<Float> grade = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入Java成绩");
        grade.add(sc.nextFloat());
        System.out.println("请输入Oracle成绩");
        grade.add(sc.nextFloat());
        System.out.println("请输入Html成绩");
        grade.add(sc.nextFloat());
        float sum = 0;
        for (float gr : grade){
            sum += gr;
        }
        //float avg = sum / grade.size();
        BigDecimal bigd = new BigDecimal(sum/grade.size()).setScale(2, BigDecimal.ROUND_UP);;
        System.out.println("--------------------------");
        System.out.println("Java    " + "Oracle    " + "Html");
        System.out.println(grade.get(0) + "   " + grade.get(1) + "   " + grade.get(2));
        System.out.println("---------------------------");
        System.out.println(bigd);
    }
}
