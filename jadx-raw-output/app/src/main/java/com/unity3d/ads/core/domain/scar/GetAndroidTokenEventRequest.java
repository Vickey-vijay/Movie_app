package com.unity3d.ads.core.domain.scar;

import ck.p;
import com.google.protobuf.ByteString;
import com.google.protobuf.kotlin.ByteStringsKt;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import gatewayprotocol.v1.GetTokenEventRequestKt;
import gatewayprotocol.v1.GetTokenEventRequestOuterClass;
import rj.c;

/* JADX INFO: compiled from: GetAndroidTokenEventRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class GetAndroidTokenEventRequest implements GetHbTokenEventRequest {
    @Override // com.unity3d.ads.core.domain.scar.GetHbTokenEventRequest
    public Object invoke(ByteString byteString, BiddingSignals biddingSignals, c<? super GetTokenEventRequestOuterClass.GetTokenEventRequest> cVar) {
        GetTokenEventRequestKt.Dsl.Companion companion = GetTokenEventRequestKt.Dsl.Companion;
        GetTokenEventRequestOuterClass.GetTokenEventRequest.Builder builderNewBuilder = GetTokenEventRequestOuterClass.GetTokenEventRequest.newBuilder();
        p.i(builderNewBuilder, "newBuilder()");
        GetTokenEventRequestKt.Dsl dsl_create = companion._create(builderNewBuilder);
        dsl_create.setTokenId(byteString);
        String rvSignal = biddingSignals.getRvSignal();
        if (rvSignal != null) {
            p.i(rvSignal, "it");
            dsl_create.setRewarded(ByteStringsKt.toByteStringUtf8(rvSignal));
        }
        String interstitialSignal = biddingSignals.getInterstitialSignal();
        if (interstitialSignal != null) {
            p.i(interstitialSignal, "it");
            dsl_create.setInterstitial(ByteStringsKt.toByteStringUtf8(interstitialSignal));
        }
        String bannerSignal = biddingSignals.getBannerSignal();
        if (bannerSignal != null) {
            p.i(bannerSignal, "it");
            dsl_create.setBanner(ByteStringsKt.toByteStringUtf8(bannerSignal));
        }
        return dsl_create._build();
    }
}
