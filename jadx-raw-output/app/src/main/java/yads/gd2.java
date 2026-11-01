package yads;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;

/* JADX INFO: loaded from: classes11.dex */
public final class gd2 extends HandlerThread implements Handler.Callback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public rl0 f77766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Handler f77767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Error f77768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public RuntimeException f77769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public hd2 f77770f;

    public gd2() {
        super("ExoPlayer:PlaceholderSurface");
    }

    public final void b(int i10) {
        this.f77766b.getClass();
        this.f77766b.a(i10);
        this.f77770f = new hd2(this, this.f77766b.a(), i10 != 0);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        try {
            if (i10 != 1) {
                if (i10 != 2) {
                    return true;
                }
                try {
                    this.f77766b.getClass();
                    this.f77766b.b();
                } catch (Throwable th2) {
                    try {
                        ih1.b("PlaceholderSurface", ih1.a("Failed to release placeholder surface", th2));
                    } finally {
                        quit();
                    }
                }
                return true;
            }
            try {
                try {
                    b(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    ih1.b("PlaceholderSurface", ih1.a("Failed to initialize placeholder surface", e10));
                    this.f77768d = e10;
                    synchronized (this) {
                        notify();
                    }
                }
            } catch (RuntimeException e11) {
                ih1.b("PlaceholderSurface", ih1.a("Failed to initialize placeholder surface", e11));
                this.f77769e = e11;
                synchronized (this) {
                    notify();
                }
            }
            return true;
        } catch (Throwable th3) {
            synchronized (this) {
                notify();
                throw th3;
            }
        }
    }

    public final hd2 a(int i10) {
        boolean z10;
        start();
        Handler handler = new Handler(getLooper(), this);
        this.f77767c = handler;
        this.f77766b = new rl0(handler);
        synchronized (this) {
            z10 = false;
            this.f77767c.obtainMessage(1, i10, 0).sendToTarget();
            while (this.f77770f == null && this.f77769e == null && this.f77768d == null) {
                try {
                    wait();
                } catch (InterruptedException unused) {
                    z10 = true;
                }
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
        RuntimeException runtimeException = this.f77769e;
        if (runtimeException == null) {
            Error error = this.f77768d;
            if (error == null) {
                hd2 hd2Var = this.f77770f;
                hd2Var.getClass();
                return hd2Var;
            }
            throw error;
        }
        throw runtimeException;
    }
}
