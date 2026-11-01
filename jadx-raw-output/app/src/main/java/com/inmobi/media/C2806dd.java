package com.inmobi.media;

import android.content.Context;
import com.inmobi.ads.InMobiNative;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: renamed from: com.inmobi.media.dd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2806dd implements ro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Jg f24234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Rg f24235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Hc f24236c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Gc f24237d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public C2755be f24238e;

    @Override // com.inmobi.media.ro
    public final String a(double d10) {
        return this.f24237d.a(d10);
    }

    public C2806dd(InMobiNative inMobiNative, Context context, long j10) {
        ck.p.j(inMobiNative, "inMobiNative");
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        Jg jg2 = new Jg();
        jg2.f22935a = j10;
        this.f24234a = jg2;
        C2780cd c2780cd = new C2780cd(this);
        Rg rg2 = new Rg();
        this.f24235b = rg2;
        Hc hc2 = new Hc(inMobiNative, rg2, c2780cd);
        this.f24236c = hc2;
        this.f24237d = new Gc(context, jg2, hc2);
    }

    @Override // com.inmobi.media.ro
    public final String a(int i10, double d10) {
        return this.f24237d.a(i10, d10);
    }
}
