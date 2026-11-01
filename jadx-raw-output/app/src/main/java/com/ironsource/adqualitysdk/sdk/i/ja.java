package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.C3426d4;
import com.safedk.android.internal.partials.IronSourceVideoBridge;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes9.dex */
public final class ja {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f2676 = 0;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2677 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f2678 = 4;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f2679 = {'C', 'a', 'c', 'h', 'e', 'S', 't', 'o', 'r', 'g', ' ', '(', ')', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private final je f2680;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private final String f2681;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private final int f2682;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private final String f2683;

    public interface a {
        /* JADX INFO: renamed from: ﾒ */
        void mo389(List<jb> list);
    }

    public interface d {
        /* JADX INFO: renamed from: ﻐ */
        void mo386(int i10);
    }

    public ja(String str, String str2, je jeVar) {
        this(str, str2, jeVar, (byte) 0);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static /* synthetic */ String m2581(ja jaVar) {
        int i10 = f2677 + 9;
        f2676 = i10 % 128;
        int i11 = i10 % 2;
        String strM2580 = jaVar.m2580();
        int i12 = f2676 + 37;
        f2677 = i12 % 128;
        int i13 = i12 % 2;
        return strM2580;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static /* synthetic */ int m2585(ja jaVar) {
        int i10 = f2677 + 43;
        f2676 = i10 % 128;
        return i10 % 2 != 0 ? 26738 : 10000;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ je m2586(ja jaVar) {
        int i10 = f2676 + 125;
        int i11 = i10 % 128;
        f2677 = i11;
        char c10 = i10 % 2 == 0 ? '3' : 'D';
        je jeVar = jaVar.f2680;
        if (c10 == '3') {
            throw null;
        }
        int i12 = i11 + 45;
        f2676 = i12 % 128;
        int i13 = i12 % 2;
        return jeVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public final void m2588(final int i10, final a aVar) {
        je.m2630().post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.5

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f2704 = 0;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f2705 = 1;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static char f2706 = 5;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static char[] f2707 = {'*', 'p', 'o', 's', 't', 'D', 'a', 'u', 'i', 'd', 'C', 'c', 'h', 'e', 'S', 'r', 'g', 'l', 'n', '\'', ' ', 'v', '.', ':', '+'};

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﻛ */
            public final void mo640(Throwable th2) {
                super.mo640(th2);
                t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.5.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        aVar.mo389(new ArrayList());
                    }
                });
                int i11 = f2705 + 49;
                f2704 = i11 % 128;
                int i12 = i11 % 2;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                final ArrayList arrayList = new ArrayList();
                for (String str : ja.m2586(ja.this).m2640(ja.m2578(ja.this, m2594(C3426d4.j.f28586d, -ExpandableListView.getPackedPositionChild(0L), (byte) (ExpandableListView.getPackedPositionChild(0L) + 50)).intern()), i10).values()) {
                    try {
                        JSONObject jSONObjectJsonObjectInit = IronSourceVideoBridge.jsonObjectInit(str);
                        arrayList.add(new jb(jSONObjectJsonObjectInit.getJSONObject(m2594("\u0002\u0003\u0004\u0000\u0006\u0007\u0001\t", (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 8, (byte) (View.getDefaultSize(0, 0) + 79)).intern()), jSONObjectJsonObjectInit.optString(m2594("ÅÅ\t\u0005", View.getDefaultSize(0, 0) + 4, (byte) (79 - ((byte) KeyEvent.getModifierMetaStateMask()))).intern())));
                        int i11 = f2704 + 69;
                        f2705 = i11 % 128;
                        int i12 = i11 % 2;
                    } catch (Exception unused) {
                        String strM2581 = ja.m2581(ja.this);
                        String strIntern = m2594("\u000b\u0005\f\r\u000e\n\u0000\u0003\u0010\u0005\u0012\u000b", 12 - Color.red(0), (byte) (TextUtils.getTrimmedLength("") + 51)).intern();
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(m2594("\f\u0000\f\u0016\b\u0013\u0018\t\u0015\n\u0012\n\t\u0001\n\u0017\u0010\u000b\f\r\u000e\b\u0017\n\u0017\u000b\u0013\u0003\u0017\u0015\u0004\u0000\u0012\u0005\u0013\u0011\u0015\u0016\u0007\u0010\b\f\u0018\u0015", 44 - ExpandableListView.getPackedPositionGroup(0L), (byte) (3 - (ViewConfiguration.getWindowTouchSlop() >> 8))).intern());
                        sb2.append(str);
                        k.m2815(strM2581, strIntern, sb2.toString(), true);
                    }
                }
                t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.5.4
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        aVar.mo389(arrayList);
                    }
                });
                int i13 = f2705 + 73;
                f2704 = i13 % 128;
                int i14 = i13 % 2;
            }

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static String m2594(String str, int i11, byte b10) {
                String str2;
                Object charArray = str;
                if (str != null) {
                    charArray = str.toCharArray();
                }
                char[] cArr = (char[]) charArray;
                synchronized (g.f2129) {
                    char[] cArr2 = f2707;
                    char c10 = f2706;
                    char[] cArr3 = new char[i11];
                    if (i11 % 2 != 0) {
                        i11--;
                        cArr3[i11] = (char) (cArr[i11] - b10);
                    }
                    if (i11 > 1) {
                        g.f2134 = 0;
                        while (true) {
                            int i12 = g.f2134;
                            if (i12 >= i11) {
                                break;
                            }
                            g.f2133 = cArr[i12];
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
                                    int i13 = (g.f2132 * c10) + g.f2130;
                                    int i14 = (g.f2135 * c10) + g.f2128;
                                    int i15 = g.f2134;
                                    cArr3[i15] = cArr2[i13];
                                    cArr3[i15 + 1] = cArr2[i14];
                                } else if (g.f2132 == g.f2135) {
                                    g.f2130 = ((g.f2130 + c10) - 1) % c10;
                                    g.f2128 = ((g.f2128 + c10) - 1) % c10;
                                    int i16 = (g.f2132 * c10) + g.f2130;
                                    int i17 = (g.f2135 * c10) + g.f2128;
                                    int i18 = g.f2134;
                                    cArr3[i18] = cArr2[i16];
                                    cArr3[i18 + 1] = cArr2[i17];
                                } else {
                                    int i19 = (g.f2132 * c10) + g.f2128;
                                    int i20 = (g.f2135 * c10) + g.f2130;
                                    int i21 = g.f2134;
                                    cArr3[i21] = cArr2[i19];
                                    cArr3[i21 + 1] = cArr2[i20];
                                }
                            }
                            g.f2134 += 2;
                        }
                    }
                    str2 = new String(cArr3);
                }
                return str2;
            }
        });
        int i11 = f2677 + 91;
        f2676 = i11 % 128;
        if ((i11 % 2 != 0 ? 'J' : '$') == '$') {
        } else {
            throw null;
        }
    }

    private ja(String str, String str2, je jeVar, byte b10) {
        this.f2683 = str2;
        this.f2682 = 10000;
        this.f2681 = str;
        this.f2680 = jeVar;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static /* synthetic */ String m2578(ja jaVar, String str) {
        int i10 = f2676 + 9;
        f2677 = i10 % 128;
        int i11 = i10 % 2;
        String strM2584 = jaVar.m2584(str);
        int i12 = f2676 + 85;
        f2677 = i12 % 128;
        int i13 = i12 % 2;
        return strM2584;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static jb m2579(JSONObject jSONObject) {
        jb jbVar = new jb(jSONObject);
        int i10 = f2677 + 69;
        f2676 = i10 % 128;
        int i11 = i10 % 2;
        return jbVar;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m2583(jb jbVar) {
        int i10 = f2676 + 87;
        f2677 = i10 % 128;
        boolean z10 = i10 % 2 != 0;
        String strM2584 = m2584(jbVar.m2596());
        if (!z10) {
            int i11 = 43 / 0;
        }
        int i12 = f2676 + 103;
        f2677 = i12 % 128;
        int i13 = i12 % 2;
        return strM2584;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static /* synthetic */ String m2587(ja jaVar, jb jbVar) {
        int i10 = f2676 + 81;
        f2677 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        String strM2583 = jaVar.m2583(jbVar);
        if (z10) {
            int i11 = 66 / 0;
        }
        return strM2583;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2589(final d dVar) {
        je.m2630().post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.1

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f2684 = 1;

            /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
            private static long f2685 = -6446053649878059917L;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static char[] f2686 = {'*'};

            /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
            private static int f2687;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static String m2592(int i10, char c10, int i11) {
                String str;
                synchronized (com.ironsource.adqualitysdk.sdk.i.d.f1653) {
                    char[] cArr = new char[i11];
                    com.ironsource.adqualitysdk.sdk.i.d.f1652 = 0;
                    while (true) {
                        int i12 = com.ironsource.adqualitysdk.sdk.i.d.f1652;
                        if (i12 < i11) {
                            cArr[i12] = (char) ((((long) f2686[i10 + i12]) ^ (((long) i12) * f2685)) ^ ((long) c10));
                            com.ironsource.adqualitysdk.sdk.i.d.f1652 = i12 + 1;
                        } else {
                            str = new String(cArr);
                        }
                    }
                }
                return str;
            }

            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                final int iM2639 = ja.m2586(ja.this).m2639(ja.m2578(ja.this, m2592(1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (char) (TextUtils.lastIndexOf("", '0', 0) + 1), -TextUtils.lastIndexOf("", '0', 0)).intern()));
                t.m3000(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.1.5
                    @Override // com.ironsource.adqualitysdk.sdk.i.ir
                    /* JADX INFO: renamed from: ﾒ */
                    public final void mo276() {
                        dVar.mo386(iM2639);
                    }
                });
                int i10 = f2687 + 105;
                f2684 = i10 % 128;
                int i11 = i10 % 2;
            }
        });
        int i10 = f2676 + 17;
        f2677 = i10 % 128;
        if (i10 % 2 == 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private String m2580() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(m2582("\u0001\u0002\u0003\u0000\u0005\u0006\u0007\u0004\t\u0000\b\u0005\u000b\b", 14 - (ViewConfiguration.getWindowTouchSlop() >> 8), (byte) (96 - TextUtils.indexOf("", ""))).intern());
        sb2.append(this.f2681);
        sb2.append(m2582("\u009a", 1 - View.resolveSizeAndState(0, 0, 0), (byte) (113 - TextUtils.getTrimmedLength(""))).intern());
        String string = sb2.toString();
        int i10 = f2677 + 121;
        f2676 = i10 % 128;
        int i11 = i10 % 2;
        return string;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private String m2584(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f2683);
        sb2.append(str);
        String string = sb2.toString();
        int i10 = f2677 + 29;
        f2676 = i10 % 128;
        if ((i10 % 2 != 0 ? '!' : 'W') == 'W') {
            return string;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public final void m2590(final jb jbVar, final ir irVar) {
        je.m2630().post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.2

            /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
            private static short[] f2692 = null;

            /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
            private static byte[] f2693 = {-77, -66, 98, 106, 83, 103, 95, -123, 82, 97, 105, 102, -126, -33, -67, -86, -89, -76, -97, -5, 90, -81, -75, -14, 83, -64, -90, -9, 103, -86, -78, -101, -81, -89, -83, -1, 88, -69, -86, -13, 88, -7, 101, -71, -54, -49, -85, 105, -81, -85, -18, 89, -74, -11, 89, -74, -83, -64, -63, 8, 83, 64, 61, 74, 53, -111, -5, 59, 71, 67, 71, 68, 96};

            /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
            private static int f2694 = 0;

            /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
            private static int f2695 = 1;

            /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
            private static int f2696 = 983354943;

            /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
            private static int f2697 = 78;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static int f2698 = 541533712;

            /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
            private static String m2593(int i10, short s10, int i11, byte b10, int i12) {
                String string;
                synchronized (o.f2993) {
                    StringBuilder sb2 = new StringBuilder();
                    int i13 = f2697;
                    int i14 = i12 + i13;
                    boolean z10 = i14 == -1;
                    if (z10) {
                        byte[] bArr = f2693;
                        i14 = bArr != null ? (byte) (bArr[f2698 + i10] + i13) : (short) (f2692[f2698 + i10] + i13);
                    }
                    if (i14 > 0) {
                        o.f2994 = ((i10 + i14) - 2) + f2698 + (z10 ? 1 : 0);
                        o.f2995 = b10;
                        char c10 = (char) (i11 + f2696);
                        o.f2997 = c10;
                        sb2.append(c10);
                        o.f2996 = o.f2997;
                        o.f2998 = 1;
                        while (o.f2998 < i14) {
                            byte[] bArr2 = f2693;
                            if (bArr2 != null) {
                                int i15 = o.f2994;
                                o.f2994 = i15 - 1;
                                o.f2997 = (char) (o.f2996 + (((byte) (bArr2[i15] + s10)) ^ o.f2995));
                            } else {
                                short[] sArr = f2692;
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
            public final void mo276() {
                int i10 = f2695 + 27;
                f2694 = i10 % 128;
                int i11 = i10 % 2;
                if (ja.m2586(ja.this).m2639(ja.m2578(ja.this, m2593((-558310928) - Color.rgb(0, 0, 0), (short) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + (-40)), (-983354902) - TextUtils.lastIndexOf("", '0', 0, 0), (byte) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + (-79)).intern())) <= ja.m2585(ja.this)) {
                    String strM2587 = ja.m2587(ja.this, jbVar);
                    if (TextUtils.isEmpty(strM2587)) {
                        int i12 = f2694 + 47;
                        f2695 = i12 % 128;
                        int i13 = i12 % 2;
                        k.m2815(ja.m2581(ja.this), m2593(KeyEvent.normalizeMetaState(0) - 541533711, (short) ((-100) - (Process.myTid() >> 22)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 983354877, (byte) KeyEvent.getDeadChar(0, 0), Drawable.resolveOpacity(0, 0) - 79).intern(), m2593((-541533699) - ExpandableListView.getPackedPositionType(0L), (short) (View.resolveSize(0, 0) + 84), (-983354859) - View.MeasureSpec.makeMeasureSpec(0, 0), (byte) KeyEvent.keyCodeFromString(""), View.resolveSize(0, 0) - 79).intern(), true);
                        return;
                    }
                    try {
                        String string = jbVar.m2598().toString();
                        int i14 = f2694 + 107;
                        f2695 = i14 % 128;
                        int i15 = i14 % 2;
                        k.m2823(ja.m2581(ja.this), m2593((-541533711) - TextUtils.indexOf("", "", 0), (short) (TextUtils.indexOf("", "", 0) - 100), (-983354876) - Color.alpha(0), (byte) TextUtils.indexOf("", "", 0), (ViewConfiguration.getLongPressTimeout() >> 16) - 79).intern(), m2593((-541533654) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (short) ((-66) - (ViewConfiguration.getPressedStateDuration() >> 16)), (ViewConfiguration.getEdgeSlop() >> 16) - 983354876, (byte) Color.blue(0), (-79) - (KeyEvent.getMaxKeyCode() >> 16)).intern(), string, true);
                        ja.m2586(ja.this).m2638(strM2587, string);
                    } catch (JSONException unused) {
                        return;
                    }
                }
                ir irVar2 = irVar;
                if ((irVar2 != null ? 'S' : (char) 18) != 'S') {
                    return;
                }
                t.m3000(irVar2);
            }
        });
        int i10 = f2676 + 73;
        f2677 = i10 % 128;
        if ((i10 % 2 == 0 ? '-' : (char) 31) == 31) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public final void m2591(final jb jbVar) {
        je.m2630().post(new ir() { // from class: com.ironsource.adqualitysdk.sdk.i.ja.4
            @Override // com.ironsource.adqualitysdk.sdk.i.ir
            /* JADX INFO: renamed from: ﾒ */
            public final void mo276() {
                ja.m2586(ja.this).m2634(ja.m2587(ja.this, jbVar));
            }
        });
        int i10 = f2676 + 63;
        f2677 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2582(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2129) {
            char[] cArr2 = f2679;
            char c10 = f2678;
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
}
