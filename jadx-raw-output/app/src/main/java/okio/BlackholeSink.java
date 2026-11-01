package okio;

import ck.p;
import java.io.EOFException;

/* JADX INFO: compiled from: Okio.kt */
/* JADX INFO: loaded from: classes4.dex */
final class BlackholeSink implements Sink {
    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // okio.Sink
    public Timeout timeout() {
        return Timeout.NONE;
    }

    @Override // okio.Sink
    public void write(Buffer buffer, long j10) throws EOFException {
        p.j(buffer, "source");
        buffer.skip(j10);
    }
}
