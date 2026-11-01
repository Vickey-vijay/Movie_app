package com.ironsource.adqualitysdk.sdk.i;

import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class cu extends cz {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1525 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1526 = 0;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1527 = 354585702;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1528 = 111;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1529 = 1133685387;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static short[] f1530;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f1531 = {-78, -33, -42, -61, 20, -114, -63, 17, -120, -37, -34, -28, -83, -35, -41, 9, -127, -47, -52, 19, -121, -57, -37, -59, -32, -57, -35, 46, 114, -35, -61, -32, -13, -83, -112, -123, -4, 75, 61, -6, 74, 41, -116, 0, -121, -114, -114, 81, 56, -8, -108, -10, -113, -8, -114, 93, 41, -114, -4, -113, -84};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Object m1787(cq cqVar, List<Object> list) {
        cq cqVar2;
        List list2 = (List) cz.m1851(list, 0, List.class);
        try {
            ds dsVar = (ds) cz.m1851(list, 1, ds.class);
            List<Object> arrayList = new ArrayList<>();
            if ((list.size() > 2 ? 'V' : (char) 0) == 0) {
                cqVar2 = cqVar;
            } else {
                if (!(!cz.m1850(list, 2, cq.class))) {
                    cqVar2 = (cq) cz.m1851(list, 2, cq.class);
                    if (list.size() > 3) {
                        int i10 = f1525 + 15;
                        f1526 = i10 % 128;
                        arrayList = i10 % 2 != 0 ? cz.m1853(list, 5) : cz.m1853(list, 3);
                    }
                } else {
                    arrayList = cz.m1853(list, 2);
                    int i11 = f1525 + 65;
                    f1526 = i11 % 128;
                    int i12 = i11 % 2;
                    cqVar2 = cqVar;
                }
            }
            ArrayList arrayList2 = new ArrayList();
            int i13 = 0;
            while (i13 < list2.size()) {
                arrayList.add(0, list2.get(i13));
                arrayList2.add(dsVar.m2097(cqVar2.m1685(), cqVar2, arrayList).m2089());
                arrayList.remove(0);
                i13++;
                int i14 = f1526 + 49;
                f1525 = i14 % 128;
                int i15 = i14 % 2;
            }
            return arrayList2;
        } catch (Exception e10) {
            co.m1623(cqVar.m1683(), m1786((ViewConfiguration.getScrollBarSize() >> 8) - 354585702, (short) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 47), KeyEvent.keyCodeFromString("") - 1133685318, (byte) (15 - KeyEvent.keyCodeFromString("")), (-113) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), e10);
            return list2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0054 A[Catch: Exception -> 0x0095, TryCatch #0 {Exception -> 0x0095, blocks: (B:3:0x000b, B:15:0x0036, B:23:0x0048, B:25:0x0054, B:28:0x005e, B:29:0x0064, B:31:0x006a, B:34:0x0087, B:35:0x008e, B:26:0x0059, B:18:0x003d), top: B:41:0x000b }] */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final Object m1788(cq cqVar, List<Object> list) {
        cq cqVar2;
        List list2 = (List) cz.m1851(list, 0, List.class);
        try {
            ds dsVar = (ds) cz.m1851(list, 1, ds.class);
            List<Object> arrayList = new ArrayList<>();
            if (list.size() > 2) {
                int i10 = f1525 + 15;
                f1526 = i10 % 128;
                if (!(i10 % 2 == 0)) {
                    if (cz.m1850(list, 3, cq.class)) {
                        cqVar2 = (cq) cz.m1851(list, 2, cq.class);
                        if (list.size() > 3) {
                            arrayList = cz.m1853(list, 3);
                        }
                    }
                    arrayList = cz.m1853(list, 2);
                    cqVar2 = cqVar;
                } else if (cz.m1850(list, 2, cq.class)) {
                    cqVar2 = (cq) cz.m1851(list, 2, cq.class);
                    if (list.size() > 3) {
                        arrayList = cz.m1853(list, 3);
                    }
                } else {
                    arrayList = cz.m1853(list, 2);
                    cqVar2 = cqVar;
                }
            } else {
                cqVar2 = cqVar;
            }
            ArrayList arrayList2 = new ArrayList();
            for (int i11 = 0; i11 < list2.size(); i11++) {
                arrayList.add(0, list2.get(i11));
                if (dsVar.m2097(cqVar2.m1685(), cqVar2, arrayList).m2091()) {
                    int i12 = f1525 + 1;
                    f1526 = i12 % 128;
                    int i13 = i12 % 2;
                    arrayList2.add(list2.get(i11));
                }
                arrayList.remove(0);
            }
            return arrayList2;
        } catch (Exception e10) {
            co.m1623(cqVar.m1683(), m1786(TextUtils.getTrimmedLength("") - 354585669, (short) ((ViewConfiguration.getWindowTouchSlop() >> 8) - 69), TextUtils.lastIndexOf("", '0') - 1133685317, (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 74), (-112) - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), e10);
            return list2;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final Object m1789(cq cqVar, List<Object> list) {
        int i10 = f1525 + 117;
        f1526 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 11 : '<') == '<') {
            m1787(cqVar, list);
            return null;
        }
        m1787(cqVar, list);
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m1786(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f2993) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f1528;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f1531;
                if (bArr != null) {
                    i14 = (byte) (bArr[f1527 + i10] + i13);
                } else {
                    i14 = (short) (f1530[f1527 + i10] + i13);
                }
            }
            if (i14 > 0) {
                o.f2994 = ((i10 + i14) - 2) + f1527 + (z10 ? 1 : 0);
                o.f2995 = b10;
                char c10 = (char) (i11 + f1529);
                o.f2997 = c10;
                sb2.append(c10);
                o.f2996 = o.f2997;
                o.f2998 = 1;
                while (o.f2998 < i14) {
                    byte[] bArr2 = f1531;
                    if (bArr2 != null) {
                        int i15 = o.f2994;
                        o.f2994 = i15 - 1;
                        o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i15] + s10)) ^ o.f2995));
                    } else {
                        short[] sArr = f1530;
                        int i16 = o.f2994;
                        o.f2994 = i16 - 1;
                        o.f2997 = (char) (o.f2996 + (((short) (sArr[i16] + s10)) ^ o.f2995));
                    }
                    sb2.append(o.f2997);
                    o.f2996 = o.f2997;
                    o.f2998++;
                }
            }
            string = sb2.toString();
        }
        return string;
    }
}
