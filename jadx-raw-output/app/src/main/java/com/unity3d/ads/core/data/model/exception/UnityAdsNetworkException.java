package com.unity3d.ads.core.data.model.exception;

import ck.i;
import ck.p;
import com.unity3d.ads.core.data.model.OperationType;

/* JADX INFO: compiled from: UnityAdsNetworkException.kt */
/* JADX INFO: loaded from: classes11.dex */
public class UnityAdsNetworkException extends Exception {
    private final String client;
    private final Integer code;
    private final Integer cronetCode;
    private final String message;
    private final String protocol;
    private final OperationType type;
    private final String url;

    public /* synthetic */ UnityAdsNetworkException(String str, OperationType operationType, Integer num, String str2, String str3, Integer num2, String str4, int i10, i iVar) {
        this(str, (i10 & 2) != 0 ? OperationType.UNKNOWN : operationType, (i10 & 4) != 0 ? null : num, (i10 & 8) != 0 ? null : str2, (i10 & 16) != 0 ? null : str3, (i10 & 32) != 0 ? null : num2, (i10 & 64) == 0 ? str4 : null);
    }

    public final String getClient() {
        return this.client;
    }

    public final Integer getCode() {
        return this.code;
    }

    public final Integer getCronetCode() {
        return this.cronetCode;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final OperationType getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsNetworkException(String str, OperationType operationType, Integer num, String str2, String str3, Integer num2, String str4) {
        super(str);
        p.j(str, "message");
        p.j(operationType, "type");
        this.message = str;
        this.type = operationType;
        this.code = num;
        this.url = str2;
        this.protocol = str3;
        this.cronetCode = num2;
        this.client = str4;
    }
}
