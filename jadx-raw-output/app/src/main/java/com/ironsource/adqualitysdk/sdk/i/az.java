package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.os.Handler;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.G5;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.io.UnsupportedEncodingException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class az {

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f686 = 1;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f687 = 0;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f688 = 64;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static long f689 = -8838354928780161941L;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static boolean f690 = true;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static boolean f691 = true;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static char[] f692 = {161, 163, 180, 159, 176, 181, 179, 165, 164, 182, 'z', 178, 175, 133, 174, 147};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private af f693;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ISAdQualityAdListener f694;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Handler f697;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Set<il> f696 = new HashSet();

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Set<String> f695 = new HashSet();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ af m749(az azVar) {
        int i10 = f687 + 37;
        int i11 = i10 % 128;
        f686 = i11;
        int i12 = i10 % 2;
        af afVar = azVar.f693;
        int i13 = i11 + 99;
        f687 = i13 % 128;
        if (!(i13 % 2 != 0)) {
            return afVar;
        }
        int i14 = 6 / 0;
        return afVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m763(ISAdQualityAdListener iSAdQualityAdListener) {
        int i10 = f686;
        int i11 = i10 + 21;
        f687 = i11 % 128;
        boolean z10 = i11 % 2 != 0;
        this.f694 = iSAdQualityAdListener;
        if (z10) {
            throw null;
        }
        int i12 = i10 + 77;
        f687 = i12 % 128;
        if (i12 % 2 == 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m767(JSONObject jSONObject) {
        int i10 = f687 + 3;
        f686 = i10 % 128;
        if ((i10 % 2 == 0 ? 'T' : '1') != '1') {
            throw null;
        }
        ISAdQualityAdListener iSAdQualityAdListener = this.f694;
        if ((iSAdQualityAdListener != null ? '_' : '4') == '_') {
            iSAdQualityAdListener.adClosed(jSONObject.optString(ih.f2544), ISAdQualityAdType.fromInt(jSONObject.optInt(ih.f2540)));
        }
        int i11 = f687 + 43;
        f686 = i11 % 128;
        if (i11 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m769(JSONObject jSONObject) {
        int i10 = f686 + 47;
        f687 = i10 % 128;
        int i11 = i10 % 2;
        m765(m751("퓠嵊풁齻ᅂᢛߙﶅ\ue52f⌯喜ท럌\uf2ec挱", KeyEvent.keyCodeFromString("") + 1).intern(), jSONObject);
        int i12 = f687 + 85;
        f686 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m750(az azVar, String str, JSONObject jSONObject) {
        int i10 = f686 + 53;
        f687 = i10 % 128;
        int i11 = i10 % 2;
        azVar.m753(str, jSONObject);
        int i12 = f687 + 123;
        f686 = i12 % 128;
        if ((i12 % 2 == 0 ? 'T' : 'R') == 'R') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final void m756(JSONObject jSONObject) {
        int i10 = f687 + 51;
        f686 = i10 % 128;
        int i11 = i10 % 2;
        m765(m751("౷阰ఖ僿\uda38葵졝慫㶿\ue842騎鋬潝㦜겨첉餗", View.MeasureSpec.getMode(0) + 1).intern(), jSONObject);
        int i12 = f687 + 41;
        f686 = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public final void m757(JSONObject jSONObject) {
        int i10 = f687 + 61;
        f686 = i10 % 128;
        int i11 = i10 % 2;
        m765(m751("郧当邆ࢴ\u135b屽逖륣ꄸℰ쉙䫠\uf3cf\uf0f5\uf4fe", View.resolveSize(0, 0) + 1).intern(), jSONObject);
        int i12 = f686 + 13;
        f687 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final void m758(JSONObject jSONObject) {
        int i10 = f686 + 59;
        f687 = i10 % 128;
        m765(m754((String) null, (i10 % 2 != 0 ? '<' : G5.T) != '<' ? 126 - TextUtils.indexOf((CharSequence) "", '0') : TextUtils.indexOf((CharSequence) "", '(') * 60, (int[]) null, "\u0089\u0088\u0087\u0086\u0081\u0085\u0084\u0083\u0082\u0081").intern(), jSONObject);
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public final void m759(JSONObject jSONObject) {
        int i10 = f686 + 99;
        f687 = i10 % 128;
        m765(m754((String) null, (i10 % 2 != 0 ? ']' : '\n') != ']' ? (ViewConfiguration.getTouchSlop() >> 8) + 127 : (ViewConfiguration.getTouchSlop() % 100) * 81, (int[]) null, "\u0088\u0083\u0081\u0083\u0087\u0084\u0089\u0088\u008a\u0081\u0087\u0084\u0083\u0082\u0081").intern(), jSONObject);
        int i11 = f686 + 45;
        f687 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m762(JSONObject jSONObject) {
        int i10 = f687 + 91;
        f686 = i10 % 128;
        int i11 = i10 % 2;
        m765(m751("㙼肷㘝詥첿彲\u12c7멬ޣﻔ䂆䧭啐⼑瘯", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern(), jSONObject);
        int i12 = f686 + 83;
        f687 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m766(JSONObject jSONObject) {
        int i10 = f686 + 75;
        f687 = i10 % 128;
        m765(m751("ل鋟إ芕\uded7喵ᨷ낫㞚\uecad䡤䌭敱㵹统", !(i10 % 2 == 0) ? View.MeasureSpec.getSize(1) * 0 : View.MeasureSpec.getSize(0) + 1).intern(), jSONObject);
        int i11 = f687 + 39;
        f686 = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 77 / 0;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m768(String str, String str2, String str3, String str4) {
        int i10 = f687 + 99;
        f686 = i10 % 128;
        int i11 = i10 % 2;
        m764(str, str2, str3, str4, null, false);
        int i12 = f687 + 29;
        f686 = i12 % 128;
        int i13 = i12 % 2;
    }

    public az(Handler handler, af afVar) {
        this.f693 = afVar;
        this.f697 = handler;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004f A[PHI: r1
  0x004f: PHI (r1v15 org.json.JSONObject) = (r1v11 org.json.JSONObject), (r1v21 org.json.JSONObject) binds: [B:23:0x004c, B:15:0x0034] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m755(String str, JSONObject jSONObject) {
        JSONObject jSONObjectMo636;
        Iterator it = new HashSet(this.f696).iterator();
        while (true) {
            if (!(it.hasNext())) {
                return;
            }
            int i10 = f687 + 69;
            f686 = i10 % 128;
            if (!(i10 % 2 == 0)) {
                jSONObjectMo636 = ((il) it.next()).mo636(str, jSONObject);
                if (jSONObjectMo636 != null) {
                    int i11 = f686 + 107;
                    f687 = i11 % 128;
                    int i12 = i11 % 2;
                    jz.m2795(jSONObject, jSONObjectMo636);
                    int i13 = f686 + 19;
                    f687 = i13 % 128;
                    int i14 = i13 % 2;
                }
            } else {
                jSONObjectMo636 = ((il) it.next()).mo636(str, jSONObject);
                int i15 = 17 / 0;
                if ((jSONObjectMo636 != null ? ' ' : '>') == ' ') {
                    int i16 = f686 + 107;
                    f687 = i16 % 128;
                    int i17 = i16 % 2;
                    jz.m2795(jSONObject, jSONObjectMo636);
                    int i18 = f686 + 19;
                    f687 = i18 % 128;
                    int i19 = i18 % 2;
                }
            }
            int i20 = f687 + 35;
            f686 = i20 % 128;
            int i21 = i20 % 2;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m761(JSONObject jSONObject) {
        int i10 = f687 + 63;
        f686 = i10 % 128;
        int i11 = i10 % 2;
        int iOptInt = jSONObject.optInt(ih.f2540);
        ISAdQualityAdListener iSAdQualityAdListener = this.f694;
        if ((iSAdQualityAdListener != null ? '\'' : (char) 16) != 16) {
            int i12 = f686 + 51;
            f687 = i12 % 128;
            if (i12 % 2 != 0) {
                iSAdQualityAdListener.adDisplayed(jSONObject.optString(ih.f2544), ISAdQualityAdType.fromInt(iOptInt));
                int i13 = 35 / 0;
            } else {
                iSAdQualityAdListener.adDisplayed(jSONObject.optString(ih.f2544), ISAdQualityAdType.fromInt(iOptInt));
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m765(final String str, final JSONObject jSONObject) {
        this.f697.post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.az.5
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                az.m750(az.this, str, jSONObject);
            }
        });
        int i10 = f686 + 61;
        f687 = i10 % 128;
        if (i10 % 2 == 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m764(String str, String str2, String str3, String str4, JSONObject jSONObject, boolean z10) {
        synchronized (this.f695) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str3);
            sb2.append(m754((String) null, 127 - Gravity.getAbsoluteGravity(0, 0), (int[]) null, "\u008b").intern());
            sb2.append(str2);
            String string = sb2.toString();
            if (!this.f695.contains(string) || z10 || ar.m483().mo504()) {
                this.f695.add(string);
                if (Math.random() * 100.0d < m752()) {
                    JSONObject jSONObjectM346 = af.m346(str, str2, str3, str4, jSONObject);
                    m755(m754((String) null, 127 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (int[]) null, "\u008c\u008d\u008c\u008c\u0088\u0084\u0085\u0083").intern(), jSONObjectM346);
                    this.f693.m368(m754((String) null, TextUtils.getOffsetBefore("", 0) + 127, (int[]) null, "\u008c\u008d\u008c\u008c\u0088\u0084\u0085\u0083").intern(), jSONObjectM346);
                    return;
                }
                k.m2809(m754((String) null, (ViewConfiguration.getLongPressTimeout() >> 16) + 127, (int[]) null, "\u008c\u0088\u0089\u008f\u0088\u0090\u0083\u008f\u0088\u008a\u008e").intern(), m751("嶵䁈己鴲ొ㲪֗\ud988汸㸭埔⨮㺃\uefec愼瑇죁ꅸ낍䚝魷匼싆靻ꖌӹ\u0c65\ue159矉㘛忁㏃٥\ue83e槜簱탲駷묤乻\ue2d8䭌쪣飇굹紃ᓎ\ue936羢⻯♧㭣ু", 1 - TextUtils.indexOf("", "", 0, 0)).intern());
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m753(final String str, JSONObject jSONObject) {
        m755(str, jSONObject);
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            String str2 = ih.f2544;
            jSONObjectJsonObjectInit.put(str2, jSONObject.remove(str2));
            String str3 = ih.f2497;
            jSONObjectJsonObjectInit.put(str3, jSONObject.remove(str3));
            int i10 = f687 + 83;
            f686 = i10 % 128;
            int i11 = i10 % 2;
        } catch (JSONException unused) {
        }
        this.f693.m375(str, jSONObject, jSONObjectJsonObjectInit, new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.az.1
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                if (ih.f2488.contains(str)) {
                    t.m2993(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.az.1.3
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            az.m749(az.this).m374();
                        }
                    });
                }
            }
        });
        int i12 = f687 + 101;
        f686 = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m760(il ilVar) {
        int i10 = f687 + 97;
        f686 = i10 % 128;
        int i11 = i10 % 2;
        this.f696.add(ilVar);
        int i12 = f686 + 77;
        f687 = i12 % 128;
        if ((i12 % 2 != 0 ? 'Y' : 'K') != 'Y') {
            return;
        }
        int i13 = 3 / 0;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m754(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
        Object bytes = str2;
        if (str2 != null) {
            bytes = str2.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (m.f2988) {
            char[] cArr2 = f692;
            int i11 = f688;
            if (f691) {
                int length = bArr.length;
                m.f2990 = length;
                char[] cArr3 = new char[length];
                m.f2989 = 0;
                while (m.f2989 < m.f2990) {
                    int i12 = m.f2989;
                    int i13 = m.f2990 - 1;
                    int i14 = m.f2989;
                    cArr3[i12] = (char) (cArr2[bArr[i13 - i14] + i10] - i11);
                    m.f2989 = i14 + 1;
                }
                return new String(cArr3);
            }
            if (f690) {
                int length2 = cArr.length;
                m.f2990 = length2;
                char[] cArr4 = new char[length2];
                m.f2989 = 0;
                while (m.f2989 < m.f2990) {
                    int i15 = m.f2989;
                    int i16 = m.f2990 - 1;
                    int i17 = m.f2989;
                    cArr4[i15] = (char) (cArr2[cArr[i16 - i17] - i10] - i11);
                    m.f2989 = i17 + 1;
                }
                return new String(cArr4);
            }
            int length3 = iArr.length;
            m.f2990 = length3;
            char[] cArr5 = new char[length3];
            m.f2989 = 0;
            while (m.f2989 < m.f2990) {
                int i18 = m.f2989;
                int i19 = m.f2990 - 1;
                int i20 = m.f2989;
                cArr5[i18] = (char) (cArr2[iArr[i19 - i20] - i10] - i11);
                m.f2989 = i20 + 1;
            }
            return new String(cArr5);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static double m752() {
        int i10 = f686 + 57;
        f687 = i10 % 128;
        if (i10 % 2 != 0) {
            ar.m483().mo500();
            throw null;
        }
        if (!(ar.m483().mo500())) {
            return ar.m483().mo501();
        }
        int i11 = f687 + 83;
        f686 = i11 % 128;
        int i12 = i11 % 2;
        return 100.0d;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m751(String str, int i10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (h.f2284) {
            char[] cArrM2243 = h.m2243(f689, cArr, i10);
            h.f2285 = 4;
            while (true) {
                int i11 = h.f2285;
                if (i11 < cArrM2243.length) {
                    h.f2283 = i11 - 4;
                    int i12 = h.f2285;
                    cArrM2243[i12] = (char) (((long) (cArrM2243[i12] ^ cArrM2243[i12 % 4])) ^ (((long) h.f2283) * f689));
                    h.f2285++;
                } else {
                    str2 = new String(cArrM2243, 4, cArrM2243.length - 4);
                }
            }
        }
        return str2;
    }
}
