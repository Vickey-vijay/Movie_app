package com.fyber.inneractive.sdk.protobuf;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public final class u extends w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InputStream f18290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final byte[] f18291f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f18292g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f18293h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f18294i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f18295j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f18296k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f18297l = Integer.MAX_VALUE;

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void a(int i10) throws n1 {
        if (this.f18295j != i10) {
            throw new n1("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final void c(int i10) {
        this.f18297l = i10;
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
            if (this.f18292g - this.f18294i >= 10) {
                while (i12 < 10) {
                    byte[] bArr = this.f18291f;
                    int i13 = this.f18294i;
                    this.f18294i = i13 + 1;
                    if (bArr[i13] < 0) {
                        i12++;
                    }
                }
                throw new n1("CodedInputStream encountered a malformed varint.");
            }
            while (i12 < 10) {
                if (this.f18294i == this.f18292g) {
                    i(1);
                }
                byte[] bArr2 = this.f18291f;
                int i14 = this.f18294i;
                this.f18294i = i14 + 1;
                if (bArr2[i14] < 0) {
                    i12++;
                }
            }
            throw new n1("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i11 == 1) {
            j(8);
            return true;
        }
        if (i11 == 2) {
            j(m());
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
            j(4);
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
    public final int b() {
        return this.f18296k + this.f18294i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int d(int i10) throws n1 {
        if (i10 < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = this.f18296k + this.f18294i + i10;
        int i12 = this.f18297l;
        if (i11 > i12) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f18297l = i11;
        z();
        return i12;
    }

    public final byte[] f(int i10) throws IOException {
        byte[] bArrG = g(i10);
        if (bArrG != null) {
            return bArrG;
        }
        int i11 = this.f18294i;
        int i12 = this.f18292g;
        int length = i12 - i11;
        this.f18296k += i12;
        this.f18294i = 0;
        this.f18292g = 0;
        ArrayList<byte[]> arrayListH = h(i10 - length);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f18291f, i11, bArr, 0, length);
        for (byte[] bArr2 : arrayListH) {
            System.arraycopy(bArr2, 0, bArr, length, bArr2.length);
            length += bArr2.length;
        }
        return bArr;
    }

    public final byte[] g(int i10) throws IOException {
        if (i10 == 0) {
            return l1.f18233b;
        }
        if (i10 < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = this.f18296k;
        int i12 = this.f18294i;
        int i13 = i11 + i12 + i10;
        if (i13 - this.f18315c > 0) {
            throw new n1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
        }
        int i14 = this.f18297l;
        if (i13 > i14) {
            j((i14 - i11) - i12);
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i15 = this.f18292g - i12;
        int i16 = i10 - i15;
        if (i16 >= 4096 && i16 > this.f18290e.available()) {
            return null;
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.f18291f, this.f18294i, bArr, 0, i15);
        this.f18296k += this.f18292g;
        this.f18294i = 0;
        this.f18292g = 0;
        while (i15 < i10) {
            int i17 = this.f18290e.read(bArr, i15, i10 - i15);
            if (i17 == -1) {
                throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
            this.f18296k += i17;
            i15 += i17;
        }
        return bArr;
    }

    public final ArrayList h(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, 4096);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = this.f18290e.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.f18296k += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    public final void i(int i10) throws n1 {
        if (k(i10)) {
            return;
        }
        if (i10 <= (this.f18315c - this.f18296k) - this.f18294i) {
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        throw new n1("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    public final void j(int i10) throws n1 {
        int i11 = this.f18292g;
        int i12 = this.f18294i;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.f18294i = i12 + i10;
            return;
        }
        if (i10 < 0) {
            throw new n1("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i14 = this.f18296k;
        int i15 = i14 + i12;
        int i16 = i15 + i10;
        int i17 = this.f18297l;
        if (i16 > i17) {
            j((i17 - i14) - i12);
            throw new n1("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.f18296k = i15;
        this.f18292g = 0;
        this.f18294i = 0;
        while (i13 < i10) {
            try {
                long j10 = i10 - i13;
                long jSkip = this.f18290e.skip(j10);
                if (jSkip < 0 || jSkip > j10) {
                    throw new IllegalStateException(this.f18290e.getClass() + "#skip returned invalid result: " + jSkip + "\nThe InputStream implementation is buggy.");
                }
                if (jSkip == 0) {
                    break;
                } else {
                    i13 += (int) jSkip;
                }
            } catch (Throwable th2) {
                this.f18296k += i13;
                z();
                throw th2;
            }
        }
        this.f18296k += i13;
        z();
        if (i13 >= i10) {
            return;
        }
        int i18 = this.f18292g;
        int i19 = i18 - this.f18294i;
        this.f18294i = i18;
        i(1);
        while (true) {
            int i20 = i10 - i19;
            int i21 = this.f18292g;
            if (i20 <= i21) {
                this.f18294i = i20;
                return;
            } else {
                i19 += i21;
                this.f18294i = i21;
                i(1);
            }
        }
    }

    public final boolean k(int i10) throws IOException {
        int i11 = this.f18294i;
        int i12 = i11 + i10;
        int i13 = this.f18292g;
        if (i12 <= i13) {
            throw new IllegalStateException("refillBuffer() called when " + i10 + " bytes were already available in buffer");
        }
        int i14 = this.f18315c;
        int i15 = this.f18296k;
        if (i10 > (i14 - i15) - i11 || i15 + i11 + i10 > this.f18297l) {
            return false;
        }
        if (i11 > 0) {
            if (i13 > i11) {
                byte[] bArr = this.f18291f;
                System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
            }
            this.f18296k += i11;
            this.f18292g -= i11;
            this.f18294i = 0;
        }
        InputStream inputStream = this.f18290e;
        byte[] bArr2 = this.f18291f;
        int i16 = this.f18292g;
        int i17 = inputStream.read(bArr2, i16, Math.min(bArr2.length - i16, (this.f18315c - this.f18296k) - i16));
        if (i17 == 0 || i17 < -1 || i17 > this.f18291f.length) {
            throw new IllegalStateException(this.f18290e.getClass() + "#read(byte[]) returned invalid result: " + i17 + "\nThe InputStream implementation is buggy.");
        }
        if (i17 <= 0) {
            return false;
        }
        this.f18292g += i17;
        z();
        if (this.f18292g >= i10) {
            return true;
        }
        return k(i10);
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00a0 A[PHI: r3
  0x00a0: PHI (r3v13 int) = (r3v12 int), (r3v15 int) binds: [B:25:0x0053, B:29:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int m() throws n1 {
        int i10;
        int i11 = this.f18294i;
        int i12 = this.f18292g;
        if (i12 != i11) {
            byte[] bArr = this.f18291f;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.f18294i = i13;
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
                this.f18294i = i14;
                return i10;
            }
        }
        long j10 = 0;
        for (int i23 = 0; i23 < 64; i23 += 7) {
            if (this.f18294i == this.f18292g) {
                i(1);
            }
            byte[] bArr2 = this.f18291f;
            int i24 = this.f18294i;
            this.f18294i = i24 + 1;
            byte b12 = bArr2[i24];
            j10 |= ((long) (b12 & 127)) << i23;
            if ((b12 & 128) == 0) {
                return (int) j10;
            }
        }
        throw new n1("CodedInputStream encountered a malformed varint.");
    }

    public final int w() throws n1 {
        int i10 = this.f18294i;
        if (this.f18292g - i10 < 4) {
            i(4);
            i10 = this.f18294i;
        }
        byte[] bArr = this.f18291f;
        this.f18294i = i10 + 4;
        return ((bArr[i10 + 3] & 255) << 24) | (bArr[i10] & 255) | ((bArr[i10 + 1] & 255) << 8) | ((bArr[i10 + 2] & 255) << 16);
    }

    public final long x() throws n1 {
        int i10 = this.f18294i;
        if (this.f18292g - i10 < 8) {
            i(8);
            i10 = this.f18294i;
        }
        byte[] bArr = this.f18291f;
        this.f18294i = i10 + 8;
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (((long) bArr[i10]) & 255) | ((((long) bArr[i10 + 1]) & 255) << 8) | ((((long) bArr[i10 + 2]) & 255) << 16) | ((((long) bArr[i10 + 3]) & 255) << 24) | ((((long) bArr[i10 + 4]) & 255) << 32) | ((((long) bArr[i10 + 5]) & 255) << 40) | ((((long) bArr[i10 + 6]) & 255) << 48);
    }

    public final long y() throws n1 {
        long j10;
        long j11;
        long j12;
        int i10 = this.f18294i;
        int i11 = this.f18292g;
        long j13 = 0;
        if (i11 != i10) {
            byte[] bArr = this.f18291f;
            int i12 = i10 + 1;
            byte b10 = bArr[i10];
            if (b10 >= 0) {
                this.f18294i = i12;
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
                this.f18294i = i13;
                return j10;
            }
        }
        for (int i21 = 0; i21 < 64; i21 += 7) {
            if (this.f18294i == this.f18292g) {
                i(1);
            }
            byte[] bArr2 = this.f18291f;
            int i22 = this.f18294i;
            this.f18294i = i22 + 1;
            byte b11 = bArr2[i22];
            j13 |= ((long) (b11 & 127)) << i21;
            if ((b11 & 128) == 0) {
                return j13;
            }
        }
        throw new n1("CodedInputStream encountered a malformed varint.");
    }

    public final void z() {
        int i10 = this.f18292g + this.f18293h;
        this.f18292g = i10;
        int i11 = this.f18296k + i10;
        int i12 = this.f18297l;
        if (i11 <= i12) {
            this.f18293h = 0;
            return;
        }
        int i13 = i11 - i12;
        this.f18293h = i13;
        this.f18292g = i10 - i13;
    }

    public u(InputStream inputStream) {
        Charset charset = l1.f18232a;
        if (inputStream != null) {
            this.f18290e = inputStream;
            this.f18291f = new byte[4096];
            this.f18292g = 0;
            this.f18294i = 0;
            this.f18296k = 0;
            return;
        }
        throw new NullPointerException("input");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final boolean c() {
        return this.f18294i == this.f18292g && !k(1);
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
            int i10 = this.f18292g;
            int i11 = this.f18294i;
            if (iM <= i10 - i11) {
                String str = new String(this.f18291f, i11, iM, l1.f18232a);
                this.f18294i += iM;
                return str;
            }
        }
        if (iM == 0) {
            return "";
        }
        if (iM <= this.f18292g) {
            i(iM);
            String str2 = new String(this.f18291f, this.f18294i, iM, l1.f18232a);
            this.f18294i += iM;
            return str2;
        }
        return new String(f(iM), l1.f18232a);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final String s() throws IOException {
        byte[] bArrF;
        int iM = m();
        int i10 = this.f18294i;
        int i11 = this.f18292g;
        if (iM <= i11 - i10 && iM > 0) {
            bArrF = this.f18291f;
            this.f18294i = i10 + iM;
        } else {
            if (iM == 0) {
                return "";
            }
            if (iM <= i11) {
                i(iM);
                bArrF = this.f18291f;
                this.f18294i = iM;
            } else {
                bArrF = f(iM);
            }
            i10 = 0;
        }
        return d4.f18169a.a(bArrF, i10, iM);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int t() throws n1 {
        if (c()) {
            this.f18295j = 0;
            return 0;
        }
        int iM = m();
        this.f18295j = iM;
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
            this.f18297l = iD;
            z();
            return;
        }
        throw new n1("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final q e() throws IOException {
        int iM = m();
        int i10 = this.f18292g;
        int i11 = this.f18294i;
        if (iM <= i10 - i11 && iM > 0) {
            byte[] bArr = this.f18291f;
            q qVar = s.f18274b;
            s.a(i11, i11 + iM, bArr.length);
            q qVar2 = new q(s.f18275c.a(bArr, i11, iM));
            this.f18294i += iM;
            return qVar2;
        }
        if (iM == 0) {
            return s.f18274b;
        }
        byte[] bArrG = g(iM);
        if (bArrG != null) {
            int length = bArrG.length;
            s.a(0, length, bArrG.length);
            return new q(s.f18275c.a(bArrG, 0, length));
        }
        int i12 = this.f18294i;
        int i13 = this.f18292g;
        int length2 = i13 - i12;
        this.f18296k += i13;
        this.f18294i = 0;
        this.f18292g = 0;
        ArrayList<byte[]> arrayListH = h(iM - length2);
        byte[] bArr2 = new byte[iM];
        System.arraycopy(this.f18291f, i12, bArr2, 0, length2);
        for (byte[] bArr3 : arrayListH) {
            System.arraycopy(bArr3, 0, bArr2, length2, bArr3.length);
            length2 += bArr3.length;
        }
        q qVar3 = s.f18274b;
        return new q(bArr2);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.w
    public final int a() {
        int i10 = this.f18297l;
        if (i10 == Integer.MAX_VALUE) {
            return -1;
        }
        return i10 - (this.f18296k + this.f18294i);
    }
}
