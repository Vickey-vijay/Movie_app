package com.unity3d.ads.core.domain.scar;

import com.google.protobuf.ByteString;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import gatewayprotocol.v1.GetTokenEventRequestOuterClass;
import rj.c;

/* JADX INFO: compiled from: GetHbTokenEventRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
public interface GetHbTokenEventRequest {
    Object invoke(ByteString byteString, BiddingSignals biddingSignals, c<? super GetTokenEventRequestOuterClass.GetTokenEventRequest> cVar);
}
