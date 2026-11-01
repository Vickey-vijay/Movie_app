package ym;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: AbstractLifeCycle.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class a implements f {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final zm.c f85781j = zm.b.a(a.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f85782b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f85783c = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f85784d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f85785e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f85786f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f85787g = 3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public volatile int f85788h = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final CopyOnWriteArrayList<f.a> f85789i = new CopyOnWriteArrayList<>();

    public void d0() throws Exception {
    }

    public void e0() throws Exception {
    }

    public final void h0(Throwable th2) {
        this.f85788h = -1;
        f85781j.c("FAILED " + this + ": " + th2, th2);
        Iterator<f.a> it = this.f85789i.iterator();
        while (it.hasNext()) {
            it.next().B(this, th2);
        }
    }

    public final void i0() {
        this.f85788h = 2;
        f85781j.i("STARTED {}", this);
        Iterator<f.a> it = this.f85789i.iterator();
        while (it.hasNext()) {
            it.next().i(this);
        }
    }

    public final void k0() {
        this.f85788h = 0;
        f85781j.i("{} {}", "STOPPED", this);
        Iterator<f.a> it = this.f85789i.iterator();
        while (it.hasNext()) {
            it.next().n(this);
        }
    }

    @Override // ym.f
    public boolean I() {
        return this.f85788h == 1;
    }

    public String f0() {
        int i10 = this.f85788h;
        if (i10 == -1) {
            return "FAILED";
        }
        if (i10 == 0) {
            return "STOPPED";
        }
        if (i10 == 1) {
            return "STARTING";
        }
        if (i10 == 2) {
            return "STARTED";
        }
        if (i10 != 3) {
            return null;
        }
        return "STOPPING";
    }

    @Override // ym.f
    public boolean isRunning() {
        int i10 = this.f85788h;
        return i10 == 2 || i10 == 1;
    }

    @Override // ym.f
    public boolean isStarted() {
        return this.f85788h == 2;
    }

    @Override // ym.f
    public boolean isStopped() {
        return this.f85788h == 0;
    }

    public final void j0() {
        f85781j.i("starting {}", this);
        this.f85788h = 1;
        Iterator<f.a> it = this.f85789i.iterator();
        while (it.hasNext()) {
            it.next().k(this);
        }
    }

    public final void l0() {
        f85781j.i("stopping {}", this);
        this.f85788h = 3;
        Iterator<f.a> it = this.f85789i.iterator();
        while (it.hasNext()) {
            it.next().u(this);
        }
    }

    @Override // ym.f
    public boolean s() {
        return this.f85788h == 3;
    }

    @Override // ym.f
    public final void start() throws Exception {
        synchronized (this.f85782b) {
            try {
                try {
                    if (this.f85788h != 2 && this.f85788h != 1) {
                        j0();
                        d0();
                        i0();
                    }
                } catch (Error e10) {
                    h0(e10);
                    throw e10;
                } catch (Exception e11) {
                    h0(e11);
                    throw e11;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // ym.f
    public final void stop() throws Exception {
        synchronized (this.f85782b) {
            try {
                try {
                    if (this.f85788h != 3 && this.f85788h != 0) {
                        l0();
                        e0();
                        k0();
                    }
                } catch (Error e10) {
                    h0(e10);
                    throw e10;
                } catch (Exception e11) {
                    h0(e11);
                    throw e11;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static String g0(f fVar) {
        if (fVar.I()) {
            return "STARTING";
        }
        if (fVar.isStarted()) {
            return "STARTED";
        }
        if (fVar.s()) {
            return "STOPPING";
        }
        if (fVar.isStopped()) {
            return "STOPPED";
        }
        return "FAILED";
    }
}
