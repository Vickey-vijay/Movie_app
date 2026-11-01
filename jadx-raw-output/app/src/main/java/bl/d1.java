package bl;

import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class d1<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile SoftReference<T> f5396a = new SoftReference<>(null);

    public final synchronized T a(bk.a<? extends T> aVar) {
        ck.p.j(aVar, "factory");
        T t10 = this.f5396a.get();
        if (t10 != null) {
            return t10;
        }
        T tInvoke = aVar.invoke();
        this.f5396a = new SoftReference<>(tInvoke);
        return tInvoke;
    }
}
