package v6;

import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

/* JADX INFO: compiled from: FormatInformation.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[][] f73113c = {new int[]{21522, 0}, new int[]{20773, 1}, new int[]{24188, 2}, new int[]{23371, 3}, new int[]{17913, 4}, new int[]{16590, 5}, new int[]{20375, 6}, new int[]{19104, 7}, new int[]{30660, 8}, new int[]{29427, 9}, new int[]{32170, 10}, new int[]{30877, 11}, new int[]{26159, 12}, new int[]{25368, 13}, new int[]{27713, 14}, new int[]{26998, 15}, new int[]{5769, 16}, new int[]{5054, 17}, new int[]{7399, 18}, new int[]{6608, 19}, new int[]{1890, 20}, new int[]{597, 21}, new int[]{3340, 22}, new int[]{2107, 23}, new int[]{13663, 24}, new int[]{12392, 25}, new int[]{16177, 26}, new int[]{14854, 27}, new int[]{9396, 28}, new int[]{8579, 29}, new int[]{11994, 30}, new int[]{11245, 31}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ErrorCorrectionLevel f73114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte f73115b;

    public static int e(int i10, int i11) {
        return Integer.bitCount(i10 ^ i11);
    }

    public static d b(int i10, int i11) {
        int iE;
        int i12 = Integer.MAX_VALUE;
        int i13 = 0;
        for (int[] iArr : f73113c) {
            int i14 = iArr[0];
            if (i14 == i10 || i14 == i11) {
                return new d(iArr[1]);
            }
            int iE2 = e(i10, i14);
            if (iE2 < i12) {
                i13 = iArr[1];
                i12 = iE2;
            }
            if (i10 != i11 && (iE = e(i11, i14)) < i12) {
                i13 = iArr[1];
                i12 = iE;
            }
        }
        if (i12 <= 3) {
            return new d(i13);
        }
        return null;
    }

    public byte c() {
        return this.f73115b;
    }

    public ErrorCorrectionLevel d() {
        return this.f73114a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f73114a == dVar.f73114a && this.f73115b == dVar.f73115b;
    }

    public int hashCode() {
        return (this.f73114a.ordinal() << 3) | this.f73115b;
    }

    public d(int i10) {
        this.f73114a = ErrorCorrectionLevel.forBits((i10 >> 3) & 3);
        this.f73115b = (byte) (i10 & 7);
    }

    public static d a(int i10, int i11) {
        d dVarB = b(i10, i11);
        if (dVarB != null) {
            return dVarB;
        }
        return b(i10 ^ 21522, i11 ^ 21522);
    }
}
