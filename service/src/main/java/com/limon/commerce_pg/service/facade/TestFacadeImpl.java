package com.limon.commerce_pg.service.facade;

import com.limon.commerce_pg.api.TestFacade;

/**
 * @author： ym
 * @description: test dubbo impl
 * @date: Created in 7:33 PM 2019/6/3
 * @modified By:
 */
public class TestFacadeImpl implements TestFacade {
    @Override
    public void say() {
        System.out.println("hello");
    }
}
