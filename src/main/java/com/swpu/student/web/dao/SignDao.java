package com.swpu.student.web.dao;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Class description:
 *
 * @author zp
 * @version 1.0
 * @see SignDao
 * @since 2019-06-27
 */
@Mapper
@Repository
public interface SignDao {

    Long findStudent(String number, String password);

    void updateLoginDate(String number);
}
