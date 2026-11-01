package com.ironsource;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.ironsource.de, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public class C3436de {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C3641p2 f28689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private InterfaceC3454ee f28690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Timer f28691c = null;

    /* JADX INFO: renamed from: com.ironsource.de$a */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C3436de.this.f28690b.b();
        }
    }

    /* JADX INFO: renamed from: com.ironsource.de$b */
    public class b extends TimerTask {
        public b() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C3436de.this.f28690b.b();
        }
    }

    public synchronized void a() {
        d();
        Timer timer = new Timer();
        this.f28691c = timer;
        timer.schedule(new b(), this.f28689a.b());
    }

    public void b() {
        synchronized (this) {
            d();
        }
        this.f28690b.b();
    }

    public synchronized void c() {
        d();
        Timer timer = new Timer();
        this.f28691c = timer;
        timer.schedule(new a(), this.f28689a.j());
    }

    private void d() {
        Timer timer = this.f28691c;
        if (timer != null) {
            timer.cancel();
            this.f28691c = null;
        }
    }

    public C3436de(C3641p2 c3641p2, InterfaceC3454ee interfaceC3454ee) {
        this.f28689a = c3641p2;
        this.f28690b = interfaceC3454ee;
    }
}
