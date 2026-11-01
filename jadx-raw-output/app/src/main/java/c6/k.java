package c6;

import com.google.zxing.DecodeHintType;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: compiled from: StringUtils.java */
/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f5689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final boolean f5690b;

    /* JADX WARN: Code duplicated, block: B:42:0x007e A[PHI: r10
  0x007e: PHI (r10v6 int) = (r10v1 int), (r10v5 int), (r10v1 int) binds: [B:32:0x0061, B:40:0x0079, B:27:0x0056] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:92:0x00eb  */
    public static String a(byte[] bArr, Map<DecodeHintType, ?> map) {
        byte[] bArr2 = bArr;
        if (map != null) {
            DecodeHintType decodeHintType = DecodeHintType.CHARACTER_SET;
            if (map.containsKey(decodeHintType)) {
                return map.get(decodeHintType).toString();
            }
        }
        int length = bArr2.length;
        boolean z10 = true;
        int i10 = 0;
        boolean z11 = bArr2.length > 3 && bArr2[0] == -17 && bArr2[1] == -69 && bArr2[2] == -65;
        boolean z12 = true;
        boolean z13 = true;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        while (i12 < length && (z10 || z12 || z13)) {
            int i22 = bArr2[i12] & 255;
            if (z13) {
                if (i13 > 0) {
                    if ((i22 & 128) != 0) {
                        i13--;
                    } else {
                        z13 = false;
                    }
                } else if ((i22 & 128) != 0) {
                    if ((i22 & 64) != 0) {
                        i13++;
                        if ((i22 & 32) == 0) {
                            i15++;
                        } else {
                            i13++;
                            if ((i22 & 16) == 0) {
                                i16++;
                            } else {
                                i13++;
                                if ((i22 & 8) == 0) {
                                    i17++;
                                } else {
                                    z13 = false;
                                }
                            }
                        }
                    } else {
                        z13 = false;
                    }
                }
            }
            if (z10) {
                if (i22 > 127 && i22 < 160) {
                    z10 = false;
                } else if (i22 > 159 && (i22 < 192 || i22 == 215 || i22 == 247)) {
                    i19++;
                }
            }
            if (z12) {
                if (i14 > 0) {
                    if (i22 < 64 || i22 == 127 || i22 > 252) {
                        z12 = false;
                    } else {
                        i14--;
                    }
                } else if (i22 == 128 || i22 == 160 || i22 > 239) {
                    z12 = false;
                } else if (i22 <= 160 || i22 >= 224) {
                    if (i22 > 127) {
                        i14++;
                        int i23 = i20 + 1;
                        if (i23 > i10) {
                            i10 = i23;
                            i20 = i10;
                        } else {
                            i20 = i23;
                        }
                    } else {
                        i20 = 0;
                    }
                    i21 = 0;
                } else {
                    i11++;
                    int i24 = i21 + 1;
                    if (i24 > i18) {
                        i18 = i24;
                        i21 = i18;
                    } else {
                        i21 = i24;
                    }
                    i20 = 0;
                }
            }
            i12++;
            bArr2 = bArr;
        }
        if (z13 && i13 > 0) {
            z13 = false;
        }
        if (z12 && i14 > 0) {
            z12 = false;
        }
        if (z13 && (z11 || i15 + i16 + i17 > 0)) {
            return "UTF8";
        }
        if (z12 && (f5690b || i18 >= 3 || i10 >= 3)) {
            return "SJIS";
        }
        if (z10 && z12) {
            return (!(i18 == 2 && i11 == 2) && i19 * 10 < length) ? "ISO8859_1" : "SJIS";
        }
        if (z10) {
            return "ISO8859_1";
        }
        if (z12) {
            return "SJIS";
        }
        return z13 ? "UTF8" : f5689a;
    }

    static {
        boolean z10;
        String strName = Charset.defaultCharset().name();
        f5689a = strName;
        if (!"SJIS".equalsIgnoreCase(strName) && !"EUC_JP".equalsIgnoreCase(strName)) {
            z10 = false;
        } else {
            z10 = true;
        }
        f5690b = z10;
    }
}
