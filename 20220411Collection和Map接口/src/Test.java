import java.security.Key;
import java.util.*;

public class Test {
    public static void main(String[] args) {//哈希表
        Map<String,String> map = new HashMap<>();//
        System.out.println(map);
        System.out.println(map.isEmpty());//是否为空
        System.out.println(map.size());//键值对的个数
        map.put("country","US");//在哈希表中放入kv对
        map.put("city","New York");
        System.out.println(map);
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        System.out.println(map.containsKey("city"));//查询是否存在key值
        System.out.println(map.containsValue("US"));//查询是否存在Value值
        System.out.println(map.get("city"));//根据key查询value
        System.out.println(map.getOrDefault("human","none"));//根据key查询value,没有则用默认值替代
        for (Map.Entry<String,String> entry: map.entrySet()) {//将所有键值对返回
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }
    public static void main1(String[] args) {
        Collection<String> list = new ArrayList<>();//<>中限制了类型为字符串
        list.add("Hello");                          //也可以不加限制，什么类型都可以放入
        list.add("China");
        System.out.println(list);
        System.out.println(list.isEmpty());//判断是否为空
        System.out.println(list.remove("Hello"));//如果集合list里面有要求的元素则删除它返回true，否则返回false
        System.out.println(list);
        list.add("America");
        System.out.println(list.size());//返回list里面元素个数
        Object array = list.toArray();//返回一个装有所有集合中元素的数组
    }
}
