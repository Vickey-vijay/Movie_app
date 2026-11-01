package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.content.Context;
import android.graphics.ImageFormat;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.G5;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class cr extends cz {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f1512 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static int f1513 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static short[] f1514 = null;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f1515 = -981190970;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f1516 = -1758668647;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f1517 = 65;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f1518 = {7, -15, -38, 5, 11, -3, 11, -20, 36, -19, 35, 0};

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static String m1752() {
        int i10 = f1512 + 1;
        f1513 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        String sDKVersion = IronSourceAdQuality.getSDKVersion();
        if (!z10) {
            int i11 = 65 / 0;
        }
        int i12 = f1512 + 101;
        f1513 = i12 % 128;
        if ((i12 % 2 == 0 ? G5.T : (char) 26) == 26) {
            return sDKVersion;
        }
        int i13 = 96 / 0;
        return sDKVersion;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static dg m1755() {
        dg dgVar = new dg();
        int i10 = f1512 + 103;
        f1513 = i10 % 128;
        if ((i10 % 2 == 0 ? 'c' : (char) 28) == 28) {
            return dgVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static di m1757() {
        di diVar = new di();
        int i10 = f1513 + 69;
        f1512 = i10 % 128;
        if (i10 % 2 == 0) {
            return diVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Object m1762(cq cqVar, List<Object> list) {
        String str;
        Object objM1851;
        int i10 = f1512 + 95;
        f1513 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            str = (String) cz.m1851(list, 0, String.class);
            objM1851 = cz.m1851(list, 0, JSONObject.class);
        } else {
            str = (String) cz.m1851(list, 0, String.class);
            objM1851 = cz.m1851(list, 1, JSONObject.class);
        }
        cqVar.m1692(str, (JSONObject) objM1851);
        return null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static long m1764() {
        int i10 = f1512 + 43;
        f1513 = i10 % 128;
        int i11 = i10 % 2;
        long jM2780 = jx.m2780();
        int i12 = f1513 + 61;
        f1512 = i12 % 128;
        int i13 = i12 % 2;
        return jM2780;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static long m1766() {
        int i10 = f1512 + 39;
        f1513 = i10 % 128;
        int i11 = i10 % 2;
        long jM2492 = m1745().m2492();
        int i12 = f1512 + 51;
        f1513 = i12 % 128;
        int i13 = i12 % 2;
        return jM2492;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static JSONObject m1771() {
        int i10 = f1513 + 15;
        f1512 = i10 % 128;
        int i11 = i10 % 2;
        ii iiVarM1745 = m1745();
        JSONObject jSONObjectM2803 = jz.m2803(iiVarM1745.m2490(), iiVarM1745.m2489(), iiVarM1745.m2492(), iiVarM1745.m2491());
        int i12 = f1513 + 101;
        f1512 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return jSONObjectM2803;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Object m1774(cq cqVar) {
        int i10 = f1512 + 73;
        f1513 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        Context contextM1689 = cqVar.m1689();
        if (z10) {
            int i11 = 31 / 0;
        }
        return contextM1689;
    }

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private static ii m1745() {
        int i10 = f1512 + 115;
        f1513 = i10 % 128;
        if ((i10 % 2 == 0 ? ')' : 'I') == 'I') {
            return jf.m2656().m2663();
        }
        int i11 = 59 / 0;
        return jf.m2656().m2663();
    }

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    public static JSONObject m1746() {
        int i10 = f1512 + 63;
        f1513 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectM477 = ar.m483().mo495().m477();
        int i12 = f1513 + 23;
        f1512 = i12 % 128;
        if (!(i12 % 2 != 0)) {
            return jSONObjectM477;
        }
        int i13 = 90 / 0;
        return jSONObjectM477;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static double m1747() {
        double dMo499;
        int i10 = f1512 + 9;
        f1513 = i10 % 128;
        if ((i10 % 2 == 0 ? 'c' : (char) 20) != 20) {
            dMo499 = ar.m483().mo499();
            int i11 = 53 / 0;
        } else {
            dMo499 = ar.m483().mo499();
        }
        int i12 = f1512 + 81;
        f1513 = i12 % 128;
        int i13 = i12 % 2;
        return dMo499;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public static String m1748() {
        int i10 = f1513 + 17;
        f1512 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            ar.m483().mo495().m476();
            throw null;
        }
        String strM476 = ar.m483().mo495().m476();
        int i11 = f1513 + 15;
        f1512 = i11 % 128;
        int i12 = i11 % 2;
        return strM476;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public static boolean m1749() {
        int i10 = f1512 + 97;
        f1513 = i10 % 128;
        if ((i10 % 2 == 0 ? 'G' : 'U') == 'U') {
            return ar.m483().mo504();
        }
        ar.m483().mo504();
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static JSONObject m1750() {
        int i10 = f1513 + 5;
        f1512 = i10 % 128;
        if ((i10 % 2 != 0 ? '\b' : (char) 6) != 6) {
            ar.m483().mo495().m517();
            throw null;
        }
        JSONObject jSONObjectM517 = ar.m483().mo495().m517();
        int i11 = f1513 + 81;
        f1512 = i11 % 128;
        if ((i11 % 2 != 0 ? ' ' : '.') == '.') {
            return jSONObjectM517;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public static boolean m1751() {
        boolean zMo500;
        int i10 = f1513 + 39;
        f1512 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 19 : '+') != 19) {
            zMo500 = ar.m483().mo500();
        } else {
            zMo500 = ar.m483().mo500();
            int i11 = 80 / 0;
        }
        int i12 = f1512 + 25;
        f1513 = i12 % 128;
        int i13 = i12 % 2;
        return zMo500;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static String m1753(cq cqVar) {
        int i10 = f1512 + 119;
        f1513 = i10 % 128;
        int i11 = i10 % 2;
        String strM2338 = cqVar.m1688().m2338();
        int i12 = f1513 + 31;
        f1512 = i12 % 128;
        int i13 = i12 % 2;
        return strM2338;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static JSONObject m1754() {
        int i10 = f1512 + 21;
        f1513 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectM2794 = jz.m2794(ar.m483().m517());
        int i12 = f1512 + 59;
        f1513 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return jSONObjectM2794;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static String m1756(cq cqVar) {
        int i10 = f1512 + 69;
        f1513 = i10 % 128;
        int i11 = i10 % 2;
        String strM1611 = cqVar.m1695().m1611();
        int i12 = f1513 + 121;
        f1512 = i12 % 128;
        if (i12 % 2 == 0) {
            return strM1611;
        }
        int i13 = 58 / 0;
        return strM1611;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static String m1758(cq cqVar) {
        int i10 = f1513 + 105;
        f1512 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        cm cmVarM1695 = cqVar.m1695();
        if (!z10) {
            cmVarM1695.m1612();
            throw null;
        }
        String strM1612 = cmVarM1695.m1612();
        int i11 = f1513 + 89;
        f1512 = i11 % 128;
        int i12 = i11 % 2;
        return strM1612;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static dj m1759() {
        dj djVar = new dj();
        int i10 = f1513 + 85;
        f1512 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            return djVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static String m1765(cq cqVar) {
        int i10 = f1513 + 19;
        f1512 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        cm cmVarM1695 = cqVar.m1695();
        if (!z10) {
            return cmVarM1695.m1602();
        }
        cmVarM1695.m1602();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Activity m1773() {
        int i10 = f1513 + 63;
        f1512 = i10 % 128;
        int i11 = i10 % 2;
        Activity activityMo2677 = jj.m2676().mo2677();
        int i12 = f1513 + 99;
        f1512 = i12 % 128;
        if ((i12 % 2 != 0 ? ']' : 'T') != ']') {
            return activityMo2677;
        }
        int i13 = 40 / 0;
        return activityMo2677;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final Object m1776(List<Object> list) {
        String str = (String) cz.m1851(list, 0, String.class);
        List<Object> listM1853 = cz.m1853(list, 1);
        at atVarM2977 = s.m2951().m2977();
        if (atVarM2977 != null) {
            int i10 = f1513 + 39;
            f1512 = i10 % 128;
            int i11 = i10 % 2;
            atVarM2977.m626(str, listM1853);
        }
        int i12 = f1512 + 101;
        f1513 = i12 % 128;
        if ((i12 % 2 == 0 ? '^' : '\n') == '\n') {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static String m1768(cq cqVar) {
        int i10 = f1513 + 111;
        f1512 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        String strM1603 = cqVar.m1695().m1603();
        if (!z10) {
            int i11 = 67 / 0;
        }
        int i12 = f1512 + 49;
        f1513 = i12 % 128;
        int i13 = i12 % 2;
        return strM1603;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static JSONObject m1772(cq cqVar) {
        int i10 = f1512 + 111;
        f1513 = i10 % 128;
        int i11 = i10 % 2;
        JSONObject jSONObjectM1686 = cqVar.m1686();
        int i12 = f1513 + 53;
        f1512 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 18 : '2') == '2') {
            return jSONObjectM1686;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static String m1769(List<Object> list) {
        int i10 = f1512 + 17;
        f1513 = i10 % 128;
        int i11 = i10 % 2;
        String lowerCase = ISAdQualityAdType.fromInt(((Integer) cz.m1851(list, 0, Integer.class)).intValue()).name().toLowerCase();
        int i12 = f1513 + 1;
        f1512 = i12 % 128;
        int i13 = i12 % 2;
        return lowerCase;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Object m1770(List<Object> list) {
        int i10 = f1513 + 41;
        f1512 = i10 % 128;
        int i11 = i10 % 2;
        Object objM475 = ar.m483().mo495().m475((String) cz.m1851(list, 0, String.class));
        int i12 = f1512 + 57;
        f1513 = i12 % 128;
        if ((i12 % 2 == 0 ? '.' : '7') == '7') {
            return objM475;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final Object m1775(final cq cqVar, List<Object> list, final du duVar) {
        final ds dsVar;
        int i10 = f1513 + 69;
        f1512 = i10 % 128;
        if (!(i10 % 2 != 0) ? (dsVar = (ds) cz.m1851(list, 0, ds.class)) != null : (dsVar = (ds) cz.m1851(list, 1, ds.class)) != null) {
            cqVar.m1696(new il() { // from class: com.ironsource.adqualitysdk.sdk.i.cr.3
                @Override // com.ironsource.adqualitysdk.sdk.i.il
                /* JADX INFO: renamed from: ｋ */
                public final JSONObject mo636(String str, JSONObject jSONObject) {
                    return (JSONObject) dsVar.m2097(duVar, cqVar, Arrays.asList(str, jSONObject)).m2089();
                }
            });
        }
        int i11 = f1512 + 89;
        f1513 = i11 % 128;
        int i12 = i11 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m1767(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f2993) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f1517;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f1518;
                if (bArr != null) {
                    i14 = (byte) (bArr[f1515 + i10] + i13);
                } else {
                    i14 = (short) (f1514[f1515 + i10] + i13);
                }
            }
            if (i14 > 0) {
                o.f2994 = ((i10 + i14) - 2) + f1515 + (z10 ? 1 : 0);
                o.f2995 = b10;
                char c10 = (char) (i11 + f1516);
                o.f2997 = c10;
                sb2.append(c10);
                o.f2996 = o.f2997;
                o.f2998 = 1;
                while (o.f2998 < i14) {
                    byte[] bArr2 = f1518;
                    if (bArr2 != null) {
                        int i15 = o.f2994;
                        o.f2994 = i15 - 1;
                        o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i15] + s10)) ^ o.f2995));
                    } else {
                        short[] sArr = f1514;
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Object m1761(cq cqVar) {
        int i10 = f1512 + 83;
        f1513 = i10 % 128;
        int i11 = i10 % 2;
        cm cmVarM1695 = cqVar.m1695();
        int i12 = f1513 + 115;
        f1512 = i12 % 128;
        int i13 = i12 % 2;
        return cmVarM1695;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static dk m1760() {
        dk dkVar = new dk();
        int i10 = f1513 + 125;
        f1512 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            return dkVar;
        }
        int i11 = 10 / 0;
        return dkVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Object m1763(List<Object> list) {
        int i10 = f1513 + 31;
        f1512 = i10 % 128;
        int i11 = i10 % 2;
        k.m2821(m1767((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 981190970, (short) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 1758668713 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (byte) ((-1) - ImageFormat.getBitsPerPixel(0)), TextUtils.getOffsetAfter("", 0) - 53).intern(), (String) cz.m1851(list, 0, String.class));
        int i12 = f1513 + 85;
        f1512 = i12 % 128;
        int i13 = i12 % 2;
        return null;
    }
}
