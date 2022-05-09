import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class test09 {
    public static void main(String[] args) {
        test09 dowhat = new test09();
        dowhat.timeAndWeather();
    }

    public static void timeAndWeather(){
        Scanner input = new Scanner(System.in);
        Date date = new Date();
        SimpleDateFormat datefm = new SimpleDateFormat("EEEE");
        String daynum = datefm.format(date);
        System.out.println("今天是： " + daynum);
        System.out.println("请输入天气：\n 1 代表晴天，\n 2 代表雨天");
        String weather = input.next();
        if ("星期天".equals(daynum) || "星期六".equals(daynum)){
            if ("1".equals(weather)){
                System.out.println("粗去玩呀");
            }
            else if ("2".equals(weather)){
                System.out.println("搁家躺好");
            }
            else {
                System.out.println("请输入合法内容");
            }
        }else {
            System.out.println("老实上班");
        }
    }

}
