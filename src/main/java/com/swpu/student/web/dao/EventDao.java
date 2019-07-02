package com.swpu.student.web.dao;

import com.swpu.student.web.dto.EventDto;
import com.swpu.student.web.dto.TaskDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Class description:
 *
 * @author zp
 * @version 1.0
 * @see EventDao
 * @since 2019-07-02
 */

@Repository
@Mapper
public interface EventDao {

    List<EventDto> getEvents(String number);

    List<TaskDto> getTasks(long eventId);
}
