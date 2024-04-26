package com.ndq.api;

import com.ndq.common.util.TestUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NdqApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(NdqApiApplication.class, args);
        TestUtil.getTest1();
    }

}
