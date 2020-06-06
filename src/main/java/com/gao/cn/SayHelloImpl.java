package com.gao.cn;

import org.springframework.beans.factory.annotation.Autowired;

public class SayHelloImpl implements ISayHello {

    @Autowired
    private SayHelloProperties sayHelloProperties;

    @Override
    public void sayHello() {
        String name = sayHelloProperties.getName();
        System.out.println("你好：" + name);
    }
}
