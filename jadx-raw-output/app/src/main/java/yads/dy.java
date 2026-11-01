package yads;

/* JADX INFO: loaded from: classes2.dex */
public abstract class dy {
    public static int a(Object obj, Object obj2, int i10, Object obj3, int[] iArr, Object[] objArr, Object[] objArr2) {
        int iA = p01.a(obj == null ? 0 : obj.hashCode());
        int i11 = iA & i10;
        int iA2 = a(i11, obj3);
        if (iA2 == 0) {
            return -1;
        }
        int i12 = ~i10;
        int i13 = iA & i12;
        int i14 = -1;
        while (true) {
            int i15 = iA2 - 1;
            int i16 = iArr[i15];
            if ((i16 & i12) == i13 && l92.a(obj, objArr[i15]) && (objArr2 == null || l92.a(obj2, objArr2[i15]))) {
                int i17 = i16 & i10;
                if (i14 == -1) {
                    a(i11, i17, obj3);
                } else {
                    iArr[i14] = (i17 & i10) | (iArr[i14] & i12);
                }
                return i15;
            }
            int i18 = i16 & i10;
            if (i18 == 0) {
                return -1;
            }
            i14 = i15;
            iA2 = i18;
        }
    }

    public static int a(int i10, Object obj) {
        if (obj instanceof byte[]) {
            return ((byte[]) obj)[i10] & 255;
        }
        if (obj instanceof short[]) {
            return ((short[]) obj)[i10] & 65535;
        }
        return ((int[]) obj)[i10];
    }

    public static void a(int i10, int i11, Object obj) {
        if (obj instanceof byte[]) {
            ((byte[]) obj)[i10] = (byte) i11;
        } else if (obj instanceof short[]) {
            ((short[]) obj)[i10] = (short) i11;
        } else {
            ((int[]) obj)[i10] = i11;
        }
    }
}
