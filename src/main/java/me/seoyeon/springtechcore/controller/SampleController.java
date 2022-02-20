package me.seoyeon.springtechcore.controller;


import me.seoyeon.springtechcore.event.Log;
import me.seoyeon.springtechcore.service.SampleService;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    private SampleService sampleService;

    public SampleController(SampleService sampleService){
        this.sampleService = sampleService;
    }

    @GetMapping("/data")
    public String getData(@RequestParam(value = "key") String key) throws Exception{
        if("1".equals(key) || "2".equals(key)) {
            sampleService.addLog(key);
        }
        System.out.println("controller Thread Name : " + Thread.currentThread().getName());
        return sampleService.getData(key);
    }

}
