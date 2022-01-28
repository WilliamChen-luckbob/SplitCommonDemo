package com.wwstation.other_service.components;

import com.wwstation.common.TestClass;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

/**
 * @author william
 * @description
 * @Date: 2022-01-28 14:12
 */
@Component
public class TestComponent {

    @PostConstruct
    public void initAndPrint() {
        //print the string defined in web-common-enums
        TestClass.test();
    }
}
