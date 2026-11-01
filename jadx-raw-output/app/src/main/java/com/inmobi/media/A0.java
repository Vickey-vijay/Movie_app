package com.inmobi.media;

import android.content.Context;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.adquality.models.AdQualityResult;
import com.inmobi.media.A0;
import com.inmobi.media.core.config.models.AdConfig;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public final class A0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicBoolean f22329a = new AtomicBoolean(false);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f22330b = new AtomicBoolean(false);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f22331c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3343z0 f22332d = new C3343z0(this);

    public static final void a(A0 a10) {
        H0 h10 = (H0) E0.f22556a.getValue();
        C3343z0 c3343z0 = a10.f22332d;
        h10.getClass();
        ck.p.j(c3343z0, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        h10.f22767b = new WeakReference(c3343z0);
    }

    public static final mj.r b(A0 a10) {
        a10.f22329a.set(true);
        C2924i4 c2924i4 = Y3.f23815a;
        ck.p.j(AdConfig.class, "clazz");
        nk.j.d(A9.f22351c, null, null, new C3318y0(a10, (AdConfig) Y3.f23815a.a(AdConfig.class), null), 3, null);
        return mj.r.f64562a;
    }

    public A0() {
        Runnable runnable = new Runnable() { // from class: b7.a
            @Override // java.lang.Runnable
            public final void run() {
                A0.a(this.f4835b);
            }
        };
        Context context = Ji.f22951a;
        ck.p.j(runnable, "runnable");
        Ji.f22957g.submit(runnable);
    }

    public final void a() {
        AbstractC2792d.a(new bk.a() { // from class: b7.b
            @Override // bk.a
            public final Object invoke() {
                return A0.b(this.f4849b);
            }
        });
    }

    public static void a(AdQualityResult adQualityResult) {
        ck.p.j(adQualityResult, "result");
        try {
            nk.i.b(null, new C3293x0(adQualityResult, null), 1, null);
            if (adQualityResult.getImageLocation().length() == 0) {
                return;
            }
            new File(adQualityResult.getImageLocation()).delete();
        } catch (Exception unused) {
        }
    }
}
