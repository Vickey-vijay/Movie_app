package com.applovin.shadow.okio;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ck.p;
import com.ironsource.G5;
import java.io.EOFException;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: RealBufferedSink.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class RealBufferedSink implements BufferedSink {
    public final Buffer bufferField;
    public boolean closed;
    public final Sink sink;

    public static /* synthetic */ void getBuffer$annotations() {
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        p.j(byteBuffer, "source");
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        int iWrite = this.bufferField.write(byteBuffer);
        emitCompleteSegments();
        return iWrite;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeString(String str, Charset charset) {
        p.j(str, TypedValues.Custom.S_STRING);
        p.j(charset, G5.M);
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeString(str, charset);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeUtf8(String str) {
        p.j(str, TypedValues.Custom.S_STRING);
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeUtf8(str);
        return emitCompleteSegments();
    }

    public RealBufferedSink(Sink sink) {
        p.j(sink, "sink");
        this.sink = sink;
        this.bufferField = new Buffer();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer buffer() {
        return this.bufferField;
    }

    @Override // com.applovin.shadow.okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.closed) {
            return;
        }
        Throwable th2 = null;
        try {
            if (this.bufferField.size() > 0) {
                Sink sink = this.sink;
                Buffer buffer = this.bufferField;
                sink.write(buffer, buffer.size());
            }
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            this.sink.close();
        } catch (Throwable th4) {
            if (th2 == null) {
                th2 = th4;
            }
        }
        this.closed = true;
        if (th2 != null) {
            throw th2;
        }
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink emit() throws IOException {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        long size = this.bufferField.size();
        if (size > 0) {
            this.sink.write(this.bufferField, size);
        }
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink emitCompleteSegments() throws IOException {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        long jCompleteSegmentByteCount = this.bufferField.completeSegmentByteCount();
        if (jCompleteSegmentByteCount > 0) {
            this.sink.write(this.bufferField, jCompleteSegmentByteCount);
        }
        return this;
    }

    @Override // com.applovin.shadow.okio.BufferedSink, com.applovin.shadow.okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.bufferField.size() > 0) {
            Sink sink = this.sink;
            Buffer buffer = this.bufferField;
            sink.write(buffer, buffer.size());
        }
        this.sink.flush();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public Buffer getBuffer() {
        return this.bufferField;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.closed;
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public OutputStream outputStream() {
        return new OutputStream() { // from class: com.applovin.shadow.okio.RealBufferedSink.outputStream.1
            @Override // java.io.OutputStream
            public void write(int i10) throws IOException {
                RealBufferedSink realBufferedSink = RealBufferedSink.this;
                if (realBufferedSink.closed) {
                    throw new IOException("closed");
                }
                realBufferedSink.bufferField.writeByte((int) ((byte) i10));
                RealBufferedSink.this.emitCompleteSegments();
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws Throwable {
                RealBufferedSink.this.close();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                RealBufferedSink realBufferedSink = RealBufferedSink.this;
                if (realBufferedSink.closed) {
                    return;
                }
                realBufferedSink.flush();
            }

            public String toString() {
                return RealBufferedSink.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i10, int i11) throws IOException {
                p.j(bArr, "data");
                RealBufferedSink realBufferedSink = RealBufferedSink.this;
                if (!realBufferedSink.closed) {
                    realBufferedSink.bufferField.write(bArr, i10, i11);
                    RealBufferedSink.this.emitCompleteSegments();
                    return;
                }
                throw new IOException("closed");
            }
        };
    }

    @Override // com.applovin.shadow.okio.Sink
    public Timeout timeout() {
        return this.sink.timeout();
    }

    public String toString() {
        return "buffer(" + this.sink + ')';
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public long writeAll(Source source) throws IOException {
        p.j(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(this.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
            emitCompleteSegments();
        }
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeByte(int i10) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeByte(i10);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeDecimalLong(long j10) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeDecimalLong(j10);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeHexadecimalUnsignedLong(long j10) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeHexadecimalUnsignedLong(j10);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeInt(int i10) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeInt(i10);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeIntLe(int i10) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeIntLe(i10);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeLong(long j10) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeLong(j10);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeLongLe(long j10) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeLongLe(j10);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeShort(int i10) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeShort(i10);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeShortLe(int i10) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeShortLe(i10);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeUtf8CodePoint(int i10) {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        this.bufferField.writeUtf8CodePoint(i10);
        return emitCompleteSegments();
    }

    @Override // com.applovin.shadow.okio.Sink
    public void write(Buffer buffer, long j10) throws IOException {
        p.j(buffer, "source");
        if (!this.closed) {
            this.bufferField.write(buffer, j10);
            emitCompleteSegments();
            return;
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeString(String str, int i10, int i11, Charset charset) {
        p.j(str, TypedValues.Custom.S_STRING);
        p.j(charset, G5.M);
        if (!this.closed) {
            this.bufferField.writeString(str, i10, i11, charset);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink writeUtf8(String str, int i10, int i11) {
        p.j(str, TypedValues.Custom.S_STRING);
        if (!this.closed) {
            this.bufferField.writeUtf8(str, i10, i11);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink write(ByteString byteString) {
        p.j(byteString, "byteString");
        if (!this.closed) {
            this.bufferField.write(byteString);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink write(ByteString byteString, int i10, int i11) {
        p.j(byteString, "byteString");
        if (!this.closed) {
            this.bufferField.write(byteString, i10, i11);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink write(byte[] bArr) {
        p.j(bArr, "source");
        if (!this.closed) {
            this.bufferField.write(bArr);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink write(byte[] bArr, int i10, int i11) {
        p.j(bArr, "source");
        if (!this.closed) {
            this.bufferField.write(bArr, i10, i11);
            return emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    @Override // com.applovin.shadow.okio.BufferedSink
    public BufferedSink write(Source source, long j10) throws IOException {
        p.j(source, "source");
        while (j10 > 0) {
            long j11 = source.read(this.bufferField, j10);
            if (j11 != -1) {
                j10 -= j11;
                emitCompleteSegments();
            } else {
                throw new EOFException();
            }
        }
        return this;
    }
}
