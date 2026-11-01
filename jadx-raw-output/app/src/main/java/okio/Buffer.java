package okio;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import ck.p;
import com.ironsource.C3426d4;
import com.ironsource.G5;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import lk.c;
import nj.l;

/* JADX INFO: compiled from: Buffer.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class Buffer implements BufferedSource, BufferedSink, Cloneable, ByteChannel {
    public Segment head;
    private long size;

    /* JADX INFO: compiled from: Buffer.kt */
    public static final class UnsafeCursor implements Closeable {
        public Buffer buffer;
        public byte[] data;
        public boolean readWrite;
        private Segment segment;
        public long offset = -1;
        public int start = -1;
        public int end = -1;

        public final long expandBuffer(int i10) {
            if (!(i10 > 0)) {
                throw new IllegalArgumentException(("minByteCount <= 0: " + i10).toString());
            }
            if (!(i10 <= 8192)) {
                throw new IllegalArgumentException(("minByteCount > Segment.SIZE: " + i10).toString());
            }
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.readWrite) {
                throw new IllegalStateException("expandBuffer() only permitted for read/write buffers".toString());
            }
            long size = buffer.size();
            Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i10);
            int i11 = 8192 - segmentWritableSegment$okio.limit;
            segmentWritableSegment$okio.limit = 8192;
            long j10 = i11;
            buffer.setSize$okio(size + j10);
            setSegment$okio(segmentWritableSegment$okio);
            this.offset = size;
            this.data = segmentWritableSegment$okio.data;
            this.start = 8192 - i11;
            this.end = 8192;
            return j10;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!(this.buffer != null)) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            this.buffer = null;
            setSegment$okio(null);
            this.offset = -1L;
            this.data = null;
            this.start = -1;
            this.end = -1;
        }

        public final Segment getSegment$okio() {
            return this.segment;
        }

        public final int next() {
            long j10 = this.offset;
            Buffer buffer = this.buffer;
            p.g(buffer);
            if (!(j10 != buffer.size())) {
                throw new IllegalStateException("no more bytes".toString());
            }
            long j11 = this.offset;
            return seek(j11 == -1 ? 0L : j11 + ((long) (this.end - this.start)));
        }

        public final long resizeBuffer(long j10) {
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (!this.readWrite) {
                throw new IllegalStateException("resizeBuffer() only permitted for read/write buffers".toString());
            }
            long size = buffer.size();
            int i10 = 1;
            if (j10 <= size) {
                if (!(j10 >= 0)) {
                    throw new IllegalArgumentException(("newSize < 0: " + j10).toString());
                }
                long j11 = size - j10;
                while (j11 > 0) {
                    Segment segment = buffer.head;
                    p.g(segment);
                    Segment segment2 = segment.prev;
                    p.g(segment2);
                    int i11 = segment2.limit;
                    long j12 = i11 - segment2.pos;
                    if (j12 > j11) {
                        segment2.limit = i11 - ((int) j11);
                        break;
                    }
                    buffer.head = segment2.pop();
                    SegmentPool.recycle(segment2);
                    j11 -= j12;
                }
                setSegment$okio(null);
                this.offset = j10;
                this.data = null;
                this.start = -1;
                this.end = -1;
            } else if (j10 > size) {
                long j13 = j10 - size;
                boolean z10 = true;
                while (j13 > 0) {
                    Segment segmentWritableSegment$okio = buffer.writableSegment$okio(i10);
                    int iMin = (int) Math.min(j13, 8192 - segmentWritableSegment$okio.limit);
                    segmentWritableSegment$okio.limit += iMin;
                    j13 -= (long) iMin;
                    if (z10) {
                        setSegment$okio(segmentWritableSegment$okio);
                        this.offset = size;
                        this.data = segmentWritableSegment$okio.data;
                        int i12 = segmentWritableSegment$okio.limit;
                        this.start = i12 - iMin;
                        this.end = i12;
                        z10 = false;
                    }
                    i10 = 1;
                }
            }
            buffer.setSize$okio(j10);
            return size;
        }

        public final int seek(long j10) {
            Segment segmentPush;
            Buffer buffer = this.buffer;
            if (buffer == null) {
                throw new IllegalStateException("not attached to a buffer".toString());
            }
            if (j10 < -1 || j10 > buffer.size()) {
                throw new ArrayIndexOutOfBoundsException("offset=" + j10 + " > size=" + buffer.size());
            }
            if (j10 == -1 || j10 == buffer.size()) {
                setSegment$okio(null);
                this.offset = j10;
                this.data = null;
                this.start = -1;
                this.end = -1;
                return -1;
            }
            long j11 = 0;
            long size = buffer.size();
            Segment segment$okio = buffer.head;
            if (getSegment$okio() != null) {
                long j12 = this.offset;
                int i10 = this.start;
                Segment segment$okio2 = getSegment$okio();
                p.g(segment$okio2);
                long j13 = j12 - ((long) (i10 - segment$okio2.pos));
                if (j13 > j10) {
                    segment$okio = getSegment$okio();
                    size = j13;
                    segmentPush = segment$okio;
                } else {
                    segmentPush = getSegment$okio();
                    j11 = j13;
                }
            } else {
                segmentPush = segment$okio;
            }
            if (size - j10 > j10 - j11) {
                while (true) {
                    p.g(segmentPush);
                    int i11 = segmentPush.limit;
                    int i12 = segmentPush.pos;
                    if (j10 < ((long) (i11 - i12)) + j11) {
                        break;
                    }
                    j11 += (long) (i11 - i12);
                    segmentPush = segmentPush.next;
                }
            } else {
                while (size > j10) {
                    p.g(segment$okio);
                    segment$okio = segment$okio.prev;
                    p.g(segment$okio);
                    size -= (long) (segment$okio.limit - segment$okio.pos);
                }
                j11 = size;
                segmentPush = segment$okio;
            }
            if (this.readWrite) {
                p.g(segmentPush);
                if (segmentPush.shared) {
                    Segment segmentUnsharedCopy = segmentPush.unsharedCopy();
                    if (buffer.head == segmentPush) {
                        buffer.head = segmentUnsharedCopy;
                    }
                    segmentPush = segmentPush.push(segmentUnsharedCopy);
                    Segment segment = segmentPush.prev;
                    p.g(segment);
                    segment.pop();
                }
            }
            setSegment$okio(segmentPush);
            this.offset = j10;
            p.g(segmentPush);
            this.data = segmentPush.data;
            int i13 = segmentPush.pos + ((int) (j10 - j11));
            this.start = i13;
            int i14 = segmentPush.limit;
            this.end = i14;
            return i14 - i13;
        }

        public final void setSegment$okio(Segment segment) {
            this.segment = segment;
        }
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, OutputStream outputStream, long j10, long j11, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        long j12 = j10;
        if ((i10 & 4) != 0) {
            j11 = buffer.size - j12;
        }
        return buffer.copyTo(outputStream, j12, j11);
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public Buffer buffer() {
        return this;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    public final Buffer copyTo(OutputStream outputStream) throws IOException {
        p.j(outputStream, "out");
        return copyTo$default(this, outputStream, 0L, 0L, 6, (Object) null);
    }

    public final Buffer copyTo(OutputStream outputStream, long j10) throws IOException {
        p.j(outputStream, "out");
        return copyTo$default(this, outputStream, j10, 0L, 4, (Object) null);
    }

    public final Buffer copyTo(OutputStream outputStream, long j10, long j11) throws IOException {
        p.j(outputStream, "out");
        SegmentedByteString.checkOffsetAndCount(this.size, j10, j11);
        if (j11 == 0) {
            return this;
        }
        Segment segment = this.head;
        while (true) {
            p.g(segment);
            int i10 = segment.limit;
            int i11 = segment.pos;
            if (j10 < i10 - i11) {
                break;
            }
            j10 -= (long) (i10 - i11);
            segment = segment.next;
        }
        while (j11 > 0) {
            p.g(segment);
            int i12 = (int) (((long) segment.pos) + j10);
            int iMin = (int) Math.min(segment.limit - i12, j11);
            outputStream.write(segment.data, i12, iMin);
            j11 -= (long) iMin;
            segment = segment.next;
            j10 = 0;
        }
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer emit() {
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer emitCompleteSegments() {
        return this;
    }

    @Override // okio.BufferedSink, okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // okio.BufferedSource, okio.BufferedSink
    public Buffer getBuffer() {
        return this;
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b10) {
        return indexOf(b10, 0L, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(ByteString byteString) {
        p.j(byteString, "targetBytes");
        return indexOfElement(byteString, 0L);
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j10, ByteString byteString) {
        p.j(byteString, "bytes");
        return rangeEquals(j10, byteString, 0, byteString.size());
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        p.j(byteBuffer, "sink");
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), segment.limit - segment.pos);
        byteBuffer.put(segment.data, segment.pos, iMin);
        int i10 = segment.pos + iMin;
        segment.pos = i10;
        this.size -= (long) iMin;
        if (i10 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    public final UnsafeCursor readAndWriteUnsafe() {
        return readAndWriteUnsafe$default(this, null, 1, null);
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray() {
        return readByteArray(size());
    }

    @Override // okio.BufferedSource
    public ByteString readByteString() {
        return readByteString(size());
    }

    public final Buffer readFrom(InputStream inputStream) throws IOException {
        p.j(inputStream, "input");
        readFrom(inputStream, Long.MAX_VALUE, true);
        return this;
    }

    @Override // okio.BufferedSource
    public void readFully(Buffer buffer, long j10) throws EOFException {
        p.j(buffer, "sink");
        if (size() >= j10) {
            buffer.write(this, j10);
        } else {
            buffer.write(this, size());
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public String readString(Charset charset) {
        p.j(charset, G5.M);
        return readString(this.size, charset);
    }

    public final UnsafeCursor readUnsafe() {
        return readUnsafe$default(this, null, 1, null);
    }

    @Override // okio.BufferedSource
    public String readUtf8() {
        return readString(this.size, c.f63591b);
    }

    @Override // okio.BufferedSource
    public String readUtf8LineStrict() throws EOFException {
        return readUtf8LineStrict(Long.MAX_VALUE);
    }

    public final ByteString snapshot() {
        if (size() <= 2147483647L) {
            return snapshot((int) size());
        }
        throw new IllegalStateException(("size > Int.MAX_VALUE: " + size()).toString());
    }

    public final Buffer writeTo(OutputStream outputStream) throws IOException {
        p.j(outputStream, "out");
        return writeTo$default(this, outputStream, 0L, 2, null);
    }

    public static /* synthetic */ UnsafeCursor readAndWriteUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            unsafeCursor = SegmentedByteString.getDEFAULT__new_UnsafeCursor();
        }
        return buffer.readAndWriteUnsafe(unsafeCursor);
    }

    public static /* synthetic */ UnsafeCursor readUnsafe$default(Buffer buffer, UnsafeCursor unsafeCursor, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            unsafeCursor = SegmentedByteString.getDEFAULT__new_UnsafeCursor();
        }
        return buffer.readUnsafe(unsafeCursor);
    }

    public static /* synthetic */ Buffer writeTo$default(Buffer buffer, OutputStream outputStream, long j10, int i10, Object obj) throws IOException {
        if ((i10 & 2) != 0) {
            j10 = buffer.size;
        }
        return buffer.writeTo(outputStream, j10);
    }

    /* JADX INFO: renamed from: -deprecated_size, reason: not valid java name */
    public final long m3606deprecated_size() {
        return this.size;
    }

    public Buffer clone() {
        return copy();
    }

    public final Buffer copy() {
        Buffer buffer = new Buffer();
        if (size() != 0) {
            Segment segment = this.head;
            p.g(segment);
            Segment segmentSharedCopy = segment.sharedCopy();
            buffer.head = segmentSharedCopy;
            segmentSharedCopy.prev = segmentSharedCopy;
            segmentSharedCopy.next = segmentSharedCopy;
            for (Segment segment2 = segment.next; segment2 != segment; segment2 = segment2.next) {
                Segment segment3 = segmentSharedCopy.prev;
                p.g(segment3);
                p.g(segment2);
                segment3.push(segment2.sharedCopy());
            }
            buffer.setSize$okio(size());
        }
        return buffer;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof Buffer)) {
                return false;
            }
            Buffer buffer = (Buffer) obj;
            if (size() != buffer.size()) {
                return false;
            }
            if (size() != 0) {
                Segment segment = this.head;
                p.g(segment);
                Segment segment2 = buffer.head;
                p.g(segment2);
                int i10 = segment.pos;
                int i11 = segment2.pos;
                long j10 = 0;
                while (j10 < size()) {
                    long jMin = Math.min(segment.limit - i10, segment2.limit - i11);
                    long j11 = 0;
                    while (j11 < jMin) {
                        int i12 = i10 + 1;
                        int i13 = i11 + 1;
                        if (segment.data[i10] != segment2.data[i11]) {
                            return false;
                        }
                        j11++;
                        i10 = i12;
                        i11 = i13;
                    }
                    if (i10 == segment.limit) {
                        segment = segment.next;
                        p.g(segment);
                        i10 = segment.pos;
                    }
                    if (i11 == segment2.limit) {
                        segment2 = segment2.next;
                        p.g(segment2);
                        i11 = segment2.pos;
                    }
                    j10 += jMin;
                }
            }
        }
        return true;
    }

    @Override // okio.BufferedSource
    public boolean exhausted() {
        return this.size == 0;
    }

    public int hashCode() {
        Segment segment = this.head;
        if (segment == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = segment.limit;
            for (int i12 = segment.pos; i12 < i11; i12++) {
                i10 = (i10 * 31) + segment.data[i12];
            }
            segment = segment.next;
            p.g(segment);
        } while (segment != this.head);
        return i10;
    }

    public final ByteString hmacSha1(ByteString byteString) {
        p.j(byteString, C3426d4.i.W);
        return hmac("HmacSHA1", byteString);
    }

    public final ByteString hmacSha256(ByteString byteString) {
        p.j(byteString, C3426d4.i.W);
        return hmac("HmacSHA256", byteString);
    }

    public final ByteString hmacSha512(ByteString byteString) {
        p.j(byteString, C3426d4.i.W);
        return hmac("HmacSHA512", byteString);
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b10, long j10) {
        return indexOf(b10, j10, Long.MAX_VALUE);
    }

    @Override // okio.BufferedSource
    public long indexOfElement(ByteString byteString, long j10) {
        int i10;
        int i11;
        p.j(byteString, "targetBytes");
        long size = 0;
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("fromIndex < 0: " + j10).toString());
        }
        Segment segment = this.head;
        if (segment == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            size = size();
            while (size > j10) {
                segment = segment.prev;
                p.g(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            if (byteString.size() == 2) {
                byte b10 = byteString.getByte(0);
                byte b11 = byteString.getByte(1);
                while (size < size()) {
                    byte[] bArr = segment.data;
                    i10 = (int) ((((long) segment.pos) + j10) - size);
                    int i12 = segment.limit;
                    while (true) {
                        if (i10 >= i12) {
                            size += (long) (segment.limit - segment.pos);
                            segment = segment.next;
                            p.g(segment);
                            j10 = size;
                        } else {
                            byte b12 = bArr[i10];
                            if (b12 == b10 || b12 == b11) {
                                i11 = segment.pos;
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                return -1L;
            }
            byte[] bArrInternalArray$okio = byteString.internalArray$okio();
            while (size < size()) {
                byte[] bArr2 = segment.data;
                i10 = (int) ((((long) segment.pos) + j10) - size);
                int i13 = segment.limit;
                while (true) {
                    if (i10 < i13) {
                        byte b13 = bArr2[i10];
                        int length = bArrInternalArray$okio.length;
                        int i14 = 0;
                        while (true) {
                            if (i14 >= length) {
                                i10++;
                            } else if (b13 == bArrInternalArray$okio[i14]) {
                                i11 = segment.pos;
                            } else {
                                i14++;
                            }
                        }
                    } else {
                        size += (long) (segment.limit - segment.pos);
                        segment = segment.next;
                        p.g(segment);
                        j10 = size;
                    }
                }
            }
            return -1L;
        }
        while (true) {
            long j11 = ((long) (segment.limit - segment.pos)) + size;
            if (j11 > j10) {
                break;
            }
            segment = segment.next;
            p.g(segment);
            size = j11;
        }
        if (byteString.size() == 2) {
            byte b14 = byteString.getByte(0);
            byte b15 = byteString.getByte(1);
            while (size < size()) {
                byte[] bArr3 = segment.data;
                i10 = (int) ((((long) segment.pos) + j10) - size);
                int i15 = segment.limit;
                while (true) {
                    if (i10 >= i15) {
                        size += (long) (segment.limit - segment.pos);
                        segment = segment.next;
                        p.g(segment);
                        j10 = size;
                    } else {
                        byte b16 = bArr3[i10];
                        if (b16 == b14 || b16 == b15) {
                            i11 = segment.pos;
                        } else {
                            i10++;
                        }
                    }
                }
            }
            return -1L;
        }
        byte[] bArrInternalArray$okio2 = byteString.internalArray$okio();
        while (size < size()) {
            byte[] bArr4 = segment.data;
            i10 = (int) ((((long) segment.pos) + j10) - size);
            int i16 = segment.limit;
            while (true) {
                if (i10 < i16) {
                    byte b17 = bArr4[i10];
                    int length2 = bArrInternalArray$okio2.length;
                    int i17 = 0;
                    while (true) {
                        if (i17 >= length2) {
                            i10++;
                        } else if (b17 == bArrInternalArray$okio2[i17]) {
                            i11 = segment.pos;
                        } else {
                            i17++;
                        }
                    }
                } else {
                    size += (long) (segment.limit - segment.pos);
                    segment = segment.next;
                    p.g(segment);
                    j10 = size;
                }
            }
        }
        return -1L;
        return ((long) (i10 - i11)) + size;
    }

    @Override // okio.BufferedSource
    public InputStream inputStream() {
        return new InputStream() { // from class: okio.Buffer.inputStream.1
            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.InputStream
            public int read() {
                if (Buffer.this.size() > 0) {
                    return Buffer.this.readByte() & 255;
                }
                return -1;
            }

            @Override // java.io.InputStream
            public int available() {
                return (int) Math.min(Buffer.this.size(), Integer.MAX_VALUE);
            }

            public String toString() {
                return Buffer.this + ".inputStream()";
            }

            @Override // java.io.InputStream
            public int read(byte[] bArr, int i10, int i11) {
                p.j(bArr, "sink");
                return Buffer.this.read(bArr, i10, i11);
            }
        };
    }

    public final ByteString md5() {
        return digest(SameMD5.TAG);
    }

    @Override // okio.BufferedSink
    public OutputStream outputStream() {
        return new OutputStream() { // from class: okio.Buffer.outputStream.1
            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() {
            }

            @Override // java.io.OutputStream
            public void write(int i10) {
                Buffer.this.writeByte(i10);
            }

            public String toString() {
                return Buffer.this + ".outputStream()";
            }

            @Override // java.io.OutputStream
            public void write(byte[] bArr, int i10, int i11) {
                p.j(bArr, "data");
                Buffer.this.write(bArr, i10, i11);
            }
        };
    }

    @Override // okio.BufferedSource
    public BufferedSource peek() {
        return Okio.buffer(new PeekSource(this));
    }

    @Override // okio.BufferedSource
    public boolean rangeEquals(long j10, ByteString byteString, int i10, int i11) {
        p.j(byteString, "bytes");
        if (j10 < 0 || i10 < 0 || i11 < 0 || size() - j10 < i11 || byteString.size() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (getByte(((long) i12) + j10) != byteString.getByte(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    @Override // okio.BufferedSource
    public long readAll(Sink sink) throws IOException {
        p.j(sink, "sink");
        long size = size();
        if (size > 0) {
            sink.write(this, size);
        }
        return size;
    }

    public final UnsafeCursor readAndWriteUnsafe(UnsafeCursor unsafeCursor) {
        p.j(unsafeCursor, "unsafeCursor");
        return okio.internal.Buffer.commonReadAndWriteUnsafe(this, unsafeCursor);
    }

    @Override // okio.BufferedSource
    public byte[] readByteArray(long j10) throws EOFException {
        if (!(j10 >= 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        byte[] bArr = new byte[(int) j10];
        readFully(bArr);
        return bArr;
    }

    @Override // okio.BufferedSource
    public ByteString readByteString(long j10) throws EOFException {
        if (!(j10 >= 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (size() < j10) {
            throw new EOFException();
        }
        if (j10 < PlaybackStateCompat.ACTION_SKIP_TO_QUEUE_ITEM) {
            return new ByteString(readByteArray(j10));
        }
        ByteString byteStringSnapshot = snapshot((int) j10);
        skip(j10);
        return byteStringSnapshot;
    }

    @Override // okio.BufferedSource
    public long readDecimalLong() throws EOFException {
        if (size() == 0) {
            throw new EOFException();
        }
        long j10 = -7;
        int i10 = 0;
        long j11 = 0;
        boolean z10 = false;
        boolean z11 = false;
        do {
            Segment segment = this.head;
            p.g(segment);
            byte[] bArr = segment.data;
            int i11 = segment.pos;
            int i12 = segment.limit;
            while (i11 < i12) {
                byte b10 = bArr[i11];
                if (b10 >= 48 && b10 <= 57) {
                    int i13 = 48 - b10;
                    if (j11 < -922337203685477580L || (j11 == -922337203685477580L && i13 < j10)) {
                        Buffer bufferWriteByte = new Buffer().writeDecimalLong(j11).writeByte((int) b10);
                        if (!z10) {
                            bufferWriteByte.readByte();
                        }
                        throw new NumberFormatException("Number too large: " + bufferWriteByte.readUtf8());
                    }
                    j11 = (j11 * 10) + ((long) i13);
                } else {
                    if (b10 != 45 || i10 != 0) {
                        z11 = true;
                        break;
                    }
                    j10--;
                    z10 = true;
                }
                i11++;
                i10++;
            }
            if (i11 == i12) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i11;
            }
            if (z11) {
                break;
            }
        } while (this.head != null);
        setSize$okio(size() - ((long) i10));
        if (i10 >= (z10 ? 2 : 1)) {
            return z10 ? j11 : -j11;
        }
        if (size() == 0) {
            throw new EOFException();
        }
        throw new NumberFormatException((z10 ? "Expected a digit" : "Expected a digit or '-'") + " but was 0x" + SegmentedByteString.toHexString(getByte(0L)));
    }

    public final Buffer readFrom(InputStream inputStream, long j10) throws IOException {
        p.j(inputStream, "input");
        if (j10 >= 0) {
            readFrom(inputStream, j10, false);
            return this;
        }
        throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
    }

    @Override // okio.BufferedSource
    public String readString(long j10, Charset charset) throws EOFException {
        p.j(charset, G5.M);
        if (!(j10 >= 0 && j10 <= 2147483647L)) {
            throw new IllegalArgumentException(("byteCount: " + j10).toString());
        }
        if (this.size < j10) {
            throw new EOFException();
        }
        if (j10 == 0) {
            return "";
        }
        Segment segment = this.head;
        p.g(segment);
        int i10 = segment.pos;
        if (((long) i10) + j10 > segment.limit) {
            return new String(readByteArray(j10), charset);
        }
        int i11 = (int) j10;
        String str = new String(segment.data, i10, i11, charset);
        int i12 = segment.pos + i11;
        segment.pos = i12;
        this.size -= j10;
        if (i12 == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return str;
    }

    public final UnsafeCursor readUnsafe(UnsafeCursor unsafeCursor) {
        p.j(unsafeCursor, "unsafeCursor");
        return okio.internal.Buffer.commonReadUnsafe(this, unsafeCursor);
    }

    @Override // okio.BufferedSource
    public String readUtf8(long j10) throws EOFException {
        return readString(j10, c.f63591b);
    }

    @Override // okio.BufferedSource
    public String readUtf8Line() throws EOFException {
        long jIndexOf = indexOf((byte) 10);
        if (jIndexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(this, jIndexOf);
        }
        if (size() != 0) {
            return readUtf8(size());
        }
        return null;
    }

    @Override // okio.BufferedSource
    public String readUtf8LineStrict(long j10) throws EOFException {
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("limit < 0: " + j10).toString());
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jIndexOf = indexOf((byte) 10, 0L, j11);
        if (jIndexOf != -1) {
            return okio.internal.Buffer.readUtf8Line(this, jIndexOf);
        }
        if (j11 < size() && getByte(j11 - 1) == 13 && getByte(j11) == 10) {
            return okio.internal.Buffer.readUtf8Line(this, j11);
        }
        Buffer buffer = new Buffer();
        copyTo(buffer, 0L, Math.min(32, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j10) + " content=" + buffer.readByteString().hex() + (char) 8230);
    }

    @Override // okio.BufferedSource
    public boolean request(long j10) {
        return this.size >= j10;
    }

    @Override // okio.BufferedSource
    public void require(long j10) throws EOFException {
        if (this.size < j10) {
            throw new EOFException();
        }
    }

    @Override // okio.BufferedSource
    public int select(Options options) throws EOFException {
        p.j(options, "options");
        int iSelectPrefix$default = okio.internal.Buffer.selectPrefix$default(this, options, false, 2, null);
        if (iSelectPrefix$default == -1) {
            return -1;
        }
        skip(options.getByteStrings$okio()[iSelectPrefix$default].size());
        return iSelectPrefix$default;
    }

    public final void setSize$okio(long j10) {
        this.size = j10;
    }

    public final ByteString sha1() {
        return digest(AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
    }

    public final ByteString sha256() {
        return digest("SHA-256");
    }

    public final ByteString sha512() {
        return digest("SHA-512");
    }

    public final long size() {
        return this.size;
    }

    @Override // okio.BufferedSource
    public void skip(long j10) throws EOFException {
        while (j10 > 0) {
            Segment segment = this.head;
            if (segment == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, segment.limit - segment.pos);
            long j11 = iMin;
            setSize$okio(size() - j11);
            j10 -= j11;
            int i10 = segment.pos + iMin;
            segment.pos = i10;
            if (i10 == segment.limit) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            }
        }
    }

    @Override // okio.Source
    public Timeout timeout() {
        return Timeout.NONE;
    }

    public final Segment writableSegment$okio(int i10) {
        if (!(i10 >= 1 && i10 <= 8192)) {
            throw new IllegalArgumentException("unexpected capacity".toString());
        }
        Segment segment = this.head;
        if (segment != null) {
            p.g(segment);
            Segment segment2 = segment.prev;
            p.g(segment2);
            return (segment2.limit + i10 > 8192 || !segment2.owner) ? segment2.push(SegmentPool.take()) : segment2;
        }
        Segment segmentTake = SegmentPool.take();
        this.head = segmentTake;
        segmentTake.prev = segmentTake;
        segmentTake.next = segmentTake;
        return segmentTake;
    }

    @Override // okio.BufferedSink
    public long writeAll(Source source) throws IOException {
        p.j(source, "source");
        long j10 = 0;
        while (true) {
            long j11 = source.read(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (j11 == -1) {
                return j10;
            }
            j10 += j11;
        }
    }

    @Override // okio.BufferedSink
    public Buffer writeByte(int i10) {
        Segment segmentWritableSegment$okio = writableSegment$okio(1);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit;
        segmentWritableSegment$okio.limit = i11 + 1;
        bArr[i11] = (byte) i10;
        setSize$okio(size() + 1);
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeDecimalLong(long j10) {
        if (j10 == 0) {
            return writeByte(48);
        }
        boolean z10 = false;
        int i10 = 1;
        if (j10 < 0) {
            j10 = -j10;
            if (j10 < 0) {
                return writeUtf8("-9223372036854775808");
            }
            z10 = true;
        }
        if (j10 < 100000000) {
            if (j10 < 10000) {
                if (j10 >= 100) {
                    i10 = j10 < 1000 ? 3 : 4;
                } else if (j10 >= 10) {
                    i10 = 2;
                }
            } else if (j10 < 1000000) {
                i10 = j10 < 100000 ? 5 : 6;
            } else {
                i10 = j10 < 10000000 ? 7 : 8;
            }
        } else if (j10 < 1000000000000L) {
            if (j10 < 10000000000L) {
                i10 = j10 < 1000000000 ? 9 : 10;
            } else {
                i10 = j10 < 100000000000L ? 11 : 12;
            }
        } else if (j10 < 1000000000000000L) {
            if (j10 < 10000000000000L) {
                i10 = 13;
            } else {
                i10 = j10 < 100000000000000L ? 14 : 15;
            }
        } else if (j10 < 100000000000000000L) {
            i10 = j10 < 10000000000000000L ? 16 : 17;
        } else {
            i10 = j10 < 1000000000000000000L ? 18 : 19;
        }
        if (z10) {
            i10++;
        }
        Segment segmentWritableSegment$okio = writableSegment$okio(i10);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit + i10;
        while (j10 != 0) {
            long j11 = 10;
            i11--;
            bArr[i11] = okio.internal.Buffer.getHEX_DIGIT_BYTES()[(int) (j10 % j11)];
            j10 /= j11;
        }
        if (z10) {
            bArr[i11 - 1] = 45;
        }
        segmentWritableSegment$okio.limit += i10;
        setSize$okio(size() + ((long) i10));
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeHexadecimalUnsignedLong(long j10) {
        if (j10 == 0) {
            return writeByte(48);
        }
        long j11 = (j10 >>> 1) | j10;
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        long j16 = j15 | (j15 >>> 32);
        long j17 = j16 - ((j16 >>> 1) & 6148914691236517205L);
        long j18 = ((j17 >>> 2) & 3689348814741910323L) + (j17 & 3689348814741910323L);
        long j19 = ((j18 >>> 4) + j18) & 1085102592571150095L;
        long j20 = j19 + (j19 >>> 8);
        long j21 = j20 + (j20 >>> 16);
        int i10 = (int) ((((j21 & 63) + ((j21 >>> 32) & 63)) + ((long) 3)) / ((long) 4));
        Segment segmentWritableSegment$okio = writableSegment$okio(i10);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit;
        for (int i12 = (i11 + i10) - 1; i12 >= i11; i12--) {
            bArr[i12] = okio.internal.Buffer.getHEX_DIGIT_BYTES()[(int) (15 & j10)];
            j10 >>>= 4;
        }
        segmentWritableSegment$okio.limit += i10;
        setSize$okio(size() + ((long) i10));
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeInt(int i10) {
        Segment segmentWritableSegment$okio = writableSegment$okio(4);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        segmentWritableSegment$okio.limit = i14 + 1;
        setSize$okio(size() + 4);
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeIntLe(int i10) {
        return writeInt(SegmentedByteString.reverseBytes(i10));
    }

    @Override // okio.BufferedSink
    public Buffer writeLong(long j10) {
        Segment segmentWritableSegment$okio = writableSegment$okio(8);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i10 = segmentWritableSegment$okio.limit;
        int i11 = i10 + 1;
        bArr[i10] = (byte) ((j10 >>> 56) & 255);
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((j10 >>> 48) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((j10 >>> 40) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((j10 >>> 32) & 255);
        int i15 = i14 + 1;
        bArr[i14] = (byte) ((j10 >>> 24) & 255);
        int i16 = i15 + 1;
        bArr[i15] = (byte) ((j10 >>> 16) & 255);
        int i17 = i16 + 1;
        bArr[i16] = (byte) ((j10 >>> 8) & 255);
        bArr[i17] = (byte) (j10 & 255);
        segmentWritableSegment$okio.limit = i17 + 1;
        setSize$okio(size() + 8);
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeLongLe(long j10) {
        return writeLong(SegmentedByteString.reverseBytes(j10));
    }

    @Override // okio.BufferedSink
    public Buffer writeShort(int i10) {
        Segment segmentWritableSegment$okio = writableSegment$okio(2);
        byte[] bArr = segmentWritableSegment$okio.data;
        int i11 = segmentWritableSegment$okio.limit;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        segmentWritableSegment$okio.limit = i12 + 1;
        setSize$okio(size() + 2);
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeShortLe(int i10) {
        return writeShort((int) SegmentedByteString.reverseBytes((short) i10));
    }

    public final Buffer writeTo(OutputStream outputStream, long j10) throws IOException {
        p.j(outputStream, "out");
        SegmentedByteString.checkOffsetAndCount(this.size, 0L, j10);
        Segment segment = this.head;
        while (j10 > 0) {
            p.g(segment);
            int iMin = (int) Math.min(j10, segment.limit - segment.pos);
            outputStream.write(segment.data, segment.pos, iMin);
            int i10 = segment.pos + iMin;
            segment.pos = i10;
            long j11 = iMin;
            this.size -= j11;
            j10 -= j11;
            if (i10 == segment.limit) {
                Segment segmentPop = segment.pop();
                this.head = segmentPop;
                SegmentPool.recycle(segment);
                segment = segmentPop;
            }
        }
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer writeUtf8CodePoint(int i10) {
        if (i10 < 128) {
            writeByte(i10);
        } else if (i10 < 2048) {
            Segment segmentWritableSegment$okio = writableSegment$okio(2);
            byte[] bArr = segmentWritableSegment$okio.data;
            int i11 = segmentWritableSegment$okio.limit;
            bArr[i11] = (byte) ((i10 >> 6) | 192);
            bArr[i11 + 1] = (byte) ((i10 & 63) | 128);
            segmentWritableSegment$okio.limit = i11 + 2;
            setSize$okio(size() + 2);
        } else {
            boolean z10 = false;
            if (55296 <= i10 && i10 < 57344) {
                z10 = true;
            }
            if (z10) {
                writeByte(63);
            } else if (i10 < 65536) {
                Segment segmentWritableSegment$okio2 = writableSegment$okio(3);
                byte[] bArr2 = segmentWritableSegment$okio2.data;
                int i12 = segmentWritableSegment$okio2.limit;
                bArr2[i12] = (byte) ((i10 >> 12) | 224);
                bArr2[i12 + 1] = (byte) (((i10 >> 6) & 63) | 128);
                bArr2[i12 + 2] = (byte) ((i10 & 63) | 128);
                segmentWritableSegment$okio2.limit = i12 + 3;
                setSize$okio(size() + 3);
            } else {
                if (i10 > 1114111) {
                    throw new IllegalArgumentException("Unexpected code point: 0x" + SegmentedByteString.toHexString(i10));
                }
                Segment segmentWritableSegment$okio3 = writableSegment$okio(4);
                byte[] bArr3 = segmentWritableSegment$okio3.data;
                int i13 = segmentWritableSegment$okio3.limit;
                bArr3[i13] = (byte) ((i10 >> 18) | 240);
                bArr3[i13 + 1] = (byte) (((i10 >> 12) & 63) | 128);
                bArr3[i13 + 2] = (byte) (((i10 >> 6) & 63) | 128);
                bArr3[i13 + 3] = (byte) ((i10 & 63) | 128);
                segmentWritableSegment$okio3.limit = i13 + 4;
                setSize$okio(size() + 4);
            }
        }
        return this;
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j10, long j11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        return buffer.copyTo(buffer2, j10, j11);
    }

    private final ByteString digest(String str) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance(str);
        Segment segment = this.head;
        if (segment != null) {
            byte[] bArr = segment.data;
            int i10 = segment.pos;
            messageDigest.update(bArr, i10, segment.limit - i10);
            Segment segment2 = segment.next;
            p.g(segment2);
            while (segment2 != segment) {
                byte[] bArr2 = segment2.data;
                int i11 = segment2.pos;
                messageDigest.update(bArr2, i11, segment2.limit - i11);
                segment2 = segment2.next;
                p.g(segment2);
            }
        }
        byte[] bArrDigest = messageDigest.digest();
        p.i(bArrDigest, "digest(...)");
        return new ByteString(bArrDigest);
    }

    private final ByteString hmac(String str, ByteString byteString) throws NoSuchAlgorithmException {
        try {
            Mac mac = Mac.getInstance(str);
            mac.init(new SecretKeySpec(byteString.internalArray$okio(), str));
            Segment segment = this.head;
            if (segment != null) {
                byte[] bArr = segment.data;
                int i10 = segment.pos;
                mac.update(bArr, i10, segment.limit - i10);
                Segment segment2 = segment.next;
                p.g(segment2);
                while (segment2 != segment) {
                    byte[] bArr2 = segment2.data;
                    int i11 = segment2.pos;
                    mac.update(bArr2, i11, segment2.limit - i11);
                    segment2 = segment2.next;
                    p.g(segment2);
                }
            }
            byte[] bArrDoFinal = mac.doFinal();
            p.i(bArrDoFinal, "doFinal(...)");
            return new ByteString(bArrDoFinal);
        } catch (InvalidKeyException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* JADX INFO: renamed from: -deprecated_getByte, reason: not valid java name */
    public final byte m3605deprecated_getByte(long j10) {
        return getByte(j10);
    }

    public final void clear() throws EOFException {
        skip(size());
    }

    public final long completeSegmentByteCount() {
        long size = size();
        if (size == 0) {
            return 0L;
        }
        Segment segment = this.head;
        p.g(segment);
        Segment segment2 = segment.prev;
        p.g(segment2);
        int i10 = segment2.limit;
        if (i10 < 8192 && segment2.owner) {
            size -= (long) (i10 - segment2.pos);
        }
        return size;
    }

    public final byte getByte(long j10) {
        SegmentedByteString.checkOffsetAndCount(size(), j10, 1L);
        Segment segment = this.head;
        if (segment != null) {
            if (size() - j10 < j10) {
                long size = size();
                while (size > j10) {
                    segment = segment.prev;
                    p.g(segment);
                    size -= (long) (segment.limit - segment.pos);
                }
                p.g(segment);
                return segment.data[(int) ((((long) segment.pos) + j10) - size)];
            }
            long j11 = 0;
            while (true) {
                long j12 = ((long) (segment.limit - segment.pos)) + j11;
                if (j12 <= j10) {
                    segment = segment.next;
                    p.g(segment);
                    j11 = j12;
                } else {
                    p.g(segment);
                    return segment.data[(int) ((((long) segment.pos) + j10) - j11)];
                }
            }
        } else {
            p.g(null);
            throw null;
        }
    }

    @Override // okio.BufferedSource
    public long indexOf(ByteString byteString) throws IOException {
        p.j(byteString, "bytes");
        return indexOf(byteString, 0L);
    }

    @Override // okio.BufferedSource
    public byte readByte() throws EOFException {
        if (size() != 0) {
            Segment segment = this.head;
            p.g(segment);
            int i10 = segment.pos;
            int i11 = segment.limit;
            int i12 = i10 + 1;
            byte b10 = segment.data[i10];
            setSize$okio(size() - 1);
            if (i12 == i11) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i12;
            }
            return b10;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public long readHexadecimalUnsignedLong() throws EOFException {
        int i10;
        int i11;
        if (size() != 0) {
            int i12 = 0;
            boolean z10 = false;
            long j10 = 0;
            do {
                Segment segment = this.head;
                p.g(segment);
                byte[] bArr = segment.data;
                int i13 = segment.pos;
                int i14 = segment.limit;
                while (i13 < i14) {
                    byte b10 = bArr[i13];
                    if (b10 >= 48 && b10 <= 57) {
                        i11 = b10 - 48;
                    } else {
                        if (b10 >= 97 && b10 <= 102) {
                            i10 = b10 - 97;
                        } else if (b10 >= 65 && b10 <= 70) {
                            i10 = b10 - 65;
                        } else {
                            if (i12 != 0) {
                                z10 = true;
                                break;
                            }
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + SegmentedByteString.toHexString(b10));
                        }
                        i11 = i10 + 10;
                    }
                    if (((-1152921504606846976L) & j10) == 0) {
                        j10 = (j10 << 4) | ((long) i11);
                        i13++;
                        i12++;
                    } else {
                        throw new NumberFormatException("Number too large: " + new Buffer().writeHexadecimalUnsignedLong(j10).writeByte((int) b10).readUtf8());
                    }
                }
                if (i13 == i14) {
                    this.head = segment.pop();
                    SegmentPool.recycle(segment);
                } else {
                    segment.pos = i13;
                }
                if (z10) {
                    break;
                }
            } while (this.head != null);
            setSize$okio(size() - ((long) i12));
            return j10;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public int readInt() throws EOFException {
        if (size() >= 4) {
            Segment segment = this.head;
            p.g(segment);
            int i10 = segment.pos;
            int i11 = segment.limit;
            if (i11 - i10 < 4) {
                return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
            }
            byte[] bArr = segment.data;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & 255) << 24) | ((bArr[i12] & 255) << 16);
            int i15 = i13 + 1;
            int i16 = i14 | ((bArr[i13] & 255) << 8);
            int i17 = i15 + 1;
            int i18 = i16 | (bArr[i15] & 255);
            setSize$okio(size() - 4);
            if (i17 == i11) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i17;
            }
            return i18;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public int readIntLe() throws EOFException {
        return SegmentedByteString.reverseBytes(readInt());
    }

    @Override // okio.BufferedSource
    public long readLong() throws EOFException {
        if (size() >= 8) {
            Segment segment = this.head;
            p.g(segment);
            int i10 = segment.pos;
            int i11 = segment.limit;
            if (i11 - i10 < 8) {
                return ((((long) readInt()) & 4294967295L) << 32) | (4294967295L & ((long) readInt()));
            }
            byte[] bArr = segment.data;
            int i12 = i10 + 1;
            long j10 = (((long) bArr[i10]) & 255) << 56;
            int i13 = i12 + 1;
            int i14 = i13 + 1;
            long j11 = j10 | ((((long) bArr[i12]) & 255) << 48) | ((((long) bArr[i13]) & 255) << 40);
            int i15 = i14 + 1;
            int i16 = i15 + 1;
            long j12 = j11 | ((((long) bArr[i14]) & 255) << 32) | ((((long) bArr[i15]) & 255) << 24);
            int i17 = i16 + 1;
            long j13 = j12 | ((((long) bArr[i16]) & 255) << 16);
            int i18 = i17 + 1;
            long j14 = j13 | ((((long) bArr[i17]) & 255) << 8);
            int i19 = i18 + 1;
            long j15 = j14 | (((long) bArr[i18]) & 255);
            setSize$okio(size() - 8);
            if (i19 == i11) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i19;
            }
            return j15;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public long readLongLe() throws EOFException {
        return SegmentedByteString.reverseBytes(readLong());
    }

    @Override // okio.BufferedSource
    public short readShort() throws EOFException {
        if (size() >= 2) {
            Segment segment = this.head;
            p.g(segment);
            int i10 = segment.pos;
            int i11 = segment.limit;
            if (i11 - i10 < 2) {
                return (short) (((readByte() & 255) << 8) | (readByte() & 255));
            }
            byte[] bArr = segment.data;
            int i12 = i10 + 1;
            int i13 = i12 + 1;
            int i14 = ((bArr[i10] & 255) << 8) | (bArr[i12] & 255);
            setSize$okio(size() - 2);
            if (i13 == i11) {
                this.head = segment.pop();
                SegmentPool.recycle(segment);
            } else {
                segment.pos = i13;
            }
            return (short) i14;
        }
        throw new EOFException();
    }

    @Override // okio.BufferedSource
    public short readShortLe() throws EOFException {
        return SegmentedByteString.reverseBytes(readShort());
    }

    @Override // okio.BufferedSource
    public int readUtf8CodePoint() throws EOFException {
        int i10;
        int i11;
        int i12;
        if (size() != 0) {
            byte b10 = getByte(0L);
            boolean z10 = false;
            if ((b10 & 128) == 0) {
                i10 = b10 & 127;
                i12 = 0;
                i11 = 1;
            } else if ((b10 & 224) == 192) {
                i10 = b10 & 31;
                i11 = 2;
                i12 = 128;
            } else if ((b10 & 240) == 224) {
                i10 = b10 & 15;
                i11 = 3;
                i12 = 2048;
            } else if ((b10 & 248) == 240) {
                i10 = b10 & 7;
                i11 = 4;
                i12 = 65536;
            } else {
                skip(1L);
                return 65533;
            }
            long j10 = i11;
            if (size() >= j10) {
                for (int i13 = 1; i13 < i11; i13++) {
                    long j11 = i13;
                    byte b11 = getByte(j11);
                    if ((b11 & 192) == 128) {
                        i10 = (i10 << 6) | (b11 & 63);
                    } else {
                        skip(j11);
                        return 65533;
                    }
                }
                skip(j10);
                if (i10 > 1114111) {
                    return 65533;
                }
                if (55296 <= i10 && i10 < 57344) {
                    z10 = true;
                }
                if (z10 || i10 < i12) {
                    return 65533;
                }
                return i10;
            }
            throw new EOFException("size < " + i11 + ": " + size() + " (to read code point prefixed 0x" + SegmentedByteString.toHexString(b10) + ')');
        }
        throw new EOFException();
    }

    public String toString() {
        return snapshot().toString();
    }

    @Override // okio.BufferedSink
    public Buffer writeString(String str, Charset charset) {
        p.j(str, TypedValues.Custom.S_STRING);
        p.j(charset, G5.M);
        return writeString(str, 0, str.length(), charset);
    }

    @Override // okio.BufferedSink
    public Buffer writeUtf8(String str) {
        p.j(str, TypedValues.Custom.S_STRING);
        return writeUtf8(str, 0, str.length());
    }

    public static /* synthetic */ Buffer copyTo$default(Buffer buffer, Buffer buffer2, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        return buffer.copyTo(buffer2, j10);
    }

    private final void readFrom(InputStream inputStream, long j10, boolean z10) throws IOException {
        while (true) {
            if (j10 <= 0 && !z10) {
                return;
            }
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int i10 = inputStream.read(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, (int) Math.min(j10, 8192 - segmentWritableSegment$okio.limit));
            if (i10 == -1) {
                if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
                    this.head = segmentWritableSegment$okio.pop();
                    SegmentPool.recycle(segmentWritableSegment$okio);
                }
                if (!z10) {
                    throw new EOFException();
                }
                return;
            }
            segmentWritableSegment$okio.limit += i10;
            long j11 = i10;
            this.size += j11;
            j10 -= j11;
        }
    }

    @Override // okio.BufferedSource
    public long indexOf(byte b10, long j10, long j11) {
        Segment segment;
        int i10;
        long size = 0;
        boolean z10 = false;
        if (0 <= j10 && j10 <= j11) {
            z10 = true;
        }
        if (!z10) {
            throw new IllegalArgumentException(("size=" + size() + " fromIndex=" + j10 + " toIndex=" + j11).toString());
        }
        if (j11 > size()) {
            j11 = size();
        }
        if (j10 == j11 || (segment = this.head) == null) {
            return -1L;
        }
        if (size() - j10 < j10) {
            size = size();
            while (size > j10) {
                segment = segment.prev;
                p.g(segment);
                size -= (long) (segment.limit - segment.pos);
            }
            while (size < j11) {
                byte[] bArr = segment.data;
                int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + j11) - size);
                i10 = (int) ((((long) segment.pos) + j10) - size);
                while (i10 < iMin) {
                    if (bArr[i10] != b10) {
                        i10++;
                    }
                }
                size += (long) (segment.limit - segment.pos);
                segment = segment.next;
                p.g(segment);
                j10 = size;
            }
            return -1L;
        }
        while (true) {
            long j12 = ((long) (segment.limit - segment.pos)) + size;
            if (j12 > j10) {
                break;
            }
            segment = segment.next;
            p.g(segment);
            size = j12;
        }
        while (size < j11) {
            byte[] bArr2 = segment.data;
            int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + j11) - size);
            i10 = (int) ((((long) segment.pos) + j10) - size);
            while (i10 < iMin2) {
                if (bArr2[i10] != b10) {
                    i10++;
                }
            }
            size += (long) (segment.limit - segment.pos);
            segment = segment.next;
            p.g(segment);
            j10 = size;
        }
        return -1L;
        return ((long) (i10 - segment.pos)) + size;
    }

    public final ByteString snapshot(int i10) {
        if (i10 == 0) {
            return ByteString.EMPTY;
        }
        SegmentedByteString.checkOffsetAndCount(size(), 0L, i10);
        Segment segment = this.head;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            p.g(segment);
            int i14 = segment.limit;
            int i15 = segment.pos;
            if (i14 != i15) {
                i12 += i14 - i15;
                i13++;
                segment = segment.next;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        byte[][] bArr = new byte[i13][];
        int[] iArr = new int[i13 * 2];
        Segment segment2 = this.head;
        int i16 = 0;
        while (i11 < i10) {
            p.g(segment2);
            bArr[i16] = segment2.data;
            i11 += segment2.limit - segment2.pos;
            iArr[i16] = Math.min(i11, i10);
            iArr[i16 + i13] = segment2.pos;
            segment2.shared = true;
            i16++;
            segment2 = segment2.next;
        }
        return new C4761SegmentedByteString(bArr, iArr);
    }

    @Override // okio.BufferedSink
    public Buffer writeUtf8(String str, int i10, int i11) {
        char cCharAt;
        p.j(str, TypedValues.Custom.S_STRING);
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 >= i10) {
            if (!(i11 <= str.length())) {
                throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
            }
            while (i10 < i11) {
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 < 128) {
                    Segment segmentWritableSegment$okio = writableSegment$okio(1);
                    byte[] bArr = segmentWritableSegment$okio.data;
                    int i12 = segmentWritableSegment$okio.limit - i10;
                    int iMin = Math.min(i11, 8192 - i12);
                    int i13 = i10 + 1;
                    bArr[i10 + i12] = (byte) cCharAt2;
                    while (true) {
                        i10 = i13;
                        if (i10 >= iMin || (cCharAt = str.charAt(i10)) >= 128) {
                            break;
                        }
                        i13 = i10 + 1;
                        bArr[i10 + i12] = (byte) cCharAt;
                    }
                    int i14 = segmentWritableSegment$okio.limit;
                    int i15 = (i12 + i10) - i14;
                    segmentWritableSegment$okio.limit = i14 + i15;
                    setSize$okio(size() + ((long) i15));
                } else {
                    if (cCharAt2 < 2048) {
                        Segment segmentWritableSegment$okio2 = writableSegment$okio(2);
                        byte[] bArr2 = segmentWritableSegment$okio2.data;
                        int i16 = segmentWritableSegment$okio2.limit;
                        bArr2[i16] = (byte) ((cCharAt2 >> 6) | 192);
                        bArr2[i16 + 1] = (byte) ((cCharAt2 & '?') | 128);
                        segmentWritableSegment$okio2.limit = i16 + 2;
                        setSize$okio(size() + 2);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i17 = i10 + 1;
                        char cCharAt3 = i17 < i11 ? str.charAt(i17) : (char) 0;
                        if (cCharAt2 <= 56319) {
                            if (56320 <= cCharAt3 && cCharAt3 < 57344) {
                                int i18 = (((cCharAt2 & 1023) << 10) | (cCharAt3 & 1023)) + 65536;
                                Segment segmentWritableSegment$okio3 = writableSegment$okio(4);
                                byte[] bArr3 = segmentWritableSegment$okio3.data;
                                int i19 = segmentWritableSegment$okio3.limit;
                                bArr3[i19] = (byte) ((i18 >> 18) | 240);
                                bArr3[i19 + 1] = (byte) (((i18 >> 12) & 63) | 128);
                                bArr3[i19 + 2] = (byte) (((i18 >> 6) & 63) | 128);
                                bArr3[i19 + 3] = (byte) ((i18 & 63) | 128);
                                segmentWritableSegment$okio3.limit = i19 + 4;
                                setSize$okio(size() + 4);
                                i10 += 2;
                            }
                        }
                        writeByte(63);
                        i10 = i17;
                    } else {
                        Segment segmentWritableSegment$okio4 = writableSegment$okio(3);
                        byte[] bArr4 = segmentWritableSegment$okio4.data;
                        int i20 = segmentWritableSegment$okio4.limit;
                        bArr4[i20] = (byte) ((cCharAt2 >> '\f') | 224);
                        bArr4[i20 + 1] = (byte) ((63 & (cCharAt2 >> 6)) | 128);
                        bArr4[i20 + 2] = (byte) ((cCharAt2 & '?') | 128);
                        segmentWritableSegment$okio4.limit = i20 + 3;
                        setSize$okio(size() + 3);
                    }
                    i10++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
    }

    @Override // okio.BufferedSource
    public void readFully(byte[] bArr) throws EOFException {
        p.j(bArr, "sink");
        int i10 = 0;
        while (i10 < bArr.length) {
            int i11 = read(bArr, i10, bArr.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    @Override // okio.BufferedSink
    public Buffer writeString(String str, int i10, int i11, Charset charset) {
        p.j(str, TypedValues.Custom.S_STRING);
        p.j(charset, G5.M);
        if (!(i10 >= 0)) {
            throw new IllegalArgumentException(("beginIndex < 0: " + i10).toString());
        }
        if (i11 >= i10) {
            if (i11 <= str.length()) {
                if (p.e(charset, c.f63591b)) {
                    return writeUtf8(str, i10, i11);
                }
                String strSubstring = str.substring(i10, i11);
                p.i(strSubstring, "substring(...)");
                byte[] bytes = strSubstring.getBytes(charset);
                p.i(bytes, "getBytes(...)");
                return write(bytes, 0, bytes.length);
            }
            throw new IllegalArgumentException(("endIndex > string.length: " + i11 + " > " + str.length()).toString());
        }
        throw new IllegalArgumentException(("endIndex < beginIndex: " + i11 + " < " + i10).toString());
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        p.j(byteBuffer, "source");
        int iRemaining = byteBuffer.remaining();
        int i10 = iRemaining;
        while (i10 > 0) {
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int iMin = Math.min(i10, 8192 - segmentWritableSegment$okio.limit);
            byteBuffer.get(segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, iMin);
            i10 -= iMin;
            segmentWritableSegment$okio.limit += iMin;
        }
        this.size += (long) iRemaining;
        return iRemaining;
    }

    @Override // okio.BufferedSource
    public int read(byte[] bArr) {
        p.j(bArr, "sink");
        return read(bArr, 0, bArr.length);
    }

    public final Buffer copyTo(Buffer buffer, long j10) {
        p.j(buffer, "out");
        return copyTo(buffer, j10, this.size - j10);
    }

    @Override // okio.BufferedSource
    public int read(byte[] bArr, int i10, int i11) {
        p.j(bArr, "sink");
        SegmentedByteString.checkOffsetAndCount(bArr.length, i10, i11);
        Segment segment = this.head;
        if (segment == null) {
            return -1;
        }
        int iMin = Math.min(i11, segment.limit - segment.pos);
        byte[] bArr2 = segment.data;
        int i12 = segment.pos;
        l.g(bArr2, bArr, i10, i12, i12 + iMin);
        segment.pos += iMin;
        setSize$okio(size() - ((long) iMin));
        if (segment.pos == segment.limit) {
            this.head = segment.pop();
            SegmentPool.recycle(segment);
        }
        return iMin;
    }

    public final Buffer copyTo(Buffer buffer, long j10, long j11) {
        p.j(buffer, "out");
        SegmentedByteString.checkOffsetAndCount(size(), j10, j11);
        if (j11 != 0) {
            buffer.setSize$okio(buffer.size() + j11);
            Segment segment = this.head;
            while (true) {
                p.g(segment);
                int i10 = segment.limit;
                int i11 = segment.pos;
                if (j10 < i10 - i11) {
                    break;
                }
                j10 -= (long) (i10 - i11);
                segment = segment.next;
            }
            while (j11 > 0) {
                p.g(segment);
                Segment segmentSharedCopy = segment.sharedCopy();
                int i12 = segmentSharedCopy.pos + ((int) j10);
                segmentSharedCopy.pos = i12;
                segmentSharedCopy.limit = Math.min(i12 + ((int) j11), segmentSharedCopy.limit);
                Segment segment2 = buffer.head;
                if (segment2 == null) {
                    segmentSharedCopy.prev = segmentSharedCopy;
                    segmentSharedCopy.next = segmentSharedCopy;
                    buffer.head = segmentSharedCopy;
                } else {
                    p.g(segment2);
                    Segment segment3 = segment2.prev;
                    p.g(segment3);
                    segment3.push(segmentSharedCopy);
                }
                j11 -= (long) (segmentSharedCopy.limit - segmentSharedCopy.pos);
                segment = segment.next;
                j10 = 0;
            }
        }
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer write(ByteString byteString) {
        p.j(byteString, "byteString");
        byteString.write$okio(this, 0, byteString.size());
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer write(ByteString byteString, int i10, int i11) {
        p.j(byteString, "byteString");
        byteString.write$okio(this, i10, i11);
        return this;
    }

    @Override // okio.BufferedSink
    public Buffer write(byte[] bArr) {
        p.j(bArr, "source");
        return write(bArr, 0, bArr.length);
    }

    @Override // okio.BufferedSink
    public Buffer write(byte[] bArr, int i10, int i11) {
        p.j(bArr, "source");
        long j10 = i11;
        SegmentedByteString.checkOffsetAndCount(bArr.length, i10, j10);
        int i12 = i11 + i10;
        while (i10 < i12) {
            Segment segmentWritableSegment$okio = writableSegment$okio(1);
            int iMin = Math.min(i12 - i10, 8192 - segmentWritableSegment$okio.limit);
            int i13 = i10 + iMin;
            l.g(bArr, segmentWritableSegment$okio.data, segmentWritableSegment$okio.limit, i10, i13);
            segmentWritableSegment$okio.limit += iMin;
            i10 = i13;
        }
        setSize$okio(size() + j10);
        return this;
    }

    @Override // okio.Source
    public long read(Buffer buffer, long j10) {
        p.j(buffer, "sink");
        if (!(j10 >= 0)) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (size() == 0) {
            return -1L;
        }
        if (j10 > size()) {
            j10 = size();
        }
        buffer.write(this, j10);
        return j10;
    }

    @Override // okio.BufferedSink
    public Buffer write(Source source, long j10) throws IOException {
        p.j(source, "source");
        while (j10 > 0) {
            long j11 = source.read(this, j10);
            if (j11 == -1) {
                throw new EOFException();
            }
            j10 -= j11;
        }
        return this;
    }

    @Override // okio.BufferedSource
    public long indexOf(ByteString byteString, long j10) throws IOException {
        long j11 = j10;
        p.j(byteString, "bytes");
        if (!(byteString.size() > 0)) {
            throw new IllegalArgumentException("bytes is empty".toString());
        }
        long j12 = 0;
        if (j11 >= 0) {
            Segment segment = this.head;
            if (segment != null) {
                if (size() - j11 < j11) {
                    long size = size();
                    while (size > j11) {
                        segment = segment.prev;
                        p.g(segment);
                        size -= (long) (segment.limit - segment.pos);
                    }
                    byte[] bArrInternalArray$okio = byteString.internalArray$okio();
                    byte b10 = bArrInternalArray$okio[0];
                    int size2 = byteString.size();
                    long size3 = (size() - ((long) size2)) + 1;
                    while (size < size3) {
                        byte[] bArr = segment.data;
                        long j13 = size;
                        int iMin = (int) Math.min(segment.limit, (((long) segment.pos) + size3) - size);
                        for (int i10 = (int) ((((long) segment.pos) + j11) - j13); i10 < iMin; i10++) {
                            if (bArr[i10] == b10 && okio.internal.Buffer.rangeEquals(segment, i10 + 1, bArrInternalArray$okio, 1, size2)) {
                                return ((long) (i10 - segment.pos)) + j13;
                            }
                        }
                        size = j13 + ((long) (segment.limit - segment.pos));
                        segment = segment.next;
                        p.g(segment);
                        j11 = size;
                    }
                } else {
                    while (true) {
                        long j14 = ((long) (segment.limit - segment.pos)) + j12;
                        if (j14 > j11) {
                            break;
                        }
                        segment = segment.next;
                        p.g(segment);
                        j12 = j14;
                    }
                    byte[] bArrInternalArray$okio2 = byteString.internalArray$okio();
                    byte b11 = bArrInternalArray$okio2[0];
                    int size4 = byteString.size();
                    long size5 = (size() - ((long) size4)) + 1;
                    while (j12 < size5) {
                        byte[] bArr2 = segment.data;
                        long j15 = size5;
                        int iMin2 = (int) Math.min(segment.limit, (((long) segment.pos) + size5) - j12);
                        for (int i11 = (int) ((((long) segment.pos) + j11) - j12); i11 < iMin2; i11++) {
                            if (bArr2[i11] == b11 && okio.internal.Buffer.rangeEquals(segment, i11 + 1, bArrInternalArray$okio2, 1, size4)) {
                                return ((long) (i11 - segment.pos)) + j12;
                            }
                        }
                        j12 += (long) (segment.limit - segment.pos);
                        segment = segment.next;
                        p.g(segment);
                        j11 = j12;
                        size5 = j15;
                    }
                }
            }
            return -1L;
        }
        throw new IllegalArgumentException(("fromIndex < 0: " + j11).toString());
    }

    @Override // okio.Sink
    public void write(Buffer buffer, long j10) {
        Segment segment;
        p.j(buffer, "source");
        if (buffer != this) {
            SegmentedByteString.checkOffsetAndCount(buffer.size(), 0L, j10);
            while (j10 > 0) {
                Segment segment2 = buffer.head;
                p.g(segment2);
                int i10 = segment2.limit;
                Segment segment3 = buffer.head;
                p.g(segment3);
                if (j10 < i10 - segment3.pos) {
                    Segment segment4 = this.head;
                    if (segment4 != null) {
                        p.g(segment4);
                        segment = segment4.prev;
                    } else {
                        segment = null;
                    }
                    if (segment != null && segment.owner) {
                        if ((((long) segment.limit) + j10) - ((long) (segment.shared ? 0 : segment.pos)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                            Segment segment5 = buffer.head;
                            p.g(segment5);
                            segment5.writeTo(segment, (int) j10);
                            buffer.setSize$okio(buffer.size() - j10);
                            setSize$okio(size() + j10);
                            return;
                        }
                    }
                    Segment segment6 = buffer.head;
                    p.g(segment6);
                    buffer.head = segment6.split((int) j10);
                }
                Segment segment7 = buffer.head;
                p.g(segment7);
                long j11 = segment7.limit - segment7.pos;
                buffer.head = segment7.pop();
                Segment segment8 = this.head;
                if (segment8 == null) {
                    this.head = segment7;
                    segment7.prev = segment7;
                    segment7.next = segment7;
                } else {
                    p.g(segment8);
                    Segment segment9 = segment8.prev;
                    p.g(segment9);
                    segment9.push(segment7).compact();
                }
                buffer.setSize$okio(buffer.size() - j11);
                setSize$okio(size() + j11);
                j10 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this".toString());
    }
}
