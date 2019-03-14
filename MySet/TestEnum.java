package MySet;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class TestEnum {
    public static void main(String[] args) {
        List<String> list=new Vector<>();
        list.add("我");
        list.add("爱");
        list.add("你");
        //这里我们的Enumeration是专门为Vector写的，所以我们只需要继承到Vector便可以，
        //不需要继续向上继承。
        Enumeration<String> enumeration=((Vector<String>) list).elements();
        while(enumeration.hasMoreElements()){
            System.out.println(enumeration.nextElement());
        }
    }
}
