package com.tod01.healthservice.common;

import java.lang.annotation.*;
import java.lang.annotation.Target;

import org.springframework.core.annotation.AliasFor;
import org.springframework.stereotype.Component;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface MessagingAdapter {
    @AliasFor(annotation = Component.class)
    String values() default "";
}
