import java.util.ArrayList;
import java.util.List;

public class TestGet {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("love");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}
