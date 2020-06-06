package com.gao.cn;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "spring.gao")
public class SayHelloProperties {

    private String name = "xiaoming";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
