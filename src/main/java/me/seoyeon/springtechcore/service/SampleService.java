package me.seoyeon.springtechcore.service;


import me.seoyeon.springtechcore.repository.SampleDB;
import org.springframework.stereotype.Service;

@Service
public class SampleService {

    private SampleDB sampleDB;

    public SampleService(SampleDB sampleDB){
        this.sampleDB = sampleDB;
    }

    public String getData(String key){
        System.out.println("service Thread Name : " + Thread.currentThread().getName());
        return sampleDB.get(key).orElse("");
    }

    public void insertData(String key, String value){
        sampleDB.insert(key, value);
    }


    public void addLog(String key) throws Exception{
        sampleDB.addLog(key);
    }

}
