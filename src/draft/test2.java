package draft;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class test2{
    public static void main(String[] args) {
        Map<Object, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put(1,"hashMap");
        objectObjectHashMap.put(1,"hashMap1");
        System.out.println(objectObjectHashMap.get(1));
        Hashtable<Object, Object> objectObjectHashtable = new Hashtable<>();
        objectObjectHashMap.put(111,null);
        System.out.println(objectObjectHashtable.get(111));
        new LinkedHashSet();
        new ArrayList<>();
        new ConcurrentHashMap();

        List<Object> objects = new LinkedList<>();
        new ConcurrentHashMap<>();
    }
}
