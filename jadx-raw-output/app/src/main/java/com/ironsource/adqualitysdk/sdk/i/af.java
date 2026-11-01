package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.exifinterface.media.ExifInterface;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class af {

    /* JADX INFO: renamed from: 乁, reason: contains not printable characters */
    private static int f142 = 1;

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private static int f144;

    /* JADX INFO: renamed from: 爫, reason: contains not printable characters */
    private String f146;

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    private q f147;

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private Context f148;

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private ae f149;

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private iu f150;

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private jo f151;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private boolean f153;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private Handler f154;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private boolean f155;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private iw f158;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private ja f159;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private al f160;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean f161;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private ah f162;

    /* JADX INFO: renamed from: טּ, reason: contains not printable characters */
    private static int[] f143 = {-1469469176, -974809611, -2002033642, 666463242, -211924936, 80851235, 1695927819, -277586470, 1209384732, -2064262749, 671764510, 1304361333, 73267262, -2075817937, -1343380381, 1170773375, -1004242352, 1285275974};

    /* JADX INFO: renamed from: ףּ, reason: contains not printable characters */
    private static char[] f145 = {'9', 'k', 'f', 'n', 'v', 'r', 'f', 'g', 'g', 'J', '0', 'P', 'l', 'k', 'j', 'd', 'l', 'P', 'G', 'f', 'l', 'n', 'o', 'q', '\"', '[', 'r', 'p', 'p', 'I', 'D', 'k', 'G', 'G', 'n', 'W', 'X', 'p', 'b', 'a', 'X', 'Q', 'b', 'g', 'i', 'l', 'p', 'r', 'q', 'i', '9', 'm', 'f', 'k', 'o', 'R', 186, 209, 207, 207, 168, 159, 193, 195, 197, 202, 201, 162, 161, 202, 209, 207, 207, 168, 165, 200, 203, 210, 201, 195, 197, 185, 200, 201};

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private List<ag> f157 = new ArrayList();

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private List<je.d> f156 = new ArrayList();

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private Thread.UncaughtExceptionHandler f152 = Thread.getDefaultUncaughtExceptionHandler();

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.af$2, reason: invalid class name */
    public class AnonymousClass2 implements iy, ja.a {
        @Override // com.ironsource.adqualitysdk.sdk.i.iy
        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final void mo387(iq iqVar) {
            af.m334(af.this);
            af.m359(af.this);
        }

        public AnonymousClass2() {
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ja.a
        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        public final void mo389(List<jb> list) {
            if (list != null) {
                try {
                    if (!list.isEmpty()) {
                        PriorityQueue priorityQueue = new PriorityQueue();
                        Iterator<jb> it = list.iterator();
                        while (it.hasNext()) {
                            priorityQueue.add(new ai(it.next()));
                        }
                        ArrayList arrayList = new ArrayList();
                        for (ai aiVar = (ai) priorityQueue.poll(); aiVar != null; aiVar = (ai) priorityQueue.poll()) {
                            if (af.m349(af.this, aiVar)) {
                                if (TextUtils.isEmpty(aiVar.m420())) {
                                    aiVar.m419(af.m321(af.this).m2714().m467());
                                }
                                arrayList.add(aiVar);
                            } else {
                                af.m325(af.this).m2591(aiVar.m421());
                            }
                        }
                        if (arrayList.isEmpty()) {
                            return;
                        }
                        af.m352(af.this, arrayList, this);
                        return;
                    }
                } catch (Exception unused) {
                    af.m334(af.this);
                    return;
                }
            }
            af.m334(af.this);
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.iy
        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final void mo388(iq iqVar, String str) {
            af.m334(af.this);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.adqualitysdk.sdk.i.af$3, reason: invalid class name */
    public class AnonymousClass3 implements ah.a {

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        public final /* synthetic */ iy f190;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        public final /* synthetic */ JSONArray f192;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        public final /* synthetic */ List f193;

        public AnonymousClass3(JSONArray jSONArray, List list, iy iyVar) {
            this.f192 = jSONArray;
            this.f193 = list;
            this.f190 = iyVar;
        }

        @Override // com.ironsource.adqualitysdk.sdk.i.ah.a
        public void onEventGenerated(JSONObject jSONObject) {
            af.m354(af.this).m315(jSONObject);
            af.m318(af.this).m2540(af.m329(af.this).m439(af.m324(af.this)), jSONObject, new iy() { // from class: com.ironsource.adqualitysdk.sdk.i.af.3.5

                /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                private static int f194 = 1;

                /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                private static int f195 = 0;

                /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                private static short[] f196 = null;

                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                private static int f197 = -1825032449;

                /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                private static byte[] f198 = {-36, 54, 57, 55, -63, -57, 63, ExifInterface.MARKER_APP1, -68, 23, 24, -2, 32, -16, -25, 24, -29, 66, -65, 18, 24, 87, -86, -29, 20, -18, -18, -20, 31, -30, 67, -68, 17, 31, 19, 17, -1, 19, 66, -82, 80, -67, 20, 57, 104, 91, 124, -117, 113, 113, 115, -128, 125, -36, 34, -117, -90, -87, 124, 52, -120, -121, 97, -65, 111, 120, -121, 124, -35, 54, 122, -123, 124, ExifInterface.MARKER_EOI, 55, 119, 113, 115, 117, ExifInterface.MARKER_EOI, 34, -120, -121, 96, ExifInterface.MARKER_EOI, 55, 119, -117, -113, 122, -127, 118, 112, -110, 0, 0, 0, 0};

                /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                private static int f199 = 70;

                /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                private static int f200 = -1800214918;

                @Override // com.ironsource.adqualitysdk.sdk.i.iy
                /* JADX INFO: renamed from: ﻐ */
                public final void mo387(final iq iqVar) {
                    final int iM2517 = iqVar.m2514().m2517();
                    final String strM2518 = iqVar.m2514().m2518();
                    boolean z10 = false;
                    if (iM2517 >= 200 && iM2517 <= 299) {
                        k.m2811(m390(1800214917 - TextUtils.lastIndexOf("", '0', 0, 0), (short) TextUtils.getCapsMode("", 0, 0), TextUtils.getCapsMode("", 0, 0) + 1825032514, (byte) (TextUtils.getOffsetBefore("", 0) - 52), (-61) - Color.green(0)).intern(), m390(ExpandableListView.getPackedPositionType(0L) + 1800214926, (short) View.combineMeasuredStates(0, 0), 1825032520 - ExpandableListView.getPackedPositionGroup(0L), (byte) (16 - TextUtils.lastIndexOf("", '0', 0, 0)), (-33) - (Process.myTid() >> 22)).intern(), AnonymousClass3.this.f192);
                        z10 = true;
                    } else if (iM2517 == 403) {
                        synchronized (af.this) {
                            for (final je.d dVar : af.m327(af.this)) {
                                t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.3.5.2
                                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                                    /* JADX INFO: renamed from: ﾒ */
                                    public final void mo276() {
                                        dVar.mo2643();
                                    }
                                });
                            }
                        }
                    } else {
                        String strIntern = m390((ViewConfiguration.getWindowTouchSlop() >> 8) + 1800214918, (short) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 1825032514, (byte) (View.MeasureSpec.getSize(0) - 52), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 61).intern();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m390(1800214962 - TextUtils.getOffsetAfter("", 0), (short) View.getDefaultSize(0, 0), 1825032532 - (ViewConfiguration.getEdgeSlop() >> 16), (byte) ((-114) - (Process.myPid() >> 22)), TextUtils.indexOf("", "", 0) - 19).intern());
                        sb2.append(iM2517);
                        sb2.append(m390((ViewConfiguration.getKeyRepeatDelay() >> 16) + 1800215012, (short) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 1825032480 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 53), (-69) - KeyEvent.normalizeMetaState(0)).intern());
                        sb2.append(strM2518);
                        k.m2825(strIntern, sb2.toString());
                    }
                    if (!z10) {
                        t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.3.5.4

                            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                            private static boolean f206 = true;

                            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                            private static int f207 = 87;

                            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                            private static int f208 = 0;

                            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
                            private static int f209 = 1;

                            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
                            private static boolean f210 = true;

                            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                            private static char[] f211 = {170, 198, 196, 188, 203, 191, 192, 197, 190, 'w', 206, 201, 202, 187, 156, 205, 133, 158, 199, 145};

                            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                            private static String m391(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                                    char[] cArr2 = f211;
                                    int i11 = f207;
                                    if (f210) {
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
                                    if (f206) {
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
                                iy iyVar = AnonymousClass3.this.f190;
                                iq iqVar2 = iqVar;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append(m391(null, TextUtils.indexOf("", "", 0, 0) + 127, null, "\u008a\u0094\u0084\u008d\u0088\u0082\u0093\u008d\u0084\u008c\u008a\u0085\u0082\u0092\u008a\u0091\u0085\u0088\u0084\u0090\u008f\u008e\u0088\u0084\u008d\u008a\u0086\u0085\u0087\u008b\u008a\u0089\u0088\u0082\u008c\u008b\u008a\u0085\u0088\u0084\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern());
                                sb3.append(iM2517);
                                sb3.append(m391(null, 127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), null, "\u008a").intern());
                                sb3.append(strM2518);
                                iyVar.mo388(iqVar2, sb3.toString());
                                int i10 = f208 + 15;
                                f209 = i10 % 128;
                                int i11 = i10 % 2;
                            }
                        });
                        return;
                    }
                    Iterator it = AnonymousClass3.this.f193.iterator();
                    while (it.hasNext()) {
                        af.m325(af.this).m2591(((ai) it.next()).m421());
                    }
                    t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.3.5.5
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            AnonymousClass3.this.f190.mo387(iqVar);
                        }
                    });
                }

                /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                private static String m390(int i10, short s10, int i11, byte b10, int i12) {
                    String string;
                    synchronized (o.f2993) {
                        StringBuilder sb2 = new StringBuilder();
                        int i13 = f199;
                        int i14 = i12 + i13;
                        boolean z10 = i14 == -1;
                        if (z10) {
                            byte[] bArr = f198;
                            i14 = bArr != null ? (byte) (bArr[f200 + i10] + i13) : (short) (f196[f200 + i10] + i13);
                        }
                        if (i14 > 0) {
                            o.f2994 = ((i10 + i14) - 2) + f200 + (z10 ? 1 : 0);
                            o.f2995 = b10;
                            char c10 = (char) (i11 + f197);
                            o.f2997 = c10;
                            sb2.append(c10);
                            o.f2996 = o.f2997;
                            o.f2998 = 1;
                            while (o.f2998 < i14) {
                                byte[] bArr2 = f198;
                                if (bArr2 != null) {
                                    int i15 = o.f2994;
                                    o.f2994 = i15 - 1;
                                    o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i15] + s10)) ^ o.f2995));
                                } else {
                                    short[] sArr = f196;
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

                @Override // com.ironsource.adqualitysdk.sdk.i.iy
                /* JADX INFO: renamed from: ﻐ */
                public final void mo388(final iq iqVar, final String str) {
                    t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.3.5.1
                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            AnonymousClass3.this.f190.mo388(iqVar, str);
                        }
                    });
                    int i10 = f194 + 121;
                    f195 = i10 % 128;
                    if (i10 % 2 != 0) {
                        throw null;
                    }
                }
            });
        }
    }

    public af(Context context, ao aoVar, al alVar, boolean z10, String str, q qVar) {
        this.f147 = qVar;
        Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() { // from class: com.ironsource.adqualitysdk.sdk.i.af.5

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f220 = 167;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f221 = 1;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f222;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static String m392(String str2, int i10, boolean z11, int i11, int i12) {
                String str3;
                Object charArray = str2;
                if (str2 != null) {
                    charArray = str2.toCharArray();
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
                        cArr2[b.f704] = (char) (b.f705 + i12);
                        int i14 = b.f704;
                        cArr2[i14] = (char) (cArr2[i14] - f220);
                        b.f704 = i14 + 1;
                    }
                    if (i11 > 0) {
                        b.f707 = i11;
                        char[] cArr3 = new char[i10];
                        System.arraycopy(cArr2, 0, cArr3, 0, i10);
                        int i15 = b.f707;
                        System.arraycopy(cArr3, 0, cArr2, i10 - i15, i15);
                        int i16 = b.f707;
                        System.arraycopy(cArr3, i16, cArr2, 0, i10 - i16);
                    }
                    if (z11) {
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
                    str3 = new String(cArr2);
                }
                return str3;
            }

            @Override // java.lang.Thread.UncaughtExceptionHandler
            public final void uncaughtException(Thread thread, Throwable th2) {
                int i10 = f222 + 33;
                f221 = i10 % 128;
                int i11 = i10 % 2;
                kd.m2878(m392("\u000b\uffd9\u0006\ufff9\u0004\u0011\f\u0001\ufffb", 9 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), false, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1, ExpandableListView.getPackedPositionType(0L) + 271).intern(), m392("�\ufffb\u000f\u0001\u0002\u000eﾺ\uffff\u0012�\uffff\n\u000e\u0003\t\b\uffef\b", ImageFormat.getBitsPerPixel(0) + 19, false, TextUtils.getOffsetAfter("", 0) + 16, (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 269).intern(), m392("\b\ufff1\u000f\ufffe\u0000\u0002\uffff\ufffe\u0000", 9 - (Process.myPid() >> 22), false, -TextUtils.lastIndexOf("", '0', 0, 0), 266 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), th2);
                af.this.m372();
                af.m345(af.this).uncaughtException(thread, th2);
                int i12 = f222 + 113;
                f221 = i12 % 128;
                if ((i12 % 2 == 0 ? (char) 7 : 'R') == 'R') {
                } else {
                    throw null;
                }
            }
        });
        this.f160 = alVar;
        this.f148 = context;
        je jeVar = new je(context, m358(new int[]{2142473509, 959875332, -974896525, 1353679588, -383335320, 509482092, 246021949, -1597145402, -1660798854, 916120805, -803478886, -227126831, -1523557290, 1147115770}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 25).intern(), m342(new int[]{0, 24, 0, 24}, "\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000", true).intern());
        this.f159 = new ja(m358(new int[]{-1566622052, -1321266843, -1680295992, 1459105824}, TextUtils.indexOf("", "") + 8).intern(), m358(new int[]{285523246, 2125077745, 529671218, 1081736530}, 5 - MotionEvent.axisFromString("")).intern(), jeVar);
        int iM344 = m344(jeVar);
        this.f162 = new ah(context, aoVar, iM344, m341(jeVar), ar.m483().mo488());
        this.f158 = new iw(context);
        this.f161 = false;
        HandlerThread handlerThread = new HandlerThread(m358(new int[]{-911160412, 496095674, 444534958, 1214402569, 1847194611, 1965971865, -1123958610, -841576584}, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 14).intern());
        handlerThread.start();
        this.f154 = new Handler(handlerThread.getLooper());
        this.f149 = new ae(iM344);
        this.f153 = !z10;
        this.f146 = str;
        m343(true);
        m333();
    }

    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    public static /* synthetic */ iw m318(af afVar) {
        int i10 = f144;
        int i11 = i10 + 23;
        f142 = i11 % 128;
        int i12 = i11 % 2;
        iw iwVar = afVar.f158;
        int i13 = i10 + 71;
        f142 = i13 % 128;
        if ((i13 % 2 == 0 ? (char) 17 : 'V') == 'V') {
            return iwVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    public static /* synthetic */ ah m321(af afVar) {
        int i10 = f144 + 63;
        int i11 = i10 % 128;
        f142 = i11;
        int i12 = i10 % 2;
        ah ahVar = afVar.f162;
        int i13 = i11 + 99;
        f144 = i13 % 128;
        int i14 = i13 % 2;
        return ahVar;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    public static /* synthetic */ String m324(af afVar) {
        int i10 = f142 + 3;
        f144 = i10 % 128;
        if (i10 % 2 != 0) {
            afVar.m319();
            throw null;
        }
        String strM319 = afVar.m319();
        int i11 = f144 + 99;
        f142 = i11 % 128;
        int i12 = i11 % 2;
        return strM319;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    public static /* synthetic */ ja m325(af afVar) {
        int i10 = f144 + 97;
        int i11 = i10 % 128;
        f142 = i11;
        int i12 = i10 % 2;
        ja jaVar = afVar.f159;
        int i13 = i11 + 105;
        f144 = i13 % 128;
        if (i13 % 2 == 0) {
            return jaVar;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    public static /* synthetic */ List m327(af afVar) {
        int i10 = f142 + 45;
        int i11 = i10 % 128;
        f144 = i11;
        char c10 = i10 % 2 != 0 ? (char) 22 : '\"';
        List<je.d> list = afVar.f156;
        if (c10 == 22) {
            int i12 = 26 / 0;
        }
        int i13 = i11 + 29;
        f142 = i13 % 128;
        int i14 = i13 % 2;
        return list;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    public static /* synthetic */ al m329(af afVar) {
        int i10 = f142 + 95;
        int i11 = i10 % 128;
        f144 = i11;
        int i12 = i10 % 2;
        al alVar = afVar.f160;
        int i13 = i11 + 55;
        f142 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
        return alVar;
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    public static /* synthetic */ int m331(af afVar) {
        int i10 = f144 + 71;
        f142 = i10 % 128;
        int i11 = i10 % 2;
        int iM320 = afVar.m320();
        int i12 = f144 + 73;
        f142 = i12 % 128;
        if ((i12 % 2 == 0 ? 'O' : '\\') == '\\') {
            return iM320;
        }
        int i13 = 53 / 0;
        return iM320;
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static /* synthetic */ void m334(af afVar) {
        int i10 = f142 + 85;
        f144 = i10 % 128;
        if (!(i10 % 2 != 0)) {
            afVar.m364(false);
        } else {
            afVar.m364(true);
        }
        int i11 = f144 + 125;
        f142 = i11 % 128;
        if (!(i11 % 2 == 0)) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    public static /* synthetic */ void m336(af afVar) {
        int i10 = f142 + 23;
        f144 = i10 % 128;
        if (i10 % 2 != 0) {
        }
        afVar.m357(true);
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public static /* synthetic */ void m337(af afVar) {
        int i10 = f144 + 71;
        f142 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '\t' : (char) 27;
        afVar.m330();
        if (c10 != '\t') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    public static /* synthetic */ void m339(af afVar) {
        int i10 = f144 + 1;
        f142 = i10 % 128;
        char c10 = i10 % 2 == 0 ? '$' : '\"';
        afVar.m338();
        if (c10 == '\"') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ q m340(af afVar) {
        int i10 = f142;
        int i11 = i10 + 61;
        f144 = i11 % 128;
        int i12 = i11 % 2;
        q qVar = afVar.f147;
        int i13 = i10 + 23;
        f144 = i13 % 128;
        if (i13 % 2 == 0) {
            return qVar;
        }
        int i14 = 52 / 0;
        return qVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ Thread.UncaughtExceptionHandler m345(af afVar) {
        int i10 = f144 + 59;
        f142 = i10 % 128;
        char c10 = i10 % 2 == 0 ? (char) 16 : '(';
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = afVar.f152;
        if (c10 != 16) {
            return uncaughtExceptionHandler;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m351(af afVar) {
        int i10 = f144 + 109;
        f142 = i10 % 128;
        int i11 = i10 % 2;
        afVar.m332();
        int i12 = f144 + 41;
        f142 = i12 % 128;
        if ((i12 % 2 == 0 ? 'O' : (char) 27) == 27) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ ae m354(af afVar) {
        int i10 = f144;
        int i11 = i10 + 105;
        f142 = i11 % 128;
        boolean z10 = i11 % 2 == 0;
        ae aeVar = afVar.f149;
        if (z10) {
            throw null;
        }
        int i12 = i10 + 3;
        f142 = i12 % 128;
        if (i12 % 2 != 0) {
            return aeVar;
        }
        int i13 = 61 / 0;
        return aeVar;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m359(af afVar) {
        int i10 = f142 + 111;
        f144 = i10 % 128;
        int i11 = i10 % 2;
        afVar.m343(false);
        int i12 = f144 + 121;
        f142 = i12 % 128;
        if (i12 % 2 != 0) {
            return;
        }
        int i13 = 3 / 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if ((com.ironsource.adqualitysdk.sdk.i.ar.m483().mo500()) != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        if (com.ironsource.adqualitysdk.sdk.i.ar.m483().mo500() == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
    
        r0 = m323().m556();
        r1 = com.ironsource.adqualitysdk.sdk.i.af.f144 + 33;
        com.ironsource.adqualitysdk.sdk.i.af.f142 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004d, code lost:
    
        return m323().m555();
     */
    /* JADX INFO: renamed from: ﬤ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String m319() {
        /*
            r3 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.af.f144
            int r0 = r0 + 97
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.af.f142 = r1
            int r0 = r0 % 2
            r1 = 88
            if (r0 != 0) goto L11
            r0 = 25
            goto L12
        L11:
            r0 = r1
        L12:
            if (r0 == r1) goto L28
            com.ironsource.adqualitysdk.sdk.i.ar r0 = com.ironsource.adqualitysdk.sdk.i.ar.m483()
            boolean r0 = r0.mo500()
            r1 = 2
            r2 = 0
            int r1 = r1 / r2
            if (r0 != 0) goto L22
            goto L23
        L22:
            r2 = 1
        L23:
            if (r2 == 0) goto L32
            goto L45
        L26:
            r0 = move-exception
            throw r0
        L28:
            com.ironsource.adqualitysdk.sdk.i.ar r0 = com.ironsource.adqualitysdk.sdk.i.ar.m483()
            boolean r0 = r0.mo500()
            if (r0 != 0) goto L45
        L32:
            com.ironsource.adqualitysdk.sdk.i.as r0 = r3.m323()
            java.lang.String r0 = r0.m556()
            int r1 = com.ironsource.adqualitysdk.sdk.i.af.f144
            int r1 = r1 + 33
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.af.f142 = r2
            int r1 = r1 % 2
            return r0
        L45:
            com.ironsource.adqualitysdk.sdk.i.as r0 = r3.m323()
            java.lang.String r0 = r0.m555()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.af.m319():java.lang.String");
    }

    /* JADX INFO: renamed from: סּ, reason: contains not printable characters */
    private int m320() {
        int i10 = f142 + 1;
        f144 = i10 % 128;
        if ((i10 % 2 != 0 ? '*' : (char) 23) != 23) {
            m323();
            throw null;
        }
        if (!(m323() == null) && !ar.m483().mo500()) {
            return m323().m564();
        }
        int i11 = f144 + 81;
        f142 = i11 % 128;
        if (i11 % 2 != 0) {
            return 100;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private synchronized boolean m322() {
        boolean z10;
        int i10 = f144;
        int i11 = i10 + 47;
        f142 = i11 % 128;
        int i12 = i11 % 2;
        z10 = this.f161;
        int i13 = i10 + 77;
        f142 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
        return z10;
    }

    /* JADX INFO: renamed from: ﭴ, reason: contains not printable characters */
    private synchronized as m323() {
        as asVarMo496;
        int i10 = f142 + 9;
        f144 = i10 % 128;
        int i11 = i10 % 2;
        asVarMo496 = ar.m483().mo496();
        int i12 = f142 + 71;
        f144 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return asVarMo496;
    }

    /* JADX INFO: renamed from: ﭸ, reason: contains not printable characters */
    private void m326() {
        int i10 = f144 + 109;
        f142 = i10 % 128;
        if (i10 % 2 == 0) {
        }
        m355(0);
        int i11 = f144 + 11;
        f142 = i11 % 128;
        if (!(i11 % 2 == 0)) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﮉ, reason: contains not printable characters */
    private synchronized boolean m328() {
        int i10 = f144 + 69;
        f142 = i10 % 128;
        if ((i10 % 2 == 0 ? '\f' : (char) 27) == '\f') {
            throw null;
        }
        return this.f155;
    }

    /* JADX INFO: renamed from: ﮌ, reason: contains not printable characters */
    private synchronized void m330() {
        int i10 = f142 + 31;
        f144 = i10 % 128;
        int i11 = i10 % 2;
        if ((m322() ? '8' : 'C') == '8') {
            int i12 = f142 + 79;
            f144 = i12 % 128;
            int i13 = i12 % 2;
            if (!TextUtils.isEmpty(this.f162.m2714().m467())) {
                int i14 = f142 + 69;
                f144 = i14 % 128;
                if (i14 % 2 != 0) {
                    m328();
                    throw null;
                }
                if (!m328()) {
                    m364(true);
                    k.m2825(m358(new int[]{479377779, -1823855621, -803478886, -227126831, -1523557290, 1147115770}, View.getDefaultSize(0, 0) + 9).intern(), m358(new int[]{82263556, 2010123041, -389681155, 835751152, 285523246, 2125077745, 161422540, 1021833377, 426856860, -1468095046, -2077565810, -1220588072, 83087957, 956410176}, (Process.myPid() >> 22) + 25).intern());
                    this.f159.m2588(m323().m563(), new AnonymousClass2());
                }
            }
        }
    }

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private void m332() {
        int i10 = f142 + 3;
        f144 = i10 % 128;
        if (i10 % 2 != 0) {
        }
        m343(false);
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private void m333() {
        this.f150 = new iu() { // from class: com.ironsource.adqualitysdk.sdk.i.af.7
            @Override // com.ironsource.adqualitysdk.sdk.i.iu
            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public final void mo394() {
                af.m351(af.this);
            }
        };
        this.f158.m2542().m2534(this.f150);
        this.f151 = new jo(new jm() { // from class: com.ironsource.adqualitysdk.sdk.i.af.10

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static int f169 = 0;

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f170 = 1;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static char f171 = 32422;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static char f172 = 57520;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char f173 = 53499;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static char f174 = 1063;

            @Override // com.ironsource.adqualitysdk.sdk.i.jm
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo380(final Activity activity) {
                t.m2991(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.10.3

                    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                    private static int f176 = 139;

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static int f177 = 0;

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static int f178 = 1;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static String m382(String str, int i10, boolean z10, int i11, int i12) {
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
                                cArr2[b.f704] = (char) (b.f705 + i12);
                                int i14 = b.f704;
                                cArr2[i14] = (char) (cArr2[i14] - f176);
                                b.f704 = i14 + 1;
                            }
                            if (i11 > 0) {
                                b.f707 = i11;
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

                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        int i10 = f177 + 5;
                        f178 = i10 % 128;
                        int i11 = i10 % 2;
                        af.m340(af.this).onEvent(m382("\ufff7\t\u0007\ufff3\u0000\u0003\u0007\b\ufffa\u0003", (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 10, false, TextUtils.indexOf((CharSequence) "", '0') + 9, 247 - Color.argb(0, 0, 0, 0)).intern());
                        af.this.m368(m382("\ufff7\t\u0007\ufff3\u0000\u0003\u0007\b\ufffa\u0003", Drawable.resolveOpacity(0, 0) + 10, false, 9 - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 247).intern(), AnonymousClass10.m378(activity));
                        int i12 = f177 + 87;
                        f178 = i12 % 128;
                        if ((i12 % 2 == 0 ? '.' : '\t') == '\t') {
                        } else {
                            throw null;
                        }
                    }
                });
                int i10 = f170 + 95;
                f169 = i10 % 128;
                int i11 = i10 % 2;
            }

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            public static /* synthetic */ JSONObject m378(Activity activity) {
                int i10 = f169 + 7;
                f170 = i10 % 128;
                int i11 = i10 % 2;
                JSONObject jSONObjectM377 = m377(activity);
                int i12 = f169 + 99;
                f170 = i12 % 128;
                if (!(i12 % 2 == 0)) {
                    return jSONObjectM377;
                }
                int i13 = 84 / 0;
                return jSONObjectM377;
            }

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static String m379(String str, int i10) {
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
                                char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f172)) ^ ((c11 >>> 5) + f173)));
                                cArr3[1] = c12;
                                cArr3[0] = (char) (c11 - (((c12 >>> 5) + f174) ^ ((c12 + i12) ^ ((c12 << 4) + f171))));
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

            @Override // com.ironsource.adqualitysdk.sdk.i.jm
            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            public final void mo381(final Activity activity) {
                t.m2991(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.10.5

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static int f181 = 0;

                    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                    private static int f182 = 1;

                    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                    private static long f183 = -7819346487344341121L;

                    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                    private static String m383(String str, int i10) {
                        String str2;
                        Object charArray = str;
                        if (str != null) {
                            charArray = str.toCharArray();
                        }
                        char[] cArr = (char[]) charArray;
                        synchronized (h.f2284) {
                            char[] cArrM2243 = h.m2243(f183, cArr, i10);
                            h.f2285 = 4;
                            while (true) {
                                int i11 = h.f2285;
                                if (i11 < cArrM2243.length) {
                                    h.f2283 = i11 - 4;
                                    int i12 = h.f2285;
                                    cArrM2243[i12] = (char) (((long) (cArrM2243[i12] ^ cArrM2243[i12 % 4])) ^ (((long) h.f2283) * f183));
                                    h.f2285++;
                                } else {
                                    str2 = new String(cArrM2243, 4, cArrM2243.length - 4);
                                }
                            }
                        }
                        return str2;
                    }

                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        int i10 = f182 + 11;
                        f181 = i10 % 128;
                        int i11 = i10 % 2;
                        af.m340(af.this).onEvent(m383("㣳ヿ笊儯㢕濯얗伧䕼\ueddb䞂촳썸毼솓䬨䅢\ue9e8", (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))).intern());
                        af.this.m368(m383("㣳ヿ笊儯㢕濯얗伧䕼\ueddb䞂촳썸毼솓䬨䅢\ue9e8", 1 - Drawable.resolveOpacity(0, 0)).intern(), AnonymousClass10.m378(activity));
                        int i12 = f181 + 25;
                        f182 = i12 % 128;
                        if (i12 % 2 == 0) {
                            int i13 = 14 / 0;
                        }
                    }
                });
                int i10 = f170 + 91;
                f169 = i10 % 128;
                if (!(i10 % 2 != 0)) {
                    return;
                }
                int i11 = 90 / 0;
            }

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static JSONObject m377(Activity activity) {
                JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
                try {
                    jSONObjectJsonObjectInit.put(m379("ꢕ\ue8e5⧺쳸\ue1d0ᕌ\n斦", 8 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), activity.getClass().getName());
                    int i10 = f169 + 47;
                    f170 = i10 % 128;
                    int i11 = i10 % 2;
                } catch (JSONException unused) {
                    k.m2810(m379("鮱猗\udc15銙ԫ㓆\uf685৺旡\uda2a", View.combineMeasuredStates(0, 0) + 9).intern(), m379("떊쨳✠秥L࿖\uf488甧럌鄐ೄ쑺\u0e73\uf191ሥ︋\ud88e溎⧫憌ࠍ薶\ue601\udce2㿙곲", 25 - TextUtils.indexOf((CharSequence) "", '0')).intern());
                }
                int i12 = f169 + 51;
                f170 = i12 % 128;
                int i13 = i12 % 2;
                return jSONObjectJsonObjectInit;
            }
        });
        jj.m2676().m2679(new jh() { // from class: com.ironsource.adqualitysdk.sdk.i.af.12
            @Override // com.ironsource.adqualitysdk.sdk.i.jh, com.ironsource.adqualitysdk.sdk.i.jg
            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            public final void mo384(Activity activity) {
                af.this.m372();
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.jh, com.ironsource.adqualitysdk.sdk.i.jg
            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            public final void mo385(Activity activity) {
                af.m339(af.this);
            }
        });
        ar.m483().mo507(new av() { // from class: com.ironsource.adqualitysdk.sdk.i.af.11
            @Override // com.ironsource.adqualitysdk.sdk.i.av
            /* JADX INFO: renamed from: ﾒ */
            public final void mo317() {
                af.m336(af.this);
            }
        });
        int i10 = f144 + 103;
        f142 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private void m335() {
        if (this.f150 != null) {
            int i10 = f142 + 17;
            f144 = i10 % 128;
            if (!(i10 % 2 == 0)) {
                this.f158.m2542().m2532(this.f150);
                throw null;
            }
            this.f158.m2542().m2532(this.f150);
        }
        this.f151.m2704();
        this.f151 = null;
        int i11 = f144 + 27;
        f142 = i11 % 128;
        if ((i11 % 2 == 0 ? '\t' : 'U') != '\t') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private void m338() {
        if ((this.f153 ? (char) 17 : 'W') == 17) {
            int i10 = f142 + 7;
            f144 = i10 % 128;
            int i11 = i10 % 2;
            m369();
            int i12 = f144 + 69;
            f142 = i12 % 128;
            int i13 = i12 % 2;
        }
        this.f153 = false;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ boolean m349(af afVar, ai aiVar) {
        int i10 = f144 + 21;
        f142 = i10 % 128;
        if ((i10 % 2 == 0 ? '+' : (char) 7) == '+') {
            afVar.m350(aiVar);
            throw null;
        }
        boolean zM350 = afVar.m350(aiVar);
        int i11 = f142 + 57;
        f144 = i11 % 128;
        int i12 = i11 % 2;
        return zM350;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ void m352(af afVar, List list, iy iyVar) {
        int i10 = f142 + 121;
        f144 = i10 % 128;
        int i11 = i10 % 2;
        afVar.m347((List<ai>) list, iyVar);
        int i12 = f142 + 89;
        f144 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private synchronized void m357(boolean z10) {
        int i10 = f142 + 123;
        f144 = i10 % 128;
        if ((i10 % 2 != 0 ? '\f' : 'W') != 'W') {
            this.f161 = true;
            m343(false);
        } else {
            this.f161 = true;
            m343(true);
        }
        int i11 = f142 + 3;
        f144 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m360(af afVar, int i10) {
        int i11 = f142 + 17;
        f144 = i11 % 128;
        boolean z10 = i11 % 2 != 0;
        afVar.m355(i10);
        if (!z10) {
            return;
        }
        int i12 = 38 / 0;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    public final String m366() {
        String strM341 = m341(new je(this.f148, m358(new int[]{2142473509, 959875332, -974896525, 1353679588, -383335320, 509482092, 246021949, -1597145402, -1660798854, 916120805, -803478886, -227126831, -1523557290, 1147115770}, 25 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), m342(new int[]{0, 24, 0, 24}, "\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0000\u0001\u0001\u0000\u0000\u0000", true).intern()));
        int i10 = f144 + 113;
        f142 = i10 % 128;
        int i11 = i10 % 2;
        return strM341;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m367() {
        t.m2991(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.9

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static int f241 = 0;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static int f242 = 1;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static boolean f243 = true;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static char[] f244 = {221, 217, 200, 220, 206, 215, 205};

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static boolean f245 = true;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static int f246 = 105;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m396(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
                    char[] cArr2 = f244;
                    int i11 = f246;
                    if (f243) {
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
                    if (f245) {
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
                af.m340(af.this).onEvent(m396(null, 126 - ExpandableListView.getPackedPositionChild(0L), null, "\u0087\u0086\u0085\u0083\u0084\u0084\u0085\u0084\u0083\u0082\u0081").intern());
                af.this.m368(m396(null, 127 - TextUtils.indexOf("", "", 0), null, "\u0087\u0086\u0085\u0083\u0084\u0084\u0085\u0084\u0083\u0082\u0081").intern(), IronSourceVideoBridge.jsonObjectInit());
                int i10 = f242 + 71;
                f241 = i10 % 128;
                if (i10 % 2 == 0) {
                } else {
                    throw null;
                }
            }
        });
        int i10 = f144 + 61;
        f142 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static /* synthetic */ boolean m353(af afVar, int i10) {
        int i11 = f142 + 103;
        f144 = i11 % 128;
        int i12 = i11 % 2;
        boolean zM365 = afVar.m365(i10);
        int i13 = f142 + 23;
        f144 = i13 % 128;
        if ((i13 % 2 != 0 ? (char) 14 : (char) 26) == 26) {
            return zM365;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ void m361(af afVar, JSONObject jSONObject, ir irVar) {
        int i10 = f144 + 117;
        f142 = i10 % 128;
        int i11 = i10 % 2;
        afVar.m363(jSONObject, irVar);
        int i12 = f144 + 107;
        f142 = i12 % 128;
        if ((i12 % 2 == 0 ? ']' : 'S') != ']') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public final void m368(String str, JSONObject jSONObject) {
        int i10 = f144 + 67;
        f142 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        m356(str, jSONObject, null);
        if (!z10) {
            int i11 = 4 / 0;
        }
        int i12 = f142 + 91;
        f144 = i12 % 128;
        if ((i12 % 2 != 0 ? '>' : (char) 21) == 21) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final synchronized void m370(je.d dVar) {
        int i10 = f142 + 35;
        f144 = i10 % 128;
        int i11 = i10 % 2;
        this.f156.add(dVar);
        int i12 = f142 + 105;
        f144 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m341(je jeVar) {
        int i10 = f142 + 83;
        f144 = i10 % 128;
        int i11 = i10 % 2;
        String strM2637 = jeVar.m2637(m358(new int[]{880499219, 219661264, 1061739848, -731476431, 541997271, 1086220609, 2040148884, 1234529969}, (ViewConfiguration.getScrollBarSize() >> 8) + 16).intern());
        if ((TextUtils.isEmpty(strM2637) ? '!' : '.') == '.') {
            return strM2637;
        }
        int i12 = f142 + 23;
        f144 = i12 % 128;
        int i13 = i12 % 2;
        String string = UUID.randomUUID().toString();
        jeVar.m2638(m358(new int[]{880499219, 219661264, 1061739848, -731476431, 541997271, 1086220609, 2040148884, 1234529969}, 16 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), string);
        return string;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public final void m369() {
        t.m2991(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.8

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f235 = 1;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static long f236 = 8001735609835121508L;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f237;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f238;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static char f239;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static String m395(String str, char c10, String str2, int i10, String str3) {
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
                            cArr6[i15] = (char) (((((long) (c12 ^ cArr3[i15])) ^ f236) ^ ((long) f237)) ^ ((long) f239));
                            j.f2675 = i15 + 1;
                        } else {
                            str4 = new String(cArr6);
                        }
                    }
                }
                return str4;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                af.m340(af.this).onEvent(m395("\uf018펥므ㄘ纫\u0ff2餫\udcca䅾\udf18쨧⺏\ue747", (char) (11543 - (KeyEvent.getMaxKeyCode() >> 16)), "\ueb64拐\ue024漋", (-383233332) - ((Process.getThreadPriority(0) + 20) >> 6), "챤⡒៩भ").intern());
                af.this.m368(m395("\uf018펥므ㄘ纫\u0ff2餫\udcca䅾\udf18쨧⺏\ue747", (char) ((KeyEvent.getMaxKeyCode() >> 16) + 11543), "\ueb64拐\ue024漋", TextUtils.indexOf("", "", 0, 0) - 383233332, "챤⡒៩भ").intern(), IronSourceVideoBridge.jsonObjectInit());
                int i10 = f235 + 95;
                f238 = i10 % 128;
                if ((i10 % 2 != 0 ? '9' : 'a') != '9') {
                } else {
                    throw null;
                }
            }
        });
        int i10 = f142 + 59;
        f144 = i10 % 128;
        if ((i10 % 2 != 0 ? (char) 21 : 'N') == 'N') {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final synchronized void m371() {
        int i10 = f144 + 61;
        f142 = i10 % 128;
        int i11 = i10 % 2;
        boolean z10 = false;
        this.f161 = false;
        Handler handler = this.f154;
        if (handler == null) {
            z10 = true;
        }
        if (!z10) {
            handler.removeCallbacksAndMessages(null);
            int i12 = f144 + 19;
            f142 = i12 % 128;
            int i13 = i12 % 2;
        }
        this.f158.m2541();
        m335();
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m374() {
        synchronized (this) {
            Handler handler = this.f154;
            if (handler != null) {
                handler.removeCallbacksAndMessages(null);
            }
            m343(true);
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static JSONObject m346(String str, String str2, String str3, String str4, JSONObject jSONObject) {
        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit();
        try {
            jSONObjectJsonObjectInit.put(m358(new int[]{-1967768556, -1946163968, 81328616, 1125925523}, (-16777211) - Color.rgb(0, 0, 0)).intern(), str);
            jSONObjectJsonObjectInit.put(m342(new int[]{50, 5, 0, 2}, "\u0001\u0000\u0000\u0001\u0001", false).intern(), str2);
            jSONObjectJsonObjectInit.put(m358(new int[]{551549932, 1373315991, -1205271376, 2138843809}, View.resolveSizeAndState(0, 0, 0) + 6).intern(), str3);
            if (!TextUtils.isEmpty(str4)) {
                jSONObjectJsonObjectInit.put(m358(new int[]{-389804321, -275172463, -1757591635, -1094520480}, KeyEvent.keyCodeFromString("") + 5).intern(), str4);
            }
            if ((jSONObject != null ? 'c' : '<') != '<') {
                int i10 = f144 + 1;
                f142 = i10 % 128;
                if (!(i10 % 2 == 0)) {
                    jz.m2795(jSONObjectJsonObjectInit, jSONObject);
                } else {
                    jz.m2795(jSONObjectJsonObjectInit, jSONObject);
                    int i11 = 15 / 0;
                }
            }
        } catch (JSONException e10) {
            k.m2830(m358(new int[]{479377779, -1823855621, -803478886, -227126831, -1523557290, 1147115770}, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 9).intern(), m342(new int[]{55, 26, 95, 0}, "\u0000\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0000\u0000\u0000\u0000\u0000\u0000", false).intern(), e10);
        }
        int i12 = f142 + 57;
        f144 = i12 % 128;
        if (i12 % 2 == 0) {
            return jSONObjectJsonObjectInit;
        }
        int i13 = 15 / 0;
        return jSONObjectJsonObjectInit;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m373(ag agVar) {
        int i10 = f144 + 117;
        f142 = i10 % 128;
        int i11 = i10 % 2;
        this.f157.add(agVar);
        int i12 = f144 + 75;
        f142 = i12 % 128;
        int i13 = i12 % 2;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m372() {
        int i10 = f142 + 11;
        f144 = i10 % 128;
        int i11 = i10 % 2;
        try {
            this.f153 = true;
            m367();
            m374();
            int i12 = f142 + 65;
            f144 = i12 % 128;
            int i13 = i12 % 2;
        } catch (Exception e10) {
            kd.m2872(m358(new int[]{479377779, -1823855621, -803478886, -227126831, -1523557290, 1147115770}, TextUtils.getOffsetAfter("", 0) + 9).intern(), m342(new int[]{24, 26, 0, 0}, "\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0000\u0001\u0000", false).intern(), e10, false);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m375(String str, JSONObject jSONObject, JSONObject jSONObject2, final ir irVar) {
        String strIntern = m358(new int[]{479377779, -1823855621, -803478886, -227126831, -1523557290, 1147115770}, TextUtils.getTrimmedLength("") + 9).intern();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m358(new int[]{83096655, 245550014, 289056553, -1579412729, -640605648, -181917106, 1761504619, 1903179779, 285092908, -348226072, 1376643555, 797126243}, 22 - (ViewConfiguration.getKeyRepeatDelay() >> 16)).intern());
        sb2.append(str);
        sb2.append(m358(new int[]{1849786485, 1620937760, 930804328, 1175772035, 793480345, 1919279341, -757807160, 1382205472, 953336447, -1759961253}, 17 - (ViewConfiguration.getScrollBarSize() >> 8)).intern());
        k.m2811(strIntern, sb2.toString(), jSONObject);
        try {
            if (m323().m560().contains(str)) {
                String strIntern2 = m358(new int[]{479377779, -1823855621, -803478886, -227126831, -1523557290, 1147115770}, (ViewConfiguration.getEdgeSlop() >> 16) + 9).intern();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(m358(new int[]{-950026680, -1992704577, 1373818390, 1537277856, -389681155, 835751152, 285523246, 2125077745, 1548619636, -186787108, -406479645, 1509108356, 1077145615, -1077114738, 1513703436, -1612471642}, 29 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern());
                sb3.append(str);
                sb3.append(m358(new int[]{1145460262, 2124375549, 1922823439, -364277260, -1940569395, 1856846010, 1976509113, -1978719714, 2048614725, 1304313963, -1874846112, -2043772260}, 21 - (KeyEvent.getMaxKeyCode() >> 16)).intern());
                k.m2825(strIntern2, sb3.toString());
                int i10 = f144 + 27;
                f142 = i10 % 128;
                if (i10 % 2 != 0) {
                    return;
                } else {
                    throw null;
                }
            }
            String strIntern3 = m358(new int[]{479377779, -1823855621, -803478886, -227126831, -1523557290, 1147115770}, '9' - AndroidCharacter.getMirror('0')).intern();
            StringBuilder sb4 = new StringBuilder();
            sb4.append(m358(new int[]{83096655, 245550014, 289056553, -1579412729, -640605648, -181917106, 1761504619, 1903179779, 285092908, -348226072, 1849786485, 1620937760, -1334808229, -277208604, 21539249, 1861875140}, TextUtils.indexOf((CharSequence) "", '0', 0) + 33).intern());
            sb4.append(str);
            k.m2825(strIntern3, sb4.toString());
            this.f162.m406(str, jSONObject, jSONObject2, this.f158.m2542().m2530(), new ah.a() { // from class: com.ironsource.adqualitysdk.sdk.i.af.6
                @Override // com.ironsource.adqualitysdk.sdk.i.ah.a
                public void onEventGenerated(JSONObject jSONObject3) {
                    af.m354(af.this).m315(jSONObject3);
                    af.m361(af.this, jSONObject3, new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.6.3

                        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
                        private static short[] f226 = null;

                        /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
                        private static int f227 = 1;

                        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
                        private static int f228 = 0;

                        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
                        private static byte[] f229 = {-88, 66, 77, 67, -75, -77, 75, -107, -86, 83, -96, 90, -84, -87, 86, -85, 121, -128, -86, 26, -77, -109, 83, 92, -70, 100, -76, -93, 92, -89, 6, -25, 80, 28, -5, 86, -88, 85, 120, 0, 0};

                        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
                        private static int f230 = 167662927;

                        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                        private static int f231 = 27;

                        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
                        private static int f232 = -284125767;

                        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
                        private static String m393(int i11, short s10, int i12, byte b10, int i13) {
                            String string;
                            synchronized (o.f2993) {
                                StringBuilder sb5 = new StringBuilder();
                                int i14 = f231;
                                int i15 = i13 + i14;
                                boolean z10 = i15 == -1;
                                if (z10) {
                                    byte[] bArr = f229;
                                    i15 = bArr != null ? (byte) (bArr[f232 + i11] + i14) : (short) (f226[f232 + i11] + i14);
                                }
                                if (i15 > 0) {
                                    o.f2994 = ((i11 + i15) - 2) + f232 + (z10 ? 1 : 0);
                                    o.f2995 = b10;
                                    char c10 = (char) (i12 + f230);
                                    o.f2997 = c10;
                                    sb5.append(c10);
                                    o.f2996 = o.f2997;
                                    o.f2998 = 1;
                                    while (o.f2998 < i15) {
                                        byte[] bArr2 = f229;
                                        if (bArr2 != null) {
                                            int i16 = o.f2994;
                                            o.f2994 = i16 - 1;
                                            o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i16] + s10)) ^ o.f2995));
                                        } else {
                                            short[] sArr = f226;
                                            int i17 = o.f2994;
                                            o.f2994 = i17 - 1;
                                            o.f2997 = (char) (o.f2996 + (((short) (sArr[i17] + s10)) ^ o.f2995));
                                        }
                                        sb5.append(o.f2997);
                                        o.f2996 = o.f2997;
                                        o.f2998++;
                                    }
                                }
                                string = sb5.toString();
                            }
                            return string;
                        }

                        @Override // com.ironsource.adqualitysdk.sdk.i.ir
                        /* JADX INFO: renamed from: ﾒ */
                        public final void mo276() {
                            int i11 = f227 + 111;
                            f228 = i11 % 128;
                            int i12 = i11 % 2;
                            af.m359(af.this);
                            ir irVar2 = irVar;
                            if ((irVar2 != null ? 'N' : '(') != '(') {
                                int i13 = f228 + 109;
                                f227 = i13 % 128;
                                int i14 = i13 % 2;
                                try {
                                    irVar2.mo276();
                                } catch (Exception e10) {
                                    kd.m2880(m393(TextUtils.indexOf("", "", 0, 0) + 284125767, (short) Color.green(0), (-167662862) - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (byte) (Color.red(0) - 72), Color.blue(0) - 18).intern(), m393(Color.blue(0) + 284125775, (short) TextUtils.indexOf("", "", 0, 0), TextUtils.lastIndexOf("", '0', 0, 0) - 167662857, (byte) (TextUtils.indexOf("", "", 0) + 85), 5 - ((Process.getThreadPriority(0) + 20) >> 6)).intern(), e10, false, false, true);
                                }
                            }
                        }
                    });
                }
            });
        } catch (Exception e10) {
            kd.m2880(m358(new int[]{479377779, -1823855621, -803478886, -227126831, -1523557290, 1147115770}, 9 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), m358(new int[]{-125987093, 2062639908, 2049619959, -170090790, 2075892157, -122529565, -40209718, -175130338, 1982882234, -2045069041}, 18 - (ViewConfiguration.getPressedStateDuration() >> 16)).intern(), e10, false, false, true);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private synchronized void m343(boolean z10) {
        int i10 = f142 + 109;
        int i11 = i10 % 128;
        f144 = i11;
        int i12 = i10 % 2;
        if (!z10) {
            this.f159.m2589(new ja.d() { // from class: com.ironsource.adqualitysdk.sdk.i.af.14
                @Override // com.ironsource.adqualitysdk.sdk.i.ja.d
                /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
                public final void mo386(int i13) {
                    af.m360(af.this, af.m353(af.this, i13) ? 0 : af.m331(af.this));
                }
            });
            return;
        }
        int i13 = i11 + 47;
        f142 = i13 % 128;
        if (!(i13 % 2 == 0)) {
            m326();
        } else {
            m326();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m356(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        int i10 = f144 + 3;
        f142 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        m375(str, jSONObject, jSONObject2, null);
        if (z10) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private void m355(int i10) {
        this.f154.removeCallbacksAndMessages(null);
        this.f154.postDelayed(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.1

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static int f163 = 1;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f164 = 0;

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static char f165 = 3506;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f166;

            /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
            private static long f167;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static String m376(String str, char c10, String str2, int i11, String str3) {
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
                    cArr5[2] = (char) (cArr5[2] + ((char) i11));
                    int length = cArr3.length;
                    char[] cArr6 = new char[length];
                    j.f2675 = 0;
                    while (true) {
                        int i12 = j.f2675;
                        if (i12 < length) {
                            int i13 = (i12 + 2) % 4;
                            int i14 = (i12 + 3) % 4;
                            int i15 = cArr4[i12 % 4] * 32718;
                            char c11 = cArr5[i13];
                            char c12 = (char) ((i15 + c11) % 65535);
                            j.f2674 = c12;
                            cArr5[i14] = (char) (((cArr4[i14] * 32718) + c11) / 65535);
                            cArr4[i14] = c12;
                            int i16 = j.f2675;
                            cArr6[i16] = (char) (((((long) (c12 ^ cArr3[i16])) ^ f167) ^ ((long) f164)) ^ ((long) f165));
                            j.f2675 = i16 + 1;
                        } else {
                            str4 = new String(cArr6);
                        }
                    }
                }
                return str4;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                int i11 = f163 + 95;
                f166 = i11 % 128;
                try {
                    if (i11 % 2 == 0) {
                        af.m337(af.this);
                    } else {
                        af.m337(af.this);
                        int i12 = 26 / 0;
                    }
                } catch (Throwable th2) {
                    k.m2816(m376("壶쉠㫖⫩㫪ଶ彐ｚ뇫", (char) (Process.getGidForName("") + 1), "\u0000\u0000\u0000\u0000", (ViewConfiguration.getKeyRepeatDelay() >> 16) - 1842376590, "狺⾐쒒о").intern(), m376("㊠ᕲ擇뱩祜崢ꈢꗹ덃멦꺙\uf637슟쁕⡄ㅎ㹴깕뿇魲\uf289⎧ꀪ褩숩폩永ⵉ낽\uf4e8Ⲓ", (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 9590), "\u0000\u0000\u0000\u0000", 1189248938 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), "ꫳ\ue27f癆줥").intern(), th2);
                    af.m334(af.this);
                }
            }
        }, i10);
        int i11 = f142 + 85;
        f144 = i11 % 128;
        int i12 = i11 % 2;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m342(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
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
            System.arraycopy(f145, i10, cArr, 0, i11);
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int m344(je jeVar) {
        String strM2637 = jeVar.m2637(m358(new int[]{-1627444297, 1930145964, 216365417, -156356161, -753046412, 1138589857}, 10 - Color.alpha(0)).intern());
        int i10 = 1;
        if (!(TextUtils.isEmpty(strM2637))) {
            int i11 = f144 + 109;
            f142 = i11 % 128;
            boolean z10 = i11 % 2 == 0;
            int i12 = Integer.parseInt(strM2637);
            i10 = z10 ? i12 / 0 : i12 + 1;
        }
        jeVar.m2638(m358(new int[]{-1627444297, 1930145964, 216365417, -156356161, -753046412, 1138589857}, 9 - TextUtils.lastIndexOf("", '0', 0)).intern(), String.valueOf(i10));
        int i13 = f142 + 15;
        f144 = i13 % 128;
        int i14 = i13 % 2;
        return i10;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private synchronized void m364(boolean z10) {
        int i10 = f144 + 117;
        f142 = i10 % 128;
        if ((i10 % 2 == 0 ? 'X' : 'R') != 'R') {
            this.f155 = z10;
            throw null;
        }
        this.f155 = z10;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0023, code lost:
    
        if ((r5 >= m323().m563()) != true) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        if (r5 >= m323().m563()) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        r5 = com.ironsource.adqualitysdk.sdk.i.af.f144 + 51;
        com.ironsource.adqualitysdk.sdk.i.af.f142 = r5 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if ((r5 % 2) != 0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0041, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:?, code lost:
    
        return true;
     */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m365(int r5) {
        /*
            r4 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.af.f142
            int r0 = r0 + 39
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.af.f144 = r1
            int r0 = r0 % 2
            r1 = 19
            if (r0 == 0) goto L10
            r0 = r1
            goto L12
        L10:
            r0 = 88
        L12:
            r2 = 1
            r3 = 0
            if (r0 == r1) goto L26
            com.ironsource.adqualitysdk.sdk.i.as r0 = r4.m323()
            int r0 = r0.m563()
            if (r5 < r0) goto L22
            r5 = r2
            goto L23
        L22:
            r5 = r3
        L23:
            if (r5 == r2) goto L33
            goto L41
        L26:
            com.ironsource.adqualitysdk.sdk.i.as r0 = r4.m323()
            int r0 = r0.m563()
            r1 = 67
            int r1 = r1 / r3
            if (r5 < r0) goto L41
        L33:
            int r5 = com.ironsource.adqualitysdk.sdk.i.af.f144
            int r5 = r5 + 51
            int r0 = r5 % 128
            com.ironsource.adqualitysdk.sdk.i.af.f142 = r0
            int r5 = r5 % 2
            if (r5 != 0) goto L40
            r2 = r3
        L40:
            return r2
        L41:
            return r3
        L42:
            r5 = move-exception
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.af.m365(int):boolean");
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m363(JSONObject jSONObject, ir irVar) {
        m362(jSONObject);
        ai aiVar = new ai(ja.m2579(jSONObject));
        aiVar.m417(m323().m561());
        this.f159.m2590(aiVar.m421(), irVar);
        m348(aiVar.m416());
        t.m3000(irVar);
        int i10 = f144 + 31;
        f142 = i10 % 128;
        if ((i10 % 2 == 0 ? '/' : '0') != '/') {
            return;
        }
        int i11 = 3 / 0;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private boolean m350(ai aiVar) {
        int i10 = f142 + 123;
        f144 = i10 % 128;
        int i11 = i10 % 2;
        boolean zMo513 = ar.m483().mo513(aiVar.m418(), this.f146);
        int i12 = f144 + 35;
        f142 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 15 : 'P') != 15) {
            return zMo513;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007f A[EXC_TOP_SPLITTER, PHI: r2 r10
  0x007f: PHI (r2v16 com.ironsource.adqualitysdk.sdk.i.ai) = (r2v15 com.ironsource.adqualitysdk.sdk.i.ai), (r2v20 com.ironsource.adqualitysdk.sdk.i.ai) binds: [B:24:0x007d, B:18:0x005a] A[DONT_GENERATE, DONT_INLINE]
  0x007f: PHI (r10v1 org.json.JSONObject) = (r10v0 org.json.JSONObject), (r10v3 org.json.JSONObject) binds: [B:24:0x007d, B:18:0x005a] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m347(List<ai> list, iy iyVar) {
        ai next;
        JSONObject jSONObjectM416;
        JSONArray jSONArray = new JSONArray();
        Iterator<ai> it = list.iterator();
        int i10 = f142 + 81;
        f144 = i10 % 128;
        int i11 = i10 % 2;
        while (true) {
            if ((it.hasNext() ? 'U' : 'W') != 'W') {
                int i12 = f142 + 17;
                f144 = i12 % 128;
                if (!(i12 % 2 == 0)) {
                    next = it.next();
                    jSONObjectM416 = next.m416();
                    if ((!jSONObjectM416.has(m342(new int[]{81, 3, 85, 1}, null, true).intern()) ? 'Y' : (char) 15) == 'Y') {
                        try {
                            jSONObjectM416.put(m342(new int[]{81, 3, 85, 1}, null, true).intern(), jSONObjectM416.optLong(ih.f2535));
                        } catch (JSONException unused) {
                        }
                    }
                } else {
                    next = it.next();
                    jSONObjectM416 = next.m416();
                    if (!jSONObjectM416.has(m342(new int[]{81, 3, 85, 1}, null, true).intern())) {
                        jSONObjectM416.put(m342(new int[]{81, 3, 85, 1}, null, true).intern(), jSONObjectM416.optLong(ih.f2535));
                    }
                }
                if (this.f149.m315(jSONObjectM416)) {
                    int i13 = f144 + 41;
                    f142 = i13 % 128;
                    int i14 = i13 % 2;
                    this.f159.m2590(next.m421(), null);
                }
                jSONArray.put(jSONObjectM416);
            } else {
                this.f162.m405(jSONArray, this.f158.m2542().m2530(), new AnonymousClass3(jSONArray, list, iyVar));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private void m362(JSONObject jSONObject) {
        int i10 = f144 + 113;
        f142 = i10 % 128;
        if (i10 % 2 != 0) {
            Iterator<String> it = m323().m562().iterator();
            while (true) {
                if (!it.hasNext()) {
                    return;
                }
                int i11 = f144 + 73;
                f142 = i11 % 128;
                if (!(i11 % 2 != 0)) {
                    jSONObject.remove(it.next());
                    throw null;
                }
                jSONObject.remove(it.next());
            }
        } else {
            m323().m562().iterator();
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m358(int[] iArr, int i10) {
        String str;
        synchronized (e.f1912) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f143.clone();
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

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m348(final JSONObject jSONObject) {
        final ArrayList arrayList;
        if (s.m2951().m2979()) {
            synchronized (this) {
                arrayList = new ArrayList(this.f157);
            }
            t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.af.4
                @Override // com.ironsource.adqualitysdk.sdk.i.ir
                /* JADX INFO: renamed from: ﾒ */
                public final void mo276() {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ((ag) it.next()).onEventReceived(jSONObject);
                    }
                }
            });
        }
    }
}
