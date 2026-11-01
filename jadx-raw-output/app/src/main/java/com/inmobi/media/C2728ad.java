package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: renamed from: com.inmobi.media.ad, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C2728ad extends FunctionReferenceImpl implements bk.l {
    public C2728ad(C2754bd c2754bd) {
        super(1, c2754bd, C2754bd.class, "transitionToFetchFailedState", "transitionToFetchFailedState(S)V", 0);
    }

    @Override // bk.l
    public final Object invoke(Object obj) {
        short sShortValue = ((Number) obj).shortValue();
        C2754bd c2754bd = (C2754bd) this.receiver;
        c2754bd.getClass();
        c2754bd.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), sShortValue);
        return mj.r.f64562a;
    }
}
