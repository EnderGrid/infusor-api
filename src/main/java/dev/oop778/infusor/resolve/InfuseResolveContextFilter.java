package dev.oop778.infusor.resolve;

@FunctionalInterface
public interface InfuseResolveContextFilter {
    boolean matches(InfuseResolveContext<?> context);

    default InfuseResolveContextFilter and(InfuseResolveContextFilter other) {
        return context -> this.matches(context) && other.matches(context);
    }

    default InfuseResolveContextFilter or(InfuseResolveContextFilter other) {
        return context -> this.matches(context) || other.matches(context);
    }
}
