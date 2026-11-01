package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import rj.c;

/* JADX INFO: compiled from: GetAdDataRefreshRequest.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface GetAdDataRefreshRequest {
    Object invoke(ByteString byteString, ByteString byteString2, c<? super UniversalRequestOuterClass.UniversalRequest> cVar);
}
