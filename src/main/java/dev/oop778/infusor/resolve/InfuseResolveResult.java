package dev.oop778.infusor.resolve;

public interface InfuseResolveResult<T> {
    InfuseResolveResult<Object> WAITING_FOR_PARAM_RESOLVE = new InfuseResolveResult<Object>() {
        @Override
        public String toString() {
            return "WAITING_FOR_PARAM_RESOLVE";
        }
    };
    InfuseResolveResult<Object> UNKNOWN = new InfuseResolveResult<>() {
        @Override
        public String toString() {
            return "UNKNOWN";
        }
    };
    InfuseResolveResult<Object> ERROR = new InfuseResolveResult<>() {
        @Override
        public String toString() {
            return "ERROR";
        }
    };

    static <T> InfuseResolveResult<T> unresolved() {
        return (InfuseResolveResult<T>) WAITING_FOR_PARAM_RESOLVE;
    }

    static <T> InfuseResolveResult<T> unknown() {
        return (InfuseResolveResult<T>) UNKNOWN;
    }

    static <T> InfuseResolveResult<T> resolved(T object) {
        return new Resolved<>(object);
    }

    static <T> InfuseResolveResult<T> created(T object) {
        return new Created<>(object);
    }

    static <T> InfuseResolveResult<T> error() {
        return (InfuseResolveResult<T>) ERROR;
    }

    @Override
    String toString();

    class Resolved<T> implements InfuseResolveResult<T> {
        private final T object;

        public Resolved(T object) {
            this.object = object;
        }

        @Override
        public String toString() {
            return "RESOLVED";
        }

        public T get() {
            return this.object;
        }
    }

    class Created<T> extends Resolved<T> {
        public Created(T object) {
            super(object);
        }

        @Override
        public String toString() {
            return "CREATED";
        }
    }
}
