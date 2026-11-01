package com.unity3d.ads.gatewayclient;

import com.unity3d.ads.core.data.model.OperationType;
import com.unity3d.services.UnityAdsConstants;
import gatewayprotocol.v1.UniversalRequestOuterClass;
import gatewayprotocol.v1.UniversalResponseOuterClass;
import rj.c;

/* JADX INFO: compiled from: GatewayClient.kt */
/* JADX INFO: loaded from: classes8.dex */
public interface GatewayClient {

    /* JADX INFO: compiled from: GatewayClient.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ Object request$default(GatewayClient gatewayClient, String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, OperationType operationType, c cVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: request");
            }
            if ((i10 & 1) != 0) {
                str = UnityAdsConstants.DefaultUrls.GATEWAY_URL;
            }
            String str2 = str;
            if ((i10 & 8) != 0) {
                operationType = OperationType.UNKNOWN;
            }
            return gatewayClient.request(str2, universalRequest, requestPolicy, operationType, cVar);
        }
    }

    Object request(String str, UniversalRequestOuterClass.UniversalRequest universalRequest, RequestPolicy requestPolicy, OperationType operationType, c<? super UniversalResponseOuterClass.UniversalResponse> cVar);
}
