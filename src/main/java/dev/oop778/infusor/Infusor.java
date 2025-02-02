package dev.oop778.infusor;

import dev.oop778.infusor.registration.InfusorPendingRegistration;
import lombok.NonNull;
import net.endergrid.atom.typetoken.TypeToken;

import javax.annotation.CheckReturnValue;
import java.util.function.UnaryOperator;

public interface Infusor {
    <T> T infuse(@NonNull Class<T> clazz);

    <T> T infuse(@NonNull T object);

    <T> T resolve(TypeToken<T> typeToken);

    Infusor createChild(String name);

    @CheckReturnValue
    InfusorPendingRegistration createRegistration(@NonNull UnaryOperator<InfusorPendingRegistration> registrationConfigurator);

    default <T> InfuseBuilder<T> infuseWithBuilder(Class<T> clazz) {
        return null;
    }
}
