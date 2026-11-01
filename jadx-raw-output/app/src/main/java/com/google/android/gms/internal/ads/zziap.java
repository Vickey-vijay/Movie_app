package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-api@@24.9.0 */
/* JADX INFO: loaded from: classes2.dex */
final class zziap extends zziaq {
    private final InputStream zzf;
    private final byte[] zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private int zzm;

    public /* synthetic */ zziap(InputStream inputStream, int i10, byte[] bArr) {
        super(null);
        this.zzm = Integer.MAX_VALUE;
        Charset charset = zzice.zza;
        this.zzf = inputStream;
        this.zzg = new byte[4096];
        this.zzh = 0;
        this.zzj = 0;
        this.zzl = 0;
    }

    private final void zzN() {
        int i10 = this.zzh + this.zzi;
        this.zzh = i10;
        int i11 = this.zzl + i10;
        int i12 = this.zzm;
        if (i11 <= i12) {
            this.zzi = 0;
            return;
        }
        int i13 = i11 - i12;
        this.zzi = i13;
        this.zzh = i10 - i13;
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final int zzC() {
        return this.zzl + this.zzj;
    }

    public final long zzw() throws IOException {
        long j10 = 0;
        for (int i10 = 0; i10 < 64; i10 += 7) {
            byte bZzD = zzD();
            j10 |= ((long) (bZzD & 127)) << i10;
            if ((bZzD & 128) == 0) {
                return j10;
            }
        }
        throw new zzicg("CodedInputStream encountered a malformed varint.");
    }

    private final boolean zzP(int i10) throws IOException {
        int i11 = this.zzj;
        int i12 = i11 + i10;
        int i13 = this.zzh;
        if (i12 <= i13) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 66);
            sb2.append("refillBuffer() called when ");
            sb2.append(i10);
            sb2.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb2.toString());
        }
        int i14 = this.zzl;
        if (i10 > (Integer.MAX_VALUE - i14) - i11 || i14 + i11 + i10 > this.zzm) {
            return false;
        }
        if (i11 > 0) {
            if (i13 > i11) {
                byte[] bArr = this.zzg;
                System.arraycopy(bArr, i11, bArr, 0, i13 - i11);
            }
            i14 = this.zzl + i11;
            this.zzl = i14;
            i13 = this.zzh - i11;
            this.zzh = i13;
            this.zzj = 0;
        }
        try {
            int i15 = this.zzf.read(this.zzg, i13, Math.min(4096 - i13, (Integer.MAX_VALUE - i14) - i13));
            if (i15 != 0 && i15 >= -1 && i15 <= 4096) {
                if (i15 <= 0) {
                    return false;
                }
                this.zzh += i15;
                zzN();
                return this.zzh >= i10 || zzP(i10);
            }
            String strValueOf = String.valueOf(this.zzf.getClass());
            StringBuilder sb3 = new StringBuilder(strValueOf.length() + 39 + String.valueOf(i15).length() + 41);
            sb3.append(strValueOf);
            sb3.append("#read(byte[]) returned invalid result: ");
            sb3.append(i15);
            sb3.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb3.toString());
        } catch (zzicg e10) {
            e10.zza();
            throw e10;
        }
    }

    private final byte[] zzR(int i10) throws IOException {
        if (i10 == 0) {
            return zzice.zzb;
        }
        int i11 = this.zzl;
        int i12 = this.zzj;
        int i13 = i11 + i12 + i10;
        if ((-2147483647) + i13 > 0) {
            throw new zzicg("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i14 = this.zzm;
        if (i13 > i14) {
            zzE((i14 - i11) - i12);
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        int i15 = this.zzh - i12;
        int i16 = i10 - i15;
        if (i16 >= 4096) {
            try {
                if (i16 > this.zzf.available()) {
                    return null;
                }
            } catch (zzicg e10) {
                e10.zza();
                throw e10;
            }
        }
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zzg, this.zzj, bArr, 0, i15);
        this.zzl += this.zzh;
        this.zzj = 0;
        this.zzh = 0;
        while (i15 < i10) {
            try {
                int i17 = this.zzf.read(bArr, i15, i10 - i15);
                if (i17 == -1) {
                    throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzl += i17;
                i15 += i17;
            } catch (zzicg e11) {
                e11.zza();
                throw e11;
            }
        }
        return bArr;
    }

    private final List zzS(int i10) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i10 > 0) {
            int iMin = Math.min(i10, 4096);
            byte[] bArr = new byte[iMin];
            int i11 = 0;
            while (i11 < iMin) {
                int i12 = this.zzf.read(bArr, i11, iMin - i11);
                if (i12 == -1) {
                    throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
                }
                this.zzl += i12;
                i11 += i12;
            }
            i10 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final void zzA(int i10) {
        this.zzm = i10;
        zzN();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final boolean zzB() throws IOException {
        return this.zzj == this.zzh && !zzP(1);
    }

    public final byte zzD() throws IOException {
        if (this.zzj == this.zzh) {
            zzO(1);
        }
        byte[] bArr = this.zzg;
        int i10 = this.zzj;
        this.zzj = i10 + 1;
        return bArr[i10];
    }

    public final void zzE(int i10) throws IOException {
        int i11 = this.zzh;
        int i12 = this.zzj;
        int i13 = i11 - i12;
        if (i10 <= i13 && i10 >= 0) {
            this.zzj = i12 + i10;
            return;
        }
        if (i10 < 0) {
            throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i14 = this.zzl;
        int i15 = i14 + i12;
        int i16 = this.zzm;
        if (i15 + i10 > i16) {
            zzE((i16 - i14) - i12);
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzl = i15;
        this.zzh = 0;
        this.zzj = 0;
        while (i13 < i10) {
            try {
                long j10 = i10 - i13;
                try {
                    long jSkip = this.zzf.skip(j10);
                    if (jSkip < 0 || jSkip > j10) {
                        String strValueOf = String.valueOf(this.zzf.getClass());
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 31 + String.valueOf(jSkip).length() + 41);
                        sb2.append(strValueOf);
                        sb2.append("#skip returned invalid result: ");
                        sb2.append(jSkip);
                        sb2.append("\nThe InputStream implementation is buggy.");
                        throw new IllegalStateException(sb2.toString());
                    }
                    if (jSkip == 0) {
                        break;
                    } else {
                        i13 += (int) jSkip;
                    }
                } catch (zzicg e10) {
                    e10.zza();
                    throw e10;
                }
            } catch (Throwable th2) {
                this.zzl += i13;
                zzN();
                throw th2;
            }
        }
        this.zzl += i13;
        zzN();
        if (i13 >= i10) {
            return;
        }
        int i17 = this.zzh;
        int i18 = i17 - this.zzj;
        this.zzj = i17;
        zzO(1);
        while (true) {
            int i19 = i10 - i18;
            int i20 = this.zzh;
            if (i19 <= i20) {
                this.zzj = i19;
                return;
            } else {
                i18 += i20;
                this.zzj = i20;
                zzO(1);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final void zzb(int i10) throws zzicg {
        if (this.zzk != i10) {
            throw new zzicg("Protocol message end-group tag did not match expected tag.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final boolean zzc(int i10) throws IOException {
        int i11 = i10 & 7;
        int i12 = 0;
        if (i11 == 0) {
            if (this.zzh - this.zzj < 10) {
                while (i12 < 10) {
                    if (zzD() < 0) {
                        i12++;
                    }
                }
                throw new zzicg("CodedInputStream encountered a malformed varint.");
            }
            while (i12 < 10) {
                byte[] bArr = this.zzg;
                int i13 = this.zzj;
                this.zzj = i13 + 1;
                if (bArr[i13] < 0) {
                    i12++;
                }
            }
            throw new zzicg("CodedInputStream encountered a malformed varint.");
            return true;
        }
        if (i11 == 1) {
            zzE(8);
            return true;
        }
        if (i11 == 2) {
            zzE(zzu());
            return true;
        }
        if (i11 == 3) {
            zzJ();
            zzb(((i10 >>> 3) << 3) | 4);
            return true;
        }
        if (i11 == 4) {
            zzI();
            return false;
        }
        if (i11 != 5) {
            throw new zzicf("Protocol message tag had invalid wire type.");
        }
        zzE(4);
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r2[r3] < 0) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzu() throws java.io.IOException {
        /*
            r5 = this;
            int r0 = r5.zzj
            int r1 = r5.zzh
            if (r1 != r0) goto L7
            goto L6d
        L7:
            byte[] r2 = r5.zzg
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.zzj = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6d
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L6a
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L6a
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L6a
        L3e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L6a
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L6a
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 >= 0) goto L6a
            goto L6d
        L6a:
            r5.zzj = r1
            return r0
        L6d:
            long r0 = r5.zzw()
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zziap.zzu():int");
    }

    public final long zzv() throws IOException {
        long j10;
        long j11;
        long j12;
        long j13;
        int i10;
        int i11 = this.zzj;
        int i12 = this.zzh;
        if (i12 != i11) {
            byte[] bArr = this.zzg;
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 >= 0) {
                this.zzj = i13;
                return b10;
            }
            if (i12 - i13 >= 9) {
                int i14 = i13 + 1;
                int i15 = b10 ^ (bArr[i13] << 7);
                if (i15 >= 0) {
                    int i16 = i14 + 1;
                    int i17 = i15 ^ (bArr[i14] << 14);
                    if (i17 < 0) {
                        i14 = i16 + 1;
                        int i18 = i17 ^ (bArr[i16] << 21);
                        if (i18 < 0) {
                            i10 = i18 ^ (-2080896);
                        } else {
                            i16 = i14 + 1;
                            long j14 = ((long) i18) ^ (((long) bArr[i14]) << 28);
                            if (j14 >= 0) {
                                j11 = 266354560;
                            } else {
                                int i19 = i16 + 1;
                                long j15 = j14 ^ (((long) bArr[i16]) << 35);
                                if (j15 < 0) {
                                    j10 = -34093383808L;
                                } else {
                                    i16 = i19 + 1;
                                    j14 = j15 ^ (((long) bArr[i19]) << 42);
                                    if (j14 >= 0) {
                                        j11 = 4363953127296L;
                                    } else {
                                        i19 = i16 + 1;
                                        j15 = j14 ^ (((long) bArr[i16]) << 49);
                                        if (j15 < 0) {
                                            j10 = -558586000294016L;
                                        } else {
                                            i16 = i19 + 1;
                                            j14 = j15 ^ (((long) bArr[i19]) << 56);
                                            if (j14 >= 0) {
                                                j11 = 71499008037633920L;
                                            } else {
                                                i19 = i16 + 1;
                                                j15 = j14 ^ (((long) bArr[i16]) << 63);
                                                if (j15 >= 0) {
                                                    j10 = -9151873028817141888L;
                                                }
                                            }
                                        }
                                    }
                                }
                                j12 = j10 ^ j15;
                                i14 = i19;
                            }
                            j13 = j14 ^ j11;
                        }
                        this.zzj = i14;
                        return j12;
                    }
                    j13 = i17 ^ 16256;
                    i14 = i16;
                    j12 = j13;
                    this.zzj = i14;
                    return j12;
                }
                i10 = i15 ^ (-128);
                j12 = i10;
                this.zzj = i14;
                return j12;
            }
        }
        return zzw();
    }

    public final int zzx() throws IOException {
        int i10 = this.zzj;
        if (this.zzh - i10 < 4) {
            zzO(4);
            i10 = this.zzj;
        }
        byte[] bArr = this.zzg;
        this.zzj = i10 + 4;
        int i11 = bArr[i10] & 255;
        int i12 = bArr[i10 + 1] & 255;
        int i13 = bArr[i10 + 2] & 255;
        return ((bArr[i10 + 3] & 255) << 24) | (i12 << 8) | i11 | (i13 << 16);
    }

    public final long zzy() throws IOException {
        int i10 = this.zzj;
        if (this.zzh - i10 < 8) {
            zzO(8);
            i10 = this.zzj;
        }
        byte[] bArr = this.zzg;
        this.zzj = i10 + 8;
        long j10 = bArr[i10];
        long j11 = (((long) bArr[i10 + 1]) & 255) << 8;
        long j12 = bArr[i10 + 2];
        long j13 = bArr[i10 + 3];
        return ((((long) bArr[i10 + 7]) & 255) << 56) | (j10 & 255) | j11 | ((j12 & 255) << 16) | ((j13 & 255) << 24) | ((bArr[i10 + 4] & 255) << 32) | ((bArr[i10 + 5] & 255) << 40) | ((bArr[i10 + 6] & 255) << 48);
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final int zzz(int i10) throws zzicg {
        if (i10 < 0) {
            throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
        int i11 = i10 + this.zzl + this.zzj;
        if (i11 < 0) {
            throw new zzicg("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
        }
        int i12 = this.zzm;
        if (i11 > i12) {
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
        this.zzm = i11;
        zzN();
        return i12;
    }

    private final void zzO(int i10) throws IOException {
        if (!zzP(i10)) {
            if (i10 > (Integer.MAX_VALUE - this.zzl) - this.zzj) {
                throw new zzicg("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit. If reading multiple messages, consider resetting the counter between each message using CodedInputStream.resetSizeCounter().");
            }
            throw new zzicg("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    private final byte[] zzQ(int i10, boolean z10) throws IOException {
        byte[] bArrZzR = zzR(i10);
        if (bArrZzR != null) {
            return bArrZzR;
        }
        int i11 = this.zzj;
        int i12 = this.zzh;
        int i13 = i12 - i11;
        this.zzl += i12;
        this.zzj = 0;
        this.zzh = 0;
        List<byte[]> listZzS = zzS(i10 - i13);
        byte[] bArr = new byte[i10];
        System.arraycopy(this.zzg, i11, bArr, 0, i13);
        for (byte[] bArr2 : listZzS) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i13, length);
            i13 += length;
        }
        return bArr;
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final int zza() throws IOException {
        if (zzB()) {
            this.zzk = 0;
            return 0;
        }
        int iZzu = zzu();
        this.zzk = iZzu;
        if ((iZzu >>> 3) != 0) {
            return iZzu;
        }
        throw new zzicg("Protocol message contained an invalid tag (zero).");
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final double zzd() throws IOException {
        return Double.longBitsToDouble(zzy());
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final float zze() throws IOException {
        return Float.intBitsToFloat(zzx());
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final long zzf() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final long zzg() throws IOException {
        return zzv();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final int zzh() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final long zzi() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final int zzj() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final boolean zzk() throws IOException {
        if (zzv() != 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final String zzl() throws IOException {
        int iZzu = zzu();
        if (iZzu > 0) {
            int i10 = this.zzh;
            int i11 = this.zzj;
            if (iZzu <= i10 - i11) {
                String str = new String(this.zzg, i11, iZzu, zzice.zza);
                this.zzj += iZzu;
                return str;
            }
        }
        if (iZzu == 0) {
            return "";
        }
        if (iZzu >= 0) {
            if (iZzu <= this.zzh) {
                zzO(iZzu);
                String str2 = new String(this.zzg, this.zzj, iZzu, zzice.zza);
                this.zzj += iZzu;
                return str2;
            }
            return new String(zzQ(iZzu, false), zzice.zza);
        }
        throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final String zzm() throws IOException {
        byte[] bArrZzQ;
        int iZzu = zzu();
        int i10 = this.zzj;
        int i11 = this.zzh;
        if (iZzu <= i11 - i10 && iZzu > 0) {
            bArrZzQ = this.zzg;
            this.zzj = i10 + iZzu;
        } else {
            if (iZzu == 0) {
                return "";
            }
            if (iZzu >= 0) {
                if (iZzu <= i11) {
                    zzO(iZzu);
                    bArrZzQ = this.zzg;
                    this.zzj = iZzu;
                } else {
                    bArrZzQ = zzQ(iZzu, false);
                }
                i10 = 0;
            } else {
                throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
            }
        }
        return zzier.zze(bArrZzQ, i10, iZzu);
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final zzian zzn() throws IOException {
        int iZzu = zzu();
        int i10 = this.zzh;
        int i11 = this.zzj;
        if (iZzu <= i10 - i11 && iZzu > 0) {
            zzian zzianVarZzt = zzian.zzt(this.zzg, i11, iZzu, false);
            this.zzj += iZzu;
            return zzianVarZzt;
        }
        if (iZzu == 0) {
            return zzian.zza;
        }
        if (iZzu >= 0) {
            byte[] bArrZzR = zzR(iZzu);
            if (bArrZzR != null) {
                return zzian.zzt(bArrZzR, 0, bArrZzR.length, false);
            }
            int i12 = this.zzj;
            int i13 = this.zzh;
            int i14 = i13 - i12;
            this.zzl += i13;
            this.zzj = 0;
            this.zzh = 0;
            List<byte[]> listZzS = zzS(iZzu - i14);
            byte[] bArr = new byte[iZzu];
            System.arraycopy(this.zzg, i12, bArr, 0, i14);
            for (byte[] bArr2 : listZzS) {
                int length = bArr2.length;
                System.arraycopy(bArr2, 0, bArr, i14, length);
                i14 += length;
            }
            return zzian.zzu(bArr);
        }
        throw new zzicg("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final int zzo() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final int zzp() throws IOException {
        return zzu();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final int zzq() throws IOException {
        return zzx();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final long zzr() throws IOException {
        return zzy();
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final int zzs() throws IOException {
        return zziaq.zzK(zzu());
    }

    @Override // com.google.android.gms.internal.ads.zziaq
    public final long zzt() throws IOException {
        return zziaq.zzL(zzv());
    }
}
