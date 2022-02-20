package com.tod01.healthservice.common;

import org.springframework.stereotype.Component;
import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface PersistenceAdapter {
    @AliasFor(annotation = Component.class) String value() default "";
}
