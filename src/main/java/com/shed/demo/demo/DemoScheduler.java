package com.shed.demo.demo;

import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import net.javacrumbs.shedlock.core.SchedulerLock;

/**
 * Created by antoine on 30/06/17.
 */
@Component
@Slf4j
public class DemoScheduler {

    @Scheduled(fixedRate = 6000)
    @SchedulerLock(name = "scheduledTaskName")
    public void doLog() throws InterruptedException {
        log.info("start : {}", new Date());
        Thread.sleep(2000);
        log.info("     end : {}", new Date());
    }
}
