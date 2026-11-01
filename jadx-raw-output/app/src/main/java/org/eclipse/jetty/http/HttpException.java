package org.eclipse.jetty.http;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.io.IOException;

/* JADX INFO: loaded from: classes7.dex */
public class HttpException extends IOException {
    public String _reason;
    public int _status;

    public HttpException(int i10) {
        this._status = i10;
        this._reason = null;
    }

    public String getReason() {
        return this._reason;
    }

    public int getStatus() {
        return this._status;
    }

    public void setReason(String str) {
        this._reason = str;
    }

    public void setStatus(int i10) {
        this._status = i10;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return "HttpException(" + this._status + StringUtils.COMMA + this._reason + StringUtils.COMMA + super.getCause() + ")";
    }

    public HttpException(int i10, String str) {
        this._status = i10;
        this._reason = str;
    }

    public HttpException(int i10, String str, Throwable th2) {
        this._status = i10;
        this._reason = str;
        initCause(th2);
    }
}
