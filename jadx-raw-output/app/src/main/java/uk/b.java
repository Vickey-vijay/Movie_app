package uk;

import nk.h0;
import sk.m;

/* JADX INFO: compiled from: Dispatcher.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class b extends e {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final b f72894h = new b();

    @Override // nk.h0
    public String toString() {
        return "Dispatchers.Default";
    }

    public b() {
        super(i.f72906c, i.f72907d, i.f72908e, i.f72904a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // nk.h0
    public h0 limitedParallelism(int i10, String str) {
        m.a(i10);
        if (i10 >= i.f72906c) {
            return m.b(this, str);
        }
        return super.limitedParallelism(i10, str);
    }
}
