package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ogury.ad.OguryInterstitialAd;
import com.ogury.ad.OguryInterstitialAdListener;
import com.ogury.ad.OguryReward;
import com.ogury.ad.OguryRewardedAd;
import com.ogury.ad.OguryRewardedAdListener;
import com.ogury.ad.interstitial.ui.InterstitialActivity;
import com.ogury.sdk.Ogury;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class by extends bd {

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f1168 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f1169 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static byte[] f1170 = {-78, -68, 68, -70, 66, -90, -107, 98, -68, 79, 66, -68, 66, -74, -74, -70, 70, -79, -110, 83, -91, 123, -120, -123, 123, -123, 113, 113, 125, -127, 118, 85, -96, 119, -115, 126, 104, 71, -67, 67, -69, 75, 64, 87, -94, 105, -97, 65, -78, -65, 65, -65, 75, 75, 71, -69, 76, 111, -102, 77, -73, 68, 82, -107, 107, 73, -73, 68, -89, 92, -92, -91, 111, -79, 75, -72, -82, 0, 0, 0, 0};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f1171 = -1192899773;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static short[] f1172 = null;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f1173 = 121;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char f1174 = 24841;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static char f1175 = 1693;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char f1176 = 5365;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char f1177 = 19646;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f1178 = -780611821;

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻐ */
    public final Map<String, bd.b> mo736() {
        HashMap map = new HashMap();
        map.put(m1358("ㆽ쮋셖렴犱哩ৌ耧컥ɯ蜕귭㛪磇제ቹ\u18af놤\u0cf4垨뤪᭸䭃\ue1a0ൈំ", View.getDefaultSize(0, 0) + 25).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.by.1
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                by.m1359((OguryInterstitialAd) list.get(0), (OguryInterstitialAdListener) list.get(1));
                return null;
            }
        });
        map.put(m1358("ㆽ쮋빺稸ﻱӎ靂职愖ꓛ搗鈐\u18af놤\u0cf4垨뤪᭸䭃\ue1a0ൈំ", View.resolveSize(0, 0) + 21).intern(), new bd.b() { // from class: com.ironsource.adqualitysdk.sdk.i.by.3
            @Override // com.ironsource.adqualitysdk.sdk.i.bd.b
            /* JADX INFO: renamed from: ｋ */
            public final Object mo739(List<Object> list, ch chVar) {
                by.m1360((OguryRewardedAd) list.get(0), (OguryRewardedAdListener) list.get(1));
                return null;
            }
        });
        int i10 = f1168 + 47;
        f1169 = i10 % 128;
        if ((i10 % 2 != 0 ? 'K' : (char) 16) == 16) {
            return map;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﻛ */
    public final String mo737() {
        int i10 = f1168 + 55;
        f1169 = i10 % 128;
        try {
            if (!(i10 % 2 != 0)) {
                return Ogury.getSdkVersion();
            }
            Ogury.getSdkVersion();
            throw null;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m1359(OguryInterstitialAd oguryInterstitialAd, OguryInterstitialAdListener oguryInterstitialAdListener) {
        int i10 = f1169 + 67;
        f1168 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        m1355(oguryInterstitialAd, oguryInterstitialAdListener);
        if (!z10) {
            throw null;
        }
        int i11 = f1169 + 69;
        f1168 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m1360(OguryRewardedAd oguryRewardedAd, OguryRewardedAdListener oguryRewardedAdListener) {
        int i10 = f1168 + 39;
        f1169 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        m1356(oguryRewardedAd, oguryRewardedAdListener);
        if (z10) {
        } else {
            throw null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0137  */
    @Override // com.ironsource.adqualitysdk.sdk.i.bd
    /* JADX INFO: renamed from: ﾒ */
    public final Class mo738(String str) {
        byte b10 = 1;
        int i10 = f1168 + 1;
        f1169 = i10 % 128;
        int i11 = i10 % 2;
        switch (str.hashCode()) {
            case -1704786309:
                if ((str.equals(m1357(780611821 - View.getDefaultSize(0, 0), (short) Color.green(0), 1192899846 - Color.alpha(0), (byte) ((-74) - TextUtils.indexOf((CharSequence) "", '0')), TextUtils.getTrimmedLength("") + (-101)).intern()) ? ']' : '=') == '=') {
                    b10 = -1;
                }
                break;
            case -734879533:
                b10 = !str.equals(m1358("ᆁ嵭ꌻໄ﮼䑧ﻱӎ靂职֞\udab2", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 11).intern()) ? (byte) -1 : (byte) 7;
                break;
            case 76142724:
                if ((str.equals(m1358("ᆁ嵭ꌻໄꭸ旹", Color.red(0) + 5).intern()) ? '^' : (char) 4) == '^') {
                    b10 = 2;
                } else {
                    b10 = -1;
                }
                break;
            case 82913255:
                if (!str.equals(m1357(780611859 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (short) ((-1) - MotionEvent.axisFromString("")), Drawable.resolveOpacity(0, 0) + 1192899852, (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 74), (-94) - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern())) {
                    b10 = -1;
                } else {
                    int i12 = f1169 + 119;
                    f1168 = i12 % 128;
                    if (i12 % 2 != 0) {
                        b10 = 4;
                    } else {
                        b10 = 2;
                    }
                }
                break;
            case 186993737:
                b10 = !str.equals(m1358("ᆁ嵭ꌻໄ﮼䑧ﻱӎ靂职愖ꓛ搗鈐\u18af놤\u0cf4垨뤪᭸䭃\ue1a0ൈំ", Color.argb(0, 0, 0, 0) + 23).intern()) ? (byte) -1 : (byte) 6;
                break;
            case 1169123445:
                b10 = (str.equals(m1357(780611884 - (Process.myTid() >> 22), (short) KeyEvent.keyCodeFromString(""), 1192899852 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (byte) ((-74) - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (Process.myTid() >> 22) + (-106)).intern()) ? '\n' : '>') == '\n' ? (byte) 5 : (byte) -1;
                break;
            case 1789379091:
                b10 = !str.equals(m1357(780611840 - (ViewConfiguration.getFadingEdgeLength() >> 16), (short) ((Process.getThreadPriority(0) + 20) >> 6), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 1192899852, (byte) (TextUtils.getOffsetAfter("", 0) + 112), (-101) - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern()) ? (byte) -1 : (byte) 3;
                break;
            case 1866202823:
                b10 = !str.equals(m1358("孝欉\ud964鄐뮼帳ꌻໄ＠\uf0dc\uf419\ueee5닪쳵犱哩ৌ耧컥ɯ蜕귭㛪磇ᤙ岧ﲷ凇ꅭ\uf338犱哩ৌ耧컥ɯ蜕귭㛪磇제ቹ㲞㉷磉㋢蜕귭ꭸ旹", 48 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern()) ? (byte) -1 : (byte) 0;
                break;
            default:
                b10 = -1;
                break;
        }
        switch (b10) {
            case 0:
            case 1:
                return InterstitialActivity.class;
            case 2:
                return Ogury.class;
            case 3:
                int i13 = f1168 + 3;
                f1169 = i13 % 128;
                if (i13 % 2 == 0) {
                    return OguryInterstitialAd.class;
                }
                throw null;
            case 4:
                return OguryInterstitialAdListener.class;
            case 5:
                return OguryRewardedAd.class;
            case 6:
                return OguryRewardedAdListener.class;
            case 7:
                return OguryReward.class;
            default:
                return null;
        }
    }

    public by(String str) {
        super(str);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1358(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (n.f2992) {
            char[] cArr2 = new char[cArr.length];
            n.f2991 = 0;
            char[] cArr3 = new char[2];
            while (true) {
                int i11 = n.f2991;
                if (i11 < cArr.length) {
                    cArr3[0] = cArr[i11];
                    cArr3[1] = cArr[i11 + 1];
                    int i12 = 58224;
                    for (int i13 = 0; i13 < 16; i13++) {
                        char c10 = cArr3[1];
                        char c11 = cArr3[0];
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f1177)) ^ ((c11 >>> 5) + f1174)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f1175) ^ ((c12 + i12) ^ ((c12 << 4) + f1176))));
                        i12 -= 40503;
                    }
                    int i14 = n.f2991;
                    cArr2[i14] = cArr3[0];
                    cArr2[i14 + 1] = cArr3[1];
                    n.f2991 = i14 + 2;
                } else {
                    str2 = new String(cArr2, 0, i10);
                }
            }
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m1355(OguryInterstitialAd oguryInterstitialAd, OguryInterstitialAdListener oguryInterstitialAdListener) {
        int i10 = f1168 + 5;
        f1169 = i10 % 128;
        int i11 = i10 % 2;
        oguryInterstitialAd.setListener(oguryInterstitialAdListener);
        int i12 = f1169 + 91;
        f1168 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static void m1356(OguryRewardedAd oguryRewardedAd, OguryRewardedAdListener oguryRewardedAdListener) {
        int i10 = f1169 + 71;
        f1168 = i10 % 128;
        int i11 = i10 % 2;
        oguryRewardedAd.setListener(oguryRewardedAdListener);
        int i12 = f1169 + 3;
        f1168 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m1357(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f2993) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f1173;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f1170;
                if (bArr != null) {
                    i14 = (byte) (bArr[f1178 + i10] + i13);
                } else {
                    i14 = (short) (f1172[f1178 + i10] + i13);
                }
            }
            if (i14 > 0) {
                o.f2994 = ((i10 + i14) - 2) + f1178 + (z10 ? 1 : 0);
                o.f2995 = b10;
                char c10 = (char) (i11 + f1171);
                o.f2997 = c10;
                sb2.append(c10);
                o.f2996 = o.f2997;
                o.f2998 = 1;
                while (o.f2998 < i14) {
                    byte[] bArr2 = f1170;
                    if (bArr2 != null) {
                        int i15 = o.f2994;
                        o.f2994 = i15 - 1;
                        o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i15] + s10)) ^ o.f2995));
                    } else {
                        short[] sArr = f1172;
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
