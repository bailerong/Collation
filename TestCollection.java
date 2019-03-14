import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class TestCollection {
    public static void main(String[] args) {
        Collection<String> list=new ArrayList<>();
        list.add("hello");
        list.add("world");
        list.add("hello");
        //Object主要类型应用于这个，因此向下转型，容易出现类型转换异常
        Object[] result=list.toArray();
        System.out.println(Arrays.toString(result));
    }
}
