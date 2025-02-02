package dev.oop778.infusor.listener;

import dev.oop778.infusor.resolve.InfuseResolveContext;
import lombok.NonNull;

public interface InfuseListener {

    interface PostInject extends InfuseListener {
        void onPostInject(@NonNull InfuseResolveContext<?> context, @NonNull Object object);
    }
}
