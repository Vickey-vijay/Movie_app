package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class bc {

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int f757 = 0;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char[] f758 = null;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f759 = 1;

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static char f760;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static boolean f761;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean f762;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Map<String, List<? extends gl>> f763;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static char[] f764;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static int f765;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static List<String> f766;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    public static void m793() {
        f762 = true;
        f761 = true;
        f765 = 20;
        f764 = new char[]{'U', 'x', 'e', 137, 'u', 128, '}', 136, 141, 'g', '|', 134, 'y', '^', 138, 'W', 'i', 130, 135, 'a', 131, 'v', 132, '`', '{', ']', 'w', 'V', 'X', 129, 142, 'Z', '\\', 'l', 'c', 'd', 'b', 'h', 'm', 140};
        f760 = (char) 6;
        f758 = new char[]{'A', 'd', 'Q', 'S', 'h', 'a', 'r', 'e', 'U', 't', 'i', 'l', 's', 'I', 'o', 'n', 'u', 'c', 'F', 'b', 'k', 'B', 'V', 'g', 'M', 'T', 'p', 'j', 'y', 'm', 'w', 'C', 'D', 'E', 'G', 'H'};
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static Map<String, List<gl>> m795() {
        ArrayList<String> arrayList = new ArrayList(f763.keySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : arrayList) {
            List<? extends gl> list = f763.get(str);
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                Iterator<? extends gl> it = list.iterator();
                while (true) {
                    if ((it.hasNext() ? '$' : 'B') == 'B') {
                        break;
                    }
                    gl next = it.next();
                    if (m802(next)) {
                        int i10 = f757 + 87;
                        f759 = i10 % 128;
                        int i11 = i10 % 2;
                        arrayList2.add(next);
                    }
                }
                linkedHashMap.put(str, arrayList2);
                int i12 = f759 + 31;
                f757 = i12 % 128;
                int i13 = i12 % 2;
            }
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static List<? extends gl> m798(gl... glVarArr) {
        int i10 = f759 + 63;
        f757 = i10 % 128;
        int i11 = i10 % 2;
        List<? extends gl> listAsList = Arrays.asList(glVarArr);
        int i12 = f757 + 33;
        f759 = i12 % 128;
        int i13 = i12 % 2;
        return listAsList;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static String m801() {
        int i10 = f757 + 117;
        f759 = i10 % 128;
        int i11 = i10 % 2;
        String strIntern = m796(null, 127 - TextUtils.getCapsMode("", 0, 0), null, "\u0082\u008d\u008c\u0085\u008b\u008a\u0089\u0088\u0087\u0086\u0085\u0084\u0083\u0082\u0081").intern();
        int i12 = f759 + 5;
        f757 = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
        return strIntern;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static List<gl> m797() {
        List<gl> listAsList = Arrays.asList(new fz(), new gc(), new ft());
        int i10 = f759 + 9;
        f757 = i10 % 128;
        if ((i10 % 2 != 0 ? '@' : 'S') == 'S') {
            return listAsList;
        }
        int i11 = 36 / 0;
        return listAsList;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static gl m799() {
        ga gaVar = new ga();
        int i10 = f759 + 57;
        f757 = i10 % 128;
        if ((i10 % 2 != 0 ? '\'' : (char) 24) == 24) {
            return gaVar;
        }
        int i11 = 87 / 0;
        return gaVar;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static List<String> m800() {
        int i10 = f757 + 15;
        f759 = i10 % 128;
        if ((i10 % 2 == 0 ? 'G' : ':') == ':') {
            return f766;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003b A[Catch: all -> 0x0049, TRY_LEAVE, TryCatch #0 {all -> 0x0049, blocks: (B:8:0x0016, B:19:0x0033, B:20:0x003b, B:14:0x0025), top: B:24:0x0014 }] */
    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static boolean m802(gl glVar) {
        int i10 = f759 + 69;
        f757 = i10 % 128;
        try {
            if ((i10 % 2 != 0 ? (char) 31 : (char) 19) != 31) {
                if ((Prode.m241() ? 'S' : '\\') != 'S') {
                    Class.forName(glVar.mo2199());
                } else {
                    glVar.mo2200();
                }
            } else {
                int i11 = 46 / 0;
                if (!(Prode.m241())) {
                    Class.forName(glVar.mo2199());
                } else {
                    glVar.mo2200();
                }
            }
            int i12 = f759 + 97;
            f757 = i12 % 128;
            int i13 = i12 % 2;
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    static {
        m793();
        f766 = Arrays.asList(m794("\u0001\u0002\u0003\u0004\u0005\u0000\u0007\b\u0002\u0007\n\u000b\u0006\u0011", 14 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (byte) (((Process.getThreadPriority(0) + 20) >> 6) + 60)).intern(), m796(null, 126 - ImageFormat.getBitsPerPixel(0), null, "\u008a\u008e\u0082\u008d\u008c\u0085\u008b\u008a\u0083\u0082\u0081").intern(), m796(null, View.getDefaultSize(0, 0) + 127, null, "\u008f\u0088\u0090\u008f\u0082\u0081\u0082\u008d\u008c\u0085\u008b\u008a\u0083\u0082\u0081").intern());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(m794("\f\u0007\u000f\u0010\u0002\u000f\f\n\r\u000b", 10 - (Process.myPid() >> 22), (byte) (Color.rgb(0, 0, 0) + 16777219)).intern(), m798(new gr()));
        linkedHashMap.put(m796(null, TextUtils.lastIndexOf("", '0') + 128, null, "\u0093\u0082\u0081\u0089\u0088\u0087\u0092\u0091").intern(), m798(new gz(), new gz.d()));
        linkedHashMap.put(m796(null, 127 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)), null, "\u0096\u0095\u0094\u0082\u0081").intern(), m798(new fx()));
        linkedHashMap.put(m796(null, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 127, null, "\u0092\u0087\u008f\u0095\u0098\u0097\u0097\u0081").intern(), m798(new gb()));
        linkedHashMap.put(m794("\u0017\u0000\r\u000b\u0014\r\u0014\u001a", 8 - KeyEvent.keyCodeFromString(""), (byte) (62 - Color.green(0))).intern(), m798(new gd()));
        linkedHashMap.put(m796(null, ImageFormat.getBitsPerPixel(0) + 128, null, "\u0086\u0085\u008c\u0099\u008d\u0088\u0092\u0087\u0094").intern(), m798(new gq.c(), new gq.d()));
        linkedHashMap.put(m794("\u0017\u0000\u000b\u0007\u0016\t¢", Process.getGidForName("") + 8, (byte) ((ViewConfiguration.getPressedStateDuration() >> 16) + 62)).intern(), m798(new gg()));
        linkedHashMap.put(m796(null, Color.argb(0, 0, 0, 0) + 127, null, "\u008d\u008f\u0087\u0088\u009b\u0085\u008c\u008d\u0092\u0092\u009a").intern(), m798(new gi()));
        linkedHashMap.put(m794("\u001c\u0016\u0011\u0015\u0006\b", 6 - (Process.myTid() >> 22), (byte) (75 - ((Process.getThreadPriority(0) + 20) >> 6))).intern(), m798(new gy.e(), new gy.a()));
        linkedHashMap.put(m796(null, (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 127, null, "\u008d\u009b\u0092\u0085\u009d\u008d\u0088\u0089\u009c").intern(), m798(new gf.e(), new gf.c()));
        linkedHashMap.put(m796(null, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 126, null, "\u0095\u009b\u0095\u0086\u0095\u0094").intern(), m798(new go()));
        linkedHashMap.put(m796(null, 127 - (ViewConfiguration.getScrollBarSize() >> 8), null, "\u0088\u0093\u0095\u0095\u0096\u0088\u008c\u0085\u008b\u0090").intern(), m798(new ge()));
        linkedHashMap.put(m794("\u000e\u0010\u001a\f\u0016\u0007", 6 - (ViewConfiguration.getJumpTapTimeout() >> 16), (byte) (19 - View.getDefaultSize(0, 0))).intern(), m798(new gm()));
        linkedHashMap.put(m794("\u001d\u0001\u001b\u001c\u0010\u001a", (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 5, (byte) (120 - TextUtils.getOffsetBefore("", 0))).intern(), m798(new gw()));
        linkedHashMap.put(m796(null, 127 - (ViewConfiguration.getFadingEdgeLength() >> 16), null, "\u0093\u0097\u0081\u0092\u0095\u009f\u0085\u009e\u0081").intern(), m798(new fy()));
        linkedHashMap.put(m794("\u0016\t\u0000\u0019\u000b\u0017\n\u0010\r\t", 10 - Color.red(0), (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 59)).intern(), m798(new gh()));
        linkedHashMap.put(m796(null, TextUtils.indexOf("", "") + 127, null, "\u0082\u0081\u008d\u008f\u0087 ").intern(), m798(new gj()));
        linkedHashMap.put(m796(null, 127 - Color.blue(0), null, "¢\u0094\u008c\u0097\u0089¡").intern(), m798(new gk()));
        linkedHashMap.put(m794("\u001d\u0000\b\u0010", 4 - (ViewConfiguration.getPressedStateDuration() >> 16), (byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 37)).intern(), m798(new gp()));
        linkedHashMap.put(m794("\u0019\u001d\u001d\u0001\u000b\u0012\b\n", 7 - TextUtils.indexOf((CharSequence) "", '0'), (byte) (10 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)))).intern(), m798(new gn()));
        linkedHashMap.put(m796(null, 126 - TextUtils.lastIndexOf("", '0', 0, 0), null, "\u0089\u008c\u0084\u0099£").intern(), m798(new gs(), new gs.a()));
        linkedHashMap.put(m796(null, 175 - AndroidCharacter.getMirror('0'), null, "\u008d\u008f\u0087\u0088\u0085¥\u0096\u0084¤").intern(), m798(new gt()));
        linkedHashMap.put(m794("\u0005\u001bnn\b\u000f", 7 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (byte) (13 - View.combineMeasuredStates(0, 0))).intern(), m798(new gv()));
        linkedHashMap.put(m794("\u0004\u000f\u0019\b\f\u0006\u001f\u0006\r\u000f\u0019\u000b", 12 - View.MeasureSpec.getMode(0), (byte) (Process.getGidForName("") + 11)).intern(), m798(new gu()));
        linkedHashMap.put(m796(null, 126 - TextUtils.lastIndexOf("", '0', 0, 0), null, "\u0088\u0092\u008d\u009b\u0092\u008d¦").intern(), m798(new ha()));
        linkedHashMap.put(m796(null, 126 - TextUtils.lastIndexOf("", '0', 0, 0), null, "¨\u008d\u0082\u0092\u0085§").intern(), m798(new gx()));
        f763 = Collections.unmodifiableMap(linkedHashMap);
        int i10 = f759 + 75;
        f757 = i10 % 128;
        int i11 = i10 % 2;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m796(String str, int i10, int[] iArr, String str2) throws UnsupportedEncodingException {
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
            char[] cArr2 = f764;
            int i11 = f765;
            if (f761) {
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
            if (f762) {
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

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m794(String str, int i10, byte b10) {
        String str2;
        Object charArray = str;
        if (str != null) {
            charArray = str.toCharArray();
        }
        char[] cArr = (char[]) charArray;
        synchronized (g.f2129) {
            char[] cArr2 = f758;
            char c10 = f760;
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
