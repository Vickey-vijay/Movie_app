package com.fyber.inneractive.sdk.dv;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.k;
import com.fyber.inneractive.sdk.flow.x;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.r;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.query.AdInfo;
import com.google.android.gms.ads.query.QueryInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class c extends k {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final boolean f15238m;

    @Override // com.fyber.inneractive.sdk.flow.k
    public final String e() {
        return null;
    }

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.b
    public final void a() {
        x xVar = this.f15465c;
        if (xVar != null) {
            a aVar = (a) xVar;
            aVar.f15229g = null;
            aVar.f15231i = null;
        }
        super.a();
    }

    @Override // com.fyber.inneractive.sdk.flow.k, com.fyber.inneractive.sdk.interfaces.c
    public final void cancel() {
        x xVar = this.f15465c;
        if (xVar != null) {
            a aVar = (a) xVar;
            aVar.f15229g = null;
            aVar.f15231i = null;
        }
        this.f15473k.a();
        IAlog.a("%s: IAAdContentLoaderImpl : cancel load ad content retry task", IAlog.a(this));
        r.f18607b.removeCallbacks(this.f15474l);
        this.f15463a = null;
        this.f15464b = null;
        this.f15465c = null;
        this.f15466d = null;
        this.f15467e = null;
        this.f15468f = null;
    }

    @Override // com.fyber.inneractive.sdk.flow.k
    public final void h() {
        x dVar;
        com.fyber.inneractive.sdk.response.e eVar = this.f15464b;
        if (eVar == null || ((i) eVar).f18452u == null) {
            j();
            return;
        }
        InneractiveAdRequest inneractiveAdRequest = this.f15463a;
        if (inneractiveAdRequest != null) {
            boolean muteVideo = inneractiveAdRequest.getMuteVideo();
            try {
                MobileAds.setAppMuted(muteVideo);
                MobileAds.setAppVolume(muteVideo ? 0.0f : 1.0f);
            } catch (Throwable unused) {
            }
        }
        i iVar = (i) this.f15464b;
        UnitDisplayType unitDisplayType = iVar.f18447p;
        QueryInfo queryInfo = iVar.f18452u.f15258a;
        int i10 = b.f15232a[unitDisplayType.ordinal()];
        if (i10 == 1) {
            dVar = this.f15238m ? new com.fyber.inneractive.sdk.dv.interstitial.d(f(), this.f15469g, (i) this.f15464b) : new com.fyber.inneractive.sdk.dv.interstitial.g(f(), this.f15469g, (i) this.f15464b);
        } else if (i10 == 2 || i10 == 3) {
            dVar = new com.fyber.inneractive.sdk.dv.banner.b(f(), this.f15469g, (i) this.f15464b);
        } else if (i10 != 4) {
            dVar = null;
        } else {
            dVar = this.f15238m ? new com.fyber.inneractive.sdk.dv.rewarded.d(f(), this.f15469g, (i) this.f15464b) : new com.fyber.inneractive.sdk.dv.rewarded.g(f(), this.f15469g, (i) this.f15464b);
        }
        this.f15465c = dVar;
        if (queryInfo == null || dVar == null || this.f15464b == null) {
            j();
            return;
        }
        try {
            AdRequest.Builder builder = new AdRequest.Builder();
            try {
                AdRequest.Builder.class.getMethod("setAdString", String.class).invoke(builder, ((i) this.f15464b).N);
            } catch (Exception unused2) {
                builder.setAdInfo(new AdInfo(queryInfo, ((i) this.f15464b).N));
            }
            ((a) this.f15465c).a(builder.build(), this);
        } catch (Throwable unused3) {
            j();
        }
    }

    public final void j() {
        b(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR, com.fyber.inneractive.sdk.flow.i.NETWORK_ERROR));
    }

    public c() {
        boolean z10;
        try {
            Class.forName("com.google.android.gms.ads.InterstitialAd");
            z10 = true;
        } catch (ClassNotFoundException unused) {
            z10 = false;
        }
        this.f15238m = !z10;
    }
}
