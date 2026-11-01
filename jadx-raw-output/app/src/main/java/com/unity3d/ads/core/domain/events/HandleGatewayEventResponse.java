package com.unity3d.ads.core.domain.events;

import gatewayprotocol.v1.UniversalResponseOuterClass;
import mj.r;
import rj.c;

/* JADX INFO: compiled from: HandleGatewayEventResponse.kt */
/* JADX INFO: loaded from: classes2.dex */
public interface HandleGatewayEventResponse {
    Object invoke(UniversalResponseOuterClass.UniversalResponse universalResponse, c<? super r> cVar);
}
