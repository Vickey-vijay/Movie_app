package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.WebView;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class ac extends y<View> implements View.OnLayoutChangeListener, jl {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f108 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static boolean f109 = true;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static boolean f110 = true;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f111 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static char[] f112 = {369, 387, 392, 382, 393, 401, 368, 383, 347, 354, 379, 390, 396, 351, 314, 397, 398, 385, 400, 384, 391, 340, 358, 403, 399, 349, 386};

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static int f113 = 282;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private Class f114;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private WeakHashMap<View, Boolean> f115;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private b f116;

    public class b extends y.c {

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private static int f117 = 1;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f118 = 0;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static char[] f119 = {166, 151, 168, 155, 164, 170, 140, 159, 173, 134, 156, 174, 160, 169, 138, 165, 127, 153, 171, 141, 152, 'y', 162, 172, 157};

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static boolean f120 = true;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static boolean f121 = true;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f122 = 54;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static long f123 = -2839741285697766634L;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private String f124;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private String f125;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private String f126;

        public b(ac acVar) {
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public static /* synthetic */ String m294(b bVar) {
            int i10 = f118 + 37;
            int i11 = i10 % 128;
            f117 = i11;
            int i12 = i10 % 2;
            String str = bVar.f126;
            int i13 = i11 + 49;
            f118 = i13 % 128;
            if (i13 % 2 == 0) {
                return str;
            }
            int i14 = 17 / 0;
            return str;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public static /* synthetic */ String m298(b bVar) {
            int i10 = f117;
            int i11 = i10 + 21;
            f118 = i11 % 128;
            int i12 = i11 % 2;
            String str = bVar.f125;
            int i13 = i10 + 89;
            f118 = i13 % 128;
            if (i13 % 2 == 0) {
                return str;
            }
            throw null;
        }

        public b(ac acVar, JSONObject jSONObject) {
            m296(jSONObject.optString(m299("煥焒坡氒弜⥒꡶ᥢ鵔䬙䮡㖯ꦹ羵柽⇷됣汭ላ\ude59쁕耖ົ쪲\uecb4뒤", Color.red(0)).intern()));
            m297(jSONObject.optString(m299("埓垥\uecdd힢灞ؗ⟌雹믈\uf0a0擲먥輐쐪䢪깓銾", View.combineMeasuredStates(0, 0)).intern()));
            m293(jSONObject.optString(m300(null, 127 - TextUtils.indexOf("", ""), null, "\u008c\u0088\u008b\u0084\u0083\u008a\u0089\u0084\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern()));
            m3088(jSONObject.optString(m300(null, 175 - AndroidCharacter.getMirror('0'), null, "\u0086\u0092\u0084\u008d\u0085\u0091\u0090\u008f\u008e\u008d").intern()));
            m3090(false);
            m3086(!TextUtils.isEmpty(jSONObject.optString(m300(null, 127 - (ViewConfiguration.getKeyRepeatDelay() >> 16), null, "\u0086\u0092\u0084\u008d\u0085\u0091\u0090\u008f\u008e\u008d").intern())) || jSONObject.optBoolean(m300(null, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, null, "\u0086\u0085\u0084\u0088\u0097\u0096\u0089\u0084\u0088\u0087\u0095\u0084\u0094\u0084\u008e\u0093").intern()) || jSONObject.optBoolean(m299("䎚䏯슲輪끣옪\ue1bc傩꾧\udedbꓭ籎魘\uea7e袛栫蛑殮ﵷ鞓\uf294ᗕ", View.getDefaultSize(0, 0)).intern()));
            m3092(jSONObject.optBoolean(m300(null, View.getDefaultSize(0, 0) + 127, null, "\u0086\u0085\u0084\u0088\u0097\u0096\u0089\u0084\u0088\u0087\u0095\u0084\u0094\u0084\u008e\u0093").intern()));
            m3085(jSONObject.optBoolean(m299("둰됅夸扝\ue330镹猘숟塐䕇\uf78f\ueee3沊燨", TextUtils.indexOf("", "", 0)).intern()));
            m3089(TextUtils.isEmpty(jSONObject.optString(m299("⇥←䌸硜ἢ楢跼㳮췏彗\u0b80ဏ來", (-1) - TextUtils.indexOf((CharSequence) "", '0', 0)).intern())) ? null : Arrays.asList(jSONObject.optString(m299("⇥←䌸硜ἢ楢跼㳮췏彗\u0b80ဏ來", TextUtils.lastIndexOf("", '0') + 1).intern()).split(m299("ㄏㄣ珏횟⇍", TextUtils.indexOf("", "", 0, 0)).intern())));
            m3093(jSONObject.optBoolean(m299("䝇䜲ῖ⒳唜⍕\uef76幾ꭾΫ䆰犟龔㜇淠更舻", MotionEvent.axisFromString("") + 1).intern(), true));
            m3087(false);
            m3083(jSONObject.optBoolean(m299("莑菼逶ꭕ롽츽춎粸澠豋곕偱孨룽肒䐈䛸ꬥ\uf56a뮡㊂", (-1) - TextUtils.indexOf((CharSequence) "", '0')).intern()));
            m3084(jSONObject.optBoolean(m299("\udf97\udffe꿬钗쫯벳\uf4be䖳㎡뎩\ude58楗ݓ", View.getDefaultSize(0, 0)).intern()));
            m3091(jz.m2800(jSONObject.optJSONArray(m300(null, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, null, "\u0084\u0083\u0090\u0085\u0099\u0091\u0090\u008f\u008e\u0089\u0084\u0088\u0098").intern())));
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private b m293(String str) {
            int i10 = f117;
            int i11 = i10 + 15;
            f118 = i11 % 128;
            int i12 = i11 % 2;
            this.f125 = str;
            int i13 = i10 + 29;
            f118 = i13 % 128;
            int i14 = i13 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ String m295(b bVar) {
            int i10 = f117 + 9;
            int i11 = i10 % 128;
            f118 = i11;
            int i12 = i10 % 2;
            String str = bVar.f124;
            int i13 = i11 + 31;
            f117 = i13 % 128;
            int i14 = i13 % 2;
            return str;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private b m296(String str) {
            int i10 = f117 + 121;
            f118 = i10 % 128;
            if (i10 % 2 != 0) {
                this.f126 = str;
                int i11 = 14 / 0;
            } else {
                this.f126 = str;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private b m297(String str) {
            int i10 = f118;
            int i11 = i10 + 25;
            f117 = i11 % 128;
            int i12 = i11 % 2;
            this.f124 = str;
            int i13 = i10 + 33;
            f117 = i13 % 128;
            int i14 = i13 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m299(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (h.f2284) {
                char[] cArrM2243 = h.m2243(f123, cArr, i10);
                h.f2285 = 4;
                while (true) {
                    int i11 = h.f2285;
                    if (i11 < cArrM2243.length) {
                        h.f2283 = i11 - 4;
                        int i12 = h.f2285;
                        cArrM2243[i12] = (char) (((long) (cArrM2243[i12] ^ cArrM2243[i12 % 4])) ^ (((long) h.f2283) * f123));
                        h.f2285++;
                    } else {
                        str2 = new String(cArrM2243, 4, cArrM2243.length - 4);
                    }
                }
            }
            return str2;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m300(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f119;
                int i11 = f122;
                if (f120) {
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
                if (f121) {
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
    }

    public ac(JSONObject jSONObject) {
        super(null);
        this.f115 = new WeakHashMap<>();
        this.f116 = new b(this);
        m287(jSONObject);
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static View m279(View view) {
        int i10 = f108 + 19;
        int i11 = i10 % 128;
        f111 = i11;
        if ((i10 % 2 == 0 ? '6' : '\"') == '6') {
            int i12 = 91 / 0;
        }
        int i13 = i11 + 27;
        f108 = i13 % 128;
        int i14 = i13 % 2;
        return view;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m283() {
        int i10 = f111 + 73;
        f108 = i10 % 128;
        if ((i10 % 2 != 0 ? '5' : '&') == '5') {
            ji.m2667().m2674(this);
            throw null;
        }
        ji.m2667().m2674(this);
        int i11 = f108 + 23;
        f111 = i11 % 128;
        if (i11 % 2 != 0) {
        } else {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ void mo286(View view, List list) {
        int i10 = f111 + 75;
        f108 = i10 % 128;
        char c10 = i10 % 2 != 0 ? '2' : '1';
        m280(view, (List<WebView>) list);
        if (c10 != '2') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m288() {
        int i10 = f111 + 33;
        f108 = i10 % 128;
        int i11 = i10 % 2;
        m3051((r) null);
        ji.m2667().m2675(this);
        int i12 = f111 + 25;
        f108 = i12 % 128;
        if ((i12 % 2 != 0 ? '8' : '1') != '8') {
        } else {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ View mo291(View view) {
        int i10 = f111 + 101;
        f108 = i10 % 128;
        int i11 = i10 % 2;
        View viewM279 = m279(view);
        int i12 = f111 + 23;
        f108 = i12 % 128;
        int i13 = i12 % 2;
        return viewM279;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private View m281(View view, Class cls) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int i10 = 0;
        while (true) {
            if (i10 >= viewGroup.getChildCount()) {
                return null;
            }
            int i11 = f108 + 125;
            f111 = i11 % 128;
            int i12 = i11 % 2;
            View childAt = viewGroup.getChildAt(i10);
            if (!(!cls.isAssignableFrom(childAt.getClass()))) {
                int i13 = f111 + 63;
                f108 = i13 % 128;
                int i14 = i13 % 2;
                return childAt;
            }
            View viewM281 = m281(childAt, cls);
            if ((viewM281 != null ? (char) 31 : (char) 27) == 31) {
                int i15 = f108 + 35;
                f111 = i15 % 128;
                int i16 = i15 % 2;
                return viewM281;
            }
            i10++;
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = f108 + 27;
        f111 = i18 % 128;
        int i19 = i18 % 2;
        try {
            View viewM281 = m281(view, this.f114);
            if (viewM281 != null) {
                int i20 = f111 + 103;
                f108 = i20 % 128;
                if ((i20 % 2 != 0 ? 'N' : '7') != 'N') {
                    m284(viewM281);
                    view.removeOnLayoutChangeListener(this);
                } else {
                    m284(viewM281);
                    view.removeOnLayoutChangeListener(this);
                    int i21 = 92 / 0;
                }
                int i22 = f111 + 33;
                f108 = i22 % 128;
                int i23 = i22 % 2;
            }
        } catch (Throwable th2) {
            kd.m2872(m282((String) null, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 126, (int[]) null, "\u008d\u0088\u008c\u0084\u0083\u008b\u008a\u0084\u0089\u0086\u0088\u0082\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m282((String) null, Drawable.resolveOpacity(0, 0) + 127, (int[]) null, "\u0088\u0092\u0083\u008b\u009b\u009a\u0091\u0099\u0085\u0098\u008b\u0097\u0083\u0085\u008f\u0083\u0082\u008f\u008d\u0085\u008d\u008d\u008e").intern(), th2, false);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m287(JSONObject jSONObject) {
        b bVar = new b(this, jSONObject);
        m3069(bVar);
        this.f116 = bVar;
        try {
            this.f114 = Class.forName(b.m295(bVar));
            int i10 = f111 + 55;
            f108 = i10 % 128;
            char c10 = i10 % 2 != 0 ? ' ' : (char) 16;
            m283();
            if (c10 == 16) {
            } else {
                throw null;
            }
        } catch (ClassNotFoundException e10) {
            String strIntern = m282((String) null, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, (int[]) null, "\u008d\u0088\u008c\u0084\u0083\u008b\u008a\u0084\u0089\u0086\u0088\u0082\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m282((String) null, KeyEvent.normalizeMetaState(0) + 127, (int[]) null, "\u008f\u0095\u0085\u008d\u0094\u008f\u0090\u0091\u0083\u0088\u0093\u0088\u008f\u0085\u0091\u008f\u0092\u0083\u0082\u0083\u0088\u0091\u0090\u0082\u008c\u008f\u008d\u0085\u008d\u008d\u008e").intern());
            sb2.append(b.m295(bVar));
            sb2.append(m282((String) null, 127 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (int[]) null, "\u008f\u0096").intern());
            sb2.append(e10.getLocalizedMessage());
            k.m2809(strIntern, sb2.toString());
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final r<WebView, View> mo290() {
        int i10 = f108 + 95;
        int i11 = i10 % 128;
        f111 = i11;
        if ((i10 % 2 == 0 ? 'a' : '2') != '2') {
            int i12 = 19 / 0;
        }
        int i13 = i11 + 5;
        f108 = i13 % 128;
        if (i13 % 2 == 0) {
            return this;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.y
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final aa mo292() {
        ad adVar = new ad();
        int i10 = f108 + 95;
        f111 = i10 % 128;
        int i11 = i10 % 2;
        return adVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m280(View view, List<WebView> list) {
        int i10 = f111 + 85;
        f108 = i10 % 128;
        int i11 = i10 % 2;
        ke.m2893(view, WebView.class, b.m294(this.f116), true, false, null, this.f116.f3209, list);
        int i12 = f108 + 93;
        f111 = i12 % 128;
        if ((i12 % 2 == 0 ? '%' : 'J') == 'J') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: avoid collision after fix types in other method and contains not printable characters */
    private void m284(View view) {
        if (!this.f115.containsKey(view)) {
            int i10 = f108 + 83;
            f111 = i10 % 128;
            if (!(i10 % 2 == 0)) {
                this.f115.put(view, Boolean.TRUE);
                mo3029(view, Integer.toHexString(view.hashCode()));
            } else {
                this.f115.put(view, Boolean.TRUE);
                mo3029(view, Integer.toHexString(view.hashCode()));
                throw null;
            }
        }
        int i11 = f111 + 51;
        f108 = i11 % 128;
        if ((i11 % 2 != 0 ? 'F' : (char) 14) == 14) {
        } else {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jl
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void mo289(View view) {
        View viewM281 = m281(view, this.f114);
        if ((viewM281 != null ? (char) 28 : (char) 14) != 14) {
            m284(viewM281);
            return;
        }
        if (!TextUtils.isEmpty(b.m298(this.f116))) {
            int i10 = f108 + 69;
            f111 = i10 % 128;
            if (i10 % 2 != 0) {
                View viewM278 = m278(view, b.m298(this.f116));
                if ((viewM278 != null ? (char) 27 : 'L') != 'L') {
                    int i11 = f108 + 33;
                    f111 = i11 % 128;
                    int i12 = i11 % 2;
                    viewM278.addOnLayoutChangeListener(this);
                }
            } else {
                m278(view, b.m298(this.f116));
                throw null;
            }
        }
        int i13 = f111 + 93;
        f108 = i13 % 128;
        if (i13 % 2 == 0) {
        } else {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.jl
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void mo285(View view) {
        int i10 = f111 + 53;
        f108 = i10 % 128;
        if ((i10 % 2 != 0 ? '!' : 'E') != '!') {
            View viewM281 = m281(view, this.f114);
            if ((viewM281 != null ? '[' : '^') == '[') {
                if ((this.f115.remove(viewM281) != null ? (char) 5 : '8') != '8') {
                    mo3027(view);
                    int i11 = f108 + 103;
                    f111 = i11 % 128;
                    int i12 = i11 % 2;
                }
            }
            int i13 = f111 + 27;
            f108 = i13 % 128;
            int i14 = i13 % 2;
            return;
        }
        m281(view, this.f114);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m282(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f112;
            int i11 = f113;
            if (f109) {
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
            if (f110) {
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private View m278(View view, String str) {
        int i10 = f108 + 125;
        int i11 = i10 % 128;
        f111 = i11;
        int i12 = i10 % 2;
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        int i13 = i11 + 83;
        f108 = i13 % 128;
        int i14 = i13 % 2;
        ViewGroup viewGroup = (ViewGroup) view;
        int i15 = 0;
        while (true) {
            if ((i15 < viewGroup.getChildCount() ? ')' : '8') == '8') {
                return null;
            }
            View childAt = viewGroup.getChildAt(i15);
            if (childAt.getClass().getName().startsWith(str)) {
                return childAt;
            }
            View viewM278 = m278(childAt, str);
            if ((viewM278 != null ? (char) 28 : ' ') == 28) {
                return viewM278;
            }
            i15++;
        }
    }
}
