package com.applovin.shadow.okio;

import ck.p;
import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;

/* JADX INFO: compiled from: GzipSink.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class GzipSink implements Sink {
    private boolean closed;
    private final CRC32 crc;
    private final Deflater deflater;
    private final DeflaterSink deflaterSink;
    private final RealBufferedSink sink;

    public GzipSink(Sink sink) {
        p.j(sink, "sink");
        RealBufferedSink realBufferedSink = new RealBufferedSink(sink);
        this.sink = realBufferedSink;
        Deflater deflater = new Deflater(-1, true);
        this.deflater = deflater;
        this.deflaterSink = new DeflaterSink((BufferedSink) realBufferedSink, deflater);
        this.crc = new CRC32();
        Buffer buffer = realBufferedSink.bufferField;
        buffer.writeShort(8075);
        buffer.writeByte(8);
        buffer.writeByte(0);
        buffer.writeInt(0);
        buffer.writeByte(0);
        buffer.writeByte(0);
    }

    private final void updateCrc(Buffer buffer, long j10) {
        Segment segment = buffer.head;
        p.g(segment);
        while (j10 > 0) {
            int iMin = (int) Math.min(j10, segment.limit - segment.pos);
            this.crc.update(segment.data, segment.pos, iMin);
            j10 -= (long) iMin;
            segment = segment.next;
            p.g(segment);
        }
    }

    private final void writeFooter() {
        this.sink.writeIntLe((int) this.crc.getValue());
        this.sink.writeIntLe((int) this.deflater.getBytesRead());
    }

    /* JADX INFO: renamed from: -deprecated_deflater, reason: not valid java name */
    public final Deflater m200deprecated_deflater() {
        return this.deflater;
    }

    @Override // com.applovin.shadow.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.closed) {
            return;
        }
        Throwable th2 = null;
        try {
            this.deflaterSink.finishDeflate$okio();
            writeFooter();
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            this.deflater.end();
        } catch (Throwable th4) {
            if (th2 == null) {
                th2 = th4;
            }
        }
        try {
            this.sink.close();
        } catch (Throwable th5) {
            if (th2 == null) {
                th2 = th5;
            }
        }
        this.closed = true;
        if (th2 != null) {
            throw th2;
        }
    }

    public final Deflater deflater() {
        return this.deflater;
    }

    @Override // com.applovin.shadow.okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        this.deflaterSink.flush();
    }

    @Override // com.applovin.shadow.okio.Sink
    public Timeout timeout() {
        return this.sink.timeout();
    }

    @Override // com.applovin.shadow.okio.Sink
    public void write(Buffer buffer, long j10) throws IOException {
        p.j(buffer, "source");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (j10 == 0) {
            return;
        }
        updateCrc(buffer, j10);
        this.deflaterSink.write(buffer, j10);
    }
}
