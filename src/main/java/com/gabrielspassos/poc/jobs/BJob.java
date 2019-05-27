package com.gabrielspassos.poc.jobs;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@DisallowConcurrentExecution
public class BJob implements Job {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        try {
            String id = context.getJobDetail().getKey().getName();
            logger.info("Executing B job, id {}", id);
        } catch (Exception e) {
            logger.error("Error at B job", e);
            throw new JobExecutionException(e);
        }
    }
}
