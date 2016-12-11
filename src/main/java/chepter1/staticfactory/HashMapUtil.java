package chepter1.staticfactory;


import java.util.HashMap;

public class HashMapUtil {

    private HashMapUtil(){};

    public static <K,V> HashMap<K, V> newInstance(){
        return new HashMap<K, V>();
    }



}
