package com.google.android.exoplayer2;

import android.os.SystemClock;
import androidx.annotation.Nullable;
import g5.a;
import java.io.IOException;

/* JADX INFO: loaded from: classes10.dex */
public final class ExoPlaybackException extends Exception {
    public static final int TYPE_OUT_OF_MEMORY = 4;
    public static final int TYPE_REMOTE = 3;
    public static final int TYPE_RENDERER = 1;
    public static final int TYPE_SOURCE = 0;
    public static final int TYPE_UNEXPECTED = 2;

    @Nullable
    private final Throwable cause;

    @Nullable
    public final Format rendererFormat;
    public final int rendererFormatSupport;
    public final int rendererIndex;
    public final long timestampMs;
    public final int type;

    public ExoPlaybackException(int i10, Throwable th2) {
        this(i10, th2, -1, null, 4);
    }

    public ExoPlaybackException(int i10, Throwable th2, int i11, @Nullable Format format, int i12) {
        super(th2);
        this.type = i10;
        this.cause = th2;
        this.rendererIndex = i11;
        this.rendererFormat = format;
        this.rendererFormatSupport = i12;
        this.timestampMs = SystemClock.elapsedRealtime();
    }

    public static ExoPlaybackException createForOutOfMemoryError(OutOfMemoryError outOfMemoryError) {
        return new ExoPlaybackException(4, outOfMemoryError);
    }

    public static ExoPlaybackException createForRemote(String str) {
        return new ExoPlaybackException(3, str);
    }

    public static ExoPlaybackException createForRenderer(Exception exc, int i10, @Nullable Format format, int i11) {
        if (format == null) {
            i11 = 4;
        }
        return new ExoPlaybackException(1, exc, i10, format, i11);
    }

    public static ExoPlaybackException createForSource(IOException iOException) {
        return new ExoPlaybackException(0, iOException);
    }

    public static ExoPlaybackException createForUnexpected(RuntimeException runtimeException) {
        return new ExoPlaybackException(2, runtimeException);
    }

    public OutOfMemoryError getOutOfMemoryError() {
        a.f(this.type == 4);
        return (OutOfMemoryError) a.e(this.cause);
    }

    public Exception getRendererException() {
        a.f(this.type == 1);
        return (Exception) a.e(this.cause);
    }

    public IOException getSourceException() {
        a.f(this.type == 0);
        return (IOException) a.e(this.cause);
    }

    public RuntimeException getUnexpectedException() {
        a.f(this.type == 2);
        return (RuntimeException) a.e(this.cause);
    }

    public ExoPlaybackException(int i10, String str) {
        super(str);
        this.type = i10;
        this.rendererIndex = -1;
        this.rendererFormat = null;
        this.rendererFormatSupport = 0;
        this.cause = null;
        this.timestampMs = SystemClock.elapsedRealtime();
    }
}
