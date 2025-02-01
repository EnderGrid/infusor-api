package dev.oop778.infusor;

import dev.oop778.infusor.resolve.InfuseResolveContext;
import dev.oop778.infusor.resolve.InfuseResolveResult;

@FunctionalInterface
public interface InfusableObjectProvider<T> {
    InfuseResolveResult<T> provide(InfuseResolveContext<T> context);
}
