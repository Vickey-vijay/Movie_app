package com.mbridge.msdk.thrid.okio;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.annotation.Nullable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.channels.ByteChannel;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: Buffer.java */
/* JADX INFO: loaded from: classes.dex */
public final class c implements e, d, Cloneable, ByteChannel {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final byte[] f38035c = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public o f38036a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f38037b;

    /* JADX INFO: compiled from: Buffer.java */
    public class a extends InputStream {
        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.InputStream
        public int read() {
            c cVar = c.this;
            if (cVar.f38037b > 0) {
                return cVar.readByte() & 255;
            }
            return -1;
        }

        public a() {
        }

        @Override // java.io.InputStream
        public int available() {
            return (int) Math.min(c.this.f38037b, 2147483647L);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) {
            return c.this.read(bArr, i10, i11);
        }

        public String toString() {
            return c.this + ".inputStream()";
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.e, com.mbridge.msdk.thrid.okio.d
    public c a() {
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public f b(long j10) throws EOFException {
        return new f(c(j10));
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String c() throws EOFException {
        return d(Long.MAX_VALUE);
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String d(long j10) throws EOFException {
        if (j10 < 0) {
            throw new IllegalArgumentException("limit < 0: " + j10);
        }
        long j11 = j10 != Long.MAX_VALUE ? j10 + 1 : Long.MAX_VALUE;
        long jA = a((byte) 10, 0L, j11);
        if (jA != -1) {
            return h(jA);
        }
        if (j11 < size() && f(j11 - 1) == 13 && f(j11) == 10) {
            return h(j11);
        }
        c cVar = new c();
        a(cVar, 0L, Math.min(32L, size()));
        throw new EOFException("\\n not found: limit=" + Math.min(size(), j10) + " content=" + cVar.o().g() + (char) 8230);
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void e(long j10) throws EOFException {
        if (this.f38037b < j10) {
            throw new EOFException();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        long j10 = this.f38037b;
        if (j10 != cVar.f38037b) {
            return false;
        }
        long j11 = 0;
        if (j10 == 0) {
            return true;
        }
        o oVar = this.f38036a;
        o oVar2 = cVar.f38036a;
        int i10 = oVar.f38070b;
        int i11 = oVar2.f38070b;
        while (j11 < this.f38037b) {
            long jMin = Math.min(oVar.f38071c - i10, oVar2.f38071c - i11);
            int i12 = 0;
            while (i12 < jMin) {
                int i13 = i10 + 1;
                int i14 = i11 + 1;
                if (oVar.f38069a[i10] != oVar2.f38069a[i11]) {
                    return false;
                }
                i12++;
                i10 = i13;
                i11 = i14;
            }
            if (i10 == oVar.f38071c) {
                oVar = oVar.f38074f;
                i10 = oVar.f38070b;
            }
            if (i11 == oVar2.f38071c) {
                oVar2 = oVar2.f38074f;
                i11 = oVar2.f38070b;
            }
            j11 += jMin;
        }
        return true;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public boolean f() {
        return this.f38037b == 0;
    }

    @Override // com.mbridge.msdk.thrid.okio.d, com.mbridge.msdk.thrid.okio.r, java.io.Flushable
    public void flush() {
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public short g() {
        return u.a(readShort());
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public long i() {
        int i10;
        int i11;
        if (this.f38037b == 0) {
            throw new IllegalStateException("size == 0");
        }
        int i12 = 0;
        boolean z10 = false;
        long j10 = 0;
        do {
            o oVar = this.f38036a;
            byte[] bArr = oVar.f38069a;
            int i13 = oVar.f38070b;
            int i14 = oVar.f38071c;
            while (i13 < i14) {
                byte b10 = bArr[i13];
                if (b10 < 48 || b10 > 57) {
                    if (b10 >= 97 && b10 <= 102) {
                        i10 = b10 - 97;
                    } else {
                        if (b10 < 65 || b10 > 70) {
                            if (i12 != 0) {
                                z10 = true;
                                break;
                            }
                            throw new NumberFormatException("Expected leading [0-9a-fA-F] character but was 0x" + Integer.toHexString(b10));
                        }
                        i10 = b10 - 65;
                    }
                    i11 = i10 + 10;
                } else {
                    i11 = b10 - 48;
                }
                if (((-1152921504606846976L) & j10) != 0) {
                    throw new NumberFormatException("Number too large: " + new c().a(j10).writeByte((int) b10).p());
                }
                j10 = (j10 << 4) | ((long) i11);
                i13++;
                i12++;
            }
            if (i13 == i14) {
                this.f38036a = oVar.b();
                p.a(oVar);
            } else {
                oVar.f38070b = i13;
            }
            if (z10) {
                break;
            }
        } while (this.f38036a != null);
        this.f38037b -= (long) i12;
        return j10;
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return true;
    }

    public int read(byte[] bArr, int i10, int i11) {
        u.a(bArr.length, i10, i11);
        o oVar = this.f38036a;
        if (oVar == null) {
            return -1;
        }
        int iMin = Math.min(i11, oVar.f38071c - oVar.f38070b);
        System.arraycopy(oVar.f38069a, oVar.f38070b, bArr, i10, iMin);
        int i12 = oVar.f38070b + iMin;
        oVar.f38070b = i12;
        this.f38037b -= (long) iMin;
        if (i12 == oVar.f38071c) {
            this.f38036a = oVar.b();
            p.a(oVar);
        }
        return iMin;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void readFully(byte[] bArr) throws EOFException {
        int i10 = 0;
        while (i10 < bArr.length) {
            int i11 = read(bArr, i10, bArr.length - i10);
            if (i11 == -1) {
                throw new EOFException();
            }
            i10 += i11;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public c a(String str) {
        return a(str, 0, str.length());
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public byte[] c(long j10) throws EOFException {
        u.a(this.f38037b, 0L, j10);
        if (j10 <= 2147483647L) {
            byte[] bArr = new byte[(int) j10];
            readFully(bArr);
            return bArr;
        }
        throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j10);
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public int e() {
        return u.a(readInt());
    }

    public final byte f(long j10) {
        u.a(this.f38037b, j10, 1L);
        long j11 = this.f38037b;
        if (j11 - j10 > j10) {
            o oVar = this.f38036a;
            while (true) {
                int i10 = oVar.f38071c;
                int i11 = oVar.f38070b;
                long j12 = i10 - i11;
                if (j10 < j12) {
                    return oVar.f38069a[i11 + ((int) j10)];
                }
                j10 -= j12;
                oVar = oVar.f38074f;
            }
        } else {
            long j13 = j10 - j11;
            o oVar2 = this.f38036a.f38075g;
            while (true) {
                int i12 = oVar2.f38071c;
                int i13 = oVar2.f38070b;
                j13 += (long) (i12 - i13);
                if (j13 >= 0) {
                    return oVar2.f38069a[i13 + ((int) j13)];
                }
                oVar2 = oVar2.f38075g;
            }
        }
    }

    public String g(long j10) throws EOFException {
        return a(j10, u.f38084a);
    }

    public String h(long j10) throws EOFException {
        if (j10 > 0) {
            long j11 = j10 - 1;
            if (f(j11) == 13) {
                String strG = g(j11);
                skip(2L);
                return strG;
            }
        }
        String strG2 = g(j10);
        skip(1L);
        return strG2;
    }

    public int hashCode() {
        o oVar = this.f38036a;
        if (oVar == null) {
            return 0;
        }
        int i10 = 1;
        do {
            int i11 = oVar.f38071c;
            for (int i12 = oVar.f38070b; i12 < i11; i12++) {
                i10 = (i10 * 31) + oVar.f38069a[i12];
            }
            oVar = oVar.f38074f;
        } while (oVar != this.f38036a);
        return i10;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public InputStream j() {
        return new a();
    }

    public final void k() {
        try {
            skip(this.f38037b);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public c clone() {
        c cVar = new c();
        if (this.f38037b == 0) {
            return cVar;
        }
        o oVarC = this.f38036a.c();
        cVar.f38036a = oVarC;
        oVarC.f38075g = oVarC;
        oVarC.f38074f = oVarC;
        for (o oVar = this.f38036a.f38074f; oVar != this.f38036a; oVar = oVar.f38074f) {
            cVar.f38036a.f38075g.a(oVar.c());
        }
        cVar.f38037b = this.f38037b;
        return cVar;
    }

    public final long m() {
        long j10 = this.f38037b;
        if (j10 == 0) {
            return 0L;
        }
        o oVar = this.f38036a.f38075g;
        int i10 = oVar.f38071c;
        return (i10 >= 8192 || !oVar.f38073e) ? j10 : j10 - ((long) (i10 - oVar.f38070b));
    }

    public byte[] n() {
        try {
            return c(this.f38037b);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public f o() {
        return new f(n());
    }

    public String p() {
        try {
            return a(this.f38037b, u.f38084a);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    public final f q() {
        long j10 = this.f38037b;
        if (j10 <= 2147483647L) {
            return a((int) j10);
        }
        throw new IllegalArgumentException("size > Integer.MAX_VALUE: " + this.f38037b);
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public byte readByte() {
        long j10 = this.f38037b;
        if (j10 == 0) {
            throw new IllegalStateException("size == 0");
        }
        o oVar = this.f38036a;
        int i10 = oVar.f38070b;
        int i11 = oVar.f38071c;
        int i12 = i10 + 1;
        byte b10 = oVar.f38069a[i10];
        this.f38037b = j10 - 1;
        if (i12 == i11) {
            this.f38036a = oVar.b();
            p.a(oVar);
        } else {
            oVar.f38070b = i12;
        }
        return b10;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public int readInt() {
        long j10 = this.f38037b;
        if (j10 < 4) {
            throw new IllegalStateException("size < 4: " + this.f38037b);
        }
        o oVar = this.f38036a;
        int i10 = oVar.f38070b;
        int i11 = oVar.f38071c;
        if (i11 - i10 < 4) {
            return ((readByte() & 255) << 24) | ((readByte() & 255) << 16) | ((readByte() & 255) << 8) | (readByte() & 255);
        }
        byte[] bArr = oVar.f38069a;
        int i12 = i10 + 1;
        int i13 = i12 + 1;
        int i14 = ((bArr[i10] & 255) << 24) | ((bArr[i12] & 255) << 16);
        int i15 = i13 + 1;
        int i16 = i14 | ((bArr[i13] & 255) << 8);
        int i17 = i15 + 1;
        int i18 = i16 | (bArr[i15] & 255);
        this.f38037b = j10 - 4;
        if (i17 == i11) {
            this.f38036a = oVar.b();
            p.a(oVar);
        } else {
            oVar.f38070b = i17;
        }
        return i18;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public short readShort() {
        long j10 = this.f38037b;
        if (j10 < 2) {
            throw new IllegalStateException("size < 2: " + this.f38037b);
        }
        o oVar = this.f38036a;
        int i10 = oVar.f38070b;
        int i11 = oVar.f38071c;
        if (i11 - i10 < 2) {
            return (short) (((readByte() & 255) << 8) | (readByte() & 255));
        }
        byte[] bArr = oVar.f38069a;
        int i12 = i10 + 1;
        int i13 = i12 + 1;
        int i14 = ((bArr[i10] & 255) << 8) | (bArr[i12] & 255);
        this.f38037b = j10 - 2;
        if (i13 == i11) {
            this.f38036a = oVar.b();
            p.a(oVar);
        } else {
            oVar.f38070b = i13;
        }
        return (short) i14;
    }

    public final long size() {
        return this.f38037b;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void skip(long j10) throws EOFException {
        while (j10 > 0) {
            o oVar = this.f38036a;
            if (oVar == null) {
                throw new EOFException();
            }
            int iMin = (int) Math.min(j10, oVar.f38071c - oVar.f38070b);
            long j11 = iMin;
            this.f38037b -= j11;
            j10 -= j11;
            o oVar2 = this.f38036a;
            int i10 = oVar2.f38070b + iMin;
            oVar2.f38070b = i10;
            if (i10 == oVar2.f38071c) {
                this.f38036a = oVar2.b();
                p.a(oVar2);
            }
        }
    }

    public final c a(c cVar, long j10, long j11) {
        if (cVar != null) {
            u.a(this.f38037b, j10, j11);
            if (j11 == 0) {
                return this;
            }
            cVar.f38037b += j11;
            o oVar = this.f38036a;
            while (true) {
                long j12 = oVar.f38071c - oVar.f38070b;
                if (j10 < j12) {
                    break;
                }
                j10 -= j12;
                oVar = oVar.f38074f;
            }
            while (j11 > 0) {
                o oVarC = oVar.c();
                int i10 = (int) (((long) oVarC.f38070b) + j10);
                oVarC.f38070b = i10;
                oVarC.f38071c = Math.min(i10 + ((int) j11), oVarC.f38071c);
                o oVar2 = cVar.f38036a;
                if (oVar2 == null) {
                    oVarC.f38075g = oVarC;
                    oVarC.f38074f = oVarC;
                    cVar.f38036a = oVarC;
                } else {
                    oVar2.f38075g.a(oVarC);
                }
                j11 -= (long) (oVarC.f38071c - oVarC.f38070b);
                oVar = oVar.f38074f;
                j10 = 0;
            }
            return this;
        }
        throw new IllegalArgumentException("out == null");
    }

    public o b(int i10) {
        if (i10 >= 1 && i10 <= 8192) {
            o oVar = this.f38036a;
            if (oVar == null) {
                o oVarA = p.a();
                this.f38036a = oVarA;
                oVarA.f38075g = oVarA;
                oVarA.f38074f = oVarA;
                return oVarA;
            }
            o oVar2 = oVar.f38075g;
            return (oVar2.f38071c + i10 > 8192 || !oVar2.f38073e) ? oVar2.a(p.a()) : oVar2;
        }
        throw new IllegalArgumentException();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public c writeShort(int i10) {
        o oVarB = b(2);
        byte[] bArr = oVarB.f38069a;
        int i11 = oVarB.f38071c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 8) & 255);
        bArr[i12] = (byte) (i10 & 255);
        oVarB.f38071c = i12 + 1;
        this.f38037b += 2;
        return this;
    }

    public String toString() {
        return q().toString();
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer != null) {
            int iRemaining = byteBuffer.remaining();
            int i10 = iRemaining;
            while (i10 > 0) {
                o oVarB = b(1);
                int iMin = Math.min(i10, 8192 - oVarB.f38071c);
                byteBuffer.get(oVarB.f38069a, oVarB.f38071c, iMin);
                i10 -= iMin;
                oVarB.f38071c += iMin;
            }
            this.f38037b += (long) iRemaining;
            return iRemaining;
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public c writeByte(int i10) {
        o oVarB = b(1);
        byte[] bArr = oVarB.f38069a;
        int i11 = oVarB.f38071c;
        oVarB.f38071c = i11 + 1;
        bArr[i11] = (byte) i10;
        this.f38037b++;
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public long b(c cVar, long j10) {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j10 >= 0) {
            long j11 = this.f38037b;
            if (j11 == 0) {
                return -1L;
            }
            if (j10 > j11) {
                j10 = j11;
            }
            cVar.a(this, j10);
            return j10;
        }
        throw new IllegalArgumentException("byteCount < 0: " + j10);
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        o oVar = this.f38036a;
        if (oVar == null) {
            return -1;
        }
        int iMin = Math.min(byteBuffer.remaining(), oVar.f38071c - oVar.f38070b);
        byteBuffer.put(oVar.f38069a, oVar.f38070b, iMin);
        int i10 = oVar.f38070b + iMin;
        oVar.f38070b = i10;
        this.f38037b -= (long) iMin;
        if (i10 == oVar.f38071c) {
            this.f38036a = oVar.b();
            p.a(oVar);
        }
        return iMin;
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public c writeInt(int i10) {
        o oVarB = b(4);
        byte[] bArr = oVarB.f38069a;
        int i11 = oVarB.f38071c;
        int i12 = i11 + 1;
        bArr[i11] = (byte) ((i10 >>> 24) & 255);
        int i13 = i12 + 1;
        bArr[i12] = (byte) ((i10 >>> 16) & 255);
        int i14 = i13 + 1;
        bArr[i13] = (byte) ((i10 >>> 8) & 255);
        bArr[i14] = (byte) (i10 & 255);
        oVarB.f38071c = i14 + 1;
        this.f38037b += 4;
        return this;
    }

    public c f(int i10) {
        if (i10 < 128) {
            writeByte(i10);
        } else if (i10 < 2048) {
            writeByte((i10 >> 6) | 192);
            writeByte((i10 & 63) | 128);
        } else if (i10 < 65536) {
            if (i10 >= 55296 && i10 <= 57343) {
                writeByte(63);
            } else {
                writeByte((i10 >> 12) | 224);
                writeByte(((i10 >> 6) & 63) | 128);
                writeByte((i10 & 63) | 128);
            }
        } else if (i10 <= 1114111) {
            writeByte((i10 >> 18) | 240);
            writeByte(((i10 >> 12) & 63) | 128);
            writeByte(((i10 >> 6) & 63) | 128);
            writeByte((i10 & 63) | 128);
        } else {
            throw new IllegalArgumentException("Unexpected code point: " + Integer.toHexString(i10));
        }
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return t.f38080d;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String a(Charset charset) {
        try {
            return a(this.f38037b, charset);
        } catch (EOFException e10) {
            throw new AssertionError(e10);
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public c a(long j10) {
        if (j10 == 0) {
            return writeByte(48);
        }
        int iNumberOfTrailingZeros = (Long.numberOfTrailingZeros(Long.highestOneBit(j10)) / 4) + 1;
        o oVarB = b(iNumberOfTrailingZeros);
        byte[] bArr = oVarB.f38069a;
        int i10 = oVarB.f38071c;
        for (int i11 = (i10 + iNumberOfTrailingZeros) - 1; i11 >= i10; i11--) {
            bArr[i11] = f38035c[(int) (15 & j10)];
            j10 >>>= 4;
        }
        oVarB.f38071c += iNumberOfTrailingZeros;
        this.f38037b += (long) iNumberOfTrailingZeros;
        return this;
    }

    public String a(long j10, Charset charset) throws EOFException {
        u.a(this.f38037b, 0L, j10);
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        if (j10 > 2147483647L) {
            throw new IllegalArgumentException("byteCount > Integer.MAX_VALUE: " + j10);
        }
        if (j10 == 0) {
            return "";
        }
        o oVar = this.f38036a;
        int i10 = oVar.f38070b;
        if (((long) i10) + j10 > oVar.f38071c) {
            return new String(c(j10), charset);
        }
        String str = new String(oVar.f38069a, i10, (int) j10, charset);
        int i11 = (int) (((long) oVar.f38070b) + j10);
        oVar.f38070b = i11;
        this.f38037b -= j10;
        if (i11 == oVar.f38071c) {
            this.f38036a = oVar.b();
            p.a(oVar);
        }
        return str;
    }

    public c a(f fVar) {
        if (fVar != null) {
            fVar.a(this);
            return this;
        }
        throw new IllegalArgumentException("byteString == null");
    }

    public c a(String str, int i10, int i11) {
        char cCharAt;
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("beginIndex < 0: " + i10);
        }
        if (i11 >= i10) {
            if (i11 > str.length()) {
                throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
            }
            while (i10 < i11) {
                char cCharAt2 = str.charAt(i10);
                if (cCharAt2 < 128) {
                    o oVarB = b(1);
                    byte[] bArr = oVarB.f38069a;
                    int i12 = oVarB.f38071c - i10;
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
                    int i14 = oVarB.f38071c;
                    int i15 = (i12 + i10) - i14;
                    oVarB.f38071c = i14 + i15;
                    this.f38037b += (long) i15;
                } else {
                    if (cCharAt2 < 2048) {
                        writeByte((cCharAt2 >> 6) | 192);
                        writeByte((cCharAt2 & '?') | 128);
                    } else if (cCharAt2 >= 55296 && cCharAt2 <= 57343) {
                        int i16 = i10 + 1;
                        char cCharAt3 = i16 < i11 ? str.charAt(i16) : (char) 0;
                        if (cCharAt2 <= 56319 && cCharAt3 >= 56320 && cCharAt3 <= 57343) {
                            int i17 = (((cCharAt2 & 10239) << 10) | (9215 & cCharAt3)) + 65536;
                            writeByte((i17 >> 18) | 240);
                            writeByte(((i17 >> 12) & 63) | 128);
                            writeByte(((i17 >> 6) & 63) | 128);
                            writeByte((i17 & 63) | 128);
                            i10 += 2;
                        } else {
                            writeByte(63);
                            i10 = i16;
                        }
                    } else {
                        writeByte((cCharAt2 >> '\f') | 224);
                        writeByte(((cCharAt2 >> 6) & 63) | 128);
                        writeByte((cCharAt2 & '?') | 128);
                    }
                    i10++;
                }
            }
            return this;
        }
        throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
    }

    public c a(String str, int i10, int i11, Charset charset) {
        if (str == null) {
            throw new IllegalArgumentException("string == null");
        }
        if (i10 < 0) {
            throw new IllegalAccessError("beginIndex < 0: " + i10);
        }
        if (i11 >= i10) {
            if (i11 <= str.length()) {
                if (charset != null) {
                    if (charset.equals(u.f38084a)) {
                        return a(str, i10, i11);
                    }
                    byte[] bytes = str.substring(i10, i11).getBytes(charset);
                    return write(bytes, 0, bytes.length);
                }
                throw new IllegalArgumentException("charset == null");
            }
            throw new IllegalArgumentException("endIndex > string.length: " + i11 + " > " + str.length());
        }
        throw new IllegalArgumentException("endIndex < beginIndex: " + i11 + " < " + i10);
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c write(byte[] bArr) {
        if (bArr != null) {
            return write(bArr, 0, bArr.length);
        }
        throw new IllegalArgumentException("source == null");
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c write(byte[] bArr, int i10, int i11) {
        if (bArr != null) {
            long j10 = i11;
            u.a(bArr.length, i10, j10);
            int i12 = i11 + i10;
            while (i10 < i12) {
                o oVarB = b(1);
                int iMin = Math.min(i12 - i10, 8192 - oVarB.f38071c);
                System.arraycopy(bArr, i10, oVarB.f38069a, oVarB.f38071c, iMin);
                i10 += iMin;
                oVarB.f38071c += iMin;
            }
            this.f38037b += j10;
            return this;
        }
        throw new IllegalArgumentException("source == null");
    }

    public long a(s sVar) throws IOException {
        if (sVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        long j10 = 0;
        while (true) {
            long jB = sVar.b(this, PlaybackStateCompat.ACTION_PLAY_FROM_URI);
            if (jB == -1) {
                return j10;
            }
            j10 += jB;
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public void a(c cVar, long j10) {
        if (cVar == null) {
            throw new IllegalArgumentException("source == null");
        }
        if (cVar != this) {
            u.a(cVar.f38037b, 0L, j10);
            while (j10 > 0) {
                o oVar = cVar.f38036a;
                if (j10 < oVar.f38071c - oVar.f38070b) {
                    o oVar2 = this.f38036a;
                    o oVar3 = oVar2 != null ? oVar2.f38075g : null;
                    if (oVar3 != null && oVar3.f38073e) {
                        if ((((long) oVar3.f38071c) + j10) - ((long) (oVar3.f38072d ? 0 : oVar3.f38070b)) <= PlaybackStateCompat.ACTION_PLAY_FROM_URI) {
                            oVar.a(oVar3, (int) j10);
                            cVar.f38037b -= j10;
                            this.f38037b += j10;
                            return;
                        }
                    }
                    cVar.f38036a = oVar.a((int) j10);
                }
                o oVar4 = cVar.f38036a;
                long j11 = oVar4.f38071c - oVar4.f38070b;
                cVar.f38036a = oVar4.b();
                o oVar5 = this.f38036a;
                if (oVar5 == null) {
                    this.f38036a = oVar4;
                    oVar4.f38075g = oVar4;
                    oVar4.f38074f = oVar4;
                } else {
                    oVar5.f38075g.a(oVar4).a();
                }
                cVar.f38037b -= j11;
                this.f38037b += j11;
                j10 -= j11;
            }
            return;
        }
        throw new IllegalArgumentException("source == this");
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public long a(byte b10) {
        return a(b10, 0L, Long.MAX_VALUE);
    }

    public long a(byte b10, long j10, long j11) {
        o oVar;
        long j12 = 0;
        if (j10 >= 0 && j11 >= j10) {
            long j13 = this.f38037b;
            long j14 = j11 > j13 ? j13 : j11;
            if (j10 == j14 || (oVar = this.f38036a) == null) {
                return -1L;
            }
            if (j13 - j10 < j10) {
                while (j13 > j10) {
                    oVar = oVar.f38075g;
                    j13 -= (long) (oVar.f38071c - oVar.f38070b);
                }
            } else {
                while (true) {
                    long j15 = ((long) (oVar.f38071c - oVar.f38070b)) + j12;
                    if (j15 >= j10) {
                        break;
                    }
                    oVar = oVar.f38074f;
                    j12 = j15;
                }
                j13 = j12;
            }
            long j16 = j10;
            while (j13 < j14) {
                byte[] bArr = oVar.f38069a;
                int iMin = (int) Math.min(oVar.f38071c, (((long) oVar.f38070b) + j14) - j13);
                for (int i10 = (int) ((((long) oVar.f38070b) + j16) - j13); i10 < iMin; i10++) {
                    if (bArr[i10] == b10) {
                        return ((long) (i10 - oVar.f38070b)) + j13;
                    }
                }
                j13 += (long) (oVar.f38071c - oVar.f38070b);
                oVar = oVar.f38074f;
                j16 = j13;
            }
            return -1L;
        }
        throw new IllegalArgumentException(String.format("size=%s fromIndex=%s toIndex=%s", Long.valueOf(this.f38037b), Long.valueOf(j10), Long.valueOf(j11)));
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public boolean a(long j10, f fVar) {
        return a(j10, fVar, 0, fVar.j());
    }

    public boolean a(long j10, f fVar, int i10, int i11) {
        if (j10 < 0 || i10 < 0 || i11 < 0 || this.f38037b - j10 < i11 || fVar.j() - i10 < i11) {
            return false;
        }
        for (int i12 = 0; i12 < i11; i12++) {
            if (f(((long) i12) + j10) != fVar.a(i10 + i12)) {
                return false;
            }
        }
        return true;
    }

    public final f a(int i10) {
        if (i10 == 0) {
            return f.f38040e;
        }
        return new q(this, i10);
    }
}
