package io.appmetrica.analytics.impl;

import android.app.Activity;
import android.content.Context;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.cj, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C4120cj implements InterfaceC4332l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public We f56523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ScreenInfo f56524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f56525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f56526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C4094bj f56527e = new C4094bj();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference f56528f = new WeakReference(null);

    @WorkerThread
    public final synchronized void a(Activity activity) {
        this.f56528f = new WeakReference(activity);
        if (!this.f56526d) {
            this.f56524b = a((Context) activity).p();
            this.f56525c = a((Context) activity).t();
            this.f56526d = true;
        }
        if (this.f56524b == null) {
            c(activity);
        }
    }

    @WorkerThread
    public final synchronized ScreenInfo b(Context context) {
        if (!this.f56526d) {
            this.f56524b = a(context).p();
            this.f56525c = a(context).t();
            this.f56526d = true;
        }
        c((Context) this.f56528f.get());
        if (this.f56524b == null) {
            if (!AndroidUtils.isApiAchieved(30)) {
                c(context);
            } else if (!this.f56525c) {
                c(context);
                this.f56525c = true;
                a(context).v();
            }
        }
        return this.f56524b;
    }

    public final void c(Context context) {
        if (context != null) {
            this.f56527e.getClass();
            ScreenInfo screenInfoA = C4094bj.a(context);
            if (screenInfoA == null || ck.p.e(screenInfoA, this.f56524b)) {
                return;
            }
            this.f56524b = screenInfoA;
            a(context).a(this.f56524b);
        }
    }

    public final We a(Context context) {
        if (this.f56523a == null) {
            this.f56523a = new We(C4105c4.l().c(context).a(context));
        }
        We we2 = this.f56523a;
        ck.p.g(we2);
        return we2;
    }

    @VisibleForTesting
    public final void a(We we2) {
        this.f56523a = we2;
    }
}
