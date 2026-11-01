package okio.internal;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ck.p;
import java.io.EOFException;
import java.io.IOException;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;
import okio.Sink;
import okio.Source;
import okio.Timeout;

/* JADX INFO: renamed from: okio.internal.-RealBufferedSink, reason: invalid class name */
/* JADX INFO: compiled from: RealBufferedSink.kt */
/* JADX INFO: loaded from: classes11.dex */
public final class RealBufferedSink {
    public static final void commonWrite(okio.RealBufferedSink realBufferedSink, Buffer buffer, long j10) throws IOException {
        p.j(realBufferedSink, "<this>");
        p.j(buffer, "source");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.write(buffer, j10);
        realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteUtf8(okio.RealBufferedSink realBufferedSink, String str) {
        p.j(realBufferedSink, "<this>");
        p.j(str, TypedValues.Custom.S_STRING);
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeUtf8(str);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final void commonClose(okio.RealBufferedSink realBufferedSink) throws Throwable {
        p.j(realBufferedSink, "<this>");
        if (realBufferedSink.closed) {
            return;
        }
        Throwable th2 = null;
        try {
            if (realBufferedSink.bufferField.size() > 0) {
                Sink sink = realBufferedSink.sink;
                Buffer buffer = realBufferedSink.bufferField;
                sink.write(buffer, buffer.size());
            }
        } catch (Throwable th3) {
            th2 = th3;
        }
        try {
            realBufferedSink.sink.close();
        } catch (Throwable th4) {
            if (th2 == null) {
                th2 = th4;
            }
        }
        realBufferedSink.closed = true;
        if (th2 != null) {
            throw th2;
        }
    }

    public static final BufferedSink commonEmit(okio.RealBufferedSink realBufferedSink) throws IOException {
        p.j(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        long size = realBufferedSink.bufferField.size();
        if (size > 0) {
            realBufferedSink.sink.write(realBufferedSink.bufferField, size);
        }
        return realBufferedSink;
    }

    public static final BufferedSink commonEmitCompleteSegments(okio.RealBufferedSink realBufferedSink) throws IOException {
        p.j(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        long jCompleteSegmentByteCount = realBufferedSink.bufferField.completeSegmentByteCount();
        if (jCompleteSegmentByteCount > 0) {
            realBufferedSink.sink.write(realBufferedSink.bufferField, jCompleteSegmentByteCount);
        }
        return realBufferedSink;
    }

    public static final void commonFlush(okio.RealBufferedSink realBufferedSink) throws IOException {
        p.j(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (realBufferedSink.bufferField.size() > 0) {
            Sink sink = realBufferedSink.sink;
            Buffer buffer = realBufferedSink.bufferField;
            sink.write(buffer, buffer.size());
        }
        realBufferedSink.sink.flush();
    }

    public static final Timeout commonTimeout(okio.RealBufferedSink realBufferedSink) {
        p.j(realBufferedSink, "<this>");
        return realBufferedSink.sink.timeout();
    }

    public static final String commonToString(okio.RealBufferedSink realBufferedSink) {
        p.j(realBufferedSink, "<this>");
        return "buffer(" + realBufferedSink.sink + ')';
    }

    public static final long commonWriteAll(okio.RealBufferedSink realBufferedSink, Source source) throws IOException {
        p.j(realBufferedSink, "<this>");
        p.j(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(realBufferedSink.bufferField, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
            realBufferedSink.emitCompleteSegments();
        }
    }

    public static final BufferedSink commonWriteByte(okio.RealBufferedSink realBufferedSink, int i10) {
        p.j(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeByte(i10);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteDecimalLong(okio.RealBufferedSink realBufferedSink, long j10) {
        p.j(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeDecimalLong(j10);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteHexadecimalUnsignedLong(okio.RealBufferedSink realBufferedSink, long j10) {
        p.j(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeHexadecimalUnsignedLong(j10);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteInt(okio.RealBufferedSink realBufferedSink, int i10) {
        p.j(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeInt(i10);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteIntLe(okio.RealBufferedSink realBufferedSink, int i10) {
        p.j(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeIntLe(i10);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteLong(okio.RealBufferedSink realBufferedSink, long j10) {
        p.j(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeLong(j10);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteLongLe(okio.RealBufferedSink realBufferedSink, long j10) {
        p.j(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeLongLe(j10);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteShort(okio.RealBufferedSink realBufferedSink, int i10) {
        p.j(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeShort(i10);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteShortLe(okio.RealBufferedSink realBufferedSink, int i10) {
        p.j(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeShortLe(i10);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWriteUtf8CodePoint(okio.RealBufferedSink realBufferedSink, int i10) {
        p.j(realBufferedSink, "<this>");
        if (!(!realBufferedSink.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        realBufferedSink.bufferField.writeUtf8CodePoint(i10);
        return realBufferedSink.emitCompleteSegments();
    }

    public static final BufferedSink commonWrite(okio.RealBufferedSink realBufferedSink, ByteString byteString) {
        p.j(realBufferedSink, "<this>");
        p.j(byteString, "byteString");
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(byteString);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final BufferedSink commonWriteUtf8(okio.RealBufferedSink realBufferedSink, String str, int i10, int i11) {
        p.j(realBufferedSink, "<this>");
        p.j(str, TypedValues.Custom.S_STRING);
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.writeUtf8(str, i10, i11);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final BufferedSink commonWrite(okio.RealBufferedSink realBufferedSink, ByteString byteString, int i10, int i11) {
        p.j(realBufferedSink, "<this>");
        p.j(byteString, "byteString");
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(byteString, i10, i11);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final BufferedSink commonWrite(okio.RealBufferedSink realBufferedSink, byte[] bArr) {
        p.j(realBufferedSink, "<this>");
        p.j(bArr, "source");
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(bArr);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final BufferedSink commonWrite(okio.RealBufferedSink realBufferedSink, byte[] bArr, int i10, int i11) {
        p.j(realBufferedSink, "<this>");
        p.j(bArr, "source");
        if (!realBufferedSink.closed) {
            realBufferedSink.bufferField.write(bArr, i10, i11);
            return realBufferedSink.emitCompleteSegments();
        }
        throw new IllegalStateException("closed".toString());
    }

    public static final BufferedSink commonWrite(okio.RealBufferedSink realBufferedSink, Source source, long j10) throws IOException {
        p.j(realBufferedSink, "<this>");
        p.j(source, "source");
        while (j10 > 0) {
            long j11 = source.read(realBufferedSink.bufferField, j10);
            if (j11 != -1) {
                j10 -= j11;
                realBufferedSink.emitCompleteSegments();
            } else {
                throw new EOFException();
            }
        }
        return realBufferedSink;
    }
}
