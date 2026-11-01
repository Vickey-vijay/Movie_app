package sg.bigo.ads.common.m;

import sg.bigo.ads.common.utils.q;

/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f69749a = {1, 3, 4, 2, 7, 9, 10};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f69750b = {2, 7, 9, 10};

    /* JADX WARN: Code duplicated, block: B:19:0x004d  */
    /* JADX WARN: Code duplicated, block: B:21:0x0057  */
    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0064  */
    /* JADX WARN: Code duplicated, block: B:27:0x006b  */
    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    /* JADX WARN: Code duplicated, block: B:32:0x0086 A[LOOP:0: B:28:0x006f->B:32:0x0086, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x005c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x007b A[SYNTHETIC] */
    public static boolean a() {
        String strConcat;
        boolean z10;
        String strD;
        int[] iArr;
        int length;
        int i10;
        int i11;
        String strConcat2;
        boolean z11;
        if (!b()) {
            return true;
        }
        String strB = b.b();
        if (!q.a((CharSequence) strB)) {
            if (strB.length() < 11) {
                strConcat = "purposeConsents length < 11, so return false";
            } else {
                int[] iArr2 = f69749a;
                int length2 = iArr2.length;
                int i12 = 0;
                while (true) {
                    if (i12 < length2) {
                        int i13 = iArr2[i12];
                        if (strB.charAt(i13 - 1) == '0') {
                            strConcat = "purposeConsents return false ,the checkBit is: ".concat(String.valueOf(i13));
                        } else {
                            i12++;
                        }
                    }
                }
            }
            sg.bigo.ads.common.t.a.a(0, 3, "GdprHelper", strConcat);
            z10 = false;
            if (z10) {
                strD = b.d();
                if (q.a((CharSequence) strD)) {
                    sg.bigo.ads.common.t.a.a(0, 3, "GdprHelper", "purposeLegitimateInterests is empty, so return true");
                } else {
                    if (strD.length() < 11) {
                        strConcat2 = "purposeLegitimateInterests length < 11, so return false";
                    } else {
                        iArr = f69750b;
                        length = iArr.length;
                        i10 = 0;
                        while (true) {
                            if (i10 < length) {
                                i11 = iArr[i10];
                                if (strD.charAt(i11 - 1) == '0') {
                                    strConcat2 = "purposeLegitimateInterests return false ,the checkBit is: ".concat(String.valueOf(i11));
                                } else {
                                    i10++;
                                }
                            }
                        }
                    }
                    sg.bigo.ads.common.t.a.a(0, 3, "GdprHelper", strConcat2);
                    z11 = false;
                    if (z11) {
                        return true;
                    }
                }
                z11 = true;
                if (z11) {
                    return true;
                }
            }
            return false;
        }
        sg.bigo.ads.common.t.a.a(0, 3, "GdprHelper", "purposeConsents is empty, so return true");
        z10 = true;
        if (z10) {
            strD = b.d();
            if (q.a((CharSequence) strD)) {
                sg.bigo.ads.common.t.a.a(0, 3, "GdprHelper", "purposeLegitimateInterests is empty, so return true");
            } else {
                if (strD.length() < 11) {
                    strConcat2 = "purposeLegitimateInterests length < 11, so return false";
                } else {
                    iArr = f69750b;
                    length = iArr.length;
                    i10 = 0;
                    while (true) {
                        if (i10 < length) {
                            i11 = iArr[i10];
                            if (strD.charAt(i11 - 1) == '0') {
                                strConcat2 = "purposeLegitimateInterests return false ,the checkBit is: ".concat(String.valueOf(i11));
                            } else {
                                i10++;
                            }
                        }
                    }
                }
                sg.bigo.ads.common.t.a.a(0, 3, "GdprHelper", strConcat2);
                z11 = false;
                if (z11) {
                    return true;
                }
            }
            z11 = true;
            if (z11) {
                return true;
            }
        }
        return false;
    }

    public static boolean b() {
        return b.c() == 1;
    }
}
