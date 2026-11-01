package com.google.android.exoplayer2.video;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Surface;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.EGLSurfaceTexture;
import g5.k;
import g5.k0;
import g5.m;

/* JADX INFO: loaded from: classes5.dex */
@TargetApi(17)
public final class DummySurface extends Surface {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f20211e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f20212f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f20213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f20214c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f20215d;

    public static class b extends HandlerThread implements Handler.Callback {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public EGLSurfaceTexture f20216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Handler f20217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        public Error f20218d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        public RuntimeException f20219e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        public DummySurface f20220f;

        public b() {
            super("dummySurface");
        }

        public final void c(int i10) {
            g5.a.e(this.f20216b);
            this.f20216b.i(i10);
            this.f20220f = new DummySurface(this, this.f20216b.h(), i10 != 0);
        }

        public void d() {
            g5.a.e(this.f20217c);
            this.f20217c.sendEmptyMessage(2);
        }

        public final void e() {
            g5.a.e(this.f20216b);
            this.f20216b.j();
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            try {
                if (i10 != 1) {
                    if (i10 != 2) {
                        return true;
                    }
                    try {
                        e();
                    } catch (Throwable th2) {
                        try {
                            m.d("DummySurface", "Failed to release dummy surface", th2);
                        } finally {
                            quit();
                        }
                    }
                    return true;
                }
                try {
                    c(message.arg1);
                    synchronized (this) {
                        notify();
                    }
                } catch (Error e10) {
                    m.d("DummySurface", "Failed to initialize dummy surface", e10);
                    this.f20218d = e10;
                    synchronized (this) {
                        notify();
                    }
                } catch (RuntimeException e11) {
                    m.d("DummySurface", "Failed to initialize dummy surface", e11);
                    this.f20219e = e11;
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

        public DummySurface a(int i10) {
            boolean z10;
            start();
            this.f20217c = new Handler(getLooper(), this);
            this.f20216b = new EGLSurfaceTexture(this.f20217c);
            synchronized (this) {
                z10 = false;
                this.f20217c.obtainMessage(1, i10, 0).sendToTarget();
                while (this.f20220f == null && this.f20219e == null && this.f20218d == null) {
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
            RuntimeException runtimeException = this.f20219e;
            if (runtimeException == null) {
                Error error = this.f20218d;
                if (error == null) {
                    return (DummySurface) g5.a.e(this.f20220f);
                }
                throw error;
            }
            throw runtimeException;
        }
    }

    public DummySurface(b bVar, SurfaceTexture surfaceTexture, boolean z10) {
        super(surfaceTexture);
        this.f20214c = bVar;
        this.f20213b = z10;
    }

    public static void c() {
        if (k0.f53108a < 17) {
            throw new UnsupportedOperationException("Unsupported prior to API level 17");
        }
    }

    public static synchronized boolean e(Context context) {
        if (!f20212f) {
            f20211e = d(context);
            f20212f = true;
        }
        return f20211e != 0;
    }

    public static int d(Context context) {
        if (k.f(context)) {
            if (k.g()) {
                return 1;
            }
            return 2;
        }
        return 0;
    }

    public static DummySurface f(Context context, boolean z10) {
        boolean z11;
        c();
        int i10 = 0;
        if (z10 && !e(context)) {
            z11 = false;
        } else {
            z11 = true;
        }
        g5.a.f(z11);
        b bVar = new b();
        if (z10) {
            i10 = f20211e;
        }
        return bVar.a(i10);
    }

    @Override // android.view.Surface
    public void release() {
        super.release();
        synchronized (this.f20214c) {
            if (!this.f20215d) {
                this.f20214c.d();
                this.f20215d = true;
            }
        }
    }
}
