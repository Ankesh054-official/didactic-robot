package CodeNotes.Map.hasedMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        HashMap<Object,Object> hm = new HashMap();

        hm.put("Name", "Ankesh");
        hm.put("Id", 1);
        hm.put(1,"Ankesh");

//        System.out.println(hm.keySet());
//        System.out.println(hm.values());
//        System.out.println(hm.get("Id"));
//        System.out.println(hm.size());
//        System.out.println(hm.containsKey("Name"));
//        System.out.println(hm.containsValue("Ankesh"));
//        System.out.println(hm.remove(1));

        Set set = hm.entrySet();
        Iterator i = set.iterator();
        while(i.hasNext()){
            Map.Entry x = ((Map.Entry) i.next());
            Object key = x.getKey();
            if(key.equals(1)){
                x.setValue("Alpha");
            }
        }

        for (Map.Entry entry: hm.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println(hm);



    }
}
