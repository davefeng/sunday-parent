package com.accp.service.impl;

import com.accp.service.DubboTestService;
import org.springframework.stereotype.Service;

/**
 *dubbo学习测试接口
 *@author wangfeng
 *@create 2020-12-25 15:28
 */
@Service("dubboTestServiceImpl")
public class DubboTestServiceImpl implements DubboTestService {
	@Override
	public String getMessage(String name) {
		return name;
	}
}
