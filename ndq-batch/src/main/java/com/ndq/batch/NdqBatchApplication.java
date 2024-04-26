package com.ndq.batch;

import com.ndq.common.util.TestUtil;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class NdqBatchApplication {

    public static void main(String[] args) {
        SpringApplication.run(NdqBatchApplication.class, args);
        TestUtil.getTest1();
    }

}
