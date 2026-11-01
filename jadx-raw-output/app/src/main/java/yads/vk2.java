package yads;

import android.os.Handler;
import android.os.Looper;
import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import yads.vk2;

/* JADX INFO: loaded from: classes7.dex */
public final class vk2 implements iy0, qr2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final hy0 f83941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f83942b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public eu3 f83943c;

    public /* synthetic */ vk2(hy0 hy0Var) {
        this(hy0Var, new Handler(Looper.getMainLooper()));
    }

    public static final void a(vk2 vk2Var) {
        eu3 eu3Var = vk2Var.f83943c;
        if (eu3Var != null) {
            new CallbackStackTraceMarker(new yt3(eu3Var));
        }
    }

    public static final void b(vk2 vk2Var) {
        eu3 eu3Var = vk2Var.f83943c;
        if (eu3Var != null) {
            new CallbackStackTraceMarker(new zt3(eu3Var));
        }
    }

    public static final void c(vk2 vk2Var) {
        eu3 eu3Var = vk2Var.f83943c;
        if (eu3Var != null) {
            new CallbackStackTraceMarker(new cu3(eu3Var));
        }
        hy0 hy0Var = vk2Var.f83941a;
        if (hy0Var != null) {
            hy0Var.onAdShown();
        }
    }

    @Override // yads.iy0
    public final void onAdClicked() {
        this.f83942b.post(new Runnable() { // from class: cp.nb
            @Override // java.lang.Runnable
            public final void run() {
                vk2.a(this.f51477b);
            }
        });
    }

    @Override // yads.iy0
    public final void onAdDismissed() {
        this.f83942b.post(new Runnable() { // from class: cp.kb
            @Override // java.lang.Runnable
            public final void run() {
                vk2.b(this.f51415b);
            }
        });
    }

    @Override // yads.iy0
    public final void onAdShown() {
        this.f83942b.post(new Runnable() { // from class: cp.mb
            @Override // java.lang.Runnable
            public final void run() {
                vk2.c(this.f51453b);
            }
        });
    }

    public vk2(hy0 hy0Var, Handler handler) {
        this.f83941a = hy0Var;
        this.f83942b = handler;
    }

    public final void a(final n7 n7Var) {
        this.f83942b.post(new Runnable() { // from class: cp.lb
            @Override // java.lang.Runnable
            public final void run() {
                vk2.a(n7Var, this);
            }
        });
    }

    public static final void a(n7 n7Var, vk2 vk2Var) {
        String str = n7Var.f80579b;
        eu3 eu3Var = vk2Var.f83943c;
        if (eu3Var != null) {
            new CallbackStackTraceMarker(new au3(eu3Var, new wp3(str)));
        }
    }

    @Override // yads.iy0
    public final void a(final j5 j5Var) {
        this.f83942b.post(new Runnable() { // from class: cp.jb
            @Override // java.lang.Runnable
            public final void run() {
                vk2.a(this.f51395b, j5Var);
            }
        });
    }

    public static final void a(vk2 vk2Var, j5 j5Var) {
        eu3 eu3Var = vk2Var.f83943c;
        if (eu3Var != null) {
            new CallbackStackTraceMarker(new bu3(eu3Var, j5Var != null ? new lr3(j5Var) : null));
        }
    }

    @Override // yads.qr2
    public final void a(final bw2 bw2Var) {
        this.f83942b.post(new Runnable() { // from class: cp.ib
            @Override // java.lang.Runnable
            public final void run() {
                vk2.a(this.f51377b, bw2Var);
            }
        });
    }

    public static final void a(vk2 vk2Var, pq2 pq2Var) {
        eu3 eu3Var = vk2Var.f83943c;
        if (eu3Var != null) {
            new CallbackStackTraceMarker(new du3(eu3Var, new wt3(pq2Var)));
        }
    }
}
