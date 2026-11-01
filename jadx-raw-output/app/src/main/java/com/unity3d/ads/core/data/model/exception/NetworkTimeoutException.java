package com.unity3d.ads.core.data.model.exception;

import ck.i;
import ck.p;
import com.unity3d.ads.core.data.model.OperationType;

/* JADX INFO: compiled from: NetworkTimeoutException.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class NetworkTimeoutException extends UnityAdsNetworkException {
    public /* synthetic */ NetworkTimeoutException(String str, OperationType operationType, Integer num, String str2, String str3, Integer num2, String str4, int i10, i iVar) {
        this(str, (i10 & 2) != 0 ? OperationType.UNKNOWN : operationType, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : num2, (i10 & 64) == 0 ? str4 : null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NetworkTimeoutException(String str, OperationType operationType, Integer num, String str2, String str3, Integer num2, String str4) {
        super(str, operationType, num, str2, str3, num2, str4);
        p.j(str, "message");
        p.j(operationType, "type");
    }
}
