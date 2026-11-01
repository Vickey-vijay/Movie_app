package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public final class z extends w<View, Activity> {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f3211 = 0;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private static int f3212 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f3213 = 186;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private Class f3214;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private jl f3219;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private View.OnLayoutChangeListener f3220;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private it f3221;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final Map<WebView, aa> f3222 = new WeakHashMap();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final Map<View, z> f3218 = new WeakHashMap();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private final Map<View, View.OnLayoutChangeListener> f3216 = new WeakHashMap();

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private c f3217 = new c();

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private final List<View> f3215 = new ArrayList();

    public class c {

        /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
        private static int f3237 = 1;

        /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
        private static char f3239 = 6;

        /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
        private static int f3241;

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        private boolean f3244;

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private boolean f3248;

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private boolean f3249;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private boolean f3250;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private boolean f3251;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private boolean f3252;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private String f3253;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private String f3254;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private String f3255;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private boolean f3256;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private String f3257;

        /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
        private static char[] f3242 = {'a', 'd', 'V', 'i', 'e', 'w', 'C', 'l', 's', 'N', 'm', 'P', 'c', 'k', 'g', 'j', 'T', 'o', 'I', 'n', 't', 'u', 'W', 'b', 'h', 'r', 'f', 'x', 'S', 'A', 'E', 'v', 'J', 'p', 'K', 'q'};

        /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
        private static char[] f3238 = {'u', 35898, 6391, 42124, 12609, 48399, 18912, 54678, 25133, 61158, 31385, 1871, 37637, 8144, 43920, 14387, 'i', 35898, 6364, 42170, 12624, 48388, 18880, 54682, 25097, 61173, 'u', 35898, 6391, 42142, 12636, 48409, 18884, 54686, 25090, 61154, 'p', 35899, 6397, 42168, 12609, 48414, 18885, 54697, 25121, 61172, 31405, 1872, 37667, 8155, 43955, 14374, 50425, 20663, 56694, 26883, 62918, 33176, 3623, 39659, 'v', 35872, 6391, 42156, 12653, 48393, 18885, 'a', 35882, 6374, 42162, 12626, 48388, 18882, 54678, 25133, 61154, 31374, 1868, 37669, 8146, 43920, 14376, 50402, 20668, 'v', 35872, 6391, 42156, 12631, 48441, 18905, 54710, 25135, 61183, 31413, 1873, 37641};

        /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
        private static long f3240 = 7741231407589067849L;

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        private List<Integer> f3243 = new ArrayList();

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        private List<String> f3245 = new ArrayList();

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        private List<String> f3247 = new ArrayList();

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        private List<String> f3246 = new ArrayList();

        public c() {
        }

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        public static /* synthetic */ String m3121(c cVar) {
            int i10 = f3241 + 67;
            int i11 = i10 % 128;
            f3237 = i11;
            boolean z10 = i10 % 2 == 0;
            String str = cVar.f3257;
            if (z10) {
                throw null;
            }
            int i12 = i11 + 39;
            f3241 = i12 % 128;
            int i13 = i12 % 2;
            return str;
        }

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        public static /* synthetic */ boolean m3123(c cVar) {
            int i10 = f3237;
            int i11 = i10 + 119;
            f3241 = i11 % 128;
            int i12 = i11 % 2;
            boolean z10 = cVar.f3248;
            int i13 = i10 + 1;
            f3241 = i13 % 128;
            int i14 = i13 % 2;
            return z10;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public static /* synthetic */ List m3130(c cVar) {
            int i10 = f3241 + 55;
            f3237 = i10 % 128;
            boolean z10 = i10 % 2 == 0;
            List<Integer> list = cVar.f3243;
            if (z10) {
                int i11 = 62 / 0;
            }
            return list;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public static /* synthetic */ List m3134(c cVar) {
            int i10 = f3237;
            int i11 = i10 + 25;
            f3241 = i11 % 128;
            char c10 = i11 % 2 != 0 ? (char) 23 : '@';
            List<String> list = cVar.f3245;
            if (c10 != '@') {
                int i12 = 52 / 0;
            }
            int i13 = i10 + 65;
            f3241 = i13 % 128;
            int i14 = i13 % 2;
            return list;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public static /* synthetic */ List m3137(c cVar) {
            int i10 = f3241 + 85;
            f3237 = i10 % 128;
            boolean z10 = i10 % 2 != 0;
            List<String> list = cVar.f3247;
            if (!z10) {
                int i11 = 34 / 0;
            }
            return list;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public static /* synthetic */ boolean m3141(c cVar) {
            int i10 = f3241 + 87;
            int i11 = i10 % 128;
            f3237 = i11;
            int i12 = i10 % 2;
            boolean z10 = cVar.f3250;
            int i13 = i11 + 73;
            f3241 = i13 % 128;
            if (i13 % 2 == 0) {
                return z10;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public static /* synthetic */ String m3146(c cVar) {
            int i10 = f3241 + 77;
            f3237 = i10 % 128;
            char c10 = i10 % 2 == 0 ? 'E' : '1';
            String str = cVar.f3255;
            if (c10 != 'E') {
                return str;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
        public static /* synthetic */ String m3115(c cVar) {
            int i10 = f3241 + 17;
            int i11 = i10 % 128;
            f3237 = i11;
            int i12 = i10 % 2;
            String str = cVar.f3254;
            int i13 = i11 + 51;
            f3241 = i13 % 128;
            if (!(i13 % 2 != 0)) {
                return str;
            }
            int i14 = 34 / 0;
            return str;
        }

        /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
        public static /* synthetic */ boolean m3116(c cVar) {
            int i10 = f3237;
            int i11 = i10 + 43;
            f3241 = i11 % 128;
            int i12 = i11 % 2;
            boolean z10 = cVar.f3249;
            int i13 = i10 + 59;
            f3241 = i13 % 128;
            int i14 = i13 % 2;
            return z10;
        }

        /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
        public static /* synthetic */ boolean m3117(c cVar) {
            int i10 = f3237 + 49;
            int i11 = i10 % 128;
            f3241 = i11;
            int i12 = i10 % 2;
            boolean z10 = cVar.f3256;
            int i13 = i11 + 121;
            f3237 = i13 % 128;
            if ((i13 % 2 == 0 ? 'G' : (char) 24) != 'G') {
                return z10;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
        public static /* synthetic */ boolean m3118(c cVar) {
            int i10 = f3237 + 79;
            f3241 = i10 % 128;
            char c10 = i10 % 2 != 0 ? 'V' : 'I';
            boolean z10 = cVar.f3251;
            if (c10 != 'I') {
                int i11 = 6 / 0;
            }
            return z10;
        }

        /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
        public static /* synthetic */ List m3119(c cVar) {
            int i10 = f3241 + 111;
            int i11 = i10 % 128;
            f3237 = i11;
            int i12 = i10 % 2;
            List<String> list = cVar.f3246;
            int i13 = i11 + 59;
            f3241 = i13 % 128;
            if ((i13 % 2 != 0 ? '[' : (char) 29) != '[') {
                return list;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private c m3120(boolean z10) {
            int i10 = f3237;
            int i11 = i10 + 71;
            f3241 = i11 % 128;
            int i12 = i11 % 2;
            this.f3244 = z10;
            int i13 = i10 + 59;
            f3241 = i13 % 128;
            int i14 = i13 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private c m3122(boolean z10) {
            int i10 = f3241 + 73;
            int i11 = i10 % 128;
            f3237 = i11;
            int i12 = i10 % 2;
            this.f3251 = z10;
            int i13 = i11 + 1;
            f3241 = i13 % 128;
            int i14 = i13 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        public static /* synthetic */ String m3124(c cVar) {
            int i10 = f3237;
            int i11 = i10 + 1;
            f3241 = i11 % 128;
            int i12 = i11 % 2;
            String str = cVar.f3253;
            int i13 = i10 + 115;
            f3241 = i13 % 128;
            int i14 = i13 % 2;
            return str;
        }

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        public static /* synthetic */ boolean m3125(c cVar) {
            int i10 = f3241 + 37;
            f3237 = i10 % 128;
            boolean z10 = i10 % 2 == 0;
            boolean z11 = cVar.f3252;
            if (z10) {
                int i11 = 70 / 0;
            }
            return z11;
        }

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        public static /* synthetic */ boolean m3126(c cVar) {
            int i10 = f3241 + 75;
            f3237 = i10 % 128;
            char c10 = i10 % 2 == 0 ? 'L' : '8';
            boolean z10 = cVar.f3244;
            if (c10 == 'L') {
                int i11 = 49 / 0;
            }
            return z10;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private c m3127(String str) {
            int i10 = f3241;
            int i11 = i10 + 41;
            f3237 = i11 % 128;
            int i12 = i11 % 2;
            this.f3255 = str;
            int i13 = i10 + 91;
            f3237 = i13 % 128;
            int i14 = i13 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private c m3131(String str) {
            int i10 = f3241 + 71;
            int i11 = i10 % 128;
            f3237 = i11;
            int i12 = i10 % 2;
            this.f3253 = str;
            int i13 = i11 + 103;
            f3241 = i13 % 128;
            int i14 = i13 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private c m3136(boolean z10) {
            int i10 = f3237;
            int i11 = i10 + 37;
            f3241 = i11 % 128;
            if (!(i11 % 2 == 0)) {
                this.f3248 = z10;
                throw null;
            }
            this.f3248 = z10;
            int i12 = i10 + 47;
            f3241 = i12 % 128;
            if ((i12 % 2 != 0 ? '%' : (char) 27) != '%') {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private c m3138(String str) {
            int i10 = f3237 + 47;
            int i11 = i10 % 128;
            f3241 = i11;
            int i12 = i10 % 2;
            this.f3257 = str;
            int i13 = i11 + 35;
            f3237 = i13 % 128;
            if (i13 % 2 != 0) {
                return this;
            }
            int i14 = 15 / 0;
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private c m3142(String str) {
            int i10 = f3237 + 51;
            f3241 = i10 % 128;
            if ((i10 % 2 != 0 ? (char) 17 : '\n') != 17) {
                this.f3254 = str;
            } else {
                this.f3254 = str;
                int i11 = 65 / 0;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private c m3129(boolean z10) {
            int i10 = f3237;
            int i11 = i10 + 65;
            f3241 = i11 % 128;
            if (i11 % 2 == 0) {
                this.f3249 = z10;
                int i12 = i10 + 69;
                f3241 = i12 % 128;
                if (i12 % 2 == 0) {
                    return this;
                }
                throw null;
            }
            this.f3249 = z10;
            throw null;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private c m3132(boolean z10) {
            int i10 = f3237 + 59;
            f3241 = i10 % 128;
            if ((i10 % 2 != 0 ? ':' : '2') != ':') {
                this.f3250 = z10;
            } else {
                this.f3250 = z10;
                int i11 = 34 / 0;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private c m3140(boolean z10) {
            int i10 = f3237 + 3;
            int i11 = i10 % 128;
            f3241 = i11;
            int i12 = i10 % 2;
            this.f3256 = z10;
            int i13 = i11 + 43;
            f3237 = i13 % 128;
            if (!(i13 % 2 == 0)) {
                return this;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private c m3144(boolean z10) {
            int i10 = f3241 + 97;
            int i11 = i10 % 128;
            f3237 = i11;
            int i12 = i10 % 2;
            this.f3252 = z10;
            int i13 = i11 + 73;
            f3241 = i13 % 128;
            int i14 = i13 % 2;
            return this;
        }

        public c(JSONObject jSONObject) {
            m3127(jSONObject.optString(m3133("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\u0002\u0006\t\n\u0004\u0006u", KeyEvent.normalizeMetaState(0) + 15, (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 16)).intern()));
            m3131(jSONObject.optString(m3133("\u0001\u0002\u0003\u0004\u0005\u0000\u0006\u0005\r\u000e\u0002\f\u008b", 12 - TextUtils.indexOf((CharSequence) "", '0'), (byte) (39 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)))).intern()));
            m3138(jSONObject.optString(m3133("\u000e\t\u0011\f\u0013\u0014\u0010\u0003\u000e\u0012", 10 - Drawable.resolveOpacity(0, 0), (byte) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 27)).intern()));
            m3140(jSONObject.optBoolean(m3145(ViewConfiguration.getWindowTouchSlop() >> 8, (char) ((Process.getThreadPriority(0) + 20) >> 6), 16 - (Process.myTid() >> 22)).intern()));
            jSONObject.optBoolean(m3133("\u0014\t\n\u001c\u0005\u0016\f\u001e\u001d\r\u0010\n\u0007\b\u0004\u0005\u0014\u0015", KeyEvent.normalizeMetaState(0) + 18, (byte) (51 - TextUtils.indexOf("", ""))).intern());
            m3142(jSONObject.optString(m3133("\u0013\u001b\b\u0006\u001c\u0001\u001b\u0002É", MotionEvent.axisFromString("") + 10, (byte) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 82)).intern()));
            m3136(jSONObject.optBoolean(m3145(Color.argb(0, 0, 0, 0) + 16, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getTapTimeout() >> 16) + 10).intern()));
            m3144(jSONObject.optBoolean(m3133("\u001d\u000e\u0018\r\n\"\u0001\u0016\u0005\u0019§§\u001f \u0001\u0016\u001a\u000e", 19 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 59)).intern()));
            m3132(jSONObject.optBoolean(m3133("\u001c\u0001\u000f\u0012\u001a\u0007\u0001!Û", 9 - (ViewConfiguration.getFadingEdgeLength() >> 16), (byte) (TextUtils.lastIndexOf("", '0') + 119)).intern()));
            m3129(jSONObject.optBoolean(m3133("\u0014\t\u0002\"\u0001\u001e\u0002\u0006\r\u0018\t\u0003«", 13 - View.MeasureSpec.makeMeasureSpec(0, 0), (byte) (55 - (ViewConfiguration.getEdgeSlop() >> 16))).intern(), true));
            m3122(jSONObject.optBoolean(m3145(Gravity.getAbsoluteGravity(0, 0) + 26, (char) TextUtils.indexOf("", "", 0, 0), 10 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern()));
            m3120(jSONObject.optBoolean(m3145(36 - ExpandableListView.getPackedPositionType(0L), (char) TextUtils.getTrimmedLength(""), TextUtils.getCapsMode("", 0, 0) + 24).intern(), true));
            m3135(jz.m2800(jSONObject.optJSONArray(m3145((ViewConfiguration.getTouchSlop() >> 8) + 60, (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 6 - TextUtils.lastIndexOf("", '0', 0)).intern())));
            m3143(jz.m2800(jSONObject.optJSONArray(m3145(67 - View.combineMeasuredStates(0, 0), (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 18 - ExpandableListView.getPackedPositionGroup(0L)).intern())));
            m3139(jz.m2800(jSONObject.optJSONArray(m3145((-16777131) - Color.rgb(0, 0, 0), (char) View.MeasureSpec.getMode(0), Drawable.resolveOpacity(0, 0) + 13).intern())));
            m3128(jz.m2800(jSONObject.optJSONArray(m3133("\r\u0006\u0002\u0006\n\u0002\n\u000e\u0010#||\u0087", (Process.myPid() >> 22) + 13, (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 23)).intern())));
        }

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private c m3135(List<Integer> list) {
            if ((list != null ? '.' : 'a') != 'a') {
                int i10 = f3241 + 39;
                f3237 = i10 % 128;
                char c10 = i10 % 2 == 0 ? 'c' : '+';
                this.f3243 = list;
                if (c10 != '+') {
                    int i11 = 74 / 0;
                }
            }
            int i12 = f3237 + 125;
            f3241 = i12 % 128;
            int i13 = i12 % 2;
            return this;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m3133(String str, int i10, byte b10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (g.f2129) {
                char[] cArr2 = f3242;
                char c10 = f3239;
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

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private c m3139(List<String> list) {
            int i10 = f3241 + 107;
            int i11 = i10 % 128;
            f3237 = i11;
            if ((i10 % 2 == 0 ? (char) 11 : 'U') != 11) {
                if (list != null) {
                    this.f3247 = list;
                }
                int i12 = i11 + 103;
                f3241 = i12 % 128;
                if (i12 % 2 == 0) {
                    return this;
                }
                throw null;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private c m3143(List<String> list) {
            int i10 = f3241;
            int i11 = i10 + 23;
            f3237 = i11 % 128;
            if ((i11 % 2 == 0 ? (char) 16 : 'a') != 'a') {
                throw null;
            }
            if (list != null) {
                int i12 = i10 + 3;
                f3237 = i12 % 128;
                if (i12 % 2 == 0) {
                    this.f3245 = list;
                    int i13 = 47 / 0;
                } else {
                    this.f3245 = list;
                }
            }
            return this;
        }

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private c m3128(List<String> list) {
            int i10 = f3241 + 57;
            int i11 = i10 % 128;
            f3237 = i11;
            int i12 = i10 % 2;
            if ((list != null ? (char) 27 : '(') != '(') {
                this.f3246 = list;
                int i13 = i11 + 65;
                f3241 = i13 % 128;
                int i14 = i13 % 2;
            }
            return this;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m3145(int i10, char c10, int i11) {
            String str;
            synchronized (d.f1653) {
                char[] cArr = new char[i11];
                d.f1652 = 0;
                while (true) {
                    int i12 = d.f1652;
                    if (i12 < i11) {
                        cArr[i12] = (char) ((((long) f3238[i10 + i12]) ^ (((long) i12) * f3240)) ^ ((long) c10));
                        d.f1652 = i12 + 1;
                    } else {
                        str = new String(cArr);
                    }
                }
            }
            return str;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ List m3095(z zVar) {
        int i10 = f3212 + 111;
        int i11 = i10 % 128;
        f3211 = i11;
        int i12 = i10 % 2;
        List<View> list = zVar.f3215;
        int i13 = i11 + 17;
        f3212 = i13 % 128;
        if ((i13 % 2 == 0 ? (char) 24 : '(') != 24) {
            return list;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ c m3099(z zVar) {
        int i10 = f3212 + 39;
        f3211 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        c cVar = zVar.f3217;
        if (!z10) {
            return cVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Map m3101(z zVar) {
        int i10 = f3212;
        int i11 = i10 + 27;
        f3211 = i11 % 128;
        int i12 = i11 % 2;
        Map<View, View.OnLayoutChangeListener> map = zVar.f3216;
        int i13 = i10 + 91;
        f3211 = i13 % 128;
        int i14 = i13 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ View.OnLayoutChangeListener m3105(z zVar) {
        int i10 = f3212;
        int i11 = i10 + 125;
        f3211 = i11 % 128;
        int i12 = i11 % 2;
        View.OnLayoutChangeListener onLayoutChangeListener = zVar.f3220;
        int i13 = i10 + 93;
        f3211 = i13 % 128;
        int i14 = i13 % 2;
        return onLayoutChangeListener;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ Class m3109(z zVar) {
        int i10 = f3212;
        int i11 = i10 + 33;
        f3211 = i11 % 128;
        boolean z10 = i11 % 2 == 0;
        Class cls = zVar.f3214;
        if (!z10) {
            throw null;
        }
        int i12 = i10 + 27;
        f3211 = i12 % 128;
        int i13 = i12 % 2;
        return cls;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m3094() {
        int i10 = f3212 + 71;
        int i11 = i10 % 128;
        f3211 = i11;
        int i12 = i10 % 2;
        int i13 = i11 + 33;
        f3212 = i13 % 128;
        int i14 = i13 % 2;
        return null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m3103(z zVar, List list) {
        int i10 = f3211 + 101;
        f3212 = i10 % 128;
        int i11 = i10 % 2;
        zVar.m3097((List<View>) list);
        int i12 = f3211 + 39;
        f3212 = i12 % 128;
        if ((i12 % 2 == 0 ? 'Y' : 'L') != 'L') {
            int i13 = 96 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m3111() {
        m3051((r) null);
        ji.m2667().m2675(this.f3219);
        HashSet hashSet = new HashSet(this.f3216.keySet());
        this.f3216.clear();
        Iterator it = hashSet.iterator();
        int i10 = f3211 + 65;
        f3212 = i10 % 128;
        while (true) {
            int i11 = i10 % 2;
            if ((it.hasNext() ? '\'' : '4') != '\'') {
                return;
            }
            ((View) it.next()).removeOnLayoutChangeListener(this.f3220);
            i10 = f3211 + 105;
            f3212 = i10 % 128;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.w
    /* JADX INFO: renamed from: ﾇ */
    public final /* synthetic */ String mo263(Activity activity) {
        int i10 = f3212 + 69;
        f3211 = i10 % 128;
        int i11 = i10 % 2;
        String strM3094 = m3094();
        int i12 = f3212 + 11;
        f3211 = i12 % 128;
        if ((i12 % 2 != 0 ? 'D' : (char) 25) != 'D') {
            return strM3094;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m3113(JSONObject jSONObject, it itVar) {
        this.f3217 = new c(jSONObject);
        this.f3221 = itVar;
        int i10 = f3212 + 57;
        f3211 = i10 % 128;
        if (i10 % 2 == 0) {
        } else {
            throw null;
        }
    }

    public z(JSONObject jSONObject, it itVar) {
        m3113(jSONObject, itVar);
        m3102();
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m3097(List<View> list) {
        int i10 = f3212 + 37;
        f3211 = i10 % 128;
        int i11 = i10 % 2;
        int i12 = 0;
        while (true) {
            if (!(i12 < list.size())) {
                int i13 = f3211 + 19;
                f3212 = i13 % 128;
                int i14 = i13 % 2;
                return;
            } else {
                int i15 = f3212 + 47;
                f3211 = i15 % 128;
                if (!(i15 % 2 != 0)) {
                    m3100(list.get(i12), this.f3217);
                    i12++;
                } else {
                    m3100(list.get(i12), this.f3217);
                    i12 += 81;
                }
            }
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m3102() {
        this.f3220 = new View.OnLayoutChangeListener() { // from class: com.ironsource.adqualitysdk.sdk.i.z.4

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f3229 = 1;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f3230 = 0;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static boolean f3231 = true;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static boolean f3232 = true;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char[] f3233 = {323, 342, 338, 356, 302, 337, 352, 309, 334, 347, 345, 351, 306, 348, 269, 313, 358, 354, 353, 304, 341, 340};

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f3234 = 237;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static String m3114(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                    char[] cArr2 = f3233;
                    int i11 = f3234;
                    if (f3231) {
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
                    if (f3232) {
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

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                int i18 = f3229 + 121;
                f3230 = i18 % 128;
                try {
                    if (!(i18 % 2 == 0)) {
                        z.this.m3112(view);
                        throw null;
                    }
                    z.this.m3112(view);
                    int i19 = f3229 + 107;
                    f3230 = i19 % 128;
                    int i20 = i19 % 2;
                } catch (Throwable th2) {
                    kd.m2872(m3114(null, ((Process.getThreadPriority(0) + 20) >> 6) + 127, null, "\u008c\u0083\u008b\u0086\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern(), m3114(null, 127 - View.resolveSizeAndState(0, 0, 0), null, "\u0083\u0096\u008a\u0089\u0095\u0094\u0093\u0092\u008e\u0091\u0089\u0090\u008a\u008e\u008f\u008a\u0082\u008f\u008c\u008e\u008c\u008c\u008d").intern(), th2, false);
                }
            }
        };
        this.f3219 = new jl() { // from class: com.ironsource.adqualitysdk.sdk.i.z.1
            @Override // com.ironsource.adqualitysdk.sdk.i.jl
            /* JADX INFO: renamed from: ﻐ */
            public final void mo285(View view) {
                view.removeOnLayoutChangeListener(z.m3105(z.this));
                z.m3101(z.this).remove(view);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jl
            /* JADX INFO: renamed from: ﻛ */
            public final void mo289(View view) {
                view.addOnLayoutChangeListener(z.m3105(z.this));
                z.m3101(z.this).put(view, z.m3105(z.this));
            }
        };
        ji.m2667().m2674(this.f3219);
        int i10 = f3211 + 103;
        f3212 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m3107(Activity activity, View view, Class cls, boolean z10, List list, List list2, List list3) {
        int i10 = f3211 + 57;
        f3212 = i10 % 128;
        int i11 = i10 % 2;
        m3096(activity, view, cls, z10, list, list2, list3);
        int i12 = f3211 + 43;
        f3212 = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private r<WebView, Activity> m3108() {
        bb.e eVar = new bb.e() { // from class: com.ironsource.adqualitysdk.sdk.i.z.5
            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* bridge */ /* synthetic */ void mo1703(JSONObject jSONObject, Object obj, Object obj2) {
                z.this.mo1703(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* bridge */ /* synthetic */ void mo262(JSONObject jSONObject, Object obj, Object obj2) {
                z.this.mo262(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* bridge */ /* synthetic */ void mo1712(JSONObject jSONObject, Object obj, Object obj2) {
                z.this.mo1712(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻛ */
            public final /* bridge */ /* synthetic */ void mo1706(JSONObject jSONObject, Object obj, Object obj2) {
                z.this.mo1706(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾒ */
            public final /* bridge */ /* synthetic */ void mo267(JSONObject jSONObject, Object obj, Object obj2) {
                z.this.mo267(jSONObject, (WebView) obj, (Activity) obj2);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﻐ */
            public final /* bridge */ /* synthetic */ void mo1704(JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                z.this.mo1704(jSONObject, (WebView) obj, obj2, (Activity) obj3);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ｋ */
            public final /* bridge */ /* synthetic */ void mo1709(JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                z.this.mo1709(jSONObject, (WebView) obj, obj2, (Activity) obj3);
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.r
            /* JADX INFO: renamed from: ﾇ */
            public final /* bridge */ /* synthetic */ void mo1713(JSONObject jSONObject, Object obj, Object obj2, Object obj3) {
                z.this.mo1713(jSONObject, (WebView) obj, obj2, (Activity) obj3);
            }
        };
        int i10 = f3211 + 37;
        f3212 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 0 : (char) 28) != 0) {
            return eVar;
        }
        int i11 = 90 / 0;
        return eVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m3112(final View view) {
        try {
            if (this.f3214 == null) {
                int i10 = f3212 + 119;
                f3211 = i10 % 128;
                if (i10 % 2 != 0) {
                    this.f3214 = Class.forName(c.m3146(this.f3217));
                    throw null;
                }
                this.f3214 = Class.forName(c.m3146(this.f3217));
            }
            final Activity activityMo2677 = jj.m2676().mo2677();
            if (activityMo2677 == null) {
                return;
            }
            if ((!c.m3134(this.f3217).isEmpty() ? (char) 21 : 'P') == 21) {
                int i11 = f3211 + 117;
                f3212 = i11 % 128;
                int i12 = i11 % 2;
                Activity activityM2890 = ke.m2890(view);
                if ((activityM2890 != null ? '*' : (char) 18) != 18) {
                    int i13 = f3212 + 73;
                    f3211 = i13 % 128;
                    int i14 = i13 % 2;
                    if (c.m3134(this.f3217).contains(activityM2890.getClass().getName())) {
                        return;
                    }
                }
            }
            t.m2995(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.z.2
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() {
                    z.m3095(z.this).clear();
                    z.m3107(activityMo2677, view, z.m3109(z.this), c.m3141(z.m3099(z.this)), c.m3130(z.m3099(z.this)), c.m3137(z.m3099(z.this)), z.m3095(z.this));
                    if (ke.m2885(view, z.m3109(z.this), null, c.m3130(z.m3099(z.this)), c.m3137(z.m3099(z.this)))) {
                        z.m3095(z.this).add(view);
                    }
                    final ArrayList arrayList = new ArrayList(z.m3095(z.this));
                    if (c.m3126(z.m3099(z.this))) {
                        t.m2993(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.z.2.2
                            @Override // com.ironsource.adqualitysdk.sdk.i.ir
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo276() {
                                z.m3103(z.this, arrayList);
                            }
                        });
                    } else {
                        z.m3103(z.this, arrayList);
                    }
                }
            });
        } catch (Throwable th2) {
            String strIntern = m3110(14 - TextUtils.getTrimmedLength(""), 285 - TextUtils.getCapsMode("", 0, 0), ExpandableListView.getPackedPositionChild(0L) + 12, "\u0001\u000b\ufffe￥\u0010\u0001\uffde\u0014\u0002\u0006\ufff3\u000f\u0002\t", true).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m3110(19 - TextUtils.lastIndexOf("", '0'), AndroidCharacter.getMirror('0') + 233, 10 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), "\u0015\u0006\b\uffc1\u0013\u0010\u0013\u0013￦\uffc1\u0014\u0014\u0002\r\u0004\uffc1\b\u000f\n\u0015", true).intern());
            sb2.append(c.m3146(this.f3217));
            sb2.append(m3110(2 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 222 - View.resolveSizeAndState(0, 0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 1, "￼￼\t", false).intern());
            sb2.append(th2.getLocalizedMessage());
            k.m2810(strIntern, sb2.toString());
            m3111();
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static <E extends View> void m3096(Activity activity, View view, Class<E> cls, boolean z10, List<Integer> list, List<String> list2, List<E> list3) {
        int i10 = f3211 + 39;
        f3212 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 1 : (char) 23) != 23) {
            throw null;
        }
        if ((view != null ? (char) 6 : '5') != 6) {
            ke.m2888(activity, cls, z10, list, list2, list3);
            return;
        }
        ke.m2894(view, cls, false, z10, list, list2, list3);
        int i11 = f3211 + 73;
        f3212 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m3110(int i10, int i11, int i12, String str, boolean z10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (b.f706) {
            char[] cArr2 = new char[i10];
            b.f704 = 0;
            while (true) {
                int i13 = b.f704;
                if (i13 >= i10) {
                    break;
                }
                b.f705 = cArr[i13];
                cArr2[b.f704] = (char) (b.f705 + i11);
                int i14 = b.f704;
                cArr2[i14] = (char) (cArr2[i14] - f3213);
                b.f704 = i14 + 1;
            }
            if (i12 > 0) {
                b.f707 = i12;
                char[] cArr3 = new char[i10];
                System.arraycopy(cArr2, 0, cArr3, 0, i10);
                int i15 = b.f707;
                System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                int i16 = b.f707;
                System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
            }
            if (z10) {
                char[] cArr4 = new char[i10];
                b.f704 = 0;
                while (true) {
                    int i17 = b.f704;
                    if (i17 >= i10) {
                        break;
                    }
                    cArr4[i17] = cArr2[(i10 - i17) - 1];
                    b.f704 = i17 + 1;
                }
                cArr2 = cArr4;
            }
            str2 = new String(cArr2);
        }
        return str2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean m3104(View view) {
        int i10 = f3211 + 45;
        f3212 = i10 % 128;
        if (i10 % 2 != 0) {
            if (!(this.f3221 != null)) {
                return true;
            }
            if ((m3098(view, c.m3119(this.f3217)) ? (char) 28 : (char) 1) != 1) {
                int i11 = f3212 + 27;
                f3211 = i11 % 128;
                if (i11 % 2 != 0) {
                    this.f3221.mo1699(view);
                    throw null;
                }
                if (this.f3221.mo1699(view)) {
                    return true;
                }
            }
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m3098(View view, List<String> list) {
        int i10 = f3212 + 91;
        f3211 = i10 % 128;
        int i11 = i10 % 2;
        if ((list != null) && !list.isEmpty()) {
            int i12 = f3212 + 121;
            f3211 = i12 % 128;
            int i13 = i12 % 2;
            String name = view.getClass().getPackage().getName();
            Iterator<String> it = list.iterator();
            while (true) {
                if ((it.hasNext() ? '(' : 'D') != '(') {
                    return false;
                }
                int i14 = f3212 + 71;
                f3211 = i14 % 128;
                int i15 = i14 % 2;
                String strM3106 = m3106(it.next());
                if ((!TextUtils.isEmpty(strM3106) ? '3' : (char) 11) != 11) {
                    int i16 = f3211 + 119;
                    f3212 = i16 % 128;
                    int i17 = i16 % 2;
                    if ((name.startsWith(strM3106) ? ';' : 'a') != ';') {
                    }
                }
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m3100(View view, c cVar) {
        if (!m3104(view)) {
            return;
        }
        if (c.m3123(cVar)) {
            int i10 = f3212 + 71;
            f3211 = i10 % 128;
            if (i10 % 2 == 0) {
                if (this.f3218.get(view) == null) {
                    this.f3218.put(view, this);
                    mo262(IronSourceVideoBridge.jsonObjectInit(), view, null);
                    int i11 = f3211 + 81;
                    f3212 = i11 % 128;
                    if (i11 % 2 == 0) {
                        int i12 = 8 / 0;
                        return;
                    }
                    return;
                }
                if (c.m3125(cVar)) {
                    mo262(IronSourceVideoBridge.jsonObjectInit(), view, null);
                    return;
                }
                return;
            }
            this.f3218.get(view);
            try {
                throw null;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ArrayList arrayList = new ArrayList();
        ke.m2894(view, WebView.class, false, c.m3141(cVar), c.m3130(cVar), c.m3137(cVar), arrayList);
        if (!(!(view instanceof WebView))) {
            arrayList.add((WebView) view);
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                return;
            }
            int i13 = f3211 + 37;
            f3212 = i13 % 128;
            int i14 = i13 % 2;
            WebView webView = (WebView) it.next();
            if (this.f3218.get(webView) == null && webView.getClass().getName().startsWith(c.m3124(cVar))) {
                ab abVar = new ab();
                this.f3222.put(webView, abVar);
                abVar.m261(c.m3121(cVar), TextUtils.isEmpty(c.m3115(cVar)) ? null : Arrays.asList(c.m3115(cVar).split(m3110((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 230 - Drawable.resolveOpacity(0, 0), 1 - KeyEvent.keyCodeFromString(""), "\u0000", false).intern())), c.m3116(cVar), c.m3117(cVar), c.m3118(cVar));
                abVar.m3051(m3108());
                abVar.m264(webView);
                abVar.m265(Integer.toHexString(webView.hashCode()));
                this.f3218.put(webView, this);
            }
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m3106(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        List listAsList = Arrays.asList(str.split(m3110(TextUtils.indexOf((CharSequence) "", '0') + 4, (ViewConfiguration.getTouchSlop() >> 8) + 262, (ViewConfiguration.getScrollBarSize() >> 8) + 2, "￢\u000f\u0011", true).intern()));
        if ((listAsList.size() <= 3 ? '_' : '=') != '=') {
            int i10 = f3212;
            int i11 = i10 + 75;
            f3211 = i11 % 128;
            int i12 = i11 % 2;
            int i13 = i10 + 35;
            f3211 = i13 % 128;
            int i14 = i13 % 2;
            return str;
        }
        String strJoin = TextUtils.join(m3110(View.MeasureSpec.getMode(0) + 1, 232 - TextUtils.getTrimmedLength(""), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1, "\u0000", true).intern(), listAsList.subList(0, 3));
        int i15 = f3211 + 113;
        f3212 = i15 % 128;
        int i16 = i15 % 2;
        return strJoin;
    }
}
