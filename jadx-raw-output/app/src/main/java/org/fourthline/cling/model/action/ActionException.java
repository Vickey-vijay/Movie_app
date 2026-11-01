package org.fourthline.cling.model.action;

import org.fourthline.cling.model.types.ErrorCode;

/* JADX INFO: loaded from: classes2.dex */
public class ActionException extends Exception {
    private int errorCode;

    public ActionException(int i10, String str) {
        super(str);
        this.errorCode = i10;
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public ActionException(int i10, String str, Throwable th2) {
        super(str, th2);
        this.errorCode = i10;
    }

    public ActionException(ErrorCode errorCode) {
        this(errorCode.getCode(), errorCode.getDescription());
    }

    public ActionException(ErrorCode errorCode, String str) {
        this(errorCode, str, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ActionException(ErrorCode errorCode, String str, boolean z10) {
        int code = errorCode.getCode();
        if (z10) {
            str = errorCode.getDescription() + ". " + str + ".";
        }
        this(code, str);
    }

    public ActionException(ErrorCode errorCode, String str, Throwable th2) {
        this(errorCode.getCode(), errorCode.getDescription() + ". " + str + ".", th2);
    }
}
