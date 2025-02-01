package dev.oop778.infusor;

import dev.oop778.infusor.registration.InfusorPendingRegistration;
import lombok.NonNull;

import java.util.function.UnaryOperator;

public interface Infusor {
    <T> T infuse(@NonNull Class<T> clazz);

    <T> T infuse(@NonNull T object);

    InfusorPendingRegistration createRegistration(@NonNull UnaryOperator<InfusorPendingRegistration> registrationConfigurator);

    default <T> InfuseBuilder<T> infuseWithBuilder(Class<T> clazz) {
        return null;
    }
}
