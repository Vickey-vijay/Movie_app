package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.view.ViewConfiguration;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class cy extends cz {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f1646 = 0;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1647 = 1;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static long f1648 = 3474872421718127106L;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Object m1846(cq cqVar, List<Object> list) {
        String string;
        Class cls = (Class) cz.m1851(list, 0, Class.class);
        List arrayList = new ArrayList();
        if (list.size() > 1) {
            int i10 = f1647 + 17;
            f1646 = i10 % 128;
            int i11 = i10 % 2;
            arrayList = (List) cz.m1851(list, 1, List.class);
            int i12 = f1646 + 39;
            f1647 = i12 % 128;
            int i13 = i12 % 2;
        }
        List list2 = list.size() > 2 ? (List) cz.m1851(list, 2, List.class) : null;
        try {
            if (!(list2 != null)) {
                return kb.m2849(cls, (List<Object>) arrayList);
            }
            int i14 = f1647 + 91;
            f1646 = i14 % 128;
            if (!(i14 % 2 != 0)) {
                Class[] clsArr = new Class[list2.size()];
                list2.toArray(clsArr);
                return kb.m2856(cls, arrayList, clsArr);
            }
            Class[] clsArr2 = new Class[list2.size()];
            list2.toArray(clsArr2);
            kb.m2856(cls, arrayList, clsArr2);
            throw null;
        } catch (Exception e10) {
            String strM1612 = cqVar.m1695().m1612();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m1849("片崱Ⳳﾮ콴鹧槧㢷\u086f\udb2a\uaafc疠䕠ᐨ\ue7ac뚣虷儤₰", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 12096).intern());
            sb2.append(cls.getName());
            sb2.append(m1849("爢囮㭝ᾧ\ue006씥꧁牍嚽㬂ᰬ", 9371 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern());
            sb2.append(arrayList);
            if (list2 != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(m1849("爢쀎ᚶ攡뮖เ峠銘\ue119㞤訥\ud8de⼾", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 45677).intern());
                sb3.append(list2);
                string = sb3.toString();
            } else {
                string = "";
            }
            sb2.append(string);
            co.m1623(strM1612, sb2.toString(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m1847(List<Object> list) {
        int i10 = f1646 + 59;
        f1647 = i10 % 128;
        int i11 = i10 % 2;
        if (kb.m2843(cz.m1851(list, 0, Object.class), (String) cz.m1851(list, 1, String.class), (List) cz.m1851(list, 2, List.class)) == null) {
            return false;
        }
        int i12 = f1646 + 79;
        f1647 = i12 % 128;
        int i13 = i12 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Class m1848(List<Object> list) {
        int i10 = f1647 + 41;
        f1646 = i10 % 128;
        int i11 = i10 % 2;
        Class<?> cls = Array.newInstance((Class<?>) cz.m1851(list, 0, Class.class), 0).getClass();
        int i12 = f1647 + 75;
        f1646 = i12 % 128;
        if ((i12 % 2 != 0 ? 'F' : (char) 4) != 'F') {
            return cls;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m1849(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (f.f2019) {
            f.f2017 = i10;
            char[] cArr2 = new char[cArr.length];
            f.f2018 = 0;
            while (true) {
                int i11 = f.f2018;
                if (i11 < cArr.length) {
                    cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2017 * i11))) ^ f1648);
                    f.f2018++;
                } else {
                    str2 = new String(cArr2);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static char m1845(List<Object> list) {
        int i10 = f1647 + 25;
        f1646 = i10 % 128;
        if (i10 % 2 != 0) {
        }
        char cIntValue = (char) ((Number) cz.m1851(list, 0, Number.class)).intValue();
        int i11 = f1647 + 75;
        f1646 = i11 % 128;
        if ((i11 % 2 != 0 ? '#' : ']') != '#') {
            return cIntValue;
        }
        throw null;
    }
}
