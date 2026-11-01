package com.applovin.shadow.okio;

import ck.p;
import java.io.IOException;

/* JADX INFO: compiled from: ForwardingSource.kt */
/* JADX INFO: loaded from: classes9.dex */
public abstract class ForwardingSource implements Source {
    private final Source delegate;

    public ForwardingSource(Source source) {
        p.j(source, "delegate");
        this.delegate = source;
    }

    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name */
    public final Source m198deprecated_delegate() {
        return this.delegate;
    }

    @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    public final Source delegate() {
        return this.delegate;
    }

    @Override // com.applovin.shadow.okio.Source
    public long read(Buffer buffer, long j10) throws IOException {
        p.j(buffer, "sink");
        return this.delegate.read(buffer, j10);
    }

    @Override // com.applovin.shadow.okio.Source
    public Timeout timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
