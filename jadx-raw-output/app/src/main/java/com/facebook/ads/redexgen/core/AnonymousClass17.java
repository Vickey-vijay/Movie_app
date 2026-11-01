package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.text.TextUtils;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Arrays;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.17, reason: invalid class name */
/* JADX INFO: loaded from: assets/audience_network.dex */
public final class AnonymousClass17 extends AbstractC10949l {
    public static byte[] A04;
    public static String[] A05 = {"EpUFNdKyF", "ElnVCWkanZ28CNZmVbXI8Cgdfk8l0", "X39VUuGfeiZ7XA2vCr", "EABpQNGHZAa4ZPAJBF04BZM7WLurFTC9", "chwMXTauvlPIh4ZEXg6aw7fxDLbtX6Fs", "XZGBORnRKKQlpHrvvOBFjnqbRPoZpqW4", "uC2aRCtD", "rZqfEylCjzpizgmEVXgae15ipmvYBT3W"};
    public long A00;
    public Uri A01;
    public RandomAccessFile A02;
    public boolean A03;

    public static String A01(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 66);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        byte[] bArr = {99, 108, 105, 96, 86, 119, 102, 87, 96, 100, 97, 74, 117, 96, 107, 111, 96, 101, 108, 90, 123, 106, 91, 108, 104, 109, 91, 72, 79, 47, 36, 35, 56, 113, 57, 48, 34, 113, 32, 36, 52, 35, 40, 113, 48, 63, 53, 126, 62, 35, 113, 55, 35, 48, 54, 60, 52, 63, 37, 125, 113, 38, 57, 56, 50, 57, 113, 48, 35, 52, 113, 63, 62, 37, 113, 34, 36, 33, 33, 62, 35, 37, 52, 53, 127, 113, 21, 56, 53, 113, 40, 62, 36, 113, 50, 48, 61, 61, 113, 4, 35, 56, 127, 33, 48, 35, 34, 52, 121, 120, 113, 62, 63, 113, 48, 113, 34, 37, 35, 56, 63, 54, 113, 50, 62, 63, 37, 48, 56, 63, 56, 63, 54, 113, 118, 110, 118, 113, 62, 35, 113, 118, 114, 118, 110, 113, 4, 34, 52, 113, 4, 35, 56, 127, 55, 35, 62, 60, 23, 56, 61, 52, 121, 63, 52, 38, 113, 23, 56, 61, 52, 121, 33, 48, 37, 57, 120, 120, 113, 37, 62, 113, 48, 39, 62, 56, 53, 113, 37, 57, 56, 34, 127, 113, 33, 48, 37, 57, 108, 116, 34, 125, 32, 36, 52, 35, 40, 108, 116, 34, 125, 55, 35, 48, 54, 60, 52, 63, 37, 108, 116, 34};
        String[] strArr = A05;
        if (strArr[0].length() == strArr[2].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A05;
        strArr2[3] = "X0VoZl0WlZuonvRnqv5GR18rztIlLTBl";
        strArr2[7] = "XOIDFuTAWw0P55lYRHi5z3HfEt22MTH0";
        A04 = bArr;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2589nl
    @MetaExoPlayerCustomization("FB tracing added in D4783963 for calls to TraceUtil.beginSection and TraceUtil.endSection")
    public final long AFy(AnonymousClass56 anonymousClass56) throws C2583nf {
        C4S.A02(A01(0, 15, 71));
        Uri uri = anonymousClass56.A06;
        this.A01 = uri;
        A0G(anonymousClass56);
        this.A02 = A00(uri);
        try {
            try {
                this.A02.seek(anonymousClass56.A04);
                this.A00 = anonymousClass56.A03 == -1 ? this.A02.length() - anonymousClass56.A04 : anonymousClass56.A03;
                C4S.A00();
                if (this.A00 < 0) {
                    throw new C2583nf(null, null, 2008);
                }
                this.A03 = true;
                A0H(anonymousClass56);
                long j10 = this.A00;
                if (A05[1].length() == 32) {
                    throw new RuntimeException();
                }
                String[] strArr = A05;
                strArr[0] = "xa7zJISj9";
                strArr[2] = "YSvWE2PgVF009LXgrm";
                return j10;
            } catch (IOException e10) {
                throw new C2583nf(e10, 2000);
            }
        } catch (Throwable th2) {
            C4S.A00();
            throw th2;
        }
    }

    static {
        A02();
    }

    public AnonymousClass17() {
        super(false);
    }

    public static RandomAccessFile A00(Uri uri) throws C2583nf {
        try {
            return new RandomAccessFile((String) C3M.A01(uri.getPath()), A01(29, 1, 31));
        } catch (FileNotFoundException e10) {
            boolean zIsEmpty = TextUtils.isEmpty(uri.getQuery());
            String[] strArr = A05;
            if (strArr[3].charAt(29) != strArr[7].charAt(29)) {
                throw new RuntimeException();
            }
            A05[1] = "uF4";
            if (zIsEmpty && TextUtils.isEmpty(uri.getFragment())) {
                throw new C2583nf(e10, (AbstractC09664a.A02 < 21 || !AnonymousClass58.A00(e10.getCause())) ? 2005 : 2006);
            }
            throw new C2583nf(String.format(A01(30, 192, 19), uri.getPath(), uri.getQuery(), uri.getFragment()), e10, 1004);
        } catch (SecurityException e11) {
            throw new C2583nf(e11, 2006);
        } catch (RuntimeException e12) {
            throw new C2583nf(e12, 2000);
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2589nl
    public final Uri A9H() {
        return this.A01;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x006d  */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2589nl
    public final void close() throws C2583nf {
        this.A01 = null;
        try {
            try {
                if (this.A02 != null) {
                    this.A02.close();
                }
                this.A02 = null;
                boolean z10 = this.A03;
                String[] strArr = A05;
                if (strArr[0].length() == strArr[2].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[3] = "OaGc5WGUg2QUkWgGCbKJpnMVI4k73TqR";
                strArr2[7] = "7y85lWdOal5lz5BxO7mJ0PPL1NIIxTrt";
                if (z10) {
                    this.A03 = false;
                    A0E();
                }
            } catch (IOException e10) {
                throw new C2583nf(e10, 2000);
            }
        } catch (Throwable th2) {
            this.A02 = null;
            boolean z11 = this.A03;
            String[] strArr3 = A05;
            if (strArr3[3].charAt(29) != strArr3[7].charAt(29)) {
                String[] strArr4 = A05;
                strArr4[0] = "Vm3YcALUN";
                strArr4[2] = "c4edS4Kr4EVyTdnKAl";
                if (z11) {
                    this.A03 = false;
                    A0E();
                }
            } else {
                String[] strArr5 = A05;
                strArr5[5] = "xGGiO6aoc87d3bdrOM0514KxVU6xxq2z";
                strArr5[4] = "rL55lenIs2jXGgYduJCww9Rx5eQkWv1P";
                if (z11) {
                    this.A03 = false;
                    A0E();
                }
            }
            throw th2;
        }
    }

    @Override // com.facebook.ads.redexgen.core.AnonymousClass20
    @MetaExoPlayerCustomization("FB tracing added in D4783963 for calls to TraceUtil.beginSection and TraceUtil.endSection")
    public final int read(byte[] bArr, int i10, int i11) throws C2583nf {
        if (i11 == 0) {
            return 0;
        }
        try {
            if (this.A00 == 0) {
                return -1;
            }
            try {
                C4S.A02(A01(15, 14, 75));
                int i12 = ((RandomAccessFile) AbstractC09664a.A0f(this.A02)).read(bArr, i10, (int) Math.min(this.A00, i11));
                C4S.A00();
                if (i12 > 0) {
                    this.A00 -= (long) i12;
                    A0F(i12);
                }
                return i12;
            } catch (IOException e10) {
                throw new C2583nf(e10, 2000);
            }
        } catch (Throwable th2) {
            C4S.A00();
            throw th2;
        }
    }
}
