package com.geeksword.rocketmq.anno;


import org.springframework.core.annotation.AliasFor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface EnableRocket {


    @AliasFor(annotation = RocketComponentScan.class,attribute = "basePackages")
    String[] scanBasePackages() default {};
}
