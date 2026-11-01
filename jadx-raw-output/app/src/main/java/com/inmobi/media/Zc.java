package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.InMobiJsonResponse;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class Zc extends FunctionReferenceImpl implements bk.p {
    @Override // bk.p
    /* JADX INFO: renamed from: invoke */
    public final Object mo1invoke(Object obj, Object obj2) {
        C3292x c3292x = (C3292x) obj;
        InMobiJsonResponse inMobiJsonResponse = (InMobiJsonResponse) obj2;
        ck.p.j(c3292x, "p0");
        ck.p.j(inMobiJsonResponse, "p1");
        C2754bd c2754bd = (C2754bd) this.receiver;
        C3053n9 c3053n9 = c2754bd.f24273e;
        if (c3053n9 != null) {
            c3053n9.a("AUM-NativeFetchingState", "transitionToFetchedState");
        }
        c2754bd.f24060r.a(new Yc(c3292x, inMobiJsonResponse, c2754bd.f24058p, c2754bd.f24059q, c2754bd.f24060r), c2754bd);
        return mj.r.f64562a;
    }

    public Zc(C2754bd c2754bd) {
        super(2, c2754bd, C2754bd.class, "transitionToFetchedState", "transitionToFetchedState(Lcom/inmobi/media/ads/context/AdComponent;Lcom/inmobi/media/ads/network/inmobiJson/model/InMobiJsonResponse;)V", 0);
    }
}
