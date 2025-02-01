package dev.oop778.infusor.annotation.filter.context;

import dev.oop778.infusor.annotation.filter.Filter;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Filter("context.local")
@Retention(RetentionPolicy.RUNTIME)
public @interface ContextLocal {
}
