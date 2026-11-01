package com.mbridge.msdk.thrid.okio;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: AsyncTimeout.java */
/* JADX INFO: loaded from: classes11.dex */
public class a extends t {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final long f38023h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final long f38024i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    public static a f38025j;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f38026e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private a f38027f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f38028g;

    /* JADX INFO: renamed from: com.mbridge.msdk.thrid.okio.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AsyncTimeout.java */
    public class C0392a implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ r f38029a;

        public C0392a(r rVar) {
            this.f38029a = rVar;
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public void a(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            u.a(cVar.f38037b, 0L, j10);
            while (true) {
                long j11 = 0;
                if (j10 <= 0) {
                    return;
                }
                o oVar = cVar.f38036a;
                while (j11 < PlaybackStateCompat.ACTION_PREPARE_FROM_SEARCH) {
                    j11 += (long) (oVar.f38071c - oVar.f38070b);
                    if (j11 >= j10) {
                        j11 = j10;
                        break;
                    }
                    oVar = oVar.f38074f;
                }
                a.this.h();
                try {
                    try {
                        this.f38029a.a(cVar, j11);
                        j10 -= j11;
                        a.this.a(true);
                    } catch (IOException e10) {
                        throw a.this.a(e10);
                    }
                } catch (Throwable th2) {
                    a.this.a(false);
                    throw th2;
                }
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r
        public t b() {
            return a.this;
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            a.this.h();
            try {
                try {
                    this.f38029a.close();
                    a.this.a(true);
                } catch (IOException e10) {
                    throw a.this.a(e10);
                }
            } catch (Throwable th2) {
                a.this.a(false);
                throw th2;
            }
        }

        @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
        public void flush() throws IOException {
            a.this.h();
            try {
                try {
                    this.f38029a.flush();
                    a.this.a(true);
                } catch (IOException e10) {
                    throw a.this.a(e10);
                }
            } catch (Throwable th2) {
                a.this.a(false);
                throw th2;
            }
        }

        public String toString() {
            return "AsyncTimeout.sink(" + this.f38029a + ")";
        }
    }

    /* JADX INFO: compiled from: AsyncTimeout.java */
    public class b implements s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ s f38031a;

        @Override // com.mbridge.msdk.thrid.okio.s
        public long b(com.mbridge.msdk.thrid.okio.c cVar, long j10) throws IOException {
            a.this.h();
            try {
                try {
                    long jB = this.f38031a.b(cVar, j10);
                    a.this.a(true);
                    return jB;
                } catch (IOException e10) {
                    throw a.this.a(e10);
                }
            } catch (Throwable th2) {
                a.this.a(false);
                throw th2;
            }
        }

        public b(s sVar) {
            this.f38031a = sVar;
        }

        @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            try {
                try {
                    this.f38031a.close();
                    a.this.a(true);
                } catch (IOException e10) {
                    throw a.this.a(e10);
                }
            } catch (Throwable th2) {
                a.this.a(false);
                throw th2;
            }
        }

        public String toString() {
            return "AsyncTimeout.source(" + this.f38031a + ")";
        }

        @Override // com.mbridge.msdk.thrid.okio.s
        public t b() {
            return a.this;
        }
    }

    /* JADX INFO: compiled from: AsyncTimeout.java */
    public static final class c extends Thread {
        public c() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
        
            r1.j();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<com.mbridge.msdk.thrid.okio.a> r0 = com.mbridge.msdk.thrid.okio.a.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                com.mbridge.msdk.thrid.okio.a r1 = com.mbridge.msdk.thrid.okio.a.g()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                com.mbridge.msdk.thrid.okio.a r2 = com.mbridge.msdk.thrid.okio.a.f38025j     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L14
                r1 = 0
                com.mbridge.msdk.thrid.okio.a.f38025j = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                r1.j()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.thrid.okio.a.c.run():void");
        }
    }

    private static synchronized void a(a aVar, long j10, boolean z10) {
        if (f38025j == null) {
            f38025j = new a();
            new c().start();
        }
        long jNanoTime = System.nanoTime();
        if (j10 != 0 && z10) {
            aVar.f38028g = Math.min(j10, aVar.c() - jNanoTime) + jNanoTime;
        } else if (j10 != 0) {
            aVar.f38028g = j10 + jNanoTime;
        } else {
            if (!z10) {
                throw new AssertionError();
            }
            aVar.f38028g = aVar.c();
        }
        long jB = aVar.b(jNanoTime);
        a aVar2 = f38025j;
        while (true) {
            a aVar3 = aVar2.f38027f;
            if (aVar3 == null || jB < aVar3.b(jNanoTime)) {
                break;
                break;
            }
            aVar2 = aVar2.f38027f;
        }
        aVar.f38027f = aVar2.f38027f;
        aVar2.f38027f = aVar;
        if (aVar2 == f38025j) {
            a.class.notify();
        }
    }

    private long b(long j10) {
        return this.f38028g - j10;
    }

    public void j() {
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        f38023h = millis;
        f38024i = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    @Nullable
    public static a g() throws InterruptedException {
        a aVar = f38025j.f38027f;
        if (aVar == null) {
            long jNanoTime = System.nanoTime();
            a.class.wait(f38023h);
            if (f38025j.f38027f != null || System.nanoTime() - jNanoTime < f38024i) {
                return null;
            }
            return f38025j;
        }
        long jB = aVar.b(System.nanoTime());
        if (jB > 0) {
            long j10 = jB / 1000000;
            a.class.wait(j10, (int) (jB - (1000000 * j10)));
            return null;
        }
        f38025j.f38027f = aVar.f38027f;
        aVar.f38027f = null;
        return aVar;
    }

    public IOException b(@Nullable IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final void h() {
        if (this.f38026e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long jF = f();
        boolean zD = d();
        if (jF != 0 || zD) {
            this.f38026e = true;
            a(this, jF, zD);
        }
    }

    public final boolean i() {
        if (!this.f38026e) {
            return false;
        }
        this.f38026e = false;
        return a(this);
    }

    private static synchronized boolean a(a aVar) {
        boolean z10;
        a aVar2 = f38025j;
        while (aVar2 != null) {
            a aVar3 = aVar2.f38027f;
            if (aVar3 == aVar) {
                aVar2.f38027f = aVar.f38027f;
                aVar.f38027f = null;
                z10 = false;
            } else {
                aVar2 = aVar3;
            }
        }
        z10 = true;
        return z10;
    }

    public final r a(r rVar) {
        return new C0392a(rVar);
    }

    public final s a(s sVar) {
        return new b(sVar);
    }

    public final void a(boolean z10) throws IOException {
        if (i() && z10) {
            throw b((IOException) null);
        }
    }

    public final IOException a(IOException iOException) throws IOException {
        return !i() ? iOException : b(iOException);
    }
}
