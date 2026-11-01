package com.squareup.picasso;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes9.dex */
final class MarkableInputStream extends InputStream {
    private static final int DEFAULT_BUFFER_SIZE = 4096;
    private static final int DEFAULT_LIMIT_INCREMENT = 1024;
    private boolean allowExpire;
    private long defaultMark;

    /* JADX INFO: renamed from: in, reason: collision with root package name */
    private final InputStream f45170in;
    private long limit;
    private int limitIncrement;
    private long offset;
    private long reset;

    public MarkableInputStream(InputStream inputStream) {
        this(inputStream, 4096);
    }

    private void skip(long j10, long j11) throws IOException {
        while (j10 < j11) {
            long jSkip = this.f45170in.skip(j11 - j10);
            if (jSkip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    jSkip = 1;
                }
            }
            j10 += jSkip;
        }
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (!this.allowExpire) {
            long j10 = this.offset + 1;
            long j11 = this.limit;
            if (j10 > j11) {
                setLimit(j11 + ((long) this.limitIncrement));
            }
        }
        int i10 = this.f45170in.read();
        if (i10 != -1) {
            this.offset++;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public void reset() throws IOException {
        reset(this.defaultMark);
    }

    public MarkableInputStream(InputStream inputStream, int i10) {
        this(inputStream, i10, 1024);
    }

    private void setLimit(long j10) {
        try {
            long j11 = this.reset;
            long j12 = this.offset;
            if (j11 >= j12 || j12 > this.limit) {
                this.reset = j12;
                this.f45170in.mark((int) (j10 - j12));
            } else {
                this.f45170in.reset();
                this.f45170in.mark((int) (j10 - this.reset));
                skip(this.reset, this.offset);
            }
            this.limit = j10;
        } catch (IOException e10) {
            throw new IllegalStateException("Unable to mark: " + e10);
        }
    }

    public void allowMarksToExpire(boolean z10) {
        this.allowExpire = z10;
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        return this.f45170in.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f45170in.close();
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f45170in.markSupported();
    }

    public void reset(long j10) throws IOException {
        if (this.offset > this.limit || j10 < this.reset) {
            throw new IOException("Cannot reset");
        }
        this.f45170in.reset();
        skip(this.reset, j10);
        this.offset = j10;
    }

    public long savePosition(int i10) {
        long j10 = this.offset + ((long) i10);
        if (this.limit < j10) {
            setLimit(j10);
        }
        return this.offset;
    }

    private MarkableInputStream(InputStream inputStream, int i10, int i11) {
        this.defaultMark = -1L;
        this.allowExpire = true;
        this.limitIncrement = -1;
        this.f45170in = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, i10);
        this.limitIncrement = i11;
    }

    @Override // java.io.InputStream
    public void mark(int i10) {
        this.defaultMark = savePosition(i10);
    }

    @Override // java.io.InputStream
    public long skip(long j10) throws IOException {
        if (!this.allowExpire) {
            long j11 = this.offset;
            if (j11 + j10 > this.limit) {
                setLimit(j11 + j10 + ((long) this.limitIncrement));
            }
        }
        long jSkip = this.f45170in.skip(j10);
        this.offset += jSkip;
        return jSkip;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        if (!this.allowExpire) {
            long j10 = this.offset;
            if (((long) bArr.length) + j10 > this.limit) {
                setLimit(j10 + ((long) bArr.length) + ((long) this.limitIncrement));
            }
        }
        int i10 = this.f45170in.read(bArr);
        if (i10 != -1) {
            this.offset += (long) i10;
        }
        return i10;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.allowExpire) {
            long j10 = this.offset;
            long j11 = i11;
            if (j10 + j11 > this.limit) {
                setLimit(j10 + j11 + ((long) this.limitIncrement));
            }
        }
        int i12 = this.f45170in.read(bArr, i10, i11);
        if (i12 != -1) {
            this.offset += (long) i12;
        }
        return i12;
    }
}
