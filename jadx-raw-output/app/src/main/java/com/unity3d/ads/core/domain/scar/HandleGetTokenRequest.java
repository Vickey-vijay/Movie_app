package com.unity3d.ads.core.domain.scar;

import com.google.protobuf.ByteString;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import rj.c;

/* JADX INFO: compiled from: HandleGetTokenRequest.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface HandleGetTokenRequest {
    Object invoke(ByteString byteString, BiddingSignals biddingSignals, c<? super UniversalResponseOuterClass.UniversalResponse> cVar);
}
