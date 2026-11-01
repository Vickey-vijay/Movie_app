package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class t extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f18278e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f18279f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18280g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18281h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f18282i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18283j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f18284k = Integer.MAX_VALUE;

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void a(int i10) throws n1 {
        if (this.f18283j != i10) {
            throw new n1("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void c(int i10) {
        this.f18284k = i10;
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
            if (this.f18279f - this.f18281h >= 10) {
                while (i12 < 10) {
                    byte[] bArr = this.f18278e;
                    int i13 = this.f18281h;
                    this.f18281h = i13 + 1;
                    if (bArr[i13] < 0) {
                        i12++;
                    }
                }
                throw new n1("CodedInputStream encountered a malformed varint.");
            }
            while (i12 < 10) {
                int i14 = this.f18281h;
                if (i14 == this.f18279f) {
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                byte[] bArr2 = this.f18278e;
                this.f18281h = i14 + 1;
                if (bArr2[i14] < 0) {
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
        int i15 = n1.f18244a;
        throw new m1();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final double f() {
        return Double.longBitsToDouble(x());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int b() {
        return this.f18281h - this.f18282i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int d(int i10) {
        if (i10 < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = (this.f18281h - this.f18282i) + i10;
        int i12 = this.f18284k;
        if (i11 > i12) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f18284k = i11;
        z();
        return i12;
    }

    public final void f(int i10) throws n1 {
        if (i10 >= 0) {
            int i11 = this.f18279f;
            int i12 = this.f18281h;
            if (i10 <= i11 - i12) {
                this.f18281h = i12 + i10;
                return;
            }
        }
        if (i10 >= 0) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX WARN: Code duplicated, block: B:49:0x00a2 A[PHI: r3
  0x00a2: PHI (r3v11 int) = (r3v10 int), (r3v13 int) binds: [B:25:0x0053, B:29:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int m() throws n1 {
        int i10;
        int i11 = this.f18281h;
        int i12 = this.f18279f;
        if (i12 != i11) {
            byte[] bArr = this.f18278e;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f18281h = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i11 + 2;
                int i15 = (bArr[i13] << 7) ^ b10;
                if (i15 < 0) {
                    i10 = i15 ^ (-128);
                } else {
                    int i16 = i11 + 3;
                    int i17 = (bArr[i14] << 14) ^ i15;
                    if (i17 >= 0) {
                        i10 = i17 ^ 16256;
                    } else {
                        int i18 = i11 + 4;
                        int i19 = i17 ^ (bArr[i16] << 21);
                        if (i19 < 0) {
                            i10 = (-2080896) ^ i19;
                            i14 = i18;
                        } else {
                            i16 = i11 + 5;
                            byte b11 = bArr[i18];
                            int i20 = (i19 ^ (b11 << 28)) ^ 266354560;
                            if (b11 < 0) {
                                int i21 = i11 + 6;
                                if (bArr[i16] < 0) {
                                    i16 = i11 + 7;
                                    if (bArr[i21] < 0) {
                                        i21 = i11 + 8;
                                        if (bArr[i16] < 0) {
                                            i16 = i11 + 9;
                                            if (bArr[i21] < 0) {
                                                int i22 = i11 + 10;
                                                if (bArr[i16] >= 0) {
                                                    i16 = i22;
                                                }
                                            }
                                        } else {
                                            i16 = i21;
                                        }
                                    }
                                } else {
                                    i16 = i21;
                                }
                            }
                            i10 = i20;
                        }
                    }
                    i14 = i16;
                }
                this.f18281h = i14;
                return i10;
            }
        }
        long j10 = 0;
        for (int i23 = 0; i23 < 64; i23 += 7) {
            int i24 = this.f18281h;
            if (i24 == this.f18279f) {
                throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            byte[] bArr2 = this.f18278e;
            this.f18281h = i24 + 1;
            byte b12 = bArr2[i24];
            j10 |= ((long) (b12 & 127)) << i23;
            if ((b12 & 128) == 0) {
                return (int) j10;
            }
        }
        throw new n1("CodedInputStream encountered a malformed varint.");
    }

    public final int w() throws n1 {
        int i10 = this.f18281h;
        if (this.f18279f - i10 < 4) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f18278e;
        this.f18281h = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long x() throws n1 {
        int i10 = this.f18281h;
        if (this.f18279f - i10 < 8) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        byte[] bArr = this.f18278e;
        this.f18281h = i10 + 8;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public final long y() throws n1 {
        long j10;
        long j11;
        long j12;
        int i10 = this.f18281h;
        int i11 = this.f18279f;
        long j13 = 0;
        if (i11 != i10) {
            byte[] bArr = this.f18278e;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f18281h = i12;
                return b10;
            }
            if (i11 - i12 >= 9) {
                int i13 = i10 + 2;
                int i14 = (bArr[i12] << 7) ^ b10;
                if (i14 < 0) {
                    j10 = i14 ^ (-128);
                } else {
                    int i15 = i10 + 3;
                    int i16 = (bArr[i13] << 14) ^ i14;
                    if (i16 >= 0) {
                        j10 = i16 ^ 16256;
                        i13 = i15;
                    } else {
                        int i17 = i10 + 4;
                        int i18 = i16 ^ (bArr[i15] << 21);
                        if (i18 < 0) {
                            j10 = (-2080896) ^ i18;
                            i13 = i17;
                        } else {
                            long j14 = i18;
                            i13 = i10 + 5;
                            long j15 = j14 ^ (((long) bArr[i17]) << 28);
                            if (j15 >= 0) {
                                j12 = 266354560;
                            } else {
                                int i19 = i10 + 6;
                                long j16 = j15 ^ (((long) bArr[i13]) << 35);
                                if (j16 < 0) {
                                    j11 = -34093383808L;
                                } else {
                                    i13 = i10 + 7;
                                    j15 = j16 ^ (((long) bArr[i19]) << 42);
                                    if (j15 >= 0) {
                                        j12 = 4363953127296L;
                                    } else {
                                        i19 = i10 + 8;
                                        j16 = j15 ^ (((long) bArr[i13]) << 49);
                                        if (j16 < 0) {
                                            j11 = -558586000294016L;
                                        } else {
                                            i13 = i10 + 9;
                                            long j17 = (j16 ^ (((long) bArr[i19]) << 56)) ^ 71499008037633920L;
                                            if (j17 < 0) {
                                                int i20 = i10 + 10;
                                                if (bArr[i13] >= 0) {
                                                    i13 = i20;
                                                }
                                            }
                                            j10 = j17;
                                        }
                                    }
                                }
                                j10 = j16 ^ j11;
                                i13 = i19;
                            }
                            j10 = j12 ^ j15;
                        }
                    }
                }
                this.f18281h = i13;
                return j10;
            }
        }
        for (int i21 = 0; i21 < 64; i21 += 7) {
            int i22 = this.f18281h;
            if (i22 == this.f18279f) {
                throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            byte[] bArr2 = this.f18278e;
            this.f18281h = i22 + 1;
            byte b11 = bArr2[i22];
            j13 |= ((long) (b11 & 127)) << i21;
            if ((b11 & 128) == 0) {
                return j13;
            }
        }
        throw new n1("CodedInputStream encountered a malformed varint.");
    }

    public final void z() {
        int i10 = this.f18279f + this.f18280g;
        this.f18279f = i10;
        int i11 = i10 - this.f18282i;
        int i12 = this.f18284k;
        if (i11 <= i12) {
            this.f18280g = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f18280g = i13;
        this.f18279f = i10 - i13;
    }

    public t(byte[] bArr, int i10, int i11, boolean z10) {
        this.f18278e = bArr;
        this.f18279f = i11 + i10;
        this.f18281h = i10;
        this.f18282i = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final boolean c() {
        return this.f18281h == this.f18279f;
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
            int i10 = this.f18279f;
            int i11 = this.f18281h;
            if (iM <= i10 - i11) {
                String str = new String(this.f18278e, i11, iM, l1.f18232a);
                this.f18281h += iM;
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
        int iM = m();
        if (iM > 0) {
            int i10 = this.f18279f;
            int i11 = this.f18281h;
            if (iM <= i10 - i11) {
                String strA = d4.f18169a.a(this.f18278e, i11, iM);
                this.f18281h += iM;
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
            this.f18283j = 0;
            return 0;
        }
        int iM = m();
        this.f18283j = iM;
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
            this.f18284k = iD;
            z();
            return;
        }
        throw new n1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0040 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x0042 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0044  */
    /* JADX WARN: Code duplicated, block: B:20:0x004e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final q e() throws n1 {
        byte[] bArrCopyOfRange;
        int iM = m();
        if (iM > 0) {
            int i10 = this.f18279f;
            int i11 = this.f18281h;
            if (iM <= i10 - i11) {
                byte[] bArr = this.f18278e;
                q qVar = s.f18274b;
                s.a(i11, i11 + iM, bArr.length);
                q qVar2 = new q(s.f18275c.a(bArr, i11, iM));
                this.f18281h += iM;
                return qVar2;
            }
        }
        if (iM == 0) {
            return s.f18274b;
        }
        if (iM > 0) {
            int i12 = this.f18279f;
            int i13 = this.f18281h;
            if (iM <= i12 - i13) {
                int i14 = iM + i13;
                this.f18281h = i14;
                bArrCopyOfRange = Arrays.copyOfRange(this.f18278e, i13, i14);
            } else {
                if (iM <= 0) {
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                if (iM == 0) {
                    bArrCopyOfRange = l1.f18233b;
                } else {
                    throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
                }
            }
        } else {
            if (iM <= 0) {
                throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            if (iM == 0) {
                bArrCopyOfRange = l1.f18233b;
            } else {
                throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
        }
        q qVar3 = s.f18274b;
        return new q(bArrCopyOfRange);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int a() {
        int i10 = this.f18284k;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.f18281h - this.f18282i);
    }
}
