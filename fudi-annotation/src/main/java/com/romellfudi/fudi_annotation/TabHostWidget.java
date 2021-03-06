package com.romellfudi.fudi_annotation;

import android.support.annotation.IdRes;

/**
 * @author Romell Dominguez
 * @version 1.0.a 01/09/2015
 * @since 1.0
 */
@java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD})
@java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.RUNTIME)
public @interface TabHostWidget {
    @IdRes int tabcontent();
    public SimpleTabHost[] value() default {};

}
