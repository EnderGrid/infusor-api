package dev.oop778.infusor;

import net.endergrid.atom.typetoken.TypeToken;
import net.endergrid.atom.typetoken.TypeTokenMatcher;

public interface InfuseBuilder<T> {
    <P> InfuseBuilder<T> withProvidedExact(Class<P> provided, P object);
    <P> InfuseBuilder<T> withProvidedMatching(TypeTokenMatcher<TypeToken<? super P>> matcher, P object);

    T infuse();
}
