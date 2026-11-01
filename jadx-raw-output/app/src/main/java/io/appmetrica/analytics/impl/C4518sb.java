package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.executors.InterruptionSafeThread;
import java.util.HashMap;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.sb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C4518sb extends InterruptionSafeThread {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4543tb f57657a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4518sb(C4543tb c4543tb, String str) {
        super(str);
        this.f57657a = c4543tb;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        HashMap map;
        synchronized (this.f57657a.f57710a) {
            C4543tb.a(this.f57657a);
            this.f57657a.f57714e = true;
            this.f57657a.f57710a.notifyAll();
        }
        while (isRunning()) {
            synchronized (this) {
                if (this.f57657a.f57711b.size() == 0) {
                    try {
                        wait();
                    } catch (InterruptedException unused) {
                    }
                }
                map = new HashMap(this.f57657a.f57711b);
                this.f57657a.f57711b.clear();
            }
            if (map.size() > 0) {
                C4543tb.a(this.f57657a, map);
                map.clear();
            }
        }
    }
}
