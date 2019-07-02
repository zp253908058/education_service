package com.swpu.student.web.service;

import com.swpu.student.web.dto.StudentDto;

/**
 * Class description:
 *
 * @author zp
 * @version 1.0
 * @see SignService
 * @since 2019-06-27
 */
public interface SignService {
    StudentDto login(String number, String password);
}
