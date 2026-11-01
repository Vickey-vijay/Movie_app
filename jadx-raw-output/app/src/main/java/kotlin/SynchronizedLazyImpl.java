package kotlin;

import ck.i;
import ck.p;
import java.io.Serializable;
import mj.g;
import mj.o;

/* JADX INFO: compiled from: LazyJVM.kt */
/* JADX INFO: loaded from: classes6.dex */
final class SynchronizedLazyImpl<T> implements g<T>, Serializable {
    private volatile Object _value;
    private bk.a<? extends T> initializer;
    private final Object lock;

    public SynchronizedLazyImpl(bk.a<? extends T> aVar, Object obj) {
        p.j(aVar, "initializer");
        this.initializer = aVar;
        this._value = o.f64556a;
        this.lock = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // mj.g
    public T getValue() {
        T tInvoke;
        T t10 = (T) this._value;
        o oVar = o.f64556a;
        if (t10 != oVar) {
            return t10;
        }
        synchronized (this.lock) {
            tInvoke = (T) this._value;
            if (tInvoke == oVar) {
                bk.a<? extends T> aVar = this.initializer;
                p.g(aVar);
                tInvoke = aVar.invoke();
                this._value = tInvoke;
                this.initializer = null;
            }
        }
        return tInvoke;
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

    public /* synthetic */ SynchronizedLazyImpl(bk.a aVar, Object obj, int i10, i iVar) {
        this(aVar, (i10 & 2) != 0 ? null : obj);
    }
}
