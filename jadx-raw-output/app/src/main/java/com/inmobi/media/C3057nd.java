package com.inmobi.media;

import androidx.core.graphics.drawable.IconCompat;
import com.inmobi.media.ads.network.common.model.AdResponse;

/* JADX INFO: renamed from: com.inmobi.media.nd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C3057nd extends AbstractC2931ib {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C3070o1 f24893o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final AbstractC3169s1 f24894p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Hc f24895q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Ac f24896r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3057nd(byte[] bArr, C3070o1 c3070o1, AbstractC3169s1 abstractC3169s1, Hc hc2, Ac ac2) {
        super(bArr, c3070o1, abstractC3169s1, hc2, ac2);
        ck.p.j(c3070o1, "adManagerComponent");
        ck.p.j(abstractC3169s1, "adUnitTimeout");
        ck.p.j(hc2, "nativeCallback");
        ck.p.j(ac2, "stateMachine");
        this.f24893o = c3070o1;
        this.f24894p = abstractC3169s1;
        this.f24895q = hc2;
        this.f24896r = ac2;
    }

    @Override // com.inmobi.media.AbstractC2931ib
    public final void a(AdResponse adResponse) {
        ck.p.j(adResponse, "adResponse");
        C3053n9 c3053n9 = this.f24273e;
        if (c3053n9 != null) {
            ck.p.j(adResponse, IconCompat.EXTRA_OBJ);
            c3053n9.a("AUM-NativeLoadResponseState", "onAdResponseParseSuccess - ad response received: " + AbstractC3029ma.a(adResponse, AdResponse.class));
        }
        S0.a(this.f24893o, adResponse, new C3007ld(this), new C3032md(this));
    }
}
