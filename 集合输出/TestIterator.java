package 集合输出;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TestIterator {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("hello");
        Iterator<String> iterator=list.iterator();

        while(iterator.hasNext()){
            String str=iterator.next();
            if(str.equals("hello")){
                iterator.remove();
                continue;
            }
            System.out.println(str);
        }

    }
}
