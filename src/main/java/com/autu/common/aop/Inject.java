package com.autu.common.aop;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Inject is used to inject dependent object
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD})
public @interface Inject {
	
	Class<?> value() default Void.class;					// 被注入类的类型
	
	YesOrNo enhance() default YesOrNo.DEFAULT;			// 是否增强
	
	YesOrNo singleton() default YesOrNo.DEFAULT;			// 是否单例
}


