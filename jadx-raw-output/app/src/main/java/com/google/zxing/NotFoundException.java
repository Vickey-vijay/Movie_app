package com.google.zxing;

/* JADX INFO: loaded from: classes6.dex */
public final class NotFoundException extends ReaderException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final NotFoundException f20852b;

    static {
        NotFoundException notFoundException = new NotFoundException();
        f20852b = notFoundException;
        notFoundException.setStackTrace(ReaderException.NO_TRACE);
    }

    public static NotFoundException getNotFoundInstance() {
        return f20852b;
    }

    private NotFoundException() {
    }
}
