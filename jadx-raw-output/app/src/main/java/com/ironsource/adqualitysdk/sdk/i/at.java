package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.core.view.ViewCompat;
import androidx.exifinterface.media.ExifInterface;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.adqualitysdk.sdk.i.bb.AnonymousClass4;
import com.ironsource.adqualitysdk.sdk.i.bb.AnonymousClass5;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public final class at {

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private static char f423 = 4824;

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private static char f424 = 7412;

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private static int f425 = 0;

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private static int f426 = 1;

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private static char[] f427 = {'a', 194, 194, 194, 194, 194, 194, 194, 194, 194, 194, 194, 194, 194, 187, 217, 258, 261, 259, 245, 246, 263, 264, 255, 249, 215, 197, 231, 239, 248, 256, 251, 255, 259, 267, 225, '9', 'k', 'f', 'd', 'g', 'g', 'W', '_', 'p', 'q', 'k', 'd', 'i', 'n', 'n', 'Y', 187, 142, 188, 183, 184, 178, 188, 187, 174, 191, 'i', 187, 184, 189, 172, 174, 183, 183, 184, 172, 'i', 176, 183, 178, 173, 173, 170, 'i', 187, 184, 187, '2', 'k', 'r', 'r', '9', 'r', 'p', 'p', 'r', 'k', 'B', 'I', 'p', 'q', 'k', 'd', 'i', 'n', 'n', 'i', 'A', 'C', 'j', 'k', 'f', 'd', 'b', '@', 'I', 'p', 'p', 'r', '[', '2', 'c', 'k', '\"', 'D', 'H', 'G', 'A', 'G', 'I', '8', 130, 154, 150, 141, 147, 150, 151, 150, 'o', 316, 313, 308, 313};

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static char f428 = 61156;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private static char f429 = 55904;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private ISAdQualityInitListener f430;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private az f431;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private iz f432;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private bb f436;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private String f437;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean f440 = false;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private List<cm> f441 = new ArrayList();

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private List<gl> f439 = new ArrayList();

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Map<String, JSONObject> f438 = new HashMap();

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Map<String, String> f442 = new HashMap();

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private db f435 = new db();

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private du f434 = du.m2105();

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private Map<String, aw> f433 = new HashMap();

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.at$2, reason: invalid class name */
    public class AnonymousClass2 extends ir {

        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
        private /* synthetic */ String f488;

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private /* synthetic */ List f489;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final /* synthetic */ Runnable f490;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final /* synthetic */ Context f491;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private /* synthetic */ String f493;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final /* synthetic */ Map f494;

        public AnonymousClass2(String str, Context context, String str2, List list, Map map, Runnable runnable) {
            this.f493 = str;
            this.f491 = context;
            this.f488 = str2;
            this.f489 = list;
            this.f494 = map;
            this.f490 = runnable;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ir
        /* JADX INFO: renamed from: ﾒ */
        public final void mo276() {
            if (ar.m483().mo513(this.f493, at.m570(at.this))) {
                at.m620(at.this, this.f491, this.f488, this.f493, this.f489, new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.2.3
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        if (at.m577(at.this)) {
                            t.m2994(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.2.3.3
                                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                                /* JADX INFO: renamed from: ﾒ */
                                public final void mo276() {
                                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                                    at.m594(at.this, anonymousClass2.f491, anonymousClass2.f494, anonymousClass2.f490);
                                }
                            }, ar.m483().mo486());
                        }
                    }
                });
                return;
            }
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            at.m605(at.this, this.f493, jSONObjectJsonObjectInit);
            at.m569(at.this).put(this.f493, jSONObjectJsonObjectInit);
            t.m2994(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.2.1
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() {
                    AnonymousClass2 anonymousClass2 = AnonymousClass2.this;
                    at.m594(at.this, anonymousClass2.f491, anonymousClass2.f494, anonymousClass2.f490);
                }
            }, ar.m483().mo486());
        }
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private synchronized boolean m565() {
        int i10 = f426 + 69;
        f425 = i10 % 128;
        int i11 = i10 % 2;
        if ((ar.m483().mo487() ? 'G' : (char) 11) != 11) {
            if ((m567() ? '7' : 'A') != 'A') {
                int i12 = f426 + 35;
                int i13 = i12 % 128;
                f425 = i13;
                int i14 = i12 % 2;
                int i15 = i13 + 61;
                f426 = i15 % 128;
                int i16 = i15 % 2;
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private synchronized void m566() {
        if (this.f436.m791()) {
            m627().adQualitySdkInitSuccess();
            int i10 = f426 + 71;
            f425 = i10 % 128;
            int i11 = i10 % 2;
            return;
        }
        int i12 = f426 + 97;
        f425 = i12 % 128;
        int i13 = i12 % 2;
        m627().adQualitySdkInitFailed(ISAdQualityInitError.CONNECTOR_LOAD_TIMEOUT, m612("\uf8f1\uf8a0秶\uf087牗ŕᓗ뮕㎘鐜讶ꆼ㎘鐜坤皷ㄡ雫瑇欎鐠쇯뺢⟭钅♧퍮똙\udb93皟\uf241摧睱轴\uec32䊤\u1af7ྺ秶\uf087冞襮슑㸑䠁ᓝ䱣⌮ᓥ︌昄㓧\uf443Ō", 53 - (ViewConfiguration.getLongPressTimeout() >> 16)).intern());
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private synchronized boolean m567() {
        boolean zMo484;
        int i10 = f425 + 57;
        f426 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            ar.m483().mo484();
            throw null;
        }
        zMo484 = ar.m483().mo484();
        int i11 = f426 + 115;
        f425 = i11 % 128;
        if ((i11 % 2 != 0 ? '-' : '\n') == '-') {
            throw null;
        }
        throw th;
        return zMo484;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ Map m569(at atVar) {
        int i10 = f425 + 63;
        f426 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 29 : 'H') == 29) {
            atVar.m568();
            throw null;
        }
        Map<String, JSONObject> mapM568 = atVar.m568();
        int i11 = f426 + 123;
        f425 = i11 % 128;
        if ((i11 % 2 != 0 ? (char) 25 : (char) 0) != 25) {
            return mapM568;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ String m570(at atVar) {
        int i10 = f426 + 15;
        int i11 = i10 % 128;
        f425 = i11;
        int i12 = i10 % 2;
        String str = atVar.f437;
        int i13 = i11 + 65;
        f426 = i13 % 128;
        if ((i13 % 2 == 0 ? (char) 20 : (char) 11) == 11) {
            return str;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ void m573(at atVar) {
        int i10 = f425 + 99;
        f426 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        atVar.m601();
        if (z10) {
            int i11 = 71 / 0;
        }
        int i12 = f425 + 31;
        f426 = i12 % 128;
        if ((i12 % 2 == 0 ? '!' : '#') != '#') {
            int i13 = 33 / 0;
        }
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ List m575(at atVar) {
        int i10 = f425 + 97;
        f426 = i10 % 128;
        if ((i10 % 2 == 0 ? 'L' : '!') == '!') {
            return atVar.m572();
        }
        atVar.m572();
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static /* synthetic */ boolean m577(at atVar) {
        int i10 = f425 + 35;
        f426 = i10 % 128;
        char c10 = i10 % 2 == 0 ? 'R' : '2';
        boolean zM567 = atVar.m567();
        if (c10 == 'R') {
            int i11 = 21 / 0;
        }
        return zM567;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ cm m579(at atVar, Context context, String str, bd bdVar) {
        int i10 = f426 + 95;
        f425 = i10 % 128;
        int i11 = i10 % 2;
        cm cmVarM578 = atVar.m578(context, str, bdVar);
        int i12 = f426 + 69;
        f425 = i12 % 128;
        int i13 = i12 % 2;
        return cmVarM578;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Map m590(at atVar) {
        int i10 = f426 + 95;
        f425 = i10 % 128;
        int i11 = i10 % 2;
        Map<String, String> mapM571 = atVar.m571();
        int i12 = f425 + 33;
        f426 = i12 % 128;
        int i13 = i12 % 2;
        return mapM571;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ List m598(at atVar) {
        int i10 = f425 + 21;
        f426 = i10 % 128;
        int i11 = i10 % 2;
        List<cm> listM576 = atVar.m576();
        int i12 = f426 + 57;
        f425 = i12 % 128;
        if (i12 % 2 == 0) {
            return listM576;
        }
        int i13 = 43 / 0;
        return listM576;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ bb m609(at atVar) {
        int i10 = f425 + 85;
        int i11 = i10 % 128;
        f426 = i11;
        char c10 = i10 % 2 == 0 ? '!' : 'I';
        bb bbVar = atVar.f436;
        if (c10 != 'I') {
            throw null;
        }
        int i12 = i11 + 95;
        f425 = i12 % 128;
        if (i12 % 2 == 0) {
            return bbVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ JSONObject m613(at atVar, cm cmVar) {
        int i10 = f426 + 53;
        f425 = i10 % 128;
        if ((i10 % 2 != 0 ? 'M' : 'F') != 'M') {
            return m591(cmVar);
        }
        m591(cmVar);
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private synchronized Map<String, JSONObject> m568() {
        int i10 = f426 + 71;
        f425 = i10 % 128;
        if ((i10 % 2 != 0 ? 'Z' : ':') != ':') {
            throw null;
        }
        return this.f438;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private synchronized Map<String, String> m571() {
        Map<String, String> map;
        int i10 = f426 + 105;
        f425 = i10 % 128;
        if (i10 % 2 != 0) {
            map = this.f442;
            int i11 = 36 / 0;
        } else {
            map = this.f442;
        }
        return map;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private synchronized List<gl> m572() {
        List<gl> list;
        int i10 = f425 + 63;
        f426 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            list = this.f439;
            int i11 = 59 / 0;
        } else {
            list = this.f439;
        }
        return list;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private synchronized List<cm> m574() {
        List<cm> list;
        int i10 = f425 + 33;
        int i11 = i10 % 128;
        f426 = i11;
        int i12 = i10 % 2;
        list = this.f441;
        int i13 = i11 + 105;
        f425 = i13 % 128;
        int i14 = i13 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private List<cm> m576() {
        int i10 = f425 + 79;
        f426 = i10 % 128;
        int i11 = i10 % 2;
        if (this.f441 == null) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList(this.f441);
        int i12 = f425 + 103;
        f426 = i12 % 128;
        int i13 = i12 % 2;
        return arrayList;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ du m580(at atVar, du duVar) {
        int i10 = f425 + 115;
        int i11 = i10 % 128;
        f426 = i11;
        char c10 = i10 % 2 == 0 ? 'C' : 'K';
        atVar.f434 = duVar;
        if (c10 != 'K') {
            throw null;
        }
        int i12 = i11 + 23;
        f425 = i12 % 128;
        if ((i12 % 2 != 0 ? (char) 11 : 'T') != 11) {
            return duVar;
        }
        int i13 = 77 / 0;
        return duVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m594(at atVar, Context context, Map map, Runnable runnable) {
        int i10 = f425 + 3;
        f426 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '&' : '@';
        atVar.m616(context, (Map<String, List<gl>>) map, runnable);
        if (c10 == '&') {
            int i11 = 30 / 0;
        }
        int i12 = f426 + 69;
        f425 = i12 % 128;
        if ((i12 % 2 != 0 ? '^' : '$') != '$') {
            int i13 = 58 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ List m599(at atVar, List list) {
        int i10 = f426;
        int i11 = i10 + 67;
        f425 = i11 % 128;
        int i12 = i11 % 2;
        atVar.f441 = list;
        int i13 = i10 + 125;
        f425 = i13 % 128;
        int i14 = i13 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ void m611(at atVar, Context context, List list, List list2, ir irVar) {
        int i10 = f425 + 67;
        f426 = i10 % 128;
        int i11 = i10 % 2;
        atVar.m593(context, (List<gl>) list, (List<String>) list2, irVar);
        int i12 = f425 + 65;
        f426 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m617(at atVar) {
        int i10 = f425 + 51;
        f426 = i10 % 128;
        int i11 = i10 % 2;
        atVar.m566();
        int i12 = f425 + 35;
        f426 = i12 % 128;
        int i13 = i12 % 2;
    }

    public at(iz izVar, af afVar, String str, bb bbVar, ISAdQualityInitListener iSAdQualityInitListener) {
        this.f432 = izVar;
        az azVar = new az(t.m2990(), afVar);
        this.f431 = azVar;
        kd.m2873(azVar);
        this.f431.m760(new il() { // from class: com.ironsource.adqualitysdk.sdk.i.at.3

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static int f498 = 1;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f499 = 0;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static char f500 = 3;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char[] f501 = {'t', 'p', '_', 'e', 'r', 'o', 'u', 'v', 'w'};

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m635(String str2, int i10, byte b10) {
                String str3;
                Object charArray = str2;
                if (str2 != null) {
                    charArray = str2.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (g.f2129) {
                    char[] cArr2 = f501;
                    char c10 = f500;
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
                    str3 = new String(cArr3);
                }
                return str3;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.il
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final JSONObject mo636(String str2, JSONObject jSONObject) {
                int i10 = f498 + 23;
                f499 = i10 % 128;
                int i11 = i10 % 2;
                if (!(str2.equals(m635("\u0001\u0002\u0000\u0005\u009b\u009b\u0003\u0005", 8 - Color.green(0), (byte) (40 - ImageFormat.getBitsPerPixel(0))).intern()))) {
                    return null;
                }
                int i12 = f499 + 121;
                f498 = i12 % 128;
                boolean z10 = i12 % 2 != 0;
                at atVar = at.this;
                if (z10) {
                    return atVar.m625();
                }
                atVar.m625();
                throw null;
            }
        });
        this.f437 = str;
        this.f436 = bbVar;
        this.f430 = iSAdQualityInitListener;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ List m582(at atVar) {
        int i10 = f425 + 23;
        f426 = i10 % 128;
        int i11 = i10 % 2;
        List<cm> listM574 = atVar.m574();
        int i12 = f425 + 29;
        f426 = i12 % 128;
        if (i12 % 2 != 0) {
            return listM574;
        }
        int i13 = 34 / 0;
        return listM574;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ boolean m596(at atVar, String str) {
        int i10 = f426 + 37;
        f425 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        boolean zM624 = atVar.m624(str);
        if (z10) {
            int i11 = 12 / 0;
        }
        int i12 = f425 + 95;
        f426 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return zM624;
        }
        int i13 = 44 / 0;
        return zM624;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ Map m600(at atVar, Map map) {
        int i10 = f425;
        int i11 = i10 + 97;
        f426 = i11 % 128;
        char c10 = i11 % 2 == 0 ? '@' : 'b';
        atVar.f433 = map;
        if (c10 != 'b') {
            int i12 = 21 / 0;
        }
        int i13 = i10 + 3;
        f426 = i13 % 128;
        if (!(i13 % 2 == 0)) {
            return map;
        }
        int i14 = 16 / 0;
        return map;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m618(at atVar, Context context) {
        int i10 = f426 + 115;
        f425 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        atVar.m602(context);
        if (z10) {
            throw null;
        }
        int i11 = f425 + 31;
        f426 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final JSONObject m631() {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        JSONObject jSONObjectJsonObjectInit2 = IronSourceVideoBridge.jsonObjectInit();
        try {
            Iterator it = new HashSet(m571().keySet()).iterator();
            while (true) {
                if (!(it.hasNext())) {
                    break;
                }
                int i10 = f426 + 105;
                f425 = i10 % 128;
                int i11 = i10 % 2;
                String str = (String) it.next();
                jSONObjectJsonObjectInit2.put(str, m571().get(str));
                int i12 = f426 + 73;
                f425 = i12 % 128;
                int i13 = i12 % 2;
            }
            jSONObjectJsonObjectInit.put(m581(new int[]{83, 4, 0, 0}, "\u0001\u0001\u0000\u0001", false).intern(), jSONObjectJsonObjectInit2);
        } catch (JSONException e10) {
            k.m2830(m581(new int[]{36, 16, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", true).intern(), m581(new int[]{87, 29, 0, 0}, "\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001", true).intern(), e10);
        }
        return jSONObjectJsonObjectInit;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ boolean m589(cm cmVar, String str) {
        int i10 = f426 + 107;
        f425 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        boolean zM607 = m607(cmVar, str);
        if (z10) {
            int i11 = 2 / 0;
        }
        return zM607;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m603(at atVar, Context context, String str, String str2, gl glVar, ir irVar) {
        int i10 = f425 + 83;
        f426 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        atVar.m610(context, str, str2, glVar, irVar);
        if (z10) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m619(at atVar, Context context, String str, String str2, gl glVar, cm cmVar, boolean z10, bd bdVar, ir irVar) {
        int i10 = f425 + 23;
        f426 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '(' : (char) 0;
        atVar.m592(context, str, str2, glVar, cmVar, z10, bdVar, irVar);
        if (c10 == '(') {
            throw null;
        }
        int i11 = f426 + 11;
        f425 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m628(final Context context, final Runnable runnable) {
        int i10 = f426 + 15;
        f425 = i10 % 128;
        int i11 = i10 % 2;
        if (!this.f440) {
            String strIntern = m612("휩\ue20e읜耄ᚎ摛뭇ꀯ蹲⼓玆蓑", 12 - (ViewConfiguration.getEdgeSlop() >> 16)).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m581(new int[]{0, 36, 149, 0}, "\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001", false).intern());
            sb2.append(IronSourceAdQuality.getSDKVersion());
            sb2.append(m612("钂빴鶊浗鶊浗鶊浗鶊浗鶊浗鶊浗銠㱊", 15 - KeyEvent.keyCodeFromString("")).intern());
            k.m2821(strIntern, sb2.toString());
            ir irVar = new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.7
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() {
                    t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.7.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            runnable.run();
                        }
                    });
                    at.m618(at.this, context);
                }
            };
            if (!(m565())) {
                m586(context, irVar);
            } else {
                int i12 = f426 + 65;
                f425 = i12 % 128;
                if ((i12 % 2 != 0 ? ' ' : 'Z') != 'Z') {
                    m614(context, irVar);
                    int i13 = 52 / 0;
                } else {
                    m614(context, irVar);
                }
            }
            this.f440 = true;
            return;
        }
        t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.11
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                runnable.run();
            }
        });
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m604(at atVar, Context context, String str, String str2, List list, ir irVar) {
        int i10 = f426 + 5;
        f425 = i10 % 128;
        int i11 = i10 % 2;
        atVar.m587(context, str, str2, list, irVar);
        int i12 = f425 + 39;
        f426 = i12 % 128;
        if ((i12 % 2 == 0 ? 'V' : '\n') != 'V') {
            return;
        }
        int i13 = 27 / 0;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m620(at atVar, Context context, String str, String str2, List list, ir irVar) {
        int i10 = f426 + 17;
        f425 = i10 % 128;
        int i11 = i10 % 2;
        atVar.m615(context, str, str2, list, irVar);
        int i12 = f426 + 77;
        f425 = i12 % 128;
        if (i12 % 2 == 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final JSONObject m625() {
        int i10 = f426 + 109;
        f425 = i10 % 128;
        int i11 = i10 % 2;
        try {
            JSONObject jSONObjectM584 = m584(m568());
            int i12 = f425 + 53;
            f426 = i12 % 128;
            int i13 = i12 % 2;
            return jSONObjectM584;
        } catch (JSONException e10) {
            k.m2830(m581(new int[]{36, 16, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", true).intern(), m581(new int[]{52, 31, 73, 2}, (String) null, true).intern(), e10);
            return IronSourceVideoBridge.jsonObjectInit();
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m605(at atVar, String str, JSONObject jSONObject) {
        int i10 = f425 + 65;
        f426 = i10 % 128;
        int i11 = i10 % 2;
        atVar.m595(str, jSONObject);
        int i12 = f426 + 89;
        f425 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m621(at atVar, cm cmVar, String str) {
        int i10 = f426 + 63;
        f425 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        atVar.m622(cmVar, str);
        if (z10) {
            return;
        }
        int i11 = 64 / 0;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ boolean m623(cm cmVar) {
        int i10 = f426 + 101;
        f425 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM606 = m606(cmVar);
        int i12 = f426 + 53;
        f425 = i12 % 128;
        if ((i12 % 2 != 0 ? ':' : '&') != ':') {
            return zM606;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m630(ISAdQualityAdListener iSAdQualityAdListener) {
        int i10 = f425 + 109;
        f426 = i10 % 128;
        int i11 = i10 % 2;
        this.f431.m763(iSAdQualityAdListener);
        int i12 = f426 + 97;
        f425 = i12 % 128;
        if ((i12 % 2 != 0 ? '!' : '9') != '9') {
            int i13 = 64 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m602(final Context context) {
        int i10 = f425 + 75;
        f426 = i10 % 128;
        int i11 = i10 % 2;
        if (!m567()) {
            t.m2996(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.18
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() {
                    t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.18.5
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            at.m617(at.this);
                        }
                    });
                }
            }, ar.m483().mo490());
        }
        final Map<String, List<gl>> mapM795 = bc.m795();
        t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.19
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                at.m600(at.this, ar.m483().mo505());
                at.m594(at.this, context, mapM795, new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.19.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        if (at.m577(at.this)) {
                            at.m617(at.this);
                        }
                    }
                });
                ar.m483().mo507(new av() { // from class: com.ironsource.adqualitysdk.sdk.i.at.19.4

                    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                    private static int f480 = 0;

                    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                    private static int f481 = 1;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static int f482 = 18;

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static boolean f483 = true;

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static char[] f484 = {'U', 129, 128, 'w', 'u', 134, 132, '_', 's', 'y', 'V', '{', 133, 't', '~', '2', 140, 'v'};

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static boolean f485 = true;

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static String m634(String str, int i12, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                            char[] cArr2 = f484;
                            int i13 = f482;
                            if (f483) {
                                int length = bArr.length;
                                m.f2990 = length;
                                char[] cArr3 = new char[length];
                                m.f2989 = 0;
                                while (m.f2989 < m.f2990) {
                                    int i14 = m.f2989;
                                    int i15 = m.f2990 - 1;
                                    int i16 = m.f2989;
                                    cArr3[i14] = (char) (cArr2[bArr[i15 - i16] + i12] - i13);
                                    m.f2989 = i16 + 1;
                                }
                                return new String(cArr3);
                            }
                            if (f485) {
                                int length2 = cArr.length;
                                m.f2990 = length2;
                                char[] cArr4 = new char[length2];
                                m.f2989 = 0;
                                while (m.f2989 < m.f2990) {
                                    int i17 = m.f2989;
                                    int i18 = m.f2990 - 1;
                                    int i19 = m.f2989;
                                    cArr4[i17] = (char) (cArr2[cArr[i18 - i19] - i12] - i13);
                                    m.f2989 = i19 + 1;
                                }
                                return new String(cArr4);
                            }
                            int length3 = iArr.length;
                            m.f2990 = length3;
                            char[] cArr5 = new char[length3];
                            m.f2989 = 0;
                            while (m.f2989 < m.f2990) {
                                int i20 = m.f2989;
                                int i21 = m.f2990 - 1;
                                int i22 = m.f2989;
                                cArr5[i20] = (char) (cArr2[iArr[i21 - i22] - i12] - i13);
                                m.f2989 = i22 + 1;
                            }
                            return new String(cArr5);
                        }
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.av
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo317() {
                        int i12 = f480 + 67;
                        f481 = i12 % 128;
                        int i13 = i12 % 2;
                        at.m600(at.this, ar.m483().mo505());
                        k.m2825(m634(null, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 126, null, "\u0087\u0084\u008a\u0089\u0083\u0089\u0088\u0087\u0082\u0086\u0085\u0084\u0083\u0083\u0082\u0081").intern(), m634(null, TextUtils.getOffsetAfter("", 0) + 127, null, "\u008d\u0087\u0082\u0086\u0085\u0084\u0083\u0083\u0082\u0085\u0090\u0092\u0084\u0091\u008c\u008f\u0089\u008c\u0086\u008c\u0083\u008c\u0090\u008a\u0083\u008c\u008f\u008e\u0089\u008d\u008c\u008b").intern());
                        at.m573(at.this);
                        int i14 = f481 + 51;
                        f480 = i14 % 128;
                        if ((i14 % 2 != 0 ? 'D' : 'B') == 'B') {
                        } else {
                            throw null;
                        }
                    }
                });
            }
        });
        int i12 = f425 + 71;
        f426 = i12 % 128;
        if ((i12 % 2 == 0 ? 'O' : (char) 4) != 'O') {
            return;
        }
        int i13 = 95 / 0;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m632() {
        t.m2995(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.12
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                Iterator it = at.m598(at.this).iterator();
                while (it.hasNext()) {
                    ((cm) it.next()).m1607();
                }
                at.m582(at.this).clear();
                at.m599(at.this, (List) null);
            }
        });
        t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.bb.1
            public AnonymousClass1() {
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                bb.this.f745.clear();
                bb.this.f745 = null;
            }
        });
        this.f436 = null;
        t.m2995(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.15
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() throws Exception {
                at.m580(at.this, (du) null);
            }
        });
        int i10 = f425 + 1;
        f426 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m586(Context context, ir irVar) {
        int i10 = f426 + 15;
        f425 = i10 % 128;
        int i11 = i10 % 2;
        m585(context, bc.m799(), bc.m801(), irVar);
        int i12 = f425 + 89;
        f426 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 19 : 'N') != 19) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m610(final Context context, final String str, final String str2, final gl glVar, final ir irVar) {
        int i10 = f426 + 57;
        f425 = i10 % 128;
        int i11 = i10 % 2;
        jc.e eVarM2222 = glVar.m2222();
        if (eVarM2222 == null) {
            t.m2995(irVar);
            return;
        }
        final bd bdVarMo2198 = glVar.mo2198();
        m588(str2, bdVarMo2198);
        t.m3000(this.f436.new AnonymousClass5(str2, ba.b.f730));
        final String strM2572 = this.f432.m2572(eVarM2222, new ip() { // from class: com.ironsource.adqualitysdk.sdk.i.at.6
            @Override // com.ironsource.adqualitysdk.sdk.i.ip
            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            public final void mo642(String str3) {
                at.m619(at.this, context, str, str2, glVar, at.m579(at.this, context, str3, bdVarMo2198), false, bdVarMo2198, irVar);
            }
        });
        t.m2996(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.10
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                cm cmVarM579 = at.m579(at.this, context, strM2572, bdVarMo2198);
                if (cmVarM579 != null) {
                    at.m619(at.this, context, str, str2, glVar, cmVarM579, true, bdVarMo2198, irVar);
                } else {
                    t.m2995(irVar);
                }
            }
        }, m608(eVarM2222));
        int i12 = f425 + 1;
        f426 = i12 % 128;
        if (i12 % 2 != 0) {
            return;
        }
        int i13 = 13 / 0;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m614(Context context, ir irVar) {
        m593(context, new ArrayList(bc.m797()), new ArrayList(bc.m800()), irVar);
        int i10 = f425 + 25;
        f426 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m585(final Context context, final gl glVar, final String str, final ir irVar) {
        t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.13
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                final String lowerCase = str.toLowerCase();
                at.m609(at.this).m792(lowerCase);
                t.m2995(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.13.4

                    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                    private static int f460 = 0;

                    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                    private static boolean f461 = true;

                    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                    private static int f462 = 1;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static boolean f463 = true;

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static char[] f464 = {127, 171, 170, 161, 159, 176, 174, 137, 157, 163, 133, 165, 168, 182, '\\', 129};

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static int f465 = 60;

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static String m633(String str2, int i10, int[] iArr, String str3) throws UnsupportedEncodingException {
                        Object bytes = str3;
                        if (str3 != null) {
                            bytes = str3.getBytes("ISO-8859-1");
                        }
                        byte[] bArr = (byte[]) bytes;
                        Object charArray = str2;
                        if (str2 != null) {
                            charArray = str2.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (m.f2988) {
                            char[] cArr2 = f464;
                            int i11 = f465;
                            if (f461) {
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
                            if (f463) {
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

                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        String strIntern = m633(null, TextUtils.getTrimmedLength("") + 127, null, "\u0087\u0084\u008a\u0089\u0083\u0089\u0088\u0087\u0082\u0086\u0085\u0084\u0083\u0083\u0082\u0081").intern();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m633(null, 127 - TextUtils.indexOf("", ""), null, "\u008f\u0087\u0082\u0086\u0085\u0084\u0083\u0083\u0082\u0085\u008f\u008a\u0083\u008c\u008e\u008c\u008d\u0089\u008c\u0086\u008c\u0083\u008b").intern());
                        sb2.append(lowerCase);
                        k.m2825(strIntern, sb2.toString());
                        try {
                            AnonymousClass13 anonymousClass13 = AnonymousClass13.this;
                            at.m603(at.this, context, str, lowerCase, glVar, irVar);
                            int i10 = f462 + 73;
                            f460 = i10 % 128;
                            if (!(i10 % 2 != 0)) {
                                return;
                            }
                            int i11 = 94 / 0;
                        } catch (Throwable th2) {
                            t.m3000(at.m609(at.this).new AnonymousClass4(lowerCase, ba.c.f743));
                            at.m590(at.this).put(str, kd.m2881(th2).toString());
                            String strIntern2 = m633(null, 127 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), null, "\u0087\u0084\u008a\u0089\u0083\u0089\u0088\u0087\u0082\u0086\u0085\u0084\u0083\u0083\u0082\u0081").intern();
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(m633(null, 127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), null, "\u008f\u0087\u0082\u0086\u0085\u0084\u0083\u0083\u0082\u0085\u008f\u008a\u0083\u008c\u0086\u0089\u0084\u0087\u0085\u008f\u0087\u0082\u0087\u0087\u0090").intern());
                            sb3.append(lowerCase);
                            kd.m2880(strIntern2, sb3.toString(), th2, true, true, true);
                        }
                    }
                });
            }
        });
        int i10 = f425 + 51;
        f426 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return;
        }
        int i11 = 2 / 0;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m587(Context context, String str, String str2, List<gl> list, ir irVar) {
        int i10 = f426 + 45;
        f425 = i10 % 128;
        if (i10 % 2 == 0) {
            Iterator<gl> it = list.iterator();
            while (true) {
                if ((it.hasNext() ? '-' : '!') != '-') {
                    break;
                }
                int i11 = f425 + 101;
                f426 = i11 % 128;
                if (i11 % 2 == 0) {
                    m610(context, str, str2, it.next(), irVar);
                    int i12 = 79 / 0;
                } else {
                    m610(context, str, str2, it.next(), irVar);
                }
            }
            int i13 = f425 + 71;
            f426 = i13 % 128;
            if (!(i13 % 2 == 0)) {
                return;
            } else {
                throw null;
            }
        }
        list.iterator();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0041, code lost:
    
        if ((r5.get(1) != null ? ')' : '\b') != ')') goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0048, code lost:
    
        if (r5.get(0) != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        return r5.get(0).mo2201();
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String m597(java.util.List<com.ironsource.adqualitysdk.sdk.i.gl> r5) {
        /*
            int r0 = com.ironsource.adqualitysdk.sdk.i.at.f425
            int r0 = r0 + 63
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.at.f426 = r1
            int r0 = r0 % 2
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L10
            r0 = r1
            goto L11
        L10:
            r0 = r2
        L11:
            r3 = 0
            if (r0 == r1) goto L56
            if (r5 == 0) goto L55
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L1e
            r0 = r1
            goto L1f
        L1e:
            r0 = r2
        L1f:
            if (r0 == 0) goto L55
            int r0 = com.ironsource.adqualitysdk.sdk.i.at.f426
            int r0 = r0 + 49
            int r4 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.at.f425 = r4
            int r0 = r0 % 2
            r4 = 69
            if (r0 == 0) goto L32
            r0 = 92
            goto L33
        L32:
            r0 = r4
        L33:
            if (r0 == r4) goto L44
            java.lang.Object r0 = r5.get(r1)
            r1 = 41
            if (r0 == 0) goto L3f
            r0 = r1
            goto L41
        L3f:
            r0 = 8
        L41:
            if (r0 == r1) goto L4a
            goto L55
        L44:
            java.lang.Object r0 = r5.get(r2)
            if (r0 == 0) goto L55
        L4a:
            java.lang.Object r5 = r5.get(r2)
            com.ironsource.adqualitysdk.sdk.i.gl r5 = (com.ironsource.adqualitysdk.sdk.i.gl) r5
            java.lang.String r5 = r5.mo2201()
            return r5
        L55:
            return r3
        L56:
            throw r3     // Catch: java.lang.Throwable -> L57
        L57:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.at.m597(java.util.List):java.lang.String");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m593(final Context context, final List<gl> list, final List<String> list2, final ir irVar) {
        int i10 = f426 + 91;
        f425 = i10 % 128;
        if (i10 % 2 != 0) {
            list.isEmpty();
            throw null;
        }
        if (list.isEmpty()) {
            int i11 = f425 + 93;
            f426 = i11 % 128;
            int i12 = i11 % 2;
            return;
        }
        gl glVarRemove = list.remove(0);
        String strRemove = list2.remove(0);
        if (!list.isEmpty()) {
            irVar = new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.14
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() {
                    t.m2996(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.14.4
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            AnonymousClass14 anonymousClass14 = AnonymousClass14.this;
                            at.m611(at.this, context, list, list2, irVar);
                        }
                    }, ar.m483().mo486());
                }
            };
        }
        m585(context, glVarRemove, strRemove, irVar);
        int i13 = f425 + 51;
        f426 = i13 % 128;
        if (i13 % 2 != 0) {
            return;
        }
        int i14 = 77 / 0;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0045 A[PHI: r1 r2 r3
  0x0045: PHI (r1v19 java.lang.String) = (r1v14 java.lang.String), (r1v26 java.lang.String) binds: [B:24:0x0066, B:19:0x0043] A[DONT_GENERATE, DONT_INLINE]
  0x0045: PHI (r2v6 java.util.List<com.ironsource.adqualitysdk.sdk.i.gl>) = 
  (r2v4 java.util.List<com.ironsource.adqualitysdk.sdk.i.gl>)
  (r2v9 java.util.List<com.ironsource.adqualitysdk.sdk.i.gl>)
 binds: [B:24:0x0066, B:19:0x0043] A[DONT_GENERATE, DONT_INLINE]
  0x0045: PHI (r3v1 java.lang.String) = (r3v0 java.lang.String), (r3v2 java.lang.String) binds: [B:24:0x0066, B:19:0x0043] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0049  */
    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:42:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x0087 A[SYNTHETIC] */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m616(Context context, Map<String, List<gl>> map, final Runnable runnable) {
        String next;
        List<gl> listRemove;
        String strM597;
        while (true) {
            if (!(map == null)) {
                if ((map.size() > 0 ? (char) 7 : (char) 28) == 28) {
                    break;
                }
                int i10 = f425 + 109;
                f426 = i10 % 128;
                if ((i10 % 2 == 0 ? 'T' : '%') != 'T') {
                    next = map.keySet().iterator().next();
                    listRemove = map.remove(next);
                    strM597 = m597(listRemove);
                    if (strM597 != null) {
                        String str = next;
                        List<gl> list = listRemove;
                        this.f436.m792(strM597);
                        t.m2993(new AnonymousClass2(strM597, context, str, list, map, runnable));
                        if (m567()) {
                            return;
                        }
                    }
                } else {
                    next = map.keySet().iterator().next();
                    listRemove = map.remove(next);
                    strM597 = m597(listRemove);
                    int i11 = 58 / 0;
                    if (strM597 != null) {
                        String str2 = next;
                        List<gl> list2 = listRemove;
                        this.f436.m792(strM597);
                        t.m2993(new AnonymousClass2(strM597, context, str2, list2, map, runnable));
                        if (m567()) {
                            return;
                        }
                    }
                }
                int i12 = f426 + 65;
                f425 = i12 % 128;
                int i13 = i12 % 2;
            } else {
                break;
            }
        }
        t.m2995(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.1
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                t.m2993(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.1.3
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        runnable.run();
                    }
                });
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0055, code lost:
    
        if ((com.ironsource.adqualitysdk.sdk.i.kc.m2859(r5, r4.m1605()) <= 0 ? '%' : '\t') != '\t') goto L19;
     */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean m607(com.ironsource.adqualitysdk.sdk.i.cm r4, java.lang.String r5) {
        /*
            r0 = 4
            int[] r0 = new int[r0]
            r0 = {x0072: FILL_ARRAY_DATA , data: [119, 7, 0, 0} // fill-array
            java.lang.String r1 = "\u0000\u0001\u0001\u0000\u0001\u0001\u0001"
            r2 = 1
            java.lang.String r0 = m581(r0, r1, r2)
            java.lang.String r0 = r0.intern()
            boolean r0 = r0.equals(r5)
            r1 = 0
            if (r0 != 0) goto L59
            int r0 = com.ironsource.adqualitysdk.sdk.i.at.f425
            int r0 = r0 + 85
            int r3 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.at.f426 = r3
            int r0 = r0 % 2
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L58
            java.lang.String r0 = r4.m1604()
            int r0 = com.ironsource.adqualitysdk.sdk.i.kc.m2859(r5, r0)
            r3 = 77
            if (r0 < 0) goto L36
            r0 = r3
            goto L38
        L36:
            r0 = 20
        L38:
            if (r0 == r3) goto L3b
            goto L58
        L3b:
            int r0 = com.ironsource.adqualitysdk.sdk.i.at.f426
            int r0 = r0 + 71
            int r3 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.at.f425 = r3
            int r0 = r0 % 2
            java.lang.String r4 = r4.m1605()
            int r4 = com.ironsource.adqualitysdk.sdk.i.kc.m2859(r5, r4)
            r5 = 9
            if (r4 > 0) goto L54
            r4 = 37
            goto L55
        L54:
            r4 = r5
        L55:
            if (r4 == r5) goto L58
            goto L59
        L58:
            return r1
        L59:
            int r4 = com.ironsource.adqualitysdk.sdk.i.at.f425
            int r4 = r4 + 71
            int r5 = r4 % 128
            com.ironsource.adqualitysdk.sdk.i.at.f426 = r5
            int r4 = r4 % 2
            if (r4 != 0) goto L67
            r4 = r2
            goto L68
        L67:
            r4 = r1
        L68:
            if (r4 == 0) goto L70
            r4 = 13
            int r4 = r4 / r1
            return r2
        L6e:
            r4 = move-exception
            throw r4
        L70:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.at.m607(com.ironsource.adqualitysdk.sdk.i.cm, java.lang.String):boolean");
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private cm m578(Context context, String str, bd bdVar) {
        int i10 = f426 + 119;
        f425 = i10 % 128;
        int i11 = i10 % 2;
        if (str == null) {
            return null;
        }
        cm cmVar = new cm(context, new dh(str, this.f434), this.f431, this.f435, bdVar);
        int i12 = f425 + 41;
        f426 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 11 : (char) 18) == 18) {
            return cmVar;
        }
        int i13 = 40 / 0;
        return cmVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m595(String str, JSONObject jSONObject) {
        t.m3000(this.f436.new AnonymousClass5(str, ba.b.f731));
        if ((jSONObject != null ? '\\' : (char) 23) == '\\') {
            int i10 = f426 + 121;
            f425 = i10 % 128;
            int i11 = i10 % 2;
            try {
                jSONObject.put(m581(new int[]{116, 3, 0, 3}, "\u0000\u0001\u0000", false).intern(), true);
                return;
            } catch (JSONException unused) {
            }
        }
        int i12 = f426 + 123;
        f425 = i12 % 128;
        if ((i12 % 2 != 0 ? 'G' : 'b') == 'b') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private long m608(jc.e eVar) {
        if (ar.m483().mo510()) {
            return 2000L;
        }
        if (eVar != null) {
            if (!(this.f432.m2571(eVar))) {
                int i10 = f426 + 111;
                f425 = i10 % 128;
                int i11 = i10 % 2;
                return 2000L;
            }
        }
        int i12 = f425 + 53;
        f426 = i12 % 128;
        if (i12 % 2 != 0) {
            return 0L;
        }
        int i13 = 91 / 0;
        return 0L;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static boolean m606(cm cmVar) {
        int i10 = f426 + 31;
        f425 = i10 % 128;
        if ((i10 % 2 != 0 ? '\"' : '\b') != '\"') {
            String strM1606 = cmVar.m1606();
            if (strM1606 == null || kc.m2859(IronSourceAdQuality.getSDKVersion(), strM1606) >= 0) {
                int i11 = f425 + 69;
                f426 = i11 % 128;
                int i12 = i11 % 2;
                return true;
            }
            int i13 = f426 + 19;
            f425 = i13 % 128;
            if (i13 % 2 == 0) {
                return false;
            }
            int i14 = 54 / 0;
            return false;
        }
        cmVar.m1606();
        throw null;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m588(String str, bd bdVar) {
        if (bdVar != null) {
            int i10 = f425 + 57;
            f426 = i10 % 128;
            int i11 = i10 % 2;
            m568().put(str, m583(bdVar.m817()));
            int i12 = f425 + 125;
            f426 = i12 % 128;
            int i13 = i12 % 2;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m592(final Context context, final String str, final String str2, final gl glVar, final cm cmVar, final boolean z10, final bd bdVar, final ir irVar) {
        t.m2995(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.9

            /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
            private static int f545 = 1;

            /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
            private static int f547;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static char[] f548 = {'C', 59730, 53780, 48089, 42129, 36434, 30490, 24772, 18842, 13160, 7171, 1521, 61117, 55422, 49459, 43745, 'I', 59731, 53779, 48067, 42141, 36432, 30466, 24770, 18834, 13132, 7180, 1528, 61180, ' ', 59727, 53791, 48090, 42139, 36421, 30475, 24715, 18827, 13130, 7180, 1521, 61113, 55418, 49442, 43772, 37794, 32045, 23773, 46507, 36590, 59169, 63593, 53921, 11263, 15479, '(', 59739, 53791, 48067, 42135, 36441, 30475, 24783, 18881};

            /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
            private static long f546 = 5621330307211979069L;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static String m643(int i10, char c10, int i11) {
                String str3;
                synchronized (d.f1653) {
                    char[] cArr = new char[i11];
                    d.f1652 = 0;
                    while (true) {
                        int i12 = d.f1652;
                        if (i12 < i11) {
                            cArr[i12] = (char) ((((long) f548[i10 + i12]) ^ (((long) i12) * f546)) ^ ((long) c10));
                            d.f1652 = i12 + 1;
                        } else {
                            str3 = new String(cArr);
                        }
                    }
                }
                return str3;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                int tapTimeout;
                char mode;
                int iIndexOf;
                if (cmVar != null) {
                    int i10 = f547 + 83;
                    f545 = i10 % 128;
                    if (i10 % 2 == 0) {
                        at.m575(at.this).contains(glVar);
                        throw null;
                    }
                    if (!at.m575(at.this).contains(glVar)) {
                        t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.bb.3

                            /* JADX INFO: renamed from: ﻐ */
                            private /* synthetic */ cm f747;

                            /* JADX INFO: renamed from: ﻛ */
                            private /* synthetic */ String f748;

                            /* JADX INFO: renamed from: ｋ */
                            private /* synthetic */ boolean f749;

                            public AnonymousClass3() {
                                str = str;
                                cmVar = cmVar;
                                z = z;
                            }

                            @Override // com.ironsource.adqualitysdk.sdk.i.ir
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo276() {
                                ba baVarM788 = bb.m788(bb.this, str);
                                if (baVarM788 != null) {
                                    baVarM788.m782(cmVar);
                                }
                            }
                        });
                        if (!cmVar.m1598()) {
                            int i11 = f547 + 111;
                            f545 = i11 % 128;
                            int i12 = i11 % 2;
                            ir irVar2 = irVar;
                            if (irVar2 != null) {
                                t.m2995(irVar2);
                            }
                        }
                        if (at.m623(cmVar)) {
                            String strIntern = m643((-1) - ImageFormat.getBitsPerPixel(0), (char) (ViewConfiguration.getScrollBarSize() >> 8), 16 - Color.argb(0, 0, 0, 0)).intern();
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(m643((KeyEvent.getMaxKeyCode() >> 16) + 16, (char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getLongPressTimeout() >> 16) + 13).intern());
                            sb2.append(str);
                            sb2.append(m643(Color.alpha(0) + 29, (char) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 17 - TextUtils.indexOf((CharSequence) "", '0')).intern());
                            if (z10) {
                                int i13 = f547 + 75;
                                f545 = i13 % 128;
                                int i14 = i13 % 2;
                                tapTimeout = 47 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                                mode = (char) (Color.rgb(0, 0, 0) + 16801013);
                                iIndexOf = 8 - View.combineMeasuredStates(0, 0);
                            } else {
                                tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 55;
                                mode = (char) View.MeasureSpec.getMode(0);
                                iIndexOf = TextUtils.indexOf("", "", 0, 0) + 9;
                            }
                            sb2.append(m643(tapTimeout, mode, iIndexOf).intern());
                            co.m1626(strIntern, sb2.toString());
                            bdVar.m815();
                            if (cmVar.m1598()) {
                                int i15 = f547 + 113;
                                f545 = i15 % 128;
                                if (i15 % 2 == 0) {
                                    throw null;
                                }
                                ir irVar3 = irVar;
                                if ((irVar3 != null ? (char) 15 : '>') != '>') {
                                    t.m2995(irVar3);
                                }
                            }
                            if ((!s.m2951().m2978() ? 'A' : ';') == 'A') {
                                at.m621(at.this, cmVar, str);
                                if (!at.m596(at.this, cmVar.m1612())) {
                                    at.m575(at.this).add(glVar);
                                    return;
                                }
                            }
                        } else {
                            t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.9.1

                                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                                private static int f558 = 136;

                                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                                private static int f559 = 0;

                                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                                private static int f560 = 1;

                                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                                private static String m644(String str3, int i16, boolean z11, int i17, int i18) {
                                    String str4;
                                    Object charArray = str3;
                                    if (str3 != null) {
                                        charArray = str3.toCharArray();
                                    }
                                    char[] cArr = (char[]) charArray;
                                    synchronized (b.f706) {
                                        char[] cArr2 = new char[i16];
                                        b.f704 = 0;
                                        while (true) {
                                            int i19 = b.f704;
                                            if (i19 >= i16) {
                                                break;
                                            }
                                            b.f705 = cArr[i19];
                                            cArr2[b.f704] = (char) (b.f705 + i18);
                                            int i20 = b.f704;
                                            cArr2[i20] = (char) (cArr2[i20] - f558);
                                            b.f704 = i20 + 1;
                                        }
                                        if (i17 > 0) {
                                            b.f707 = i17;
                                            char[] cArr3 = new char[i16];
                                            System.arraycopy(cArr2, 0, cArr3, 0, i16);
                                            int i21 = b.f707;
                                            System.arraycopy(cArr3, 0, cArr2, i16 - i21, i21);
                                            int i22 = b.f707;
                                            System.arraycopy(cArr3, i22, cArr2, 0, i16 - i22);
                                        }
                                        if (z11) {
                                            char[] cArr4 = new char[i16];
                                            b.f704 = 0;
                                            while (true) {
                                                int i23 = b.f704;
                                                if (i23 >= i16) {
                                                    break;
                                                }
                                                cArr4[i23] = cArr2[(i16 - i23) - 1];
                                                b.f704 = i23 + 1;
                                            }
                                            cArr2 = cArr4;
                                        }
                                        str4 = new String(cArr2);
                                    }
                                    return str4;
                                }

                                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                                /* JADX INFO: renamed from: ﾒ */
                                public final void mo276() {
                                    int i16 = f560 + 95;
                                    f559 = i16 % 128;
                                    if (!(i16 % 2 == 0)) {
                                        int i17 = 68 / 0;
                                        if (at.m590(at.this).containsKey(cmVar.m1612())) {
                                            return;
                                        }
                                    } else if (at.m590(at.this).containsKey(cmVar.m1612())) {
                                        return;
                                    }
                                    t.m3000(at.m609(at.this).new AnonymousClass4(cmVar.m1612(), ba.c.f740));
                                    AnonymousClass9 anonymousClass9 = AnonymousClass9.this;
                                    JSONObject jSONObjectM613 = at.m613(at.this, cmVar);
                                    try {
                                        jSONObjectM613.put(m644("\u0005\ufff3\b", 3 - Color.alpha(0), false, 1 - (Process.myTid() >> 22), Process.getGidForName("") + 247).intern(), false);
                                        int i18 = f560 + 89;
                                        f559 = i18 % 128;
                                        int i19 = i18 % 2;
                                    } catch (JSONException unused) {
                                    }
                                    at.m569(at.this).put(cmVar.m1612(), jSONObjectM613);
                                    String strM790 = at.m609(at.this).m790(cmVar.m1612());
                                    at.m590(at.this).put(cmVar.m1612(), strM790);
                                    ISAdQualityInitListener iSAdQualityInitListenerM627 = at.this.m627();
                                    ISAdQualityInitError iSAdQualityInitError = ISAdQualityInitError.AD_NETWORK_SDK_REQUIRES_NEWER_AD_QUALITY_SDK;
                                    StringBuilder sb3 = new StringBuilder();
                                    sb3.append(cmVar.m1608());
                                    sb3.append(m644("\u001b\n\u0017\u0018\u000e\u0014\u0013ￅￅ\u0018\t\u0010ￅ", '=' - AndroidCharacter.getMirror('0'), false, 8 - (KeyEvent.getMaxKeyCode() >> 16), 227 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern());
                                    sb3.append(cmVar.m1603());
                                    sb3.append(m644("\u000e\r\u0002\uffc1\u0014\u0005\f\uffc1\u0017\u0006\u0013\u0014\n\u0010\u000f\uffc1\uffc1\u0013\u0006\u0012\u0016\n\u0013\u0006\u0014\uffc1\ufff4\u0010\u0010", (ViewConfiguration.getScrollBarSize() >> 8) + 29, false, Process.getGidForName("") + 17, 231 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
                                    sb3.append(cmVar.m1606());
                                    sb3.append(m644("\u0012\t\u001b\t\u0016ￄ\u0013\u0016ￄ", (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 9, false, 5 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 228).intern());
                                    iSAdQualityInitListenerM627.adQualitySdkInitFailed(iSAdQualityInitError, sb3.toString());
                                    kd.m2880(m644("\t\b\b\uffff�\u000e\t\f\uffe7\ufffb\b\ufffb\u0001\uffff\f\uffdd", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 15, false, 15 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 237 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern(), strM790, null, true, true, true);
                                    int i20 = f559 + 107;
                                    f560 = i20 % 128;
                                    int i21 = i20 % 2;
                                }
                            });
                        }
                    }
                }
                int i16 = f545 + 59;
                f547 = i16 % 128;
                int i17 = i16 % 2;
            }
        });
        int i10 = f426 + 25;
        f425 = i10 % 128;
        if (i10 % 2 == 0) {
        } else {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6, types: [org.json.JSONObject] */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static JSONObject m591(cm cmVar) {
        int i10 = f426 + 125;
        f425 = i10 % 128;
        ?? r10 = i10 % 2 != 0 ? 79 : 80;
        try {
            if (r10 != 80) {
                JSONObject jSONObjectM583 = m583(cmVar.m1603());
                jSONObjectM583.put(ih.f2497, cmVar.m1611());
                int i11 = 15 / 0;
                r10 = jSONObjectM583;
            } else {
                JSONObject jSONObjectM584 = m583(cmVar.m1603());
                jSONObjectM584.put(ih.f2497, cmVar.m1611());
                r10 = jSONObjectM584;
            }
        } catch (JSONException e10) {
            k.m2830(m581(new int[]{36, 16, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", true).intern(), m612("녌茽㐘횢陥ᢼ\ued1b⎧牗ŕ쥤羙侨ᖯ玑祼迧\udb11讶ꆼ↳\ue2eb\uf701\ud9a3㎤\uf5e6휸\udd82\uea01椳迧\udb11ᩳ\ue7d7知췾썹斮", AndroidCharacter.getMirror('0') - 11).intern(), e10);
        }
        int i12 = f425 + 35;
        f426 = i12 % 128;
        int i13 = i12 % 2;
        return r10;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m615(final Context context, final String str, final String str2, final List<gl> list, final ir irVar) {
        t.m2995(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.4

            /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
            private static int f503 = 1;

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static char f504 = 0;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f505 = -1106430066;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static long f506;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f507;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static String m637(String str3, char c10, String str4, int i10, String str5) {
                String str6;
                Object charArray = str5;
                if (str5 != null) {
                    charArray = str5.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                Object charArray2 = str4;
                if (str4 != null) {
                    charArray2 = str4.toCharArray();
                }
                char[] cArr2 = (char[]) charArray2;
                Object charArray3 = str3;
                if (str3 != null) {
                    charArray3 = str3.toCharArray();
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
                            cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f506) ^ ((long) f505)) ^ ((long) f504));
                            j.f2675 = i15 + 1;
                        } else {
                            str6 = new String(cArr6);
                        }
                    }
                }
                return str6;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                String strIntern = m637("闪䯵틕᱿囊䣥祑ᶛ뉞䶞㼣枹\udbcf뢪й毺", (char) (59326 - View.MeasureSpec.getSize(0)), "\u0000\u0000\u0000\u0000", Process.getGidForName("") + 1, "鐒ಗ빹훧").intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m637("灂\ued11紴㽌綃ᰶ觹\uf511㸯픢响샤㾼恉ᯢ闦뻯㚁\ue095⊂㴅굳\uee55", (char) TextUtils.indexOf("", "", 0), "\u0000\u0000\u0000\u0000", 16302 - AndroidCharacter.getMirror('0'), "纋먿䁩병").intern());
                sb2.append(str2);
                k.m2825(strIntern, sb2.toString());
                try {
                    at.m604(at.this, context, str, str2, list, irVar);
                    int i10 = f503 + 95;
                    f507 = i10 % 128;
                    if (!(i10 % 2 != 0)) {
                    } else {
                        throw null;
                    }
                } catch (Throwable th2) {
                    if (at.m609(at.this) != null) {
                        t.m3000(at.m609(at.this).new AnonymousClass4(str2, ba.c.f743));
                    }
                    at.m590(at.this).put(str, kd.m2881(th2).toString());
                    String strIntern2 = m637("闪䯵틕᱿囊䣥祑ᶛ뉞䶞㼣枹\udbcf뢪й毺", (char) (59326 - View.getDefaultSize(0, 0)), "\u0000\u0000\u0000\u0000", (-1) - TextUtils.lastIndexOf("", '0', 0, 0), "鐒ಗ빹훧").intern();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(m637("⤮䶢蠹蘸넾䴁溒曜⠷䋈멺㑹㚿葢냀딨ﶫ\ue72fꞑᇌ囷샲끌뙾祾", (char) (ViewConfiguration.getWindowTouchSlop() >> 8), "\u0000\u0000\u0000\u0000", Color.blue(0) + 878080180, "됓噰怴扔").intern());
                    sb3.append(str2);
                    kd.m2880(strIntern2, sb3.toString(), th2, true, true, true);
                    int i11 = f507 + 97;
                    f503 = i11 % 128;
                    if ((i11 % 2 != 0 ? '8' : (char) 2) != '8') {
                        int i12 = 5 / 0;
                    }
                }
            }
        });
        int i10 = f426 + 77;
        f425 = i10 % 128;
        if ((i10 % 2 != 0 ? '9' : (char) 23) != 23) {
            int i11 = 64 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static JSONObject m583(String str) {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put(ih.f2499, str);
        } catch (JSONException e10) {
            k.m2830(m581(new int[]{36, 16, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", true).intern(), m612("녌茽㐘횢陥ᢼ\ued1b⎧牗ŕ쥤羙侨ᖯ玑祼迧\udb11讶ꆼ↳\ue2eb\uf701\ud9a3㎤\uf5e6휸\udd82\uea01椳迧\udb11ᩳ\ue7d7知췾썹斮", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 36).intern(), e10);
        }
        int i10 = f426 + 47;
        f425 = i10 % 128;
        if (i10 % 2 != 0) {
            throw null;
        }
        return jSONObjectJsonObjectInit;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m622(final cm cmVar, final String str) {
        final String strM1612 = cmVar.m1612();
        t.m3000(this.f436.new AnonymousClass5(strM1612, ba.b.f729));
        t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.5

            /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
            private static int f514 = 1;

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static char f516 = 6;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f517;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static char[] f520 = {'e', 'x', 'D', 'I', 'S', 'A', 'B', 'L', 'E', 'C', 'o', 'n', 'c', 't', 'r', 'M', 'a', 'g', ' ', 'i', 's', 'd', 'b', 'l', 'w', 'f', 'm', 'h', 'v', 'K', 'y', 'u', 'p', 'j', 'k', 'q'};

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static long f515 = -4808731631170578171L;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static int f518 = 0;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static char f519 = 0;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m639(String str2, int i10, byte b10) {
                String str3;
                Object charArray = str2;
                if (str2 != null) {
                    charArray = str2.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (g.f2129) {
                    char[] cArr2 = f520;
                    char c10 = f516;
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
                    str3 = new String(cArr3);
                }
                return str3;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo640(Throwable th2) {
                t.m3000(at.m609(at.this).new AnonymousClass4(strM1612, ba.c.f737));
                String strIntern = m639("\n\u000bËË\u0006\u0012\u0010\u0007\u000f\u0010\u0011\n\u0011\f\u0002\f", TextUtils.lastIndexOf("", '0') + 17, (byte) (93 - (Process.myTid() >> 22))).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m638("蚤豸獒ꀜ犤킲睊숀\uf883\uf044渖鹸첹쿱䷥窨嵋鞅릎\ue4a8襣স\u2d68\uefee⒃‸슫뢅繋", (char) (KeyEvent.normalizeMetaState(0) + 25084), "餅⟤\uf40f뵃", (-540511747) - Process.getGidForName(""), "ﻛ족ﳟ깡").intern());
                sb2.append(strM1612);
                kd.m2880(strIntern, sb2.toString(), th2, true, true, true);
                int i10 = f514 + 1;
                f517 = i10 % 128;
                int i11 = i10 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() throws Exception {
                int i10;
                int i11 = f514 + 29;
                f517 = i11 % 128;
                int i12 = i11 % 2;
                JSONObject jSONObjectM613 = at.m613(at.this, cmVar);
                jSONObjectM613.put(m639("\u0001\u0002", (ViewConfiguration.getEdgeSlop() >> 16) + 2, (byte) (19 - TextUtils.lastIndexOf("", '0', 0))).intern(), true);
                at.m569(at.this).put(cmVar.m1612(), jSONObjectM613);
                String strM1603 = cmVar.m1603();
                if (m639("\u0003\u0004\u0005\u0000\u0007\b\u000e\b", (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7, (byte) (View.MeasureSpec.makeMeasureSpec(0, 0) + 90)).intern().equals(strM1603)) {
                    String strIntern = m639("\n\u000bËË\u0006\u0012\u0010\u0007\u000f\u0010\u0011\n\u0011\f\u0002\f", 16 - (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) (Color.argb(0, 0, 0, 0) + 93)).intern();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(cmVar.m1608());
                    sb2.append(m639("\u0018\u0012\u000b\u0006\u0006\u0005\r\u000e\b\u0010\u0013\u0014\u0015\u0013\u0016\u0014\u0016\u000e\u0017\u0012\u0003\u0012", 22 - (Process.myTid() >> 22), (byte) (79 - Gravity.getAbsoluteGravity(0, 0))).intern());
                    k.m2825(strIntern, sb2.toString());
                    t.m3000(at.m609(at.this).new AnonymousClass5(strM1612, ba.b.f731));
                } else if (at.m596(at.this, strM1612)) {
                    String strIntern2 = m639("\n\u000bËË\u0006\u0012\u0010\u0007\u000f\u0010\u0011\n\u0011\f\u0002\f", 17 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (byte) (92 - ((byte) KeyEvent.getModifierMetaStateMask()))).intern();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(cmVar.m1608());
                    sb3.append(m639("\u0018\u0012\u000b\u0006\u0006\u0005\r\u000e\b\u0010\u0018\u001e\u000e\u0016\u0013\u0016\u0014\u0015\u0016\u001c\u0012\u0005\u0016\u0013\u001a\r\b\u001c\u0013\f\u0018\u0003\u0013\u0015\u0002\f\u0018\u0004Î", (ViewConfiguration.getPressedStateDuration() >> 16) + 39, (byte) (91 - TextUtils.lastIndexOf("", '0'))).intern());
                    k.m2825(strIntern2, sb3.toString());
                    t.m3000(at.m609(at.this).new AnonymousClass5(strM1612, ba.b.f731));
                    jSONObjectM613.put(m638("埖픴䣐", (char) (42294 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), "餅⟤\uf40f뵃", (-1437013406) - (ViewConfiguration.getWindowTouchSlop() >> 8), "扛壪㚪ﮥ").intern(), true);
                } else {
                    if (at.m589(cmVar, strM1603)) {
                        t.m2995(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.5.2

                            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                            private static int f525 = 1;

                            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                            private static short[] f526 = null;

                            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                            private static int f527 = 0;

                            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                            private static byte[] f528 = {-86, -116, 127, -121, 114, -116, -107, 90, -126, 122, -112, 127, 118, -127, 126, -83, -67, -19, -7, 3, -17, 25, -22, -25, 25, -23, 23, 91, -75, 31, 18, -27, 29, ExifInterface.MARKER_APP1, 18, 28, 16, 18, -4, 16, 65, -68, 17, -23, 3, -20, -27, 18, -19, 30, 81, -98, 119, -121, 121, -58, -5, -8, 13, 78, -74, -5, 2, -14, 5, 9, -21, 82, -86, 7, -1, 21, -6, -13, 4, -5, 8, 71, -75, -1, 80, -88, 15, -1, 1, 77, -67, -3, 1, -15, 4, 11, -10, 87, -86, 7, -7, 4, 41, -83, -16, -80, 76, -90, 88, -76, 66, -79, -68, 66, -78, 76, 0, -25, 74, -76, 73, 100, -92, 64, -72, 82, -67, -76, 67, -68, 79, 0, -90, 97, -105, -68, 99, 109, -101, 109, -118, 66, -117, 69, -49, -71, 107, -99, 95, -53, 105, 103, -111, 103, -128, 72, -127, 79, -126, 102, 69, -43, -107, 105, -125, 125, -111, 103, -108, -103, 103, -105, 105, 37, -41, -107, 111, 109, -99, 59, -48, -109, -97, 108, -111, 126, 108, -104, 35, -62, 111, -111, 108, 97, 41, -34, 65, -91, -40, 103, -97, 117, -102, -109, 100, -101, 104, 39};

                            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                            private static int f529 = -2077917528;

                            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                            private static int f530 = -363816020;

                            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                            private static int f531 = 102;

                            @Override // com.ironsource.adqualitysdk.sdk.i.ir
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo276() {
                                cmVar.m1609();
                                t.m3000(at.m609(at.this).new AnonymousClass5(strM1612, ba.b.f728));
                                String strIntern3 = m641(Gravity.getAbsoluteGravity(0, 0) + 363816020, (short) KeyEvent.getDeadChar(0, 0), 2077917595 - ExpandableListView.getPackedPositionType(0L), (byte) ((-128) - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 103).intern();
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(cmVar.m1608());
                                sb4.append(m641(363816035 - ImageFormat.getBitsPerPixel(0), (short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 2077917560 - View.MeasureSpec.getSize(0), (byte) (Color.alpha(0) + 18), (ViewConfiguration.getScrollDefaultDelay() >> 16) - 103).intern());
                                k.m2825(strIntern3, sb4.toString());
                                int i13 = f525 + 123;
                                f527 = i13 % 128;
                                if (i13 % 2 != 0) {
                                    int i14 = 59 / 0;
                                }
                            }

                            @Override // com.ironsource.adqualitysdk.sdk.i.ir
                            /* JADX INFO: renamed from: ﻛ */
                            public final void mo640(Throwable th2) {
                                int i13 = f527 + 61;
                                f525 = i13 % 128;
                                int i14 = i13 % 2;
                                try {
                                    ((JSONObject) at.m569(at.this).get(cmVar.m1612())).put(m641(ExpandableListView.getPackedPositionType(0L) + 363816071, (short) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getTapTimeout() >> 16) + 2077917633, (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 124), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 103).intern(), false);
                                    int i15 = f525 + 43;
                                    f527 = i15 % 128;
                                    int i16 = i15 % 2;
                                } catch (JSONException e10) {
                                    k.m2830(m641(363816019 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (short) Color.argb(0, 0, 0, 0), 2077917595 - Color.red(0), (byte) ((ViewConfiguration.getDoubleTapTimeout() >> 16) - 127), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 103).intern(), m641(347038859 - Color.rgb(0, 0, 0), (short) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2077917597, (byte) (5 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), (-103) - Color.argb(0, 0, 0, 0)).intern(), e10);
                                }
                                t.m3000(at.m609(at.this).new AnonymousClass4(strM1612, ba.c.f741));
                                String strIntern3 = m641(363816019 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 2077917595, (byte) ((-127) - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (ViewConfiguration.getTapTimeout() >> 16) - 103).intern();
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append(m641(363816119 - TextUtils.getTrimmedLength(""), (short) (ViewCompat.MEASURED_STATE_MASK - Color.rgb(0, 0, 0)), 2077917598 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), (byte) (73 - ExpandableListView.getPackedPositionType(0L)), (ViewConfiguration.getLongPressTimeout() >> 16) - 103).intern());
                                sb4.append(cmVar.m1608());
                                sb4.append(m641(363816138 - ((Process.getThreadPriority(0) + 20) >> 6), (short) (Process.myTid() >> 22), 2061140344 - Color.rgb(0, 0, 0), (byte) (67 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (-103) - View.MeasureSpec.getMode(0)).intern());
                                kd.m2880(strIntern3, sb4.toString(), th2, true, true, true);
                                String strIntern4 = m641(Gravity.getAbsoluteGravity(0, 0) + 363816148, (short) (ViewConfiguration.getTapTimeout() >> 16), 2077917593 - View.resolveSize(0, 0), (byte) (TextUtils.getOffsetAfter("", 0) + 102), TextUtils.indexOf("", "", 0, 0) - 103).intern();
                                StringBuilder sb5 = new StringBuilder();
                                sb5.append(m641(363816160 - View.resolveSizeAndState(0, 0, 0), (short) (TextUtils.indexOf((CharSequence) "", '0') + 1), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2077917593, (byte) (108 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), (-103) - View.getDefaultSize(0, 0)).intern());
                                sb5.append(cmVar.m1608());
                                sb5.append(m641(Color.rgb(0, 0, 0) + 380593429, (short) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 2077917560 - TextUtils.getOffsetBefore("", 0), (byte) (100 - ((Process.getThreadPriority(0) + 20) >> 6)), TextUtils.indexOf((CharSequence) "", '0', 0) - 102).intern());
                                k.m2814(strIntern4, sb5.toString());
                            }

                            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                            private static String m641(int i13, short s10, int i14, byte b10, int i15) {
                                String string;
                                synchronized (o.f2993) {
                                    StringBuilder sb4 = new StringBuilder();
                                    int i16 = f531;
                                    int i17 = i15 + i16;
                                    boolean z10 = i17 == -1;
                                    if (z10) {
                                        byte[] bArr = f528;
                                        if (bArr != null) {
                                            i17 = (byte) (bArr[f530 + i13] + i16);
                                        } else {
                                            i17 = (short) (f526[f530 + i13] + i16);
                                        }
                                    }
                                    if (i17 > 0) {
                                        o.f2994 = ((i13 + i17) - 2) + f530 + (z10 ? 1 : 0);
                                        o.f2995 = b10;
                                        char c10 = (char) (i14 + f529);
                                        o.f2997 = c10;
                                        sb4.append(c10);
                                        o.f2996 = o.f2997;
                                        o.f2998 = 1;
                                        while (o.f2998 < i17) {
                                            byte[] bArr2 = f528;
                                            if (bArr2 != null) {
                                                int i18 = o.f2994;
                                                o.f2994 = i18 - 1;
                                                o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i18] + s10)) ^ o.f2995));
                                            } else {
                                                short[] sArr = f526;
                                                int i19 = o.f2994;
                                                o.f2994 = i19 - 1;
                                                o.f2997 = (char) (o.f2996 + (((short) (sArr[i19] + s10)) ^ o.f2995));
                                            }
                                            sb4.append(o.f2997);
                                            o.f2996 = o.f2997;
                                            o.f2998++;
                                        }
                                    }
                                    string = sb4.toString();
                                }
                                return string;
                            }
                        });
                        at.m582(at.this).add(cmVar);
                        i10 = f514 + 87;
                        f517 = i10 % 128;
                    } else {
                        jSONObjectM613.put(m638("ﬖ\uf343︾", (char) (19417 - Process.getGidForName("")), "餅⟤\uf40f뵃", 152449899 - TextUtils.getOffsetBefore("", 0), "殷ᘳ\uda09橋").intern(), false);
                        t.m3000(at.m609(at.this).new AnonymousClass4(strM1612, ba.c.f742));
                        String strIntern3 = m639("\n\u000bËË\u0006\u0012\u0010\u0007\u000f\u0010\u0011\n\u0011\f\u0002\f", (ViewConfiguration.getWindowTouchSlop() >> 8) + 16, (byte) (93 - TextUtils.getOffsetAfter("", 0))).intern();
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str);
                        sb4.append(m638("꺍봤\ue5db\ue9f9ԃ\ue601훎閼详篂\udfb4褮ꯚ䏣忯쵶庢ゃވ", (char) (61250 - MotionEvent.axisFromString("")), "餅⟤\uf40f뵃", 23545356 - Color.rgb(0, 0, 0), "\u0cd9杆䌂㣯").intern());
                        kd.m2880(strIntern3, sb4.toString(), null, true, true, true);
                        ISAdQualityInitListener iSAdQualityInitListenerM627 = at.this.m627();
                        ISAdQualityInitError iSAdQualityInitError = ISAdQualityInitError.AD_NETWORK_VERSION_NOT_SUPPORTED_YET;
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(cmVar.m1608());
                        sb5.append(m639("\u0016\u0000\u0005\u001a\u0016\u0018\u0002\f\u0015\u0014\u000b\u0006:", 14 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 26)).intern());
                        sb5.append(cmVar.m1603());
                        sb5.append(m639("\u0013\u0014\u0015\u0013\u0006\u000b\f\u0013\u0000\u0006\f\u0013\u0013 ÑÑ\b\u0010\f\u0001\u0016\u0013\u0012\"\u0013\f\u0018\u0003\u0018\u0012\u000b\u0006\u0006\u0005\r\u000e\b\u0010", 37 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (byte) ((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 97)).intern());
                        iSAdQualityInitListenerM627.adQualitySdkInitFailed(iSAdQualityInitError, sb5.toString());
                        i10 = f517 + 17;
                        f514 = i10 % 128;
                    }
                    int i13 = i10 % 2;
                }
                jSONObjectM613.remove(m639("\u0001\u0002", 2 - (ViewConfiguration.getPressedStateDuration() >> 16), (byte) (TextUtils.getOffsetBefore("", 0) + 20)).intern());
                int i14 = f517 + 103;
                f514 = i14 % 128;
                int i15 = i14 % 2;
            }

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m638(String str2, char c10, String str3, int i10, String str4) {
                String str5;
                Object charArray = str4;
                if (str4 != null) {
                    charArray = str4.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                Object charArray2 = str3;
                if (str3 != null) {
                    charArray2 = str3.toCharArray();
                }
                char[] cArr2 = (char[]) charArray2;
                Object charArray3 = str2;
                if (str2 != null) {
                    charArray3 = str2.toCharArray();
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
                            cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f515) ^ ((long) f518)) ^ ((long) f519));
                            j.f2675 = i15 + 1;
                        } else {
                            str5 = new String(cArr6);
                        }
                    }
                }
                return str5;
            }
        });
        int i10 = f425 + 21;
        f426 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m601() {
        ArrayList<cm> arrayList = new ArrayList();
        for (cm cmVar : m576()) {
            if (!(!m624(cmVar.m1612()))) {
                int i10 = f425 + 17;
                f426 = i10 % 128;
                char c10 = i10 % 2 == 0 ? 'J' : (char) 7;
                arrayList.add(cmVar);
                if (c10 != 7) {
                    int i11 = 39 / 0;
                } else {
                    continue;
                }
            }
        }
        for (final cm cmVar2 : arrayList) {
            String strIntern = m581(new int[]{36, 16, 0, 0}, "\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000", true).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m581(new int[]{126, 10, 44, 0}, "\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001", false).intern());
            sb2.append(cmVar2.m1608());
            sb2.append(m612("玑祼迧\udb11讶ꆼ↳\ue2eb\uf701\ud9a3", 10 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern());
            k.m2821(strIntern, sb2.toString());
            String strM1612 = cmVar2.m1612();
            m595(strM1612, m568().get(strM1612));
            t.m2995(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.at.8
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() {
                    cmVar2.m1607();
                }
            });
            m574().remove(cmVar2);
        }
        int i12 = f425 + 111;
        f426 = i12 % 128;
        if ((i12 % 2 == 0 ? ')' : 'A') == ')') {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static JSONObject m584(Map<String, JSONObject> map) throws JSONException {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        JSONObject jSONObjectJsonObjectInit2 = IronSourceVideoBridge.jsonObjectInit();
        Iterator it = new HashSet(map.keySet()).iterator();
        while (true) {
            if ((it.hasNext() ? 'W' : 'b') == 'b') {
                jSONObjectJsonObjectInit.put(m581(new int[]{136, 4, 198, 1}, (String) null, true).intern(), jSONObjectJsonObjectInit2);
                return jSONObjectJsonObjectInit;
            }
            int i10 = f426 + 45;
            f425 = i10 % 128;
            if ((i10 % 2 != 0 ? '(' : (char) 25) != '(') {
                String str = (String) it.next();
                jSONObjectJsonObjectInit2.put(str.toLowerCase(), map.get(str));
            } else {
                String str2 = (String) it.next();
                jSONObjectJsonObjectInit2.put(str2.toLowerCase(), map.get(str2));
                int i11 = 40 / 0;
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean m624(String str) {
        int i10 = f426 + 83;
        f425 = i10 % 128;
        int i11 = i10 % 2;
        if ((this.f433.containsKey(str) ? (char) 28 : '&') != '&') {
            if ((this.f433.get(str).m658(this.f437) ? (char) 17 : '+') != '+') {
                int i12 = f425 + 95;
                f426 = i12 % 128;
                int i13 = i12 % 2;
                return true;
            }
        }
        int i14 = f425 + 99;
        f426 = i14 % 128;
        int i15 = i14 % 2;
        return false;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m612(String str, int i10) {
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
                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f424)) ^ ((c11 >>> 5) + f423)));
                        cArr3[1] = c12;
                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f428) ^ ((c12 + i12) ^ ((c12 << 4) + f429))));
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m629(String str) {
        m626(str, new ArrayList());
        int i10 = f425 + 91;
        f426 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            return;
        }
        int i11 = 10 / 0;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized ISAdQualityInitListener m627() {
        int i10 = f426 + 31;
        f425 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 25 : '+') != '+') {
            throw null;
        }
        return this.f430;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m626(String str, List<Object> list) {
        int i10 = f425 + 1;
        f426 = i10 % 128;
        int i11 = i10 % 2;
        Iterator<cm> it = m576().iterator();
        while (true) {
            if (!it.hasNext()) {
                return;
            }
            int i12 = f425 + 31;
            f426 = i12 % 128;
            int i13 = i12 % 2;
            it.next().m1610(str, list);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m581(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
        String str2;
        Object bytes = str;
        if (str != null) {
            bytes = str.getBytes("ISO-8859-1");
        }
        byte[] bArr = (byte[]) bytes;
        synchronized (i.f2448) {
            int i10 = iArr[0];
            int i11 = iArr[1];
            int i12 = iArr[2];
            int i13 = iArr[3];
            char[] cArr = new char[i11];
            System.arraycopy(f427, i10, cArr, 0, i11);
            if (bArr != null) {
                char[] cArr2 = new char[i11];
                i.f2447 = 0;
                char c10 = 0;
                while (true) {
                    int i14 = i.f2447;
                    if (i14 >= i11) {
                        break;
                    }
                    if (bArr[i14] == 1) {
                        cArr2[i14] = (char) (((cArr[i14] << 1) + 1) - c10);
                    } else {
                        cArr2[i14] = (char) ((cArr[i14] << 1) - c10);
                    }
                    c10 = cArr2[i14];
                    i.f2447 = i14 + 1;
                }
                cArr = cArr2;
            }
            if (i13 > 0) {
                char[] cArr3 = new char[i11];
                System.arraycopy(cArr, 0, cArr3, 0, i11);
                int i15 = i11 - i13;
                System.arraycopy(cArr3, 0, cArr, i15, i13);
                System.arraycopy(cArr3, i13, cArr, 0, i15);
            }
            if (z10) {
                char[] cArr4 = new char[i11];
                i.f2447 = 0;
                while (true) {
                    int i16 = i.f2447;
                    if (i16 >= i11) {
                        break;
                    }
                    cArr4[i16] = cArr[(i11 - i16) - 1];
                    i.f2447 = i16 + 1;
                }
                cArr = cArr4;
            }
            if (i12 > 0) {
                i.f2447 = 0;
                while (true) {
                    int i17 = i.f2447;
                    if (i17 >= i11) {
                        break;
                    }
                    cArr[i17] = (char) (cArr[i17] - iArr[2]);
                    i.f2447 = i17 + 1;
                }
            }
            str2 = new String(cArr);
        }
        return str2;
    }
}
