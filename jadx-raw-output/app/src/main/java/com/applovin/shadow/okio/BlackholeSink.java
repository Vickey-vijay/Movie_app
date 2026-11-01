package com.applovin.shadow.okio;

import ck.p;
import java.io.EOFException;

/* JADX INFO: compiled from: Okio.kt */
/* JADX INFO: loaded from: classes6.dex */
final class BlackholeSink implements Sink {
    @Override // com.applovin.shadow.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.applovin.shadow.okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // com.applovin.shadow.okio.Sink
    public Timeout timeout() {
        return Timeout.NONE;
    }

    @Override // com.applovin.shadow.okio.Sink
    public void write(Buffer buffer, long j10) throws EOFException {
        p.j(buffer, "source");
        buffer.skip(j10);
    }
}
