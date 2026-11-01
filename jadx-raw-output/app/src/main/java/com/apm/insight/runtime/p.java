package com.apm.insight.runtime;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: ThreadWithHandler.java */
/* JADX INFO: loaded from: classes8.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HandlerThread f6759a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Handler f6762d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Queue<c> f6760b = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue<Message> f6761c = new ConcurrentLinkedQueue();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f6763e = new Object();

    /* JADX INFO: compiled from: ThreadWithHandler.java */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            while (!p.this.f6761c.isEmpty()) {
                if (p.this.f6762d != null) {
                    try {
                        p.this.f6762d.sendMessageAtFrontOfQueue((Message) p.this.f6761c.poll());
                    } catch (Throwable unused) {
                    }
                }
            }
            while (!p.this.f6760b.isEmpty()) {
                c cVar = (c) p.this.f6760b.poll();
                if (p.this.f6762d != null) {
                    try {
                        p.this.f6762d.sendMessageAtTime(cVar.f6768a, cVar.f6769b);
                    } catch (Throwable unused2) {
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: ThreadWithHandler.java */
    public class b extends HandlerThread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile int f6765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f6766b;

        public b(String str) {
            super(str);
            this.f6765a = 0;
            this.f6766b = false;
        }

        /* JADX INFO: Infinite loop detected, blocks: 19, insns: 0 */
        @Override // android.os.HandlerThread
        public final void onLooperPrepared() {
            super.onLooperPrepared();
            synchronized (p.this.f6763e) {
                try {
                    p.this.f6762d = new Handler();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            p.this.f6762d.post(p.this.new a());
            while (true) {
                try {
                    Looper.loop();
                } catch (Throwable th3) {
                    try {
                        com.apm.insight.b.f.a(com.apm.insight.e.g()).a().c();
                        if (this.f6765a < 5) {
                            com.apm.insight.c.a();
                            j.a(th3, "NPTH_CATCH");
                        } else if (!this.f6766b) {
                            this.f6766b = true;
                            com.apm.insight.c.a();
                            j.a(new RuntimeException(), "NPTH_ERR_MAX");
                        }
                        this.f6765a++;
                    } catch (Throwable unused) {
                    }
                }
            }
        }
    }

    /* JADX INFO: compiled from: ThreadWithHandler.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Message f6768a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f6769b;

        public c(Message message, long j10) {
            this.f6768a = message;
            this.f6769b = j10;
        }
    }

    static {
        new Object() { // from class: com.apm.insight.runtime.p.1
        };
        new Object() { // from class: com.apm.insight.runtime.p.2
        };
    }

    public final void b() {
        this.f6759a.start();
    }

    public final HandlerThread c() {
        return this.f6759a;
    }

    public p(String str) {
        this.f6759a = new b(str);
    }

    private Message b(Runnable runnable) {
        return Message.obtain(this.f6762d, runnable);
    }

    @Nullable
    public final Handler a() {
        return this.f6762d;
    }

    private boolean b(Message message, long j10) {
        if (this.f6762d == null) {
            synchronized (this.f6763e) {
                if (this.f6762d == null) {
                    this.f6760b.add(new c(message, j10));
                    return true;
                }
            }
        }
        try {
            return this.f6762d.sendMessageAtTime(message, j10);
        } catch (Throwable unused) {
            return true;
        }
    }

    public final boolean a(Runnable runnable) {
        return a(b(runnable), 0L);
    }

    public final boolean a(Runnable runnable, long j10) {
        return a(b(runnable), j10);
    }

    private boolean a(Message message, long j10) {
        if (j10 < 0) {
            j10 = 0;
        }
        return b(message, SystemClock.uptimeMillis() + j10);
    }
}
