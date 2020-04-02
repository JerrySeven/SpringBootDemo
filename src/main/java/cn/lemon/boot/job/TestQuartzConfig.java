package cn.lemon.boot.job;

import org.quartz.JobBuilder;
import org.quartz.JobDataMap;
import org.quartz.JobDetail;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestQuartzConfig {

    @Bean
    public JobDetail testQuartzDetail(){
        return JobBuilder.newJob(TestQuartzJob.class)
                .withIdentity("testQuartz")
                .storeDurably()
                .requestRecovery(true)
                .build();
    }

    @Bean
    public Trigger testQuartzTrigger() {
        JobDataMap jobDataMap = new JobDataMap();
        jobDataMap.put("name", "lemon");

        SimpleScheduleBuilder ScheduleBuilder = SimpleScheduleBuilder
                .simpleSchedule()
                .withIntervalInSeconds(5)
                .repeatForever();
        return TriggerBuilder.newTrigger().forJob(testQuartzDetail())
                .withIdentity("testQuartz")
                .withSchedule(ScheduleBuilder)
                .usingJobData(jobDataMap)
                .build();
    }
}
