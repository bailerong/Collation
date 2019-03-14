import java.util.LinkedList;
import java.util.List;

public class TestLinkList {
    public static void main(String[] args) {
        List<String> list=new LinkedList<>();
        list.add("hello");
        list.add("hello");
        list.add("world");
        System.out.println(list);
        list.remove("hello");
        System.out.println(list);
    }
}
