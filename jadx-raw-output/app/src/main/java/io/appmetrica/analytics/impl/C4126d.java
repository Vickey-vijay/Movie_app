package io.appmetrica.analytics.impl;

import android.os.Debug;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C4126d extends Thread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f56545a = new AtomicBoolean(true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4151e f56546b;

    public C4126d(C4151e c4151e) {
        this.f56546b = c4151e;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        while (!isInterrupted() && this.f56545a.get()) {
            this.f56546b.f56623e.set(false);
            C4151e c4151e = this.f56546b;
            c4151e.f56621c.postAtFrontOfQueue(c4151e.f56624f);
            int i10 = this.f56546b.f56620b.get();
            while (i10 > 0) {
                try {
                    Thread.sleep(C4151e.f56617g);
                    if (this.f56546b.f56623e.get()) {
                        break;
                    } else {
                        i10--;
                    }
                } catch (InterruptedException unused) {
                    return;
                }
            }
            if (i10 == 0 && !Debug.isDebuggerConnected()) {
                Iterator it = this.f56546b.f56619a.iterator();
                while (it.hasNext()) {
                    ((InterfaceC4100c) it.next()).onAppNotResponding();
                }
            }
            while (!this.f56546b.f56623e.get()) {
                try {
                    Thread.sleep(C4151e.f56617g);
                } catch (InterruptedException unused2) {
                    return;
                }
            }
        }
    }
}
