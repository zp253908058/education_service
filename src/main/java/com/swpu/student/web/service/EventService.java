package com.swpu.student.web.service;

import com.swpu.student.web.dto.EventDto;
import com.swpu.student.web.dto.TaskDto;

import java.util.List;

/**
 * Class description:
 *
 * @author zp
 * @version 1.0
 * @see EventService
 * @since 2019-07-02
 */
public interface EventService {

    List<EventDto> getEvents(String number);

    List<TaskDto> getTasks(long eventId);
}
