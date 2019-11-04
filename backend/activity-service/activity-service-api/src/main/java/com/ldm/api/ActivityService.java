package com.ldm.api;

import com.ldm.dto.ActivityDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "activity-service")
public interface ActivityService {
    @GetMapping("/{activityId}")
    ActivityDTO get(@PathVariable("activityId") int activityId);
}
