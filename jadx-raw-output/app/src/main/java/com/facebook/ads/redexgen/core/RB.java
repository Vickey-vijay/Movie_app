package com.facebook.ads.redexgen.core;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: assets/audience_network.dex */
public final class RB {
    public static String[] A00 = {"9O", "28H1kjICyCSP", "QKFmg3qmSW84YfLR5DXewrEtWZ47Hzy", "P", "Em", "YyES7HR0UsWs", "rGxFrAuyTsOha0QpVFZkpdTTHXBTZM0k", "CeAnScf1I32vhT13KQ6XZJy"};

    public static LH A00(Context context, SS ss) {
        return A01(context, ss, null);
    }

    public static LH A01(Context context, SS ss, String str) {
        C1951cu sdkContext = A09(context);
        LL llA84 = ss.A84(sdkContext);
        if (llA84 != null) {
            return str != null ? llA84.ABo(str) : llA84.ABn();
        }
        return new C2313j3();
    }

    public static C1977dL A02(Activity activity) {
        return new C1977dL(activity, (SS) A0A(), A00(activity, A0A()));
    }

    public static C1977dL A03(Context context) {
        return new C1977dL(context, A0A(), new C2313j3());
    }

    public static C1977dL A04(Context context) {
        if (U7.A0w(context)) {
            return new C1977dL(context, A0A(), A00(context, A0A()));
        }
        C1977dL c1977dLA03 = A03(context);
        if (A00[2].length() == 11) {
            throw new RuntimeException();
        }
        String[] strArr = A00;
        strArr[3] = "B";
        strArr[7] = "J1bgC2YpAkuTguvKBul5HQJ";
        return c1977dLA03;
    }

    public static C1977dL A05(Context context, String str) {
        LH lhA01 = A01(context, A0A(), str);
        lhA01.AIj(1000);
        return new C1977dL(context, A0A(), lhA01);
    }

    public static C1977dL A06(Context context, String str) {
        return new C1977dL(context, A0A(), A01(context, A0A(), str));
    }

    public static C1977dL A07(Context context, String str) {
        return new C1977dL(context, A0A(), A01(context, A0A(), str));
    }

    public static C6M A08(Context context) {
        return new C6M(context, A0A(), A0A().A84(A09(context)));
    }

    public static C1951cu A09(Context context) {
        return new C1951cu(context, A0A());
    }

    public static synchronized C1688Wt A0A() {
        return C1688Wt.A02();
    }
}
