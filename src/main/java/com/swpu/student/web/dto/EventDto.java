package com.swpu.student.web.dto;

import org.apache.ibatis.type.Alias;

/**
 * Class description:
 *
 * @author zp
 * @version 1.0
 * @see EventDto
 * @since 2019-07-02
 */
@Alias("EventDto")
public class EventDto {

    private long id;
    private String eventName;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }
}
