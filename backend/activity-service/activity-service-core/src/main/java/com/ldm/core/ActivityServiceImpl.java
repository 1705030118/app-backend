package com.ldm.core;

import com.ldm.api.ActivityService;
import com.ldm.dto.ActivityDTO;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RestController;

@RefreshScope
@RestController
public class ActivityServiceImpl implements ActivityService {
    @Override
    public ActivityDTO get(int activityId) {
        ActivityDTO activityDTO=new ActivityDTO();
        activityDTO.setContent("这是活动内容");
        activityDTO.setActivityId(activityId);
        return activityDTO;
    }
}
