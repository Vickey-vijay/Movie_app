package yads;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes9.dex */
public final class ok0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f81062a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ym1 f81063b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CopyOnWriteArrayList f81064c;

    public ok0() {
        this(new CopyOnWriteArrayList(), 0, null);
    }

    public final void a(Handler handler, pk0 pk0Var) {
        pk0Var.getClass();
        this.f81064c.add(new nk0(handler, pk0Var));
    }

    public final void b() {
        for (nk0 nk0Var : this.f81064c) {
            final pk0 pk0Var = nk0Var.f80680b;
            ib3.a(nk0Var.f80679a, new Runnable() { // from class: cp.t7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51598b.b(pk0Var);
                }
            });
        }
    }

    public final void c() {
        for (nk0 nk0Var : this.f81064c) {
            final pk0 pk0Var = nk0Var.f80680b;
            ib3.a(nk0Var.f80679a, new Runnable() { // from class: cp.u7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51618b.c(pk0Var);
                }
            });
        }
    }

    public final void d() {
        for (nk0 nk0Var : this.f81064c) {
            final pk0 pk0Var = nk0Var.f80680b;
            ib3.a(nk0Var.f80679a, new Runnable() { // from class: cp.r7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51555b.d(pk0Var);
                }
            });
        }
    }

    public ok0(CopyOnWriteArrayList copyOnWriteArrayList, int i10, ym1 ym1Var) {
        this.f81064c = copyOnWriteArrayList;
        this.f81062a = i10;
        this.f81063b = ym1Var;
    }

    public final void a() {
        for (nk0 nk0Var : this.f81064c) {
            final pk0 pk0Var = nk0Var.f80680b;
            ib3.a(nk0Var.f80679a, new Runnable() { // from class: cp.v7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51639b.a(pk0Var);
                }
            });
        }
    }

    public final /* synthetic */ void b(pk0 pk0Var) {
        pk0Var.d(this.f81062a, this.f81063b);
    }

    public final /* synthetic */ void c(pk0 pk0Var) {
        pk0Var.c(this.f81062a, this.f81063b);
    }

    public final /* synthetic */ void d(pk0 pk0Var) {
        pk0Var.b(this.f81062a, this.f81063b);
    }

    public final void a(final int i10) {
        for (nk0 nk0Var : this.f81064c) {
            final pk0 pk0Var = nk0Var.f80680b;
            ib3.a(nk0Var.f80679a, new Runnable() { // from class: cp.q7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51532b.a(pk0Var, i10);
                }
            });
        }
    }

    public final void a(final Exception exc) {
        for (nk0 nk0Var : this.f81064c) {
            final pk0 pk0Var = nk0Var.f80680b;
            ib3.a(nk0Var.f80679a, new Runnable() { // from class: cp.s7
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51579b.a(pk0Var, exc);
                }
            });
        }
    }

    public final /* synthetic */ void a(pk0 pk0Var) {
        pk0Var.a(this.f81062a, this.f81063b);
    }

    public final /* synthetic */ void a(pk0 pk0Var, int i10) {
        pk0Var.getClass();
        pk0Var.a(this.f81062a, this.f81063b, i10);
    }

    public final /* synthetic */ void a(pk0 pk0Var, Exception exc) {
        pk0Var.a(this.f81062a, this.f81063b, exc);
    }
}
