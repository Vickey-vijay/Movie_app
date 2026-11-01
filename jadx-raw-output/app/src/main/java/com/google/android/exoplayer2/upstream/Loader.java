package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import e5.n;
import g5.h0;
import g5.k0;
import g5.m;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes5.dex */
public final class Loader implements n {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c f20059d = g(false, -9223372036854775807L);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final c f20060e = g(true, -9223372036854775807L);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final c f20061f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final c f20062g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ExecutorService f20063a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public d<? extends e> f20064b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    public IOException f20065c;

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th2) {
            super("Unexpected " + th2.getClass().getSimpleName() + ": " + th2.getMessage(), th2);
        }
    }

    public interface b<T extends e> {
        void f(T t10, long j10, long j11, boolean z10);

        void h(T t10, long j10, long j11);

        c k(T t10, long j10, long j11, IOException iOException, int i10);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f20066a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f20067b;

        public c(int i10, long j10) {
            this.f20066a = i10;
            this.f20067b = j10;
        }

        public boolean c() {
            int i10 = this.f20066a;
            return i10 == 0 || i10 == 1;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public final class d<T extends e> extends Handler implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f20068b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final T f20069c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final long f20070d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public b<T> f20071e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public IOException f20072f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f20073g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        public Thread f20074h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f20075i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public volatile boolean f20076j;

        public final void c() {
            this.f20072f = null;
            Loader.this.f20063a.execute((Runnable) g5.a.e(Loader.this.f20064b));
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = !this.f20075i;
                    this.f20074h = Thread.currentThread();
                }
                if (z10) {
                    h0.a("load:" + this.f20069c.getClass().getSimpleName());
                    try {
                        this.f20069c.load();
                        h0.c();
                    } catch (Throwable th2) {
                        h0.c();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f20074h = null;
                    Thread.interrupted();
                }
                if (this.f20076j) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e10) {
                if (this.f20076j) {
                    return;
                }
                obtainMessage(2, e10).sendToTarget();
            } catch (Error e11) {
                m.d("LoadTask", "Unexpected error loading stream", e11);
                if (!this.f20076j) {
                    obtainMessage(3, e11).sendToTarget();
                }
                throw e11;
            } catch (InterruptedException unused) {
                g5.a.f(this.f20075i);
                if (this.f20076j) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (Exception e12) {
                m.d("LoadTask", "Unexpected exception loading stream", e12);
                if (this.f20076j) {
                    return;
                }
                obtainMessage(2, new UnexpectedLoaderException(e12)).sendToTarget();
            } catch (OutOfMemoryError e13) {
                m.d("LoadTask", "OutOfMemory error loading stream", e13);
                if (this.f20076j) {
                    return;
                }
                obtainMessage(2, new UnexpectedLoaderException(e13)).sendToTarget();
            }
        }

        public d(Looper looper, T t10, b<T> bVar, int i10, long j10) {
            super(looper);
            this.f20069c = t10;
            this.f20071e = bVar;
            this.f20068b = i10;
            this.f20070d = j10;
        }

        public void a(boolean z10) {
            this.f20076j = z10;
            this.f20072f = null;
            if (hasMessages(0)) {
                this.f20075i = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f20075i = true;
                    this.f20069c.cancelLoad();
                    Thread thread = this.f20074h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z10) {
                d();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((b) g5.a.e(this.f20071e)).f(this.f20069c, jElapsedRealtime, jElapsedRealtime - this.f20070d, true);
                this.f20071e = null;
            }
        }

        public final void d() {
            Loader.this.f20064b = null;
        }

        public final long e() {
            return Math.min((this.f20073g - 1) * 1000, 5000);
        }

        public void f(int i10) throws IOException {
            IOException iOException = this.f20072f;
            if (iOException != null && this.f20073g > i10) {
                throw iOException;
            }
        }

        public void g(long j10) {
            g5.a.f(Loader.this.f20064b == null);
            Loader.this.f20064b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
            } else {
                c();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f20076j) {
                return;
            }
            int i10 = message.what;
            if (i10 == 0) {
                c();
                return;
            }
            if (i10 == 3) {
                throw ((Error) message.obj);
            }
            d();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f20070d;
            b bVar = (b) g5.a.e(this.f20071e);
            if (this.f20075i) {
                bVar.f(this.f20069c, jElapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 1) {
                try {
                    bVar.h(this.f20069c, jElapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    m.d("LoadTask", "Unexpected exception handling load completed", e10);
                    Loader.this.f20065c = new UnexpectedLoaderException(e10);
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f20072f = iOException;
            int i12 = this.f20073g + 1;
            this.f20073g = i12;
            c cVarK = bVar.k(this.f20069c, jElapsedRealtime, j10, iOException, i12);
            if (cVarK.f20066a == 3) {
                Loader.this.f20065c = this.f20072f;
            } else if (cVarK.f20066a != 2) {
                if (cVarK.f20066a == 1) {
                    this.f20073g = 1;
                }
                g(cVarK.f20067b != -9223372036854775807L ? cVarK.f20067b : e());
            }
        }
    }

    public interface e {
        void cancelLoad();

        void load() throws InterruptedException, IOException;
    }

    public interface f {
        void onLoaderReleased();
    }

    public static final class g implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f f20078b;

        @Override // java.lang.Runnable
        public void run() {
            this.f20078b.onLoaderReleased();
        }

        public g(f fVar) {
            this.f20078b = fVar;
        }
    }

    static {
        long j10 = -9223372036854775807L;
        f20061f = new c(2, j10);
        f20062g = new c(3, j10);
    }

    public void f() {
        this.f20065c = null;
    }

    public void k() {
        l(null);
    }

    public static c g(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    public void e() {
        ((d) g5.a.h(this.f20064b)).a(false);
    }

    public boolean h() {
        return this.f20065c != null;
    }

    public boolean i() {
        return this.f20064b != null;
    }

    public void j(int i10) throws IOException {
        IOException iOException = this.f20065c;
        if (iOException != null) {
            throw iOException;
        }
        d<? extends e> dVar = this.f20064b;
        if (dVar != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = dVar.f20068b;
            }
            dVar.f(i10);
        }
    }

    public void l(@Nullable f fVar) {
        d<? extends e> dVar = this.f20064b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f20063a.execute(new g(fVar));
        }
        this.f20063a.shutdown();
    }

    @Override // e5.n
    public void maybeThrowError() throws IOException {
        j(Integer.MIN_VALUE);
    }

    public Loader(String str) {
        this.f20063a = k0.m0(str);
    }

    public <T extends e> long m(T t10, b<T> bVar, int i10) {
        Looper looper = (Looper) g5.a.h(Looper.myLooper());
        this.f20065c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, t10, bVar, i10, jElapsedRealtime).g(0L);
        return jElapsedRealtime;
    }
}
