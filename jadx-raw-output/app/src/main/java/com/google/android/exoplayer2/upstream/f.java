package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.ParserException;
import e5.m;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: compiled from: DefaultLoadErrorHandlingPolicy.java */
/* JADX INFO: loaded from: classes11.dex */
public class f implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20192a;

    public f() {
        this(-1);
    }

    public f(int i10) {
        this.f20192a = i10;
    }

    @Override // e5.m
    public long a(int i10, long j10, IOException iOException, int i11) {
        if (!(iOException instanceof HttpDataSource.InvalidResponseCodeException)) {
            return -9223372036854775807L;
        }
        int i12 = ((HttpDataSource.InvalidResponseCodeException) iOException).responseCode;
        return (i12 == 404 || i12 == 410 || i12 == 416) ? 60000L : -9223372036854775807L;
    }

    @Override // e5.m
    public long b(int i10, long j10, IOException iOException, int i11) {
        if ((iOException instanceof ParserException) || (iOException instanceof FileNotFoundException) || (iOException instanceof Loader.UnexpectedLoaderException)) {
            return -9223372036854775807L;
        }
        return Math.min((i11 - 1) * 1000, 5000);
    }

    @Override // e5.m
    public int getMinimumLoadableRetryCount(int i10) {
        int i11 = this.f20192a;
        if (i11 == -1) {
            return i10 == 7 ? 6 : 3;
        }
        return i11;
    }
}
