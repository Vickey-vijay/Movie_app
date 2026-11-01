package kotlin;

import ck.i;
import ck.p;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import mj.g;
import mj.o;

/* JADX INFO: compiled from: LazyJVM.kt */
/* JADX INFO: loaded from: classes2.dex */
final class SafePublicationLazyImpl<T> implements g<T>, Serializable {
    public static final a Companion = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicReferenceFieldUpdater<SafePublicationLazyImpl<?>, Object> f62965b = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "_value");
    private volatile Object _value;

    /* JADX INFO: renamed from: final, reason: not valid java name */
    private final Object f3392final;
    private volatile bk.a<? extends T> initializer;

    /* JADX INFO: compiled from: LazyJVM.kt */
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(i iVar) {
            this();
        }
    }

    public SafePublicationLazyImpl(bk.a<? extends T> aVar) {
        p.j(aVar, "initializer");
        this.initializer = aVar;
        o oVar = o.f64556a;
        this._value = oVar;
        this.f3392final = oVar;
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // mj.g
    public T getValue() {
        T t10 = (T) this._value;
        o oVar = o.f64556a;
        if (t10 != oVar) {
            return t10;
        }
        bk.a<? extends T> aVar = this.initializer;
        if (aVar != null) {
            T tInvoke = aVar.invoke();
            if (androidx.concurrent.futures.a.a(f62965b, this, oVar, tInvoke)) {
                this.initializer = null;
                return tInvoke;
            }
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
