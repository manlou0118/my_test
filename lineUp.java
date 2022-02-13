import java.util.Arrays;

public class lineUp {

    public int[] doLine(int[] line){
        int[] line_up = new int[line.length];
        int i;
        //{1,1,2,3})
        for (i = 0; line.length-1 > i; i++){
            for (int j = 1 + i; line.length > j; j++){
                if (line[j] > line[i]){
                    line_up[i] = j + 1;
                    break;
                }
            }
        }
        return line_up;
    }

    public static void main(String[] args) {
        lineUp myline = new lineUp();
        int[] ints = myline.doLine(new int[]{1,1,2,3});
        System.out.println(Arrays.toString(ints));}}