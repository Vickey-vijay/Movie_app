package org.chromium.net;

/* JADX INFO: loaded from: classes11.dex */
public abstract class QuicException extends NetworkException {
    public abstract int getQuicDetailedErrorCode();

    public QuicException(String str, Throwable th2) {
        super(str, th2);
    }
}
