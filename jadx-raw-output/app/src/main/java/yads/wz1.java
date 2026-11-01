package yads;

import android.os.Handler;
import android.os.Looper;
import yads.wz1;

/* JADX INFO: loaded from: classes10.dex */
public final class wz1 implements g1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f84385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z00 f84386b;

    public /* synthetic */ wz1() {
        this(new Handler(Looper.getMainLooper()));
    }

    public final void a() {
        this.f84385a.post(new Runnable() { // from class: cp.lc
            @Override // java.lang.Runnable
            public final void run() {
                wz1.a(this.f51435b);
            }
        });
    }

    public final void b() {
        this.f84385a.post(new Runnable() { // from class: cp.kc
            @Override // java.lang.Runnable
            public final void run() {
                wz1.b(this.f51416b);
            }
        });
    }

    public static final void a(wz1 wz1Var) {
        z00 z00Var = wz1Var.f84386b;
        if (z00Var != null) {
            z00Var.closeNativeAd();
        }
    }

    public static final void b(wz1 wz1Var) {
        z00 z00Var = wz1Var.f84386b;
        if (z00Var != null) {
            z00Var.onAdClicked();
        }
        z00 z00Var2 = wz1Var.f84386b;
        if (z00Var2 != null) {
            z00Var2.onLeftApplication();
        }
    }

    public static final void c(wz1 wz1Var) {
        z00 z00Var = wz1Var.f84386b;
        if (z00Var != null) {
            z00Var.onReturnedToApplication();
        }
    }

    @Override // yads.g1
    public final void onReturnedToApplication() {
        this.f84385a.post(new Runnable() { // from class: cp.nc
            @Override // java.lang.Runnable
            public final void run() {
                wz1.c(this.f51478b);
            }
        });
    }

    public wz1(Handler handler) {
        this.f84385a = handler;
    }

    public final void a(final j5 j5Var) {
        this.f84385a.post(new Runnable() { // from class: cp.mc
            @Override // java.lang.Runnable
            public final void run() {
                wz1.a(this.f51454b, j5Var);
            }
        });
    }

    public static final void a(wz1 wz1Var, j5 j5Var) {
        z00 z00Var = wz1Var.f84386b;
        if (z00Var != null) {
            z00Var.a(j5Var);
        }
    }
}
