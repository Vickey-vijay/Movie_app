package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class ka {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2941 = 160;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static int f2942 = 1;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2943;

    public static class a implements InvocationHandler {

        /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
        private static char f2944 = 40850;

        /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
        private static int f2945 = 1;

        /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
        private static int f2946 = 0;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static char f2947 = 24620;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static char f2948 = 33560;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static char f2949 = 58827;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private e f2950;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private Object f2951;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static Object[] m2836(Object[] objArr) {
            int i10 = f2945 + 71;
            f2946 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            if (objArr != null) {
                try {
                    ArrayList arrayList = new ArrayList();
                    int length = objArr.length;
                    int i11 = 0;
                    while (true) {
                        if ((i11 < length ? '6' : '\\') != '6') {
                            objArr = arrayList.toArray();
                            return objArr;
                        }
                        Object obj = objArr[i11];
                        if ((Proxy.isProxyClass(obj.getClass()) ? '^' : (char) 19) != '^') {
                            arrayList.add(obj);
                        } else {
                            int i12 = f2946 + 125;
                            f2945 = i12 % 128;
                            if (i12 % 2 == 0) {
                                arrayList.add(Proxy.getInvocationHandler(obj));
                                int i13 = 32 / 0;
                            } else {
                                arrayList.add(Proxy.getInvocationHandler(obj));
                            }
                        }
                        i11++;
                        int i14 = f2945 + 13;
                        f2946 = i14 % 128;
                        int i15 = i14 % 2;
                    }
                } catch (Throwable th2) {
                    kd.m2872(m2834("ꇥ恎\u244b퇡〾ࣽ잓\udab1賂ꯉ", 10 - (ViewConfiguration.getTouchSlop() >> 8)).intern(), m2834("䓱켈\ue0d1뿐\uf0d0잺̴鐒ꍘ䢭\uf122蜅\uf21e\uf760\uf122蜅ⳛᗋ憿ӏ잓\udab1\uec52빷䶴\ue896\uf6da퍩숕뱥", TextUtils.indexOf("", "") + 29).intern(), th2, true);
                }
            }
            return objArr;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private Object m2838(Method method) {
            int i10 = f2945 + 57;
            f2946 = i10 % 128;
            if (i10 % 2 != 0) {
                throw null;
            }
            if (method != null) {
                String name = method.getName();
                byte b10 = -1;
                if (name.hashCode() == 1622498214) {
                    if ((name.equals(m2834("̴鐒곌䚡\uf855猽❵敒ꋡ텚鼻\uf853瘢瓰귛殧쫰九楿ᦰ", 20 - View.getDefaultSize(0, 0)).intern()) ? 'O' : 'A') == 'O') {
                        int i11 = f2946 + 107;
                        f2945 = i11 % 128;
                        int i12 = i11 % 2;
                        b10 = 0;
                    }
                }
                if (b10 == 0) {
                    return m2837();
                }
            }
            return null;
        }

        @Override // java.lang.reflect.InvocationHandler
        public final Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            int i10 = f2945 + 121;
            f2946 = i10 % 128;
            int i11 = i10 % 2;
            if (!(!m2835(method))) {
                try {
                    return m2838(method);
                } catch (Throwable th2) {
                    String strIntern = m2834("ꇥ恎\u244b퇡〾ࣽ잓\udab1賂ꯉ", 10 - (ViewConfiguration.getJumpTapTimeout() >> 16)).intern();
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(m2834("䓱켈\ue0d1뿐\uf0d0잺\uf122蜅ⳛᗋསꌫ䶴\ue896㝍龴』ά傖鋆近凵壙깊嚽灀料긵鬳\uec12", TextUtils.getTrimmedLength("") + 30).intern());
                    sb2.append(method.getName());
                    kd.m2872(strIntern, sb2.toString(), th2, true);
                    return null;
                }
            }
            try {
                this.f2950.mo1831(obj, method, objArr);
            } catch (Throwable th3) {
                String strIntern2 = m2834("ꇥ恎\u244b퇡〾ࣽ잓\udab1賂ꯉ", 10 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)).intern();
                StringBuilder sb3 = new StringBuilder();
                sb3.append(m2834("䓱켈\ue0d1뿐\uf0d0잺\uf122蜅ⳛᗋསꌫ\ue25b㤺猹嵈\uf52dطᇕ௰ㅿ힘穲뗝", 23 - TextUtils.indexOf("", "")).intern());
                Object obj2 = this.f2951;
                sb3.append(obj2 != null ? obj2.toString() : m2834("鈣虌귛殧", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 3).intern());
                sb3.append(m2834("壙깊嚽灀料긵慒\uefab", TextUtils.getTrimmedLength("") + 8).intern());
                sb3.append(method.getName());
                kd.m2872(strIntern2, sb3.toString(), th3, true);
                int i12 = f2945 + 93;
                f2946 = i12 % 128;
                int i13 = i12 % 2;
            }
            Object obj3 = this.f2951;
            if ((obj3 != null ? (char) 16 : '6') == 16) {
                int i14 = f2946 + 105;
                f2945 = i14 % 128;
                int i15 = i14 % 2;
                return method.invoke(obj3, objArr);
            }
            if (!Object.class.equals(method.getDeclaringClass())) {
                return null;
            }
            int i16 = f2945 + 67;
            f2946 = i16 % 128;
            int i17 = i16 % 2;
            return method.invoke(this, m2836(objArr));
        }

        public a(Object obj, e eVar) {
            this.f2951 = obj;
            this.f2950 = eVar;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private Object m2837() {
            int i10 = f2945 + 23;
            int i11 = i10 % 128;
            f2946 = i11;
            int i12 = i10 % 2;
            Object obj = this.f2951;
            int i13 = i11 + 13;
            f2945 = i13 % 128;
            if ((i13 % 2 == 0 ? (char) 18 : 'W') != 18) {
                return obj;
            }
            throw null;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static boolean m2835(Method method) {
            int i10 = f2946 + 51;
            f2945 = i10 % 128;
            int i11 = i10 % 2;
            String name = method.getName();
            byte b10 = -1;
            if (name.hashCode() == 1622498214) {
                if ((name.equals(m2834("̴鐒곌䚡\uf855猽❵敒ꋡ텚鼻\uf853瘢瓰귛殧쫰九楿ᦰ", (ViewConfiguration.getTouchSlop() >> 8) + 20).intern()) ? (char) 16 : (char) 18) != 18) {
                    b10 = 0;
                }
            }
            if (b10 == 0) {
                return true;
            }
            int i12 = f2946 + 27;
            f2945 = i12 % 128;
            int i13 = i12 % 2;
            return false;
        }

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private static String m2834(String str, int i10) {
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
                            char c12 = (char) (c10 - (((c11 + i12) ^ ((c11 << 4) + f2948)) ^ ((c11 >>> 5) + f2944)));
                            cArr3[1] = c12;
                            cArr3[0] = (char) (c11 - (((c12 >>> 5) + f2949) ^ ((c12 + i12) ^ ((c12 << 4) + f2947))));
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
    }

    public interface e {
        /* JADX INFO: renamed from: ﾇ */
        void mo1831(Object obj, Method method, Object[] objArr);
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static String m2831(String str, int i10, boolean z10, int i11, int i12) {
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
                cArr2[i14] = (char) (cArr2[i14] - f2941);
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

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static boolean m2832(Object obj) {
        int i10 = f2942 + 27;
        int i11 = i10 % 128;
        f2943 = i11;
        int i12 = i10 % 2;
        if (obj != null) {
            int i13 = i11 + 29;
            f2942 = i13 % 128;
            if (i13 % 2 == 0) {
                Proxy.isProxyClass(obj.getClass());
                throw null;
            }
            if ((Proxy.isProxyClass(obj.getClass()) ? '^' : '2') == '^' && (obj instanceof hg)) {
                return true;
            }
        }
        int i14 = f2942 + 43;
        f2943 = i14 % 128;
        if (i14 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Object m2833(Class<?> cls, Object obj, e eVar) {
        try {
            Object objNewProxyInstance = Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(), new Class[]{cls, hg.class}, new a(obj, eVar));
            int i10 = f2942 + 11;
            f2943 = i10 % 128;
            if (!(i10 % 2 != 0)) {
                return objNewProxyInstance;
            }
            throw null;
        } catch (Throwable th2) {
            kd.m2872(m2831("￪\t\ufffe\u0001\b￥\u0007\u0004\r\u000e", (ViewConfiguration.getDoubleTapTimeout() >> 16) + 10, false, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4, 268 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))).intern(), m2831("\f\u000f\u000f￢\u000f\u0002\u0001\ufffe\f￩\u0010\u0010\ufffe\t￠\u0011\u0015\u0002\u0011\u000b\f￠\u0011\u0002\u0004ﾽ\u0005\u0011\u0006\u0014ﾽ\u000f\f\u0011\ufffe\u000f\f\u0000\u0002￡\u0016\u0015\f\u000f￭\u0002\u0011\ufffe\u0002\u000f\u0000ﾽ\u000b\u0006ﾽ\u000f", (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)) + 56, true, (ViewConfiguration.getJumpTapTimeout() >> 16) + 4, 259 - (ViewConfiguration.getEdgeSlop() >> 16)).intern(), th2, true);
            try {
                return Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls, hg.class}, new a(obj, eVar));
            } catch (Throwable th3) {
                kd.m2872(m2831("￪\t\ufffe\u0001\b￥\u0007\u0004\r\u000e", View.combineMeasuredStates(0, 0) + 10, false, 5 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 267 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), m2831("￪\r\uffff\u0002\u0003\u0010￣\u0010\u0010\r\u0010ﾾ\u0007\fﾾ\u0001\u0010\u0003\uffff\u0012\u0003￮\u0010\r\u0016\u0017￢\u0003\u0001\r\u0010\uffff\u0012\r\u0010ﾾ\u0015\u0007\u0012\u0006ﾾ\u0005\u0003\u0012￡\n\uffff\u0011\u0011", 49 - TextUtils.getOffsetAfter("", 0), false, 5 - TextUtils.indexOf((CharSequence) "", '0', 0), 258 - Color.red(0)).intern(), th3, true);
                return obj;
            }
        }
    }
}
