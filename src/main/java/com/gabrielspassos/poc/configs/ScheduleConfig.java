package com.gabrielspassos.poc.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ScheduleConfig {

    public static String A_JOB_CRON_SCHEDULE;
    public static String B_JOB_CRON_SCHEDULE;

    @Value("${schedule.cron.job.a}")
    public void setAJobCronSchedule(String aJobCronSchedule) {
        A_JOB_CRON_SCHEDULE = aJobCronSchedule;
    }

    @Value("${schedule.cron.job.b}")
    public void setBJobCronSchedule(String bJobCronSchedule) {
        B_JOB_CRON_SCHEDULE = bJobCronSchedule;
    }
}
