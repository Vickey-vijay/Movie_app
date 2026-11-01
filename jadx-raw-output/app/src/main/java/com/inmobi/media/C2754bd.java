package com.inmobi.media;

import androidx.core.graphics.drawable.IconCompat;
import com.inmobi.media.ads.network.common.model.AdResponse;

/* JADX INFO: renamed from: com.inmobi.media.bd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C2754bd extends R6 {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C3070o1 f24057o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AbstractC3169s1 f24058p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Hc f24059q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Ac f24060r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2754bd(C3070o1 c3070o1, AbstractC3169s1 abstractC3169s1, Ac ac2, Hc hc2) {
        super(c3070o1, abstractC3169s1, ac2, hc2);
        ck.p.j(c3070o1, "adManagerComponent");
        ck.p.j(abstractC3169s1, "adUnitTimeout");
        ck.p.j(hc2, "nativeCallback");
        ck.p.j(ac2, "stateMachine");
        this.f24057o = c3070o1;
        this.f24058p = abstractC3169s1;
        this.f24059q = hc2;
        this.f24060r = ac2;
    }

    @Override // com.inmobi.media.R6
    public final void a(AdResponse adResponse) {
        ck.p.j(adResponse, "adResponse");
        C3053n9 c3053n9 = this.f24273e;
        if (c3053n9 != null) {
            ck.p.j(adResponse, IconCompat.EXTRA_OBJ);
            c3053n9.a("AUM-NativeFetchingState", "onAdResponseParseSuccess " + AbstractC3029ma.a(adResponse, AdResponse.class));
        }
        S0.a(this.f24057o, adResponse, new Zc(this), new C2728ad(this));
    }
}
