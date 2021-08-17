package com.renbin.router_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * data:2021-08-17
 * Author:renbin
 */
//针对于类有效
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.CLASS)   //生命周期，针对编译时
public @interface Route {
    String value();
}
