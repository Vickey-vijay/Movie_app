package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.n0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class RunnableC4383n0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4433p0 f57301a;

    public RunnableC4383n0(C4433p0 c4433p0) {
        this.f57301a = c4433p0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4433p0 c4433p0 = this.f57301a;
        synchronized (c4433p0) {
            if (c4433p0.f57462a != null && c4433p0.a()) {
                try {
                    c4433p0.f57465d = null;
                    c4433p0.f57462a.unbindService(c4433p0.f57471j);
                } catch (Throwable unused) {
                }
            }
            c4433p0.f57465d = null;
        }
    }
}
