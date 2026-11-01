package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import gatewayprotocol.v1.AdDataRefreshResponseOuterClass;
import rj.c;

/* JADX INFO: compiled from: Refresh.kt */
/* JADX INFO: loaded from: classes11.dex */
public interface Refresh {
    Object invoke(ByteString byteString, ByteString byteString2, c<? super AdDataRefreshResponseOuterClass.AdDataRefreshResponse> cVar);
}
