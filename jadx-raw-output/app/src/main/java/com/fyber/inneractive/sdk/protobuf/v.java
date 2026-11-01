package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public final class v extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ByteBuffer f18305e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f18306f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f18307g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public long f18308h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final long f18309i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18310j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f18311k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18312l = Integer.MAX_VALUE;

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void a(int i10) throws n1 {
        if (this.f18311k != i10) {
            throw new n1("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void c(int i10) {
        this.f18312l = i10;
        z();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final boolean d() {
        return y() != 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final boolean e(int i10) throws n1 {
        int iT;
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (((int) (this.f18307g - this.f18308h)) >= 10) {
                while (i12 < 10) {
                    long j10 = this.f18308h;
                    this.f18308h = j10 + 1;
                    if (x3.f18340c.a(j10) < 0) {
                        i12++;
                    }
                }
                throw new n1("CodedInputStream encountered a malformed varint.");
            }
            while (i12 < 10) {
                long j11 = this.f18308h;
                if (j11 == this.f18307g) {
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f18308h = j11 + 1;
                if (x3.f18340c.a(j11) < 0) {
                    i12++;
                }
            }
            throw new n1("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i11 == 1) {
            f(8);
            return true;
        }
        if (i11 == 2) {
            f(m());
            return true;
        }
        if (i11 == 3) {
            do {
                iT = t();
                if (iT == 0) {
                    break;
                }
            } while (e(iT));
            a(((i10 >>> 3) << 3) | 4);
            return true;
        }
        if (i11 == 4) {
            return false;
        }
        if (i11 == 5) {
            f(4);
            return true;
        }
        int i13 = n1.f18244a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final double f() {
        return Double.longBitsToDouble(x());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int b() {
        return (int) (this.f18308h - this.f18309i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int d(int i10) throws n1 {
        if (i10 < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = i10 + ((int) (this.f18308h - this.f18309i));
        int i12 = this.f18312l;
        if (i11 > i12) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f18312l = i11;
        z();
        return i12;
    }

    public final void f(int i10) throws n1 {
        if (i10 >= 0) {
            long j10 = this.f18307g;
            long j11 = this.f18308h;
            if (i10 <= ((int) (j10 - j11))) {
                this.f18308h = j11 + ((long) i10);
                return;
            }
        }
        if (i10 >= 0) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00cc A[PHI: r6
  0x00cc: PHI (r6v9 long) = (r6v8 long), (r6v12 long) binds: [B:22:0x0064, B:26:0x0076] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int m() throws n1 {
        int i10;
        long j10 = this.f18308h;
        if (this.f18307g != j10) {
            long j11 = j10 + 1;
            w3 w3Var = x3.f18340c;
            byte bA = w3Var.a(j10);
            if (bA >= 0) {
                this.f18308h = j11;
                return bA;
            }
            if (this.f18307g - j11 >= 9) {
                long j12 = 2 + j10;
                int iA = (w3Var.a(j11) << 7) ^ bA;
                if (iA < 0) {
                    i10 = iA ^ (-128);
                } else {
                    long j13 = 3 + j10;
                    int iA2 = iA ^ (w3Var.a(j12) << 14);
                    if (iA2 >= 0) {
                        i10 = iA2 ^ 16256;
                        j12 = j13;
                    } else {
                        j12 = 4 + j10;
                        int iA3 = iA2 ^ (w3Var.a(j13) << 21);
                        if (iA3 < 0) {
                            i10 = (-2080896) ^ iA3;
                        } else {
                            long j14 = 5 + j10;
                            byte bA2 = w3Var.a(j12);
                            int i11 = (iA3 ^ (bA2 << 28)) ^ 266354560;
                            if (bA2 < 0) {
                                j12 = 6 + j10;
                                if (w3Var.a(j14) < 0) {
                                    j14 = 7 + j10;
                                    if (w3Var.a(j12) < 0) {
                                        j12 = 8 + j10;
                                        if (w3Var.a(j14) < 0) {
                                            long j15 = 9 + j10;
                                            if (w3Var.a(j12) < 0) {
                                                long j16 = j10 + 10;
                                                if (w3Var.a(j15) >= 0) {
                                                    j12 = j16;
                                                }
                                            } else {
                                                j12 = j15;
                                            }
                                        }
                                    } else {
                                        j12 = j14;
                                    }
                                }
                            } else {
                                j12 = j14;
                            }
                            i10 = i11;
                        }
                    }
                }
                this.f18308h = j12;
                return i10;
            }
        }
        long j17 = 0;
        for (int i12 = 0; i12 < 64; i12 += 7) {
            long j18 = this.f18308h;
            if (j18 == this.f18307g) {
                throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f18308h = j18 + 1;
            byte bA3 = x3.f18340c.a(j18);
            j17 |= ((long) (bA3 & 127)) << i12;
            if ((bA3 & 128) == 0) {
                return (int) j17;
            }
        }
        throw new n1("CodedInputStream encountered a malformed varint.");
    }

    public final int w() throws n1 {
        long j10 = this.f18308h;
        if (this.f18307g - j10 < 4) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f18308h = 4 + j10;
        w3 w3Var = x3.f18340c;
        return ((w3Var.a(j10 + 3) & 255) << 24) | (w3Var.a(j10) & 255) | ((w3Var.a(1 + j10) & 255) << 8) | ((w3Var.a(2 + j10) & 255) << 16);
    }

    public final long x() throws n1 {
        long j10 = this.f18308h;
        if (this.f18307g - j10 < 8) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f18308h = 8 + j10;
        w3 w3Var = x3.f18340c;
        return ((((long) w3Var.a(j10 + 7)) & 255) << 56) | (((long) w3Var.a(j10)) & 255) | ((((long) w3Var.a(1 + j10)) & 255) << 8) | ((((long) w3Var.a(2 + j10)) & 255) << 16) | ((((long) w3Var.a(3 + j10)) & 255) << 24) | ((((long) w3Var.a(4 + j10)) & 255) << 32) | ((((long) w3Var.a(5 + j10)) & 255) << 40) | ((((long) w3Var.a(6 + j10)) & 255) << 48);
    }

    public final long y() throws n1 {
        long j10;
        long j11;
        int i10;
        long j12 = this.f18308h;
        long j13 = 0;
        if (this.f18307g != j12) {
            long j14 = j12 + 1;
            w3 w3Var = x3.f18340c;
            byte bA = w3Var.a(j12);
            if (bA >= 0) {
                this.f18308h = j14;
                return bA;
            }
            if (this.f18307g - j14 >= 9) {
                long j15 = 2 + j12;
                int iA = (w3Var.a(j14) << 7) ^ bA;
                if (iA >= 0) {
                    long j16 = 3 + j12;
                    int iA2 = iA ^ (w3Var.a(j15) << 14);
                    if (iA2 >= 0) {
                        j10 = iA2 ^ 16256;
                        j15 = j16;
                    } else {
                        j15 = 4 + j12;
                        int iA3 = iA2 ^ (w3Var.a(j16) << 21);
                        if (iA3 < 0) {
                            i10 = (-2080896) ^ iA3;
                        } else {
                            long j17 = j12 + 5;
                            long jA = ((long) iA3) ^ (((long) w3Var.a(j15)) << 28);
                            if (jA >= 0) {
                                j10 = 266354560 ^ jA;
                                j15 = j17;
                            } else {
                                j15 = j12 + 6;
                                long jA2 = (((long) w3Var.a(j17)) << 35) ^ jA;
                                if (jA2 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    long j18 = 7 + j12;
                                    long jA3 = jA2 ^ (((long) w3Var.a(j15)) << 42);
                                    if (jA3 >= 0) {
                                        j10 = 4363953127296L ^ jA3;
                                        j15 = j18;
                                    } else {
                                        j15 = j12 + 8;
                                        jA2 = jA3 ^ (((long) w3Var.a(j18)) << 49);
                                        if (jA2 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            long j19 = 9 + j12;
                                            long jA4 = (jA2 ^ (((long) w3Var.a(j15)) << 56)) ^ 71499008037633920L;
                                            if (jA4 < 0) {
                                                long j20 = j12 + 10;
                                                if (w3Var.a(j19) >= 0) {
                                                    j15 = j20;
                                                }
                                            } else {
                                                j15 = j19;
                                            }
                                            j10 = jA4;
                                        }
                                    }
                                }
                                j10 = j11 ^ jA2;
                            }
                        }
                    }
                    this.f18308h = j15;
                    return j10;
                }
                i10 = iA ^ (-128);
                j10 = i10;
                this.f18308h = j15;
                return j10;
            }
        }
        for (int i11 = 0; i11 < 64; i11 += 7) {
            long j21 = this.f18308h;
            if (j21 == this.f18307g) {
                throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f18308h = j21 + 1;
            byte bA2 = x3.f18340c.a(j21);
            j13 |= ((long) (bA2 & 127)) << i11;
            if ((bA2 & 128) == 0) {
                return j13;
            }
        }
        throw new n1("CodedInputStream encountered a malformed varint.");
    }

    public final void z() {
        long j10 = this.f18307g + ((long) this.f18310j);
        this.f18307g = j10;
        int i10 = (int) (j10 - this.f18309i);
        int i11 = this.f18312l;
        if (i10 <= i11) {
            this.f18310j = 0;
            return;
        }
        int i12 = i10 - i11;
        this.f18310j = i12;
        this.f18307g = j10 - ((long) i12);
    }

    public v(ByteBuffer byteBuffer, boolean z10) {
        this.f18305e = byteBuffer;
        w3 w3Var = x3.f18340c;
        long j10 = w3Var.f18326a.getLong(byteBuffer, x3.f18344g);
        this.f18306f = j10;
        this.f18307g = ((long) byteBuffer.limit()) + j10;
        long jPosition = j10 + ((long) byteBuffer.position());
        this.f18308h = jPosition;
        this.f18309i = jPosition;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final boolean c() {
        return this.f18308h == this.f18307g;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int g() {
        return m();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int h() {
        return w();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long i() {
        return x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final float j() {
        return Float.intBitsToFloat(w());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int k() {
        return m();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long l() {
        return y();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int n() {
        return w();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long o() {
        return x();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int p() {
        return w.b(m());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long q() {
        return w.a(y());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final String r() throws n1 {
        int iM = m();
        if (iM > 0) {
            long j10 = this.f18307g;
            long j11 = this.f18308h;
            if (iM <= ((int) (j10 - j11))) {
                byte[] bArr = new byte[iM];
                long j12 = iM;
                x3.f18340c.a(j11, bArr, j12);
                String str = new String(bArr, l1.f18232a);
                this.f18308h += j12;
                return str;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final String s() throws n1 {
        String strA;
        int iM = m();
        if (iM > 0) {
            long j10 = this.f18307g;
            long j11 = this.f18308h;
            if (iM <= ((int) (j10 - j11))) {
                int i10 = (int) (j11 - this.f18306f);
                ByteBuffer byteBuffer = this.f18305e;
                z3 z3Var = d4.f18169a;
                z3Var.getClass();
                if (byteBuffer.hasArray()) {
                    strA = z3Var.a(byteBuffer.array(), byteBuffer.arrayOffset() + i10, iM);
                } else if (byteBuffer.isDirect()) {
                    strA = z3Var.b(byteBuffer, i10, iM);
                } else {
                    strA = z3.a(byteBuffer, i10, iM);
                }
                this.f18308h += (long) iM;
                return strA;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM <= 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int t() throws n1 {
        if (c()) {
            this.f18311k = 0;
            return 0;
        }
        int iM = m();
        this.f18311k = iM;
        if ((iM >>> 3) != 0) {
            return iM;
        }
        throw new n1("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int u() {
        return m();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final long v() {
        return y();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void a(int i10, c2 c2Var, h0 h0Var) throws IOException {
        int i11 = this.f18313a;
        if (i11 < this.f18314b) {
            this.f18313a = i11 + 1;
            ((t0) c2Var).a(this, h0Var);
            a((i10 << 3) | 4);
            this.f18313a--;
            return;
        }
        throw new n1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void a(c2 c2Var, h0 h0Var) throws IOException {
        int iM = m();
        if (this.f18313a < this.f18314b) {
            int iD = d(iM);
            this.f18313a++;
            ((t0) c2Var).a(this, h0Var);
            a(0);
            this.f18313a--;
            this.f18312l = iD;
            z();
            return;
        }
        throw new n1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final q e() throws n1 {
        int iM = m();
        if (iM > 0) {
            long j10 = this.f18307g;
            long j11 = this.f18308h;
            if (iM <= ((int) (j10 - j11))) {
                byte[] bArr = new byte[iM];
                long j12 = iM;
                x3.f18340c.a(j11, bArr, j12);
                this.f18308h += j12;
                q qVar = s.f18274b;
                return new q(bArr);
            }
        }
        if (iM == 0) {
            return s.f18274b;
        }
        if (iM < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int a() {
        int i10 = this.f18312l;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - ((int) (this.f18308h - this.f18309i));
    }
}
