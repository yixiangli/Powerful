package com.lyx.ag.power.lb.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)					//表示只能给类添加该注解
@Retention(RetentionPolicy.RUNTIME)		//这个必须要将注解保留在运行时
public @interface LBS {

	String name() default "Random";
}
