package dev.oop778.infusor.resolve.location;

import dev.oop778.infusor.registration.node.InfusorRegistrationNodeFilter;
import net.endergrid.atom.typetoken.TypeToken;

public interface ResolveLocation {
    TypeToken<?> typeToken();
    InfusorRegistrationNodeFilter nodeFilter();
}
