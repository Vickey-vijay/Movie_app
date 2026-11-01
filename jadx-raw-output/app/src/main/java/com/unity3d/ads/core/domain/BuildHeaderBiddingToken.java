package com.unity3d.ads.core.domain;

import com.unity3d.ads.TokenConfiguration;
import gatewayprotocol.v1.HeaderBiddingTokenOuterClass;
import rj.c;

/* JADX INFO: compiled from: BuildHeaderBiddingToken.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface BuildHeaderBiddingToken {

    /* JADX INFO: compiled from: BuildHeaderBiddingToken.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object invoke$default(BuildHeaderBiddingToken buildHeaderBiddingToken, int i10, TokenConfiguration tokenConfiguration, boolean z10, c cVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i11 & 2) != 0) {
                tokenConfiguration = null;
            }
            if ((i11 & 4) != 0) {
                z10 = false;
            }
            return buildHeaderBiddingToken.invoke(i10, tokenConfiguration, z10, cVar);
        }
    }

    Object invoke(int i10, TokenConfiguration tokenConfiguration, boolean z10, c<? super HeaderBiddingTokenOuterClass.HeaderBiddingToken> cVar);
}
