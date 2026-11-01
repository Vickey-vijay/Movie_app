package com.google.zxing;

/* JADX INFO: loaded from: classes9.dex */
public final class ChecksumException extends ReaderException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ChecksumException f20848b;

    private ChecksumException() {
    }

    public static ChecksumException getChecksumInstance() {
        return ReaderException.isStackTrace ? new ChecksumException() : f20848b;
    }

    static {
        ChecksumException checksumException = new ChecksumException();
        f20848b = checksumException;
        checksumException.setStackTrace(ReaderException.NO_TRACE);
    }

    public ChecksumException(Throwable th2) {
        super(th2);
    }

    public static ChecksumException getChecksumInstance(Throwable th2) {
        return ReaderException.isStackTrace ? new ChecksumException(th2) : f20848b;
    }
}
