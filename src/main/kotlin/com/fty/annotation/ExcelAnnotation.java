package com.fty.annotation;

import java.lang.annotation.*;

/**
 * Excel 表头注解
 */
@Documented
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface ExcelAnnotation {
    /*列注释属性*/
    // 表头cell名称
    String headerName() default "";

    // 表头cell索引
    int index() default 0;

    // 表头cell所在row索引
    int level() default 0;

    // 表头cell的上级cell索引
    int parentIndex() default -1;

    /*类注释属性*/
    // sheet名称
    String sheetName() default "";

    // sheet页中日期类值显示所使用的格式
    String datePattern() default "yyyy-MM-dd";

    // 是否添加序号列
    boolean counted() default false;

    // 是否添加首行
    boolean isHasHeader() default false;
}