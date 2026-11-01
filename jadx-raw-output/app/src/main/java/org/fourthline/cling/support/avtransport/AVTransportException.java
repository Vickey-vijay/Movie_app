package org.fourthline.cling.support.avtransport;

import org.fourthline.cling.model.action.ActionException;
import org.fourthline.cling.model.types.ErrorCode;

/* JADX INFO: loaded from: classes5.dex */
public class AVTransportException extends ActionException {
    public AVTransportException(int i10, String str) {
        super(i10, str);
    }

    public AVTransportException(int i10, String str, Throwable th2) {
        super(i10, str, th2);
    }

    public AVTransportException(ErrorCode errorCode, String str) {
        super(errorCode, str);
    }

    public AVTransportException(ErrorCode errorCode) {
        super(errorCode);
    }

    public AVTransportException(AVTransportErrorCode aVTransportErrorCode, String str) {
        super(aVTransportErrorCode.getCode(), aVTransportErrorCode.getDescription() + ". " + str + ".");
    }

    public AVTransportException(AVTransportErrorCode aVTransportErrorCode) {
        super(aVTransportErrorCode.getCode(), aVTransportErrorCode.getDescription());
    }
}
