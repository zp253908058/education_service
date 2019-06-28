package com.swpu.student.web.dao;

import com.swpu.student.web.dto.StudentDto;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * Class description:
 *
 * @author zp
 * @version 1.0
 * @see StudentDao
 * @since 2019-06-27
 */
@Repository
@Mapper
public interface StudentDao {

    StudentDto getStudentInfoByNumber(String number);
}
