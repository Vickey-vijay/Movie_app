package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes9.dex */
public final class y extends Handler implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f17802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f17803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f17804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f17805d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public IOException f17806e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f17807f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public volatile Thread f17808g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile boolean f17809h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ b0 f17810i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(b0 b0Var, Looper looper, z zVar, x xVar, int i10, long j10) {
        super(looper);
        this.f17810i = b0Var;
        this.f17802a = zVar;
        this.f17803b = xVar;
        this.f17804c = i10;
        this.f17805d = j10;
    }

    public final void a(boolean z10) {
        this.f17809h = z10;
        this.f17806e = null;
        if (hasMessages(0)) {
            removeMessages(0);
            if (!z10) {
                sendEmptyMessage(1);
            }
        } else {
            this.f17802a.b();
            if (this.f17808g != null) {
                this.f17808g.interrupt();
            }
        }
        if (z10) {
            this.f17810i.f17655b = null;
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            this.f17803b.a(this.f17802a, jElapsedRealtime, jElapsedRealtime - this.f17805d, true);
        }
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (this.f17809h) {
            return;
        }
        int i10 = message.what;
        if (i10 == 0) {
            this.f17806e = null;
            b0 b0Var = this.f17810i;
            b0Var.f17654a.execute(b0Var.f17655b);
            return;
        }
        if (i10 == 4) {
            throw ((Error) message.obj);
        }
        this.f17810i.f17655b = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = jElapsedRealtime - this.f17805d;
        if (this.f17802a.a()) {
            this.f17803b.a(this.f17802a, jElapsedRealtime, j10, false);
            return;
        }
        int i11 = message.what;
        if (i11 == 1) {
            this.f17803b.a(this.f17802a, jElapsedRealtime, j10, false);
            return;
        }
        if (i11 == 2) {
            this.f17803b.a(this.f17802a, jElapsedRealtime, j10);
            return;
        }
        if (i11 != 3) {
            return;
        }
        IOException iOException = (IOException) message.obj;
        this.f17806e = iOException;
        int iA = this.f17803b.a(this.f17802a, jElapsedRealtime, j10, iOException);
        if (iA == 3) {
            this.f17810i.f17656c = this.f17806e;
            return;
        }
        if (iA != 2) {
            int i12 = iA == 1 ? 1 : this.f17807f + 1;
            this.f17807f = i12;
            long jMin = Math.min((i12 - 1) * 1000, 5000);
            b0 b0Var2 = this.f17810i;
            if (b0Var2.f17655b != null) {
                throw new IllegalStateException();
            }
            b0Var2.f17655b = this;
            if (jMin > 0) {
                sendEmptyMessageDelayed(0, jMin);
            } else {
                this.f17806e = null;
                b0Var2.f17654a.execute(this);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f17808g = Thread.currentThread();
            if (!this.f17802a.a()) {
                com.fyber.inneractive.sdk.player.exoplayer2.util.w.a("load:".concat(this.f17802a.getClass().getSimpleName()));
                try {
                    this.f17802a.load();
                    com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
                } catch (Throwable th2) {
                    com.fyber.inneractive.sdk.player.exoplayer2.util.w.a();
                    throw th2;
                }
            }
            if (this.f17809h) {
                return;
            }
            sendEmptyMessage(2);
        } catch (IOException e10) {
            if (this.f17809h) {
                return;
            }
            obtainMessage(3, e10).sendToTarget();
        } catch (Error e11) {
            Log.e("LoadTask", "Unexpected error loading stream", e11);
            if (!this.f17809h) {
                obtainMessage(4, e11).sendToTarget();
            }
            throw e11;
        } catch (InterruptedException unused) {
            if (!this.f17802a.a()) {
                throw new IllegalStateException();
            }
            if (this.f17809h) {
                return;
            }
            sendEmptyMessage(2);
        } catch (Exception e12) {
            Log.e("LoadTask", "Unexpected exception loading stream", e12);
            if (this.f17809h) {
                return;
            }
            obtainMessage(3, new a0(e12)).sendToTarget();
        } catch (OutOfMemoryError e13) {
            Log.e("LoadTask", "OutOfMemory error loading stream", e13);
            if (this.f17809h) {
                return;
            }
            obtainMessage(3, new a0(e13)).sendToTarget();
        }
    }
}
