package com.ironsource;

import android.util.Log;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.ironsource.xb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3785xb {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f31584g = "xb";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.ironsource.lifecycle.b f31585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Runnable f31586b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Vf f31587c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Timer f31589e;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f31588d = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final InterfaceC3593ma f31590f = new a();

    /* JADX INFO: renamed from: com.ironsource.xb$a */
    public class a implements InterfaceC3593ma {
        @Override // com.ironsource.InterfaceC3593ma
        public void c() {
        }

        @Override // com.ironsource.InterfaceC3593ma
        public void d() {
        }

        public a() {
        }

        @Override // com.ironsource.InterfaceC3593ma
        public void a() {
            C3785xb.this.f31587c.c(System.currentTimeMillis());
            C3785xb.this.c();
        }

        @Override // com.ironsource.InterfaceC3593ma
        public void b() {
            C3785xb.this.f31587c.b(System.currentTimeMillis());
            C3785xb c3785xb = C3785xb.this;
            c3785xb.b(c3785xb.f31587c.a());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.xb$b */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C3785xb c3785xb = C3785xb.this;
            c3785xb.f31585a.b(c3785xb.f31590f);
            C3785xb.this.f31587c.b();
            C3785xb.this.f31586b.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        synchronized (this.f31588d) {
            Timer timer = this.f31589e;
            if (timer != null) {
                timer.cancel();
                this.f31589e = null;
            }
        }
    }

    public void a() {
        a(0L);
    }

    public void b() {
        c();
        this.f31585a.b(this.f31590f);
        this.f31587c.b();
    }

    public void a(long j10) {
        if (j10 < 0) {
            Log.d(f31584g, "cannot start timer with delay < 0");
            return;
        }
        this.f31585a.a(this.f31590f);
        this.f31587c.a(j10);
        if (this.f31585a.e()) {
            this.f31587c.c(System.currentTimeMillis());
        } else {
            b(j10);
        }
    }

    public C3785xb(Runnable runnable, com.ironsource.lifecycle.b bVar, Vf vf2) {
        this.f31586b = runnable;
        this.f31585a = bVar;
        this.f31587c = vf2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j10) {
        synchronized (this.f31588d) {
            c();
            Timer timer = new Timer();
            this.f31589e = timer;
            timer.schedule(new b(), j10);
        }
    }
}
