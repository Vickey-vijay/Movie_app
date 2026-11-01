package com.mbridge.msdk.thrid.okio;

import java.io.IOException;

/* JADX INFO: compiled from: ForwardingSource.java */
/* JADX INFO: loaded from: classes11.dex */
public abstract class h implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final s f38045a;

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.f38045a.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f38045a.close();
    }

    public final s d() {
        return this.f38045a;
    }

    public String toString() {
        return getClass().getSimpleName() + "(" + this.f38045a.toString() + ")";
    }

    public h(s sVar) {
        if (sVar != null) {
            this.f38045a = sVar;
            return;
        }
        throw new IllegalArgumentException("delegate == null");
    }
}
