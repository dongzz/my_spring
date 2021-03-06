package com.dongz.spring.my_spring.mvcsramework.annotation;

import java.lang.annotation.*;

/**
 * @author dongzhi
 * @date 2019/8/30
 * @desc
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Service {
    String value() default "";
}
