package com.applovin.shadow.okhttp3.internal.http2;

import ck.p;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.io.IOException;

/* JADX INFO: compiled from: StreamResetException.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class StreamResetException extends IOException {
    public final ErrorCode errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(ErrorCode errorCode) {
        super("stream was reset: " + errorCode);
        p.j(errorCode, IronSourceConstants.EVENTS_ERROR_CODE);
        this.errorCode = errorCode;
    }
}
