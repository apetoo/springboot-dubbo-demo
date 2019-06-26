package com.warape.provider.service.impl;

import com.warape.provider.service.DemoService;
import org.apache.dubbo.config.annotation.Service;

/**
 * @author 万明宇
 * @date 2019/6/26 22:33
 */
@Service
public class DemoServiceImpl implements DemoService {
    @Override
    public String test01() {
        return "test";
    }
}
