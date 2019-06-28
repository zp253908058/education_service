package com.swpu.student.web.controller;

import com.swpu.student.web.dto.StudentDto;
import com.swpu.student.web.service.SignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class description:
 *
 * @author zp
 * @version 1.0
 * @see SignController
 * @since 2019-06-27
 */
@RestController
@RequestMapping(value = "/sign", produces = "application/json;charset=UTF-8")
public class SignController {

    private SignService mSignService;

    @Autowired
    public void setSignService(SignService signService) {
        mSignService = signService;
    }

    @PostMapping("/in")
    public StudentDto login(@RequestParam String number, @RequestParam String password) {
        return mSignService.login(number, password);
    }
}
