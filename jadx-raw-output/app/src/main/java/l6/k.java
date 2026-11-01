package l6;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.FormatException;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: compiled from: EAN8Writer.java */
/* JADX INFO: loaded from: classes10.dex */
public final class k extends y {
    @Override // l6.r
    public Collection<BarcodeFormat> f() {
        return Collections.singleton(BarcodeFormat.EAN_8);
    }

    @Override // l6.r
    public boolean[] d(String str) {
        int length = str.length();
        if (length != 7) {
            if (length == 8) {
                try {
                    if (!x.h(str)) {
                        throw new IllegalArgumentException("Contents do not pass checksum");
                    }
                } catch (FormatException unused) {
                    throw new IllegalArgumentException("Illegal contents");
                }
            } else {
                throw new IllegalArgumentException("Requested contents should be 7 or 8 digits long, but got ".concat(String.valueOf(length)));
            }
        } else {
            try {
                str = str + x.q(str);
            } catch (FormatException e10) {
                throw new IllegalArgumentException(e10);
            }
        }
        r.c(str);
        boolean[] zArr = new boolean[67];
        int iB = r.b(zArr, 0, x.f63476d, true) + 0;
        for (int i10 = 0; i10 <= 3; i10++) {
            iB += r.b(zArr, iB, x.f63479g[Character.digit(str.charAt(i10), 10)], false);
        }
        int iB2 = iB + r.b(zArr, iB, x.f63477e, false);
        for (int i11 = 4; i11 <= 7; i11++) {
            iB2 += r.b(zArr, iB2, x.f63479g[Character.digit(str.charAt(i11), 10)], true);
        }
        r.b(zArr, iB2, x.f63476d, true);
        return zArr;
    }
}
