package com.swpu.student.web.service.impl;

import com.swpu.student.web.dao.EventDao;
import com.swpu.student.web.dto.EventDto;
import com.swpu.student.web.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Class description:
 *
 * @author zp
 * @version 1.0
 * @see EventServiceImpl
 * @since 2019-07-02
 */
@Service
public class EventServiceImpl implements EventService {

    private EventDao mEventDao;

    @Autowired
    public void setEventDao(EventDao eventDao) {
        mEventDao = eventDao;
    }

    @Override
    public List<EventDto> getEvents(String number) {
        return mEventDao.getEvents(number);
    }
}
