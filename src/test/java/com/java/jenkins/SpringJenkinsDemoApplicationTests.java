package com.java.jenkins;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsDemoApplicationTests {
    static Logger logger = LoggerFactory.getLogger(SpringJenkinsDemoApplicationTests.class);

    @Test
    void contextLoads() {
        logger.info("Test case Executing..!!!");
    }

}
