package l6;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: compiled from: EAN13Writer.java */
/* JADX INFO: loaded from: classes10.dex */
public final class i extends y {
    @Override // l6.r
    public Collection<BarcodeFormat> f() {
        return Collections.singleton(BarcodeFormat.EAN_13);
    }

    @Override // l6.r
    public boolean[] d(String str) {
        int length = str.length();
        if (length != 12) {
            if (length == 13) {
                try {
                    if (!x.h(str)) {
                        throw new IllegalArgumentException("Contents do not pass checksum");
                    }
                } catch (FormatException unused) {
                    throw new IllegalArgumentException("Illegal contents");
                }
            } else {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
            }
        } else {
            try {
                str = str + x.q(str);
            } catch (FormatException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        r.c(str);
        int i10 = h.f63448j[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int iB = r.b(zArr, 0, x.f63476d, true) + 0;
        for (int i11 = 1; i11 <= 6; i11++) {
            int iDigit = Character.digit(str.charAt(i11), 10);
            if (((i10 >> (6 - i11)) & 1) == 1) {
                iDigit += 10;
            }
            iB += r.b(zArr, iB, x.f63480h[iDigit], false);
        }
        int iB2 = iB + r.b(zArr, iB, x.f63477e, false);
        for (int i12 = 7; i12 <= 12; i12++) {
            iB2 += r.b(zArr, iB2, x.f63479g[Character.digit(str.charAt(i12), 10)], true);
        }
        r.b(zArr, iB2, x.f63476d, true);
        return zArr;
    }
}
