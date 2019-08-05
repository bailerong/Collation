import java.util.ArrayList;
import java.util.List;
public class TestArrayList {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();//作为我们的List接口的三大子类之一
        System.out.println(list.size()+"/"+list.isEmpty());
        list.add("hello");
        list.add("hello");
        list.add("world");
        System.out.println(list.size()+""+list.isEmpty());
        System.out.println(list);
        System.out.println(list.remove("hello"));
        System.out.println(list.contains("ABC"));
        System.out.println(list.contains("world"));
        System.out.println(list);
    }
}
