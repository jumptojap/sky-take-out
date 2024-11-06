package com.sky.annotation;

/**
 * ClassName: AutoFill
 * Package: com.sky.annotation
 * Description:
 *
 * @Author: east_moon
 * @Create: 2024/11/6 - 13:48
 * Version: v1.0
 */

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解，用于标识某个方法需要进行功能字段自动填充
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface AutoFill {
    OperationType value();
}
