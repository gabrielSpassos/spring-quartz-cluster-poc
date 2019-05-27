package com.gabrielspassos.poc.configs;

import com.gabrielspassos.poc.jobs.BJob;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BJobConfig {

    @Bean
    public JobDetail jobBDetails() {
        return JobBuilder
                .newJob(BJob.class)
                .withIdentity("sampleJobB")
                .storeDurably()
                .build();
    }

    @Bean
    public Trigger jobBTrigger() {
        return TriggerBuilder
                .newTrigger()
                .forJob(jobBDetails())
                .withIdentity("sampleTriggerB")
                .withSchedule(CronScheduleBuilder.cronSchedule(ScheduleConfig.B_JOB_CRON_SCHEDULE))
                .build();
    }
}
