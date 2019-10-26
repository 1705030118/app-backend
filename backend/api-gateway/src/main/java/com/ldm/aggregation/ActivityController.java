package com.ldm.aggregation;

import com.ldm.api.ActivityService;
import com.ldm.dto.ActivityDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/activity")
@RestController
public class ActivityController {
    @Autowired
    private ActivityService activityService;
    @RequestMapping("/info")
    public ActivityDTO getCurrentInfo(){
        //安全对象拿到用户id
        return activityService.get(1);
    }
}
