package MySet;

import java.util.ArrayList;
import java.util.List;

public class TestForeach {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("我");
        list.add("爱");
        list.add("你");
        for(String str:list){
            System.out.println(str);
        }

    }
}
