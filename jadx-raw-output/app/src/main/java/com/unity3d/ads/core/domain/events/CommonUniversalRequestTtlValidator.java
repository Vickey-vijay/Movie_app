package com.unity3d.ads.core.domain.events;

import ck.p;
import com.unity3d.ads.gatewayclient.RequestPolicy;
import gatewayprotocol.v1.UniversalRequestOuterClass;

/* JADX INFO: compiled from: CommonUniversalRequestTtlValidator.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class CommonUniversalRequestTtlValidator implements UniversalRequestTtlValidator {
    @Override // com.unity3d.ads.core.domain.events.UniversalRequestTtlValidator
    public boolean invoke(UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy) {
        p.j(universalRequest, "universalRequest");
        p.j(requestPolicy, "requestPolicy");
        if (System.currentTimeMillis() - (universalRequest.getSharedData().getTimestamps().getTimestamp().getSeconds() * ((long) 1000)) < requestPolicy.getMaxDuration()) {
            return true;
        }
        return false;
    }
}
