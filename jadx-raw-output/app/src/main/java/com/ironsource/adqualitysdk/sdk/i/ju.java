package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.media.MediaPlayer;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public final class ju {

    /* JADX INFO: renamed from: ﭖ, reason: contains not printable characters */
    private static int f2896 = 1;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static int f2898;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static Field f2901;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Class f2902;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static Field f2903;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static Field f2904;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Field f2905;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Object f2906;

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static char[] f2897 = {42624, 61335, 13493, 32219, 33518, 52208, 4117, 22887, 61015, 14160, 31860, 33438, 52207, 4238, 23000, 61159, 14085, 31766, 34086, 51812, 4960, 22647, 61072, 14254, 31940, 34251, 51928, 4868, 22577, 57653, 26048, 11479, 63477, 48795, 16814, 2224, 54101, 39463, 11543, 62480, 48948, 16862, 2223, 54222, 39576, 11687, 62533, 48982, 18022, 2340, 53280, 39735, 11728, 62702, 49028, 18059, 2454, 53317, 39790, 8827, 62736, 48165, 30179, 15564, 59364, 44673, 20916, 6398, 50001, 35435, 15634, 58378, 44863, 20928, 6369, 50110, 35489, 15783, 58440, 44890, 22137, 6425, 49163, 35647, 15832, 58607, 44929, 22171, 6564, 49166, 35696, 12919, 58643, 44089, 22229, 6532, 49334, 65232, 47082, 27875, 9633, 55986, 37808, 18510, 381, 46641, 28428, 9278, 56001, 37880, 18667, 392, 46759, 'm', 18773, 37461, 56108, 9225, 27929, 46784, 65476, 18593, 37281, 55957, 9338, 'm', 18775, 37470, 56088, 9234, 27933, 46816, 65481, 18610, 37309, 55956, 9284, 27977, 46667, 65316, 18445, 37358, 56061, 9154, 'e', 18794, 37442, 56103, 9234, 27992, 46841, 65478, 18656, 37290, 55957, 9336, 27980, 46681, 65331, 18445, 37327, 56054, 9187, 27821, 46469, 65171, 18515, 37191, 55853, 9000, 27676, 46573, 65236, 18397, 37020, 55681, 9075, 27756, 46421, 65062, 18181, 36874, 'm', 18772, 37465, 56123, 9236, 27933, 46846, 65485, 18610, 37265, 55966, 9326, 27983, 7600, 21695, 36759, 50930, 14791, 28813, 43820, 57875, 21813, 35946, 51008, 14761, 28849, 43912, 58086, 21969, 35892, 51007, 15872, 29049, 43123, 58180, 21920, 35985, 51185};

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private static long f2900 = -5729520482673932008L;

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int[] f2899 = {1693989859, -1419725378, 1431591262, -530433451, 1416486627, 809395253, -709092733, -1795350470, 1541501394, 1205832009, -445660515, 1390802248, -1844616202, -1506937805, 1381387, -1625508086, 1823734382, 2054553513};

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static List<View> m2739() {
        char c10 = '[';
        int i10 = f2896 + 91;
        int i11 = i10 % 128;
        f2898 = i11;
        try {
            if (i10 % 2 != 0) {
                throw null;
            }
            if (f2902 != null) {
                int i12 = i11 + 81;
                f2896 = i12 % 128;
                if (!(i12 % 2 != 0)) {
                    throw null;
                }
                if (f2906 != null) {
                    c10 = 'P';
                }
                if (c10 != 'P') {
                    Class<?> cls = Class.forName(m2743(30 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (26017 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 32 - KeyEvent.normalizeMetaState(0)).intern());
                    f2902 = cls;
                    f2906 = cls.getMethod(m2749(new int[]{556890859, -1468128419, -2136236283, -1844955760, 351355317, 413759009}, TextUtils.getOffsetAfter("", 0) + 11).intern(), new Class[0]).invoke(null, new Object[0]);
                    int i13 = f2896 + 69;
                    f2898 = i13 % 128;
                    int i14 = i13 % 2;
                }
            } else {
                Class<?> cls2 = Class.forName(m2743(30 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) (26017 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), 32 - KeyEvent.normalizeMetaState(0)).intern());
                f2902 = cls2;
                f2906 = cls2.getMethod(m2749(new int[]{556890859, -1468128419, -2136236283, -1844955760, 351355317, 413759009}, TextUtils.getOffsetAfter("", 0) + 11).intern(), new Class[0]).invoke(null, new Object[0]);
                int i15 = f2896 + 69;
                f2898 = i15 % 128;
                int i16 = i15 % 2;
            }
            return m2750(f2902, f2906);
        } catch (Throwable th2) {
            String strIntern = m2749(new int[]{-642031777, 1170809071, -1015588550, -841414955, -985600592, -356310217}, View.resolveSizeAndState(0, 0, 0) + 12).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2743(View.resolveSizeAndState(0, 0, 0) + 62, (char) (Gravity.getAbsoluteGravity(0, 0) + 30118), View.resolveSizeAndState(0, 0, 0) + 35).intern());
            sb2.append(th2.getLocalizedMessage());
            k.m2809(strIntern, sb2.toString());
            return new ArrayList();
        }
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static View.OnClickListener m2742(View view) {
        try {
            Object objM2746 = m2746(view);
            if (objM2746 == null) {
                return null;
            }
            Class<?> cls = objM2746.getClass();
            synchronized (jx.class) {
                if (f2903 == null) {
                    f2903 = m2738(cls, m2749(new int[]{1647960652, 67504897, 741322149, -1831457172, 985675184, 2052053239, 1182144666, -1060623268}, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 16).intern());
                }
            }
            return (View.OnClickListener) f2903.get(objM2746);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v26 */
    /* JADX WARN: Type inference failed for: r4v27 */
    /* JADX WARN: Type inference failed for: r4v28 */
    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2747(MediaPlayer mediaPlayer, hc.c cVar) {
        int i10;
        Field fieldM2738;
        MediaPlayer.OnInfoListener onInfoListener;
        int i11 = f2898 + 31;
        f2896 = i11 % 128;
        ?? r10 = 1;
        try {
            try {
                if (!(i11 % 2 != 0)) {
                    int[] iArr = new int[8];
                    iArr[0] = -1895515866;
                    iArr[1] = 2007252617;
                    iArr[2] = -855096600;
                    iArr[3] = -395418748;
                    iArr[4] = -2032507226;
                    iArr[5] = -2124753146;
                    iArr[6] = -1700934117;
                    iArr[7] = -1787212973;
                    fieldM2738 = m2738(MediaPlayer.class, m2749(iArr, 35 << (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))).intern());
                    MediaPlayer.OnInfoListener onInfoListener2 = (MediaPlayer.OnInfoListener) fieldM2738.get(mediaPlayer);
                    boolean z10 = onInfoListener2 instanceof hc;
                    r10 = onInfoListener2;
                    if (!z10) {
                        onInfoListener = onInfoListener2;
                        fieldM2738.set(mediaPlayer, new hc(onInfoListener, cVar));
                        int i12 = f2896 + 41;
                        f2898 = i12 % 128;
                        int i13 = i12 % 2;
                        r10 = onInfoListener;
                    }
                } else {
                    int[] iArr2 = new int[8];
                    iArr2[0] = -1895515866;
                    iArr2[1] = 2007252617;
                    iArr2[2] = -855096600;
                    iArr2[3] = -395418748;
                    iArr2[4] = -2032507226;
                    iArr2[5] = -2124753146;
                    iArr2[6] = -1700934117;
                    iArr2[7] = -1787212973;
                    fieldM2738 = m2738(MediaPlayer.class, m2749(iArr2, (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 14).intern());
                    MediaPlayer.OnInfoListener onInfoListener3 = (MediaPlayer.OnInfoListener) fieldM2738.get(mediaPlayer);
                    boolean z11 = onInfoListener3 instanceof hc;
                    onInfoListener = onInfoListener3;
                    r10 = onInfoListener3;
                    if (!z11) {
                        fieldM2738.set(mediaPlayer, new hc(onInfoListener, cVar));
                        int i14 = f2896 + 41;
                        f2898 = i14 % 128;
                        int i15 = i14 % 2;
                        r10 = onInfoListener;
                    }
                }
            } catch (Exception e10) {
                e = e10;
                i10 = 6;
                int[] iArr3 = new int[i10];
                // fill-array-data instruction
                iArr3[0] = -642031777;
                iArr3[1] = 1170809071;
                iArr3[2] = -1015588550;
                iArr3[3] = -841414955;
                iArr3[4] = -985600592;
                iArr3[5] = -356310217;
                kd.m2872(m2749(iArr3, 12 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), m2749(new int[]{1202942275, 1897688176, -829805524, -1025134213, 1116418967, 1798637843, -175482886, -479946770, -271803417, 1054543464, -1928011288, 901128282, -855096600, -395418748, -2032507226, -2124753146, -1700934117, -1787212973}, 34 - MotionEvent.axisFromString("")).intern(), e, false);
            }
        } catch (Exception e11) {
            e = e11;
            i10 = r10;
            int[] iArr4 = new int[i10];
            // fill-array-data instruction
            iArr4[0] = -642031777;
            iArr4[1] = 1170809071;
            iArr4[2] = -1015588550;
            iArr4[3] = -841414955;
            iArr4[4] = -985600592;
            iArr4[5] = -356310217;
            kd.m2872(m2749(iArr4, 12 - (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern(), m2749(new int[]{1202942275, 1897688176, -829805524, -1025134213, 1116418967, 1798637843, -175482886, -479946770, -271803417, 1054543464, -1928011288, 901128282, -855096600, -395418748, -2032507226, -2124753146, -1700934117, -1787212973}, 34 - MotionEvent.axisFromString("")).intern(), e, false);
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static List<View> m2750(Class cls, Object obj) throws Exception {
        if (f2905 == null) {
            int i10 = f2898 + 77;
            f2896 = i10 % 128;
            int i11 = i10 % 2;
            Field declaredField = cls.getDeclaredField(m2749(new int[]{1263426752, 2116323096, 488600841, 147584518}, 5 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern());
            f2905 = declaredField;
            declaredField.setAccessible(true);
        }
        Object obj2 = f2905.get(obj);
        if (obj2 instanceof List) {
            int i12 = f2896 + 89;
            f2898 = i12 % 128;
            if (i12 % 2 == 0) {
                return (List) f2905.get(obj);
            }
            List<View> list = (List) f2905.get(obj);
            int i13 = 45 / 0;
            return list;
        }
        if (!(obj2 instanceof View[])) {
            return new ArrayList();
        }
        List<View> listAsList = Arrays.asList((View[]) f2905.get(obj));
        int i14 = f2896 + 53;
        f2898 = i14 % 128;
        int i15 = i14 % 2;
        return listAsList;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static void m2744(MediaPlayer mediaPlayer, hj.c cVar) {
        int i10 = f2896 + 23;
        f2898 = i10 % 128;
        int i11 = i10 % 2;
        try {
            Field fieldM2738 = m2738(MediaPlayer.class, m2749(new int[]{311139306, -1643041027, 1131013996, 1064934420, -660697305, -992132226, -556094993, 686564194, -2032507226, -2124753146, -1700934117, -1787212973}, 23 - TextUtils.indexOf("", "", 0, 0)).intern());
            MediaPlayer.OnSeekCompleteListener onSeekCompleteListener = (MediaPlayer.OnSeekCompleteListener) fieldM2738.get(mediaPlayer);
            if (onSeekCompleteListener instanceof hj) {
                return;
            }
            fieldM2738.set(mediaPlayer, new hj(onSeekCompleteListener, cVar));
            int i12 = f2898 + 125;
            f2896 = i12 % 128;
            int i13 = i12 % 2;
        } catch (Exception e10) {
            kd.m2872(m2749(new int[]{-642031777, 1170809071, -1015588550, -841414955, -985600592, -356310217}, (ViewConfiguration.getJumpTapTimeout() >> 16) + 12).intern(), m2743((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 144, (char) (Process.getGidForName("") + 1), 38 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern(), e10, false);
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2748(MediaPlayer mediaPlayer, he.a aVar) {
        Field fieldM2738;
        MediaPlayer.OnPreparedListener onPreparedListener;
        int i10 = f2898 + 11;
        f2896 = i10 % 128;
        try {
            if ((i10 % 2 == 0 ? 'V' : (char) 18) != 'V') {
                fieldM2738 = m2738(MediaPlayer.class, m2743(125 - View.MeasureSpec.makeMeasureSpec(0, 0), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 19 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern());
                onPreparedListener = (MediaPlayer.OnPreparedListener) fieldM2738.get(mediaPlayer);
                if (!(onPreparedListener instanceof he)) {
                    fieldM2738.set(mediaPlayer, new he(onPreparedListener, aVar));
                }
            } else {
                fieldM2738 = m2738(MediaPlayer.class, m2743(107 % View.MeasureSpec.makeMeasureSpec(1, 0), (char) (ViewConfiguration.getScrollBarFadeDuration() >> 75), 36 - (ViewConfiguration.getJumpTapTimeout() >>> 97)).intern());
                onPreparedListener = (MediaPlayer.OnPreparedListener) fieldM2738.get(mediaPlayer);
                if (!(onPreparedListener instanceof he)) {
                    fieldM2738.set(mediaPlayer, new he(onPreparedListener, aVar));
                }
            }
            int i11 = f2896 + 63;
            f2898 = i11 % 128;
            if ((i11 % 2 != 0 ? '8' : 'P') != '8') {
            } else {
                throw null;
            }
        } catch (Exception e10) {
            kd.m2872(m2749(new int[]{-642031777, 1170809071, -1015588550, -841414955, -985600592, -356310217}, ExpandableListView.getPackedPositionGroup(0L) + 12).intern(), m2749(new int[]{1202942275, 1897688176, -829805524, -1025134213, 1116418967, 1798637843, -175482886, -479946770, -271803417, 1054543464, 1986917678, 1957659000, -1494872016, 1653228110, 177372123, -1175409444, -2032507226, -2124753146, -1700934117, -1787212973}, 39 - Gravity.getAbsoluteGravity(0, 0)).intern(), e10, false);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2741(View view, hd.d dVar) {
        int i10 = f2898 + 113;
        f2896 = i10 % 128;
        if ((i10 % 2 == 0 ? (char) 1 : (char) 22) == 22) {
            View.OnClickListener onClickListenerM2742 = m2742(view);
            if (onClickListenerM2742 instanceof hd) {
                return;
            }
            view.setOnClickListener(new hd(onClickListenerM2742, dVar));
            int i11 = f2896 + 123;
            f2898 = i11 % 128;
            int i12 = i11 % 2;
            return;
        }
        boolean z10 = m2742(view) instanceof hd;
        try {
            throw null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static String m2749(int[] iArr, int i10) {
        String str;
        synchronized (e.f1912) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2899.clone();
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
    public static void m2745(View view, hh.c cVar) {
        int i10 = f2898 + 79;
        f2896 = i10 % 128;
        int i11 = i10 % 2;
        View.OnTouchListener onTouchListenerM2737 = m2737(view);
        if (!(onTouchListenerM2737 instanceof hh)) {
            view.setOnTouchListener(new hh(onTouchListenerM2737, cVar));
        }
        int i12 = f2896 + 73;
        f2898 = i12 % 128;
        if (i12 % 2 == 0) {
            return;
        }
        int i13 = 48 / 0;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2743(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            char[] cArr = new char[i11];
            d.f1652 = 0;
            while (true) {
                int i12 = d.f1652;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f2897[i10 + i12]) ^ (((long) i12) * f2900)) ^ ((long) c10));
                    d.f1652 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static View.OnTouchListener m2737(View view) {
        try {
            Object objM2746 = m2746(view);
            if (objM2746 == null) {
                return null;
            }
            Class<?> cls = objM2746.getClass();
            synchronized (jx.class) {
                if (f2901 == null) {
                    f2901 = m2738(cls, m2743(97 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (char) ((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 65212), '@' - AndroidCharacter.getMirror('0')).intern());
                }
            }
            return (View.OnTouchListener) f2901.get(objM2746);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Object m2746(View view) {
        try {
            synchronized (jx.class) {
                if (f2904 == null) {
                    f2904 = m2738(View.class, m2743(182 - (ViewConfiguration.getTouchSlop() >> 8), (char) TextUtils.getTrimmedLength(""), 13 - TextUtils.getOffsetAfter("", 0)).intern());
                }
            }
            return f2904.get(view);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0068, code lost:
    
        if (r2 != 'O') goto L21;
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.media.MediaPlayer m2736(android.widget.VideoView r8) {
        /*
            Method dump skipped, instruction units count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.ju.m2736(android.widget.VideoView):android.media.MediaPlayer");
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    public static void m2740(MediaPlayer mediaPlayer, hf.b bVar) {
        Field fieldM2738;
        MediaPlayer.OnCompletionListener onCompletionListener;
        int i10 = f2898 + 35;
        f2896 = i10 % 128;
        try {
            if ((i10 % 2 == 0 ? (char) 29 : '`') != '`') {
                fieldM2738 = m2738(MediaPlayer.class, m2749(new int[]{1647960652, 67504897, -660697305, -992132226, 992778767, -2108873839, -969657476, 2116265575, 1492887406, -1736412598, 463314251, -255628082}, (ViewConfiguration.getMaximumFlingVelocity() - 4) * 71).intern());
                onCompletionListener = (MediaPlayer.OnCompletionListener) fieldM2738.get(mediaPlayer);
                if (!(onCompletionListener instanceof hf)) {
                    fieldM2738.set(mediaPlayer, new hf(onCompletionListener, bVar));
                }
            } else {
                fieldM2738 = m2738(MediaPlayer.class, m2749(new int[]{1647960652, 67504897, -660697305, -992132226, 992778767, -2108873839, -969657476, 2116265575, 1492887406, -1736412598, 463314251, -255628082}, 21 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern());
                onCompletionListener = (MediaPlayer.OnCompletionListener) fieldM2738.get(mediaPlayer);
                if (!(onCompletionListener instanceof hf)) {
                    fieldM2738.set(mediaPlayer, new hf(onCompletionListener, bVar));
                }
            }
            int i11 = f2896 + 79;
            f2898 = i11 % 128;
            if (i11 % 2 == 0) {
            } else {
                throw null;
            }
        } catch (Exception e10) {
            kd.m2872(m2749(new int[]{-642031777, 1170809071, -1015588550, -841414955, -985600592, -356310217}, 11 - ((byte) KeyEvent.getModifierMetaStateMask())).intern(), m2749(new int[]{1202942275, 1897688176, -829805524, -1025134213, 1116418967, 1798637843, -175482886, -479946770, -271803417, 1054543464, -1524524405, 1676793468, -660697305, -992132226, 992778767, -2108873839, -969657476, 2116265575, 1492887406, -1736412598, 463314251, -255628082}, TextUtils.indexOf("", "", 0, 0) + 41).intern(), e10, false);
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Field m2738(Class cls, String str) {
        Field declaredField;
        int i10 = f2896 + 59;
        f2898 = i10 % 128;
        try {
            if ((i10 % 2 != 0 ? 'J' : (char) 29) != 29) {
                declaredField = cls.getDeclaredField(str);
            } else {
                declaredField = cls.getDeclaredField(str);
            }
            declaredField.setAccessible(true);
            int i11 = f2896 + 97;
            f2898 = i11 % 128;
            int i12 = i11 % 2;
            return declaredField;
        } catch (Exception e10) {
            kd.m2872(m2749(new int[]{-642031777, 1170809071, -1015588550, -841414955, -985600592, -356310217}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13).intern(), m2743(TextUtils.indexOf((CharSequence) "", '0') + 196, (char) (7638 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), TextUtils.getOffsetAfter("", 0) + 25).intern(), e10, false);
            return null;
        }
    }
}
