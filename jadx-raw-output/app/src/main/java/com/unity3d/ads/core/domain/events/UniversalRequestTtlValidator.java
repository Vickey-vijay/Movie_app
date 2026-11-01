package com.unity3d.ads.core.domain.events;

import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.UniversalRequestOuterClass;

/* JADX INFO: compiled from: UniversalRequestTtlValidator.kt */
/* JADX INFO: loaded from: classes9.dex */
public interface UniversalRequestTtlValidator {
    boolean invoke(UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy);
}
