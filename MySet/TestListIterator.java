package MySet;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class TestListIterator {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("我");
        list.add("爱");
        list.add("你");
        ListIterator<String> listIterator=list.listIterator();
        System.out.println("");
        System.out.println("由前向后输出");
        while(listIterator.hasNext()){
            System.out.print(listIterator.next()+"、");
        }
        System.out.println("");
        System.out.println("由后向前输出");
        while(listIterator.hasPrevious()){
            System.out.print(listIterator.previous()+"、");
        }
    }
}
