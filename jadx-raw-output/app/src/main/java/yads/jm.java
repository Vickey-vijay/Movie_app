package yads;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import yads.jm;

/* JADX INFO: loaded from: classes10.dex */
public final class jm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f79092a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y5 f79093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public h00 f79094c;

    public /* synthetic */ jm(Context context, d4 d4Var, iu3 iu3Var, w5 w5Var) {
        this(new Handler(Looper.getMainLooper()), new y5(context, d4Var, iu3Var, w5Var));
    }

    public final void a() {
        this.f79092a.post(new Runnable() { // from class: cp.p3
            @Override // java.lang.Runnable
            public final void run() {
                jm.a(this.f51505b);
            }
        });
    }

    public final void b() {
        this.f79093b.a();
        this.f79092a.post(new Runnable() { // from class: cp.m3
            @Override // java.lang.Runnable
            public final void run() {
                jm.b(this.f51445b);
            }
        });
    }

    public final void c() {
        this.f79092a.post(new Runnable() { // from class: cp.n3
            @Override // java.lang.Runnable
            public final void run() {
                jm.c(this.f51464b);
            }
        });
    }

    public final void d() {
        this.f79092a.post(new Runnable() { // from class: cp.q3
            @Override // java.lang.Runnable
            public final void run() {
                jm.d(this.f51527b);
            }
        });
    }

    public static final void a(jm jmVar) {
        h00 h00Var = jmVar.f79094c;
        if (h00Var != null) {
            h00Var.closeBannerAd();
        }
    }

    public static final void c(jm jmVar) {
        h00 h00Var = jmVar.f79094c;
        if (h00Var != null) {
            h00Var.onAdClicked();
            h00Var.onLeftApplication();
        }
    }

    public static final void d(jm jmVar) {
        h00 h00Var = jmVar.f79094c;
        if (h00Var != null) {
            h00Var.onReturnedToApplication();
        }
    }

    public static final void b(jm jmVar) {
        h00 h00Var = jmVar.f79094c;
        if (h00Var != null) {
            h00Var.onAdLoaded();
        }
    }

    public final void a(final l4 l4Var) {
        this.f79093b.a(l4Var.f79698b, l4Var.f79699c);
        this.f79092a.post(new Runnable() { // from class: cp.l3
            @Override // java.lang.Runnable
            public final void run() {
                jm.a(this.f51421b, l4Var);
            }
        });
    }

    public jm(Handler handler, y5 y5Var) {
        this.f79092a = handler;
        this.f79093b = y5Var;
    }

    public static final void a(jm jmVar, l4 l4Var) {
        h00 h00Var = jmVar.f79094c;
        if (h00Var != null) {
            h00Var.a(l4Var);
        }
    }

    public final void a(final j5 j5Var) {
        this.f79092a.post(new Runnable() { // from class: cp.o3
            @Override // java.lang.Runnable
            public final void run() {
                jm.a(this.f51487b, j5Var);
            }
        });
    }

    public static final void a(jm jmVar, j5 j5Var) {
        h00 h00Var = jmVar.f79094c;
        if (h00Var != null) {
            h00Var.a(j5Var);
        }
    }

    public final void a(d4 d4Var) {
        this.f79093b.f84823e = new j9(d4Var);
    }

    public final void a(i12 i12Var) {
        this.f79093b.f84824f = i12Var;
    }
}
