package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.AdFormatOuterClass;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import rj.c;

/* JADX INFO: compiled from: GetAdPlayerConfigRequest.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface GetAdPlayerConfigRequest {
    Object invoke(String str, ByteString byteString, ByteString byteString2, AdFormatOuterClass.AdFormat adFormat, c<? super UniversalRequestOuterClass.UniversalRequest> cVar);
}
