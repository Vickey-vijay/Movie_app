package com.applovin.shadow.okio;

import ck.p;

/* JADX INFO: compiled from: PeekSource.kt */
/* JADX INFO: loaded from: classes10.dex */
public final class PeekSource implements Source {
    private final Buffer buffer;
    private boolean closed;
    private int expectedPos;
    private Segment expectedSegment;
    private long pos;
    private final BufferedSource upstream;

    @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.closed = true;
    }

    public PeekSource(BufferedSource bufferedSource) {
        p.j(bufferedSource, "upstream");
        this.upstream = bufferedSource;
        Buffer buffer = bufferedSource.getBuffer();
        this.buffer = buffer;
        Segment segment = buffer.head;
        this.expectedSegment = segment;
        this.expectedPos = segment != null ? segment.pos : -1;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002a  */
    @Override // com.applovin.shadow.okio.Source
    public long read(Buffer buffer, long j10) {
        Segment segment;
        p.j(buffer, "sink");
        boolean z10 = false;
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        Segment segment2 = this.expectedSegment;
        if (segment2 == null) {
            z10 = true;
        } else {
            Segment segment3 = this.buffer.head;
            if (segment2 == segment3) {
                int i10 = this.expectedPos;
                p.g(segment3);
                if (i10 == segment3.pos) {
                    z10 = true;
                }
            }
        }
        if (!z10) {
            throw new IllegalStateException("Peek source is invalid because upstream source was used".toString());
        }
        if (j10 == 0) {
            return 0L;
        }
        if (!this.upstream.request(this.pos + 1)) {
            return -1L;
        }
        if (this.expectedSegment == null && (segment = this.buffer.head) != null) {
            this.expectedSegment = segment;
            p.g(segment);
            this.expectedPos = segment.pos;
        }
        long jMin = Math.min(j10, this.buffer.size() - this.pos);
        this.buffer.copyTo(buffer, this.pos, jMin);
        this.pos += jMin;
        return jMin;
    }

    @Override // com.applovin.shadow.okio.Source
    public Timeout timeout() {
        return this.upstream.timeout();
    }
}
