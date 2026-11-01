package com.google.zxing;

/* JADX INFO: loaded from: classes10.dex */
public final class FormatException extends ReaderException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final FormatException f20851b;

    private FormatException() {
    }

    public static FormatException getFormatInstance() {
        return ReaderException.isStackTrace ? new FormatException() : f20851b;
    }

    static {
        FormatException formatException = new FormatException();
        f20851b = formatException;
        formatException.setStackTrace(ReaderException.NO_TRACE);
    }

    public FormatException(Throwable th2) {
        super(th2);
    }

    public static FormatException getFormatInstance(Throwable th2) {
        return ReaderException.isStackTrace ? new FormatException(th2) : f20851b;
    }
}
