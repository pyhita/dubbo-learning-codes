package com.yangtao.controller;

import com.yangtao.rpc.IUserRpc;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: kante_yang
 * @Date: 2024/1/10
 */
@RestController
@RequestMapping("/user")
@Slf4j
@RequiredArgsConstructor
public class UserController {

    @DubboReference
    private IUserRpc userRpc;

    @GetMapping("/hello")
    public String hello() {
        return userRpc.hello();
    }
}
