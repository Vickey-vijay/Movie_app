package com.ironsource;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: renamed from: com.ironsource.e5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3445e5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3445e5 f28736a = new C3445e5();

    private final int a(Context context, int i10) {
        return ek.b.c(i10 / context.getResources().getDisplayMetrics().density);
    }

    public final int b(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        return a(context, context.getResources().getDisplayMetrics().widthPixels);
    }

    private C3445e5() {
    }

    public final int a(Context context) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        return a(context, context.getResources().getDisplayMetrics().heightPixels);
    }
}
