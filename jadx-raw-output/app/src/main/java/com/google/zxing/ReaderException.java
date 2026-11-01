package com.google.zxing;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ReaderException extends Exception {
    public static final StackTraceElement[] NO_TRACE;
    public static final boolean isStackTrace;

    public ReaderException() {
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }

    static {
        isStackTrace = System.getProperty("surefire.test.class.path") != null;
        NO_TRACE = new StackTraceElement[0];
    }

    public ReaderException(Throwable th2) {
        super(th2);
    }
}
