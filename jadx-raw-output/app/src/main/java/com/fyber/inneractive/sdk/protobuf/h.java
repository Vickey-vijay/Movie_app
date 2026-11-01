package com.fyber.inneractive.sdk.protobuf;

import java.nio.ByteBuffer;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class h extends i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f18188a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f18189b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18190c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18191d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f18192e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18193f;

    public final String a(boolean z10) throws n1 {
        c(2);
        int iX = x();
        if (iX == 0) {
            return "";
        }
        a(iX);
        if (z10) {
            byte[] bArr = this.f18189b;
            int i10 = this.f18190c;
            if (!d4.f18169a.b(bArr, i10, i10 + iX)) {
                throw new n1("Protocol message had invalid UTF-8.");
            }
        }
        String str = new String(this.f18189b, this.f18190c, iX, l1.f18232a);
        this.f18190c += iX;
        return str;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object b(Class cls, h0 h0Var) throws m1 {
        c(2);
        return d(p2.f18255c.a(cls), h0Var);
    }

    public final Object c(t2 t2Var, h0 h0Var) {
        int i10 = this.f18193f;
        this.f18193f = ((this.f18192e >>> 3) << 3) | 4;
        try {
            Object objA = t2Var.a();
            t2Var.a(objA, this, h0Var);
            t2Var.c(objA);
            if (this.f18192e != this.f18193f) {
                throw new n1("Failed to parse the message.");
            }
            this.f18193f = i10;
            return objA;
        } catch (Throwable th2) {
            this.f18193f = i10;
            throw th2;
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int d() throws m1 {
        c(0);
        return x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int e() {
        return this.f18192e;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long f() throws m1 {
        c(0);
        return y();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long g() throws n1 {
        c(1);
        a(8);
        return w();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final double h() throws n1 {
        c(1);
        a(8);
        return Double.longBitsToDouble(w());
    }

    /* JADX WARN: Code duplicated, block: B:44:0x008b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0091  */
    /* JADX WARN: Code duplicated, block: B:49:0x009c A[LOOP:2: B:43:0x0089->B:49:0x009c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x009f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x009b A[SYNTHETIC] */
    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final boolean i() throws n1 {
        int i10;
        int i11;
        int i12;
        byte[] bArr;
        if (u() || (i10 = this.f18192e) == (i11 = this.f18193f)) {
            return false;
        }
        int i13 = i10 & 7;
        if (i13 != 0) {
            if (i13 == 1) {
                a(8);
                this.f18190c += 8;
                return true;
            }
            if (i13 == 2) {
                int iX = x();
                a(iX);
                this.f18190c += iX;
                return true;
            }
            if (i13 != 3) {
                if (i13 != 5) {
                    int i14 = n1.f18244a;
                    throw new m1();
                }
                a(4);
                this.f18190c += 4;
                return true;
            }
            this.f18193f = ((i10 >>> 3) << 3) | 4;
            while (s() != Integer.MAX_VALUE && i()) {
            }
            if (this.f18192e != this.f18193f) {
                throw new n1("Failed to parse the message.");
            }
            this.f18193f = i11;
            return true;
        }
        int i15 = this.f18191d;
        int i16 = this.f18190c;
        if (i15 - i16 < 10) {
            for (int i17 = 0; i17 < 10; i17++) {
                i12 = this.f18190c;
                if (i12 != this.f18191d) {
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                bArr = this.f18189b;
                this.f18190c = i12 + 1;
                if (bArr[i12] >= 0) {
                }
            }
            throw new n1("CodedInputStream encountered a malformed varint.");
        }
        byte[] bArr2 = this.f18189b;
        int i18 = 0;
        while (i18 < 10) {
            int i19 = i16 + 1;
            if (bArr2[i16] >= 0) {
                this.f18190c = i19;
            } else {
                i18++;
                i16 = i19;
            }
        }
        while (i17 < 10) {
            i12 = this.f18190c;
            if (i12 != this.f18191d) {
                throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            bArr = this.f18189b;
            this.f18190c = i12 + 1;
            if (bArr[i12] >= 0) {
            }
        }
        throw new n1("CodedInputStream encountered a malformed varint.");
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int j() throws m1 {
        c(0);
        return w.b(x());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final float k() throws n1 {
        c(5);
        a(4);
        return Float.intBitsToFloat(v());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long l() throws m1 {
        c(0);
        return w.a(y());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int m() throws n1 {
        c(5);
        a(4);
        return v();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final String n() {
        return a(false);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long o() throws m1 {
        c(0);
        return y();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final String p() {
        return a(true);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int q() throws n1 {
        c(5);
        a(4);
        return v();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final boolean r() throws m1 {
        c(0);
        return x() != 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final long t() throws n1 {
        c(1);
        a(8);
        return w();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void e(List list) throws n1 {
        int i10;
        int i11;
        if (!(list instanceof a1)) {
            int i12 = this.f18192e & 7;
            if (i12 == 2) {
                int iX = x();
                d(iX);
                int i13 = this.f18190c + iX;
                while (this.f18190c < i13) {
                    list.add(Integer.valueOf(v()));
                }
                return;
            }
            if (i12 != 5) {
                int i14 = n1.f18244a;
                throw new m1();
            }
            do {
                list.add(Integer.valueOf(q()));
                if (u()) {
                    return;
                } else {
                    i10 = this.f18190c;
                }
            } while (x() == this.f18192e);
            this.f18190c = i10;
            return;
        }
        a1 a1Var = (a1) list;
        int i15 = this.f18192e & 7;
        if (i15 == 2) {
            int iX2 = x();
            d(iX2);
            int i16 = this.f18190c + iX2;
            while (this.f18190c < i16) {
                a1Var.c(v());
            }
            return;
        }
        if (i15 != 5) {
            int i17 = n1.f18244a;
            throw new m1();
        }
        do {
            a1Var.c(q());
            if (u()) {
                return;
            } else {
                i11 = this.f18190c;
            }
        } while (x() == this.f18192e);
        this.f18190c = i11;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void n(List list) throws n1 {
        int i10;
        int i11;
        if (!(list instanceof u1)) {
            int i12 = this.f18192e & 7;
            if (i12 == 1) {
                do {
                    list.add(Long.valueOf(g()));
                    if (u()) {
                        return;
                    } else {
                        i10 = this.f18190c;
                    }
                } while (x() == this.f18192e);
                this.f18190c = i10;
                return;
            }
            if (i12 != 2) {
                int i13 = n1.f18244a;
                throw new m1();
            }
            int iX = x();
            e(iX);
            int i14 = this.f18190c + iX;
            while (this.f18190c < i14) {
                list.add(Long.valueOf(w()));
            }
            return;
        }
        u1 u1Var = (u1) list;
        int i15 = this.f18192e & 7;
        if (i15 == 1) {
            do {
                u1Var.a(g());
                if (u()) {
                    return;
                } else {
                    i11 = this.f18190c;
                }
            } while (x() == this.f18192e);
            this.f18190c = i11;
            return;
        }
        if (i15 != 2) {
            int i16 = n1.f18244a;
            throw new m1();
        }
        int iX2 = x();
        e(iX2);
        int i17 = this.f18190c + iX2;
        while (this.f18190c < i17) {
            u1Var.a(w());
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void p(List list) throws n1 {
        int i10;
        int i11;
        if (!(list instanceof a1)) {
            int i12 = this.f18192e & 7;
            if (i12 != 0) {
                if (i12 != 2) {
                    int i13 = n1.f18244a;
                    throw new m1();
                }
                int iX = this.f18190c + x();
                while (this.f18190c < iX) {
                    list.add(Integer.valueOf(x()));
                }
                return;
            }
            do {
                c(0);
                list.add(Integer.valueOf(x()));
                if (u()) {
                    return;
                } else {
                    i10 = this.f18190c;
                }
            } while (x() == this.f18192e);
            this.f18190c = i10;
            return;
        }
        a1 a1Var = (a1) list;
        int i14 = this.f18192e & 7;
        if (i14 != 0) {
            if (i14 != 2) {
                int i15 = n1.f18244a;
                throw new m1();
            }
            int iX2 = this.f18190c + x();
            while (this.f18190c < iX2) {
                a1Var.c(x());
            }
            return;
        }
        do {
            c(0);
            a1Var.c(x());
            if (u()) {
                return;
            } else {
                i11 = this.f18190c;
            }
        } while (x() == this.f18192e);
        this.f18190c = i11;
    }

    public final boolean u() {
        return this.f18190c == this.f18191d;
    }

    public final int v() {
        int i10 = this.f18190c;
        byte[] bArr = this.f18189b;
        this.f18190c = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long w() {
        int i10 = this.f18190c;
        byte[] bArr = this.f18189b;
        this.f18190c = i10 + 8;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a4 A[PHI: r2
  0x00a4: PHI (r2v7 int) = (r2v6 int), (r2v9 int) binds: [B:37:0x0082, B:41:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    public final int x() throws n1 {
        int i10;
        int i11 = this.f18190c;
        int i12 = this.f18191d;
        if (i12 == i11) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f18189b;
        int i13 = i11 + 1;
        byte b10 = bArr[i11];
        if (b10 >= 0) {
            this.f18190c = i13;
            return b10;
        }
        if (i12 - i13 < 9) {
            long j10 = 0;
            for (int i14 = 0; i14 < 64; i14 += 7) {
                int i15 = this.f18190c;
                if (i15 == this.f18191d) {
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                byte[] bArr2 = this.f18189b;
                this.f18190c = i15 + 1;
                byte b11 = bArr2[i15];
                j10 |= ((long) (b11 & 127)) << i14;
                if ((b11 & 128) == 0) {
                    return (int) j10;
                }
            }
            throw new n1("CodedInputStream encountered a malformed varint.");
        }
        int i16 = i11 + 2;
        int i17 = (bArr[i13] << 7) ^ b10;
        if (i17 < 0) {
            i10 = i17 ^ (-128);
        } else {
            int i18 = i11 + 3;
            int i19 = (bArr[i16] << 14) ^ i17;
            if (i19 >= 0) {
                i10 = i19 ^ 16256;
            } else {
                int i20 = i11 + 4;
                int i21 = i19 ^ (bArr[i18] << 21);
                if (i21 < 0) {
                    i10 = (-2080896) ^ i21;
                    i16 = i20;
                } else {
                    i18 = i11 + 5;
                    byte b12 = bArr[i20];
                    int i22 = (i21 ^ (b12 << 28)) ^ 266354560;
                    if (b12 < 0) {
                        int i23 = i11 + 6;
                        if (bArr[i18] < 0) {
                            i18 = i11 + 7;
                            if (bArr[i23] < 0) {
                                i23 = i11 + 8;
                                if (bArr[i18] < 0) {
                                    i18 = i11 + 9;
                                    if (bArr[i23] < 0) {
                                        int i24 = i11 + 10;
                                        if (bArr[i18] < 0) {
                                            throw new n1("CodedInputStream encountered a malformed varint.");
                                        }
                                        i18 = i24;
                                    }
                                } else {
                                    i18 = i23;
                                }
                            }
                        } else {
                            i18 = i23;
                        }
                    }
                    i10 = i22;
                }
            }
            i16 = i18;
        }
        this.f18190c = i16;
        return i10;
    }

    public final long y() throws n1 {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10 = this.f18190c;
        int i11 = this.f18191d;
        if (i11 == i10) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f18189b;
        int i12 = i10 + 1;
        byte b10 = bArr[i10];
        if (b10 >= 0) {
            this.f18190c = i12;
            return b10;
        }
        long j14 = 0;
        if (i11 - i12 < 9) {
            for (int i13 = 0; i13 < 64; i13 += 7) {
                int i14 = this.f18190c;
                if (i14 == this.f18191d) {
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                byte[] bArr2 = this.f18189b;
                this.f18190c = i14 + 1;
                byte b11 = bArr2[i14];
                j14 |= ((long) (b11 & 127)) << i13;
                if ((b11 & 128) == 0) {
                    return j14;
                }
            }
            throw new n1("CodedInputStream encountered a malformed varint.");
        }
        int i15 = i10 + 2;
        int i16 = (bArr[i12] << 7) ^ b10;
        if (i16 < 0) {
            j10 = i16 ^ (-128);
        } else {
            int i17 = i10 + 3;
            int i18 = (bArr[i15] << 14) ^ i16;
            if (i18 >= 0) {
                j10 = i18 ^ 16256;
                i15 = i17;
            } else {
                int i19 = i10 + 4;
                int i20 = i18 ^ (bArr[i17] << 21);
                if (i20 < 0) {
                    j13 = (-2080896) ^ i20;
                } else {
                    long j15 = i20;
                    i15 = i10 + 5;
                    long j16 = j15 ^ (((long) bArr[i19]) << 28);
                    if (j16 >= 0) {
                        j12 = 266354560;
                    } else {
                        i19 = i10 + 6;
                        long j17 = j16 ^ (((long) bArr[i15]) << 35);
                        if (j17 < 0) {
                            j11 = -34093383808L;
                        } else {
                            i15 = i10 + 7;
                            j16 = j17 ^ (((long) bArr[i19]) << 42);
                            if (j16 >= 0) {
                                j12 = 4363953127296L;
                            } else {
                                i19 = i10 + 8;
                                j17 = j16 ^ (((long) bArr[i15]) << 49);
                                if (j17 < 0) {
                                    j11 = -558586000294016L;
                                } else {
                                    i15 = i10 + 9;
                                    long j18 = (j17 ^ (((long) bArr[i19]) << 56)) ^ 71499008037633920L;
                                    if (j18 < 0) {
                                        int i21 = i10 + 10;
                                        if (bArr[i15] < 0) {
                                            throw new n1("CodedInputStream encountered a malformed varint.");
                                        }
                                        i15 = i21;
                                    }
                                    j10 = j18;
                                }
                            }
                        }
                        j13 = j11 ^ j17;
                    }
                    j10 = j12 ^ j16;
                }
                i15 = i19;
                j10 = j13;
            }
        }
        this.f18190c = i15;
        return j10;
    }

    public h(ByteBuffer byteBuffer) {
        this.f18189b = byteBuffer.array();
        this.f18190c = byteBuffer.position() + byteBuffer.arrayOffset();
        this.f18191d = byteBuffer.limit() + byteBuffer.arrayOffset();
    }

    public final Object d(t2 t2Var, h0 h0Var) throws n1 {
        int iX = x();
        a(iX);
        int i10 = this.f18191d;
        int i11 = this.f18190c + iX;
        this.f18191d = i11;
        try {
            Object objA = t2Var.a();
            t2Var.a(objA, this, h0Var);
            t2Var.c(objA);
            if (this.f18190c == i11) {
                this.f18191d = i10;
                return objA;
            }
            throw new n1("Failed to parse the message.");
        } catch (Throwable th2) {
            this.f18191d = i10;
            throw th2;
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void f(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i12 = this.f18192e & 7;
            if (i12 == 2) {
                int iX = x();
                d(iX);
                int i13 = this.f18190c + iX;
                while (this.f18190c < i13) {
                    a1Var.c(v());
                }
                return;
            }
            if (i12 == 5) {
                do {
                    a1Var.c(m());
                    if (u()) {
                        return;
                    } else {
                        i11 = this.f18190c;
                    }
                } while (x() == this.f18192e);
                this.f18190c = i11;
                return;
            }
            int i14 = n1.f18244a;
            throw new m1();
        }
        int i15 = this.f18192e & 7;
        if (i15 == 2) {
            int iX2 = x();
            d(iX2);
            int i16 = this.f18190c + iX2;
            while (this.f18190c < i16) {
                list.add(Integer.valueOf(v()));
            }
            return;
        }
        if (i15 == 5) {
            do {
                list.add(Integer.valueOf(m()));
                if (u()) {
                    return;
                } else {
                    i10 = this.f18190c;
                }
            } while (x() == this.f18192e);
            this.f18190c = i10;
            return;
        }
        int i17 = n1.f18244a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void j(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof d0) {
            d0 d0Var = (d0) list;
            int i12 = this.f18192e & 7;
            if (i12 == 1) {
                do {
                    d0Var.a(h());
                    if (u()) {
                        return;
                    } else {
                        i11 = this.f18190c;
                    }
                } while (x() == this.f18192e);
                this.f18190c = i11;
                return;
            }
            if (i12 == 2) {
                int iX = x();
                e(iX);
                int i13 = this.f18190c + iX;
                while (this.f18190c < i13) {
                    d0Var.a(Double.longBitsToDouble(w()));
                }
                return;
            }
            int i14 = n1.f18244a;
            throw new m1();
        }
        int i15 = this.f18192e & 7;
        if (i15 == 1) {
            do {
                list.add(Double.valueOf(h()));
                if (u()) {
                    return;
                } else {
                    i10 = this.f18190c;
                }
            } while (x() == this.f18192e);
            this.f18190c = i10;
            return;
        }
        if (i15 == 2) {
            int iX2 = x();
            e(iX2);
            int i16 = this.f18190c + iX2;
            while (this.f18190c < i16) {
                list.add(Double.valueOf(Double.longBitsToDouble(w())));
            }
            return;
        }
        int i17 = n1.f18244a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void l(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof j) {
            j jVar = (j) list;
            int i12 = this.f18192e & 7;
            if (i12 == 0) {
                do {
                    jVar.a(r());
                    if (u()) {
                        return;
                    } else {
                        i11 = this.f18190c;
                    }
                } while (x() == this.f18192e);
                this.f18190c = i11;
                return;
            }
            if (i12 == 2) {
                int iX = this.f18190c + x();
                while (this.f18190c < iX) {
                    jVar.a(x() != 0);
                }
                b(iX);
                return;
            }
            int i13 = n1.f18244a;
            throw new m1();
        }
        int i14 = this.f18192e & 7;
        if (i14 == 0) {
            do {
                list.add(Boolean.valueOf(r()));
                if (u()) {
                    return;
                } else {
                    i10 = this.f18190c;
                }
            } while (x() == this.f18192e);
            this.f18190c = i10;
            return;
        }
        if (i14 == 2) {
            int iX2 = this.f18190c + x();
            while (this.f18190c < iX2) {
                list.add(Boolean.valueOf(x() != 0));
            }
            b(iX2);
            return;
        }
        int i15 = n1.f18244a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void o(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i12 = this.f18192e & 7;
            if (i12 == 0) {
                do {
                    c(0);
                    a1Var.c(x());
                    if (u()) {
                        return;
                    } else {
                        i11 = this.f18190c;
                    }
                } while (x() == this.f18192e);
                this.f18190c = i11;
                return;
            }
            if (i12 == 2) {
                int iX = this.f18190c + x();
                while (this.f18190c < iX) {
                    a1Var.c(x());
                }
                b(iX);
                return;
            }
            int i13 = n1.f18244a;
            throw new m1();
        }
        int i14 = this.f18192e & 7;
        if (i14 == 0) {
            do {
                c(0);
                list.add(Integer.valueOf(x()));
                if (u()) {
                    return;
                } else {
                    i10 = this.f18190c;
                }
            } while (x() == this.f18192e);
            this.f18190c = i10;
            return;
        }
        if (i14 == 2) {
            int iX2 = this.f18190c + x();
            while (this.f18190c < iX2) {
                list.add(Integer.valueOf(x()));
            }
            b(iX2);
            return;
        }
        int i15 = n1.f18244a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int s() throws n1 {
        if (u()) {
            return Integer.MAX_VALUE;
        }
        int iX = x();
        this.f18192e = iX;
        if (iX == this.f18193f) {
            return Integer.MAX_VALUE;
        }
        return iX >>> 3;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object b(t2 t2Var, h0 h0Var) throws m1 {
        c(2);
        return d(t2Var, h0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void g(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i12 = this.f18192e & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    int iX = this.f18190c + x();
                    while (this.f18190c < iX) {
                        u1Var.a(w.a(y()));
                    }
                    return;
                }
                int i13 = n1.f18244a;
                throw new m1();
            }
            do {
                c(0);
                u1Var.a(w.a(y()));
                if (u()) {
                    return;
                } else {
                    i11 = this.f18190c;
                }
            } while (x() == this.f18192e);
            this.f18190c = i11;
            return;
        }
        int i14 = this.f18192e & 7;
        if (i14 != 0) {
            if (i14 == 2) {
                int iX2 = this.f18190c + x();
                while (this.f18190c < iX2) {
                    list.add(Long.valueOf(w.a(y())));
                }
                return;
            }
            int i15 = n1.f18244a;
            throw new m1();
        }
        do {
            c(0);
            list.add(Long.valueOf(w.a(y())));
            if (u()) {
                return;
            } else {
                i10 = this.f18190c;
            }
        } while (x() == this.f18192e);
        this.f18190c = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void m(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i12 = this.f18192e & 7;
            if (i12 == 1) {
                do {
                    u1Var.a(t());
                    if (u()) {
                        return;
                    } else {
                        i11 = this.f18190c;
                    }
                } while (x() == this.f18192e);
                this.f18190c = i11;
                return;
            }
            if (i12 == 2) {
                int iX = x();
                e(iX);
                int i13 = this.f18190c + iX;
                while (this.f18190c < i13) {
                    u1Var.a(w());
                }
                return;
            }
            int i14 = n1.f18244a;
            throw new m1();
        }
        int i15 = this.f18192e & 7;
        if (i15 == 1) {
            do {
                list.add(Long.valueOf(t()));
                if (u()) {
                    return;
                } else {
                    i10 = this.f18190c;
                }
            } while (x() == this.f18192e);
            this.f18190c = i10;
            return;
        }
        if (i15 == 2) {
            int iX2 = x();
            e(iX2);
            int i16 = this.f18190c + iX2;
            while (this.f18190c < i16) {
                list.add(Long.valueOf(w()));
            }
            return;
        }
        int i17 = n1.f18244a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void q(List list) throws m1 {
        a(list, false);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void h(List list) throws m1 {
        int i10;
        if ((this.f18192e & 7) == 2) {
            do {
                list.add(a());
                if (u()) {
                    return;
                } else {
                    i10 = this.f18190c;
                }
            } while (x() == this.f18192e);
            this.f18190c = i10;
            return;
        }
        int i11 = n1.f18244a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void k(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i12 = this.f18192e & 7;
            if (i12 == 0) {
                do {
                    c(0);
                    u1Var.a(y());
                    if (u()) {
                        return;
                    } else {
                        i11 = this.f18190c;
                    }
                } while (x() == this.f18192e);
                this.f18190c = i11;
                return;
            }
            if (i12 == 2) {
                int iX = this.f18190c + x();
                while (this.f18190c < iX) {
                    u1Var.a(y());
                }
                b(iX);
                return;
            }
            int i13 = n1.f18244a;
            throw new m1();
        }
        int i14 = this.f18192e & 7;
        if (i14 == 0) {
            do {
                c(0);
                list.add(Long.valueOf(y()));
                if (u()) {
                    return;
                } else {
                    i10 = this.f18190c;
                }
            } while (x() == this.f18192e);
            this.f18190c = i10;
            return;
        }
        if (i14 == 2) {
            int iX2 = this.f18190c + x();
            while (this.f18190c < iX2) {
                list.add(Long.valueOf(y()));
            }
            b(iX2);
            return;
        }
        int i15 = n1.f18244a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int b() throws m1 {
        c(0);
        return x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void b(List list) throws m1 {
        a(list, true);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void b(List list, t2 t2Var, h0 h0Var) throws m1 {
        int i10;
        int i11 = this.f18192e;
        if ((i11 & 7) == 2) {
            do {
                list.add(d(t2Var, h0Var));
                if (u()) {
                    return;
                } else {
                    i10 = this.f18190c;
                }
            } while (x() == i11);
            this.f18190c = i10;
            return;
        }
        int i12 = n1.f18244a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object a(Class cls, h0 h0Var) throws m1 {
        c(3);
        return c(p2.f18255c.a(cls), h0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final Object a(t2 t2Var, h0 h0Var) throws m1 {
        c(3);
        return c(t2Var, h0Var);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final int c() throws m1 {
        c(0);
        return x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final s a() throws n1 {
        s qVar;
        c(2);
        int iX = x();
        if (iX == 0) {
            return s.f18274b;
        }
        a(iX);
        if (this.f18188a) {
            byte[] bArr = this.f18189b;
            int i10 = this.f18190c;
            q qVar2 = s.f18274b;
            qVar = new n(bArr, i10, iX);
        } else {
            byte[] bArr2 = this.f18189b;
            int i11 = this.f18190c;
            q qVar3 = s.f18274b;
            s.a(i11, i11 + iX, bArr2.length);
            qVar = new q(s.f18275c.a(bArr2, i11, iX));
        }
        this.f18190c += iX;
        return qVar;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void c(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i12 = this.f18192e & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    int iX = this.f18190c + x();
                    while (this.f18190c < iX) {
                        a1Var.c(w.b(x()));
                    }
                    return;
                }
                int i13 = n1.f18244a;
                throw new m1();
            }
            do {
                c(0);
                a1Var.c(w.b(x()));
                if (u()) {
                    return;
                } else {
                    i11 = this.f18190c;
                }
            } while (x() == this.f18192e);
            this.f18190c = i11;
            return;
        }
        int i14 = this.f18192e & 7;
        if (i14 != 0) {
            if (i14 == 2) {
                int iX2 = this.f18190c + x();
                while (this.f18190c < iX2) {
                    list.add(Integer.valueOf(w.b(x())));
                }
                return;
            }
            int i15 = n1.f18244a;
            throw new m1();
        }
        do {
            c(0);
            list.add(Integer.valueOf(w.b(x())));
            if (u()) {
                return;
            } else {
                i10 = this.f18190c;
            }
        } while (x() == this.f18192e);
        this.f18190c = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void d(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof q0) {
            q0 q0Var = (q0) list;
            int i12 = this.f18192e & 7;
            if (i12 == 2) {
                int iX = x();
                d(iX);
                int i13 = this.f18190c + iX;
                while (this.f18190c < i13) {
                    q0Var.a(Float.intBitsToFloat(v()));
                }
                return;
            }
            if (i12 == 5) {
                do {
                    q0Var.a(k());
                    if (u()) {
                        return;
                    } else {
                        i11 = this.f18190c;
                    }
                } while (x() == this.f18192e);
                this.f18190c = i11;
                return;
            }
            int i14 = n1.f18244a;
            throw new m1();
        }
        int i15 = this.f18192e & 7;
        if (i15 == 2) {
            int iX2 = x();
            d(iX2);
            int i16 = this.f18190c + iX2;
            while (this.f18190c < i16) {
                list.add(Float.valueOf(Float.intBitsToFloat(v())));
            }
            return;
        }
        if (i15 == 5) {
            do {
                list.add(Float.valueOf(k()));
                if (u()) {
                    return;
                } else {
                    i10 = this.f18190c;
                }
            } while (x() == this.f18192e);
            this.f18190c = i10;
            return;
        }
        int i17 = n1.f18244a;
        throw new m1();
    }

    public final void b(int i10) throws n1 {
        if (this.f18190c != i10) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void a(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof u1) {
            u1 u1Var = (u1) list;
            int i12 = this.f18192e & 7;
            if (i12 == 0) {
                do {
                    c(0);
                    u1Var.a(y());
                    if (u()) {
                        return;
                    } else {
                        i11 = this.f18190c;
                    }
                } while (x() == this.f18192e);
                this.f18190c = i11;
                return;
            }
            if (i12 == 2) {
                int iX = this.f18190c + x();
                while (this.f18190c < iX) {
                    u1Var.a(y());
                }
                b(iX);
                return;
            }
            int i13 = n1.f18244a;
            throw new m1();
        }
        int i14 = this.f18192e & 7;
        if (i14 == 0) {
            do {
                c(0);
                list.add(Long.valueOf(y()));
                if (u()) {
                    return;
                } else {
                    i10 = this.f18190c;
                }
            } while (x() == this.f18192e);
            this.f18190c = i10;
            return;
        }
        if (i14 == 2) {
            int iX2 = this.f18190c + x();
            while (this.f18190c < iX2) {
                list.add(Long.valueOf(y()));
            }
            b(iX2);
            return;
        }
        int i15 = n1.f18244a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void i(List list) throws n1 {
        int i10;
        int i11;
        if (list instanceof a1) {
            a1 a1Var = (a1) list;
            int i12 = this.f18192e & 7;
            if (i12 != 0) {
                if (i12 == 2) {
                    int iX = this.f18190c + x();
                    while (this.f18190c < iX) {
                        a1Var.c(x());
                    }
                    return;
                }
                int i13 = n1.f18244a;
                throw new m1();
            }
            do {
                c(0);
                a1Var.c(x());
                if (u()) {
                    return;
                } else {
                    i11 = this.f18190c;
                }
            } while (x() == this.f18192e);
            this.f18190c = i11;
            return;
        }
        int i14 = this.f18192e & 7;
        if (i14 != 0) {
            if (i14 == 2) {
                int iX2 = this.f18190c + x();
                while (this.f18190c < iX2) {
                    list.add(Integer.valueOf(x()));
                }
                return;
            }
            int i15 = n1.f18244a;
            throw new m1();
        }
        do {
            c(0);
            list.add(Integer.valueOf(x()));
            if (u()) {
                return;
            } else {
                i10 = this.f18190c;
            }
        } while (x() == this.f18192e);
        this.f18190c = i10;
    }

    public final void e(int i10) throws n1 {
        a(i10);
        if ((i10 & 7) != 0) {
            throw new n1("Failed to parse the message.");
        }
    }

    public final void c(int i10) throws m1 {
        if ((this.f18192e & 7) == i10) {
            return;
        }
        int i11 = n1.f18244a;
        throw new m1();
    }

    public final void d(int i10) throws n1 {
        a(i10);
        if ((i10 & 3) != 0) {
            throw new n1("Failed to parse the message.");
        }
    }

    public final void a(List list, boolean z10) throws m1 {
        int i10;
        int i11;
        if ((this.f18192e & 7) == 2) {
            if ((list instanceof q1) && !z10) {
                q1 q1Var = (q1) list;
                do {
                    q1Var.a(a());
                    if (u()) {
                        return;
                    } else {
                        i11 = this.f18190c;
                    }
                } while (x() == this.f18192e);
                this.f18190c = i11;
                return;
            }
            do {
                list.add(a(z10));
                if (u()) {
                    return;
                } else {
                    i10 = this.f18190c;
                }
            } while (x() == this.f18192e);
            this.f18190c = i10;
            return;
        }
        int i12 = n1.f18244a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.s2
    public final void a(List list, t2 t2Var, h0 h0Var) throws m1 {
        int i10;
        int i11 = this.f18192e;
        if ((i11 & 7) == 3) {
            do {
                list.add(c(t2Var, h0Var));
                if (u()) {
                    return;
                } else {
                    i10 = this.f18190c;
                }
            } while (x() == i11);
            this.f18190c = i10;
            return;
        }
        int i12 = n1.f18244a;
        throw new m1();
    }

    public final void a(int i10) throws n1 {
        if (i10 < 0 || i10 > this.f18191d - this.f18190c) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
