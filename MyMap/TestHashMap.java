package MyMap;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"zhao");
        map.put(1,"qian");
        map.put(2,"sun");
        map.put(3,"li");
        System.out.println(map);
        System.out.println(map.get(1));
        System.out.println(map.get(2));
    }
}
