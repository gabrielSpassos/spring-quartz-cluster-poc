package com.gabrielspassos.poc.jobs;

import com.gabrielspassos.poc.services.CService;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

@DisallowConcurrentExecution
public class CJob implements Job {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private CService cService;

    @Autowired
    public CJob(CService cService) {
        this.cService = cService;
    }

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        try {
            String id = context.getJobDetail().getKey().getName();
            logger.info("Executing C job, id {}", id);
            Integer randomEvenNumber = cService.getRandomEvenNumber();
            logger.info("Randon even number is {}", randomEvenNumber);
        } catch (Exception e) {
            logger.error("Error at C job", e);
            throw new JobExecutionException(e);
        }
    }
}
