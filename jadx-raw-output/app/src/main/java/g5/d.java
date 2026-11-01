package g5;

import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;

/* JADX INFO: compiled from: CodecSpecificDataUtil.java */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f53064a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f53065b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f53066c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static byte[] a(int i10, int i11, int i12) {
        return new byte[]{(byte) (((i10 << 3) & 248) | ((i11 >> 1) & 7)), (byte) (((i11 << 7) & 128) | ((i12 << 3) & 120))};
    }

    public static byte[] b(int i10, int i11) {
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        while (true) {
            int[] iArr = f53065b;
            if (i13 >= iArr.length) {
                break;
            }
            if (i10 == iArr[i13]) {
                i14 = i13;
            }
            i13++;
        }
        int i15 = -1;
        while (true) {
            int[] iArr2 = f53066c;
            if (i12 >= iArr2.length) {
                break;
            }
            if (i11 == iArr2[i12]) {
                i15 = i12;
            }
            i12++;
        }
        if (i10 != -1 && i15 != -1) {
            return a(2, i14, i15);
        }
        throw new IllegalArgumentException("Invalid sample rate or number of channels: " + i10 + ", " + i11);
    }

    public static String c(int i10, int i11, int i12) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i10), Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static int e(byte[] bArr, int i10) {
        int length = bArr.length - f53064a.length;
        while (i10 <= length) {
            if (h(bArr, i10)) {
                return i10;
            }
            i10++;
        }
        return -1;
    }

    public static int f(s sVar) {
        int iH = sVar.h(5);
        return iH == 31 ? sVar.h(6) + 32 : iH;
    }

    public static int g(s sVar) {
        int iH = sVar.h(4);
        if (iH == 15) {
            return sVar.h(24);
        }
        a.a(iH < 13);
        return f53065b[iH];
    }

    public static boolean h(byte[] bArr, int i10) {
        if (bArr.length - i10 <= f53064a.length) {
            return false;
        }
        int i11 = 0;
        while (true) {
            byte[] bArr2 = f53064a;
            if (i11 >= bArr2.length) {
                return true;
            }
            if (bArr[i10 + i11] != bArr2[i11]) {
                return false;
            }
            i11++;
        }
    }

    public static void l(s sVar, int i10, int i11) {
        sVar.q(1);
        if (sVar.g()) {
            sVar.q(14);
        }
        boolean zG = sVar.g();
        if (i11 == 0) {
            throw new UnsupportedOperationException();
        }
        if (i10 == 6 || i10 == 20) {
            sVar.q(3);
        }
        if (zG) {
            if (i10 == 22) {
                sVar.q(16);
            }
            if (i10 == 17 || i10 == 19 || i10 == 20 || i10 == 23) {
                sVar.q(3);
            }
            sVar.q(1);
        }
    }

    @Nullable
    public static byte[][] m(byte[] bArr) {
        if (!h(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int iE = 0;
        do {
            arrayList.add(Integer.valueOf(iE));
            iE = e(bArr, iE + f53064a.length);
        } while (iE != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i10 = 0;
        while (i10 < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i10)).intValue();
            int iIntValue2 = (i10 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i10 + 1)).intValue() : bArr.length) - iIntValue;
            byte[] bArr3 = new byte[iIntValue2];
            System.arraycopy(bArr, iIntValue, bArr3, 0, iIntValue2);
            bArr2[i10] = bArr3;
            i10++;
        }
        return bArr2;
    }

    public static byte[] d(byte[] bArr, int i10, int i11) {
        byte[] bArr2 = f53064a;
        byte[] bArr3 = new byte[bArr2.length + i11];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i10, bArr3, bArr2.length, i11);
        return bArr3;
    }

    public static Pair<Integer, Integer> j(byte[] bArr) throws ParserException {
        return i(new s(bArr), false);
    }

    public static Pair<Integer, Integer> k(byte[] bArr) {
        t tVar = new t(bArr);
        tVar.L(9);
        int iY = tVar.y();
        tVar.L(20);
        return Pair.create(Integer.valueOf(tVar.C()), Integer.valueOf(iY));
    }

    public static Pair<Integer, Integer> i(s sVar, boolean z10) throws ParserException {
        int iF = f(sVar);
        int iG = g(sVar);
        int iH = sVar.h(4);
        if (iF == 5 || iF == 29) {
            iG = g(sVar);
            iF = f(sVar);
            if (iF == 22) {
                iH = sVar.h(4);
            }
        }
        boolean z11 = true;
        if (z10) {
            if (iF != 1 && iF != 2 && iF != 3 && iF != 4 && iF != 6 && iF != 7 && iF != 17) {
                switch (iF) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw new ParserException("Unsupported audio object type: " + iF);
                }
            }
            l(sVar, iF, iH);
            switch (iF) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iH2 = sVar.h(2);
                    if (iH2 == 2 || iH2 == 3) {
                        throw new ParserException("Unsupported epConfig: " + iH2);
                    }
                    break;
            }
        }
        int i10 = f53066c[iH];
        if (i10 == -1) {
            z11 = false;
        }
        a.a(z11);
        return Pair.create(Integer.valueOf(iG), Integer.valueOf(i10));
    }
}
