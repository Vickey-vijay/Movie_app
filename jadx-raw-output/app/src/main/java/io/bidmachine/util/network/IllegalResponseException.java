package io.bidmachine.util.network;

import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: compiled from: IllegalResponseException.kt */
/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/bidmachine/util/network/IllegalResponseException;", "Ljava/io/IOException;", "responseCode", "", "(I)V", "getResponseCode", "()I", "bidmachine-android-util_d_0_13_0"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class IllegalResponseException extends IOException {
    private final int responseCode;

    public IllegalResponseException(int i10) {
        super("Server returned " + i10 + " code");
        this.responseCode = i10;
    }

    public final int getResponseCode() {
        return this.responseCode;
    }
}
