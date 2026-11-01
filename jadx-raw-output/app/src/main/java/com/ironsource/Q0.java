package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes6.dex */
public class Q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final O0 f27389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Gb f27390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final C3785xb f27391c = c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Timer f27392d;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Q0.this.f27390b.b();
        }
    }

    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            Q0.this.f27390b.b();
        }
    }

    private synchronized void b(long j10) {
        j();
        Timer timer = new Timer();
        this.f27392d = timer;
        timer.schedule(new b(), j10);
    }

    private synchronized void j() {
        Timer timer = this.f27392d;
        if (timer != null) {
            timer.cancel();
            this.f27392d = null;
        }
    }

    public void a() {
        if (this.f27389a.a() == O0.a.MANUAL_WITH_AUTOMATIC_RELOAD) {
            IronLog.INTERNAL.verbose();
            i();
        }
    }

    private C3785xb c() {
        return new C3785xb(new a(), com.ironsource.lifecycle.b.d(), new Vf());
    }

    public boolean d() {
        return this.f27389a.c() > 0;
    }

    public void e() {
        if (this.f27389a.e()) {
            IronLog.INTERNAL.verbose();
            b(this.f27389a.c());
        }
    }

    public void f() {
        if (this.f27389a.a() == O0.a.AUTOMATIC_LOAD_AFTER_CLOSE) {
            IronLog.INTERNAL.verbose();
            b(this.f27389a.d());
        }
    }

    public void g() {
        if (this.f27389a.e()) {
            IronLog.INTERNAL.verbose();
            b(0L);
        }
    }

    public void h() {
        if (this.f27389a.a() != O0.a.AUTOMATIC_LOAD_WHILE_SHOW || this.f27389a.d() < 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        b(this.f27389a.d());
    }

    public void i() {
        C3785xb c3785xb = this.f27391c;
        if (c3785xb != null) {
            c3785xb.b();
        }
    }

    public void k() {
        if (this.f27389a.a() != O0.a.MANUAL_WITH_AUTOMATIC_RELOAD || this.f27389a.b() <= 0) {
            return;
        }
        IronLog.INTERNAL.verbose();
        a(this.f27389a.b());
    }

    public Q0(O0 o10, Gb gb2) {
        this.f27389a = o10;
        this.f27390b = gb2;
    }

    public void a(long j10) {
        C3785xb c3785xb = this.f27391c;
        if (c3785xb != null) {
            c3785xb.a(j10);
        }
    }

    public O0 b() {
        return this.f27389a;
    }
}
