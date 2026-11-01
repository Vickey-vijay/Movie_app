package com.bumptech.glide.load;

import androidx.annotation.Nullable;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class HttpException extends IOException {
    public static final int UNKNOWN = -1;
    private static final long serialVersionUID = 1;
    private final int statusCode;

    public HttpException(int i10) {
        this("Http request failed", i10);
    }

    @Deprecated
    public HttpException(String str) {
        this(str, -1);
    }

    public int getStatusCode() {
        return this.statusCode;
    }

    public HttpException(String str, int i10) {
        this(str, i10, null);
    }

    public HttpException(String str, int i10, @Nullable Throwable th2) {
        super(str + ", status code: " + i10, th2);
        this.statusCode = i10;
    }
}
