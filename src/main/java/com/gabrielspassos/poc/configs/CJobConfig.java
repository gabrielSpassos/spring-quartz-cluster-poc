package com.gabrielspassos.poc.configs;

import com.gabrielspassos.poc.jobs.CJob;
import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CJobConfig {

    @Bean
    public JobDetail jobCDetails() {
        return JobBuilder
                .newJob(CJob.class)
                .withIdentity("sampleJobC")
                .storeDurably()
                .build();
    }

    @Bean
    public Trigger jobCTrigger() {
        return TriggerBuilder
                .newTrigger()
                .forJob(jobCDetails())
                .withIdentity("sampleTriggerC")
                .withSchedule(CronScheduleBuilder.cronSchedule(ScheduleConfig.C_JOB_CRON_SCHEDULE))
                .build();
    }
}
