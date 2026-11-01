package io.bidmachine.util.network;

import kotlin.Metadata;

/* JADX INFO: compiled from: RequestInDestroyedStateException.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0005¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/bidmachine/util/network/RequestInDestroyedStateException;", "Ljava/lang/IllegalStateException;", "Lkotlin/IllegalStateException;", "()V", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class RequestInDestroyedStateException extends IllegalStateException {
    public RequestInDestroyedStateException() {
        super("Request has already been destroyed");
    }
}
