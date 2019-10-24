package com.poc.poc.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class CustomAspect {

    private static final Logger log = LoggerFactory.getLogger(CustomAspect.class);

    @Before("@annotation(com.poc.poc.annotation.CustomAnnotation)")
    public void before(){
        log.info("Aspect before called!!");
    }
}
