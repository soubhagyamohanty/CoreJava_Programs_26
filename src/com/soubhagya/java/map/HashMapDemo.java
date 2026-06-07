package com.soubhagya.java.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>();
        map.put("A",1);
        map.put("B",2);
        map.put("C",3);
        map.put("D",4);
        map.put("E",5);
        map.put("F",6);
        map.put("G",7);
        for(Map.Entry<String,Integer> input:map.entrySet()) {
            //System.out.println("Key:"+input.getKey()+" Value:"+input.getValue());
        }
            // 2nd Approach
            for(String key : map.keySet()) {
                //System.out.println("Key:"+key+" Value:"+map.get(key));
                // System.out.println(key);
            }
                //3rd Approach
                for(Integer value : map.values()){
                    //System.out.println(value);
                }
                //4th approach
                map.forEach((key1,value1)->
                        System.out.println(key1+"----->"+value1));
            }
        }


