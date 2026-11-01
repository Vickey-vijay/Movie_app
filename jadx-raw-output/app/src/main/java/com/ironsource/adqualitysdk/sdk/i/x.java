package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final class x {

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char f3163 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f3164 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f3165 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f3166 = 0;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f3167 = 203967174;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Map<String, u> f3170 = new HashMap();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Map<String, ac> f3168 = new HashMap();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Map<String, z> f3169 = new HashMap();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ String m3054(JSONObject jSONObject) {
        int i10 = f3164 + 37;
        f3165 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '7' : (char) 19;
        String strM3056 = m3056(jSONObject);
        if (c10 == '7') {
            int i11 = 94 / 0;
        }
        int i12 = f3164 + 57;
        f3165 = i12 % 128;
        if (i12 % 2 != 0) {
            return strM3056;
        }
        int i13 = 62 / 0;
        return strM3056;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Map m3057(x xVar) {
        int i10 = f3165 + 71;
        int i11 = i10 % 128;
        f3164 = i11;
        int i12 = i10 % 2;
        Map<String, u> map = xVar.f3170;
        int i13 = i11 + 81;
        f3165 = i13 % 128;
        if (i13 % 2 != 0) {
            return map;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m3059(final JSONObject jSONObject, final l lVar, final jh jhVar, final is isVar) {
        t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.x.4
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                String strM3054 = x.m3054(jSONObject);
                u uVar = (u) x.m3057(x.this).get(strM3054);
                if (uVar == null) {
                    uVar = new u(jSONObject, isVar);
                    x.m3057(x.this).put(strM3054, uVar);
                } else {
                    uVar.m3071(isVar);
                    uVar.m3032(jSONObject);
                }
                uVar.m3051((r) lVar);
                uVar.m3031((jg) jhVar);
            }
        });
        int i10 = f3164 + 77;
        f3165 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m3062() {
        t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.x.3
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                ArrayList arrayList = new ArrayList(x.m3057(x.this).values());
                x.m3057(x.this).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((u) it.next()).m3026();
                }
            }
        });
        int i10 = f3165 + 45;
        f3164 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Map m3053(x xVar) {
        int i10 = f3165 + 81;
        f3164 = i10 % 128;
        char c10 = i10 % 2 != 0 ? ';' : (char) 31;
        Map<String, z> map = xVar.f3169;
        if (c10 != 31) {
            int i11 = 99 / 0;
        }
        return map;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Map m3055(x xVar) {
        int i10 = f3165;
        int i11 = i10 + 37;
        f3164 = i11 % 128;
        int i12 = i11 % 2;
        Map<String, ac> map = xVar.f3168;
        int i13 = i10 + 9;
        f3164 = i13 % 128;
        int i14 = i13 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m3058() {
        t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.x.1
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                ArrayList arrayList = new ArrayList(x.m3055(x.this).values());
                x.m3055(x.this).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((ac) it.next()).m288();
                }
            }
        });
        int i10 = f3165 + 107;
        f3164 = i10 % 128;
        if ((i10 % 2 != 0 ? '\r' : '>') != '\r') {
            return;
        }
        int i11 = 56 / 0;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m3063(final JSONObject jSONObject, final p pVar, final it itVar) {
        t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.x.5
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                String strM3054 = x.m3054(jSONObject);
                z zVar = (z) x.m3053(x.this).get(strM3054);
                if (zVar == null) {
                    zVar = new z(jSONObject, itVar);
                    x.m3053(x.this).put(strM3054, zVar);
                } else {
                    zVar.m3113(jSONObject, itVar);
                }
                zVar.m3051(pVar);
            }
        });
        int i10 = f3164 + 31;
        f3165 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m3064(final JSONObject jSONObject, final v vVar) {
        t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.x.2
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                String strM3054 = x.m3054(jSONObject);
                ac acVar = (ac) x.m3055(x.this).get(strM3054);
                if (acVar == null) {
                    acVar = new ac(jSONObject);
                    x.m3055(x.this).put(strM3054, acVar);
                } else {
                    acVar.m287(jSONObject);
                }
                acVar.m3051((r) vVar);
            }
        });
        int i10 = f3165 + 83;
        f3164 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m3052(char c10, int i10, String str, String str2, String str3) {
        String str4;
        Object charArray = str3;
        if (str3 != null) {
            charArray = str3.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        Object charArray2 = str2;
        if (str2 != null) {
            charArray2 = str2.toCharArray();
        }
        char[] cArr2 = (char[]) charArray2;
        Object charArray3 = str;
        if (str != null) {
            charArray3 = str.toCharArray();
        }
        char[] cArr3 = (char[]) charArray3;
        synchronized (j.f2673) {
            char[] cArr4 = (char[]) cArr2.clone();
            char[] cArr5 = (char[]) cArr.clone();
            cArr4[0] = (char) (c10 ^ cArr4[0]);
            cArr5[2] = (char) (cArr5[2] + ((char) i10));
            int length = cArr3.length;
            char[] cArr6 = new char[length];
            j.f2675 = 0;
            while (true) {
                int i11 = j.f2675;
                if (i11 < length) {
                    int i12 = (i11 + 2) % 4;
                    int i13 = (i11 + 3) % 4;
                    int i14 = cArr4[i11 % 4] * 32718;
                    char c11 = cArr5[i12];
                    char c12 = (char) ((i14 + c11) % 65535);
                    j.f2674 = c12;
                    cArr5[i13] = (char) (((cArr4[i13] * 32718) + c11) / 65535);
                    cArr4[i13] = c12;
                    int i15 = j.f2675;
                    cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f3166) ^ ((long) f3167)) ^ ((long) f3163));
                    j.f2675 = i15 + 1;
                } else {
                    str4 = new String(cArr6);
                }
            }
        }
        return str4;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m3056(JSONObject jSONObject) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(jSONObject.optString(m3052((char) (32995 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), "ఴ┛ᡝ࿎ዽ퍍Ƅ夾陊湣쿠ꖝꘈ\ue27e", "Წ\ud93a\ue374\ue180", "\u0000\u0000\u0000\u0000").intern()));
        sb2.append(m3052((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 37335), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1335743573, "闲", "喙鷔흏鞑", "\u0000\u0000\u0000\u0000").intern());
        sb2.append(jSONObject.optString(m3052((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 46574), KeyEvent.keyCodeFromString(""), "⏽꿐\uf517ﺸ叡悳呾낾翈嵶瀃\uf298⧝ɤ", "\u0099♂\uee71隵", "\u0000\u0000\u0000\u0000").intern()));
        sb2.append(jSONObject.optString(m3052((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 44505), TextUtils.lastIndexOf("", '0', 0, 0) - 1526815515, "뎈廿ਕЭ㐩뎄鱍\ueb46눝臭\ue16cᰴ唙", "\ue491ﺤ\ud8a4ꊭ", "\u0000\u0000\u0000\u0000").intern()));
        sb2.append(jSONObject.optString(m3052((char) (TextUtils.indexOf("", "", 0) + 12898), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 574562106, "躄⨧䆴\uf837䶗烂\ued2c\uebaa셆勿넻负풪\ueb04뻥", "㯻㼟戢⨲", "\u0000\u0000\u0000\u0000").intern()));
        String string = sb2.toString();
        int i10 = f3165 + 27;
        f3164 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            return string;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m3061(JSONObject jSONObject, p pVar) {
        int i10 = f3165 + 89;
        f3164 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        m3063(jSONObject, pVar, null);
        if (z10) {
            throw null;
        }
        int i11 = f3165 + 103;
        f3164 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m3060() {
        t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.x.6
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                ArrayList arrayList = new ArrayList(x.m3053(x.this).values());
                x.m3053(x.this).clear();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((z) it.next()).m3111();
                }
            }
        });
        int i10 = f3165 + 71;
        f3164 = i10 % 128;
        int i11 = i10 % 2;
    }
}
