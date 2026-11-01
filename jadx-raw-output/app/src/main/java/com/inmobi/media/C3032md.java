package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.inmobi.media.md, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C3032md extends FunctionReferenceImpl implements bk.l {
    public C3032md(C3057nd c3057nd) {
        super(1, c3057nd, C3057nd.class, "transitionToFetchFailedState", "transitionToFetchFailedState(S)V", 0);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        short sShortValue = ((Number) obj).shortValue();
        C3057nd c3057nd = (C3057nd) this.receiver;
        c3057nd.getClass();
        c3057nd.a(kotlin.collections.a.o(mj.h.a(IronSourceConstants.EVENTS_ERROR_CODE, Short.valueOf(sShortValue))), new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR));
        return mj.r.f64562a;
    }
}
