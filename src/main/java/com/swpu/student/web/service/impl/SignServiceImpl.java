package com.swpu.student.web.service.impl;

import com.swpu.student.auth.exception.UserNotFoundException;
import com.swpu.student.util.Check;
import com.swpu.student.web.dao.SignDao;
import com.swpu.student.web.dao.StudentDao;
import com.swpu.student.web.dto.StudentDto;
import com.swpu.student.web.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Class description:
 *
 * @author zp
 * @version 1.0
 * @see SignServiceImpl
 * @since 2019-06-27
 */
@Service
public class SignServiceImpl implements SignService {

    private SignDao mSignDao;
    private StudentDao mStudentDao;

    @Autowired
    public void setSignDao(SignDao signDao) {
        mSignDao = signDao;
    }

    @Autowired
    public void setStudentDao(StudentDao studentDao) {
        mStudentDao = studentDao;
    }

    @Override
    public StudentDto login(String number, String password) {
        Check.checkUsername(number);
        Check.checkPassword(password);
        Long id = mSignDao.findStudent(number, password);
        if (id == null || id <= 0) {
            throw new UserNotFoundException();
        }
        mSignDao.updateLoginDate(number);
        return mStudentDao.getStudentInfoByNumber(number);
    }
}
