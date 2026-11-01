package io.bidmachine.rendering.internal.adform.video.player;

import android.net.Uri;
import android.view.View;
import androidx.annotation.CallSuper;
import io.bidmachine.rendering.internal.n;
import io.bidmachine.rendering.model.Error;
import io.bidmachine.rendering.utils.UiUtils;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes9.dex */
public abstract class a implements b {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private d f60042f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Uri f60045i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f60047k;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private volatile boolean f60043g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile boolean f60044h = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f60046j = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0518a f60037a = new C0518a(16);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f60038b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f60039c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f60040d = new AtomicBoolean(false);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicLong f60041e = new AtomicLong(-1);

    /* JADX INFO: renamed from: io.bidmachine.rendering.internal.adform.video.player.a$a, reason: collision with other inner class name */
    public class C0518a implements n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final AtomicBoolean f60048a = new AtomicBoolean(false);

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicInteger f60049b = new AtomicInteger(0);

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f60050c;

        public C0518a(int i10) {
            this.f60050c = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d() {
            this.f60048a.set(false);
            UiUtils.cancelOnUiThread(this);
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public void onRun() {
            if (this.f60048a.get()) {
                if (a.this.F()) {
                    a();
                }
                a aVar = a.this;
                aVar.b(aVar.r());
                UiUtils.onUiThread(this, this.f60050c);
            }
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable
        public /* bridge */ /* synthetic */ void onThrows(Throwable th2) {
            super.onThrows(th2);
        }

        @Override // io.bidmachine.rendering.internal.n, io.bidmachine.util.SafeRunnable, java.lang.Runnable
        @CallSuper
        public /* bridge */ /* synthetic */ void run() {
            super.run();
        }

        private void a() {
            Long lR = a.this.r();
            if (lR == null) {
                return;
            }
            long jG = a.this.g();
            if (jG <= 0) {
                return;
            }
            float fLongValue = (lR.longValue() * 100.0f) / jG;
            int i10 = this.f60049b.get();
            if (fLongValue > (i10 * 25.0f) - 1.0f) {
                if (i10 == 0) {
                    a.this.O();
                } else if (i10 == 1) {
                    a.this.M();
                } else if (i10 == 2) {
                    a.this.N();
                } else if (i10 == 3) {
                    a.this.P();
                } else if (i10 == 4) {
                    a.this.L();
                }
                this.f60049b.incrementAndGet();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            this.f60049b.set(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            d();
            this.f60048a.set(true);
            UiUtils.onUiThread(this);
        }
    }

    private void R() {
        try {
            this.f60046j = x();
        } catch (Exception unused) {
        }
    }

    private void a(boolean z10, Long l10) {
        if (l10 != null) {
            try {
                this.f60047k = l10.longValue();
            } catch (Exception e10) {
                a(e10);
                return;
            }
        }
        if (z10) {
            if (l10 != null) {
                c(l10.longValue());
            }
            C();
        } else {
            E();
            Uri uri = this.f60045i;
            if (uri != null) {
                c(uri);
            }
            D();
        }
    }

    private d s() {
        return this.f60042f;
    }

    public boolean A() {
        return h();
    }

    public void B() {
        j();
    }

    public void C() {
        k();
    }

    public void D() {
        n();
    }

    public void E() {
        o();
    }

    public boolean F() {
        try {
            return z();
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean G() {
        try {
            return A();
        } catch (Exception unused) {
            return false;
        }
    }

    public void H() {
        d dVarS;
        if (this.f60040d.get() || (dVarS = s()) == null) {
            return;
        }
        dVarS.c(this);
    }

    public void I() {
        d dVarS;
        if (this.f60040d.get() || (dVarS = s()) == null) {
            return;
        }
        dVarS.d(this);
    }

    public void J() {
        d dVarS;
        if (this.f60040d.get() || (dVarS = s()) == null) {
            return;
        }
        dVarS.b(this);
    }

    public void K() {
        d dVarS;
        if (this.f60038b.compareAndSet(false, true) && (dVarS = s()) != null) {
            dVarS.f(this);
        }
    }

    public void L() {
        d dVarS;
        if (this.f60040d.compareAndSet(false, true) && (dVarS = s()) != null) {
            dVarS.i(this);
        }
    }

    public void M() {
        d dVarS;
        if (this.f60040d.get() || (dVarS = s()) == null) {
            return;
        }
        dVarS.a(this);
    }

    public void N() {
        d dVarS;
        if (this.f60040d.get() || (dVarS = s()) == null) {
            return;
        }
        dVarS.h(this);
    }

    public void O() {
        d dVarS;
        if (this.f60040d.get() || (dVarS = s()) == null) {
            return;
        }
        dVarS.g(this);
    }

    public void P() {
        d dVarS;
        if (this.f60040d.get() || (dVarS = s()) == null) {
            return;
        }
        dVarS.e(this);
    }

    public void Q() {
        if (this.f60040d.get()) {
            return;
        }
        this.f60037a.c();
    }

    public abstract void a(float f10);

    public abstract void a(long j10);

    public abstract long b();

    public void b(float f10) {
        f(f10);
        d(f10);
    }

    public abstract void b(Uri uri);

    public abstract long c();

    public void c(Uri uri) {
        b(uri);
    }

    public abstract float d();

    public void e(float f10) {
        try {
            c(f10);
        } catch (Exception unused) {
        }
    }

    public void f(float f10) {
        boolean z10;
        if (f10 == 0.0f && !this.f60043g) {
            z10 = true;
        } else if (!this.f60043g) {
            return;
        } else {
            z10 = false;
        }
        this.f60043g = z10;
        a(z10);
    }

    public abstract boolean f();

    @Override // io.bidmachine.rendering.internal.adform.video.player.b
    public long g() {
        return this.f60046j;
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.b
    public float getVolume() {
        try {
            return y();
        } catch (Exception unused) {
            return 0.0f;
        }
    }

    public abstract boolean h();

    @Override // io.bidmachine.rendering.internal.adform.video.player.b, io.bidmachine.rendering.internal.q
    public void i() {
        e(1.0f);
    }

    public abstract void j();

    public abstract void k();

    @Override // io.bidmachine.rendering.internal.adform.video.player.b, io.bidmachine.rendering.internal.q
    public void l() {
        e(0.0f);
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.b, io.bidmachine.rendering.internal.t
    public void m() {
        try {
            this.f60040d.set(false);
            this.f60037a.b();
            a((Long) 0L);
        } catch (Exception e10) {
            b(e10);
        }
    }

    public abstract void n();

    public abstract void o();

    @Override // io.bidmachine.rendering.internal.adform.video.player.b
    public abstract /* synthetic */ View p();

    @Override // io.bidmachine.rendering.internal.adform.video.player.b
    public void pause() {
        try {
            this.f60039c.set(false);
            B();
            this.f60047k = w();
        } catch (Exception unused) {
        }
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.b
    public void play() {
        try {
            this.f60044h = true;
            a(this.f60040d.get() ? Long.valueOf(g()) : null);
        } catch (Exception e10) {
            b(e10);
        }
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.b
    public void prepare() {
        try {
            D();
        } catch (Exception e10) {
            c(e10);
        }
    }

    public void q() {
        this.f60037a.d();
    }

    public Long r() {
        try {
            return Long.valueOf(w());
        } catch (Exception unused) {
            return null;
        }
    }

    public void t() {
        H();
        q();
    }

    public void u() {
        J();
        Q();
    }

    public void v() {
        R();
        if (this.f60039c.compareAndSet(true, false)) {
            a(true, Long.valueOf(this.f60047k));
        }
        K();
    }

    public long w() {
        return b();
    }

    public long x() {
        return c();
    }

    public float y() {
        return d();
    }

    public boolean z() {
        return f();
    }

    private void a(Long l10) {
        this.f60039c.set(true);
        a(G(), l10);
    }

    public void b(long j10) {
        a(j10);
    }

    public void c(float f10) {
        a(f10);
    }

    public void d(float f10) {
        d dVarS;
        if (this.f60040d.get() || (dVarS = s()) == null) {
            return;
        }
        dVarS.a(this, f10);
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.b, io.bidmachine.rendering.internal.w
    public void e() {
        if (!this.f60044h || this.f60040d.get()) {
            return;
        }
        pause();
        c(g());
        I();
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.b
    public void a() {
        this.f60042f = null;
        q();
    }

    public void b(Error error) {
        if (this.f60040d.get()) {
            return;
        }
        d dVarS = s();
        if (dVarS != null) {
            dVarS.a(this, error);
        }
        L();
    }

    public void c(Error error) {
        d dVarS;
        if (this.f60040d.get() || (dVarS = s()) == null) {
            return;
        }
        dVarS.b(this, error);
    }

    public void a(Error error) {
        if (this.f60044h) {
            b(error);
        } else {
            c(error);
        }
    }

    public void b(Throwable th2) {
        b(Error.create(th2));
    }

    public void c(Throwable th2) {
        c(Error.create(th2));
    }

    public void a(Throwable th2) {
        a(Error.create(th2));
    }

    public void b(Long l10) {
        d dVarS;
        if (l10 == null || this.f60041e.getAndSet(l10.longValue()) == l10.longValue() || this.f60040d.get() || (dVarS = s()) == null) {
            return;
        }
        dVarS.a((b) this, l10.longValue());
    }

    public void c(long j10) {
        try {
            b(j10);
        } catch (Exception unused) {
        }
    }

    public void a(boolean z10) {
        d dVarS;
        if (this.f60040d.get() || (dVarS = s()) == null) {
            return;
        }
        dVarS.a(this, z10);
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.b
    public void a(d dVar) {
        this.f60042f = dVar;
    }

    @Override // io.bidmachine.rendering.internal.adform.video.player.b
    public void a(Uri uri) {
        try {
            c(uri);
            this.f60045i = uri;
        } catch (Exception unused) {
        }
    }
}
