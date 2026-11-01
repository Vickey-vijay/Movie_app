package com.inmobi.media;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: loaded from: classes8.dex */
public final class U3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f23612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3053n9 f23613b;

    public U3(Context context, C3053n9 c3053n9) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        this.f23612a = context;
        this.f23613b = c3053n9;
    }

    public final C3063nj a(C3261vi c3261vi) {
        ck.p.j(c3261vi, "resource");
        c3261vi.getClass();
        return new C3063nj(this.f23612a, this.f23613b);
    }
}
