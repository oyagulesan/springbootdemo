package com.obg.demo.first.demoFirst.component;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
@Lazy
public class Math implements Lesson{
    private Logger logger = LoggerFactory.getLogger(this.getClass());
    @Override
    public String getName() {
        logger.debug("Math name retrieved");
        return "Mathematics";
    }
}
