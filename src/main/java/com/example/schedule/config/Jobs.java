package com.example.schedule.config;

import com.example.schedule.dao.LoginRepository;
import com.example.schedule.dao.WalksRepository;
import com.example.schedule.service.WalksService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * 自定义的Job任务类
 */
@Component
public class Jobs {
    @Resource
    private WalksService walksService;

    @Scheduled(cron = "0 36 0 * * ? ")
    public void updateTodayWalks() throws Exception {
        walksService.updateWalks();
    }

}
