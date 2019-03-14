package MyMap;

import java.util.*;

public class TestMapIterator {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"zhang");
        map.put(2,"wang");
        map.put(3,"li");
        Set<Map.Entry<Integer,String>> set=map.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator=set.iterator();
        while(iterator.hasNext()){
            Map.Entry<Integer, String> entry=iterator.next();
            System.out.println(entry.getValue()+"、"+entry.getKey());
        }
    }
}
