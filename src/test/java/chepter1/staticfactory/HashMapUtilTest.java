package chepter1.staticfactory;

import org.junit.Test;

import java.util.List;
import java.util.Map;

public class HashMapUtilTest {

    @Test
    public void testHashMapUtil(){
      Map<String,List<String>> stringListMap= HashMapUtil.newInstance();
    }
}