package com.accp.sunday.controller;

import com.accp.service.DubboTestService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 *@author wangfeng
 *@create 2020-12-31 9:40
 */
public class TestController {

	@Autowired
	private DubboTestService dubboTestService;

	@Test
	public void f() {
		try {
			System.out.println(dubboTestService.getMessage("哈哈哈哈哈哈"));
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
