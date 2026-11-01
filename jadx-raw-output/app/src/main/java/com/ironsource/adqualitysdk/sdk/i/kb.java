package com.ironsource.adqualitysdk.sdk.i;

import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes8.dex */
public class kb {

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static int f2952 = 1;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static long f2953;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private static int f2954;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Map<a, Method> f2955;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static char[] f2956;

    public static class a {

        /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
        private static int f2957 = 1;

        /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
        private static int f2958 = 0;

        /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
        private static long f2959 = 5943164199102125346L;

        /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
        private Class f2960;

        /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
        private String f2961;

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private List<Class> f2962;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null) {
                int i10 = f2957 + 63;
                f2958 = i10 % 128;
                int i11 = i10 % 2;
                if (a.class == obj.getClass()) {
                    a aVar = (a) obj;
                    if (!this.f2960.equals(aVar.f2960)) {
                        int i12 = f2957 + 7;
                        f2958 = i12 % 128;
                        return (i12 % 2 != 0 ? 'F' : 'C') == 'F';
                    }
                    if (this.f2961.equals(aVar.f2961)) {
                        return this.f2962.equals(aVar.f2962);
                    }
                    int i13 = f2958 + 89;
                    f2957 = i13 % 128;
                    int i14 = i13 % 2;
                    return false;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
        private static String m2858(String str, int i10) {
            String str2;
            Object charArray = str;
            if (str != null) {
                charArray = str.toCharArray();
            }
            char[] cArr = (char[]) charArray;
            synchronized (h.f2284) {
                char[] cArrM2243 = h.m2243(f2959, cArr, i10);
                h.f2285 = 4;
                while (true) {
                    int i11 = h.f2285;
                    if (i11 < cArrM2243.length) {
                        h.f2283 = i11 - 4;
                        int i12 = h.f2285;
                        cArrM2243[i12] = (char) (((long) (cArrM2243[i12] ^ cArrM2243[i12 % 4])) ^ (((long) h.f2283) * f2959));
                        h.f2285++;
                    } else {
                        str2 = new String(cArrM2243, 4, cArrM2243.length - 4);
                    }
                }
            }
            return str2;
        }

        public final int hashCode() {
            int i10 = f2957 + 39;
            f2958 = i10 % 128;
            int i11 = i10 % 2;
            int iHashCode = (((this.f2960.hashCode() * 31) + this.f2961.hashCode()) * 31) + this.f2962.hashCode();
            int i12 = f2958 + 35;
            f2957 = i12 % 128;
            if ((i12 % 2 == 0 ? 'S' : '[') != 'S') {
                return iHashCode;
            }
            throw null;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder(m2858("\udd4c\udd01馏\ue908姛賈쌸曕覫\uf041鞀쩐琺⟔㨲뇄₠譜캻敋輗", ViewConfiguration.getTouchSlop() >> 8).intern());
            sb2.append(m2858("텒턿四捵寨䎶䥓擤薿㼒᷍졅砮\ue888끒돭\u2cf7", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) - 1).intern());
            sb2.append(this.f2960);
            sb2.append(m2858("笀第럺᭜膧ꋸㅵ뺌\u2fed\ude24旸ሦ퉴আ졩榼蛽ꕽ㲧", Process.getGidForName("") + 1).intern());
            sb2.append(this.f2961);
            sb2.append('\'');
            sb2.append(m2858("ᦴᦘ朩昿厴爫䰖沓䵎\u0ee4ᢰ쀶냅\ud968딘뮧\ue45f疮", ViewConfiguration.getWindowTouchSlop() >> 8).intern());
            sb2.append(this.f2962);
            sb2.append('}');
            String string = sb2.toString();
            int i10 = f2958 + 69;
            f2957 = i10 % 128;
            int i11 = i10 % 2;
            return string;
        }

        public a(Object obj, String str, List<Class> list) {
            if (obj instanceof Class) {
                this.f2960 = (Class) obj;
            } else {
                this.f2960 = obj.getClass();
            }
            this.f2961 = str;
            this.f2962 = list;
        }
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Method m2840(Object obj, String str, List<Object> list) {
        int i10 = f2952 + 59;
        f2954 = i10 % 128;
        boolean z10 = i10 % 2 == 0;
        Class<?> cls = obj.getClass();
        return !z10 ? m2839(cls, str, list, true) : m2839(cls, str, list, false);
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Method m2843(Object obj, String str, List<Object> list) {
        Method methodM2840;
        a aVar = new a(obj, str, m2844(list));
        Method method = f2955.get(aVar);
        if ((method != null ? 'L' : '%') != '%') {
            if (m2842(method.getParameterTypes(), list)) {
                int i10 = f2952 + 7;
                f2954 = i10 % 128;
                int i11 = i10 % 2;
                return method;
            }
            String strIntern = m2851(ViewConfiguration.getLongPressTimeout() >> 16, (char) (View.MeasureSpec.getMode(0) + 48731), TextUtils.getTrimmedLength("") + 15).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2851((Process.myTid() >> 22) + 31, (char) (ExpandableListView.getPackedPositionType(0L) + 58399), MotionEvent.axisFromString("") + 29).intern());
            sb2.append(aVar);
            co.m1623(strIntern, sb2.toString(), null);
            int i12 = f2952 + 81;
            f2954 = i12 % 128;
            int i13 = i12 % 2;
        }
        if ((obj instanceof Class ? (char) 7 : (char) 15) != 15) {
            int i14 = f2954 + 41;
            f2952 = i14 % 128;
            int i15 = i14 % 2;
            methodM2840 = m2839((Class) obj, str, list, true);
            if (methodM2840 == null) {
                int i16 = f2952 + 55;
                f2954 = i16 % 128;
                int i17 = i16 % 2;
                methodM2840 = m2840(Class.class, str, list);
            }
        } else {
            methodM2840 = m2840(obj, str, list);
        }
        if (methodM2840 != null) {
            int i18 = f2952 + 9;
            f2954 = i18 % 128;
            if (i18 % 2 != 0) {
                f2955.put(aVar, methodM2840);
                int i19 = 86 / 0;
            } else {
                f2955.put(aVar, methodM2840);
            }
        }
        return methodM2840;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Class m2848(String str, boolean z10) {
        try {
            Class<?> cls = Class.forName(str);
            int i10 = f2954 + 81;
            f2952 = i10 % 128;
            int i11 = i10 % 2;
            return cls;
        } catch (Throwable th2) {
            if (z10) {
                String strIntern = m2851(TextUtils.indexOf((CharSequence) "", '0') + 1, (char) (48731 - (ViewConfiguration.getTouchSlop() >> 8)), 15 - (ViewConfiguration.getTapTimeout() >> 16)).intern();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(m2851(16 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (char) (33366 - Gravity.getAbsoluteGravity(0, 0)), 6 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern());
                sb2.append(str);
                sb2.append(m2851(21 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1)) + 9).intern());
                co.m1623(strIntern, sb2.toString(), th2);
            }
            int i12 = f2952 + 69;
            f2954 = i12 % 128;
            int i13 = i12 % 2;
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static void m2852() {
        f2956 = new char[]{48649, 6069, 60715, 17046, 6162, 61839, 18285, 7423, 62060, 19414, 8544, 63190, 19638, 8760, 64434, 33301, 11185, 53537, 32388, 9225, 52673, ' ', 43493, 21369, 64725, 42508, 20433, 63789, 41656, 19510, 62855, 58458, 19942, 46971, 6353, 16961, 43912, 7482, 18103, 43059, 4488, 31512, 44168, 5884, 30768, 41446, 2907, 31948, 42572, 4028, 28970, 56035, 3093, 30088, 57110, 383, 27363, 56421, 1430, 26230, 53212, 13582, 39614, 60633, 17749, 49029, 4154, 19110, 41761, 5587, 20055, 41094, 6523, 29695, 42098, 7700, 28821, 43332, 957, 29729, 44727, 1816, 'c', 43492, 21371, 64655, 42565, 20421, 63789, 41635, 19499, 62860, 40731, 18571, 62183, 40042, 17844, 61252, 39124, 16970, 60339, 38192, 16048, 59406, 37254, 15108};
        f2953 = -4185486480735295093L;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m2853(Method method, List<Object> list) {
        int i10 = f2952 + 85;
        f2954 = i10 % 128;
        int i11 = i10 % 2;
        boolean zM2842 = m2842(method.getParameterTypes(), list);
        int i12 = f2954 + 109;
        f2952 = i12 % 128;
        if ((i12 % 2 == 0 ? (char) 3 : '>') != 3) {
            return zM2842;
        }
        int i13 = 40 / 0;
        return zM2842;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    public static Object m2856(Class cls, List<Object> list, Class... clsArr) throws Exception {
        int i10 = f2954 + 83;
        f2952 = i10 % 128;
        int i11 = i10 % 2;
        Object objNewInstance = cls.getConstructor(clsArr).newInstance(list.toArray());
        int i12 = f2954 + 19;
        f2952 = i12 % 128;
        int i13 = i12 % 2;
        return objNewInstance;
    }

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static Method m2839(Class cls, String str, List<Object> list, boolean z10) {
        int i10 = f2952 + 71;
        f2954 = i10 % 128;
        int i11 = i10 % 2;
        Method[] methods = cls.getMethods();
        int length = methods.length;
        int i12 = f2952 + 9;
        f2954 = i12 % 128;
        int i13 = i12 % 2;
        int i14 = 0;
        while (true) {
            if (i14 >= length) {
                return null;
            }
            Method method = methods[i14];
            if ((method.getName().equals(str) ? ',' : (char) 24) == ',') {
                int i15 = f2954 + 95;
                f2952 = i15 % 128;
                int i16 = i15 % 2;
                if (method.getParameterTypes().length == list.size() && Modifier.isStatic(method.getModifiers()) == z10) {
                    int i17 = f2954 + 123;
                    f2952 = i17 % 128;
                    if (i17 % 2 == 0) {
                        int i18 = 35 / 0;
                        if ((m2853(method, list) ? (char) 31 : (char) 24) != 24) {
                            int i19 = f2952 + 49;
                            f2954 = i19 % 128;
                            int i20 = i19 % 2;
                            return method;
                        }
                    } else if (m2853(method, list)) {
                        int i110 = f2952 + 49;
                        f2954 = i110 % 128;
                        int i21 = i110 % 2;
                        return method;
                    }
                }
            }
            i14++;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    public static Method[] m2855(Method[] methodArr, Method[] methodArr2) {
        int i10 = f2952 + 109;
        f2954 = i10 % 128;
        int i11 = i10 % 2;
        int length = methodArr.length;
        int length2 = methodArr2.length;
        Method[] methodArr3 = new Method[length + length2];
        System.arraycopy(methodArr, 0, methodArr3, 0, length);
        System.arraycopy(methodArr2, 0, methodArr3, length, length2);
        int i12 = f2954 + 65;
        f2952 = i12 % 128;
        if ((i12 % 2 == 0 ? '\\' : (char) 3) == 3) {
            return methodArr3;
        }
        throw null;
    }

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private static Constructor m2857(Class cls, List<Object> list) {
        Constructor<?>[] constructors = cls.getConstructors();
        int length = constructors.length;
        int i10 = 0;
        while (true) {
            if (!(i10 < length)) {
                int i11 = f2952 + 21;
                f2954 = i11 % 128;
                int i12 = i11 % 2;
                return null;
            }
            int i13 = f2952 + 67;
            f2954 = i13 % 128;
            int i14 = i13 % 2;
            Constructor<?> constructor = constructors[i10];
            if (constructor.getParameterTypes().length == list.size()) {
                int i15 = f2954 + 3;
                f2952 = i15 % 128;
                if (!(i15 % 2 != 0)) {
                    m2846(constructor, list);
                    throw null;
                }
                if ((m2846(constructor, list) ? '(' : '\'') == '(') {
                    return constructor;
                }
            }
            i10++;
        }
    }

    static {
        boolean z10;
        m2852();
        f2955 = new ConcurrentHashMap();
        int i10 = f2954 + 123;
        f2952 = i10 % 128;
        if (i10 % 2 == 0) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10) {
        } else {
            throw null;
        }
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Object m2849(Class cls, List<Object> list) throws Exception {
        int i10 = f2952 + 23;
        f2954 = i10 % 128;
        char c10 = i10 % 2 != 0 ? (char) 27 : 'K';
        Constructor constructorM2857 = m2857(cls, list);
        Object[] array = list.toArray();
        if (c10 == 27) {
            constructorM2857.newInstance(array);
            throw null;
        }
        Object objNewInstance = constructorM2857.newInstance(array);
        int i11 = f2952 + 23;
        f2954 = i11 % 128;
        int i12 = i11 % 2;
        return objNewInstance;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v6, types: [java.lang.reflect.Method] */
    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    public static Method m2850(Object obj, String str, List<Class> list) {
        int i10 = f2952 + 31;
        f2954 = i10 % 128;
        try {
            if ((i10 % 2 != 0 ? '`' : 'P') == 'P') {
                Class<?>[] clsArrM2854 = m2854(list);
                if (obj instanceof Class) {
                    try {
                        obj = ((Class) obj).getMethod(str, clsArrM2854);
                        int i11 = f2952 + 111;
                        f2954 = i11 % 128;
                        if (i11 % 2 == 0) {
                            return obj;
                        }
                        throw null;
                    } catch (NoSuchMethodException unused) {
                        return Class.class.getMethod(str, clsArrM2854);
                    }
                }
                Method method = obj.getClass().getMethod(str, clsArrM2854);
                int i12 = f2952 + 1;
                f2954 = i12 % 128;
                int i13 = i12 % 2;
                return method;
            }
            m2854(list);
            boolean z10 = obj instanceof Class;
            throw null;
        } catch (NoSuchMethodException e10) {
            String strIntern = m2851(TextUtils.lastIndexOf("", '0') + 1, (char) (ExpandableListView.getPackedPositionChild(0L) + 48732), 15 - KeyEvent.keyCodeFromString("")).intern();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m2851((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 58, (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 26168), TextUtils.indexOf("", "", 0) + 4).intern());
            sb2.append(str);
            sb2.append(m2851((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 62, (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 60671), TextUtils.getTrimmedLength("") + 19).intern());
            sb2.append(obj);
            co.m1623(strIntern, sb2.toString(), e10);
            return null;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static Class[] m2854(List<Class> list) {
        Class[] clsArr;
        int i10;
        int i11 = f2952 + 51;
        f2954 = i11 % 128;
        if (!(i11 % 2 != 0)) {
            clsArr = new Class[list.size()];
            i10 = 0;
        } else {
            clsArr = new Class[list.size()];
            i10 = 1;
        }
        while (true) {
            if (i10 >= list.size()) {
                return clsArr;
            }
            int i12 = f2954 + 49;
            f2952 = i12 % 128;
            int i13 = i12 % 2;
            clsArr[i10] = list.get(i10);
            i10++;
            int i14 = f2952 + 91;
            f2954 = i14 % 128;
            int i15 = i14 % 2;
        }
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private static String m2851(int i10, char c10, int i11) {
        String str;
        synchronized (d.f1653) {
            char[] cArr = new char[i11];
            d.f1652 = 0;
            while (true) {
                int i12 = d.f1652;
                if (i12 < i11) {
                    cArr[i12] = (char) ((((long) f2956[i10 + i12]) ^ (((long) i12) * f2953)) ^ ((long) c10));
                    d.f1652 = i12 + 1;
                } else {
                    str = new String(cArr);
                }
            }
        }
        return str;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x0038  */
    /* JADX WARN: Code duplicated, block: B:24:0x0042  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:34:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x004a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x004a A[SYNTHETIC] */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m2842(Class[] clsArr, List<Object> list) {
        char c10;
        int i10 = f2952 + 61;
        f2954 = i10 % 128;
        for (int i11 = !(i10 % 2 == 0) ? 1 : 0; i11 < clsArr.length; i11++) {
            Object obj = list.get(i11);
            if ((obj == null ? '5' : '2') == '2') {
                if (obj == null) {
                    if (m2841(clsArr[i11], obj)) {
                        c10 = 27;
                    } else {
                        c10 = 16;
                    }
                    if (c10 != 16) {
                    }
                }
            } else if (!(!Object.class.isAssignableFrom(clsArr[i11]))) {
                if (obj == null) {
                    if (m2841(clsArr[i11], obj)) {
                        c10 = 16;
                    } else {
                        c10 = 27;
                    }
                    if (c10 != 16) {
                    }
                }
            }
            return false;
        }
        int i12 = f2954 + 37;
        f2952 = i12 % 128;
        int i13 = i12 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static List<Class> m2844(List<Object> list) {
        Object next;
        ArrayList arrayList = new ArrayList();
        Iterator<Object> it = list.iterator();
        while (true) {
            if ((it.hasNext() ? '\r' : (char) 1) != '\r') {
                return arrayList;
            }
            int i10 = f2952 + 33;
            f2954 = i10 % 128;
            if (i10 % 2 == 0) {
                next = it.next();
                if (next != null) {
                    arrayList.add(next.getClass());
                    int i11 = f2954 + 93;
                    f2952 = i11 % 128;
                    int i12 = i11 % 2;
                } else {
                    arrayList.add(Object.class);
                }
            } else {
                next = it.next();
                int i13 = 68 / 0;
                if (next != null) {
                    arrayList.add(next.getClass());
                    int i14 = f2954 + 93;
                    f2952 = i14 % 128;
                    int i15 = i14 % 2;
                } else {
                    arrayList.add(Object.class);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0124  */
    /* JADX WARN: Code duplicated, block: B:106:0x0130  */
    /* JADX WARN: Code duplicated, block: B:108:0x0136  */
    /* JADX WARN: Code duplicated, block: B:110:0x013c  */
    /* JADX WARN: Code duplicated, block: B:112:0x0142  */
    /* JADX WARN: Code duplicated, block: B:114:0x0152  */
    /* JADX WARN: Code duplicated, block: B:116:0x015a  */
    /* JADX WARN: Code duplicated, block: B:118:0x016c  */
    /* JADX WARN: Code duplicated, block: B:120:0x0174  */
    /* JADX WARN: Code duplicated, block: B:122:0x017a  */
    /* JADX WARN: Code duplicated, block: B:132:0x019e  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:135:0x01af  */
    /* JADX WARN: Code duplicated, block: B:137:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:141:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:142:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:144:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:146:0x01da  */
    /* JADX WARN: Code duplicated, block: B:151:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:153:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:156:0x0202  */
    /* JADX WARN: Code duplicated, block: B:158:0x0204  */
    /* JADX WARN: Code duplicated, block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:0x009b  */
    /* JADX WARN: Code duplicated, block: B:52:0x009d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00be  */
    /* JADX WARN: Code duplicated, block: B:66:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:74:0x00df  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:92:0x010c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0118  */
    /* JADX WARN: Code duplicated, block: B:95:0x011a  */
    /* JADX WARN: Code duplicated, block: B:97:0x011d  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:122:0x017a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private static boolean m2841(java.lang.Class r11, java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.kb.m2841(java.lang.Class, java.lang.Object):boolean");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static boolean m2846(Constructor constructor, List<Object> list) {
        int i10 = f2954 + 125;
        f2952 = i10 % 128;
        char c10 = i10 % 2 == 0 ? 'L' : 'N';
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        if (c10 != 'L') {
            return m2842(parameterTypes, list);
        }
        boolean zM2842 = m2842(parameterTypes, list);
        int i11 = 30 / 0;
        return zM2842;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static Field[] m2847(Field[] fieldArr, Field[] fieldArr2) {
        int i10 = f2952 + 119;
        f2954 = i10 % 128;
        int i11 = i10 % 2;
        int length = fieldArr.length;
        int length2 = fieldArr2.length;
        Field[] fieldArr3 = new Field[length + length2];
        System.arraycopy(fieldArr, 0, fieldArr3, 0, length);
        System.arraycopy(fieldArr2, 0, fieldArr3, length, length2);
        int i12 = f2954 + 71;
        f2952 = i12 % 128;
        if (!(i12 % 2 == 0)) {
            return fieldArr3;
        }
        int i13 = 28 / 0;
        return fieldArr3;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bf  */
    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    public static boolean m2845(Class cls, List<String> list) {
        if ((cls != null ? '9' : '!') != '!') {
            int i10 = f2952 + 43;
            f2954 = i10 % 128;
            int i11 = i10 % 2;
            if ((list == null) || list.isEmpty()) {
                return true;
            }
            for (String str : list) {
                if (((str.equals("") ? 'O' : 'b') != 'b' && (cls.getPackage() == null || cls.getPackage().getName().equals(""))) || (!str.equals("") && cls.getName().startsWith(str))) {
                    return true;
                }
            }
            if ((!kb.class.getName().startsWith(m2851(82 - KeyEvent.normalizeMetaState(0), (char) View.resolveSizeAndState(0, 0, 0), 25 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern()) ? 'K' : 'V') != 'V') {
                if ((kb.class.getPackage() == null ? 'S' : (char) 28) != 28) {
                    int i12 = f2952 + 3;
                    f2954 = i12 % 128;
                    int i13 = i12 % 2;
                    if (cls.getPackage() != null) {
                        if (kb.class.getPackage() != null) {
                            int i14 = f2952 + 99;
                            f2954 = i14 % 128;
                            int i15 = i14 % 2;
                            if (kb.class.getPackage().equals(cls.getPackage())) {
                            }
                        }
                        return false;
                    }
                } else {
                    if (kb.class.getPackage() != null) {
                        int i16 = f2952 + 99;
                        f2954 = i16 % 128;
                        int i17 = i16 % 2;
                        if (kb.class.getPackage().equals(cls.getPackage())) {
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
