package h5;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.view.Choreographer;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.Nullable;
import g5.k0;

/* JADX INFO: compiled from: VideoFrameReleaseTimeHelper.java */
/* JADX INFO: loaded from: classes6.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WindowManager f53750a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f53751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a f53752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f53753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f53754e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f53755f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f53756g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f53757h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f53758i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public long f53759j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f53760k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f53761l;

    /* JADX INFO: compiled from: VideoFrameReleaseTimeHelper.java */
    @TargetApi(17)
    public final class a implements DisplayManager.DisplayListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final DisplayManager f53762b;

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i10) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i10) {
        }

        public a(DisplayManager displayManager) {
            this.f53762b = displayManager;
        }

        public void a() {
            this.f53762b.registerDisplayListener(this, null);
        }

        public void b() {
            this.f53762b.unregisterDisplayListener(this);
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i10) {
            if (i10 == 0) {
                h.this.h();
            }
        }
    }

    /* JADX INFO: compiled from: VideoFrameReleaseTimeHelper.java */
    public static final class b implements Choreographer.FrameCallback, Handler.Callback {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final b f53764g = new b();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile long f53765b = -9223372036854775807L;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Handler f53766c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final HandlerThread f53767d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Choreographer f53768e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f53769f;

        public static b d() {
            return f53764g;
        }

        public void a() {
            this.f53766c.sendEmptyMessage(1);
        }

        public final void b() {
            int i10 = this.f53769f + 1;
            this.f53769f = i10;
            if (i10 == 1) {
                this.f53768e.postFrameCallback(this);
            }
        }

        @Override // android.view.Choreographer.FrameCallback
        public void doFrame(long j10) {
            this.f53765b = j10;
            this.f53768e.postFrameCallbackDelayed(this, 500L);
        }

        public void e() {
            this.f53766c.sendEmptyMessage(2);
        }

        public final void f() {
            int i10 = this.f53769f - 1;
            this.f53769f = i10;
            if (i10 == 0) {
                this.f53768e.removeFrameCallback(this);
                this.f53765b = -9223372036854775807L;
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i10 = message.what;
            if (i10 == 0) {
                c();
                return true;
            }
            if (i10 == 1) {
                b();
                return true;
            }
            if (i10 != 2) {
                return false;
            }
            f();
            return true;
        }

        public b() {
            HandlerThread handlerThread = new HandlerThread("ChoreographerOwner:Handler");
            this.f53767d = handlerThread;
            handlerThread.start();
            Handler handlerW = k0.w(handlerThread.getLooper(), this);
            this.f53766c = handlerW;
            handlerW.sendEmptyMessage(0);
        }

        public final void c() {
            this.f53768e = Choreographer.getInstance();
        }
    }

    public void e() {
        this.f53758i = false;
        if (this.f53750a != null) {
            this.f53751b.a();
            a aVar = this.f53752c;
            if (aVar != null) {
                aVar.a();
            }
            h();
        }
    }

    public static long c(long j10, long j11, long j12) {
        long j13;
        long j14 = j11 + (((j10 - j11) / j12) * j12);
        if (j10 <= j14) {
            j13 = j14 - j12;
        } else {
            j14 = j12 + j14;
            j13 = j14;
        }
        return j14 - j10 < j10 - j13 ? j14 : j13;
    }

    public long b(long j10, long j11) {
        long j12;
        long j13;
        long j14 = 1000 * j10;
        if (this.f53758i) {
            if (j10 != this.f53755f) {
                this.f53761l++;
                this.f53756g = this.f53757h;
            }
            long j15 = this.f53761l;
            if (j15 >= 6) {
                j13 = this.f53756g + ((j14 - this.f53760k) / j15);
                if (f(j13, j11)) {
                    this.f53758i = false;
                } else {
                    j12 = (this.f53759j + j13) - this.f53760k;
                }
            } else if (f(j14, j11)) {
                this.f53758i = false;
            }
            j12 = j11;
            j13 = j14;
        } else {
            j12 = j11;
            j13 = j14;
        }
        if (!this.f53758i) {
            this.f53760k = j14;
            this.f53759j = j11;
            this.f53761l = 0L;
            this.f53758i = true;
        }
        this.f53755f = j10;
        this.f53757h = j13;
        b bVar = this.f53751b;
        if (bVar == null || this.f53753d == -9223372036854775807L) {
            return j12;
        }
        long j16 = bVar.f53765b;
        return j16 == -9223372036854775807L ? j12 : c(j12, j16, this.f53753d) - this.f53754e;
    }

    public void d() {
        if (this.f53750a != null) {
            a aVar = this.f53752c;
            if (aVar != null) {
                aVar.b();
            }
            this.f53751b.e();
        }
    }

    public final boolean f(long j10, long j11) {
        return Math.abs((j11 - this.f53759j) - (j10 - this.f53760k)) > 20000000;
    }

    @TargetApi(17)
    public final a g(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager == null) {
            return null;
        }
        return new a(displayManager);
    }

    public final void h() {
        Display defaultDisplay = this.f53750a.getDefaultDisplay();
        if (defaultDisplay != null) {
            long refreshRate = (long) (1.0E9d / ((double) defaultDisplay.getRefreshRate()));
            this.f53753d = refreshRate;
            this.f53754e = (refreshRate * 80) / 100;
        }
    }

    public h(@Nullable Context context) {
        if (context != null) {
            context = context.getApplicationContext();
            this.f53750a = (WindowManager) context.getSystemService("window");
        } else {
            this.f53750a = null;
        }
        if (this.f53750a != null) {
            this.f53752c = k0.f53108a >= 17 ? g(context) : null;
            this.f53751b = b.d();
        } else {
            this.f53752c = null;
            this.f53751b = null;
        }
        this.f53753d = -9223372036854775807L;
        this.f53754e = -9223372036854775807L;
    }
}
