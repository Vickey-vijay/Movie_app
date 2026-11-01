package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
final class ae {

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f127 = 1;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static long f128 = -6192151443298679407L;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char[] f129 = {'E', 'r', 'o', ' ', 's', 'y', 'n', 'c', 'h', 'i', 'z', 'g', 'e', 'v', 't', 'd', 'l', 'a', 'T', 'u', 'F', 'G', 'H', 'I', 'J'};

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f130 = 0;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f131 = 5;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private int f132;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private long f133;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private long f134;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Boolean f135 = null;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private long f136;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private long f137;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ long m301(ae aeVar, long j10) {
        int i10 = f130;
        int i11 = i10 + 109;
        f127 = i11 % 128;
        boolean z10 = i11 % 2 != 0;
        aeVar.f133 = j10;
        if (!z10) {
            throw null;
        }
        int i12 = i10 + 37;
        f127 = i12 % 128;
        if (i12 % 2 != 0) {
            return j10;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ long m304(ae aeVar) {
        int i10 = f130 + 53;
        int i11 = i10 % 128;
        f127 = i11;
        if (i10 % 2 == 0) {
            long j10 = aeVar.f133;
            throw null;
        }
        long j11 = aeVar.f133;
        int i12 = i11 + 25;
        f130 = i12 % 128;
        int i13 = i12 % 2;
        return j11;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ long m307(ae aeVar, long j10) {
        int i10 = f130 + 57;
        f127 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '\"' : 'E';
        aeVar.f136 = j10;
        if (c10 == '\"') {
            int i11 = 1 / 0;
        }
        return j10;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ long m310(ae aeVar) {
        int i10 = f130 + 23;
        f127 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 17 : 'J') == 'J') {
            return aeVar.f137;
        }
        long j10 = aeVar.f137;
        int i11 = 66 / 0;
        return j10;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ long m312(ae aeVar, long j10) {
        int i10 = f127 + 1;
        int i11 = i10 % 128;
        f130 = i11;
        int i12 = i10 % 2;
        aeVar.f134 = j10;
        int i13 = i11 + 123;
        f127 = i13 % 128;
        if ((i13 % 2 == 0 ? 'D' : 'G') == 'G') {
            return j10;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x006c  */
    /* JADX WARN: Code duplicated, block: B:20:0x006e  */
    /* JADX WARN: Code duplicated, block: B:22:0x0072 A[Catch: JSONException -> 0x0117, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0117, blocks: (B:5:0x0015, B:17:0x0064, B:22:0x0072, B:25:0x00ed, B:30:0x00ff, B:31:0x0111, B:24:0x00bc, B:11:0x003c), top: B:34:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:28:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:30:0x00ff A[Catch: JSONException -> 0x0117, TryCatch #0 {JSONException -> 0x0117, blocks: (B:5:0x0015, B:17:0x0064, B:22:0x0072, B:25:0x00ed, B:30:0x00ff, B:31:0x0111, B:24:0x00bc, B:11:0x003c), top: B:34:0x0012 }] */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m302(JSONObject jSONObject) {
        long jOptLong;
        boolean z10;
        boolean z11;
        char c10;
        int i10 = f130 + 75;
        f127 = i10 % 128;
        try {
            if (i10 % 2 == 0) {
                if (jSONObject.optInt(m314("\t\u000e\u009a", 4 >> View.resolveSizeAndState(0, 1, 0), (byte) (110 / (ExpandableListView.getPackedPositionForGroup(1) > 1L ? 1 : (ExpandableListView.getPackedPositionForGroup(1) == 1L ? 0 : -1)))).intern(), 1) != this.f132) {
                    if (m309(jSONObject)) {
                        c10 = '%';
                    } else {
                        c10 = 19;
                    }
                    if (c10 != '%') {
                        jOptLong = jSONObject.optLong(m314("\u0013\n{", 3 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) (ExpandableListView.getPackedPositionGroup(0L) + 8)).intern()) + this.f134;
                        jSONObject.put(m314("\u0013\t©", TextUtils.indexOf("", "", 0, 0) + 3, (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 58)).intern(), this.f134);
                        int i11 = f130 + 111;
                        f127 = i11 % 128;
                        int i12 = i11 % 2;
                        z10 = false;
                    }
                }
                jSONObject.put(ih.f2535, jOptLong);
                if (this.f135.booleanValue()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (!z11) {
                    jSONObject.put(m313("唍啹ᜯ\uea5d鋍\ue10c㽃", -Process.getGidForName("")).intern(), false);
                }
                m303(jSONObject, z10);
                m305(jSONObject, z10);
            }
            if ((jSONObject.optInt(m314("\t\u000e\u009a", 3 - View.resolveSizeAndState(0, 0, 0), (byte) (54 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)))).intern(), 1) != this.f132 ? 'b' : 'L') == 'b') {
                if (m309(jSONObject)) {
                    c10 = '%';
                } else {
                    c10 = 19;
                }
                if (c10 != '%') {
                    jOptLong = jSONObject.optLong(m314("\u0013\n{", 3 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (byte) (ExpandableListView.getPackedPositionGroup(0L) + 8)).intern()) + this.f134;
                    jSONObject.put(m314("\u0013\t©", TextUtils.indexOf("", "", 0, 0) + 3, (byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 58)).intern(), this.f134);
                    int i13 = f130 + 111;
                    f127 = i13 % 128;
                    int i14 = i13 % 2;
                    z10 = false;
                }
                jSONObject.put(ih.f2535, jOptLong);
                if (this.f135.booleanValue()) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                if (!z11) {
                    jSONObject.put(m313("唍啹ᜯ\uea5d鋍\ue10c㽃", -Process.getGidForName("")).intern(), false);
                }
                m303(jSONObject, z10);
                m305(jSONObject, z10);
            }
            jOptLong = jSONObject.optLong(m313("宭寘轷\u0a92ﳮ㠰", 1 - ((Process.getThreadPriority(0) + 20) >> 6)).intern()) + this.f136;
            jSONObject.put(m313("增士䅧麜쒂闑\udc32", 1 - TextUtils.indexOf("", "", 0)).intern(), this.f136);
            z10 = true;
            jSONObject.put(ih.f2535, jOptLong);
            if (this.f135.booleanValue()) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (!z11) {
                jSONObject.put(m313("唍啹ᜯ\uea5d鋍\ue10c㽃", -Process.getGidForName("")).intern(), false);
            }
            m303(jSONObject, z10);
            m305(jSONObject, z10);
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:19:0x0069  */
    /* JADX WARN: Code duplicated, block: B:21:0x0075  */
    /* JADX WARN: Code duplicated, block: B:26:0x007b A[RETURN] */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m306(JSONObject jSONObject) {
        int i10;
        int i11 = f130 + 23;
        f127 = i11 % 128;
        if ((i11 % 2 == 0 ? '1' : 'I') == 'I') {
            if ((!jSONObject.has(m313("增士䅧麜쒂闑\udc32", 1 - Color.green(0)).intern()) ? 'Y' : '4') != '4') {
                if (!jSONObject.has(m314("\u0013\t©", 3 - TextUtils.getTrimmedLength(""), (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 59)).intern())) {
                    i10 = f130 + 15;
                    f127 = i10 % 128;
                    if (i10 % 2 == 0) {
                        return false;
                    }
                    int i12 = 28 / 0;
                    return false;
                }
            }
        } else if (!jSONObject.has(m313("增士䅧麜쒂闑\udc32", Color.green(1) * 1).intern())) {
            if (!jSONObject.has(m314("\u0013\t©", 3 - TextUtils.getTrimmedLength(""), (byte) (((byte) KeyEvent.getModifierMetaStateMask()) + 59)).intern())) {
                i10 = f130 + 15;
                f127 = i10 % 128;
                if (i10 % 2 == 0) {
                    return false;
                }
                int i13 = 28 / 0;
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Boolean m308(ae aeVar, Boolean bool) {
        int i10 = f130 + 55;
        f127 = i10 % 128;
        char c10 = i10 % 2 == 0 ? 'X' : (char) 7;
        aeVar.f135 = bool;
        if (c10 == 'X') {
            int i11 = 68 / 0;
        }
        return bool;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ long m311(ae aeVar, long j10) {
        int i10 = f127;
        int i11 = i10 + 71;
        f130 = i11 % 128;
        int i12 = i11 % 2;
        aeVar.f137 = j10;
        int i13 = i10 + 5;
        f130 = i13 % 128;
        if (i13 % 2 == 0) {
            return j10;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m313(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2284) {
            char[] cArrM2243 = h.m2243(f128, cArr, i10);
            h.f2285 = 4;
            while (true) {
                int i11 = h.f2285;
                if (i11 < cArrM2243.length) {
                    h.f2283 = i11 - 4;
                    int i12 = h.f2285;
                    cArrM2243[i12] = (char) (((long) (cArrM2243[i12] ^ cArrM2243[i12 % 4])) ^ (((long) h.f2283) * f128));
                    h.f2285++;
                } else {
                    str2 = new String(cArrM2243, 4, cArrM2243.length - 4);
                }
            }
        }
        return str2;
    }

    public ae(int i10) {
        this.f132 = i10;
        ar.m483().mo507(new av() { // from class: com.ironsource.adqualitysdk.sdk.i.ae.1

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f138 = 0;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f139 = 1;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static long f140 = 3266625835755888475L;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m316(String str, int i11) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (h.f2284) {
                    char[] cArrM2243 = h.m2243(f140, cArr, i11);
                    h.f2285 = 4;
                    while (true) {
                        int i12 = h.f2285;
                        if (i12 < cArrM2243.length) {
                            h.f2283 = i12 - 4;
                            int i13 = h.f2285;
                            cArrM2243[i13] = (char) (((long) (cArrM2243[i13] ^ cArrM2243[i13 % 4])) ^ (((long) h.f2283) * f140));
                            h.f2285++;
                        } else {
                            str2 = new String(cArrM2243, 4, cArrM2243.length - 4);
                        }
                    }
                }
                return str2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.av
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo317() {
                char c10;
                as asVarMo496 = ar.m483().mo496();
                long jM557 = asVarMo496.m557();
                if (jM557 == 0) {
                    c10 = 18;
                } else {
                    c10 = '&';
                }
                if (c10 != 18) {
                    ae.m308(ae.this, Boolean.TRUE);
                } else {
                    int i11 = f139 + 71;
                    f138 = i11 % 128;
                    int i12 = i11 % 2;
                    ae.m308(ae.this, Boolean.FALSE);
                    jM557 = asVarMo496.m559();
                    kd.m2872(m316("ũꭟĽꡓ矅瑭ᚈ\ue9b1籶\uf7ec鐐法﯁焿ᆤ\uef42祎ﲨ黛懿\uf4b7總ᱏ\ue461爇", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1).intern(), m316("열淶얱᪼鍼닟ꑸം룪ㄑ⛷衯㼌랢ꍗ\u0be1뷄㨀Ⱘ蕎つ뢎꺿Ï뚞㿤⬜艱㔈ꉼ뗯ᶀꡳ\u20cd㙷鼔⻤", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), null, false);
                    int i13 = f139 + 51;
                    f138 = i13 % 128;
                    int i14 = i13 % 2;
                }
                ae.m301(ae.this, asVarMo496.m558());
                ae.m311(ae.this, asVarMo496.m559());
                ae aeVar = ae.this;
                ae.m307(aeVar, jM557 - ae.m304(aeVar));
                ae aeVar2 = ae.this;
                ae.m312(aeVar2, jM557 - ae.m310(aeVar2));
            }
        });
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean m309(JSONObject jSONObject) {
        int i10 = f127 + 63;
        f130 = i10 % 128;
        int i11 = i10 % 2;
        if (!(Math.abs((this.f137 - this.f133) - (jSONObject.optLong(m314("\u0013\n{", 3 - (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 8)).intern()) - jSONObject.optLong(m313("宭寘轷\u0a92ﳮ㠰", 1 - Gravity.getAbsoluteGravity(0, 0)).intern()))) > 10)) {
            int i12 = f127 + 93;
            f130 = i12 % 128;
            int i13 = i12 % 2;
            return true;
        }
        int i14 = f127 + 37;
        f130 = i14 % 128;
        if (i14 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m315(JSONObject jSONObject) {
        if ((!m306(jSONObject) ? '\t' : (char) 17) != 17) {
            int i10 = f127 + 53;
            int i11 = i10 % 128;
            f130 = i11;
            int i12 = i10 % 2;
            if (!(this.f135 == null)) {
                int i13 = i11 + 89;
                f127 = i13 % 128;
                int i14 = i13 % 2;
                try {
                    m302(jSONObject);
                    return true;
                } catch (Exception e10) {
                    kd.m2872(m313("ꐀꑔᾬ\u09d4驔겢눷ʛ㱴ǵ⎜髮裸⠞㕈脡\ue6af剡伇\uef64ﵾ䒜曓헒쬦", KeyEvent.getDeadChar(0, 0) + 1).intern(), m314("\u0001\u0002\u0002\u0003\u0002\u0004\u0000\t\u0007\b\u0006\u0003\u0001\u0007\u0005\u000e\u0005\u0007\r\u0001\r\u000e\u000b\u0007Ë", (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 25, (byte) (87 - (ViewConfiguration.getWindowTouchSlop() >> 8))).intern(), e10, false);
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0055 A[Catch: JSONException -> 0x0114, TRY_ENTER, TryCatch #0 {JSONException -> 0x0114, blocks: (B:3:0x000a, B:12:0x0048, B:21:0x0055, B:52:0x00eb, B:53:0x00fb, B:54:0x0103, B:27:0x007e, B:35:0x0099, B:43:0x00cd, B:38:0x00b0), top: B:58:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:23:0x0077  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    /* JADX WARN: Code duplicated, block: B:26:0x007d  */
    /* JADX WARN: Code duplicated, block: B:27:0x007e A[Catch: JSONException -> 0x0114, TRY_LEAVE, TryCatch #0 {JSONException -> 0x0114, blocks: (B:3:0x000a, B:12:0x0048, B:21:0x0055, B:52:0x00eb, B:53:0x00fb, B:54:0x0103, B:27:0x007e, B:35:0x0099, B:43:0x00cd, B:38:0x00b0), top: B:58:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:29:0x0086  */
    /* JADX WARN: Code duplicated, block: B:31:0x0090  */
    /* JADX WARN: Code duplicated, block: B:32:0x0092  */
    /* JADX WARN: Code duplicated, block: B:35:0x0099 A[Catch: JSONException -> 0x0114, TRY_ENTER, TryCatch #0 {JSONException -> 0x0114, blocks: (B:3:0x000a, B:12:0x0048, B:21:0x0055, B:52:0x00eb, B:53:0x00fb, B:54:0x0103, B:27:0x007e, B:35:0x0099, B:43:0x00cd, B:38:0x00b0), top: B:58:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00af  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b0 A[Catch: JSONException -> 0x0114, TryCatch #0 {JSONException -> 0x0114, blocks: (B:3:0x000a, B:12:0x0048, B:21:0x0055, B:52:0x00eb, B:53:0x00fb, B:54:0x0103, B:27:0x007e, B:35:0x0099, B:43:0x00cd, B:38:0x00b0), top: B:58:0x000a }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cd A[Catch: JSONException -> 0x0114, PHI: r8
  0x00cd: PHI (r8v1 long) = (r8v0 long), (r8v3 long) binds: [B:42:0x00cb, B:37:0x00af] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {JSONException -> 0x0114, blocks: (B:3:0x000a, B:12:0x0048, B:21:0x0055, B:52:0x00eb, B:53:0x00fb, B:54:0x0103, B:27:0x007e, B:35:0x0099, B:43:0x00cd, B:38:0x00b0), top: B:58:0x000a }] */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m305(JSONObject jSONObject, boolean z10) {
        int i10;
        boolean z11;
        long jOptLong;
        char c10;
        long jOptLong2;
        char c11;
        int i11 = f130 + 47;
        f127 = i11 % 128;
        int i12 = i11 % 2;
        try {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(m314("\u0011\u0012\t\u0013\u0011\u0003\u0011\tv", ((Process.getThreadPriority(0) + 20) >> 6) + 9, (byte) (View.resolveSize(0, 0) + 14)).intern());
            if ((jSONObjectOptJSONObject != null ? '8' : 'R') != 'R') {
                int i13 = f127;
                int i14 = i13 + 69;
                f130 = i14 % 128;
                Long lValueOf = null;
                if (i14 % 2 != 0) {
                    int i15 = 94 / 0;
                    if (!z10) {
                        jOptLong2 = jSONObjectOptJSONObject.optLong(m314("Ü", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (byte) (152 - AndroidCharacter.getMirror('0'))).intern());
                        if (jOptLong2 > 0) {
                            c11 = 11;
                        } else {
                            c11 = '+';
                        }
                        if (c11 != 11) {
                            lValueOf = Long.valueOf(jOptLong2 + this.f134);
                        }
                    } else {
                        i10 = i13 + 125;
                        f130 = i10 % 128;
                        if (i10 % 2 != 0) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (!z11) {
                            jOptLong = jSONObjectOptJSONObject.optLong(m313("俔価㊊\ue704ᛆ", 0 >> TextUtils.indexOf("", "", 0)).intern());
                            if (jOptLong > 0) {
                                lValueOf = Long.valueOf(jOptLong + this.f136);
                            }
                        } else {
                            jOptLong = jSONObjectOptJSONObject.optLong(m313("俔価㊊\ue704ᛆ", 1 - TextUtils.indexOf("", "", 0)).intern());
                            if (jOptLong > 0) {
                                c10 = 1;
                            } else {
                                c10 = 'a';
                            }
                            if (c10 != 'a') {
                                lValueOf = Long.valueOf(jOptLong + this.f136);
                            }
                        }
                    }
                } else {
                    if (!(z10)) {
                        jOptLong2 = jSONObjectOptJSONObject.optLong(m314("Ü", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), (byte) (152 - AndroidCharacter.getMirror('0'))).intern());
                        if (jOptLong2 > 0) {
                            c11 = 11;
                        } else {
                            c11 = '+';
                        }
                        if (c11 != 11) {
                            lValueOf = Long.valueOf(jOptLong2 + this.f134);
                        }
                    } else {
                        i10 = i13 + 125;
                        f130 = i10 % 128;
                        if (i10 % 2 != 0) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (!z11) {
                            jOptLong = jSONObjectOptJSONObject.optLong(m313("俔価㊊\ue704ᛆ", 0 >> TextUtils.indexOf("", "", 0)).intern());
                            if (jOptLong > 0) {
                                lValueOf = Long.valueOf(jOptLong + this.f136);
                            }
                        } else {
                            jOptLong = jSONObjectOptJSONObject.optLong(m313("俔価㊊\ue704ᛆ", 1 - TextUtils.indexOf("", "", 0)).intern());
                            if (jOptLong > 0) {
                                c10 = 1;
                            } else {
                                c10 = 'a';
                            }
                            if (c10 != 'a') {
                                lValueOf = Long.valueOf(jOptLong + this.f136);
                            }
                        }
                    }
                }
                if ((lValueOf != null ? 'P' : '3') != '3') {
                    int i16 = f130 + 61;
                    f127 = i16 % 128;
                    jSONObjectOptJSONObject.put((i16 % 2 == 0 ? m314("Ü", 0 % View.MeasureSpec.makeMeasureSpec(0, 0), (byte) (View.getDefaultSize(1, 1) * 50)) : m314("Ü", View.MeasureSpec.makeMeasureSpec(0, 0) + 1, (byte) (View.getDefaultSize(0, 0) + 104))).intern(), lValueOf);
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m314(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2129) {
            char[] cArr2 = f129;
            char c10 = f131;
            char[] cArr3 = new char[i10];
            if (i10 % 2 != 0) {
                i10--;
                cArr3[i10] = (char) (cArr[i10] - b10);
            }
            if (i10 > 1) {
                g.f2134 = 0;
                while (true) {
                    int i11 = g.f2134;
                    if (i11 >= i10) {
                        break;
                    }
                    g.f2133 = cArr[i11];
                    g.f2131 = cArr[g.f2134 + 1];
                    if (g.f2133 == g.f2131) {
                        cArr3[g.f2134] = (char) (g.f2133 - b10);
                        cArr3[g.f2134 + 1] = (char) (g.f2131 - b10);
                    } else {
                        g.f2132 = g.f2133 / c10;
                        g.f2130 = g.f2133 % c10;
                        g.f2135 = g.f2131 / c10;
                        g.f2128 = g.f2131 % c10;
                        if (g.f2130 == g.f2128) {
                            g.f2132 = ((g.f2132 + c10) - 1) % c10;
                            g.f2135 = ((g.f2135 + c10) - 1) % c10;
                            int i12 = (g.f2132 * c10) + g.f2130;
                            int i13 = (g.f2135 * c10) + g.f2128;
                            int i14 = g.f2134;
                            cArr3[i14] = cArr2[i12];
                            cArr3[i14 + 1] = cArr2[i13];
                        } else if (g.f2132 == g.f2135) {
                            g.f2130 = ((g.f2130 + c10) - 1) % c10;
                            g.f2128 = ((g.f2128 + c10) - 1) % c10;
                            int i15 = (g.f2132 * c10) + g.f2130;
                            int i16 = (g.f2135 * c10) + g.f2128;
                            int i17 = g.f2134;
                            cArr3[i17] = cArr2[i15];
                            cArr3[i17 + 1] = cArr2[i16];
                        } else {
                            int i18 = (g.f2132 * c10) + g.f2128;
                            int i19 = (g.f2135 * c10) + g.f2130;
                            int i20 = g.f2134;
                            cArr3[i20] = cArr2[i18];
                            cArr3[i20 + 1] = cArr2[i19];
                        }
                    }
                    g.f2134 += 2;
                }
            }
            str2 = new String(cArr3);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m303(JSONObject jSONObject, boolean z10) {
        long jOptLong;
        if ((jSONObject.has(m314("\t\u0013µ", (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 3, (byte) (66 - KeyEvent.keyCodeFromString(""))).intern()) ? 'I' : (char) 5) != 5) {
            int i10 = f130 + 117;
            f127 = i10 % 128;
            if (i10 % 2 != 0) {
                if (z10) {
                    jOptLong = jSONObject.optLong(m313("닡늒㩪鞸뾎鳮탻", 1 - (ViewConfiguration.getEdgeSlop() >> 16)).intern()) + this.f136;
                    int i11 = f127 + 91;
                    f130 = i11 % 128;
                    int i12 = i11 % 2;
                } else {
                    jOptLong = jSONObject.optLong(m314("\t\u0013µ", ExpandableListView.getPackedPositionGroup(0L) + 3, (byte) (66 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24))).intern()) + this.f134;
                }
                try {
                    jSONObject.put(m314("\t\u0013µ", TextUtils.lastIndexOf("", '0') + 4, (byte) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 66)).intern(), jOptLong);
                    return;
                } catch (JSONException unused) {
                    return;
                }
            }
            try {
                throw null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
