package cn.lemon.boot.job;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TestJob {

    @Scheduled(cron = "0/5 * * * * *")
    public void job(){
        System.out.println("2020我会翻身，加油");
    }
}
