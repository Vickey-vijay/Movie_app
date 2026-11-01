package com.apm.insight.b;

import android.os.SystemClock;
import com.apm.insight.runtime.m;

/* JADX INFO: compiled from: ANRThread.java */
/* JADX INFO: loaded from: classes9.dex */
public final class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f6269b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f6270a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f6271c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Runnable f6272d;

    public static boolean c() {
        return SystemClock.uptimeMillis() - f6269b <= 15000;
    }

    public final void b() {
        this.f6271c = true;
    }

    public c(b bVar) {
        Runnable runnable = new Runnable() { // from class: com.apm.insight.b.c.1
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                if (c.this.f6271c) {
                    return;
                }
                c.this.f6270a.d();
                long unused = c.f6269b = SystemClock.uptimeMillis();
                if (com.apm.insight.runtime.i.a().b()) {
                    m.a().a(c.this.f6272d, 500L);
                } else {
                    m.a().a(c.this.f6272d, 500L);
                }
                com.apm.insight.runtime.b.a(c.f6269b);
            }
        };
        this.f6272d = runnable;
        this.f6270a = bVar;
        m.a().a(runnable, 5000L);
    }

    public final void a() {
        if (this.f6271c) {
            return;
        }
        m.a().a(this.f6272d, 5000L);
    }
}
