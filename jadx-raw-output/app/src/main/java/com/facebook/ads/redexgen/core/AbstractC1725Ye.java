package com.facebook.ads.redexgen.core;

import android.view.View;
import com.facebook.ads.NativeAdLayout;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Ye, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network.dex */
public abstract class AbstractC1725Ye {
    public static String[] A00 = {"B", "b", "N7Y4O4Xp0bXRpwQYmrnUbbD5XPNn0nfl", "PsTgqcCc8jcMoxm2RXWy1mA6rhf59", "zMLnehec4ICfDGOtTSDp3symXOGZpaRx", "AnvCnC9uV", "JoTWE5M61fQkMjrwCjPz5KG5vu8cqeKb", "O6aKPphMSjoWO4xDWlhiQ7T2kp0fs"};
    public static final int A01 = (int) (AbstractC1680Wl.A02 * 200.0f);
    public static final int A03 = (int) (AbstractC1680Wl.A02 * 200.0f);
    public static final int A02 = (int) (AbstractC1680Wl.A02 * 50.0f);

    public static EnumC1420Md A00(NativeAdLayout nativeAdLayout) {
        if (nativeAdLayout == null) {
            return EnumC1420Md.A04;
        }
        if (A03(nativeAdLayout)) {
            return EnumC1420Md.A05;
        }
        return EnumC1420Md.A03;
    }

    public static AbstractC1724Yd A01(C1977dL c1977dL, US us, String str, View view) {
        if (view == null) {
            return null;
        }
        int w10 = view.getWidth();
        int height = view.getHeight();
        if (w10 >= A01 && height >= A01) {
            return new LS(c1977dL, us, str);
        }
        if (w10 >= A03) {
            int i10 = A02;
            String[] strArr = A00;
            if (strArr[6].charAt(28) == strArr[4].charAt(28)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[7] = "MXaU9iKOIfaGo19ccmM4SYJQh1BEv";
            strArr2[3] = "urarsFS1owFx4szCeqq2cq67A77KP";
            if (height >= i10) {
                return new LU(c1977dL, us, str);
            }
        }
        return null;
    }

    public static LV A02(C1977dL c1977dL, US us, String str, N9 n10, InterfaceC1709Xo interfaceC1709Xo, InterfaceC1708Xn interfaceC1708Xn) {
        return new LV(c1977dL, us, str, n10, interfaceC1709Xo, interfaceC1708Xn);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c  */
    /* JADX WARN: Code duplicated, block: B:13:0x003a  */
    /* JADX WARN: Code duplicated, block: B:6:0x0010  */
    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    public static boolean A03(NativeAdLayout nativeAdLayout) {
        int i10;
        int h10;
        int w10;
        int w11;
        int width = nativeAdLayout.getWidth();
        int height = nativeAdLayout.getHeight();
        int w12 = A01;
        if (width < w12) {
            i10 = A03;
            String[] strArr = A00;
            String str = strArr[1];
            String str2 = strArr[0];
            h10 = str.length();
            w10 = str2.length();
            if (h10 != w10) {
                throw new RuntimeException();
            }
            String[] strArr2 = A00;
            strArr2[1] = "e";
            strArr2[0] = "I";
            if (width >= i10) {
                w11 = A02;
                if (height < w11) {
                }
            }
            return true;
        }
        int w13 = A01;
        if (height < w13) {
            i10 = A03;
            String[] strArr3 = A00;
            String str3 = strArr3[1];
            String str4 = strArr3[0];
            h10 = str3.length();
            w10 = str4.length();
            if (h10 != w10) {
                throw new RuntimeException();
            }
            String[] strArr4 = A00;
            strArr4[1] = "e";
            strArr4[0] = "I";
            if (width >= i10) {
                w11 = A02;
                if (height < w11) {
                }
            }
            return true;
        }
        return false;
    }
}
