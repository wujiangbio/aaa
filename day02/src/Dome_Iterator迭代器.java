import org.w3c.dom.stylesheets.LinkStyle;

import java.util.ArrayList;
import java.util.Iterator;

public class Dome_Iterator迭代器 {
    public static void main(String[] args) {
 //Iterator是一个接口  他跟Calendar日历类一样,可以调方法创建对象
        ArrayList<String> list = new ArrayList<>();
        Iterator it = list.iterator();
        //他有两个方法,hasNext是判断是否还有下一个元素
        //next是输出下一个元素. 所以正好\和while循环形成遍历集合的好方法!

        //*****注意  next()每走一次,下一次都不同  不要以为在同一次循环里就是相同的!!!

        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
