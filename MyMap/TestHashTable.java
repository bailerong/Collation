package MyMap;

import java.util.Hashtable;
import java.util.Map;

public class TestHashTable {
    public static void main(String[] args) {
        Map< Integer,String> map=new Hashtable<>();
        map.put(1,"zhao");
        map.put(1,"qian");
        map.put(2,"sun");
        map.put(3,"li");
        System.out.println(map);
    }
}
