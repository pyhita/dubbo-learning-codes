package com.yangtao.rpc;

import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @Author: kante_yang
 * @Date: 2024/1/10
 */
@DubboService
@Slf4j
public class UserRpcImpl implements IUserRpc{

    @Override
    public String hello() {
        log.info("process hello request");
        return "hello";
    }
}
