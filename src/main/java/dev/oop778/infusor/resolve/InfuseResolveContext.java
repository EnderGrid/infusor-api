package dev.oop778.infusor.resolve;

import dev.oop778.infusor.Infusor;
import dev.oop778.infusor.InfusorContext;
import dev.oop778.infusor.resolve.location.ResolveLocation;
import lombok.Builder;
import net.endergrid.atom.typetoken.TypeToken;

@Builder(toBuilder = true)
public record InfuseResolveContext<T>(TypeToken<T> typeToken, Infusor requestingInfusor, InfusorContext infusorContext, ResolveLocation location) {

    public <U> InfuseResolveContext<U> withTypeToken(TypeToken<U> typeToken) {
        final InfuseResolveContextBuilder<U> builder = (InfuseResolveContextBuilder<U>) this.toBuilder();
        return builder.typeToken(typeToken).build();
    }

    public InfuseResolveContext<T> withLocation(ResolveLocation location) {
        return this.toBuilder().location(location).build();
    }

    public InfuseResolveContext<T> withInfusor(Infusor infusor) {
        return this.toBuilder().requestingInfusor(infusor).build();
    }
}
