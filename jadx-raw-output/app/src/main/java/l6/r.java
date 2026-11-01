package l6;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: OneDimensionalCodeWriter.java */
/* JADX INFO: loaded from: classes10.dex */
public abstract class r implements y5.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f63465a = Pattern.compile("[0-9]+");

    public static int b(boolean[] zArr, int i10, int[] iArr, boolean z10) {
        int i11 = 0;
        for (int i12 : iArr) {
            int i13 = 0;
            while (i13 < i12) {
                zArr[i10] = z10;
                i13++;
                i10++;
            }
            i11 += i12;
            z10 = !z10;
        }
        return i11;
    }

    public static c6.b g(boolean[] zArr, int i10, int i11, int i12) {
        int length = zArr.length;
        int i13 = i12 + length;
        int iMax = Math.max(i10, i13);
        int iMax2 = Math.max(1, i11);
        int i14 = iMax / i13;
        int i15 = (iMax - (length * i14)) / 2;
        c6.b bVar = new c6.b(iMax, iMax2);
        int i16 = 0;
        while (i16 < length) {
            if (zArr[i16]) {
                bVar.m(i15, 0, i14, iMax2);
            }
            i16++;
            i15 += i14;
        }
        return bVar;
    }

    public abstract boolean[] d(String str);

    public int e() {
        return 10;
    }

    public abstract Collection<BarcodeFormat> f();

    public static void c(String str) {
        if (!f63465a.matcher(str).matches()) {
            throw new IllegalArgumentException("Input should only contain digits 0-9");
        }
    }

    @Override // y5.l
    public c6.b a(String str, BarcodeFormat barcodeFormat, int i10, int i11, Map<EncodeHintType, ?> map) {
        if (!str.isEmpty()) {
            if (i10 >= 0 && i11 >= 0) {
                Collection<BarcodeFormat> collectionF = f();
                if (collectionF != null && !collectionF.contains(barcodeFormat)) {
                    throw new IllegalArgumentException("Can only encode " + collectionF + ", but got " + barcodeFormat);
                }
                int iE = e();
                if (map != null) {
                    EncodeHintType encodeHintType = EncodeHintType.MARGIN;
                    if (map.containsKey(encodeHintType)) {
                        iE = Integer.parseInt(map.get(encodeHintType).toString());
                    }
                }
                return g(d(str), i10, i11, iE);
            }
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i10 + 'x' + i11);
        }
        throw new IllegalArgumentException("Found empty contents");
    }
}
