import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class person_info {
    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入姓名：");
//        String name = sc.next();
//        System.out.println("请输入身高：");
//        String height = sc.next();
//        System.out.println("请输入年龄：");
//        String age = sc.next();
//        System.out.println("姓名：" + name);
//        System.out.println("年龄：" + age);
//        System.out.println("身高：" + height + "cm");

        Scanner sc = new Scanner(System.in);
        HashMap<String , Object> personInfo = new HashMap<>();
        System.out.println("请输入姓名");
        personInfo.put("姓名", sc.next());
        System.out.println("请输入身高");
        personInfo.put("身高", sc.nextInt());
        System.out.println("请输入年龄");
        personInfo.put("年龄", sc.nextInt());

        Set<Map.Entry<String,Object>> person = personInfo.entrySet();
        for (Map.Entry<String, Object> data: person){
            Object value = data.getValue();
            String key = data.getKey();
            System.out.println(key + " : " + value);
        }
    }
}
