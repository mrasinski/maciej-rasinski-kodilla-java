package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testGetLastLog() {
        Logger logger = Logger.getInstance();
        logger.log("This is last log");

        String lastLog = logger.getLastLog();

        Assert.assertEquals(lastLog, "This is last log");
    }
}
