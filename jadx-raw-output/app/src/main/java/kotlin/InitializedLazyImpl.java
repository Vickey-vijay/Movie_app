package kotlin;

import java.io.Serializable;
import mj.g;

/* JADX INFO: compiled from: Lazy.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class InitializedLazyImpl<T> implements g<T>, Serializable {
    private final T value;

    public boolean isInitialized() {
        return true;
    }

    @Override // mj.g
    public T getValue() {
        return this.value;
    }

    public InitializedLazyImpl(T t10) {
        this.value = t10;
    }

    public String toString() {
        return String.valueOf(getValue());
    }
}
