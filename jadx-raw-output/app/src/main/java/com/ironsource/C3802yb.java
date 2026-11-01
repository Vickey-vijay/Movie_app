package com.ironsource;

import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.ironsource.yb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C3802yb implements InterfaceC3593ma {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Timer f31649b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f31652e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f31653f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f31648a = "INTERNAL";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f31650c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Long f31651d = null;

    /* JADX INFO: renamed from: com.ironsource.yb$a */
    public class a extends TimerTask {
        public a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            C3802yb.this.f31653f.run();
        }
    }

    private synchronized void f() {
        Timer timer = this.f31649b;
        if (timer != null) {
            timer.cancel();
            this.f31649b = null;
        }
    }

    private synchronized void h() {
        if (this.f31649b == null) {
            Timer timer = new Timer();
            this.f31649b = timer;
            timer.schedule(new a(), this.f31652e);
            Calendar.getInstance().setTimeInMillis(this.f31651d.longValue());
        }
    }

    @Override // com.ironsource.InterfaceC3593ma
    public void a() {
        if (this.f31649b != null) {
            f();
        }
    }

    @Override // com.ironsource.InterfaceC3593ma
    public void c() {
    }

    @Override // com.ironsource.InterfaceC3593ma
    public void d() {
    }

    @Override // com.ironsource.InterfaceC3593ma
    public void b() {
        Long l10;
        if (this.f31649b == null && (l10 = this.f31651d) != null) {
            long jLongValue = l10.longValue() - System.currentTimeMillis();
            this.f31652e = jLongValue;
            if (jLongValue > 0) {
                h();
            } else {
                e();
                this.f31653f.run();
            }
        }
    }

    public void g() {
        if (this.f31650c) {
            return;
        }
        this.f31650c = true;
        com.ironsource.lifecycle.b.d().a(this);
        this.f31651d = Long.valueOf(System.currentTimeMillis() + this.f31652e);
        if (com.ironsource.lifecycle.b.d().e()) {
            return;
        }
        h();
    }

    public C3802yb(long j10, Runnable runnable, boolean z10) {
        this.f31652e = j10;
        this.f31653f = runnable;
        if (z10) {
            g();
        }
    }

    public void e() {
        f();
        this.f31650c = false;
        this.f31651d = null;
        com.ironsource.lifecycle.b.d().b(this);
    }
}
