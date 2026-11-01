package com.liulishuo.filedownloader.download;

import com.mbridge.msdk.foundation.download.Command;
import java.net.ProtocolException;
import w7.e;
import w7.f;

/* JADX INFO: compiled from: ConnectionProfile.java */
/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f31824a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f31825b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f31826c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f31827d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f31828e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f31829f;

    /* JADX INFO: renamed from: com.liulishuo.filedownloader.download.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ConnectionProfile.java */
    public static class C0294b {
        public static b a(long j10) {
            return new b(0L, 0L, -1L, j10);
        }

        public static b b(long j10, long j11, long j12, long j13) {
            return new b(j10, j11, j12, j13);
        }

        public static b c(long j10, long j11, long j12) {
            return new b(j10, j11, -1L, j12);
        }

        public static b d() {
            return new b();
        }

        public static b e() {
            return new b(0L, 0L, 0L, 0L, true);
        }
    }

    public String toString() {
        return f.o("range[%d, %d) current offset[%d]", Long.valueOf(this.f31824a), Long.valueOf(this.f31826c), Long.valueOf(this.f31825b));
    }

    public void a(n7.b bVar) throws ProtocolException {
        if (this.f31828e) {
            return;
        }
        if (this.f31829f && e.a().f73543h) {
            bVar.h("HEAD");
        }
        bVar.c(Command.HTTP_HEADER_RANGE, this.f31826c == -1 ? f.o("bytes=%d-", Long.valueOf(this.f31825b)) : f.o("bytes=%d-%d", Long.valueOf(this.f31825b), Long.valueOf(this.f31826c)));
    }

    public b() {
        this.f31824a = 0L;
        this.f31825b = 0L;
        this.f31826c = 0L;
        this.f31827d = 0L;
        this.f31828e = false;
        this.f31829f = true;
    }

    public b(long j10, long j11, long j12, long j13) {
        this(j10, j11, j12, j13, false);
    }

    public b(long j10, long j11, long j12, long j13, boolean z10) {
        if ((j10 == 0 && j12 == 0) || !z10) {
            this.f31824a = j10;
            this.f31825b = j11;
            this.f31826c = j12;
            this.f31827d = j13;
            this.f31828e = z10;
            this.f31829f = false;
            return;
        }
        throw new IllegalArgumentException();
    }
}
