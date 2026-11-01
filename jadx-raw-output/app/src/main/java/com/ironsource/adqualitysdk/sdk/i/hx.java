package com.ironsource.adqualitysdk.sdk.i;

import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public final class hx<T> extends cz implements cl, hv<T> {

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private static int f2414 = 0;

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private static int f2415 = 1;

    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    private Field f2416;

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private hv f2417;

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private Map f2418;

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private Object f2419;

    /* JADX INFO: renamed from: ﾒ, reason: contains not printable characters */
    private Collection f2420;

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private static char[] f2413 = {'@', 136, 139, 129, 'v', 128, 135, 129, 'e', 195, 195, 188, 178, 189, 199, 196, '3', 'f', 'l', '`', 'W', 'h', ':', 'q', 'i', 'k', 'i', 'X', 'b', 'l', 'f', '9', 's', 'j', 'g', 'h', 'd', 'f', 'f', 'l', '^', '['};

    /* JADX INFO: renamed from: ﮐ, reason: contains not printable characters */
    private static int[] f2412 = {880806038, -1346773498, 393884870, 1928313090, -1158234337, 2087444272, -1142299011, -1576855235, -2025666139, -1576528800, -891045724, 435791960, 1629575653, -1385996207, -571437608, 532789962, 1203766405, -134582387};

    public hx(Field field, Object obj, hv hvVar) {
        this.f2416 = field;
        this.f2419 = obj;
        this.f2417 = hvVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0027, code lost:
    
        if ((r7.f2420 != null) != false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0029, code lost:
    
        r1 = r1 + 39;
        com.ironsource.adqualitysdk.sdk.i.hx.f2415 = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0030, code lost:
    
        if ((r1 % 2) != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0032, code lost:
    
        r2 = '=';
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0033, code lost:
    
        if (r2 == '=') goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0035, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0038, code lost:
    
        r0 = 48 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0039, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x003c, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        if ((r7.f2420 != null ? '=' : '(') != '=') goto L28;
     */
    /* JADX INFO: renamed from: ﻐ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean m2368() {
        /*
            r7 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.hx.f2415
            int r0 = r0 + 123
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.hx.f2414 = r1
            r2 = 2
            int r0 = r0 % r2
            r3 = 1
            r4 = 61
            r5 = 0
            if (r0 == 0) goto L20
            java.util.Collection r0 = r7.f2420
            r6 = 65
            int r6 = r6 / r5
            if (r0 == 0) goto L19
            r0 = r4
            goto L1b
        L19:
            r0 = 40
        L1b:
            if (r0 == r4) goto L29
            goto L3c
        L1e:
            r0 = move-exception
            throw r0
        L20:
            java.util.Collection r0 = r7.f2420
            if (r0 == 0) goto L26
            r0 = r3
            goto L27
        L26:
            r0 = r5
        L27:
            if (r0 == 0) goto L3c
        L29:
            int r1 = r1 + 39
            int r0 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.hx.f2415 = r0
            int r1 = r1 % r2
            if (r1 != 0) goto L33
            r2 = r4
        L33:
            if (r2 == r4) goto L36
            return r3
        L36:
            r0 = 48
            int r0 = r0 / r5
            return r3
        L3a:
            r0 = move-exception
            throw r0
        L3c:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hx.m2368():boolean");
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private void m2371(T t10) {
        int i10 = f2414 + 71;
        f2415 = i10 % 128;
        int i11 = i10 % 2;
        if (!(m2373())) {
            return;
        }
        int i12 = f2415 + 19;
        f2414 = i12 % 128;
        try {
            if (!(i12 % 2 != 0)) {
                this.f2416.set(this.f2419, t10);
                return;
            }
            this.f2416.set(this.f2419, t10);
            try {
                throw null;
            } catch (Throwable th2) {
                throw th2;
            }
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: renamed from: ﱟ, reason: contains not printable characters */
    private hv m2364() {
        int i10 = f2415;
        int i11 = i10 + 67;
        f2414 = i11 % 128;
        int i12 = i11 % 2;
        hv hvVar = this.f2417;
        int i13 = i10 + 113;
        f2414 = i13 % 128;
        int i14 = i13 % 2;
        return hvVar;
    }

    /* JADX INFO: renamed from: ﱡ, reason: contains not printable characters */
    private Collection m2365() {
        int i10 = f2414 + 87;
        int i11 = i10 % 128;
        f2415 = i11;
        if (!(i10 % 2 != 0)) {
            throw null;
        }
        Collection collection = this.f2420;
        int i12 = i11 + 31;
        f2414 = i12 % 128;
        int i13 = i12 % 2;
        return collection;
    }

    /* JADX INFO: renamed from: ﺙ, reason: contains not printable characters */
    private Object m2366() {
        int i10 = f2415;
        int i11 = i10 + 31;
        f2414 = i11 % 128;
        int i12 = i11 % 2;
        Object obj = this.f2419;
        int i13 = i10 + 73;
        f2414 = i13 % 128;
        int i14 = i13 % 2;
        return obj;
    }

    /* JADX INFO: renamed from: ﻏ, reason: contains not printable characters */
    private Map m2367() {
        Map map;
        int i10 = f2415;
        int i11 = i10 + 79;
        f2414 = i11 % 128;
        if (i11 % 2 == 0) {
            map = this.f2418;
        } else {
            map = this.f2418;
            int i12 = 80 / 0;
        }
        int i13 = i10 + 45;
        f2414 = i13 % 128;
        int i14 = i13 % 2;
        return map;
    }

    /* JADX INFO: renamed from: ｋ, reason: contains not printable characters */
    private boolean m2372() {
        int i10 = f2415 + 105;
        int i11 = i10 % 128;
        f2414 = i11;
        int i12 = i10 % 2;
        if ((this.f2418 != null ? '+' : 'L') == 'L') {
            return false;
        }
        int i13 = i11 + 21;
        f2415 = i13 % 128;
        int i14 = i13 % 2;
        int i15 = i11 + 89;
        f2415 = i15 % 128;
        int i16 = i15 % 2;
        return true;
    }

    /* JADX INFO: renamed from: ﾇ, reason: contains not printable characters */
    private boolean m2373() {
        int i10 = f2414 + 97;
        int i11 = i10 % 128;
        f2415 = i11;
        if (!(i10 % 2 != 0)) {
            throw null;
        }
        if (this.f2416 != null) {
            return true;
        }
        int i12 = i11 + 63;
        f2414 = i12 % 128;
        if (i12 % 2 == 0) {
            return false;
        }
        throw null;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00d6  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ironsource.adqualitysdk.sdk.i.cl
    /* JADX INFO: renamed from: ﻐ */
    public final Object mo812(String str, List<Object> list, ch chVar) {
        byte b10 = -1;
        switch (str.hashCode()) {
            case -2039060844:
                if (str.equals(m2369(new int[]{1283097075, 1758551302, 937353964, 566080106, 1566532774, -28879227, 1835810375, -1292052829}, 14 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))).intern())) {
                    b10 = 5;
                }
                break;
            case -1661939189:
                if (str.equals(m2370(new int[]{31, 11, 0, 6}, "\u0001\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0001\u0001", false).intern())) {
                    int i10 = f2415 + 53;
                    f2414 = i10 % 128;
                    b10 = (i10 % 2 != 0 ? (char) 16 : '.') == '.' ? (byte) 9 : (byte) 72;
                }
                break;
            case -1249356250:
                if (str.equals(m2370(new int[]{16, 6, 0, 0}, "\u0001\u0000\u0001\u0001\u0000\u0001", false).intern())) {
                    int i11 = f2414 + 77;
                    f2415 = i11 % 128;
                    int i12 = i11 % 2;
                    b10 = 7;
                }
                break;
            case 100472786:
                if (str.equals(m2369(new int[]{1692641417, 509377738, -624944775, 1565262419}, 5 - (ViewConfiguration.getWindowTouchSlop() >> 8)).intern())) {
                    int i13 = f2414 + 53;
                    f2415 = i13 % 128;
                    b10 = i13 % 2 != 0 ? (byte) 6 : (byte) 84;
                }
                break;
            case 429960040:
                if (str.equals(m2369(new int[]{-1592022438, -1050516474, 1933567612, -396938526, 1477370371, 1041945739}, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13).intern())) {
                    int i14 = f2415 + 65;
                    f2414 = i14 % 128;
                    if (i14 % 2 == 0) {
                        b10 = 4;
                    } else {
                        b10 = 5;
                    }
                }
                break;
            case 700591008:
                if (str.equals(m2370(new int[]{22, 9, 0, 0}, "\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0000", true).intern())) {
                    int i15 = f2415 + 61;
                    f2414 = i15 % 128;
                    int i16 = i15 % 2;
                    b10 = 8;
                }
                break;
            case 1406685743:
                if (str.equals(m2370(new int[]{8, 8, 87, 0}, "\u0000\u0000\u0001\u0000\u0001\u0001\u0001\u0000", false).intern())) {
                    int i17 = f2414 + 19;
                    f2415 = i17 % 128;
                    int i18 = i17 % 2;
                    b10 = 1;
                }
                break;
            case 1953253188:
                if (str.equals(m2369(new int[]{864832228, -1474572175, 1156522163, 1853925576}, AndroidCharacter.getMirror('0') - '(').intern())) {
                    b10 = 3;
                }
                break;
            case 1967798203:
                if ((str.equals(m2370(new int[]{0, 8, 27, 0}, "\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000", true).intern()) ? 'H' : (char) 5) == 'H') {
                    b10 = 0;
                }
                break;
            case 2058833392:
                if (str.equals(m2369(new int[]{-391186575, 939710401, -1430148382, -1303298305}, 8 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern())) {
                    b10 = 2;
                }
                break;
        }
        switch (b10) {
            case 0:
                return mo2354();
            case 1:
                m2371(cz.m1851(list, 0, Object.class));
                return null;
            case 2:
                return Boolean.valueOf(m2373());
            case 3:
                return mo2353();
            case 4:
                return Boolean.valueOf(m2368());
            case 5:
                return m2365();
            case 6:
                return Boolean.valueOf(m2372());
            case 7:
                return m2367();
            case 8:
                return m2364();
            case 9:
                return m2366();
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001c, code lost:
    
        if ((m2373() ? '@' : 'Y') != '@') goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002d, code lost:
    
        if ((m2373() ? ' ' : 22) != ' ') goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
    
        if (m2368() != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0039, code lost:
    
        if (m2372() == false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003b, code lost:
    
        r0 = (T) r3.f2419;
        r1 = com.ironsource.adqualitysdk.sdk.i.hx.f2415 + 35;
        com.ironsource.adqualitysdk.sdk.i.hx.f2414 = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0047, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0050, code lost:
    
        return (T) r3.f2416.get(r3.f2419);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0051, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:?, code lost:
    
        return null;
     */
    @Override // com.ironsource.adqualitysdk.sdk.i.hv
    /* JADX INFO: renamed from: ﾒ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T mo2354() {
        /*
            r3 = this;
            int r0 = com.ironsource.adqualitysdk.sdk.i.hx.f2414
            int r0 = r0 + 27
            int r1 = r0 % 128
            com.ironsource.adqualitysdk.sdk.i.hx.f2415 = r1
            int r0 = r0 % 2
            if (r0 != 0) goto L21
            boolean r0 = r3.m2373()
            r1 = 53
            int r1 = r1 / 0
            r1 = 64
            if (r0 == 0) goto L1a
            r0 = r1
            goto L1c
        L1a:
            r0 = 89
        L1c:
            if (r0 == r1) goto L48
            goto L2f
        L1f:
            r0 = move-exception
            throw r0
        L21:
            boolean r0 = r3.m2373()
            r1 = 32
            if (r0 == 0) goto L2b
            r0 = r1
            goto L2d
        L2b:
            r0 = 22
        L2d:
            if (r0 == r1) goto L48
        L2f:
            boolean r0 = r3.m2368()
            if (r0 != 0) goto L3b
            boolean r0 = r3.m2372()
            if (r0 == 0) goto L51
        L3b:
            java.lang.Object r0 = r3.f2419
            int r1 = com.ironsource.adqualitysdk.sdk.i.hx.f2415
            int r1 = r1 + 35
            int r2 = r1 % 128
            com.ironsource.adqualitysdk.sdk.i.hx.f2414 = r2
            int r1 = r1 % 2
            return r0
        L48:
            java.lang.reflect.Field r0 = r3.f2416     // Catch: java.lang.Exception -> L51
            java.lang.Object r1 = r3.f2419     // Catch: java.lang.Exception -> L51
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Exception -> L51
            return r0
        L51:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adqualitysdk.sdk.i.hx.mo2354():java.lang.Object");
    }

    public hx(Collection collection, Object obj, hv hvVar) {
        this.f2420 = collection;
        this.f2419 = obj;
        this.f2417 = hvVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.hv
    /* JADX INFO: renamed from: ﻛ */
    public final Field mo2353() {
        int i10 = f2414;
        int i11 = i10 + 101;
        f2415 = i11 % 128;
        if (!(i11 % 2 != 0)) {
            throw null;
        }
        Field field = this.f2416;
        int i12 = i10 + 55;
        f2415 = i12 % 128;
        int i13 = i12 % 2;
        return field;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2370(int[] iArr, String str, boolean z10) throws UnsupportedEncodingException {
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
            System.arraycopy(f2413, i10, cArr, 0, i11);
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

    public hx(Map map, Object obj, hv hvVar) {
        this.f2418 = map;
        this.f2419 = obj;
        this.f2417 = hvVar;
    }

    /* JADX INFO: renamed from: ﻛ, reason: contains not printable characters */
    private static String m2369(int[] iArr, int i10) {
        String str;
        synchronized (e.f1912) {
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length << 1];
            int[] iArr2 = (int[]) f2412.clone();
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
}
