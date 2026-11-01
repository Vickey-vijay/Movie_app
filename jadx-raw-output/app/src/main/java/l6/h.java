package l6;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.NotFoundException;

/* JADX INFO: compiled from: EAN13Reader.java */
/* JADX INFO: loaded from: classes10.dex */
public final class h extends x {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f63448j = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f63449i = new int[4];

    public static void r(StringBuilder sb2, int i10) throws NotFoundException {
        for (int i11 = 0; i11 < 10; i11++) {
            if (i10 == f63448j[i11]) {
                sb2.insert(0, (char) (i11 + 48));
                return;
            }
        }
        throw NotFoundException.getNotFoundInstance();
    }

    @Override // l6.x
    public int k(c6.a aVar, int[] iArr, StringBuilder sb2) throws NotFoundException {
        int[] iArr2 = this.f63449i;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iL = aVar.l();
        int i10 = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 6 && i10 < iL; i12++) {
            int i13 = x.i(aVar, iArr2, i10, x.f63480h);
            sb2.append((char) ((i13 % 10) + 48));
            for (int i14 : iArr2) {
                i10 += i14;
            }
            if (i13 >= 10) {
                i11 |= 1 << (5 - i12);
            }
        }
        r(sb2, i11);
        int i15 = x.m(aVar, i10, true, x.f63477e)[1];
        for (int i16 = 0; i16 < 6 && i15 < iL; i16++) {
            sb2.append((char) (x.i(aVar, iArr2, i15, x.f63479g) + 48));
            for (int i17 : iArr2) {
                i15 += i17;
            }
        }
        return i15;
    }

    @Override // l6.x
    public BarcodeFormat p() {
        return BarcodeFormat.EAN_13;
    }
}
