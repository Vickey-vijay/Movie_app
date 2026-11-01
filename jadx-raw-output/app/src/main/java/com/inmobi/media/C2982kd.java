package com.inmobi.media;

import android.content.Context;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: renamed from: com.inmobi.media.kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2982kd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f24669a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G f24670b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f24671c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Za f24672d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Dc f24673e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3020m1 f24674f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3028m9 f24675g;

    public C2982kd(Context context, G g10, boolean z10, Za za2, Dc dc2, InterfaceC3020m1 interfaceC3020m1, InterfaceC3028m9 interfaceC3028m9) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(g10, "adContext");
        ck.p.j(za2, "telemetryMetaData");
        ck.p.j(dc2, "adTelemetryHelper");
        ck.p.j(interfaceC3020m1, "adUnitCallback");
        this.f24669a = context;
        this.f24670b = g10;
        this.f24671c = z10;
        this.f24672d = za2;
        this.f24673e = dc2;
        this.f24674f = interfaceC3020m1;
        this.f24675g = interfaceC3028m9;
    }
}
