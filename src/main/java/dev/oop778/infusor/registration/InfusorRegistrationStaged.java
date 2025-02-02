package dev.oop778.infusor.registration;

import dev.oop778.infusor.InfusableObjectProvider;
import dev.oop778.infusor.registration.node.InfusorRegistrationNodeFilter;

public interface InfusorRegistrationStaged<T, RETURN> {
    FactoryStage<T, RETURN> factory();
    SingletonStage<T, RETURN> singleton();
    CustomStage<T, RETURN> custom();

    interface FactoryStage<T, RETURN> {
        BuildStage<T, RETURN> provider(InfusableObjectProvider<? super T> factory);
    }

    interface BuildStage<T, RETURN> {
        BuildStage<T, RETURN> filtered(InfusorRegistrationNodeFilter filter);

        RETURN done();
    }

    interface SingletonStage<T, RETURN> {
        BuildStage<T, RETURN> eagerProvided(T object);

        BuildStage<T, RETURN> eagerProvidedInfused(T object);

        BuildStage<T, RETURN> eager(Class<? extends T> clazz);

        BuildStage<T, RETURN> lazy(Class<? extends T> clazz);

        BuildStage<T, RETURN> lazy(InfusableObjectProvider<? super T> factory);
    }

    interface CustomStage<T, RETURN> {
        BuildStage<T, RETURN> provider(InfusableObjectProvider<? super T> factory);
    }
}
