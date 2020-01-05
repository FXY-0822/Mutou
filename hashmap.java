

package com.map.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
　　public static void main(String[] args) {
　　　　Map<Integer,String> map = new HashMap<Integer,String>();
　　　　map.put(1, "cat");
　　　　map.put(2, "dog");
　　　　map.put(3, "tiger");
　　　　map.put(3, "tree");
　　　　map.put(4, "elephent");

　　　　Set<Integer> set = map.keySet();
　　　　for(Integer i : set){
　　　　　　String value = map.get(i);
　　　　　　System.out.println("编号："+i+"动物是："+value);
　　　　}

　　　　System.out.println("--------------------------");

　　　　Set<Map.Entry<Integer, String>> allEntry = map.entrySet();
　　　　for(Map.Entry<Integer, String> entry : allEntry){
　　　　　　Integer key = entry.getKey();
　　　　　　String value = entry.getValue();
　　　　　　System.out.println("编号："+key+"动物是："+value);
　　　　}
　　}
}

输出结果：

编号：1动物是：cat
编号：2动物是：dog
编号：3动物是：tree
编号：4动物是：elephent
--------------------------
编号：1动物是：cat
编号：2动物是：dog
编号：3动物是：tree
编号：4动物是：elephent