package com.gabrielspassos.poc.jobs;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

@DisallowConcurrentExecution
public class BJob implements Job {

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {

    }
}
