package dev.oop778.infusor;

import dev.oop778.infusor.resolve.InfuseResolveContext;
import dev.oop778.infusor.resolve.InfuseResolveResult;
import lombok.NonNull;

public interface InfusorContext {
    Infusor initiator();

    <T> InfuseResolveResult<T> tryResolve(@NonNull InfuseResolveContext<T> context);

    <T> InfuseResolveResult<T> createInstance(Class<T> type);

    void addError(String message, Object... extraPath);
}
