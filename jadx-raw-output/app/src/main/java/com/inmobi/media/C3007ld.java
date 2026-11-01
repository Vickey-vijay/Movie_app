package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.inmobi.media.ld, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3007ld extends FunctionReferenceImpl implements bk.p {
    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        C3292x c3292x = (C3292x) obj;
        InMobiJsonResponse inMobiJsonResponse = (InMobiJsonResponse) obj2;
        ck.p.j(c3292x, "p0");
        ck.p.j(inMobiJsonResponse, "p1");
        C3057nd c3057nd = (C3057nd) this.receiver;
        C3053n9 c3053n9 = c3057nd.f24273e;
        if (c3053n9 != null) {
            c3053n9.a("AUM-NativeLoadResponseState", "transitionToFetchedState - validation successful, transitioning to fetched state");
        }
        c3057nd.f24896r.a(new Yc(c3292x, inMobiJsonResponse, c3057nd.f24894p, c3057nd.f24895q, c3057nd.f24896r), c3057nd);
        return mj.r.f64562a;
    }

    public C3007ld(C3057nd c3057nd) {
        super(2, c3057nd, C3057nd.class, "transitionToFetchedState", "transitionToFetchedState(Lcom/inmobi/media/ads/context/AdComponent;Lcom/inmobi/media/ads/network/inmobiJson/model/InMobiJsonResponse;)V", 0);
    }
}
