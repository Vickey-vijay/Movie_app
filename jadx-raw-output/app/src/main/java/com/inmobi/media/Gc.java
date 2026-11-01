package com.inmobi.media;

import android.content.Context;
import com.inmobi.media.ads.nativeAd.InMobiNativeViewData;
import io.bidmachine.ads.networks.gam_dynamic.GAMConfig;

/* JADX INFO: loaded from: classes5.dex */
public final class Gc implements InterfaceC3160rh, Ck, ro {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3053n9 f22731a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Ac f22732b;

    @Override // com.inmobi.media.ro
    public final String a(int i10, double d10) {
        return this.f22732b.a(i10, d10);
    }

    public Gc(Context context, Jg jg2, Hc hc2) {
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j(jg2, "pubSettings");
        ck.p.j(hc2, "nativeCallbacks");
        ck.p.j(context, GAMConfig.KEY_CONTEXT);
        ck.p.j("native", "logType");
        ck.p.j("native", "adType");
        ck.p.j(jg2, "pubSettings");
        Ab ab2 = Jh.f22942a;
        this.f22731a = Jh.a("native", jg2.f22941g);
        this.f22732b = new Ac(new C3070o1(context, this, new C3095p1(this, jg2)), hc2);
    }

    @Override // com.inmobi.media.Ck
    public final void d() {
        this.f22732b.d();
    }

    @Override // com.inmobi.media.ro
    public final String a(double d10) {
        return this.f22732b.a(d10);
    }

    @Override // com.inmobi.media.InterfaceC3160rh
    public final void a(InMobiNativeViewData inMobiNativeViewData) {
        ck.p.j(inMobiNativeViewData, "inMobiNativeViewData");
        this.f22732b.a(inMobiNativeViewData);
    }
}
