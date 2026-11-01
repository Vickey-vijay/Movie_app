package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.y9, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4666y9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ReentrantLock f58017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z9 f58018b;

    public C4666y9(Context context, String str) {
        this(new ReentrantLock(), new Z9(context, str));
    }

    public C4666y9(ReentrantLock reentrantLock, Z9 z10) {
        this.f58017a = reentrantLock;
        this.f58018b = z10;
    }

    public final void a() {
        this.f58017a.lock();
        this.f58018b.a();
    }

    public final void b() {
        this.f58018b.b();
        this.f58017a.unlock();
    }

    public final void c() {
        Z9 z10 = this.f58018b;
        synchronized (z10) {
            z10.b();
            z10.f56277a.delete();
        }
        this.f58017a.unlock();
    }
}
