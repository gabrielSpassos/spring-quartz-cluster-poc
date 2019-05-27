package com.gabrielspassos.poc.configs;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ScheduleConfig {

    static String A_JOB_CRON_SCHEDULE;
    static String B_JOB_CRON_SCHEDULE;
    static String C_JOB_CRON_SCHEDULE;

    @Value("${schedule.cron.jobs.a}")
    public void setAJobCronSchedule(String aJobCronSchedule) {
        A_JOB_CRON_SCHEDULE = aJobCronSchedule;
    }

    @Value("${schedule.cron.jobs.b}")
    public void setBJobCronSchedule(String bJobCronSchedule) {
        B_JOB_CRON_SCHEDULE = bJobCronSchedule;
    }

    @Value("${schedule.cron.jobs.c}")
    public void setCJobCronSchedule(String cJobCronSchedule) {
        C_JOB_CRON_SCHEDULE = cJobCronSchedule;
    }
}
