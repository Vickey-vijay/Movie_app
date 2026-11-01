package com.mbridge.msdk.thrid.okio;

import java.io.IOException;

/* JADX INFO: compiled from: ForwardingSink.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class g implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final r f38044a;

    @Override // com.mbridge.msdk.thrid.okio.r
    public void a(c cVar, long j10) throws IOException {
        this.f38044a.a(cVar, j10);
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public t b() {
        return this.f38044a.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f38044a.close();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Flushable
    public void flush() throws IOException {
        this.f38044a.flush();
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f38044a.toString() + ")";
    }

    public g(r rVar) {
        if (rVar != null) {
            this.f38044a = rVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }
}
