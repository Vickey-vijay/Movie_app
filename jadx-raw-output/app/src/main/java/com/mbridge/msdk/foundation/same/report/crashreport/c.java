package com.mbridge.msdk.foundation.same.report.crashreport;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;

/* JADX INFO: compiled from: AnrMonitor.java */
/* JADX INFO: loaded from: classes4.dex */
public class c extends Thread {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile c f35086e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f35087a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile b f35088b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.crashreport.a f35089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f35090d;

    /* JADX INFO: compiled from: AnrMonitor.java */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f35091a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f35092b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f35093c;

        private b() {
            this.f35091a = SystemClock.uptimeMillis();
        }

        public void b() {
            this.f35092b = false;
            this.f35093c = SystemClock.uptimeMillis();
            c.this.f35087a.postAtFrontOfQueue(this);
        }

        public boolean a() {
            return !this.f35092b || this.f35091a - this.f35093c >= ((long) c.this.f35090d);
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.this) {
                this.f35092b = true;
                this.f35091a = SystemClock.uptimeMillis();
            }
        }
    }

    private c() {
        super("AnrMonitor-Thread");
        this.f35087a = new Handler(Looper.getMainLooper());
        this.f35090d = 5000;
    }

    public static c a() {
        if (f35086e == null) {
            synchronized (c.class) {
                if (f35086e == null) {
                    f35086e = new c();
                }
            }
        }
        return f35086e;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0089 */
    @Override // java.lang.Thread, java.lang.Runnable
    @android.annotation.TargetApi(16)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            r6 = this;
            r0 = 10
            android.os.Process.setThreadPriority(r0)
        L5:
            boolean r0 = r6.isInterrupted()
            if (r0 != 0) goto L8c
            com.mbridge.msdk.foundation.same.report.crashreport.c$b r0 = r6.f35088b
            if (r0 == 0) goto L17
            com.mbridge.msdk.foundation.same.report.crashreport.c$b r0 = r6.f35088b
            boolean r0 = com.mbridge.msdk.foundation.same.report.crashreport.c.b.a(r0)
            if (r0 == 0) goto L8c
        L17:
            monitor-enter(r6)
            com.mbridge.msdk.foundation.same.report.crashreport.c$b r0 = r6.f35088b     // Catch: java.lang.Throwable -> L89
            if (r0 != 0) goto L24
            com.mbridge.msdk.foundation.same.report.crashreport.c$b r0 = new com.mbridge.msdk.foundation.same.report.crashreport.c$b     // Catch: java.lang.Throwable -> L89
            r1 = 0
            r0.<init>()     // Catch: java.lang.Throwable -> L89
            r6.f35088b = r0     // Catch: java.lang.Throwable -> L89
        L24:
            com.mbridge.msdk.foundation.same.report.crashreport.c$b r0 = r6.f35088b     // Catch: java.lang.Throwable -> L89
            r0.b()     // Catch: java.lang.Throwable -> L89
            int r0 = r6.f35090d     // Catch: java.lang.Throwable -> L89
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L89
            long r2 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L89
        L30:
            r4 = 0
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 <= 0) goto L4f
            r6.wait(r0)     // Catch: java.lang.InterruptedException -> L3a java.lang.Throwable -> L89
            goto L44
        L3a:
            r0 = move-exception
            java.lang.String r1 = "AnrMonitor"
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L89
            android.util.Log.w(r1, r0)     // Catch: java.lang.Throwable -> L89
        L44:
            long r0 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> L89
            long r0 = r0 - r2
            int r4 = r6.f35090d     // Catch: java.lang.Throwable -> L89
            long r4 = (long) r4     // Catch: java.lang.Throwable -> L89
            long r0 = r4 - r0
            goto L30
        L4f:
            com.mbridge.msdk.foundation.same.report.crashreport.c$b r0 = r6.f35088b     // Catch: java.lang.Throwable -> L89
            boolean r0 = r0.a()     // Catch: java.lang.Throwable -> L89
            if (r0 != 0) goto L60
            com.mbridge.msdk.foundation.same.report.crashreport.a r0 = r6.f35089c     // Catch: java.lang.Throwable -> L89
            if (r0 == 0) goto L5e
            r0.a()     // Catch: java.lang.Throwable -> L89
        L5e:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L89
            goto L5
        L60:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L89
            boolean r0 = android.os.Debug.isDebuggerConnected()
            if (r0 != 0) goto L5
            boolean r0 = android.os.Debug.waitingForDebugger()
            if (r0 == 0) goto L6e
            goto L5
        L6e:
            com.mbridge.msdk.foundation.same.report.crashreport.a r0 = r6.f35089c
            if (r0 == 0) goto L5
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            java.lang.String r1 = com.mbridge.msdk.foundation.same.report.crashreport.d.b(r0)
            com.mbridge.msdk.foundation.same.report.crashreport.a r2 = r6.f35089c
            r2.a(r1, r0)
            goto L5
        L89:
            r0 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L89
            throw r0
        L8c:
            int r0 = r6.f35090d     // Catch: java.lang.Exception -> L5
            long r0 = (long) r0     // Catch: java.lang.Exception -> L5
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Exception -> L5
            goto L5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.same.report.crashreport.c.run():void");
    }

    public c a(int i10, com.mbridge.msdk.foundation.same.report.crashreport.a aVar) {
        this.f35090d = i10;
        this.f35089c = aVar;
        return this;
    }
}
