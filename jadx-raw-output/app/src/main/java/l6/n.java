package l6;

import com.google.zxing.BarcodeFormat;
import java.util.Collection;
import java.util.Collections;

/* JADX INFO: compiled from: ITFWriter.java */
/* JADX INFO: loaded from: classes10.dex */
public final class n extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f63458b = {1, 1, 1, 1};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f63459c = {3, 1, 1};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[][] f63460d = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // l6.r
    public Collection<BarcodeFormat> f() {
        return Collections.singleton(BarcodeFormat.ITF);
    }

    @Override // l6.r
    public boolean[] d(String str) {
        int length = str.length();
        if (length % 2 == 0) {
            if (length <= 80) {
                r.c(str);
                boolean[] zArr = new boolean[(length * 9) + 9];
                int iB = r.b(zArr, 0, f63458b, true);
                for (int i10 = 0; i10 < length; i10 += 2) {
                    int iDigit = Character.digit(str.charAt(i10), 10);
                    int iDigit2 = Character.digit(str.charAt(i10 + 1), 10);
                    int[] iArr = new int[10];
                    for (int i11 = 0; i11 < 5; i11++) {
                        int i12 = i11 * 2;
                        int[][] iArr2 = f63460d;
                        iArr[i12] = iArr2[iDigit][i11];
                        iArr[i12 + 1] = iArr2[iDigit2][i11];
                    }
                    iB += r.b(zArr, iB, iArr, true);
                }
                r.b(zArr, iB, f63459c, true);
                return zArr;
            }
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        throw new IllegalArgumentException("The length of the input should be even");
    }
}
