package me.seoyeon.springtechcore.repository;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

@Repository
public class SampleDB {

    private static Map<String, String> database;

    private static Map<String, Integer> checkDataBase;

    static{
        database = new HashMap<>();
        database.put("1", "apple");
        database.put("2", "banana");

        checkDataBase = new HashMap<>();
        checkDataBase.put("1", 0);
        checkDataBase.put("2", 0);
    }

    public void insert(String key, String value){
        database.put(key, value);
    }

    public Optional<String> get(String key){
        System.out.println("db Thread Name : " + Thread.currentThread().getName());
        String tmp = database.get(key);
        if(StringUtils.hasLength(tmp)){
            return Optional.of(tmp);
        }
        return Optional.empty();
    }

    //@Async
    public void addLog(String key) throws Exception {
        System.out.println("log Thread Name : " + Thread.currentThread().getName());
        throw new Exception();
        //int sum = checkDataBase.get(key);
        //sum += 1;
        /**
        checkDataBase.put(key, sum);
        System.out.println("================");
        System.out.println("apple : " + checkDataBase.get("1"));
        System.out.println("banana : " + checkDataBase.get("2"));
        System.out.println("=================");
         **/
    }




}
