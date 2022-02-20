package me.seoyeon.springtechcore.event;

public class Log {

    public Log(){}

    public Log(String key){
        this.key = key;
    }

    private String key;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Log{" +
                "key='" + key + '\'' +
                '}';
    }
}
