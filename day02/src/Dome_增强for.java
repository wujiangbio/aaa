import java.util.ArrayList;
import java.util.Collections;

public class Dome_增强for {
    public static void main(String[] args) {
        //增强for\ 又叫foreah 是用来遍历集合的
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5);
        for (int a : list) {
            System.out.println(a);
        }
    }

}
