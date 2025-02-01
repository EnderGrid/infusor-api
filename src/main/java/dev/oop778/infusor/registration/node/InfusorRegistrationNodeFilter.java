package dev.oop778.infusor.registration.node;

import dev.oop778.infusor.resolve.InfuseResolveContext;

import java.io.Serializable;

@FunctionalInterface
public interface InfusorRegistrationNodeFilter extends Serializable {
    boolean matches(InfusorRegistrationNode<?> node, InfuseResolveContext<?> resolve);

    default InfusorRegistrationNodeFilter and(InfusorRegistrationNodeFilter other) {
        return (node, resolve) -> this.matches(node, resolve) && other.matches(node, resolve);
    }

    default InfusorRegistrationNodeFilter or(InfusorRegistrationNodeFilter other) {
        return (node, resolve) -> this.matches(node, resolve) || other.matches(node, resolve);
    }
}
