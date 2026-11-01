package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.annotation.AnyThread;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public final class ah extends jq {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f248 = 0;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f249 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private int f255;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Handler f256;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private int f257;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private String f258;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private int f259;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int[] f254 = {159890573, -910063818, -600115476, -2099468554, 1945981542, -1312134860, 24713813, -1411269694, 554228237, -1696758035, -462198900, -119245287, -1212623189, 1696824146, 229495467, -1073258516, 1695204960, 713848315};

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f251 = 145;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char f250 = 42117;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f253 = 13679;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static char f252 = 42951;

    public interface a {
        void onEventGenerated(JSONObject jSONObject);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ int m397(ah ahVar) {
        int i10 = f248;
        int i11 = i10 + 7;
        f249 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = ahVar.f257;
        ahVar.f257 = i13 + 1;
        int i14 = i10 + 3;
        f249 = i14 % 128;
        int i15 = i14 % 2;
        return i13;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private int m399() {
        int i10 = f248;
        int i11 = i10 + 59;
        f249 = i11 % 128;
        int i12 = i11 % 2;
        int i13 = this.f257;
        if (!(i13 == 0)) {
            return i13;
        }
        int i14 = i10 + 17;
        f249 = i14 % 128;
        if (i14 % 2 != 0) {
            return 1;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ int m401(ah ahVar) {
        int i10 = f248 + 83;
        int i11 = i10 % 128;
        f249 = i11;
        boolean z10 = i10 % 2 != 0;
        int i12 = ahVar.f259;
        if (!z10) {
            throw null;
        }
        int i13 = i11 + 1;
        f248 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        return i12;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ int m403(ah ahVar) {
        int i10 = f248 + 125;
        int i11 = i10 % 128;
        f249 = i11;
        int i12 = i10 % 2;
        int i13 = ahVar.f259;
        ahVar.f259 = i13 + 1;
        int i14 = i11 + 121;
        f248 = i14 % 128;
        if (i14 % 2 == 0) {
            return i13;
        }
        int i15 = 90 / 0;
        return i13;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m398(int[] iArr, int i10) {
        String str;
        synchronized (e.f1912) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f254.clone();
            e.f1913 = 0;
            while (true) {
                int i11 = e.f1913;
                if (i11 < iArr.length) {
                    int i12 = iArr[i11];
                    char c10 = (char) (i12 >> 16);
                    cArr[0] = c10;
                    char c11 = (char) i12;
                    cArr[1] = c11;
                    char c12 = (char) (iArr[i11 + 1] >> 16);
                    cArr[2] = c12;
                    char c13 = (char) iArr[i11 + 1];
                    cArr[3] = c13;
                    e.f1915 = (c10 << 16) + c11;
                    e.f1914 = (c12 << 16) + c13;
                    e.m2135(iArr2);
                    for (int i13 = 0; i13 < 16; i13++) {
                        int i14 = e.f1915 ^ iArr2[i13];
                        e.f1915 = i14;
                        e.f1914 = e.m2134(i14) ^ e.f1914;
                        int i15 = e.f1915;
                        e.f1915 = e.f1914;
                        e.f1914 = i15;
                    }
                    int i16 = e.f1915;
                    e.f1915 = e.f1914;
                    e.f1914 = i16;
                    e.f1914 = i16 ^ iArr2[16];
                    e.f1915 ^= iArr2[17];
                    int i17 = e.f1913;
                    int i18 = e.f1915;
                    cArr[0] = (char) (i18 >>> 16);
                    cArr[1] = (char) i18;
                    int i19 = e.f1914;
                    cArr[2] = (char) (i19 >>> 16);
                    cArr[3] = (char) i19;
                    e.m2135(iArr2);
                    int i20 = e.f1913;
                    cArr2[i20 << 1] = cArr[0];
                    cArr2[(i20 << 1) + 1] = cArr[1];
                    cArr2[(i20 << 1) + 2] = cArr[2];
                    cArr2[(i20 << 1) + 3] = cArr[3];
                    e.f1913 = i20 + 2;
                } else {
                    str = new String(cArr2, 0, i10);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m402(String str, int i10) {
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
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f251)) ^ ((c11 >>> 5) + f253)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f250) ^ ((c12 + i12) ^ ((c12 << 4) + f252))));
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

    @Override // com.ironsource.adqualitysdk.sdk.i.jq
    @AnyThread
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final JSONObject mo404(JSONObject jSONObject, boolean z10, boolean z11, boolean z12) throws JSONException {
        long jM2780;
        long jM2778;
        synchronized (this) {
            jM2780 = jx.m2780();
            jM2778 = jx.m2778();
        }
        JSONObject jSONObjectMo404 = super.mo404(jSONObject, z10, z11, z12);
        try {
            long jOptLong = jSONObjectMo404.optLong(ih.f2535);
            jSONObjectMo404.remove(ih.f2535);
            if (jOptLong != 0) {
                long j10 = jM2778 - (jM2780 - jOptLong);
                jSONObjectMo404.put(m398(new int[]{1638472619, -1359028187}, 4 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), jM2780);
                jSONObjectMo404.put(m402("뗌⓶ॄ㇘", ExpandableListView.getPackedPositionType(0L) + 3).intern(), jM2778);
                jM2780 = jOptLong;
                jM2778 = j10;
            }
            jSONObjectMo404.put(m398(new int[]{-738648929, 1604136994}, View.MeasureSpec.makeMeasureSpec(0, 0) + 3).intern(), jM2780);
            jSONObjectMo404.put(m398(new int[]{-355879610, -1461257667}, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1).intern(), jM2778);
            jSONObjectMo404.put(m402("뗌⓶ꪪ斶", View.combineMeasuredStates(0, 0) + 4).intern(), this.f258);
            jSONObjectMo404.put(m398(new int[]{730762364, -520726139}, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3).intern(), this.f255);
            jSONObjectMo404.put(m402("쥔䆷왅䲈", (ViewConfiguration.getTouchSlop() >> 8) + 3).intern(), m399());
            if (ar.m483().mo484()) {
                jSONObjectMo404.put(m402("ꚍ듉凿ꆯ", Color.argb(0, 0, 0, 0) + 4).intern(), true);
            }
            ap apVarMo495 = ar.m483().mo495();
            if (apVarMo495 != null) {
                String strM476 = apVarMo495.m476();
                if (!TextUtils.isEmpty(strM476)) {
                    jSONObjectMo404.put(m402("␄瀻ॄ㇘", 3 - TextUtils.indexOf("", "", 0, 0)).intern(), strM476);
                }
            }
            if (z11) {
                m400(jSONObjectMo404);
            }
        } catch (JSONException e10) {
            k.m2830(m398(new int[]{929156713, 1993972468, -1867944538, -1369704722, -844928018, -97818916, 1659144362, -652366706, 1566202450, 1938972362, 2080344896, -1046378135}, TextUtils.indexOf("", "") + 23).intern(), m402("蟇ꀸ焛ᷛ\udd79灦ᚲ쏗ꃺ霻ඣ亏뺃侶\uf515ꋚ뮱\u0ee9ꄺ⭯뙾辉\ue98f\ue587", 24 - (Process.myPid() >> 22)).intern(), e10);
        }
        return jSONObjectMo404;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m406(final String str, final JSONObject jSONObject, final JSONObject jSONObject2, final boolean z10, final a aVar) {
        this.f256.post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.4

            /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
            private static int f269 = 0;

            /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
            private static int f270 = 1;

            /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
            private static short[] f271 = null;

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static int f272 = 112;

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static byte[] f273 = {2, 17, -19, 1, 20, -20, 0, 14, -14, 20, -17, -4, -8, 12, -13, 9, 8, 2, -1, -3, 2, 2, -17, -2, -9, -1, 1, 11, -5, 5, 10, -17, -4, 0, 0, 0, 0, 0, 0};

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f274 = 287820270;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static int f275 = -1011925419;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m408(int i10, short s10, int i11, byte b10, int i12) {
                String string;
                synchronized (o.f2993) {
                    StringBuilder sb2 = new StringBuilder();
                    int i13 = f272;
                    int i14 = i12 + i13;
                    boolean z11 = i14 == -1;
                    if (z11) {
                        byte[] bArr = f273;
                        i14 = bArr != null ? (byte) (bArr[f275 + i10] + i13) : (short) (f271[f275 + i10] + i13);
                    }
                    if (i14 > 0) {
                        o.f2994 = ((i10 + i14) - 2) + f275 + (z11 ? 1 : 0);
                        o.f2995 = b10;
                        char c10 = (char) (i11 + f274);
                        o.f2997 = c10;
                        sb2.append(c10);
                        o.f2996 = o.f2997;
                        o.f2998 = 1;
                        while (o.f2998 < i14) {
                            byte[] bArr2 = f273;
                            if (bArr2 != null) {
                                int i15 = o.f2994;
                                o.f2994 = i15 - 1;
                                o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i15] + s10)) ^ o.f2995));
                            } else {
                                short[] sArr = f271;
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

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() throws Exception {
                if (str.equals(m408(1011925419 - Drawable.resolveOpacity(0, 0), (short) (Process.myPid() >> 22), (-287820154) - TextUtils.getTrimmedLength(""), (byte) (ViewConfiguration.getKeyRepeatDelay() >> 16), MotionEvent.axisFromString("") - 98).intern())) {
                    int i10 = f270 + 29;
                    f269 = i10 % 128;
                    int i11 = i10 % 2;
                    ah.m397(ah.this);
                }
                int iM401 = ah.m401(ah.this);
                ah.m403(ah.this);
                JSONObject jSONObjectM2794 = jz.m2794(jSONObject);
                jSONObjectM2794.put(m408((TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 1011925431, (short) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (ViewConfiguration.getKeyRepeatDelay() >> 16) - 287820160, (byte) TextUtils.indexOf("", "", 0), (ViewConfiguration.getKeyRepeatTimeout() >> 16) - 108).intern(), str);
                jSONObjectM2794.put(m408(1011925435 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (short) TextUtils.getOffsetAfter("", 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 287820169, (byte) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (-111) - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), iM401);
                String strIntern = m408(1011925435 - TextUtils.indexOf("", "", 0), (short) (ViewConfiguration.getEdgeSlop() >> 16), View.resolveSize(0, 0) - 287820154, (byte) (ViewConfiguration.getTouchSlop() >> 8), (-16777319) - Color.rgb(0, 0, 0)).intern();
                JSONObject jSONObject3 = jSONObject2;
                if (jSONObject3 != null) {
                    int i12 = f269 + 69;
                    f270 = i12 % 128;
                    int i13 = i12 % 2;
                    strIntern = jSONObject3.optString(ih.f2544);
                    String str2 = ih.f2497;
                    jSONObjectM2794.put(str2, jSONObject2.optString(str2, null));
                }
                if ((TextUtils.isEmpty(strIntern) ? (char) 26 : (char) 28) != 26) {
                    int i14 = f269 + 23;
                    f270 = i14 % 128;
                    int i15 = i14 % 2;
                } else {
                    strIntern = m408(TextUtils.indexOf((CharSequence) "", '0') + 1011925444, (short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 287820160, (byte) (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-108) - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern();
                }
                jSONObjectM2794.put(ih.f2542, strIntern);
                if (!jSONObjectM2794.has(ih.f2543)) {
                    int i16 = f269 + 79;
                    f270 = i16 % 128;
                    if (i16 % 2 == 0) {
                        jSONObjectM2794.put(ih.f2543, strIntern);
                        throw null;
                    }
                    jSONObjectM2794.put(ih.f2543, strIntern);
                }
                final JSONObject jSONObjectMo404 = ah.this.mo404(jSONObjectM2794, z10, true, str.equals(m408((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1011925446, (short) (Process.getGidForName("") + 1), (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) - 287820154, (byte) ExpandableListView.getPackedPositionType(0L), (-105) - (ViewConfiguration.getTapTimeout() >> 16)).intern()));
                t.m2991(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.4.4
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        aVar.onEventGenerated(jSONObjectMo404);
                    }
                });
            }
        });
        int i10 = f249 + 117;
        f248 = i10 % 128;
        if ((i10 % 2 != 0 ? '1' : ']') != ']') {
            int i11 = 10 / 0;
        }
    }

    public ah(Context context, ao aoVar, int i10, String str, long j10) {
        super(context, aoVar, j10);
        this.f255 = i10;
        this.f257 = 0;
        this.f259 = 1;
        this.f258 = str;
        HandlerThread handlerThread = new HandlerThread(m398(new int[]{929156713, 1993972468, -1867944538, -1369704722, -844928018, -97818916, 1659144362, -652366706, 1566202450, 1938972362, 2080344896, -1046378135}, 23 - (ViewConfiguration.getTapTimeout() >> 16)).intern());
        handlerThread.start();
        this.f256 = new Handler(handlerThread.getLooper());
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m405(final JSONArray jSONArray, final boolean z10, final a aVar) {
        this.f256.post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.3

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f260 = 1;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f261 = 0;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static long f262 = -5029551146765390489L;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static String m407(String str, int i10) {
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
                            cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2017 * i11))) ^ f262);
                            f.f2018++;
                        } else {
                            str2 = new String(cArr2);
                        }
                    }
                }
                return str2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v12 */
            /* JADX WARN: Type inference failed for: r0v13 */
            /* JADX WARN: Type inference failed for: r0v14 */
            /* JADX WARN: Type inference failed for: r0v15 */
            /* JADX WARN: Type inference failed for: r0v16 */
            /* JADX WARN: Type inference failed for: r0v3 */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v6, types: [org.json.JSONObject] */
            /* JADX WARN: Type inference failed for: r0v9, types: [org.json.JSONObject] */
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() throws Exception {
                final ?? r10;
                String strIntern;
                JSONArray jSONArray2;
                int i10 = f261 + 19;
                f260 = i10 % 128;
                ?? r11 = i10 % 2 == 0 ? 1 : 0;
                try {
                    if (r11 != 0) {
                        JSONObject jSONObjectMo404 = ah.this.mo404(null, z10, true, true);
                        strIntern = m407("\ued02櫖\ue28c穜\uf20f䯷", 34758 >>> (AudioTrack.getMaxVolume() > 1.0f ? 1 : (AudioTrack.getMaxVolume() == 1.0f ? 0 : -1))).intern();
                        jSONArray2 = jSONArray;
                        r11 = jSONObjectMo404;
                    } else {
                        JSONObject jSONObjectMo405 = ah.this.mo404(null, z10, false, false);
                        strIntern = m407("\ued02櫖\ue28c穜\uf20f䯷", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 34758).intern();
                        jSONArray2 = jSONArray;
                        r11 = jSONObjectMo405;
                    }
                    r11.put(strIntern, jSONArray2);
                    r10 = r11;
                } catch (JSONException e10) {
                    k.m2830(m407("\ued26㳪什颢ꪒ\uf47cٜ倱戌跙\udfcf\ue9c3㮭䖔靊ꅏ\uf339ᴑⳣ统袯\uda97\ue497", TextUtils.indexOf("", "", 0) + 53731).intern(), m407("\ued22ᤆԳㄱ㵙⤘啶䆐䶚禭断釟鷭觷둍ꀟ갡\ud841쑟\uf07aﱖ\ue88dᒱ³", 62482 - ExpandableListView.getPackedPositionChild(0L)).intern(), e10);
                    r10 = r11;
                }
                t.m2991(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ah.3.2
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        aVar.onEventGenerated(r10);
                    }
                });
            }
        });
        int i10 = f248 + 59;
        f249 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private synchronized void m400(JSONObject jSONObject) {
        int i10 = f249 + 47;
        f248 = i10 % 128;
        int i11 = i10 % 2;
        ii iiVarM2663 = jf.m2656().m2663();
        try {
            jSONObject.put(m402("堲ວｪ\uef12詘⸇滋燆ጮᣆ", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 8).intern(), jz.m2803(iiVarM2663.m2490(), iiVarM2663.m2489(), iiVarM2663.m2492(), iiVarM2663.m2491()));
            int i12 = f248 + 73;
            f249 = i12 % 128;
            int i13 = i12 % 2;
        } catch (JSONException e10) {
            k.m2830(m398(new int[]{929156713, 1993972468, -1867944538, -1369704722, -844928018, -97818916, 1659144362, -652366706, 1566202450, 1938972362, 2080344896, -1046378135}, 23 - (ViewConfiguration.getFadingEdgeLength() >> 16)).intern(), m402("衬ᷙ焛ᷛ\udd79灦㽭䐨龯ⅾ뺃侶ↄ돤굃崽慝孔滋燆ܤ䴄慝孔\uf515ꋚ뮱\u0ee9ꄺ⭯", 29 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), e10);
        }
    }
}
