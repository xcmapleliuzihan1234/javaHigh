import com.sun.org.apache.xalan.internal.xsltc.dom.UnionIterator;

import java.util.*;

public class map {
    public static void main(String[] args) {
        Map map=new HashMap();
        map.put("AA",123);
        map.put(45,123);
        map.put("BB",56);
        //遍历所有的key集：keySet
        Set set=map.keySet();
        Iterator iterator=set.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println();
        //遍历所有的value集：values
        Collection values = map.values();
        for (Object obj:values){
            System.out.println(obj);
        }
        System.out.println();
     //遍历所有的key-value对
        Set set1 = map.entrySet();
        Iterator iterator1 = set1.iterator();
        while (iterator1.hasNext()){
            Object obj= iterator1.next();
           Map.Entry entry= (Map.Entry) obj;
            System.out.println(entry.getKey()+"---->"+entry.getValue());
        }

    }

}
