package io.bidmachine.iab.utils;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes9.dex */
public class Base32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f59317a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 26, 27, 28, 29, 30, 31, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25};

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f59318a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public byte[] f59319b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f59320c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f59321d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f59322e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f59323f;

        private b() {
        }
    }

    private int a(int i10, int i11) {
        int i12 = i10 - Integer.MIN_VALUE;
        int i13 = i11 - Integer.MIN_VALUE;
        if (i12 < i13) {
            return -1;
        }
        return i12 == i13 ? 0 : 1;
    }

    private int a(b bVar) {
        if (bVar.f59319b != null) {
            return bVar.f59320c - bVar.f59321d;
        }
        return 0;
    }

    @NonNull
    public String decode(@NonNull String str) {
        return decode(str.getBytes(Charset.forName("UTF-8")));
    }

    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v20 */
    private void a(byte[] bArr, int i10, int i11, b bVar) {
        byte b10;
        if (bVar.f59322e) {
            return;
        }
        ?? r10 = 1;
        if (i11 < 0) {
            bVar.f59322e = true;
        }
        int i12 = 0;
        int i13 = i10;
        while (i12 < i11) {
            int i14 = i13 + 1;
            byte b11 = bArr[i13];
            if (b11 == 61) {
                bVar.f59322e = r10;
                break;
            }
            byte[] bArrA = a(7, bVar);
            if (b11 >= 0) {
                byte[] bArr2 = f59317a;
                if (b11 < bArr2.length && (b10 = bArr2[b11]) >= 0) {
                    int i15 = (bVar.f59323f + r10) % 8;
                    bVar.f59323f = i15;
                    long j10 = (bVar.f59318a << 5) + ((long) b10);
                    bVar.f59318a = j10;
                    if (i15 == 0) {
                        int i16 = bVar.f59320c;
                        bArrA[i16] = (byte) ((j10 >> 32) & 255);
                        bArrA[i16 + 1] = (byte) ((j10 >> 24) & 255);
                        bArrA[i16 + 2] = (byte) ((j10 >> 16) & 255);
                        bArrA[i16 + 3] = (byte) ((j10 >> 8) & 255);
                        bVar.f59320c = i16 + 5;
                        bArrA[i16 + 4] = (byte) (j10 & 255);
                    }
                }
            }
            i12++;
            i13 = i14;
            r10 = 1;
        }
        if (!bVar.f59322e || bVar.f59323f <= 0) {
            return;
        }
        byte[] bArrA2 = a(7, bVar);
        switch (bVar.f59323f) {
            case 1:
            case 2:
                int i17 = bVar.f59320c;
                bVar.f59320c = i17 + 1;
                bArrA2[i17] = (byte) ((bVar.f59318a >> 2) & 255);
                return;
            case 3:
                int i18 = bVar.f59320c;
                bVar.f59320c = i18 + 1;
                bArrA2[i18] = (byte) ((bVar.f59318a >> 7) & 255);
                return;
            case 4:
                long j11 = bVar.f59318a;
                long j12 = j11 >> 4;
                bVar.f59318a = j12;
                int i19 = bVar.f59320c;
                bArrA2[i19] = (byte) ((j11 >> 12) & 255);
                bVar.f59320c = i19 + 2;
                bArrA2[i19 + 1] = (byte) (j12 & 255);
                return;
            case 5:
                long j13 = bVar.f59318a;
                long j14 = j13 >> 1;
                bVar.f59318a = j14;
                int i20 = bVar.f59320c;
                bArrA2[i20] = (byte) ((j13 >> 17) & 255);
                bArrA2[i20 + 1] = (byte) ((j13 >> 9) & 255);
                bVar.f59320c = i20 + 3;
                bArrA2[i20 + 2] = (byte) (j14 & 255);
                return;
            case 6:
                long j15 = bVar.f59318a;
                long j16 = j15 >> 6;
                bVar.f59318a = j16;
                int i21 = bVar.f59320c;
                bArrA2[i21] = (byte) ((j15 >> 22) & 255);
                bArrA2[i21 + 1] = (byte) ((j15 >> 14) & 255);
                bVar.f59320c = i21 + 3;
                bArrA2[i21 + 2] = (byte) (j16 & 255);
                return;
            case 7:
                long j17 = bVar.f59318a;
                long j18 = j17 >> 3;
                bVar.f59318a = j18;
                int i22 = bVar.f59320c;
                bArrA2[i22] = (byte) ((j17 >> 27) & 255);
                bArrA2[i22 + 1] = (byte) ((j17 >> 19) & 255);
                bArrA2[i22 + 2] = (byte) ((j17 >> 11) & 255);
                bVar.f59320c = i22 + 4;
                bArrA2[i22 + 3] = (byte) (j18 & 255);
                return;
            default:
                throw new IllegalStateException("Impossible modulus " + bVar.f59323f);
        }
    }

    @NonNull
    public String decode(@Nullable byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new String(bArr);
        }
        b bVar = new b();
        a(bArr, 0, bArr.length, bVar);
        a(bArr, 0, -1, bVar);
        int i10 = bVar.f59320c;
        byte[] bArr2 = new byte[i10];
        a(bArr2, i10, bVar);
        return new String(bArr2);
    }

    private byte[] a(int i10, b bVar) {
        byte[] bArr = bVar.f59319b;
        if (bArr == null) {
            bVar.f59319b = new byte[Math.max(i10, 8192)];
            bVar.f59320c = 0;
            bVar.f59321d = 0;
        } else {
            int i11 = bVar.f59320c + i10;
            if (i11 - bArr.length > 0) {
                return a(bVar, i11);
            }
        }
        return bVar.f59319b;
    }

    private void a(byte[] bArr, int i10, b bVar) {
        if (bVar.f59319b != null) {
            int iMin = Math.min(a(bVar), i10);
            System.arraycopy(bVar.f59319b, bVar.f59321d, bArr, 0, iMin);
            int i11 = bVar.f59321d + iMin;
            bVar.f59321d = i11;
            if (i11 >= bVar.f59320c) {
                bVar.f59319b = null;
            }
        }
    }

    private byte[] a(b bVar, int i10) {
        int length = bVar.f59319b.length * 2;
        if (a(length, i10) < 0) {
            length = i10;
        }
        if (a(length, 2147483639) > 0) {
            length = Math.max(i10, 2147483639);
        }
        byte[] bArr = new byte[length];
        byte[] bArr2 = bVar.f59319b;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        bVar.f59319b = bArr;
        return bArr;
    }
}
