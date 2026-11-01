package kotlin;

import ck.p;
import java.io.Serializable;
import mj.g;
import mj.o;

/* JADX INFO: compiled from: Lazy.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class UnsafeLazyImpl<T> implements g<T>, Serializable {
    private Object _value;
    private bk.a<? extends T> initializer;

    public UnsafeLazyImpl(bk.a<? extends T> aVar) {
        p.j(aVar, "initializer");
        this.initializer = aVar;
        this._value = o.f64556a;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // mj.g
    public T getValue() {
        if (this._value == o.f64556a) {
            bk.a<? extends T> aVar = this.initializer;
            p.g(aVar);
            this._value = aVar.invoke();
            this.initializer = null;
        }
        return (T) this._value;
    }

    public boolean isInitialized() {
        return this._value != o.f64556a;
    }

    public String toString() {
        if (isInitialized()) {
            return String.valueOf(getValue());
        }
        return "Lazy value not initialized yet.";
    }
}
