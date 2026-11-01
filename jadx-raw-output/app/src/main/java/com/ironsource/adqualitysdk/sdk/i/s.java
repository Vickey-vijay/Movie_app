package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
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
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import com.ironsource.G5;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import com.ironsource.adqualitysdk.sdk.ISAdQualityConfig;
import com.ironsource.adqualitysdk.sdk.ISAdQualityCustomMediationRevenue;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitError;
import com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener;
import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.ironsource.adqualitysdk.sdk.IronSourceAdQuality;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import com.vungle.ads.internal.protos.Sdk;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class s extends IronSourceAdQuality {

    /* JADX INFO: renamed from: リ, reason: contains not printable characters */
    private static int f2999 = 1;

    /* JADX INFO: renamed from: ヶ, reason: contains not printable characters */
    private static long f3000;

    /* JADX INFO: renamed from: 丫, reason: contains not printable characters */
    private static char[] f3001;

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    private static int f3002;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static s f3003;

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private je f3004;

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private an f3005;

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private iz f3006;

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private am f3007;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private iw f3009;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private at f3010;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private af f3012;

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private ISAdQualityAdListener f3013;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private Context f3014;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private ISAdQualityConfig f3019;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final ao f3022 = new ao();

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean f3021 = false;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean f3020 = false;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private boolean f3017 = false;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private boolean f3018 = false;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private boolean f3016 = false;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private ISAdQualityLogLevel f3015 = ISAdQualityLogLevel.INFO;

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private final Set<ISAdQualityInitListener> f3008 = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private final al f3011 = new al();

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.s$1, reason: invalid class name */
    public class AnonymousClass1 implements av {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final /* synthetic */ boolean f3024;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        public final /* synthetic */ Context f3025;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final /* synthetic */ boolean f3026;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final /* synthetic */ String f3027;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final /* synthetic */ boolean f3028;

        /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.s$1$3, reason: invalid class name */
        public class AnonymousClass3 extends ir {

            /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.s$1$3$4, reason: invalid class name */
            public class AnonymousClass4 extends ir {

                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                private static long f3030 = 2703359542927637431L;

                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                private static int f3031 = 1;

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static int f3032;

                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() {
                    s.m2926(s.this).m2632(m2982("矚\uf3ef蛽瞼㨲젴\uf1f2襰館\ud91a\ue0de顁ꨑ\ueaf4펈ꪊ묫\ufbca", (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), new je.b() { // from class: com.ironsource.adqualitysdk.sdk.i.s.1.3.4.1

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static int f3034 = 0;

                        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                        private static long f3035 = -378883568601775516L;

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static int f3036 = 1;

                        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                        private static String m2983(String str, int i10) {
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
                                        cArr2[i11] = (char) (((long) (cArr[i11] ^ (f.f2017 * i11))) ^ f3035);
                                        f.f2018++;
                                    } else {
                                        str2 = new String(cArr2);
                                    }
                                }
                            }
                            return str2;
                        }

                        /* JADX WARN: Code duplicated, block: B:21:0x0032 A[PHI: r5
  0x0032: PHI (r5v6 boolean) = (r5v1 boolean), (r5v7 boolean) binds: [B:20:0x0030, B:12:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
                        @Override // com.ironsource.adqualitysdk.sdk.i.je.b
                        /* JADX INFO: renamed from: ﻛ */
                        public final void mo2642(String str) {
                            final boolean zIsEmpty;
                            int i10 = f3034 + 65;
                            f3036 = i10 % 128;
                            if (!(i10 % 2 != 0)) {
                                zIsEmpty = TextUtils.isEmpty(str);
                                int i11 = 73 / 0;
                                if (zIsEmpty) {
                                    s.m2926(s.this).m2636(m2983("䈂䗿䷫嗦嶖旑淇痗綯ֿඑᖜᶕ▁", TextUtils.indexOf("", "", 0, 0) + 2039).intern(), m2983("䈂ⷦ鷎\u0dbeﶍ", 28643 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), null);
                                }
                            } else {
                                zIsEmpty = TextUtils.isEmpty(str);
                                if ((zIsEmpty ? '5' : '.') != '.') {
                                    s.m2926(s.this).m2636(m2983("䈂䗿䷫嗦嶖旑淇痗綯ֿඑᖜᶕ▁", TextUtils.indexOf("", "", 0, 0) + 2039).intern(), m2983("䈂ⷦ鷎\u0dbeﶍ", 28643 - (ViewConfiguration.getDoubleTapTimeout() >> 16)).intern(), null);
                                }
                            }
                            t.m2991(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.s.1.3.4.1.4

                                /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                                private static int f3038 = 1;

                                /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                                private static short[] f3039 = null;

                                /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                                private static int f3040 = 0;

                                /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                                private static byte[] f3041 = {-13, 57, 9, 51, 56, 29, 10, -16, ExifInterface.MARKER_APP1, 114, -30};

                                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                                private static int f3042 = -1474294752;

                                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                                private static int f3043 = 20;

                                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                                private static int f3044 = 1840164665;

                                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                                private static String m2984(int i12, int i13, int i14, short s10, byte b10) {
                                    String string;
                                    synchronized (o.f2993) {
                                        StringBuilder sb2 = new StringBuilder();
                                        int i15 = f3043;
                                        int i16 = i12 + i15;
                                        boolean z10 = i16 == -1;
                                        if (z10) {
                                            byte[] bArr = f3041;
                                            i16 = bArr != null ? (byte) (bArr[f3042 + i13] + i15) : (short) (f3039[f3042 + i13] + i15);
                                        }
                                        if (i16 > 0) {
                                            o.f2994 = ((i13 + i16) - 2) + f3042 + (z10 ? 1 : 0);
                                            o.f2995 = b10;
                                            char c10 = (char) (i14 + f3044);
                                            o.f2997 = c10;
                                            sb2.append(c10);
                                            o.f2996 = o.f2997;
                                            o.f2998 = 1;
                                            while (o.f2998 < i16) {
                                                byte[] bArr2 = f3041;
                                                if (bArr2 != null) {
                                                    int i17 = o.f2994;
                                                    o.f2994 = i17 - 1;
                                                    o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i17] + s10)) ^ o.f2995));
                                                } else {
                                                    short[] sArr = f3039;
                                                    int i18 = o.f2994;
                                                    o.f2994 = i18 - 1;
                                                    o.f2997 = (char) (o.f2996 + (((short) (sArr[i18] + s10)) ^ o.f2995));
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

                                /* JADX WARN: Code duplicated, block: B:25:0x0083  */
                                /* JADX WARN: Code duplicated, block: B:26:0x0086  */
                                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                                /* JADX INFO: renamed from: ﾒ */
                                public final void mo276() {
                                    String strIntern;
                                    af afVarM2935 = s.m2935(s.this);
                                    String strIntern2 = m2984((-21) - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 1474294752 - View.MeasureSpec.makeMeasureSpec(0, 0), (-1856941765) - Color.rgb(0, 0, 0), (short) (98 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (byte) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 113)).intern();
                                    AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                                    if (anonymousClass1.f3026) {
                                        int i12 = f3040 + 23;
                                        f3038 = i12 % 128;
                                        if ((i12 % 2 == 0 ? (char) 23 : 'F') != 23) {
                                            if ((anonymousClass1.f3027 != null ? '/' : 'P') != 'P') {
                                                strIntern = anonymousClass1.f3027;
                                            } else {
                                                strIntern = m2984((ViewConfiguration.getEdgeSlop() >> 16) - 21, 1474294759 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), Drawable.resolveOpacity(0, 0) - 1840164555, (short) ((-38) - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (byte) ((-68) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern();
                                                int i13 = f3038 + 83;
                                                f3040 = i13 % 128;
                                                int i14 = i13 % 2;
                                            }
                                        } else {
                                            int i15 = 48 / 0;
                                            if ((anonymousClass1.f3027 != null ? ')' : '[') != '[') {
                                                strIntern = anonymousClass1.f3027;
                                            } else {
                                                strIntern = m2984((ViewConfiguration.getEdgeSlop() >> 16) - 21, 1474294759 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), Drawable.resolveOpacity(0, 0) - 1840164555, (short) ((-38) - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (byte) ((-68) - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern();
                                                int i16 = f3038 + 83;
                                                f3040 = i16 % 128;
                                                int i17 = i16 % 2;
                                            }
                                        }
                                    } else {
                                        strIntern = null;
                                    }
                                    at atVarM2939 = s.m2939(s.this);
                                    new gq(s.m2937(s.this));
                                    s.m2937(s.this);
                                    afVarM2935.m368(strIntern2, jr.m2716(strIntern, atVarM2939, zIsEmpty, s.m2949(s.this)));
                                    AnonymousClass1 anonymousClass2 = AnonymousClass1.this;
                                    if (!(anonymousClass2.f3028)) {
                                        return;
                                    }
                                    int i18 = f3038 + 77;
                                    f3040 = i18 % 128;
                                    int i19 = i18 % 2;
                                    s.m2935(s.this).m369();
                                }
                            });
                            int i12 = f3036 + 93;
                            f3034 = i12 % 128;
                            int i13 = i12 % 2;
                        }
                    });
                    int i10 = f3031 + 39;
                    f3032 = i10 % 128;
                    if (i10 % 2 != 0) {
                        throw null;
                    }
                }

                public AnonymousClass4() {
                }

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static String m2982(String str, int i10) {
                    String str2;
                    Object charArray = str;
                    if (str != null) {
                        charArray = str.toCharArray();
                    }
                    char[] cArr = (char[]) charArray;
                    synchronized (h.f2284) {
                        char[] cArrM2243 = h.m2243(f3030, cArr, i10);
                        h.f2285 = 4;
                        while (true) {
                            int i11 = h.f2285;
                            if (i11 < cArrM2243.length) {
                                h.f2283 = i11 - 4;
                                int i12 = h.f2285;
                                cArrM2243[i12] = (char) (((long) (cArrM2243[i12] ^ cArrM2243[i12 % 4])) ^ (((long) h.f2283) * f3030));
                                h.f2285++;
                            } else {
                                str2 = new String(cArrM2243, 4, cArrM2243.length - 4);
                            }
                        }
                    }
                    return str2;
                }
            }

            public AnonymousClass3() {
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                if (anonymousClass1.f3024) {
                    s.m2939(s.this).m628(AnonymousClass1.this.f3025, new AnonymousClass4());
                }
            }
        }

        public AnonymousClass1(boolean z10, Context context, boolean z11, String str, boolean z12) {
            this.f3024 = z10;
            this.f3025 = context;
            this.f3026 = z11;
            this.f3027 = str;
            this.f3028 = z12;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.av
        /* JADX INFO: renamed from: ﾒ */
        public final void mo317() {
            t.m2995(new AnonymousClass3());
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.s$5, reason: invalid class name */
    public class AnonymousClass5 extends ir {

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static char[] f3053 = {'M', 150, 162, 170, 179, 187, 182, 186, 190, 198, 182, 155, '$', '[', 'k', 'n', 'n', 'e', 'f', 'j', 'q', 'q', 'k', 'j', 'C', 'K', 'p', 'n', 'n', 'D', '@', 'h', 'p', 'H', 'E', 'h', 'o', 'L', 'F', 175, 218, 224, 224, 197, 190, 209, 214, 203, 205, 224, 217, 217, 183, 177, 219, 219, 221, 184, 182, 224, 222, 214, 218, 202, 159, 141, 142, 142, 176, 218, 224, 224, 197, 190, 209, 214, 203, 205, 224, 217, 217, 183, 177, 219, 219, 221, 184, 175, 218, 220, 215, 179, 180, 216, 176, 183, 222, 219, 180, 180, 198, 159, 141, 142, 142, 161, 183, 184, 184, 189, 182, 185, 169, 142, 142, 175, 209, 209, 216, 214, 207, 216, 219, 211, 175, 175, 208, 174, 179, 217, 215, 221, '7', 'h', '[', 'Z', 'j', 'o', 'f', 'g', 'i', 'k', 'p', 'l', 'f', 'I', 'N', 'q', 'P', '7', 'Z', 'v', 'd', 206, 202, 210, 218, 227, 235, 230, 234, 238, 246, 230, 203, 199, 181, 201, 243, 234, 233, 243, 238, 235, 234, 195, 195, 234, 240, 201, 202, 243, 239, 211, 173, '\"', '[', 'r', 'p', 'p', 'I', 'D', 'k', 'k', 'n', 'n', 'e', 'f', 'j', 'q', 'q', 'k', 'j', 'C', '4', 'N', 'J', 'R', 'Z', 'c', 'k', 'f', 'j', 'n', 'v', 'L', '9', 'K', 'G'};

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private /* synthetic */ String f3054;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private /* synthetic */ ISAdQualityConfig f3055;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private /* synthetic */ Activity f3057;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private /* synthetic */ Application f3058;

        public AnonymousClass5(ISAdQualityConfig iSAdQualityConfig, String str, Application application, Activity activity) {
            this.f3055 = iSAdQualityConfig;
            this.f3054 = str;
            this.f3058 = application;
            this.f3057 = activity;
        }

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static String m2986(String str, boolean z10, int[] iArr) throws UnsupportedEncodingException {
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
                System.arraycopy(f3053, i10, cArr, 0, i11);
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

        @Override // com.ironsource.adqualitysdk.sdk.i.ir
        /* JADX INFO: renamed from: ﾒ */
        public final void mo276() {
            try {
                String userId = this.f3055.getUserId();
                s.m2956(s.this, this.f3055.getLogLevel());
                String strIntern = m2986("\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001", false, new int[]{0, 12, 80, 1}).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m2986("\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0000\u0000\u0001", false, new int[]{12, 26, 0, 0}).intern());
                sb2.append(this.f3054);
                k.m2821(strIntern, sb2.toString());
                ij.m2497(this.f3058.getApplicationContext()).m2501();
                s.m2947(s.this, this.f3055.isTestMode());
                if (this.f3055.isTestMode()) {
                    k.m2814(m2986("\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001", false, new int[]{0, 12, 80, 1}).intern(), m2986("\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0001\u0000\u0001\u0001\u0000\u0000\u0000\u0001\u0000", true, new int[]{38, 94, 109, 74}).intern());
                }
                try {
                    Class.forName(m2986("\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0000\u0000\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0000\u0000", false, new int[]{Sdk.SDKError.Reason.OMSDK_DOWNLOAD_JS_ERROR_VALUE, 20, 0, 6}).intern());
                } catch (Throwable unused) {
                }
                Activity activity = this.f3057;
                if (activity != null) {
                    jw.m2761(activity);
                } else {
                    jw.m2757(this.f3058);
                }
                s.m2949(s.this).m465(this.f3054);
                s.m2949(s.this).m471(this.f3055.getInitializationSource());
                s.m2949(s.this).m466(this.f3055.getCoppa());
                s.m2949(s.this).m468(this.f3055.getDeviceIdType());
                s.m2949(s.this).m469(this.f3055.getMetaData());
                Context applicationContext = this.f3058.getApplicationContext();
                s.m2941(s.this, applicationContext);
                s.m2958(s.this, new iw(applicationContext));
                s sVar = s.this;
                s.m2966(s.this);
                s.m2950(sVar, new je(applicationContext, al.m432(), "B0r1sW@sH3re"));
                ar.m483().mo509(applicationContext, s.m2943(s.this), s.m2966(s.this), new ar.c() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5.1

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static int[] f3059 = {161392192, 1499823339, -721695532, 1269414944, -1536597178, 1972528928, 1184997248, -2043409729, -1004510380, 458687647, -227969981, -1984234855, -432624880, 1761999894, -2057114334, -1735393248, -353286572, -2044858911};

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static int f3060 = 1;

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static int f3061;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static String m2987(int[] iArr, int i10) {
                        String str;
                        synchronized (e.f1912) {
                            char[] cArr = new char[4];
                            char[] cArr2 = new char[iArr.length << 1];
                            int[] iArr2 = (int[]) f3059.clone();
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

                    @Override // com.ironsource.adqualitysdk.sdk.i.ar.c
                    /* JADX INFO: renamed from: ｋ */
                    public final void mo551() {
                        int i10 = f3061 + 19;
                        f3060 = i10 % 128;
                        int i11 = i10 % 2;
                        s.m2955(s.this, ISAdQualityInitError.CONFIG_LOAD_TIMEOUT, m2987(new int[]{-2023492544, 119760403, 1112005157, -1552877142, 650114569, -547908151, -1274178265, -1666651247, -1022986945, -1222045747, -2093729363, -2114175799, -1121388671, -1634671810, 1720117596, -983965390, 1489073122, 215868034}, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 35).intern());
                        int i12 = f3061 + 117;
                        f3060 = i12 % 128;
                        if (i12 % 2 != 0) {
                        } else {
                            throw null;
                        }
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.ar.c
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo552() {
                        s sVar2;
                        ISAdQualityInitError iSAdQualityInitError;
                        String strM2987;
                        int i10 = f3060 + 45;
                        f3061 = i10 % 128;
                        if (i10 % 2 != 0) {
                            sVar2 = s.this;
                            iSAdQualityInitError = ISAdQualityInitError.NO_NETWORK_CONNECTION;
                            strM2987 = m2987(new int[]{1747955636, 701275797, -340711641, 167662369, 1304856093, -1186197523, -1810694215, -1744796554, 1015162854, 1270649485, -1305307675, -1285633435}, (AudioTrack.getMinVolume() > 1.0f ? 1 : (AudioTrack.getMinVolume() == 1.0f ? 0 : -1)) + 10);
                        } else {
                            sVar2 = s.this;
                            iSAdQualityInitError = ISAdQualityInitError.NO_NETWORK_CONNECTION;
                            strM2987 = m2987(new int[]{1747955636, 701275797, -340711641, 167662369, 1304856093, -1186197523, -1810694215, -1744796554, 1015162854, 1270649485, -1305307675, -1285633435}, 21 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)));
                        }
                        s.m2955(sVar2, iSAdQualityInitError, strM2987.intern());
                        int i11 = f3061 + 27;
                        f3060 = i11 % 128;
                        if ((i11 % 2 == 0 ? 'c' : 'I') != 'c') {
                        } else {
                            throw null;
                        }
                    }
                }, s.m2976(s.this));
                s.m2944(s.this, new iz(applicationContext, s.m2943(s.this), s.m2966(s.this).m438()));
                final String strM2786 = jy.m2786(applicationContext);
                ar.m483().mo514(new av() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5.2

                    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                    private static char f3064 = 62599;

                    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                    private static int f3065 = 1;

                    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                    private static int f3066 = 0;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static char f3067 = 31914;

                    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                    private static char f3068 = 32823;

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static char f3069 = 15337;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static String m2988(String str, int i10) {
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
                                        char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f3069)) ^ ((c11 >>> 5) + f3064)));
                                        cArr3[1] = c12;
                                        cArr3[0] = (char) (c11 - (((c12 >>> 5) + f3067) ^ ((c12 + i12) ^ ((c12 << 4) + f3068))));
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

                    @Override // com.ironsource.adqualitysdk.sdk.i.av
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo317() {
                        int i10 = f3065 + 101;
                        f3066 = i10 % 128;
                        int i11 = i10 % 2;
                        if (!ar.m483().mo513(m2988("\ue28e맦ᨣꡠ䁊\ua6fc", (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 5).intern(), strM2786)) {
                            s.m2960(s.this);
                            int i12 = f3066 + 121;
                            f3065 = i12 % 128;
                            int i13 = i12 % 2;
                        }
                        int i14 = f3065 + 13;
                        f3066 = i14 % 128;
                        if ((i14 % 2 != 0 ? (char) 20 : '!') == '!') {
                        } else {
                            throw null;
                        }
                    }
                });
                ar.m483().mo512(new av() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5.4
                    @Override // com.ironsource.adqualitysdk.sdk.i.av
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo317() {
                        ar.m483().mo508(s.m2934(s.this));
                    }
                });
                s.m2954(s.this, applicationContext);
                s.m2957(s.this, new af(applicationContext, s.m2949(s.this), s.m2966(s.this), this.f3057 != null, strM2786, new q() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5.3
                    @Override // com.ironsource.adqualitysdk.sdk.i.q
                    public void onEvent(final String str) {
                        t.m2991(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5.3.4

                            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                            private static short[] f3073 = null;

                            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                            private static int f3074 = 0;

                            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                            private static byte[] f3075 = {12, -52, -61, 37, -37, -1, -54, -27, -7, 21, -117, 86, -57, -53, 28, -61, 24, 21, -52, -61, 37, -69, 0};

                            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                            private static int f3076 = 1;

                            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                            private static int f3077 = -2103921642;

                            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                            private static int f3078 = 40;

                            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                            private static int f3079 = -1720684892;

                            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                            private static String m2989(int i10, int i11, byte b10, int i12, short s10) {
                                String string;
                                synchronized (o.f2993) {
                                    StringBuilder sb3 = new StringBuilder();
                                    int i13 = f3078;
                                    int i14 = i12 + i13;
                                    boolean z10 = i14 == -1;
                                    if (z10) {
                                        byte[] bArr = f3075;
                                        i14 = bArr != null ? (byte) (bArr[f3077 + i10] + i13) : (short) (f3073[f3077 + i10] + i13);
                                    }
                                    if (i14 > 0) {
                                        o.f2994 = ((i10 + i14) - 2) + f3077 + (z10 ? 1 : 0);
                                        o.f2995 = b10;
                                        char c10 = (char) (i11 + f3079);
                                        o.f2997 = c10;
                                        sb3.append(c10);
                                        o.f2996 = o.f2997;
                                        o.f2998 = 1;
                                        while (o.f2998 < i14) {
                                            byte[] bArr2 = f3075;
                                            if (bArr2 != null) {
                                                int i15 = o.f2994;
                                                o.f2994 = i15 - 1;
                                                o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i15] + s10)) ^ o.f2995));
                                            } else {
                                                short[] sArr = f3073;
                                                int i16 = o.f2994;
                                                o.f2994 = i16 - 1;
                                                o.f2997 = (char) (o.f2996 + (((short) (sArr[i16] + s10)) ^ o.f2995));
                                            }
                                            sb3.append(o.f2997);
                                            o.f2996 = o.f2997;
                                            o.f2998++;
                                        }
                                    }
                                    string = sb3.toString();
                                }
                                return string;
                            }

                            @Override // com.ironsource.adqualitysdk.sdk.i.ir
                            /* JADX INFO: renamed from: ﾒ */
                            public final void mo276() {
                                int i10 = f3074 + 25;
                                f3076 = i10 % 128;
                                int i11 = i10 % 2;
                                s.m2939(s.this).m626(m2989((ViewConfiguration.getScrollDefaultDelay() >> 16) + 2103921642, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1720684992, (byte) ((Process.myPid() >> 22) - 38), Color.blue(0) - 17, (short) (17 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)))).intern(), Collections.singletonList(str));
                                int i12 = f3074 + 59;
                                f3076 = i12 % 128;
                                int i13 = i12 % 2;
                            }
                        });
                    }
                }));
                if (!this.f3055.isUserIdSet()) {
                    s.m2949(s.this).m458();
                    userId = s.m2935(s.this).m366();
                }
                if (s.this.m2979()) {
                    s.m2935(s.this).m373(new ag() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5.5
                        @Override // com.ironsource.adqualitysdk.sdk.i.ag
                        public void onEventReceived(JSONObject jSONObject) {
                            in.m2510(s.m2937(s.this), ih.f2507, jSONObject, new Object[0]);
                        }
                    });
                }
                s.m2935(s.this).m370(new je.d() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5.7
                    @Override // com.ironsource.adqualitysdk.sdk.i.je.d
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo2643() {
                        s.m2960(s.this);
                    }
                });
                s.m2942(s.this, new at(s.m2934(s.this), s.m2935(s.this), strM2786, new bb(), new ISAdQualityInitListener() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5.10
                    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
                    public final void adQualitySdkInitFailed(ISAdQualityInitError iSAdQualityInitError, String str) {
                        s.m2955(s.this, iSAdQualityInitError, str);
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityInitListener
                    public final void adQualitySdkInitSuccess() {
                        s.m2932(s.this);
                    }
                }));
                s.m2939(s.this).m630(new ISAdQualityAdListener() { // from class: com.ironsource.adqualitysdk.sdk.i.s.5.6
                    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener
                    public final void adClosed(String str, ISAdQualityAdType iSAdQualityAdType) {
                        if (s.m2930(s.this) != null) {
                            s.m2930(s.this).adClosed(str, iSAdQualityAdType);
                        }
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.ISAdQualityAdListener
                    public final void adDisplayed(String str, ISAdQualityAdType iSAdQualityAdType) {
                        if (s.m2930(s.this) != null) {
                            s.m2930(s.this).adDisplayed(str, iSAdQualityAdType);
                        }
                    }
                });
                s.m2968(s.this, new am(s.m2939(s.this)));
                s.m2969(s.this, new an(s.m2935(s.this)));
                String strIntern2 = m2986("\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001", false, new int[]{0, 12, 80, 1}).intern();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(m2986("\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0000\u0000", false, new int[]{152, 33, 128, 0}).intern());
                sb3.append(s.m2966(s.this).m437());
                k.m2825(strIntern2, sb3.toString());
                s sVar2 = s.this;
                Context context = this.f3057;
                if (context == null) {
                    context = applicationContext;
                }
                s.m2962(sVar2, context, userId);
                s.m2961(s.this, applicationContext);
                s.m2927(s.this);
                s.m2924(s.this);
            } catch (Throwable th2) {
                String strIntern3 = m2986("\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001", false, new int[]{185, 34, 0, 0}).intern();
                kd.m2880(m2986("\u0001\u0000\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001", false, new int[]{0, 12, 80, 1}).intern(), strIntern3, th2, true, false, true);
                s.m2955(s.this, ISAdQualityInitError.EXCEPTION_ON_INIT, strIntern3);
            }
        }
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static /* synthetic */ void m2924(s sVar) {
        int i10 = f3002 + 57;
        f2999 = i10 % 128;
        int i11 = i10 % 2;
        sVar.m2948(false);
        int i12 = f3002 + 69;
        f2999 = i12 % 128;
        if ((i12 % 2 == 0 ? 'Q' : 'I') == 'I') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static /* synthetic */ boolean m2929(s sVar) {
        int i10 = f2999 + 11;
        f3002 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM2928 = sVar.m2928();
        int i12 = f2999 + 71;
        f3002 = i12 % 128;
        if ((i12 % 2 != 0 ? '_' : (char) 18) == 18) {
            return zM2928;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public static /* synthetic */ ISAdQualityAdListener m2930(s sVar) {
        int i10 = f2999 + 107;
        f3002 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        ISAdQualityAdListener iSAdQualityAdListener = sVar.f3013;
        if (!z10) {
            return iSAdQualityAdListener;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ void m2932(s sVar) {
        int i10 = f2999 + 31;
        f3002 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        sVar.m2931();
        if (z10) {
            int i11 = 56 / 0;
        }
        int i12 = f3002 + 13;
        f2999 = i12 % 128;
        if ((i12 % 2 == 0 ? 'b' : '-') != 'b') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ iz m2934(s sVar) {
        int i10 = f2999;
        int i11 = i10 + 121;
        f3002 = i11 % 128;
        int i12 = i11 % 2;
        iz izVar = sVar.f3006;
        int i13 = i10 + 59;
        f3002 = i13 % 128;
        if (!(i13 % 2 != 0)) {
            return izVar;
        }
        int i14 = 63 / 0;
        return izVar;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ af m2935(s sVar) {
        int i10 = f2999;
        int i11 = i10 + 89;
        f3002 = i11 % 128;
        int i12 = i11 % 2;
        af afVar = sVar.f3012;
        int i13 = i10 + 125;
        f3002 = i13 % 128;
        int i14 = i13 % 2;
        return afVar;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ Context m2937(s sVar) {
        int i10 = f3002 + 39;
        int i11 = i10 % 128;
        f2999 = i11;
        int i12 = i10 % 2;
        Context context = sVar.f3014;
        int i13 = i11 + 115;
        f3002 = i13 % 128;
        int i14 = i13 % 2;
        return context;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static void m2940() {
        char[] cArr = new char[1654];
        ByteBuffer.wrap("vV<\u0081ãÄ\u0096\u001c]z\u0000k¶°}è \u001e×^\u009ad@\u0083÷Çº=a\u0007\u0014uÚ¡\u0081ë4\u0001ûA®zT¢\u001bèÎ\u000euB8:î®\u0095ïX\u001d\u000fR²|x´/ËÒR\u0099DLjò¬¹\u009el\u001c\u0013QÆd\u008c¾3\u009dæ\u0012\u00adFP6\u0006¦ÍÚpO'Vêl\u0090¸GÞ\nN±`dw*³ÑÓ\u0084\u001bKIþg¤¿k\u0096\u001e-Å/\u0088b>©åÑ¨\b_?\u0002eÈ\u00ad\u007fØ\"\u00040Õz=¥_Ð\u0086\u001bÁFùð3;{f\u0085\u0091òÜÒ\u0006\u0010\u0000CJ¬\u0095ôà@+@v!À§\u000bõV\u0001¡Aìk6®\u0081ðÌ\u0000\u0017Lbf¬ð÷°BJ\u008dyØk\"ñmÿ¸\u000f\u0003\u0018Nk\u0098·ãë.\u001byVÄt\u000e¸YÓ¤Mïi:C\u0084\u009fÏÒ\u001aNeK°zú°EÑ\u0090\nÛR&}pö»Ê\u0006\u001eQ\u001d\u009c~æ¿1Á|QÇ_\u0012{\\¨\u0000IJ\u009e\u0095Ûà\u0003+evtÀ¯\u000b÷V\u0001¡Aì{6\u009c\u0081ØÌ\"\u0017\u0018bj¬¾÷ôB\u001e\u008d^Øe\"½m÷¸\u0011\u0003]N%\u0098³ãó.\u001ey\\Äg\u000e·YÙ¤MïY:f\u0084¸ÏÍ\u001a\u000be_2Äx\u0013§VÒ\u008e\u0019èDùò\"9zd\u008c\u0093ÌÞö\u0004b³Bþ %ðP®\u009e4Å~p\u008e¿Îêà\u0010=_\u007f\u008a\u008f1Ï|íª\u007fÑ\u007f\u001c\u0084KÀöã<1kI\u0096ÀÝÔ\bë¶7ý\f(\u0081WÓ\u0082¥È=wW¢\u0087éÒ\u0014ñB/\u0089K4\u0099c\u0090®èÔ4\u0003EN\u0085õ\u0093 én;\u0095KÀ\u009a\u0000CJ¬\u0095ôà@+@v!À§\u000bõV\u0001¡Aìk6®\u0081ðÌ\u0000\u0017Lbf¬ð÷°BJ\u008d~ØW\"\u0090mú¸:\u0003MNd\u0098¾ãö.\u0018y@Ä&\u000e\u0080Yä¤&ï\u001a:p\u0084µÏÒ\u001aNeH°`ú EÖ\u0090\u000bÛS&~p¸»\u008d\u0000CJ¬\u0095ôà@+@v!À§\u000bõV\u0001¡Aìk6®\u0081ðÌ\u0000\u0017Lbf¬ð÷ÔB9\u008dvØ`\"\u0080më¸\n\u0003TNl\u0098¦ãæ.LyjÄB\u000e\u0098Y\u0080¤\u001aïS:s\u0084¼Ï\u0081\u001a\u0000eN°dú¹E\u0082\u0090\u0000ÛN&)p³»Î\u0006\u0000QI\u009csæ÷1Ñ|\u0002Ç[\u0012y\\ø§Ìò\u0016=\u0011\\Y\u0016¶Éî¼ZwZ*;\u009c½Wï\n\u001bý[°qj´Ýê\u0090\u001aKV>|ðê«ª\u001ePÑL\u0084n~»1Ïä\u0014_[\u0012?Ä«¿är\u0018%\u0004\u0098hRé\u0005Øø\u0012³\u0000fsØ»\u0093×F\u00189\u0001ì}¦½\u0019\u0098Ì\u0010\u0087Kzc,¸çÀZD@p\n§Õâ :k\\6M\u0080\u0096KÎ\u00168áx¬Bv¥Áá\u008c\u001bW/\"Mì\u0088·×\u0002sÍo\u0098Qb\u009a-Âø3Ce\u000eEØË£Õn=9u\u0084KN\u008e\u0019öä#¯mz\u0010\u0000IJ\u009e\u0095Ûà\u0003+evtÀ¯\u000b÷V\u0001¡Aì{6\u009c\u0081ØÌ\"\u0017\u0016bt¬±÷îBJ\u008dYØa\"§mû¸\u0019\u0003\u0018Nl\u0098¼ãö.\u0018yPÄg\u000e¿YÉ¤\u0017ï_:c\u0084ôÏ\u008c\u001aNeU°gúõEÌ\u0090\nÛY&mpö»×\u0006\u001fQ\u001d\u009cyæ¿1Ñ|\u0005ÇZ\u0012d\\¯§Ëò\\k¦!qþ4\u008bì@\u008a\u001d\u009b«@`\u0018=îÊ®\u0087\u0094]\u0000ê §Â|\u0092\tÌÇH\u009c\u0013)öæø³\u0098IV\u0006\u0004Óðh³%\u0085óJ\u0088\u001e#'i¬¶ïÃ\u000f\b^U&ã\u0088(øu>\u0082GÏd\u0015¤¢òï\u001a4HA$\u008f§Ôöa\f®Dûe\u0001¹Në\u009b\u0001\u0000sJ¨\u0095èà\u0011+Qvs\u0000sJ©\u0095ñ`\u001f\u0000tJ½\u0095Åà\u0013+G¡ ëñ4¦AY\u008a\u000b×3cW)Íö\u0084\u0083dH+\u0015V£Ëh\u00895~Â1\u008f\u001aUÖâÑ¯>Z\u008f\u0010uÏ\"ºÂq\u008c,ë\u009awQ9\f×û\u008b¶¼llÛ8\u0096ÄMÜ8\u00adöu\u00ad \u0018Î\u0000EJ¿\u0095èà\b+Fv!À½\u000bþV\u001c¡Aìk6¡\u0081ûÌI\u0017Cbp¬µ÷ïB#\u008dSØ$ÉÆ\u0083)\\q)ÅâÅ¿¤\t(Âv\u009f\u008chÞ%àÿ/H9\u0005\u0099ÞÀ«ãe'>8\u008b\u0086DÖ\u0011¡ëy¤;q§Êî\u0087ÁQ3*Kç\u009c°Ý\rïÇ?\u0090Qm\u0091&\u009fóÑM\u0015\u0006oÓË¬Éyì3#\u008c\u0007Y\u0099\u0012Ñïù¹'rBÏ\u009a\u0098ÏUá/|\u0000YJ¢\u0095ïàG+YvtÀ½\u000bïVH¡\\ìl6¦\u0081èÌ\u0000\u0017Wbo¬¹÷çB\u000f\u008d\u0017ØM\"\u0082mß¸\u000f\u0003iNp\u0098³ãó.\u0005yMÄ\u007f\u000eóYó¤)ïq:'\u0084¶ÏÄ\u001a\beT°zú°E\u0082\u0090\fÛ]&epº»Ê\u0006\u001eQZ\u009c*æð1Ç|\u0019Ç_\u0012e\\¿§Àò'=L\u0088iÒ«\u001dïh\u0017³g\u0000NJ¨\u0095íàG+AvrÀ«\u000béVH¡\\ìf6ï\u0081ÿÌ\b\u0017Xb$¬¤÷½B\b\u008dRØ$\"¿më¸\u0007\u0003TN%\u0098½ãí.Ly\\Äk\u000e£YÔ¤\u0014¾Cô\u0099+Î^.\u0095`È&~èµèè\u001d\u001fVRv\u0088é?Ór+©\u0010Ül\u0012¥I»ü\u00023Dfn\u009c»Ó¶\u0006M½nðo&±]ø\u0090\u0019ÇZz °¸çÇ\u001a\u0000QY\u0084!:¡qÒ¤\u001aÛX\u000e.D§ûË.IeJ\u0098nÎ£\u0005Ö¸VïZ\",X§\u008fÃÂ\u001byQ¬iâþ\u0019ÍL\u001b\u0083W6'l±£ÕÖ\u0019\r*@+ö©-Ò`\u0017\u00975Ê(\u0000\u0094·êêS!0Tf\u008aúÁæt#«\u0004Þr\u0014\u008aKÙþ\u00105.h~\u009e¬ÕÔ\b^¿\u0010òP(\u0092_\u0084\u0000aJ£\u0095ãà\u0013+\\vhÀ \u000büVE¡Lìm6º\u0081±Ì\u001e\u0017Wbm¬¤\u0000EJ\u009f\u0095Èà(+fv Àî\u000bÂV\u0007¡@ì%6½\u0081ùÌI\u0017Cbp¬¹÷óB\r\u008d\u0017Øp\"¹mû¸K\u0003\\N`\u0098´ãþ.\u0019yUÄr\u000eóYÕ¤\u001eï_:u\u0084ôÏè\u001a*e\u001b\u009dñ×2\b\u0015}Ô¶\u008eë¿]b\u0096!Ë\u0097<\u0087q¼«{\u001c&Q\u0096\u008a\u009aÿ©1}j'ß\u0095\u0010\u009cE´¿.ð1%Õ\u009e\u0094Ó©\u0005-~!³\u0093ä\u0093Y·\u0093eÄ\u000e9Çr\u0080§ø\u0019~R\r\u0087Ôø\u0096-÷gCØ9\r\u0090F\u0085»¹í{&\\\u009bÊÌ\u0083\u0001¶{`¬[áÛZ\u0092\u008f±Áu:ZoÙ \u008f\u0015óOO\u0080*õí.ûc\u0083Õp\u000e\u0019CÇ´÷é¥#}\u0094WÉù\u0002Ùw\u009b©-û@±»nö\u001b\fÐ\r\u008dQ;\u0084ðÃ\u00ad\u0015Z}\u0017nÍ·zé7\u0019ì[\u0099cWé\f×¹7ve#=Ù½\u0096ôC\u0017øSµ<c\u0082\u0018ÂÕU\u0082I?lõð¢\u0099\u0000aJ©\u0095ëà8+]voÀ§\u000bïV7¡Wìn6 \u0081þ}\u009e7Tè\u0019\u009d¾V°\u000b\u0093½Jv\u001f+ÖÜ¦\u0000tJ¿\u0095ûà\u0004+QvcÀ¯\u000bøV\u0003¡\u001bìi6¹\u0081²Ì\r\u0017Tb-¬±÷óB\u000b\u008d[Ø}\"¥m÷¸\b\u0003KDë\u000e:Ñm¤\u0092oÀ2ø\u0084{Op\u0012\u0095åÎ¨èr2Åp\u0088ÜS\u009a&úè&³d\u0006\u009eÉÖ\u009cèf )eü\u0080\u0000CJ¬\u0095ôà@+@v!À½\u000bþV\u001c¡\u0015ìk6¡\u0081èÌ\f\u0017Dbm¬±÷ñBJ\u008dCØa\"¢mê¸K\u0003UNj\u0098¶ãú.Ly\u0014Ä&\u000e\u009aYó¤,ï^:V\u0084¡ÏÀ\u001a\u0002eR°|ú¬E\u0082\u0090<Ûx&Bpö»Ô\u0006\u0011QN\u009c*æ¤1Ì|\u0004ÇJ\u0012o\\·§Òò\u001c=\u0011\u0000MJ¸\u0095éà\u0013+\u0014vrÀ«\u000bïVH¡\\ìl6»\u0081ùÌ\u001b\u0017Xbb¬¼÷½B\u001e\u008dRØw\"¥m¾¸\u0006\u0003WNa\u0098·ã¿.\u000ey\\Ä`\u000e¼YÒ¤\bï\u001a:n\u0084ºÏÈ\u001a\u001aeR°iú¹EË\u0090\u0015ÛU&gp±»\u0082\u00052Oð\u0090\u00adåF.\bs;Åù\u000eæSR¤\bé%3ù\u0084¡ÉN\u0012Kg1©àòºGP\u0088\u000bÝ9'¬h\u008f½y\u0006?K\u0002\u009dÄæ\u009e+f|5Á\u0016\u000bÈ\\²¡pê.?\u0011\u0081Ã\u009cÐÖ:\te|\u009d·Çêó\\x\u0097yÊ\u0091=\u0083pæª<\u001dmP\u0096\u008bÓþá0#kyÞÜ\u0011ÃDó¾3ñ|$\u0098\u009fÜÒê\u0004d\u007f{²\u009fåÌXõ\u0092,Å@8\u009esÞ\u0000CJ¬\u0095ôà@+@v!À½\u000bþV\u001c¡\u0015ìc6«\u0081¼Ì\u0005\u0017_bp¬¤÷øB\u0004\u008dRØv\"ñm³¸K\u0003qNV\u0098\u0093ãû.=yLÄg\u000e¿YÉ¤\u0019ïC:'\u0084\u0087Ïå\u001a%e\u001b°\u007fú´EÑ\u0090OÛO&ap£»×\u0006\u0014QR\u009c}æ¹1\u008a\u0000CJ¬\u0095ôà@+@v!À½\u000bþV\u0006¡Qì\"6¬\u0081éÌ\u001a\u0017Bbl¬½÷½B\u0007\u008dRØ`\"¸mÿ¸\u001f\u0003QNj\u0098¼ã¿.\u001ey\\Äp\u000e¶YÎ¤\u0018ï_:'\u0084ùÏ\u0081\u001a'eh°Iú±Eó\u0090\u001aÛ]&ep¿»×\u0006\tQ\u001d\u009cYæ\u00931ï|QÇI\u0012j\\«§\u0085ò\u0001=W\u0088yÒ\u00ad\u001dÂh\u001c³7þcHô\u008e\u0003Äì\u001b´n\u0000¥\u0000øaNý\u0085¾ØF/\u0011bb¸ì\u000f©BZ\u0099\u0002ì,\"ýyýÌG\u0003\u0012V ¬øã¿6_\u008d\u0011À*\u0016ümÿ ^÷\u001cJ0\u0080ö×\u008e*Xa\u001f´g\n¹AÁ\u0094gë(>\ttñË³\u001eZU\u001d¨%þÿ5\u0097\u0088Iß]\u0012\u0019hÓ¿¯ò\u0011I\u0017\u009c8Ò¸)\u008b|]³\u000b\u0006l\\ð\u0093\u0088æZ=tp$Æû\u001d\u008bP]§{ú+0ÿ\u0087Æ\u0000CJ¬\u0095ôà@+@v!À½\u000bþV\u001c¡\u0015ìq6ª\u0081ûÌ\u0004\u0017Sbm¬¤÷½BG\u008d\u0017ØM\"\u0082mß¸\u000f\u0003iNp\u0098³ãó.\u0005yMÄ\u007f\u000eóYó¤)ïq:'\u0084£ÏÀ\u001a\u001de\u001b°{ú½E×\u0090\u001bÛX&fp¡»Í\u0006^Z\u0080\u0010oÏ7º\u0083q\u0083,â\u009a~Q=\fßûÖ¶¢lcÛ1\u0096ÌM\u009c8§ö3\u00ads\u0018\u0089×½\u0082\u0094xS79âùY\u008e\u0014§Â}¹5tÛ#\u0083\u009eåTC\u0003'þåµÙ`³Þv\u0095\u0011@\u008d?\u008bê£ c\u001f\u0015ÊÈ\u0081\u0090|½*{áN\u0000CJ¬\u0095ôà@+@v!À½\u000bþV\u001c¡\u0015ìa6 \u0081òÌ\u000f\u0017_bd¬ð÷°BJ\u008d~ØW\"\u0090mú¸:\u0003MNd\u0098¾ãö.\u0018y@Ä&\u000e\u0080Yä¤&ï\u001a:n\u0084§Ï\u0081\u001a\u000feW°zú°EÃ\u0090\u000bÛE&)p¿»Í\u0006\u0019QI\u009ccæ¶1È|\u0018ÇD\u0012n\\¼§\u008bÆ·\u008ctS*&Öí\u0098°º\u0006OÍ5\u0090Äg\u008e*\u0083ðxG,\nÞÑ\u009c¤\u0082jm1,\u0084ÚK\u008f\u001e³äh".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1654);
        f3001 = cArr;
        f3000 = 7154453121027623629L;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ Context m2941(s sVar, Context context) {
        int i10 = f3002 + 71;
        f2999 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        sVar.f3014 = context;
        if (z10) {
            throw null;
        }
        return context;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ ao m2949(s sVar) {
        int i10 = f3002 + 87;
        f2999 = i10 % 128;
        int i11 = i10 % 2;
        ao aoVarM2936 = sVar.m2936();
        int i12 = f3002 + 111;
        f2999 = i12 % 128;
        int i13 = i12 % 2;
        return aoVarM2936;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ af m2957(s sVar, af afVar) {
        int i10 = f3002;
        int i11 = i10 + 77;
        f2999 = i11 % 128;
        int i12 = i11 % 2;
        sVar.f3012 = afVar;
        int i13 = i10 + 77;
        f2999 = i13 % 128;
        if ((i13 % 2 == 0 ? '^' : 'K') == 'K') {
            return afVar;
        }
        int i14 = 63 / 0;
        return afVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ al m2966(s sVar) {
        int i10 = f3002;
        int i11 = i10 + 109;
        f2999 = i11 % 128;
        char c10 = i11 % 2 == 0 ? (char) 2 : (char) 19;
        al alVar = sVar.f3011;
        if (c10 == 2) {
            int i12 = 5 / 0;
        }
        int i13 = i10 + 77;
        f2999 = i13 % 128;
        if (!(i13 % 2 == 0)) {
            return alVar;
        }
        int i14 = 41 / 0;
        return alVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ am m2968(s sVar, am amVar) {
        int i10 = f3002 + 3;
        f2999 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        sVar.f3007 = amVar;
        if (!z10) {
            return amVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void changeUserId(String str) {
        try {
            if (m2965(str)) {
                boolean z10 = !(str.equals(m2936().m467()));
                boolean zMo2681 = jj.m2676().mo2681();
                if ((z10 ? (char) 22 : 'P') == 22) {
                    if ((zMo2681 ? ':' : (char) 14) == ':') {
                        this.f3012.m367();
                        int i10 = f3002 + 33;
                        f2999 = i10 % 128;
                        int i11 = i10 % 2;
                    }
                }
                m2953(this.f3014, str, z10, true, zMo2681);
                int i12 = f3002 + 39;
                f2999 = i12 % 128;
                int i13 = i12 % 2;
            }
        } catch (Exception e10) {
            String strIntern = m2970((char) (12436 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (ViewConfiguration.getLongPressTimeout() >> 16) + 74, 12 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2970((char) (1 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 599 - ExpandableListView.getPackedPositionChild(0L), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 20).intern());
            sb2.append(str);
            kd.m2880(strIntern, sb2.toString(), e10, true, false, true);
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void initialize(Context context, String str) {
        int i10 = f3002 + 43;
        f2999 = i10 % 128;
        int i11 = i10 % 2;
        initialize(context, str, null);
        int i12 = f3002 + 29;
        f2999 = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public synchronized void shutdown() {
        int i10 = f3002 + 123;
        f2999 = i10 % 128;
        int i11 = i10 % 2;
        m2974(false);
        int i12 = f2999 + 73;
        f3002 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    public static /* synthetic */ Set m2922(s sVar) {
        int i10 = f3002;
        int i11 = i10 + 15;
        f2999 = i11 % 128;
        int i12 = i11 % 2;
        Set<ISAdQualityInitListener> set = sVar.f3008;
        int i13 = i10 + 7;
        f2999 = i13 % 128;
        if (i13 % 2 != 0) {
            return set;
        }
        throw null;
    }

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    public static /* synthetic */ an m2923(s sVar) {
        int i10 = f3002;
        int i11 = i10 + 17;
        f2999 = i11 % 128;
        int i12 = i11 % 2;
        an anVar = sVar.f3005;
        int i13 = i10 + 59;
        f2999 = i13 % 128;
        if ((i13 % 2 == 0 ? ',' : 'H') != ',') {
            return anVar;
        }
        int i14 = 65 / 0;
        return anVar;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private synchronized boolean m2925() {
        int i10 = f2999 + 9;
        f3002 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 6 : 'J') == 6) {
            throw null;
        }
        return this.f3020;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public static /* synthetic */ je m2926(s sVar) {
        int i10 = f2999;
        int i11 = i10 + 23;
        f3002 = i11 % 128;
        char c10 = i11 % 2 != 0 ? G5.T : '_';
        je jeVar = sVar.f3004;
        if (c10 != '_') {
            int i12 = 58 / 0;
        }
        int i13 = i10 + 43;
        f3002 = i13 % 128;
        if ((i13 % 2 == 0 ? 'H' : (char) 0) != 0) {
            return jeVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public static /* synthetic */ void m2927(s sVar) {
        int i10 = f3002 + 77;
        f2999 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            sVar.m2964(false);
        } else {
            sVar.m2964(true);
        }
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private synchronized boolean m2928() {
        boolean z10;
        int i10 = f2999;
        int i11 = i10 + 77;
        f3002 = i11 % 128;
        int i12 = i11 % 2;
        z10 = this.f3021;
        int i13 = i10 + 35;
        f3002 = i13 % 128;
        if (i13 % 2 != 0) {
            throw null;
        }
        return z10;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private void m2931() {
        t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.s.2
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                for (ISAdQualityInitListener iSAdQualityInitListener : s.m2922(s.this)) {
                    if (iSAdQualityInitListener != null) {
                        iSAdQualityInitListener.adQualitySdkInitSuccess();
                    }
                }
                s.m2922(s.this).clear();
            }
        });
        int i10 = f3002 + 85;
        f2999 = i10 % 128;
        if ((i10 % 2 == 0 ? ']' : 'N') != ']') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private synchronized boolean m2933() {
        boolean z10;
        int i10 = f2999 + 73;
        int i11 = i10 % 128;
        f3002 = i11;
        int i12 = i10 % 2;
        z10 = this.f3018;
        int i13 = i11 + 121;
        f2999 = i13 % 128;
        int i14 = i13 % 2;
        return z10;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private synchronized ao m2936() {
        ao aoVar;
        int i10 = f3002 + 61;
        f2999 = i10 % 128;
        if (i10 % 2 == 0) {
            aoVar = this.f3022;
            int i11 = 5 / 0;
        } else {
            aoVar = this.f3022;
        }
        return aoVar;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private JSONObject m2938() {
        int i10 = f2999 + 21;
        f3002 = i10 % 128;
        if (i10 % 2 != 0) {
            m2936().m460();
            throw null;
        }
        Map<String, String> mapM460 = m2936().m460();
        if (mapM460 != null && mapM460.containsKey(m2970((char) ((Process.getThreadPriority(0) + 20) >> 6), 1032 - Gravity.getAbsoluteGravity(0, 0), TextUtils.indexOf("", "", 0, 0) + 13).intern())) {
            try {
                return IronSourceVideoBridge.jsonObjectInit(mapM460.get(m2970((char) TextUtils.getTrimmedLength(""), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1031, 12 - TextUtils.lastIndexOf("", '0', 0)).intern()));
            } catch (JSONException unused) {
            }
        }
        int i11 = f2999 + 69;
        f3002 = i11 % 128;
        if ((i11 % 2 != 0 ? '<' : '_') == '_') {
            return null;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static /* synthetic */ at m2939(s sVar) {
        int i10 = f3002;
        int i11 = i10 + 85;
        f2999 = i11 % 128;
        char c10 = i11 % 2 == 0 ? (char) 25 : '%';
        at atVar = sVar.f3010;
        if (c10 != '%') {
            throw null;
        }
        int i12 = i10 + 61;
        f2999 = i12 % 128;
        int i13 = i12 % 2;
        return atVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ at m2942(s sVar, at atVar) {
        int i10 = f3002;
        int i11 = i10 + 63;
        f2999 = i11 % 128;
        int i12 = i11 % 2;
        sVar.f3010 = atVar;
        int i13 = i10 + 111;
        f2999 = i13 % 128;
        if (i13 % 2 != 0) {
            return atVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ je m2950(s sVar, je jeVar) {
        int i10 = f2999 + 91;
        f3002 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        sVar.f3004 = jeVar;
        if (z10) {
            throw null;
        }
        return jeVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ iw m2958(s sVar, iw iwVar) {
        int i10 = f3002;
        int i11 = i10 + 101;
        f2999 = i11 % 128;
        int i12 = i11 % 2;
        sVar.f3009 = iwVar;
        int i13 = i10 + 21;
        f2999 = i13 % 128;
        int i14 = i13 % 2;
        return iwVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private synchronized void m2967(boolean z10) {
        int i10 = f2999 + 25;
        int i11 = i10 % 128;
        f3002 = i11;
        if ((i10 % 2 != 0 ? '[' : '\r') != '\r') {
            this.f3018 = z10;
            throw null;
        }
        this.f3018 = z10;
        int i12 = i11 + 97;
        f2999 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 15 : '0') != '0') {
            throw null;
        }
        throw th;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ an m2969(s sVar, an anVar) {
        int i10 = f3002;
        int i11 = i10 + 55;
        f2999 = i11 % 128;
        int i12 = i11 % 2;
        sVar.f3005 = anVar;
        int i13 = i10 + 39;
        f2999 = i13 % 128;
        if ((i13 % 2 == 0 ? '!' : (char) 24) == 24) {
            return anVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void initialize(Context context, String str, ISAdQualityConfig iSAdQualityConfig) {
        int i10 = f2999 + 45;
        int i11 = i10 % 128;
        f3002 = i11;
        int i12 = i10 % 2;
        if ((context instanceof Application ? (char) 28 : (char) 29) == 28) {
            int i13 = i11 + 35;
            f2999 = i13 % 128;
            char c10 = i13 % 2 == 0 ? 'c' : (char) 0;
            m2972((Application) context, str, iSAdQualityConfig);
            if (c10 != 0) {
                int i14 = 68 / 0;
                return;
            }
            return;
        }
        if (context != null && (context.getApplicationContext() instanceof Application)) {
            m2972((Application) context.getApplicationContext(), str, iSAdQualityConfig);
            return;
        }
        if ((context instanceof Activity ? 'S' : '@') != 'S') {
            String strIntern = m2970((char) (30239 - Drawable.resolveOpacity(0, 0)), ViewConfiguration.getTouchSlop() >> 8, (ViewConfiguration.getJumpTapTimeout() >> 16) + 74).intern();
            k.m2814(m2970((char) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 12436), 73 - ExpandableListView.getPackedPositionChild(0L), (KeyEvent.getMaxKeyCode() >> 16) + 12).intern(), strIntern);
            m2963(iSAdQualityConfig.getAdQualityInitListeners(), ISAdQualityInitError.EXCEPTION_ON_INIT, strIntern);
            int i15 = f2999 + 121;
            f3002 = i15 % 128;
            int i16 = i15 % 2;
            return;
        }
        int i17 = f3002 + 119;
        f2999 = i17 % 128;
        if (i17 % 2 != 0) {
            m2959((Activity) context, str, iSAdQualityConfig);
        } else {
            m2959((Activity) context, str, iSAdQualityConfig);
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void sendCustomMediationRevenue(ISAdQualityCustomMediationRevenue iSAdQualityCustomMediationRevenue) {
        int i10 = f3002 + 103;
        f2999 = i10 % 128;
        int i11 = i10 % 2;
        if ((m2978() ? (char) 1 : 'Z') == 1) {
            int i12 = f3002 + 53;
            f2999 = i12 % 128;
            int i13 = i12 % 2;
            k.m2814(m2970((char) ((ViewConfiguration.getScrollBarSize() >> 8) + 12436), View.MeasureSpec.getMode(0) + 74, 13 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern(), m2970((char) TextUtils.getCapsMode("", 0, 0), 1337 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 67).intern());
            return;
        }
        if (!(m2928())) {
            k.m2814(m2970((char) (12435 - ExpandableListView.getPackedPositionChild(0L)), TextUtils.indexOf("", "", 0, 0) + 74, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13).intern(), m2970((char) (36416 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 1404 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), TextUtils.getCapsMode("", 0, 0) + 73).intern());
            return;
        }
        this.f3007.m451(iSAdQualityCustomMediationRevenue);
        int i14 = f3002 + 57;
        f2999 = i14 % 128;
        int i15 = i14 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void setAdListener(ISAdQualityAdListener iSAdQualityAdListener) {
        int i10 = f3002 + 87;
        f2999 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            m2978();
            throw null;
        }
        if (!m2978()) {
            this.f3013 = iSAdQualityAdListener;
            return;
        }
        k.m2814(m2970((char) (12484 - AndroidCharacter.getMirror('0')), 74 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (Process.myPid() >> 22) + 12).intern(), m2970((char) (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1285, TextUtils.getCapsMode("", 0, 0) + 53).intern());
        int i11 = f3002 + 95;
        f2999 = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void setConfig(ISAdQualityConfig iSAdQualityConfig) {
        int i10 = f2999 + 95;
        f3002 = i10 % 128;
        int i11 = i10 % 2;
        if (!(!m2978())) {
            int i12 = f3002 + 71;
            f2999 = i12 % 128;
            int i13 = i12 % 2;
            k.m2814(m2970((char) (KeyEvent.keyCodeFromString("") + 12436), 74 - View.MeasureSpec.getMode(0), 12 - TextUtils.indexOf("", "")).intern(), m2970((char) (TextUtils.lastIndexOf("", '0', 0) + 23236), 1526 - View.getDefaultSize(0, 0), 48 - (Process.myTid() >> 22)).intern());
            return;
        }
        if (!(!m2925())) {
            k.m2814(m2970((char) (12436 - KeyEvent.keyCodeFromString("")), 74 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 13).intern(), m2970((char) Color.red(0), 1573 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 58).intern());
            return;
        }
        this.f3019 = iSAdQualityConfig;
        int i14 = f3002 + 21;
        f2999 = i14 % 128;
        if (i14 % 2 == 0) {
            int i15 = 22 / 0;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    public void setSegment(final ISAdQualitySegment iSAdQualitySegment) {
        int i10 = f2999 + 73;
        f3002 = i10 % 128;
        int i11 = i10 % 2;
        if (m2978()) {
            int i12 = f2999 + 55;
            f3002 = i12 % 128;
            int i13 = i12 % 2;
            k.m2814(m2970((char) (12436 - TextUtils.indexOf("", "")), TextUtils.indexOf("", "", 0) + 74, Gravity.getAbsoluteGravity(0, 0) + 12).intern(), m2970((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1476, (ViewConfiguration.getTouchSlop() >> 8) + 49).intern());
            return;
        }
        t.m2995(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.s.4

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f3048 = 1;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static long f3049 = -1054491529785472550L;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f3050;

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                if (!s.m2929(s.this)) {
                    int i14 = f3050 + 109;
                    f3048 = i14 % 128;
                    int i15 = i14 % 2;
                    k.m2814(m2985("覛쥥࠽䬾諗췱\u0c91䱓轻츺Đ䃸", (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 16602).intern(), m2985("覙琌狚烘署絩篣禾搖投悏潢洩毼榽名勞僝弩嵯察妊䐡䋏䂣佰䴭䯻䦷㐕㋑ビ㽩㴉㯟㧿␏⋚⃐⽕ⴭ⯡⧼ᐎዀ႘ὌᴪᯫᦱЍ˕\u0093ཝ൮", 64951 - TextUtils.getOffsetBefore("", 0)).intern());
                    return;
                }
                if ((s.m2923(s.this) != null ? (char) 26 : '`') != '`') {
                    s.m2923(s.this).m456(iSAdQualitySegment);
                }
                int i16 = f3050 + 49;
                f3048 = i16 % 128;
                int i17 = i16 % 2;
            }

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static String m2985(String str, int i14) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (f.f2019) {
                    f.f2017 = i14;
                    char[] cArr2 = new char[cArr.length];
                    f.f2018 = 0;
                    while (true) {
                        int i15 = f.f2018;
                        if (i15 < cArr.length) {
                            cArr2[i15] = (char) (((long) (cArr[i15] ^ (f.f2017 * i15))) ^ f3049);
                            f.f2018++;
                        } else {
                            str2 = new String(cArr2);
                        }
                    }
                }
                return str2;
            }
        });
        int i14 = f3002 + 119;
        f2999 = i14 % 128;
        if ((i14 % 2 == 0 ? '_' : (char) 27) == 27) {
        } else {
            throw null;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.IronSourceAdQuality
    @Deprecated
    public void setUserConsent(boolean z10) {
        int i10 = f2999 + 75;
        f3002 = i10 % 128;
        if ((i10 % 2 != 0 ? '\t' : ')') == ')') {
            m2936().m472(z10);
        } else {
            m2936().m472(z10);
            int i11 = 87 / 0;
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public final synchronized at m2977() {
        at atVar;
        int i10 = f2999 + 53;
        int i11 = i10 % 128;
        f3002 = i11;
        int i12 = i10 % 2;
        atVar = this.f3010;
        int i13 = i11 + 103;
        f2999 = i13 % 128;
        int i14 = i13 % 2;
        return atVar;
    }

    static {
        boolean z10;
        m2940();
        f3003 = null;
        int i10 = f2999 + 31;
        f3002 = i10 % 128;
        if (i10 % 2 != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
        } else {
            throw null;
        }
    }

    private s() {
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ iw m2943(s sVar) {
        int i10 = f2999;
        int i11 = i10 + 81;
        f3002 = i11 % 128;
        int i12 = i11 % 2;
        iw iwVar = sVar.f3009;
        int i13 = i10 + 51;
        f3002 = i13 % 128;
        if ((i13 % 2 != 0 ? 'Z' : 'a') == 'a') {
            return iwVar;
        }
        int i14 = 72 / 0;
        return iwVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m2954(s sVar, Context context) {
        int i10 = f3002 + 101;
        f2999 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        sVar.m2945(context);
        if (z10) {
            throw null;
        }
        int i11 = f2999 + 95;
        f3002 = i11 % 128;
        if (i11 % 2 == 0) {
            return;
        }
        int i12 = 23 / 0;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m2960(s sVar) {
        int i10 = f3002 + 73;
        f2999 = i10 % 128;
        int i11 = i10 % 2;
        sVar.m2974(true);
        int i12 = f2999 + 77;
        f3002 = i12 % 128;
        if (i12 % 2 == 0) {
            return;
        }
        int i13 = 34 / 0;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ boolean m2976(s sVar) {
        int i10 = f2999 + 57;
        f3002 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM2933 = sVar.m2933();
        int i12 = f3002 + 9;
        f2999 = i12 % 128;
        int i13 = i12 % 2;
        return zM2933;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized ISAdQualityLogLevel m2980() {
        ISAdQualityLogLevel iSAdQualityLogLevel;
        int i10 = f2999 + 117;
        f3002 = i10 % 128;
        if ((i10 % 2 != 0 ? '%' : 'G') != 'G') {
            iSAdQualityLogLevel = this.f3015;
            int i11 = 82 / 0;
        } else {
            iSAdQualityLogLevel = this.f3015;
        }
        return iSAdQualityLogLevel;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ iz m2944(s sVar, iz izVar) {
        int i10 = f2999 + 95;
        int i11 = i10 % 128;
        f3002 = i11;
        char c10 = i10 % 2 != 0 ? '<' : 'X';
        sVar.f3006 = izVar;
        if (c10 != 'X') {
            throw null;
        }
        int i12 = i11 + 59;
        f2999 = i12 % 128;
        if ((i12 % 2 == 0 ? '(' : '5') != '(') {
            return izVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m2955(s sVar, ISAdQualityInitError iSAdQualityInitError, String str) {
        int i10 = f3002 + 101;
        f2999 = i10 % 128;
        int i11 = i10 % 2;
        sVar.m2973(iSAdQualityInitError, str);
        int i12 = f3002 + 23;
        f2999 = i12 % 128;
        if ((i12 % 2 == 0 ? '*' : '-') != '*') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m2961(s sVar, Context context) {
        int i10 = f2999 + 99;
        f3002 = i10 % 128;
        int i11 = i10 % 2;
        sVar.m2952(context);
        int i12 = f2999 + 43;
        f3002 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m2972(Application application, String str, ISAdQualityConfig iSAdQualityConfig) {
        int i10 = f3002 + 79;
        f2999 = i10 % 128;
        char c10 = i10 % 2 == 0 ? (char) 11 : '*';
        m2971(application, null, str, iSAdQualityConfig);
        if (c10 == 11) {
            int i11 = 75 / 0;
        }
        int i12 = f3002 + 89;
        f2999 = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ void m2947(s sVar, boolean z10) {
        int i10 = f3002 + 37;
        f2999 = i10 % 128;
        int i11 = i10 % 2;
        sVar.m2967(z10);
        int i12 = f2999 + 3;
        f3002 = i12 % 128;
        if (i12 % 2 == 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ void m2956(s sVar, ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i10 = f2999 + 117;
        f3002 = i10 % 128;
        int i11 = i10 % 2;
        sVar.m2946(iSAdQualityLogLevel);
        int i12 = f3002 + 25;
        f2999 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m2962(s sVar, Context context, String str) {
        int i10 = f2999 + 31;
        f3002 = i10 % 128;
        int i11 = i10 % 2;
        sVar.m2953(context, str, true, false, true);
        int i12 = f2999 + 5;
        f3002 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m2971(Application application, Activity activity, String str, @Nullable ISAdQualityConfig iSAdQualityConfig) {
        String strIntern = m2970((char) ((ViewConfiguration.getTapTimeout() >> 16) + 12436), (ViewConfiguration.getLongPressTimeout() >> 16) + 74, (ViewConfiguration.getScrollBarSize() >> 8) + 12).intern();
        if (iSAdQualityConfig == null) {
            iSAdQualityConfig = new ISAdQualityConfig.Builder().build();
        }
        if (bc.m795().isEmpty()) {
            String strIntern2 = m2970((char) (ViewConfiguration.getJumpTapTimeout() >> 16), Color.green(0) + 86, ((byte) KeyEvent.getModifierMetaStateMask()) + 58).intern();
            k.m2825(strIntern, strIntern2);
            m2963(iSAdQualityConfig.getAdQualityInitListeners(), ISAdQualityInitError.NO_AD_NETWORKS, strIntern2);
            return;
        }
        if (!m2975(iSAdQualityConfig)) {
            int i10 = f3002 + 15;
            f2999 = i10 % 128;
            int i11 = i10 % 2;
            iSAdQualityConfig = ISAdQualityConfig.merge(this.f3019, iSAdQualityConfig);
        }
        ISAdQualityConfig iSAdQualityConfig2 = iSAdQualityConfig;
        if ((m2925() ? 'I' : (char) 11) != 11) {
            String strIntern3 = m2970((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 143 - Gravity.getAbsoluteGravity(0, 0), 40 - TextUtils.getOffsetBefore("", 0)).intern();
            k.m2825(strIntern, strIntern3);
            m2963(iSAdQualityConfig2.getAdQualityInitListeners(), ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED, strIntern3);
            return;
        }
        if (m2928()) {
            String strIntern4 = m2970((char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 12940), (Process.myPid() >> 22) + 183, 'k' - AndroidCharacter.getMirror('0')).intern();
            k.m2825(strIntern, strIntern4);
            m2963(iSAdQualityConfig2.getAdQualityInitListeners(), ISAdQualityInitError.AD_QUALITY_ALREADY_INITIALIZED, strIntern4);
            return;
        }
        if (m2978()) {
            String strIntern5 = m2970((char) Color.argb(0, 0, 0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 242, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 48).intern();
            k.m2814(strIntern, strIntern5);
            m2963(iSAdQualityConfig2.getAdQualityInitListeners(), ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN, strIntern5);
            return;
        }
        if (TextUtils.isEmpty(iSAdQualityConfig2.getUserId())) {
            if ((iSAdQualityConfig2.isUserIdSet() ? (char) 20 : '7') == 20) {
                int i12 = f3002 + 65;
                f2999 = i12 % 128;
                int i13 = i12 % 2;
                String strIntern6 = m2970((char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getEdgeSlop() >> 16) + 290, 60 - TextUtils.indexOf("", "")).intern();
                k.m2814(strIntern, strIntern6);
                m2963(iSAdQualityConfig2.getAdQualityInitListeners(), ISAdQualityInitError.ILLEGAL_USER_ID, strIntern6);
                return;
            }
        }
        if ((TextUtils.isEmpty(str) ? 'Q' : '\r') != '\r') {
            int i14 = f2999 + 45;
            f3002 = i14 % 128;
            int i15 = i14 % 2;
            String strIntern7 = m2970((char) (TextUtils.getCapsMode("", 0, 0) + 23578), 350 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), 48 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern();
            k.m2814(strIntern, strIntern7);
            m2963(iSAdQualityConfig2.getAdQualityInitListeners(), ISAdQualityInitError.ILLEGAL_APP_KEY, strIntern7);
            int i16 = f2999 + 67;
            f3002 = i16 % 128;
            if ((i16 % 2 != 0 ? (char) 27 : (char) 30) != 30) {
                int i17 = 84 / 0;
                return;
            }
            return;
        }
        this.f3008.addAll(iSAdQualityConfig2.getAdQualityInitListeners());
        m2948(true);
        jj.m2676().mo2682(application, activity);
        jd.m2615().m2624();
        jf.m2656().m2662();
        t.m2995(new AnonymousClass5(iSAdQualityConfig2, str, application, activity));
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static s m2951() {
        synchronized (s.class) {
            if (f3003 == null) {
                f3003 = new s();
            }
        }
        return f3003;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m2959(Activity activity, String str, ISAdQualityConfig iSAdQualityConfig) {
        int i10 = f2999 + 17;
        f3002 = i10 % 128;
        int i11 = i10 % 2;
        m2971(activity.getApplication(), activity, str, iSAdQualityConfig);
        int i12 = f3002 + 51;
        f2999 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized boolean m2978() {
        boolean z10;
        int i10 = f2999 + 89;
        f3002 = i10 % 128;
        if ((i10 % 2 != 0 ? ';' : '\"') != ';') {
            z10 = this.f3017;
        } else {
            z10 = this.f3017;
            int i11 = 80 / 0;
        }
        return z10;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private void m2945(Context context) {
        int i10 = f3002 + 43;
        f2999 = i10 % 128;
        int i11 = i10 % 2;
        String strM2637 = this.f3004.m2637(m2970((char) (32247 - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getTapTimeout() >> 16) + IronSourceError.ERROR_NT_LOAD_FAILED_NO_CANDIDATES, TextUtils.lastIndexOf("", '0', 0, 0) + 11).intern());
        if (!TextUtils.isEmpty(strM2637)) {
            new je(context, m2970((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + IronSourceError.ERROR_DO_RV_LOAD_DURING_SHOW, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 25).intern(), m2970((char) (17560 - (ViewConfiguration.getLongPressTimeout() >> 16)), (ViewConfiguration.getScrollBarSize() >> 8) + 1080, 23 - ImageFormat.getBitsPerPixel(0)).intern()).m2638(m2970((char) (32247 - TextUtils.indexOf("", "")), 1045 - Gravity.getAbsoluteGravity(0, 0), 11 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern(), strM2637);
            this.f3004.m2634(m2970((char) (Gravity.getAbsoluteGravity(0, 0) + 32247), 1045 - (ViewConfiguration.getLongPressTimeout() >> 16), 10 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern());
        }
        int i12 = f3002 + 121;
        f2999 = i12 % 128;
        if (i12 % 2 != 0) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean m2965(String str) {
        if ((m2978() ? '^' : '\b') != '^') {
            if (!m2928()) {
                k.m2814(m2970((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 12436), 74 - (KeyEvent.getMaxKeyCode() >> 16), 11 - ImageFormat.getBitsPerPixel(0)).intern(), m2970((char) KeyEvent.keyCodeFromString(""), 672 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.getOffsetBefore("", 0) + 65).intern());
                int i10 = f2999 + 83;
                f3002 = i10 % 128;
                if (i10 % 2 == 0) {
                    return false;
                }
                int i11 = 40 / 0;
                return false;
            }
            if (!(TextUtils.isEmpty(str))) {
                return true;
            }
            k.m2814(m2970((char) (12436 - Color.green(0)), MotionEvent.axisFromString("") + 75, 12 - View.combineMeasuredStates(0, 0)).intern(), m2970((char) (Process.myPid() >> 22), 737 - TextUtils.lastIndexOf("", '0', 0), 33 - ((byte) KeyEvent.getModifierMetaStateMask())).intern());
            return false;
        }
        k.m2814(m2970((char) (KeyEvent.keyCodeFromString("") + 12436), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 74, 12 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), m2970((char) (TextUtils.getOffsetAfter("", 0) + 51589), 621 - (ViewConfiguration.getScrollBarSize() >> 8), 52 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern());
        int i12 = f2999 + 53;
        f3002 = i12 % 128;
        int i13 = i12 % 2;
        return false;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2953(Context context, String str, boolean z10, boolean z11, boolean z12) {
        String strM467 = m2936().m467();
        m2936().m462(str);
        if (!(str != null)) {
            int i10 = f2999 + 117;
            f3002 = i10 % 128;
            int i11 = i10 % 2;
            k.m2814(m2970((char) (TextUtils.indexOf("", "", 0, 0) + 12436), 73 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getTouchSlop() >> 8) + 12).intern(), m2970((char) (48646 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 772, TextUtils.getCapsMode("", 0, 0) + 93).intern());
        } else if (str.equals(m2970((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), Process.getGidForName("") + 866, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 17).intern())) {
            String strIntern = m2970((char) (12436 - (ViewConfiguration.getScrollBarSize() >> 8)), 74 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 12).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2970((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 882, 40 - ((Process.getThreadPriority(0) + 20) >> 6)).intern());
            sb2.append(str);
            sb2.append(m2970((char) (KeyEvent.normalizeMetaState(0) + 40415), KeyEvent.getDeadChar(0, 0) + 922, (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 76).intern());
            k.m2814(strIntern, sb2.toString());
        } else {
            String strIntern2 = m2970((char) (12436 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 74, 12 - ExpandableListView.getPackedPositionType(0L)).intern();
            StringBuilder sb3 = new StringBuilder();
            sb3.append(m2970((char) (KeyEvent.normalizeMetaState(0) + 64281), 999 - (ViewConfiguration.getPressedStateDuration() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 33).intern());
            sb3.append(str);
            k.m2821(strIntern2, sb3.toString());
            int i12 = f2999 + 39;
            f3002 = i12 % 128;
            int i13 = i12 % 2;
        }
        ar.m483().mo507(new AnonymousClass1(z10, context, z11, strM467, z12));
        JSONObject jSONObjectM2938 = m2938();
        if (jSONObjectM2938 != null) {
            int i14 = f2999 + 67;
            f3002 = i14 % 128;
            int i15 = i14 % 2;
            ar.m483().mo515(jSONObjectM2938);
            return;
        }
        ar.m483().mo506(context, m2936(), true);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private synchronized void m2946(ISAdQualityLogLevel iSAdQualityLogLevel) {
        int i10 = f2999 + 91;
        f3002 = i10 % 128;
        if (!(i10 % 2 == 0)) {
            this.f3015 = iSAdQualityLogLevel;
            throw null;
        }
        this.f3015 = iSAdQualityLogLevel;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private synchronized void m2948(boolean z10) {
        int i10 = f2999 + 35;
        f3002 = i10 % 128;
        if ((i10 % 2 != 0 ? 'F' : (char) 16) != 'F') {
            this.f3020 = z10;
        } else {
            this.f3020 = z10;
            int i11 = 2 / 0;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized boolean m2979() {
        boolean z10;
        int i10 = f2999;
        int i11 = i10 + 45;
        f3002 = i11 % 128;
        if (!(i11 % 2 == 0)) {
            throw null;
        }
        z10 = this.f3016;
        int i12 = i10 + 37;
        f3002 = i12 % 128;
        if ((i12 % 2 != 0 ? 'S' : '\b') != '\b') {
            throw null;
        }
        throw th;
        return z10;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private synchronized void m2964(boolean z10) {
        int i10 = f2999 + 31;
        f3002 = i10 % 128;
        if (i10 % 2 != 0) {
        }
        this.f3021 = true;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private void m2963(final Set<ISAdQualityInitListener> set, final ISAdQualityInitError iSAdQualityInitError, final String str) {
        t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.s.6
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                for (ISAdQualityInitListener iSAdQualityInitListener : set) {
                    if (iSAdQualityInitListener != null) {
                        iSAdQualityInitListener.adQualitySdkInitFailed(iSAdQualityInitError, str);
                    }
                }
                set.clear();
            }
        });
        int i10 = f2999 + 55;
        f3002 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 14 : '\"') != '\"') {
            int i11 = 44 / 0;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2952(Context context) {
        try {
            context.registerReceiver(new BroadcastReceiver() { // from class: com.ironsource.adqualitysdk.sdk.i.s.3
                @Override // android.content.BroadcastReceiver
                public final void onReceive(Context context2, Intent intent) {
                    jw.m2763(intent);
                }
            }, new IntentFilter(m2970((char) (1363 - (Process.myPid() >> 22)), 1212 - (ViewConfiguration.getScrollBarSize() >> 8), 38 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern()), null, t.m2990());
            int i10 = f3002 + 17;
            f2999 = i10 % 128;
            int i11 = i10 % 2;
        } catch (Throwable th2) {
            k.m2816(m2970((char) (12435 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), View.MeasureSpec.makeMeasureSpec(0, 0) + 74, 13 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), m2970((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 40086), 1249 - (ViewConfiguration.getTouchSlop() >> 8), 34 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), th2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x01e6 A[Catch: all -> 0x0270, Exception -> 0x0272, TryCatch #2 {Exception -> 0x0272, blocks: (B:4:0x0008, B:6:0x000e, B:9:0x0057, B:11:0x005d, B:14:0x00a4, B:16:0x00c8, B:17:0x00f8, B:29:0x0117, B:34:0x0173, B:35:0x0195, B:37:0x01e6, B:38:0x0217, B:30:0x0139, B:31:0x0152, B:32:0x0157), top: B:52:0x0008, outer: #0 }] */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private synchronized void m2974(boolean z10) {
        String strM2970;
        String strIntern;
        String strMo511;
        try {
            if (m2978()) {
                k.m2814(m2970((char) (12436 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 74 - (ViewConfiguration.getPressedStateDuration() >> 16), Process.getGidForName("") + 13).intern(), m2970((char) (16440 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 399 - (ViewConfiguration.getPressedStateDuration() >> 16), 36 - TextUtils.indexOf("", "", 0)).intern());
                return;
            }
            if (!m2928()) {
                k.m2814(m2970((char) ((Process.myPid() >> 22) + 12436), (ViewConfiguration.getLongPressTimeout() >> 16) + 74, TextUtils.getOffsetAfter("", 0) + 12).intern(), m2970((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 435, 59 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern());
                return;
            }
            String strIntern2 = m2970((char) (TextUtils.indexOf("", "") + 27631), 493 - MotionEvent.axisFromString(""), View.getDefaultSize(0, 0) + 28).intern();
            if (z10) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(strIntern2);
                sb2.append(m2970((char) (8967 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))), (ViewConfiguration.getWindowTouchSlop() >> 8) + 522, 24 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern());
                strIntern2 = sb2.toString();
            }
            JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
            try {
                if (z10) {
                    int i10 = f3002 + 51;
                    f2999 = i10 % 128;
                    if ((i10 % 2 == 0 ? (char) 18 : '_') != '_') {
                        strIntern = m2970((char) View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 1L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 1L ? 0 : -1)) * 16100, 3 - TextUtils.indexOf((CharSequence) "", '(', 0, 0)).intern();
                    } else {
                        strM2970 = m2970((char) View.MeasureSpec.makeMeasureSpec(0, 0), 547 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 5 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    }
                    jSONObjectJsonObjectInit.put(m2970((char) (24684 - Color.argb(0, 0, 0, 0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 555, 1 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), strIntern);
                    this.f3012.m368(m2970((char) (KeyEvent.getMaxKeyCode() >> 16), 556 - (ViewConfiguration.getDoubleTapTimeout() >> 16), ExpandableListView.getPackedPositionChild(0L) + 6).intern(), jSONObjectJsonObjectInit);
                    strMo511 = ar.m483().mo511(m2970((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 41298), 561 - Color.alpha(0), MotionEvent.axisFromString("") + 7).intern());
                    if (!TextUtils.isEmpty(strMo511)) {
                        StringBuilder sb3 = new StringBuilder();
                        sb3.append(strIntern2);
                        sb3.append(m2970((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 25463), ExpandableListView.getPackedPositionType(0L) + 567, 15 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
                        sb3.append(strMo511);
                        strIntern2 = sb3.toString();
                    }
                    k.m2825(m2970((char) (12436 - (ViewConfiguration.getScrollBarSize() >> 8)), 74 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12).intern(), strIntern2);
                    m2973(ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN, strIntern2);
                    this.f3017 = true;
                    ar.m483().mo491();
                    ij.m2497(this.f3014).m2503();
                    this.f3010.m632();
                    this.f3009.m2541();
                    this.f3012.m371();
                    hu.m2350();
                    int i11 = f2999 + 119;
                    f3002 = i11 % 128;
                    int i12 = i11 % 2;
                }
                strM2970 = m2970((char) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getWindowTouchSlop() >> 8) + 552, 3 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                jSONObjectJsonObjectInit.put(m2970((char) (24684 - Color.argb(0, 0, 0, 0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 555, 1 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), strIntern);
            } catch (JSONException unused) {
            }
            strIntern = strM2970.intern();
            this.f3012.m368(m2970((char) (KeyEvent.getMaxKeyCode() >> 16), 556 - (ViewConfiguration.getDoubleTapTimeout() >> 16), ExpandableListView.getPackedPositionChild(0L) + 6).intern(), jSONObjectJsonObjectInit);
            strMo511 = ar.m483().mo511(m2970((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 41298), 561 - Color.alpha(0), MotionEvent.axisFromString("") + 7).intern());
            if (!TextUtils.isEmpty(strMo511)) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(strIntern2);
                sb4.append(m2970((char) ((TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 25463), ExpandableListView.getPackedPositionType(0L) + 567, 15 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))).intern());
                sb4.append(strMo511);
                strIntern2 = sb4.toString();
            }
            k.m2825(m2970((char) (12436 - (ViewConfiguration.getScrollBarSize() >> 8)), 74 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12).intern(), strIntern2);
            m2973(ISAdQualityInitError.AD_QUALITY_SDK_WAS_SHUTDOWN, strIntern2);
            this.f3017 = true;
            ar.m483().mo491();
            ij.m2497(this.f3014).m2503();
            this.f3010.m632();
            this.f3009.m2541();
            this.f3012.m371();
            hu.m2350();
            int i13 = f2999 + 119;
            f3002 = i13 % 128;
            int i14 = i13 % 2;
        } catch (Exception e10) {
            kd.m2880(m2970((char) (12436 - View.MeasureSpec.getMode(0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 75, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 12).intern(), m2970((char) (Gravity.getAbsoluteGravity(0, 0) + 23242), TextUtils.indexOf("", "", 0) + 581, 18 - TextUtils.lastIndexOf("", '0', 0)).intern(), e10, true, false, true);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m2981() {
        int i10 = f3002 + 27;
        f2999 = i10 % 128;
        if ((i10 % 2 == 0 ? '&' : ',') != '&') {
            if (!(!m2978())) {
                k.m2814(m2970((char) (12436 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 74, 13 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern(), m2970((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), Color.blue(0) + 1104, (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 60).intern());
                return;
            }
            if (!m2928()) {
                this.f3016 = true;
                return;
            }
            int i11 = f2999 + 117;
            f3002 = i11 % 128;
            int i12 = i11 % 2;
            k.m2814(m2970((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 12436), 74 - View.getDefaultSize(0, 0), 12 - (Process.myPid() >> 22)).intern(), m2970((char) (KeyEvent.getMaxKeyCode() >> 16), View.MeasureSpec.makeMeasureSpec(0, 0) + com.ironsource.mediationsdk.demandOnly.e.a.f29696j, 49 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))).intern());
            int i13 = f3002 + 5;
            f2999 = i13 % 128;
            int i14 = i13 % 2;
            return;
        }
        m2978();
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m2973(ISAdQualityInitError iSAdQualityInitError, String str) {
        int i10 = f3002 + 61;
        f2999 = i10 % 128;
        int i11 = i10 % 2;
        m2963(this.f3008, iSAdQualityInitError, str);
        int i12 = f2999 + 125;
        f3002 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private boolean m2975(ISAdQualityConfig iSAdQualityConfig) {
        if (this.f3019 == null) {
            int i10 = f2999 + 39;
            f3002 = i10 % 128;
            return !(i10 % 2 != 0);
        }
        try {
            String str = iSAdQualityConfig.getMetaData().get(m2970((char) (Process.getGidForName("") + 1), 1032 - TextUtils.getOffsetBefore("", 0), 13 - KeyEvent.getDeadChar(0, 0)).intern());
            if (!TextUtils.isEmpty(str)) {
                return IronSourceVideoBridge.jsonObjectInit(str).optBoolean(m2970((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 50909), TextUtils.indexOf("", "") + 1632, 22 - (ViewConfiguration.getEdgeSlop() >> 16)).intern());
            }
            int i11 = f2999 + 45;
            f3002 = i11 % 128;
            int i12 = i11 % 2;
        } catch (Throwable unused) {
        }
        int i13 = f3002 + 115;
        f2999 = i13 % 128;
        int i14 = i13 % 2;
        return false;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2970(char c10, int i10, int i11) {
        String str;
        synchronized (d.f1653) {
            char[] cArr = new char[i11];
            d.f1652 = 0;
            while (true) {
                int i12 = d.f1652;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f3001[i10 + i12]) ^ (((long) i12) * f3000)) ^ ((long) c10));
                    d.f1652 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }
}
