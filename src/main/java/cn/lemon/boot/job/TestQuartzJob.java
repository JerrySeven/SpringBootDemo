package cn.lemon.boot.job;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobDataMap;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

import java.util.Date;

@DisallowConcurrentExecution
public class TestQuartzJob extends QuartzJobBean {
    /**
     * Execute the actual job. The job data map will already have been
     * applied as bean property values by execute. The contract is
     * exactly the same as for the standard Quartz execute method.
     *
     * @param context
     * @see #execute
     */
    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        JobDataMap mergedJobDataMap = context.getMergedJobDataMap();
        JobDataMap jobDataMap = context.getJobDetail().getJobDataMap();
        System.out.println("Quartz定时任务== " + new Date() + "   jobDataMap =" + mergedJobDataMap.get("name"));
    }
}
