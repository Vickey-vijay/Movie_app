package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.drawable.Drawable;
import android.view.ViewConfiguration;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class au extends ar.AnonymousClass4 {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f562 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f563 = 1;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static long f564 = 2051739644234859278L;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final int m651() {
        int i10 = f563 + 21;
        f562 = i10 % 128;
        int i11 = i10 % 2;
        int iM672 = m518().m672();
        int i12 = f562 + 1;
        f563 = i12 % 128;
        int i13 = i12 % 2;
        return iM672;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m645(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2284) {
            char[] cArrM2243 = h.m2243(f564, cArr, i10);
            h.f2285 = 4;
            while (true) {
                int i11 = h.f2285;
                if (i11 < cArrM2243.length) {
                    h.f2283 = i11 - 4;
                    int i12 = h.f2285;
                    cArrM2243[i12] = (char) (((long) (cArrM2243[i12] ^ cArrM2243[i12 % 4])) ^ (((long) h.f2283) * f564));
                    h.f2285++;
                } else {
                    str2 = new String(cArrM2243, 4, cArrM2243.length - 4);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public final boolean m646() {
        int i10 = f563 + 35;
        f562 = i10 % 128;
        int i11 = i10 % 2;
        boolean zOptBoolean = m517().optBoolean(m645("蟰螗፣裾通躁鎻\u1af2", Drawable.resolveOpacity(0, 0)).intern(), true);
        int i12 = f563 + 51;
        f562 = i12 % 128;
        if ((i12 % 2 != 0 ? 'c' : (char) 22) != 'c') {
            return zOptBoolean;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final List<String> m647() {
        int i10 = f563 + 113;
        f562 = i10 % 128;
        if ((i10 % 2 != 0 ? '.' : (char) 15) == '.') {
            m518().m671();
            throw null;
        }
        List<String> listM671 = m518().m671();
        int i11 = f563 + 79;
        f562 = i11 % 128;
        int i12 = i11 % 2;
        return listM671;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final boolean m648() {
        int i10 = f563 + 53;
        f562 = i10 % 128;
        int i11 = i10 % 2;
        boolean zOptBoolean = m517().optBoolean(m645("䓜䒻눍␣ㅴ≉♷꼾", ViewConfiguration.getPressedStateDuration() >> 16).intern(), true);
        int i12 = f562 + 103;
        f563 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return zOptBoolean;
        }
        int i13 = 52 / 0;
        return zOptBoolean;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final int m649() {
        int i10 = f563 + 79;
        f562 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 18 : (char) 22) == 22) {
            return m518().m669();
        }
        m518().m669();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final List<String> m650() {
        int i10 = f563 + 47;
        f562 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            return m518().m674();
        }
        int i11 = 37 / 0;
        return m518().m674();
    }

    public au(ax axVar) {
        m520(axVar);
    }
}
