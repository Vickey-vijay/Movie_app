package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class aa<T> extends w<WebView, T> implements View.OnLayoutChangeListener {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static short[] f69 = null;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private static int f70 = 1;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static int f71 = 0;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static byte[] f72 = {-72, 113, -124, -66, 120, -121, 120, -114, 114, -65, -54, 62, -49, 49, -54, -34, 35, -28, 13, -43, 59, -44, 51, 58, -55, -58, -79, -74, 66, -74, 106, -128, -80, 73, -71, 87, 90, -111, -80, 0, -3, 74, 6, ExifInterface.MARKER_APP1, 76, -78, 79, 98, -76, 9, -27, -16, -3, -63, 37, -37, 53, -116, 113, 49, -51, 61, -56, -57, 54, -113, 102, -53, 53, -56, -27};

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private static int f73 = 1306129093;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f74 = 673858351;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f75 = 81;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private Map<WebView, js> f76 = new WeakHashMap();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private List<jk> f77 = new ArrayList();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private jp f78;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private boolean f79;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String f80;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private List<String> f81;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private js f82;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean f83;

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.aa$3, reason: invalid class name */
    public class AnonymousClass3 implements jk {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static int f84 = 1;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f87 = 0;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private static boolean f89 = true;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static boolean f91 = true;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static int f92 = 14;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char[] f90 = {129, 130, 'p', 'q', 'o', 's', 'r', 'u', 'e', 'd', 'w', 133, 'O', 'V', '|', 'z', 128, 'S', '}', '.', 132, 'x'};

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private static long f85 = -6702392760180083472L;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f86 = 0;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static char f88 = 0;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public static /* synthetic */ void m268(AnonymousClass3 anonymousClass3, WebView webView, String str, boolean z10) {
            int i10 = f84 + 55;
            f87 = i10 % 128;
            boolean z11 = i10 % 2 == 0;
            anonymousClass3.m269(webView, str, z10);
            if (!z11) {
                int i11 = 86 / 0;
            }
            int i12 = f87 + 111;
            f84 = i12 % 128;
            int i13 = i12 % 2;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m271(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                char[] cArr2 = f90;
                int i11 = f92;
                if (f91) {
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
                if (f89) {
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

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.adqualitysdk.sdk.i.jk
        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final void mo274(WebView webView, String str, String str2) {
            String strSubstring = str2.substring(0, str2.indexOf(63));
            String strSubstring2 = str2.substring(str2.indexOf(63) + 1);
            if (!(!strSubstring.equals(m271(null, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 127, null, "\u0086\u0085\u0084\u0083\u0082\u0081").intern()))) {
                int i10 = f87 + 109;
                f84 = i10 % 128;
                int i11 = i10 % 2;
                aa.m245(aa.this, webView);
                return;
            }
            if (strSubstring.equals(m270("Ⲥ턿\ue4bbა꺭㽪", (char) (ExpandableListView.getPackedPositionChild(0L) + 59468), "\uf4f0ꁐ克ꋼ", 1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "楬怕䯷珨").intern())) {
                JSONObject jSONObjectM247 = aa.m247(strSubstring2);
                aa aaVar = aa.this;
                aaVar.m266(jSONObjectM247, webView, aaVar.mo258(webView));
                return;
            }
            if (strSubstring.equals(m271(null, 127 - View.resolveSize(0, 0), null, "\u0085\u0085\u0084\u0083\u0082\u0081").intern())) {
                int i12 = f87 + 113;
                f84 = i12 % 128;
                if ((i12 % 2 == 0 ? (char) 21 : 'V') != 21) {
                    JSONObject jSONObjectM248 = aa.m247(strSubstring2);
                    aa aaVar2 = aa.this;
                    aaVar2.mo1704(jSONObjectM248, webView, aa.m253(aaVar2), aa.this.mo258(webView));
                    return;
                } else {
                    JSONObject jSONObjectM249 = aa.m247(strSubstring2);
                    aa aaVar3 = aa.this;
                    aaVar3.mo1704(jSONObjectM249, webView, aa.m253(aaVar3), aa.this.mo258(webView));
                    int i13 = 39 / 0;
                    return;
                }
            }
            if ((strSubstring.equals(m271(null, 127 - (ViewConfiguration.getWindowTouchSlop() >> 8), null, "\u0084\u0085\u0084\u0083\u0082\u0081").intern()) ? '0' : '9') == '9') {
                if (strSubstring.equals(m271(null, View.resolveSizeAndState(0, 0, 0) + 127, null, "\u0087\u0085\u0084\u0083\u0082\u0081").intern())) {
                    int i14 = f87 + 59;
                    f84 = i14 % 128;
                    int i15 = i14 % 2;
                    JSONObject jSONObjectM2410 = aa.m247(strSubstring2);
                    kd.m2874(jSONObjectM2410.optString(m271(null, 127 - View.MeasureSpec.makeMeasureSpec(0, 0), null, "\u0088\u0085\u0082").intern()), jSONObjectM2410.optString(m270("흹ꀂ䘩몚㍖", (char) (49468 - ((byte) KeyEvent.getModifierMetaStateMask())), "\uf4f0ꁐ克ꋼ", 1031845588 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), "픝肶㴽濁").intern()), jSONObjectM2410.optString(m270("ﱅ\ud835ƻ攬ﵣ桯", (char) (Color.argb(0, 0, 0, 0) + 1886), "\uf4f0ꁐ克ꋼ", (-1) - MotionEvent.axisFromString(""), "顭谐廪萇").intern()), jSONObjectM2410.optString(m270("髂鿻懄쩮\uf4ae", (char) (50576 - Color.red(0)), "\uf4f0ꁐ克ꋼ", (-1758873904) - View.MeasureSpec.getSize(0), "킥⦶邗\uf8c5").intern()));
                    return;
                }
                return;
            }
            int i16 = f87 + 27;
            f84 = i16 % 128;
            if (i16 % 2 != 0) {
                JSONObject jSONObjectM2411 = aa.m247(strSubstring2);
                jSONObjectM2411.remove(ih.f2535);
                aa aaVar4 = aa.this;
                aaVar4.mo1712(jSONObjectM2411, webView, aaVar4.mo258(webView));
                return;
            }
            JSONObject jSONObjectM2412 = aa.m247(strSubstring2);
            jSONObjectM2412.remove(ih.f2535);
            aa aaVar5 = aa.this;
            aaVar5.mo1712(jSONObjectM2412, webView, aaVar5.mo258(webView));
            try {
                throw null;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public AnonymousClass3() {
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private void m269(final WebView webView, final String str, final boolean z10) {
            t.m2993(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.aa.3.3
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() {
                    final String originalUrl = webView.getOriginalUrl();
                    final Object objMo258 = aa.this.mo258(webView);
                    t.m2995(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.aa.3.3.2

                        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                        private static int f102 = 1;

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static int f103 = 0;

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static long f104 = 51974363563975081L;

                        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                        private static String m277(String str2, int i10) {
                            String str3;
                            Object charArray = str2;
                            if (str2 != null) {
                                charArray = str2.toCharArray();
                            }
                            char[] cArr = (char[]) charArray;
                            synchronized (h.f2284) {
                                char[] cArrM2243 = h.m2243(f104, cArr, i10);
                                h.f2285 = 4;
                                while (true) {
                                    int i11 = h.f2285;
                                    if (i11 < cArrM2243.length) {
                                        h.f2283 = i11 - 4;
                                        int i12 = h.f2285;
                                        cArrM2243[i12] = (char) (((long) (cArrM2243[i12] ^ cArrM2243[i12 % 4])) ^ (((long) h.f2283) * f104));
                                        h.f2285++;
                                    } else {
                                        str3 = new String(cArrM2243, 4, cArrM2243.length - 4);
                                    }
                                }
                            }
                            return str3;
                        }

                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            boolean z11;
                            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
                            try {
                                jSONObjectJsonObjectInit.put(ih.f2526, str);
                                jSONObjectJsonObjectInit.put(ih.f2527, m277("\udf94\udfe3눟폀\uef77ⱆ붗", (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern());
                                jSONObjectJsonObjectInit.put(ih.f2539, originalUrl);
                                if (z10) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    int i10 = f102 + 105;
                                    f103 = i10 % 128;
                                    int i11 = i10 % 2;
                                    jSONObjectJsonObjectInit.put(ih.f2536, true);
                                }
                                int i12 = f102 + 45;
                                f103 = i12 % 128;
                                int i13 = i12 % 2;
                            } catch (JSONException e10) {
                                String strIntern = m277("\u191f᥈軳\uef3f᭤\ud854\ue8ef챂鿒ܗ釕果ᐳ膆ࢯ\ufe6f誗\u1ac6輏瓗", 1 - (Process.myTid() >> 22)).intern();
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(m277("孊嬏탬넷ﵥ㹅荤\ua7f0\udd9c奚矐ఝ噧\udfa7\ueeab闚죈䓅楛ὴ䆶쵧\ue3c4預艹뎀媰憰糼㢌핏", -TextUtils.lastIndexOf("", '0', 0, 0)).intern());
                                sb2.append(e10.getLocalizedMessage());
                                k.m2810(strIntern, sb2.toString());
                            }
                            C02533 c02533 = C02533.this;
                            aa aaVar = aa.this;
                            aaVar.mo1713(jSONObjectJsonObjectInit, webView, aa.m253(aaVar), objMo258);
                        }
                    });
                }
            });
            int i10 = f87 + 27;
            f84 = i10 % 128;
            int i11 = i10 % 2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jk
        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final void mo272(WebView webView) {
            int i10 = f87 + 65;
            f84 = i10 % 128;
            int i11 = i10 % 2;
            aa.m245(aa.this, webView);
            int i12 = f84 + 79;
            f87 = i12 % 128;
            int i13 = i12 % 2;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.jk
        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final void mo275(final WebView webView, final String str, final boolean z10) {
            t.m2995(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.aa.3.1
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                public final void mo276() {
                    if (aa.m252(aa.this)) {
                        if (aa.m246(aa.this) == null || aa.m246(aa.this).isEmpty()) {
                            AnonymousClass3.m268(AnonymousClass3.this, webView, str, z10);
                            return;
                        }
                        Iterator it = aa.m246(aa.this).iterator();
                        while (it.hasNext()) {
                            if (str.startsWith((String) it.next())) {
                                AnonymousClass3.m268(AnonymousClass3.this, webView, str, z10);
                                return;
                            }
                        }
                    }
                }
            });
            int i10 = f84 + 59;
            f87 = i10 % 128;
            int i11 = i10 % 2;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m270(String str, char c10, String str2, int i10, String str3) {
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
                char[] cArr4 = (char[]) cArr.clone();
                char[] cArr5 = (char[]) cArr2.clone();
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
                        cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f85) ^ ((long) f86)) ^ ((long) f88));
                        j.f2675 = i15 + 1;
                    } else {
                        str4 = new String(cArr6);
                    }
                }
            }
            return str4;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.ironsource.adqualitysdk.sdk.i.jk
        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final void mo273(WebView webView, String str) {
            try {
                JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
                jSONObjectJsonObjectInit.put(ih.f2537, str);
                jSONObjectJsonObjectInit.put(ih.f2534, ih.f2531);
                JSONObject jSONObjectJsonObjectInit2 = IronSourceVideoBridge.jsonObjectInit();
                jSONObjectJsonObjectInit2.put(ih.f2538, jSONObjectJsonObjectInit);
                aa aaVar = aa.this;
                aaVar.mo1709(jSONObjectJsonObjectInit2, webView, this, aaVar.mo258(webView));
                int i10 = f84 + 93;
                f87 = i10 % 128;
                int i11 = i10 % 2;
            } catch (Exception e10) {
                kd.m2872(m271(null, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, null, "\u0091\u0086\u0090\u0087\u008f\u0085\u008e\u0087\u008d\u008c\u0086\u008b\u008a\u0083\u0086\u0089").intern(), m271(null, (ViewConfiguration.getPressedStateDuration() >> 16) + 127, null, "\u008f\u0093\u0081\u0096\u0094\u0082\u008f\u0086\u0095\u0086\u0094\u0084\u0084\u008c\u0094\u0088\u008f\u008b\u0082\u0085\u0086\u0091\u0084\u0094\u0091\u0093\u0091\u0091\u0092").intern(), e10, false);
            }
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m245(aa aaVar, WebView webView) {
        int i10 = f70 + 41;
        f71 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        aaVar.m250(webView);
        if (z10) {
            throw null;
        }
        int i11 = f70 + 45;
        f71 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ List m246(aa aaVar) {
        int i10 = f70 + 109;
        int i11 = i10 % 128;
        f71 = i11;
        int i12 = i10 % 2;
        List<String> list = aaVar.f81;
        int i13 = i11 + 111;
        f70 = i13 % 128;
        int i14 = i13 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ bb.e m253(aa aaVar) {
        int i10 = f71 + 65;
        f70 = i10 % 128;
        int i11 = i10 % 2;
        bb.e eVarM255 = aaVar.m255();
        int i12 = f71 + 125;
        f70 = i12 % 128;
        int i13 = i12 % 2;
        return eVarM255;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        WebView webView;
        try {
            if ((view instanceof WebView ? 'X' : (char) 6) != 'X') {
                return;
            }
            int i18 = f70 + 45;
            f71 = i18 % 128;
            if (!(i18 % 2 != 0)) {
                webView = (WebView) view;
                if (!this.f76.containsKey(webView)) {
                    return;
                }
            } else {
                webView = (WebView) view;
                int i19 = 55 / 0;
                if (!this.f76.containsKey(webView)) {
                    return;
                }
            }
            m250(webView);
            int i20 = f71 + 29;
            f70 = i20 % 128;
            int i21 = i20 % 2;
        } catch (Throwable th2) {
            kd.m2872(m249((-673858342) - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (short) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (-1306129007) - TextUtils.lastIndexOf("", '0'), (byte) ((-57) - Color.blue(0)), TextUtils.indexOf("", "", 0, 0) - 82).intern(), m249(Color.alpha(0) - 673858326, (short) (ViewConfiguration.getFadingEdgeLength() >> 16), (-1306129024) - TextUtils.getCapsMode("", 0, 0), (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 80), (-82) - (Process.myTid() >> 22)).intern(), th2, false);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public abstract T mo258(WebView webView);

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.w, com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ void mo262(JSONObject jSONObject, Object obj, Object obj2) {
        int i10 = f71 + 101;
        f70 = i10 % 128;
        char c10 = i10 % 2 == 0 ? ':' : '>';
        m266(jSONObject, (WebView) obj, obj2);
        if (c10 != ':') {
        } else {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.w, com.ironsource.adqualitysdk.sdk.i.r
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ void mo267(JSONObject jSONObject, Object obj, Object obj2) {
        int i10 = f71 + 29;
        f70 = i10 % 128;
        char c10 = i10 % 2 == 0 ? 'P' : 'V';
        m248(jSONObject, (WebView) obj, obj2);
        if (c10 == 'P') {
            throw null;
        }
        int i11 = f70 + 109;
        f71 = i11 % 128;
        if ((i11 % 2 != 0 ? '\r' : (char) 15) == 15) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m247(String str) {
        int i10 = f70 + 7;
        f71 = i10 % 128;
        char c10 = i10 % 2 != 0 ? '&' : '\r';
        JSONObject jSONObjectM256 = m256(str);
        if (c10 != '\r') {
            int i11 = 64 / 0;
        }
        return jSONObjectM256;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m252(aa aaVar) {
        int i10 = f70;
        int i11 = i10 + 59;
        f71 = i11 % 128;
        int i12 = i11 % 2;
        boolean z10 = aaVar.f79;
        int i13 = i10 + 59;
        f71 = i13 % 128;
        int i14 = i13 % 2;
        return z10;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private bb.e m255() {
        js jsVar = this.f82;
        if ((jsVar != null ? '\"' : ' ') == ' ') {
            int i10 = f71 + 27;
            f70 = i10 % 128;
            if ((i10 % 2 == 0 ? (char) 0 : '\b') != 0) {
                return null;
            }
            throw null;
        }
        int i11 = f70 + 49;
        f71 = i11 % 128;
        int i12 = i11 % 2;
        bb.e eVarM2722 = jsVar.m2722();
        int i13 = f71 + 123;
        f70 = i13 % 128;
        int i14 = i13 % 2;
        return eVarM2722;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final WebView m257() {
        int i10 = f70;
        int i11 = i10 + 79;
        f71 = i11 % 128;
        int i12 = i11 % 2;
        js jsVar = this.f82;
        if ((jsVar != null ? 'F' : 'S') != 'F') {
            return null;
        }
        int i13 = i10 + 97;
        f71 = i13 % 128;
        if ((i13 % 2 != 0 ? 'J' : ';') == ';') {
            return jsVar.m2724();
        }
        jsVar.m2724();
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m264(WebView webView) {
        int i10 = f71 + 117;
        f70 = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 17 / 0;
            if ((webView != null ? '\t' : (char) 28) != '\t') {
                return;
            }
        } else {
            if ((webView != null ? (char) 24 : '`') == '`') {
                return;
            }
        }
        if (this.f76.containsKey(webView)) {
            return;
        }
        int i12 = f71 + 111;
        f70 = i12 % 128;
        int i13 = i12 % 2;
        js jsVarM2717 = js.m2717(webView, m249(View.resolveSizeAndState(0, 0, 0) - 673858351, (short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) - 1306128996, (byte) ((ViewConfiguration.getTouchSlop() >> 8) + 113), TextUtils.getOffsetBefore("", 0) - 82).intern());
        if (this.f82 == null) {
            this.f82 = jsVarM2717;
            int i14 = f71 + 83;
            f70 = i14 % 128;
            int i15 = i14 % 2;
        }
        this.f76.put(webView, jsVarM2717);
        jk jkVarM254 = m254();
        this.f77.add(jkVarM254);
        jsVarM2717.m2720(jkVarM254);
        m250(webView);
        webView.addOnLayoutChangeListener(this);
        int i16 = f71 + 31;
        f70 = i16 % 128;
        int i17 = i16 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m259(List<WebView> list) {
        int i10 = f70 + 83;
        f71 = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 61 / 0;
            if (list == null) {
                return;
            }
        } else {
            if (!(list != null)) {
                return;
            }
        }
        Iterator<WebView> it = list.iterator();
        int i12 = f71 + 99;
        f70 = i12 % 128;
        while (true) {
            int i13 = i12 % 2;
            if ((it.hasNext() ? '*' : '/') != '*') {
                return;
            }
            m264(it.next());
            i12 = f70 + 3;
            f71 = i12 % 128;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m261(String str, List<String> list, boolean z10, boolean z11, boolean z12) {
        this.f83 = z10;
        this.f78 = new jp(str, z12);
        this.f79 = z11;
        this.f81 = list;
        int i10 = f71 + 11;
        f70 = i10 % 128;
        if ((i10 % 2 == 0 ? '`' : '$') != '`') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static JSONObject m256(String str) {
        int i10 = f70 + 21;
        f71 = i10 % 128;
        int i11 = i10 % 2;
        try {
            String strDecode = URLDecoder.decode(str, m249((-673858303) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), (short) ((-1) - MotionEvent.axisFromString("")), TextUtils.getTrimmedLength("") - 1306129008, (byte) (2 - (ViewConfiguration.getScrollBarSize() >> 8)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 83).intern());
            if (!TextUtils.isEmpty(strDecode)) {
                return IronSourceVideoBridge.jsonObjectInit(strDecode);
            }
        } catch (Exception e10) {
            k.m2830(m249((ViewConfiguration.getFadingEdgeLength() >> 16) - 673858342, (short) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (-1306129006) - Color.blue(0), (byte) ((-58) - TextUtils.lastIndexOf("", '0')), TextUtils.indexOf((CharSequence) "", '0', 0) - 81).intern(), m249((-673858298) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (short) ((-1) - TextUtils.lastIndexOf("", '0')), (-1306129024) - TextUtils.getTrimmedLength(""), (byte) ((-57) - MotionEvent.axisFromString("")), TextUtils.indexOf((CharSequence) "", '0', 0, 0) - 81).intern(), e10);
        }
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        int i12 = f70 + 67;
        f71 = i12 % 128;
        int i13 = i12 % 2;
        return jSONObjectJsonObjectInit;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m244(WebView webView) {
        int i10 = f71 + 29;
        f70 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            this.f78.m2711(webView);
            throw null;
        }
        this.f78.m2711(webView);
        int i11 = f70 + 3;
        f71 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m260() {
        Iterator<WebView> it = this.f76.keySet().iterator();
        while (true) {
            if ((it.hasNext() ? '#' : '@') != '#') {
                this.f77.clear();
                this.f82 = null;
                this.f76.clear();
                return;
            }
            WebView next = it.next();
            next.removeOnLayoutChangeListener(this);
            js jsVar = this.f76.get(next);
            Iterator<jk> it2 = this.f77.iterator();
            while (true) {
                if ((it2.hasNext() ? (char) 20 : (char) 29) != 20) {
                    break;
                }
                int i10 = f70 + 41;
                f71 = i10 % 128;
                if (!(i10 % 2 != 0)) {
                    jsVar.m2725(it2.next());
                } else {
                    jsVar.m2725(it2.next());
                    throw null;
                }
            }
            int i11 = f71 + 15;
            f70 = i11 % 128;
            int i12 = i11 % 2;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m248(JSONObject jSONObject, WebView webView, T t10) {
        int i10 = f71 + 103;
        f70 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 22 : 'X') != 22) {
            jSONObject.remove(ih.f2535);
            super.mo267(jSONObject, webView, t10);
            int i11 = f71 + 109;
            f70 = i11 % 128;
            int i12 = i11 % 2;
            return;
        }
        jSONObject.remove(ih.f2535);
        super.mo267(jSONObject, webView, t10);
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private jk m254() {
        AnonymousClass3 anonymousClass3 = new AnonymousClass3();
        int i10 = f71 + 67;
        f70 = i10 % 128;
        int i11 = i10 % 2;
        return anonymousClass3;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m265(String str) {
        int i10 = f70 + 91;
        int i11 = i10 % 128;
        f71 = i11;
        int i12 = i10 % 2;
        this.f80 = str;
        int i13 = i11 + 63;
        f70 = i13 % 128;
        if ((i13 % 2 == 0 ? (char) 11 : 'G') == 'G') {
        } else {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.w
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final String mo263(T t10) {
        int i10 = f70;
        int i11 = i10 + 49;
        f71 = i11 % 128;
        int i12 = i11 % 2;
        String str = this.f80;
        int i13 = i10 + 105;
        f71 = i13 % 128;
        int i14 = i13 % 2;
        return str;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m266(JSONObject jSONObject, WebView webView, T t10) {
        int i10 = f70 + 59;
        f71 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            m251(jSONObject, webView);
            super.mo262(jSONObject, webView, t10);
        } else {
            m251(jSONObject, webView);
            super.mo262(jSONObject, webView, t10);
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m250(WebView webView) {
        int i10 = f70 + 111;
        f71 = i10 % 128;
        if (i10 % 2 == 0) {
            js jsVar = this.f76.get(webView);
            if (this.f83) {
                if (!(!jsVar.m2721())) {
                    if (ki.m2913(webView) ? false : true) {
                        jsVar.m2723();
                    }
                    m244(webView);
                }
            }
            int i11 = f71 + 1;
            f70 = i11 % 128;
            if ((i11 % 2 == 0 ? '<' : '1') != '<') {
                return;
            } else {
                throw null;
            }
        }
        this.f76.get(webView);
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static void m251(JSONObject jSONObject, WebView webView) {
        if ((webView != null ? (char) 20 : '>') != 20) {
            return;
        }
        int i10 = f70 + 9;
        f71 = i10 % 128;
        int i11 = i10 % 2;
        try {
            String str = ih.f2498;
            boolean z10 = false;
            if (!(webView.getWindowToken() != null)) {
                int i12 = f70 + 31;
                f71 = i12 % 128;
                int i13 = i12 % 2;
            } else {
                z10 = true;
            }
            jSONObject.put(str, z10);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static String m249(int i10, short s10, int i11, byte b10, int i12) {
        String string;
        synchronized (o.f2993) {
            StringBuilder sb2 = new StringBuilder();
            int i13 = f75;
            int i14 = i12 + i13;
            boolean z10 = i14 == -1;
            if (z10) {
                byte[] bArr = f72;
                if (bArr != null) {
                    i14 = (byte) (bArr[f74 + i10] + i13);
                } else {
                    i14 = (short) (f69[f74 + i10] + i13);
                }
            }
            if (i14 > 0) {
                o.f2994 = ((i10 + i14) - 2) + f74 + (z10 ? 1 : 0);
                o.f2995 = b10;
                char c10 = (char) (i11 + f73);
                o.f2997 = c10;
                sb2.append(c10);
                o.f2996 = o.f2997;
                o.f2998 = 1;
                while (o.f2998 < i14) {
                    byte[] bArr2 = f72;
                    if (bArr2 != null) {
                        int i15 = o.f2994;
                        o.f2994 = i15 - 1;
                        o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i15] + s10)) ^ o.f2995));
                    } else {
                        short[] sArr = f69;
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
