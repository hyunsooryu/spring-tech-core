package me.seoyeon.springtechcore.event;

import me.seoyeon.springtechcore.repository.SampleDB;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class LogEventListener {

    private final SampleDB sampleDB;

    public LogEventListener(SampleDB sampleDB){
        this.sampleDB = sampleDB;
    }

    @EventListener(Log.class)
    public void listenLog(Log log) throws Exception{
        String key = log.getKey();
        if("1".equals(key) || "2".equals(key)){
            sampleDB.addLog(key);
        }
    }
}
