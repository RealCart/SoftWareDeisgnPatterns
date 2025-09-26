package adapter.core.domain.usecase;

public interface Useacse<T, P> {
    T call(P param);
}
