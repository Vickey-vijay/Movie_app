package dj;

import ii.r;

/* JADX INFO: compiled from: DefaultObserver.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class b<T> implements r<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public mi.b f52122b;

    public void a() {
    }

    @Override // ii.r
    public final void onSubscribe(mi.b bVar) {
        if (bj.e.d(this.f52122b, bVar, getClass())) {
            this.f52122b = bVar;
            a();
        }
    }
}
