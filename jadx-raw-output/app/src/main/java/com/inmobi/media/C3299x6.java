package com.inmobi.media;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: renamed from: com.inmobi.media.x6, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C3299x6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f25705a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nk.l0 f25706b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final qk.k f25707c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C3053n9 f25708d;

    public C3299x6(Context context, nk.l0 l0Var, qk.k kVar, C3053n9 c3053n9) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(l0Var, "coroutineScope");
        ck.p.j(kVar, "mediaEventFlow");
        this.f25705a = context;
        this.f25706b = l0Var;
        this.f25707c = kVar;
        this.f25708d = c3053n9;
    }
}
