package com.geeksword.rocketmq.anno;

import com.geeksword.rocketmq.RocketMqComponentScanRegistrar;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Documented
@Import(RocketMqComponentScanRegistrar.class)
public @interface RocketComponentScan {


    String[] basePackages() default {};
}
