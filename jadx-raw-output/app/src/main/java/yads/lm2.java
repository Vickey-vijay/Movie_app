package yads;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes3.dex */
public final class lm2 implements fk.d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public WeakReference f79854a;

    @Override // fk.d
    public final Object getValue(Object obj, jk.k kVar) {
        return this.f79854a.get();
    }

    @Override // fk.d
    public final void setValue(Object obj, jk.k kVar, Object obj2) {
        this.f79854a = new WeakReference(obj2);
    }

    public lm2(Object obj) {
        this.f79854a = new WeakReference(obj);
    }
}
