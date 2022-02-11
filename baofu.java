import com.sun.corba.se.impl.resolver.SplitLocalResolverImpl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class baofu {

    public static void main(String[] args) {
      for (int i=0;i<10;i++){
          List<Integer> num_pool = baofu.numPool(1, 33);
          List<Integer> my_yellow = baofu.chooseNum(num_pool, 6);
          List<Integer> num_pool2 = baofu.numPool(1, 16);
          List<Integer> my_blue = baofu.chooseNum(num_pool2, 1);
          List<Integer> my_blue2 = baofu.chooseNum(num_pool2, 2);
          System.out.println("红色号码："+my_yellow.toString());
          System.out.println("蓝色号码："+my_blue.toString());
          System.out.println("复式蓝色号码："+my_blue2.toString()+"\n");
      }

    }

    public baofu() {
    }

    private static List<Integer> numPool(int start, int end){
        List<Integer> pool = new ArrayList<>(end-start+1);
        for (int i=start;i<=end;i++){
            pool.add(i);
        }
        return pool;
    }

    public static void remove(List<Integer> list, int target) {
        list.removeIf(item -> item.equals(target));
    }

    private static List<Integer> chooseNum(List<Integer> pool,int num){
        Random random = new Random();
        List<Integer> yellow_ball = new ArrayList<>(num);
        for (int i=0;i<num;i++){
            int point = random.nextInt(pool.size());
            int random_num = pool.get(point);
            yellow_ball.add(random_num);
            remove(pool,random_num);
        }
        return yellow_ball;
    }
}
