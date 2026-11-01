package com.pgl.ssdk;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* JADX INFO: loaded from: classes10.dex */
public class m implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final FileChannel f43308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f43309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f43310c;

    private static void a(long j10, long j11, long j12) {
        if (j10 < 0) {
            throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j10)));
        }
        if (j11 < 0) {
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j11)));
        }
        if (j10 > j12) {
            throw new IndexOutOfBoundsException("offset (" + j10 + ") > source size (" + j12 + ")");
        }
        long j13 = j10 + j11;
        if (j13 < j10) {
            throw new IndexOutOfBoundsException("offset (" + j10 + ") + size (" + j11 + ") overflow");
        }
        if (j13 <= j12) {
            return;
        }
        throw new IndexOutOfBoundsException("offset (" + j10 + ") + size (" + j11 + ") > source size (" + j12 + ")");
    }

    public m(FileChannel fileChannel, long j10, long j11) {
        if (j10 >= 0) {
            if (j11 >= 0) {
                this.f43308a = fileChannel;
                this.f43309b = j10;
                this.f43310c = j11;
                return;
            }
            throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(j11)));
        }
        throw new IndexOutOfBoundsException("offset: ".concat(String.valueOf(j11)));
    }

    @Override // com.pgl.ssdk.q
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public m a(long j10, long j11) {
        long jA = a();
        a(j10, j11, jA);
        if (j10 == 0 && j11 == jA) {
            return this;
        }
        return new m(this.f43308a, this.f43309b + j10, j11);
    }

    @Override // com.pgl.ssdk.q
    public long a() {
        long j10 = this.f43310c;
        if (j10 != -1) {
            return j10;
        }
        try {
            return this.f43308a.size();
        } catch (IOException unused) {
            return 0L;
        }
    }

    public void a(long j10, int i10, ByteBuffer byteBuffer) throws IOException {
        int i11;
        a(j10, i10, a());
        if (i10 == 0) {
            return;
        }
        if (i10 <= byteBuffer.remaining()) {
            long j11 = this.f43309b + j10;
            int iLimit = byteBuffer.limit();
            try {
                byteBuffer.limit(byteBuffer.position() + i10);
                while (i10 > 0) {
                    synchronized (this.f43308a) {
                        this.f43308a.position(j11);
                        i11 = this.f43308a.read(byteBuffer);
                    }
                    j11 += (long) i11;
                    i10 -= i11;
                }
                byteBuffer.limit(iLimit);
                return;
            } catch (Throwable th2) {
                byteBuffer.limit(iLimit);
                throw th2;
            }
        }
        throw new BufferOverflowException();
    }

    @Override // com.pgl.ssdk.q
    public ByteBuffer a(long j10, int i10) throws IOException {
        if (i10 >= 0) {
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(i10);
            a(j10, i10, byteBufferAllocate);
            byteBufferAllocate.flip();
            return byteBufferAllocate;
        }
        throw new IndexOutOfBoundsException("size: ".concat(String.valueOf(i10)));
    }
}
