package dev.oop778.infusor.annotation.filter;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface Filter {
    String[] value();
}
