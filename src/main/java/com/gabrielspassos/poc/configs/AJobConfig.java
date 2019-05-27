package com.gabrielspassos.poc.configs;

import com.gabrielspassos.poc.jobs.AJob;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AJobConfig {

    @Bean
    public JobDetail jobADetails() {
        return JobBuilder
                .newJob(AJob.class)
                .withIdentity("sampleJobA")
                .storeDurably()
                .build();
    }

    @Bean
    public Trigger jobATrigger() {
        return TriggerBuilder
                .newTrigger()
                .forJob(jobADetails())
                .withIdentity("sampleTriggerA")
                .withSchedule(CronScheduleBuilder.cronSchedule("0/2 * * ? * * *"))
                .build();
    }
}
