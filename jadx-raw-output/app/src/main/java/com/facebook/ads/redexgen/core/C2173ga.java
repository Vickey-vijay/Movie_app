package com.facebook.ads.redexgen.core;

import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import javax.annotation.Nullable;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.ga, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public class C2173ga<T> implements OZ<T> {
    public static byte[] A02;
    public static String[] A03 = {"iLl0wsw23K5yUh77EmQ7aS", "GfoEaaBl8U8k0Q7PfB9fbljrax1waY16", "5gtDUT", "ShV5kwK9yY", "0fmlK", "YYoW0eMgewTEbJ6HTbYGGS2KWNlxhaI9", "", "sW1q2ctPu7RNrNZv5Ej0VW9PcKYvvqLT"};
    public int A00;
    public final Object[] A01;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A03[0].length() == 2) {
                throw new RuntimeException();
            }
            A03[0] = "a39lLlVm2wZ";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 94);
            i13++;
        }
    }

    public static void A01() {
        A02 = new byte[]{-15, 28, 34, 21, 17, 20, 41, -48, 25, 30, -48, 36, 24, 21, -48, 32, 31, 31, 28, -47, -63, -43, -46, -115, -38, -50, -27, -115, -35, -36, -36, ExifInterface.MARKER_EOI, -115, -32, -42, -25, -46, -115, -38, -30, -32, ExifInterface.MARKER_APP1, -115, -49, -46, -115, -85, -115, -99};
    }

    static {
        A01();
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ga != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    public C2173ga(int i10) {
        if (i10 > 0) {
            this.A01 = new Object[i10];
            return;
        }
        throw new IllegalArgumentException(A00(20, 29, 15));
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ga != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    private boolean A02(T instance) {
        for (int i10 = 0; i10 < i; i10++) {
            if (this.A01[i10] == instance) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ga != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    @Override // com.facebook.ads.redexgen.core.OZ
    @Nullable
    public T A33() {
        if (this.A00 <= 0) {
            return null;
        }
        int i10 = this.A00 - 1;
        T t10 = (T) this.A01[i10];
        this.A01[i10] = null;
        if (A03[1].charAt(25) == 't') {
            throw new RuntimeException();
        }
        A03[1] = "CkflbgsNAkMx06fZnMm4opLTGkpn7A2i";
        this.A00--;
        return t10;
    }

    /* JADX WARN: Generic types in debug info not equals: com.facebook.ads.redexgen.X.ga != com.facebook.ads.internal.androidx.support.v4.util.Pools$SimplePool<T> */
    @Override // com.facebook.ads.redexgen.core.OZ
    public boolean AGv(T t10) {
        if (!A02(t10)) {
            int i10 = this.A00;
            Object[] objArr = this.A01;
            if (A03[3].length() == 20) {
                throw new RuntimeException();
            }
            A03[4] = "en1OjK";
            if (i10 < objArr.length) {
                this.A01[this.A00] = t10;
                this.A00++;
                return true;
            }
            return false;
        }
        throw new IllegalStateException(A00(0, 20, 82));
    }
}
