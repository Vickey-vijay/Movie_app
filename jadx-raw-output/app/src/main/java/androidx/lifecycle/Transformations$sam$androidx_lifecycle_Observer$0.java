package androidx.lifecycle;

import ck.l;
import ck.p;

/* JADX INFO: compiled from: Transformations.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class Transformations$sam$androidx_lifecycle_Observer$0 implements Observer, l {
    private final /* synthetic */ bk.l function;

    public Transformations$sam$androidx_lifecycle_Observer$0(bk.l lVar) {
        p.j(lVar, "function");
        this.function = lVar;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof Observer) && (obj instanceof l)) {
            return p.e(getFunctionDelegate(), ((l) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // ck.l
    public final mj.e<?> getFunctionDelegate() {
        return this.function;
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final /* synthetic */ void onChanged(Object obj) {
        this.function.invoke(obj);
    }
}
