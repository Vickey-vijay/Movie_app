package yads;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes4.dex */
public final class ag1 extends Handler implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f75503b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bg1 f75504c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f75505d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public yf1 f75506e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public IOException f75507f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f75508g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Thread f75509h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f75510i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public volatile boolean f75511j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ fg1 f75512k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag1(fg1 fg1Var, Looper looper, bg1 bg1Var, yf1 yf1Var, int i10, long j10) {
        super(looper);
        this.f75512k = fg1Var;
        this.f75504c = bg1Var;
        this.f75506e = yf1Var;
        this.f75503b = i10;
        this.f75505d = j10;
    }

    public final void a(boolean z10) {
        this.f75511j = z10;
        this.f75507f = null;
        if (hasMessages(0)) {
            this.f75510i = true;
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
            }
        } else {
            synchronized (this) {
                this.f75510i = true;
                this.f75504c.b();
                Thread thread = this.f75509h;
                if (thread != null) {
                    thread.interrupt();
                }
            }
        }
        if (z10) {
            this.f75512k.f77391b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            yf1 yf1Var = this.f75506e;
            yf1Var.getClass();
            yf1Var.a(this.f75504c, jElapsedRealtime, jElapsedRealtime - this.f75505d, true);
            this.f75506e = null;
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f75511j) {
            return;
        }
        int i10 = message.what;
        if (i10 == 0) {
            this.f75507f = null;
            fg1 fg1Var = this.f75512k;
            ExecutorService executorService = fg1Var.f77390a;
            ag1 ag1Var = fg1Var.f77391b;
            ag1Var.getClass();
            executorService.execute(ag1Var);
            return;
        }
        if (i10 == 3) {
            throw ((Error) message.obj);
        }
        this.f75512k.f77391b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.f75505d;
        yf1 yf1Var = this.f75506e;
        yf1Var.getClass();
        if (this.f75510i) {
            yf1Var.a(this.f75504c, jElapsedRealtime, j10, false);
            return;
        }
        int i11 = message.what;
        if (i11 == 1) {
            try {
                yf1Var.a(this.f75504c, jElapsedRealtime, j10);
                return;
            } catch (RuntimeException e10) {
                ih1.b("LoadTask", ih1.a("Unexpected exception handling load completed", e10));
                this.f75512k.f77392c = new eg1(e10);
                return;
            }
        }
        if (i11 != 2) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f75507f = iOException;
        int i12 = this.f75508g + 1;
        this.f75508g = i12;
        zf1 zf1VarA = yf1Var.a(this.f75504c, jElapsedRealtime, j10, iOException, i12);
        int i13 = zf1VarA.f85378a;
        if (i13 == 3) {
            this.f75512k.f77392c = this.f75507f;
            return;
        }
        if (i13 != 2) {
            if (i13 == 1) {
                this.f75508g = 1;
            }
            long jMin = zf1VarA.f85379b;
            if (jMin == -9223372036854775807L) {
                jMin = Math.min((this.f75508g - 1) * 1000, 5000);
            }
            fg1 fg1Var2 = this.f75512k;
            if (fg1Var2.f77391b != null) {
                throw new IllegalStateException();
            }
            fg1Var2.f77391b = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(0, jMin);
            } else {
                this.f75507f = null;
                fg1Var2.f77390a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        try {
            synchronized (this) {
                z10 = !this.f75510i;
                this.f75509h = Thread.currentThread();
            }
            if (z10) {
                d73.a("load:".concat(this.f75504c.getClass().getSimpleName()));
                try {
                    this.f75504c.a();
                    d73.a();
                } catch (Throwable th2) {
                    d73.a();
                    throw th2;
                }
            }
            synchronized (this) {
                this.f75509h = null;
                Thread.interrupted();
            }
            if (this.f75511j) {
                return;
            }
            sendEmptyMessage(1);
        } catch (IOException e10) {
            if (this.f75511j) {
                return;
            }
            obtainMessage(2, e10).sendToTarget();
        } catch (OutOfMemoryError e11) {
            if (this.f75511j) {
                return;
            }
            ih1.b("LoadTask", ih1.a("OutOfMemory error loading stream", e11));
            obtainMessage(2, new eg1(e11)).sendToTarget();
        } catch (Error e12) {
            if (!this.f75511j) {
                ih1.b("LoadTask", ih1.a("Unexpected error loading stream", e12));
                obtainMessage(3, e12).sendToTarget();
            }
            throw e12;
        } catch (Exception e13) {
            if (this.f75511j) {
                return;
            }
            ih1.b("LoadTask", ih1.a("Unexpected exception loading stream", e13));
            obtainMessage(2, new eg1(e13)).sendToTarget();
        }
    }
}
