package dev.oop778.infusor.registration.node;

import dev.oop778.infusor.InfusableObjectProvider;
import dev.oop778.infusor.Infusor;

public interface InfusorRegistrationNode<T> {
    Infusor infusor();

    InfusableObjectProvider<T> objectProvider();

    InfusorRegistrationNodeFilter filter();
}
