package com.swpu.student.web.controller;

import com.swpu.student.web.dto.EventDto;
import com.swpu.student.web.dto.TaskDto;
import com.swpu.student.web.service.EventService;
import org.apache.ibatis.type.Alias;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Class description:
 *
 * @author zp
 * @version 1.0
 * @see EventController
 * @since 2019-07-02
 */
@RestController
@RequestMapping("/user/event")
public class EventController {

    private EventService mEventService;

    @Autowired
    public void setEventService(EventService eventService) {
        mEventService = eventService;
    }

    @GetMapping
    public List<EventDto> getEvents(@RequestParam("number") String number) {
        return mEventService.getEvents(number);
    }

    @GetMapping("/task")
    public List<TaskDto> getTasks(@RequestParam("event_id") long eventId){
        return mEventService.getTasks(eventId);
    }
}
